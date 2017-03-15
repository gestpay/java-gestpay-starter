package it.gestpay.constants;

/**
 * Created by michelenasti on 14/03/17.
 */
public interface Constants {

  /**
   * set to "false" to use against production environment.
   */
  public static final boolean isTestEnvironment = true;

  /**
   * The shop login, used to authenticate your shop on Gestpay
   */
  public static final String SHOP_LOGIN = "GESPAY65987";

  /**
   * Code for EURO
   */
  public static final String UIC_CODE = "242";

  /**
   * This prefix will be used for shopTransactionId.
   */
  public static final String TRANSACTIONS_PREFIX = "MY_JAVA_SHOP_";

  /**
   * Gestpay test environment endpoint
   */
  public static final String TEST_ENDPOINT = "https://testecomm.sella.it/gestpay/GestPayWS/WsCryptDecrypt.asmx?wsdl";

  /**
   * Gestpay production environment endpoint
   */
  public static final String PROD_ENDPOINT = "https://ecommS2S.sella.it/gestpay/GestPayWS/WsCryptDecrypt.asmx?wsdl";
}
