package com.myshop.servlets;

import com.myshop.constants.Constants;
import it.gestpay.wscryptdecrypt.EncryptRequest;
import it.gestpay.wscryptdecrypt.EncryptResponse;
import it.gestpay.wscryptdecrypt.WsCryptDecryptService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static com.myshop.constants.Constants.SHOP_LOGIN;
import static com.myshop.constants.Constants.UIC_CODE_EURO;

/**
 * Created by michelenasti on 14/03/17.
 */
public class EncryptServlet extends HttpServlet {

  //this is the soap service
  private WsCryptDecryptService wsCryptDecryptService = new WsCryptDecryptService();

  public static final Logger logger = Logger.getLogger(EncryptServlet.class.getName());

  @Override
  public void init() throws ServletException {
    super.init();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    logger.info("collecting data for encrypt request... ");

    String item = req.getParameterMap().get("item")[0];
    String amount = req.getParameterMap().get("price")[0];

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
    String shopTransactionId = Constants.TRANSACTIONS_PREFIX + df.format(new Date());

    EncryptRequest encryptRequest = new EncryptRequest();
    encryptRequest.setAmount(amount);
    encryptRequest.setUicCode(UIC_CODE_EURO); //EURO
    encryptRequest.setShopTransactionId(shopTransactionId);
    encryptRequest.setShopLogin(SHOP_LOGIN);
    EncryptResponse encryptResponse = wsCryptDecryptService.encrypt(encryptRequest);

    req.setAttribute("encryptResponse", encryptResponse);

    if (!"0".equals(encryptResponse.getErrorCode())) {
      req.getRequestDispatcher("/error.jsp").forward(req, resp);
      logger.info("request routed to error.jsp (something went wrong)");
    } else {
      req.getRequestDispatcher("/pay.jsp").forward(req, resp);
      logger.info("request routed to pay.jsp");
    }


  }
}
