
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarFirmaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarFirmaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agregarFirmaResponse" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}agregarFirmaSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarFirmaResponse", propOrder = {
    "agregarFirmaResponse"
})
public class AgregarFirmaResponse {

    protected AgregarFirmaSalidaDTO agregarFirmaResponse;

    /**
     * Obtiene el valor de la propiedad agregarFirmaResponse.
     * 
     * @return
     *     possible object is
     *     {@link AgregarFirmaSalidaDTO }
     *     
     */
    public AgregarFirmaSalidaDTO getAgregarFirmaResponse() {
        return agregarFirmaResponse;
    }

    /**
     * Define el valor de la propiedad agregarFirmaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AgregarFirmaSalidaDTO }
     *     
     */
    public void setAgregarFirmaResponse(AgregarFirmaSalidaDTO value) {
        this.agregarFirmaResponse = value;
    }

}
