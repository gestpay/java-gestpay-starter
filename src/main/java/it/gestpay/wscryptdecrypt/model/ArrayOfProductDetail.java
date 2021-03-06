
package it.gestpay.wscryptdecrypt.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfProductDetail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDetail" type="{https://ecomm.sella.it/}ProductDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductDetail", propOrder = {
    "productDetail"
})
public class ArrayOfProductDetail {

    @XmlElement(name = "ProductDetail", nillable = true)
    protected List<ProductDetail> productDetail;

    /**
     * Gets the value of the productDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetail }
     * 
     * 
     */
    public List<ProductDetail> getProductDetail() {
        if (productDetail == null) {
            productDetail = new ArrayList<ProductDetail>();
        }
        return this.productDetail;
    }

}
