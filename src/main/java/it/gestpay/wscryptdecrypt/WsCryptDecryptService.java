package it.gestpay.wscryptdecrypt;

import it.gestpay.wscryptdecrypt.model.WSCryptDecrypt;
import it.gestpay.wscryptdecrypt.model.WSCryptDecryptSoap;
import org.w3c.dom.Element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * Created by michelenasti on 14/03/17.
 */
public class WsCryptDecryptService {

  private static final Logger logger = Logger.getLogger(WsCryptDecryptService.class.getName());

  //this is the soap service
  private WSCryptDecryptSoap wsCryptDecryptSoap;

  /**
   * Creates the service pointing to TEST Environment.
   * @throws MalformedURLException
   */
  public WsCryptDecryptService() {
    WSCryptDecrypt wsCryptDecrypt = new WSCryptDecrypt();
    wsCryptDecryptSoap = wsCryptDecrypt.getWSCryptDecryptSoap();
    logger.info("Created SOAP service, pointing to TEST Endpoint");
  }

  /**
   * Creates the Service pointing to the enivornment.
   * @param environmentUrl Constants.TEST_ENVIRONMENT or Constants.PROD_ENVIRONMENT
   * @throws MalformedURLException
   */
  public WsCryptDecryptService(String environmentUrl) throws MalformedURLException {
    WSCryptDecrypt wsCryptDecrypt = new WSCryptDecrypt(new URL(environmentUrl));
    wsCryptDecryptSoap = wsCryptDecrypt.getWSCryptDecryptSoap();
    logger.info("Created SOAP service, pointing to " + environmentUrl);
  }


  public EncryptResponse encrypt(EncryptRequest encryptRequest) {
    logger.info("Going to start the encrypt process...");
    it.gestpay.wscryptdecrypt.model.EncryptResponse.EncryptResult result = wsCryptDecryptSoap.encrypt(
        encryptRequest.getShopLogin(),
        encryptRequest.getUicCode(),
        encryptRequest.getAmount(),
        encryptRequest.getShopTransactionId(),
        null,
        null,
        null,
        encryptRequest.getBuyerName(),
        encryptRequest.getBuyerEmail(),
        encryptRequest.getLanguageId(),
        null,
        encryptRequest.getCustomInfo(),
        encryptRequest.getRequestToken(),
        encryptRequest.getPpSellerProtection(),
        encryptRequest.getShippingDetails(),
        encryptRequest.getPaymentTypes(),
        encryptRequest.getPaymentTypeDetail(),
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        encryptRequest.getConselMerchantPro(),
        encryptRequest.getConselCustomerInfo(),
        encryptRequest.getPayPalBillingAgreementDescription(),
        encryptRequest.getOrderDetails());

    logger.info("Encrypt success, going to parse the response... ");

    Element element = (Element) result.getContent().get(0);

    EncryptResponse encryptResponse = new EncryptResponse();

    if (element.getElementsByTagName("CryptDecryptString").item(0) != null) {
      encryptResponse.setCryptDecryptString(element.getElementsByTagName("CryptDecryptString").item(0).getTextContent());
    }

    if (element.getElementsByTagName("ErrorCode").item(0) != null) {
      encryptResponse.setErrorCode( element.getElementsByTagName("ErrorCode").item(0).getTextContent());
    }

    if (element.getElementsByTagName("ErrorDescription").item(0) != null) {
      encryptResponse.setErrorDescription(element.getElementsByTagName("ErrorDescription").item(0).getTextContent());
    }

    if (element.getElementsByTagName("TransactionResult").item(0) != null) {
      encryptResponse.setTransactionResult(element.getElementsByTagName("TransactionResult").item(0).getTextContent());
    }

    if (element.getElementsByTagName("TransactionType").item(0) != null) {
      encryptResponse.setTransactionType(element.getElementsByTagName("TransactionType").item(0).getTextContent());
    }

    logger.info("returning the encryptResponse: " + encryptResponse.toString());
    return encryptResponse;

  }

  public DecryptResponse decrypt(DecryptRequest decryptRequest) {

    logger.info("Going to start the decrypt process...");

    it.gestpay.wscryptdecrypt.model.DecryptResponse.DecryptResult result = wsCryptDecryptSoap.decrypt(decryptRequest.getShopLogin(), decryptRequest.getCryptedString());

    Element element = (Element) result.getContent().get(0);

    DecryptResponse decryptResponse = new DecryptResponse();

    if (element.getElementsByTagName("TransactionType").item(0) != null) {
      decryptResponse.setTransactionType(element.getElementsByTagName("TransactionType").item(0).getTextContent());
    }
    if (element.getElementsByTagName("TransactionResult").item(0) != null) {
      decryptResponse.setTransactionResult(element.getElementsByTagName("TransactionResult").item(0).getTextContent());
    }
    if (element.getElementsByTagName("ShopTransactionID").item(0) != null) {
      decryptResponse.setShopTransactionID(element.getElementsByTagName("ShopTransactionID").item(0).getTextContent());
    }
    if (element.getElementsByTagName("BankTransactionID").item(0) != null) {
      decryptResponse.setBankTransactionID(element.getElementsByTagName("BankTransactionID").item(0).getTextContent());
    }
    if (element.getElementsByTagName("AuthorizationCode").item(0) != null) {
      decryptResponse.setAuthorizationCode(element.getElementsByTagName("AuthorizationCode").item(0).getTextContent());
    }
    if (element.getElementsByTagName("Currency").item(0) != null) {
      decryptResponse.setCurrency(element.getElementsByTagName("Currency").item(0).getTextContent());
    }
    if (element.getElementsByTagName("Amount").item(0) != null) {
      decryptResponse.setAmount(element.getElementsByTagName("Amount").item(0).getTextContent());
    }
    if (element.getElementsByTagName("ErrorCode").item(0) != null) {
      decryptResponse.setErrorCode(element.getElementsByTagName("ErrorCode").item(0).getTextContent());
    }
    if (element.getElementsByTagName("ErrorDescription").item(0) != null) {
      decryptResponse.setErrorDescription(element.getElementsByTagName("ErrorDescription").item(0).getTextContent());
    }
    //TODO Add other data as you might need.

    logger.info("Decrypt process completed: " + decryptResponse.toString());

    return decryptResponse;

  }

}
