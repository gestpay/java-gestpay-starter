package it.gestpay.wscryptdecrypt;

import com.myshop.constants.Constants;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

import static com.myshop.constants.Constants.SHOP_LOGIN;
import static com.myshop.constants.Constants.UIC_CODE_EURO;

/**
 * Created by michelenasti on 15/03/17.
 */
public class WsCryptDecryptTests {

  private WsCryptDecryptService wsCryptDecryptService = new WsCryptDecryptService(Constants.TEST_ENDPOINT);


  public WsCryptDecryptTests() throws MalformedURLException {
  }

  @Test
  public void testEncrypt() {
    EncryptRequest encryptRequest = new EncryptRequest();
    encryptRequest.setShopLogin(SHOP_LOGIN);
    encryptRequest.setAmount("15");
    encryptRequest.setUicCode(UIC_CODE_EURO);
    encryptRequest.setShopTransactionId(Constants.TRANSACTIONS_PREFIX+"001");
    EncryptResponse encrypt = wsCryptDecryptService.encrypt(encryptRequest);

    Assert.assertNotNull(encrypt);
    Assert.assertEquals("0", encrypt.getErrorCode());
    System.out.println(encrypt.getCryptDecryptString());
  }

  @Test
  public void testDecrypt(){

    DecryptRequest decryptObject = new DecryptRequest();
    decryptObject.setCryptedString("PYTqXwoUzoRNRw8snF4_5nU*NPhZETbLIEkeJdthUynhMNFXio2pARL3hkpWUCCKSzkg1h7mkcvMYnL1fko7z2IBs6e2n1zVcCF8PBEKFh6FVXn5FxBxJNaVTobbWOLn");
    decryptObject.setShopLogin(SHOP_LOGIN);
    DecryptResponse decryptResult = wsCryptDecryptService.decrypt(decryptObject);

    Assert.assertNotNull(decryptResult);
    Assert.assertEquals("DECRYPT", decryptResult.getTransactionType());
  }
}
