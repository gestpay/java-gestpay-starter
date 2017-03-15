package it.gestpay.servlets;

import it.gestpay.constants.Constants;
import it.gestpay.wscryptdecrypt.model.WSCryptDecrypt;
import it.gestpay.wscryptdecrypt.model.WSCryptDecryptSoap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by michelenasti on 14/03/17.
 */
public class EncryptServlet extends HttpServlet {

  //this is the soap service
  private WSCryptDecrypt wsCryptDecrypt = new WSCryptDecrypt();

  @Override
  public void init() throws ServletException {
    super.init();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String item = req.getParameterMap().get("item")[0];
    String amount = req.getParameterMap().get("price")[0];

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
    String shopTransactionId = Constants.TRANSACTIONS_PREFIX + df.format(new Date());

    WSCryptDecryptSoap wsCryptDecryptSoap = wsCryptDecrypt.getWSCryptDecryptSoap();
    //wsCryptDecryptSoap.encrypt(Constants.SHOP_LOGIN, Constants.UIC_CODE, amount, shopTransactionId, null, null, null, );
  }
}
