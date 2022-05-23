
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarFirmaSalidaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarFirmaSalidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}firmaSalidaDTO">
 *       &lt;sequence>
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
@XmlType(name = "agregarFirmaSalidaDTO", propOrder = {
    "idFirma"
})
public class AgregarFirmaSalidaDTO
    extends FirmaSalidaDTO
{

    protected String idFirma;

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
