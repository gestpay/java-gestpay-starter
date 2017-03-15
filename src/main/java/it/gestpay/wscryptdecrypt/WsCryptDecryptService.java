package it.gestpay.wscryptdecrypt;

import it.gestpay.constants.Constants;
import it.gestpay.wscryptdecrypt.model.DecryptResponse;
import it.gestpay.wscryptdecrypt.model.EncryptResponse;
import it.gestpay.wscryptdecrypt.model.WSCryptDecrypt;
import it.gestpay.wscryptdecrypt.model.WSCryptDecryptSoap;
import org.w3c.dom.Element;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by michelenasti on 14/03/17.
 */
public class WsCryptDecryptService {

  //this is the soap service
  private WSCryptDecryptSoap wsCryptDecryptSoap;

  /**
   * Creates the service pointing to TEST Environment.
   * @throws MalformedURLException
   */
  public WsCryptDecryptService() throws MalformedURLException {
    this(Constants.TEST_ENDPOINT);
  }

  /**
   * Creates the Service pointing to the enivornment.
   * @param environment Constants.TEST_ENVIRONMENT or Constants.PROD_ENVIRONMENT
   * @throws MalformedURLException
   */
  public WsCryptDecryptService(String environment) throws MalformedURLException {
    WSCryptDecrypt wsCryptDecrypt = new WSCryptDecrypt(new URL(environment));
    wsCryptDecryptSoap = wsCryptDecrypt.getWSCryptDecryptSoap();
  }


  public EncryptResult encrypt(EncryptObject encryptObject) {
    EncryptResponse.EncryptResult result = wsCryptDecryptSoap.encrypt(
        encryptObject.getShopLogin(),
        encryptObject.getUicCode(),
        encryptObject.getAmount(),
        encryptObject.getShopTransactionId(),
        null,
        null,
        null,
        encryptObject.getBuyerName(),
        encryptObject.getBuyerEmail(),
        encryptObject.getLanguageId(),
        null,
        encryptObject.getCustomInfo(),
        encryptObject.getRequestToken(),
        encryptObject.getPpSellerProtection(),
        encryptObject.getShippingDetails(),
        encryptObject.getPaymentTypes(),
        encryptObject.getPaymentTypeDetail(),
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        encryptObject.getConselMerchantPro(),
        encryptObject.getConselCustomerInfo(),
        encryptObject.getPayPalBillingAgreementDescription(),
        encryptObject.getOrderDetails());

//    List<String> content = (List) encryptResult.getContent();
//
//    return content;
    Element element = (Element) result.getContent().get(0);

    EncryptResult encryptResult = new EncryptResult();

    if (element.getElementsByTagName("CryptDecryptString").item(0) != null) {
      encryptResult.setCryptDecryptString(element.getElementsByTagName("CryptDecryptString").item(0).getTextContent());
    }

    if (element.getElementsByTagName("ErrorCode").item(0) != null) {
      encryptResult.setErrorCode( element.getElementsByTagName("ErrorCode").item(0).getTextContent());
    }

    if (element.getElementsByTagName("ErrorDescription").item(0) != null) {
      encryptResult.setErrorDescription(element.getElementsByTagName("ErrorDescription").item(0).getTextContent());
    }

    if (element.getElementsByTagName("TransactionResult").item(0) != null) {
      encryptResult.setTransactionResult(element.getElementsByTagName("TransactionResult").item(0).getTextContent());
    }

    if (element.getElementsByTagName("TransactionType").item(0) != null) {
      encryptResult.setTransactionType(element.getElementsByTagName("TransactionType").item(0).getTextContent());
    }
    return encryptResult;

  }

  public DecryptResponse.DecryptResult decrypt() {
    return null;
  }

}
