package co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryTransactionByTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryTransactionByTokenResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.dto.services.realpay.nvalue.com.co/}queryTransactionByTokenDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryTransactionByTokenResponse", propOrder = {
    "_return"
})
public class QueryTransactionByTokenResponse {

    @XmlElement(name = "return")
    protected QueryTransactionByTokenDTO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTransactionByTokenDTO }
     *     
     */
    public QueryTransactionByTokenDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTransactionByTokenDTO }
     *     
     */
    public void setReturn(QueryTransactionByTokenDTO value) {
        this._return = value;
    }

}
