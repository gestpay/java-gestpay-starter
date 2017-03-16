
package it.gestpay.wscryptdecrypt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shopLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uicCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shopTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ppSellerProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{https://ecomm.sella.it/}ShippingDetails" minOccurs="0"/>
 *         &lt;element name="paymentTypes" type="{https://ecomm.sella.it/}PaymentTypes" minOccurs="0"/>
 *         &lt;element name="paymentTypeDetail" type="{https://ecomm.sella.it/}PaymentTypeDetail" minOccurs="0"/>
 *         &lt;element name="redFraudPrevention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_CustomerInfo" type="{https://ecomm.sella.it/}RedCustomerInfo" minOccurs="0"/>
 *         &lt;element name="Red_ShippingInfo" type="{https://ecomm.sella.it/}RedShippingInfo" minOccurs="0"/>
 *         &lt;element name="Red_BillingInfo" type="{https://ecomm.sella.it/}RedBillingInfo" minOccurs="0"/>
 *         &lt;element name="Red_CustomerData" type="{https://ecomm.sella.it/}RedCustomerData" minOccurs="0"/>
 *         &lt;element name="Red_CustomInfo" type="{https://ecomm.sella.it/}RedCustomInfo" minOccurs="0"/>
 *         &lt;element name="Red_Items" type="{https://ecomm.sella.it/}RedItems" minOccurs="0"/>
 *         &lt;element name="Consel_MerchantPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consel_CustomerInfo" type="{https://ecomm.sella.it/}ConselCustomerInfo" minOccurs="0"/>
 *         &lt;element name="payPalBillingAgreementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDetails" type="{https://ecomm.sella.it/}EcommGestpayPaymentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shopLogin",
    "uicCode",
    "amount",
    "shopTransactionId",
    "cardNumber",
    "expiryMonth",
    "expiryYear",
    "buyerName",
    "buyerEmail",
    "languageId",
    "cvv",
    "customInfo",
    "requestToken",
    "ppSellerProtection",
    "shippingDetails",
    "paymentTypes",
    "paymentTypeDetail",
    "redFraudPrevention",
    "redCustomerInfo",
    "redShippingInfo",
    "redBillingInfo",
    "redCustomerData",
    "redCustomInfo",
    "redItems",
    "conselMerchantPro",
    "conselCustomerInfo",
    "payPalBillingAgreementDescription",
    "orderDetails"
})
@XmlRootElement(name = "Encrypt")
public class Encrypt {

    @XmlElement(required = true, nillable = true)
    protected String shopLogin;
    @XmlElement(required = true, nillable = true)
    protected String uicCode;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String shopTransactionId;
    protected String cardNumber;
    protected String expiryMonth;
    protected String expiryYear;
    protected String buyerName;
    protected String buyerEmail;
    protected String languageId;
    protected String cvv;
    protected String customInfo;
    protected String requestToken;
    protected String ppSellerProtection;
    protected ShippingDetails shippingDetails;
    protected PaymentTypes paymentTypes;
    protected PaymentTypeDetail paymentTypeDetail;
    protected String redFraudPrevention;
    @XmlElement(name = "Red_CustomerInfo")
    protected RedCustomerInfo redCustomerInfo;
    @XmlElement(name = "Red_ShippingInfo")
    protected RedShippingInfo redShippingInfo;
    @XmlElement(name = "Red_BillingInfo")
    protected RedBillingInfo redBillingInfo;
    @XmlElement(name = "Red_CustomerData")
    protected RedCustomerData redCustomerData;
    @XmlElement(name = "Red_CustomInfo")
    protected RedCustomInfo redCustomInfo;
    @XmlElement(name = "Red_Items")
    protected RedItems redItems;
    @XmlElement(name = "Consel_MerchantPro")
    protected String conselMerchantPro;
    @XmlElement(name = "Consel_CustomerInfo")
    protected ConselCustomerInfo conselCustomerInfo;
    protected String payPalBillingAgreementDescription;
    @XmlElement(name = "OrderDetails")
    protected EcommGestpayPaymentDetails orderDetails;

    /**
     * Recupera il valore della proprietà shopLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopLogin() {
        return shopLogin;
    }

    /**
     * Imposta il valore della proprietà shopLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopLogin(String value) {
        this.shopLogin = value;
    }

    /**
     * Recupera il valore della proprietà uicCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUicCode() {
        return uicCode;
    }

    /**
     * Imposta il valore della proprietà uicCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUicCode(String value) {
        this.uicCode = value;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà shopTransactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopTransactionId() {
        return shopTransactionId;
    }

    /**
     * Imposta il valore della proprietà shopTransactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopTransactionId(String value) {
        this.shopTransactionId = value;
    }

    /**
     * Recupera il valore della proprietà cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Imposta il valore della proprietà cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Recupera il valore della proprietà expiryMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Imposta il valore della proprietà expiryMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Recupera il valore della proprietà expiryYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Imposta il valore della proprietà expiryYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Recupera il valore della proprietà buyerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Imposta il valore della proprietà buyerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerName(String value) {
        this.buyerName = value;
    }

    /**
     * Recupera il valore della proprietà buyerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Imposta il valore della proprietà buyerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Recupera il valore della proprietà languageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Imposta il valore della proprietà languageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Recupera il valore della proprietà cvv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Imposta il valore della proprietà cvv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Recupera il valore della proprietà customInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomInfo() {
        return customInfo;
    }

    /**
     * Imposta il valore della proprietà customInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomInfo(String value) {
        this.customInfo = value;
    }

    /**
     * Recupera il valore della proprietà requestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Imposta il valore della proprietà requestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Recupera il valore della proprietà ppSellerProtection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpSellerProtection() {
        return ppSellerProtection;
    }

    /**
     * Imposta il valore della proprietà ppSellerProtection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpSellerProtection(String value) {
        this.ppSellerProtection = value;
    }

    /**
     * Recupera il valore della proprietà shippingDetails.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetails }
     *     
     */
    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Imposta il valore della proprietà shippingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetails }
     *     
     */
    public void setShippingDetails(ShippingDetails value) {
        this.shippingDetails = value;
    }

    /**
     * Recupera il valore della proprietà paymentTypes.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentTypes() {
        return paymentTypes;
    }

    /**
     * Imposta il valore della proprietà paymentTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentTypes(PaymentTypes value) {
        this.paymentTypes = value;
    }

    /**
     * Recupera il valore della proprietà paymentTypeDetail.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeDetail }
     *     
     */
    public PaymentTypeDetail getPaymentTypeDetail() {
        return paymentTypeDetail;
    }

    /**
     * Imposta il valore della proprietà paymentTypeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeDetail }
     *     
     */
    public void setPaymentTypeDetail(PaymentTypeDetail value) {
        this.paymentTypeDetail = value;
    }

    /**
     * Recupera il valore della proprietà redFraudPrevention.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedFraudPrevention() {
        return redFraudPrevention;
    }

    /**
     * Imposta il valore della proprietà redFraudPrevention.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedFraudPrevention(String value) {
        this.redFraudPrevention = value;
    }

    /**
     * Recupera il valore della proprietà redCustomerInfo.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomerInfo }
     *     
     */
    public RedCustomerInfo getRedCustomerInfo() {
        return redCustomerInfo;
    }

    /**
     * Imposta il valore della proprietà redCustomerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomerInfo }
     *     
     */
    public void setRedCustomerInfo(RedCustomerInfo value) {
        this.redCustomerInfo = value;
    }

    /**
     * Recupera il valore della proprietà redShippingInfo.
     * 
     * @return
     *     possible object is
     *     {@link RedShippingInfo }
     *     
     */
    public RedShippingInfo getRedShippingInfo() {
        return redShippingInfo;
    }

    /**
     * Imposta il valore della proprietà redShippingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RedShippingInfo }
     *     
     */
    public void setRedShippingInfo(RedShippingInfo value) {
        this.redShippingInfo = value;
    }

    /**
     * Recupera il valore della proprietà redBillingInfo.
     * 
     * @return
     *     possible object is
     *     {@link RedBillingInfo }
     *     
     */
    public RedBillingInfo getRedBillingInfo() {
        return redBillingInfo;
    }

    /**
     * Imposta il valore della proprietà redBillingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RedBillingInfo }
     *     
     */
    public void setRedBillingInfo(RedBillingInfo value) {
        this.redBillingInfo = value;
    }

    /**
     * Recupera il valore della proprietà redCustomerData.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomerData }
     *     
     */
    public RedCustomerData getRedCustomerData() {
        return redCustomerData;
    }

    /**
     * Imposta il valore della proprietà redCustomerData.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomerData }
     *     
     */
    public void setRedCustomerData(RedCustomerData value) {
        this.redCustomerData = value;
    }

    /**
     * Recupera il valore della proprietà redCustomInfo.
     * 
     * @return
     *     possible object is
     *     {@link RedCustomInfo }
     *     
     */
    public RedCustomInfo getRedCustomInfo() {
        return redCustomInfo;
    }

    /**
     * Imposta il valore della proprietà redCustomInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RedCustomInfo }
     *     
     */
    public void setRedCustomInfo(RedCustomInfo value) {
        this.redCustomInfo = value;
    }

    /**
     * Recupera il valore della proprietà redItems.
     * 
     * @return
     *     possible object is
     *     {@link RedItems }
     *     
     */
    public RedItems getRedItems() {
        return redItems;
    }

    /**
     * Imposta il valore della proprietà redItems.
     * 
     * @param value
     *     allowed object is
     *     {@link RedItems }
     *     
     */
    public void setRedItems(RedItems value) {
        this.redItems = value;
    }

    /**
     * Recupera il valore della proprietà conselMerchantPro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConselMerchantPro() {
        return conselMerchantPro;
    }

    /**
     * Imposta il valore della proprietà conselMerchantPro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConselMerchantPro(String value) {
        this.conselMerchantPro = value;
    }

    /**
     * Recupera il valore della proprietà conselCustomerInfo.
     * 
     * @return
     *     possible object is
     *     {@link ConselCustomerInfo }
     *     
     */
    public ConselCustomerInfo getConselCustomerInfo() {
        return conselCustomerInfo;
    }

    /**
     * Imposta il valore della proprietà conselCustomerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConselCustomerInfo }
     *     
     */
    public void setConselCustomerInfo(ConselCustomerInfo value) {
        this.conselCustomerInfo = value;
    }

    /**
     * Recupera il valore della proprietà payPalBillingAgreementDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalBillingAgreementDescription() {
        return payPalBillingAgreementDescription;
    }

    /**
     * Imposta il valore della proprietà payPalBillingAgreementDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalBillingAgreementDescription(String value) {
        this.payPalBillingAgreementDescription = value;
    }

    /**
     * Recupera il valore della proprietà orderDetails.
     * 
     * @return
     *     possible object is
     *     {@link EcommGestpayPaymentDetails }
     *     
     */
    public EcommGestpayPaymentDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Imposta il valore della proprietà orderDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link EcommGestpayPaymentDetails }
     *     
     */
    public void setOrderDetails(EcommGestpayPaymentDetails value) {
        this.orderDetails = value;
    }

}
