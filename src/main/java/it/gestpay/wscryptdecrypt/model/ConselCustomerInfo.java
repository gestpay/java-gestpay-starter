
package it.gestpay.wscryptdecrypt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ConselCustomerInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConselCustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunicipalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunicipalDocumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunicipalWorkingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunicipalBirthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkingTelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonthlyPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConselCustomerInfo", propOrder = {
    "surname",
    "name",
    "taxationCode",
    "address",
    "city",
    "stateCode",
    "dateAddress",
    "phone",
    "mobilePhone",
    "municipalCode",
    "stateBirthDate",
    "birthDate",
    "mail",
    "municipalDocumentCode",
    "employment",
    "workingAddress",
    "municipalWorkingCode",
    "documentState",
    "documentNumber",
    "municipalBirthCode",
    "visaExpiryDate",
    "iban",
    "documentDate",
    "workingTelNumber",
    "workingState",
    "monthlyPay"
})
public class ConselCustomerInfo {

    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TaxationCode")
    protected String taxationCode;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "DateAddress")
    protected String dateAddress;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "MunicipalCode")
    protected String municipalCode;
    @XmlElement(name = "StateBirthDate")
    protected String stateBirthDate;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "Mail")
    protected String mail;
    @XmlElement(name = "MunicipalDocumentCode")
    protected String municipalDocumentCode;
    @XmlElement(name = "Employment")
    protected String employment;
    @XmlElement(name = "WorkingAddress")
    protected String workingAddress;
    @XmlElement(name = "MunicipalWorkingCode")
    protected String municipalWorkingCode;
    @XmlElement(name = "DocumentState")
    protected String documentState;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "MunicipalBirthCode")
    protected String municipalBirthCode;
    @XmlElement(name = "VisaExpiryDate")
    protected String visaExpiryDate;
    @XmlElement(name = "Iban")
    protected String iban;
    @XmlElement(name = "DocumentDate")
    protected String documentDate;
    @XmlElement(name = "WorkingTelNumber")
    protected String workingTelNumber;
    @XmlElement(name = "WorkingState")
    protected String workingState;
    @XmlElement(name = "MonthlyPay")
    protected String monthlyPay;

    /**
     * Recupera il valore della proprietà surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Imposta il valore della proprietà surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà taxationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxationCode() {
        return taxationCode;
    }

    /**
     * Imposta il valore della proprietà taxationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxationCode(String value) {
        this.taxationCode = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà stateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Imposta il valore della proprietà stateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Recupera il valore della proprietà dateAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAddress() {
        return dateAddress;
    }

    /**
     * Imposta il valore della proprietà dateAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAddress(String value) {
        this.dateAddress = value;
    }

    /**
     * Recupera il valore della proprietà phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Imposta il valore della proprietà phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Recupera il valore della proprietà mobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Imposta il valore della proprietà mobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Recupera il valore della proprietà municipalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalCode() {
        return municipalCode;
    }

    /**
     * Imposta il valore della proprietà municipalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalCode(String value) {
        this.municipalCode = value;
    }

    /**
     * Recupera il valore della proprietà stateBirthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateBirthDate() {
        return stateBirthDate;
    }

    /**
     * Imposta il valore della proprietà stateBirthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateBirthDate(String value) {
        this.stateBirthDate = value;
    }

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Recupera il valore della proprietà mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Imposta il valore della proprietà mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Recupera il valore della proprietà municipalDocumentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalDocumentCode() {
        return municipalDocumentCode;
    }

    /**
     * Imposta il valore della proprietà municipalDocumentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalDocumentCode(String value) {
        this.municipalDocumentCode = value;
    }

    /**
     * Recupera il valore della proprietà employment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * Imposta il valore della proprietà employment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployment(String value) {
        this.employment = value;
    }

    /**
     * Recupera il valore della proprietà workingAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingAddress() {
        return workingAddress;
    }

    /**
     * Imposta il valore della proprietà workingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingAddress(String value) {
        this.workingAddress = value;
    }

    /**
     * Recupera il valore della proprietà municipalWorkingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalWorkingCode() {
        return municipalWorkingCode;
    }

    /**
     * Imposta il valore della proprietà municipalWorkingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalWorkingCode(String value) {
        this.municipalWorkingCode = value;
    }

    /**
     * Recupera il valore della proprietà documentState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentState() {
        return documentState;
    }

    /**
     * Imposta il valore della proprietà documentState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentState(String value) {
        this.documentState = value;
    }

    /**
     * Recupera il valore della proprietà documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Imposta il valore della proprietà documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Recupera il valore della proprietà municipalBirthCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalBirthCode() {
        return municipalBirthCode;
    }

    /**
     * Imposta il valore della proprietà municipalBirthCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalBirthCode(String value) {
        this.municipalBirthCode = value;
    }

    /**
     * Recupera il valore della proprietà visaExpiryDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaExpiryDate() {
        return visaExpiryDate;
    }

    /**
     * Imposta il valore della proprietà visaExpiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaExpiryDate(String value) {
        this.visaExpiryDate = value;
    }

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietà documentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDate() {
        return documentDate;
    }

    /**
     * Imposta il valore della proprietà documentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDate(String value) {
        this.documentDate = value;
    }

    /**
     * Recupera il valore della proprietà workingTelNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingTelNumber() {
        return workingTelNumber;
    }

    /**
     * Imposta il valore della proprietà workingTelNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingTelNumber(String value) {
        this.workingTelNumber = value;
    }

    /**
     * Recupera il valore della proprietà workingState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingState() {
        return workingState;
    }

    /**
     * Imposta il valore della proprietà workingState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingState(String value) {
        this.workingState = value;
    }

    /**
     * Recupera il valore della proprietà monthlyPay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyPay() {
        return monthlyPay;
    }

    /**
     * Imposta il valore della proprietà monthlyPay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyPay(String value) {
        this.monthlyPay = value;
    }

}
