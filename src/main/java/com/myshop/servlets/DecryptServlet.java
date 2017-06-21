package com.myshop.servlets;

import it.gestpay.wscryptdecrypt.DecryptRequest;
import it.gestpay.wscryptdecrypt.DecryptResponse;
import it.gestpay.wscryptdecrypt.WsCryptDecryptService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by michelenasti on 14/03/17.
 */
public class DecryptServlet extends HttpServlet {

  public final static Logger logger = Logger.getLogger(DecryptServlet.class.getName());

  //this is the soap service
  private WsCryptDecryptService wsCryptDecryptService = new WsCryptDecryptService();

  @Override
  public void init() throws ServletException {
    super.init();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    logger.info("collecting encrypted data from Gestpay, going to decrypt...");

    DecryptRequest decryptObject = new DecryptRequest();
    String shopLogin = req.getParameter("a");
    String cryptedString = req.getParameter("b");
    decryptObject.setShopLogin(shopLogin);
    decryptObject.setCryptedString(cryptedString);

    DecryptResponse decryptResponse = wsCryptDecryptService.decrypt(decryptObject);

    req.setAttribute("decryptResponse", decryptResponse);

    req.getRequestDispatcher("/response.jsp").forward(req, resp);
    logger.info("redirecting to response.jsp");
  }
}
