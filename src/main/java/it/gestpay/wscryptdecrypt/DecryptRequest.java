package it.gestpay.wscryptdecrypt;

/**
 * Created by michelenasti on 16/03/17.
 */
public class DecryptRequest {

  private String shopLogin;
  private String cryptedString;

  public String getCryptedString() {
    return cryptedString;
  }

  public void setCryptedString(String cryptedString) {
    this.cryptedString = cryptedString;
  }

  public String getShopLogin() {

    return shopLogin;
  }

  public void setShopLogin(String shopLogin) {
    this.shopLogin = shopLogin;
  }
}
