
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarUsuarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salidaResultado" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}booleanSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarUsuarioResponse", propOrder = {
    "salidaResultado"
})
public class VerificarUsuarioResponse {

    protected BooleanSalidaDTO salidaResultado;

    /**
     * Obtiene el valor de la propiedad salidaResultado.
     * 
     * @return
     *     possible object is
     *     {@link BooleanSalidaDTO }
     *     
     */
    public BooleanSalidaDTO getSalidaResultado() {
        return salidaResultado;
    }

    /**
     * Define el valor de la propiedad salidaResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanSalidaDTO }
     *     
     */
    public void setSalidaResultado(BooleanSalidaDTO value) {
        this.salidaResultado = value;
    }

}
