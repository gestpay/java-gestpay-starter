package it.gestpay.wscryptdecrypt;

/**
 * Created by michelenasti on 15/03/17.
 */
public class EncryptResult {

  private String transactionType;
  private String transactionResult;
  private String cryptDecryptString;
  private String errorCode;
  private String errorDescription;

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public String getTransactionResult() {
    return transactionResult;
  }

  public void setTransactionResult(String transactionResult) {
    this.transactionResult = transactionResult;
  }

  public String getCryptDecryptString() {
    return cryptDecryptString;
  }

  public void setCryptDecryptString(String cryptDecryptString) {
    this.cryptDecryptString = cryptDecryptString;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }
}
