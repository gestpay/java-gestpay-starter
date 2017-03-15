
package it.gestpay.wscryptdecrypt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the shopLogin property.
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
     * Sets the value of the shopLogin property.
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
     * Gets the value of the uicCode property.
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
     * Sets the value of the uicCode property.
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
     * Gets the value of the amount property.
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
     * Sets the value of the amount property.
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
     * Gets the value of the shopTransactionId property.
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
     * Sets the value of the shopTransactionId property.
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
     * Gets the value of the cardNumber property.
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
     * Sets the value of the cardNumber property.
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
     * Gets the value of the expiryMonth property.
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
     * Sets the value of the expiryMonth property.
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
     * Gets the value of the expiryYear property.
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
     * Sets the value of the expiryYear property.
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
     * Gets the value of the buyerName property.
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
     * Sets the value of the buyerName property.
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
     * Gets the value of the buyerEmail property.
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
     * Sets the value of the buyerEmail property.
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
     * Gets the value of the languageId property.
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
     * Sets the value of the languageId property.
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
     * Gets the value of the cvv property.
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
     * Sets the value of the cvv property.
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
     * Gets the value of the customInfo property.
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
     * Sets the value of the customInfo property.
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
     * Gets the value of the requestToken property.
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
     * Sets the value of the requestToken property.
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
     * Gets the value of the ppSellerProtection property.
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
     * Sets the value of the ppSellerProtection property.
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
     * Gets the value of the shippingDetails property.
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
     * Sets the value of the shippingDetails property.
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
     * Gets the value of the paymentTypes property.
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
     * Sets the value of the paymentTypes property.
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
     * Gets the value of the paymentTypeDetail property.
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
     * Sets the value of the paymentTypeDetail property.
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
     * Gets the value of the redFraudPrevention property.
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
     * Sets the value of the redFraudPrevention property.
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
     * Gets the value of the redCustomerInfo property.
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
     * Sets the value of the redCustomerInfo property.
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
     * Gets the value of the redShippingInfo property.
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
     * Sets the value of the redShippingInfo property.
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
     * Gets the value of the redBillingInfo property.
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
     * Sets the value of the redBillingInfo property.
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
     * Gets the value of the redCustomerData property.
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
     * Sets the value of the redCustomerData property.
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
     * Gets the value of the redCustomInfo property.
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
     * Sets the value of the redCustomInfo property.
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
     * Gets the value of the redItems property.
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
     * Sets the value of the redItems property.
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
     * Gets the value of the conselMerchantPro property.
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
     * Sets the value of the conselMerchantPro property.
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
     * Gets the value of the conselCustomerInfo property.
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
     * Sets the value of the conselCustomerInfo property.
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
     * Gets the value of the payPalBillingAgreementDescription property.
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
     * Sets the value of the payPalBillingAgreementDescription property.
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
     * Gets the value of the orderDetails property.
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
     * Sets the value of the orderDetails property.
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
