package it.gestpay.wscryptdecrypt;

import it.gestpay.constants.Constants;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * Created by michelenasti on 15/03/17.
 */
public class WsCryptDecryptTests {

  private WsCryptDecryptService wsCryptDecryptService = new WsCryptDecryptService(Constants.TEST_ENDPOINT);


  public WsCryptDecryptTests() throws MalformedURLException {
  }

  @Test
  public void testEncrypt() {
    EncryptObject encryptObject = new EncryptObject();
    encryptObject.setShopLogin("GESPAY65987");
    encryptObject.setAmount("15");
    encryptObject.setUicCode("242");
    encryptObject.setShopTransactionId(Constants.TRANSACTIONS_PREFIX+"001");
    EncryptResult encrypt = wsCryptDecryptService.encrypt(encryptObject);

    Assert.assertNotNull(encrypt);

  }
}
