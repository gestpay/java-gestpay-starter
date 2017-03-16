package it.gestpay.wscryptdecrypt;

import it.gestpay.wscryptdecrypt.model.*;

/**
 * Created by michelenasti on 15/03/17.
 */
public class EncryptRequest {

  private String shopLogin;
  private String uicCode;
  private String amount;
  private String shopTransactionId;
  private String buyerName;
  private String buyerEmail;
  private String languageId;
  private String customInfo;
  private String requestToken;
  private String ppSellerProtection;
  private ShippingDetails shippingDetails;
  private PaymentTypes paymentTypes;
  private PaymentTypeDetail paymentTypeDetail;
  private String conselMerchantPro;
  private ConselCustomerInfo conselCustomerInfo;
  private String payPalBillingAgreementDescription;
  private EcommGestpayPaymentDetails orderDetails;

  public String getShopLogin() {
    return shopLogin;
  }

  public void setShopLogin(String shopLogin) {
    this.shopLogin = shopLogin;
  }

  public String getUicCode() {
    return uicCode;
  }

  public void setUicCode(String uicCode) {
    this.uicCode = uicCode;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getShopTransactionId() {
    return shopTransactionId;
  }

  public void setShopTransactionId(String shopTransactionId) {
    this.shopTransactionId = shopTransactionId;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public String getCustomInfo() {
    return customInfo;
  }

  public void setCustomInfo(String customInfo) {
    this.customInfo = customInfo;
  }

  public String getRequestToken() {
    return requestToken;
  }

  public void setRequestToken(String requestToken) {
    this.requestToken = requestToken;
  }

  public String getPpSellerProtection() {
    return ppSellerProtection;
  }

  public void setPpSellerProtection(String ppSellerProtection) {
    this.ppSellerProtection = ppSellerProtection;
  }

  public ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public PaymentTypes getPaymentTypes() {
    return paymentTypes;
  }

  public void setPaymentTypes(PaymentTypes paymentTypes) {
    this.paymentTypes = paymentTypes;
  }

  public PaymentTypeDetail getPaymentTypeDetail() {
    return paymentTypeDetail;
  }

  public void setPaymentTypeDetail(PaymentTypeDetail paymentTypeDetail) {
    this.paymentTypeDetail = paymentTypeDetail;
  }


  public String getConselMerchantPro() {
    return conselMerchantPro;
  }

  public void setConselMerchantPro(String conselMerchantPro) {
    this.conselMerchantPro = conselMerchantPro;
  }

  public ConselCustomerInfo getConselCustomerInfo() {
    return conselCustomerInfo;
  }

  public void setConselCustomerInfo(ConselCustomerInfo conselCustomerInfo) {
    this.conselCustomerInfo = conselCustomerInfo;
  }

  public String getPayPalBillingAgreementDescription() {
    return payPalBillingAgreementDescription;
  }

  public void setPayPalBillingAgreementDescription(String payPalBillingAgreementDescription) {
    this.payPalBillingAgreementDescription = payPalBillingAgreementDescription;
  }

  public EcommGestpayPaymentDetails getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(EcommGestpayPaymentDetails orderDetails) {
    this.orderDetails = orderDetails;
  }
}
