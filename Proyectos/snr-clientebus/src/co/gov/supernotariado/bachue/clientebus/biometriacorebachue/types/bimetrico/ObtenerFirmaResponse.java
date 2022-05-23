
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFirmaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFirmaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obtenerFirmaResponse" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}obtenerFirmaSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFirmaResponse", propOrder = {
    "obtenerFirmaResponse"
})
public class ObtenerFirmaResponse {

    protected ObtenerFirmaSalidaDTO obtenerFirmaResponse;

    /**
     * Obtiene el valor de la propiedad obtenerFirmaResponse.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerFirmaSalidaDTO }
     *     
     */
    public ObtenerFirmaSalidaDTO getObtenerFirmaResponse() {
        return obtenerFirmaResponse;
    }

    /**
     * Define el valor de la propiedad obtenerFirmaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerFirmaSalidaDTO }
     *     
     */
    public void setObtenerFirmaResponse(ObtenerFirmaSalidaDTO value) {
        this.obtenerFirmaResponse = value;
    }

}
