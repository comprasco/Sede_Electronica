package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitarturnorel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitarTurnoRELResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitarTurnoRELResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}respuestaSolicitarTurnoREL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitarTurnoRELResponse", propOrder = {
    "_return"
})
public class SolicitarTurnoRELResponse {

    @XmlElement(name = "return")
    protected RespuestaSolicitarTurnoREL _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSolicitarTurnoREL }
     *     
     */
    public RespuestaSolicitarTurnoREL getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSolicitarTurnoREL }
     *     
     */
    public void setReturn(RespuestaSolicitarTurnoREL value) {
        this._return = value;
    }

}
