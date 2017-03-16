
package it.gestpay.wscryptdecrypt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PaymentTypeDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MyBankBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdealBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeDetail", propOrder = {
    "myBankBankCode",
    "idealBankCode"
})
public class PaymentTypeDetail {

    @XmlElement(name = "MyBankBankCode")
    protected String myBankBankCode;
    @XmlElement(name = "IdealBankCode")
    protected String idealBankCode;

    /**
     * Recupera il valore della proprietà myBankBankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyBankBankCode() {
        return myBankBankCode;
    }

    /**
     * Imposta il valore della proprietà myBankBankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyBankBankCode(String value) {
        this.myBankBankCode = value;
    }

    /**
     * Recupera il valore della proprietà idealBankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdealBankCode() {
        return idealBankCode;
    }

    /**
     * Imposta il valore della proprietà idealBankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdealBankCode(String value) {
        this.idealBankCode = value;
    }

}
