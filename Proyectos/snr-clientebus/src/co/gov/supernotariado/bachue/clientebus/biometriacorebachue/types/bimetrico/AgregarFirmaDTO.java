
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarFirmaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarFirmaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocCiudadano" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoDocCiudadano" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarFirmaDTO", propOrder = {
    "firma",
    "idTramite",
    "idUsuario",
    "numeroDocCiudadano",
    "tipoDocCiudadano"
})
public class AgregarFirmaDTO
    extends BaseDTO
{

    @XmlElement(required = true)
    protected String firma;
    @XmlElement(required = true)
    protected String idTramite;
    @XmlElement(required = true)
    protected String idUsuario;
    protected long numeroDocCiudadano;
    @XmlElement(required = true)
    protected String tipoDocCiudadano;

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
     * Obtiene el valor de la propiedad idTramite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTramite() {
        return idTramite;
    }

    /**
     * Define el valor de la propiedad idTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTramite(String value) {
        this.idTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocCiudadano.
     * 
     */
    public long getNumeroDocCiudadano() {
        return numeroDocCiudadano;
    }

    /**
     * Define el valor de la propiedad numeroDocCiudadano.
     * 
     */
    public void setNumeroDocCiudadano(long value) {
        this.numeroDocCiudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocCiudadano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocCiudadano() {
        return tipoDocCiudadano;
    }

    /**
     * Define el valor de la propiedad tipoDocCiudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocCiudadano(String value) {
        this.tipoDocCiudadano = value;
    }

}
