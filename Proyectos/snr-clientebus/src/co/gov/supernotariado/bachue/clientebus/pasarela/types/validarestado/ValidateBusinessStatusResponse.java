
package co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateBusinessStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateBusinessStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.dto.services.realpay.nvalue.com.co/}validateSystemStatusDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateBusinessStatusResponse", propOrder = {
    "_return"
})
public class ValidateBusinessStatusResponse {

    @XmlElement(name = "return")
    protected ValidateSystemStatusDTO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateSystemStatusDTO }
     *     
     */
    public ValidateSystemStatusDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateSystemStatusDTO }
     *     
     */
    public void setReturn(ValidateSystemStatusDTO value) {
        this._return = value;
    }

}
