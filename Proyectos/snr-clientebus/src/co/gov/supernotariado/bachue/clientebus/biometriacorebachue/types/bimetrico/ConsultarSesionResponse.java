
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarSesionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarSesionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salidaSesion" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}sesionDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSesionResponse", propOrder = {
    "salidaSesion"
})
public class ConsultarSesionResponse {

    protected SesionDTO salidaSesion;

    /**
     * Obtiene el valor de la propiedad salidaSesion.
     * 
     * @return
     *     possible object is
     *     {@link SesionDTO }
     *     
     */
    public SesionDTO getSalidaSesion() {
        return salidaSesion;
    }

    /**
     * Define el valor de la propiedad salidaSesion.
     * 
     * @param value
     *     allowed object is
     *     {@link SesionDTO }
     *     
     */
    public void setSalidaSesion(SesionDTO value) {
        this.salidaSesion = value;
    }

}
