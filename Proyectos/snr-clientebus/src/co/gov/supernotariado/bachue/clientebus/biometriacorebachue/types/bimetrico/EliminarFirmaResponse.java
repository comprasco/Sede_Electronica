
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarFirmaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarFirmaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eliminarFirmaResponse" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}firmaSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarFirmaResponse", propOrder = {
    "eliminarFirmaResponse"
})
public class EliminarFirmaResponse {

    protected FirmaSalidaDTO eliminarFirmaResponse;

    /**
     * Obtiene el valor de la propiedad eliminarFirmaResponse.
     * 
     * @return
     *     possible object is
     *     {@link FirmaSalidaDTO }
     *     
     */
    public FirmaSalidaDTO getEliminarFirmaResponse() {
        return eliminarFirmaResponse;
    }

    /**
     * Define el valor de la propiedad eliminarFirmaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmaSalidaDTO }
     *     
     */
    public void setEliminarFirmaResponse(FirmaSalidaDTO value) {
        this.eliminarFirmaResponse = value;
    }

}
