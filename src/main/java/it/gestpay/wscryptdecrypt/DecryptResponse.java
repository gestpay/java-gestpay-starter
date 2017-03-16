package it.gestpay.wscryptdecrypt;

/**
 * Created by michelenasti on 16/03/17.
 */
public class DecryptResponse {

  private String transactionType;
  private String transactionResult;
  private String errorCode;
  private String errorDescription;
  private String shopTransactionID;
  private String bankTransactionID;
  private String authorizationCode;
  private String currency;
  private String amount;

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

  public String getShopTransactionID() {
    return shopTransactionID;
  }

  public void setShopTransactionID(String shopTransactionID) {
    this.shopTransactionID = shopTransactionID;
  }

  public String getBankTransactionID() {
    return bankTransactionID;
  }

  public void setBankTransactionID(String bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
  }

  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public String toString() {
    return "DecryptResponse{" +
        "transactionType='" + transactionType + '\'' +
        ", transactionResult='" + transactionResult + '\'' +
        ", errorCode='" + errorCode + '\'' +
        ", errorDescription='" + errorDescription + '\'' +
        ", shopTransactionID='" + shopTransactionID + '\'' +
        ", bankTransactionID='" + bankTransactionID + '\'' +
        ", authorizationCode='" + authorizationCode + '\'' +
        ", currency='" + currency + '\'' +
        ", amount='" + amount + '\'' +
        '}';
  }
}
