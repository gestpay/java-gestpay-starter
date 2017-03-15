
package it.gestpay.wscryptdecrypt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EcommGestpayPaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcommGestpayPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FraudPrevention" type="{https://ecomm.sella.it/}FraudPrevention" minOccurs="0"/>
 *         &lt;element name="CustomerDetail" type="{https://ecomm.sella.it/}CustomerDetail" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{https://ecomm.sella.it/}ShippingAddress" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{https://ecomm.sella.it/}BillingAddress" minOccurs="0"/>
 *         &lt;element name="ProductDetails" type="{https://ecomm.sella.it/}ArrayOfProductDetail" minOccurs="0"/>
 *         &lt;element name="DiscountCodes" type="{https://ecomm.sella.it/}ArrayOfDiscountCode" minOccurs="0"/>
 *         &lt;element name="ShippingLines" type="{https://ecomm.sella.it/}ArrayOfShippingLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommGestpayPaymentDetails", propOrder = {
    "fraudPrevention",
    "customerDetail",
    "shippingAddress",
    "billingAddress",
    "productDetails",
    "discountCodes",
    "shippingLines"
})
public class EcommGestpayPaymentDetails {

    @XmlElement(name = "FraudPrevention")
    protected FraudPrevention fraudPrevention;
    @XmlElement(name = "CustomerDetail")
    protected CustomerDetail customerDetail;
    @XmlElement(name = "ShippingAddress")
    protected ShippingAddress shippingAddress;
    @XmlElement(name = "BillingAddress")
    protected BillingAddress billingAddress;
    @XmlElement(name = "ProductDetails")
    protected ArrayOfProductDetail productDetails;
    @XmlElement(name = "DiscountCodes")
    protected ArrayOfDiscountCode discountCodes;
    @XmlElement(name = "ShippingLines")
    protected ArrayOfShippingLine shippingLines;

    /**
     * Gets the value of the fraudPrevention property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPrevention }
     *     
     */
    public FraudPrevention getFraudPrevention() {
        return fraudPrevention;
    }

    /**
     * Sets the value of the fraudPrevention property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPrevention }
     *     
     */
    public void setFraudPrevention(FraudPrevention value) {
        this.fraudPrevention = value;
    }

    /**
     * Gets the value of the customerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetail }
     *     
     */
    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    /**
     * Sets the value of the customerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetail }
     *     
     */
    public void setCustomerDetail(CustomerDetail value) {
        this.customerDetail = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddress }
     *     
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddress }
     *     
     */
    public void setBillingAddress(BillingAddress value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductDetail }
     *     
     */
    public ArrayOfProductDetail getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductDetail }
     *     
     */
    public void setProductDetails(ArrayOfProductDetail value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the discountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiscountCode }
     *     
     */
    public ArrayOfDiscountCode getDiscountCodes() {
        return discountCodes;
    }

    /**
     * Sets the value of the discountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiscountCode }
     *     
     */
    public void setDiscountCodes(ArrayOfDiscountCode value) {
        this.discountCodes = value;
    }

    /**
     * Gets the value of the shippingLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShippingLine }
     *     
     */
    public ArrayOfShippingLine getShippingLines() {
        return shippingLines;
    }

    /**
     * Sets the value of the shippingLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShippingLine }
     *     
     */
    public void setShippingLines(ArrayOfShippingLine value) {
        this.shippingLines = value;
    }

}
