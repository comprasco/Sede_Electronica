
package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionpinprepago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.RespuestaGenerarTransaccion;


/**
 * <p>Clase Java para generarTransaccionPINPrepagoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarTransaccionPINPrepagoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}respuestaGenerarTransaccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarTransaccionPINPrepagoResponse", propOrder = {
    "_return"
})
public class GenerarTransaccionPINPrepagoResponse {

    @XmlElement(name = "return")
    protected RespuestaGenerarTransaccion _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaGenerarTransaccion }
     *     
     */
    public RespuestaGenerarTransaccion getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaGenerarTransaccion }
     *     
     */
    public void setReturn(RespuestaGenerarTransaccion value) {
        this._return = value;
    }

}
