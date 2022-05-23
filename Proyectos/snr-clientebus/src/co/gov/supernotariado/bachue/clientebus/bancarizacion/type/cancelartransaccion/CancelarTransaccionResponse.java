
package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.cancelartransaccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.RespuestaGeneralTransaccion;


/**
 * <p>Clase Java para cancelarTransaccionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelarTransaccionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}respuestaGeneralTransaccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarTransaccionResponse", propOrder = {
    "_return"
})
public class CancelarTransaccionResponse {

    @XmlElement(name = "return")
    protected RespuestaGeneralTransaccion _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaGeneralTransaccion }
     *     
     */
    public RespuestaGeneralTransaccion getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaGeneralTransaccion }
     *     
     */
    public void setReturn(RespuestaGeneralTransaccion value) {
        this._return = value;
    }

}
