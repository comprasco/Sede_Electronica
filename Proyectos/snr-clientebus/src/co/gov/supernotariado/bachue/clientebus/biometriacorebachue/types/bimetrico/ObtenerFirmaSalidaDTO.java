
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFirmaSalidaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFirmaSalidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}firmaSalidaDTO">
 *       &lt;sequence>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idFirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFirmaSalidaDTO", propOrder = {
    "firma",
    "idFirma"
})
public class ObtenerFirmaSalidaDTO
    extends FirmaSalidaDTO
{

    protected String firma;
    protected String idFirma;

    /**
     * Obtiene el valor de la propiedad firma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Obtiene el valor de la propiedad idFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFirma() {
        return idFirma;
    }

    /**
     * Define el valor de la propiedad idFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFirma(String value) {
        this.idFirma = value;
    }

}
