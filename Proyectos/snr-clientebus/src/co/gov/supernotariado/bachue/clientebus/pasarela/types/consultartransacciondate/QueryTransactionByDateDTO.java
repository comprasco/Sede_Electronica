package co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.LogDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;


/**
 * <p>Java class for queryTransactionByDateDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryTransactionByDateDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="log" type="{http://soap.dto.services.realpay.nvalue.com.co/}logDTO"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transacciones" type="{http://soap.dto.services.realpay.nvalue.com.co/}queryTransactionByTokenDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryTransactionByDateDTO", propOrder = {
    "consecutive",
    "log",
    "result",
    "transacciones"
})
public class QueryTransactionByDateDTO {

    protected Long consecutive;
    @XmlElement(required = true)
    protected LogDTO log;
    protected String result;
    @XmlElement(nillable = true)
    protected List<QueryTransactionByTokenDTO> transacciones;

    /**
     * Gets the value of the consecutive property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsecutive() {
        return consecutive;
    }

    /**
     * Sets the value of the consecutive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsecutive(Long value) {
        this.consecutive = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link LogDTO }
     *     
     */
    public LogDTO getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogDTO }
     *     
     */
    public void setLog(LogDTO value) {
        this.log = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the transacciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transacciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransacciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryTransactionByTokenDTO }
     * 
     * 
     */
    public List<QueryTransactionByTokenDTO> getTransacciones() {
        if (transacciones == null) {
            transacciones = new ArrayList<>();
        }
        return this.transacciones;
    }

}
