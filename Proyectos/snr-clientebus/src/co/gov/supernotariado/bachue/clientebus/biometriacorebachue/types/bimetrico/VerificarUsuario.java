
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaVerificacion" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}verificacionDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarUsuario", propOrder = {
    "entradaVerificacion"
})
public class VerificarUsuario {

    protected VerificacionDTO entradaVerificacion;

    /**
     * Obtiene el valor de la propiedad entradaVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link VerificacionDTO }
     *     
     */
    public VerificacionDTO getEntradaVerificacion() {
        return entradaVerificacion;
    }

    /**
     * Define el valor de la propiedad entradaVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificacionDTO }
     *     
     */
    public void setEntradaVerificacion(VerificacionDTO value) {
        this.entradaVerificacion = value;
    }

}
