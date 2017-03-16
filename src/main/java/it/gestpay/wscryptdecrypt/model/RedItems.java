
package it.gestpay.wscryptdecrypt.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RedItems complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RedItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Red_Item" type="{https://ecomm.sella.it/}RedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedItems", propOrder = {
    "numberOfItems",
    "redItem"
})
public class RedItems {

    @XmlElement(name = "NumberOfItems")
    protected String numberOfItems;
    @XmlElement(name = "Red_Item")
    protected List<RedItem> redItem;

    /**
     * Recupera il valore della proprietà numberOfItems.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Imposta il valore della proprietà numberOfItems.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfItems(String value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the redItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedItem }
     * 
     * 
     */
    public List<RedItem> getRedItem() {
        if (redItem == null) {
            redItem = new ArrayList<RedItem>();
        }
        return this.redItem;
    }

}
