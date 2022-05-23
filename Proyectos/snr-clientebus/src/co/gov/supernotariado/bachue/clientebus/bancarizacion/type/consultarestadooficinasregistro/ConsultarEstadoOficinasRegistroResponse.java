package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarEstadoOficinasRegistroResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarEstadoOficinasRegistroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}respuestaConsultarEstadoOficinas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarEstadoOficinasRegistroResponse", propOrder = {
    "_return"
})
public class ConsultarEstadoOficinasRegistroResponse {

    @XmlElement(name = "return")
    protected RespuestaConsultarEstadoOficinas _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultarEstadoOficinas }
     *     
     */
    public RespuestaConsultarEstadoOficinas getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultarEstadoOficinas }
     *     
     */
    public void setReturn(RespuestaConsultarEstadoOficinas value) {
        this._return = value;
    }

}
