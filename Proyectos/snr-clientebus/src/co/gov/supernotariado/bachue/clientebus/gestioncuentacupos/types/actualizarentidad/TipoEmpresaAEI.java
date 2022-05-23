
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEmpresaAEI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEmpresaAEI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumentoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocumentoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="razonSocialEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paisEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departamentoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="municipioEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoEntidadEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefonoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEmpresaAEI", propOrder = {
    "tipoDocumentoEmpresa",
    "numeroDocumentoEmpresa",
    "razonSocialEmpresa",
    "paisEmpresa",
    "departamentoEmpresa",
    "municipioEmpresa",
    "tipoEntidadEmpresa",
    "actividadEconomica",
    "telefonoEmpresa"
})
public class TipoEmpresaAEI {

    @XmlElement(required = true)
    protected String tipoDocumentoEmpresa;
    @XmlElement(required = true)
    protected String numeroDocumentoEmpresa;
    @XmlElement(required = true)
    protected String razonSocialEmpresa;
    @XmlElement(required = true)
    protected String paisEmpresa;
    @XmlElement(required = true)
    protected String departamentoEmpresa;
    @XmlElement(required = true)
    protected String municipioEmpresa;
    @XmlElement(required = true)
    protected String tipoEntidadEmpresa;
    @XmlElement(required = true)
    protected String actividadEconomica;
    @XmlElement(required = true)
    protected String telefonoEmpresa;

    /**
     * Obtiene el valor de la propiedad tipoDocumentoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoEmpresa() {
        return tipoDocumentoEmpresa;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoEmpresa(String value) {
        this.tipoDocumentoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumentoEmpresa() {
        return numeroDocumentoEmpresa;
    }

    /**
     * Define el valor de la propiedad numeroDocumentoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumentoEmpresa(String value) {
        this.numeroDocumentoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    /**
     * Define el valor de la propiedad razonSocialEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEmpresa(String value) {
        this.razonSocialEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad paisEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisEmpresa() {
        return paisEmpresa;
    }

    /**
     * Define el valor de la propiedad paisEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisEmpresa(String value) {
        this.paisEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoEmpresa() {
        return departamentoEmpresa;
    }

    /**
     * Define el valor de la propiedad departamentoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoEmpresa(String value) {
        this.departamentoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioEmpresa() {
        return municipioEmpresa;
    }

    /**
     * Define el valor de la propiedad municipioEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioEmpresa(String value) {
        this.municipioEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEntidadEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEntidadEmpresa() {
        return tipoEntidadEmpresa;
    }

    /**
     * Define el valor de la propiedad tipoEntidadEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEntidadEmpresa(String value) {
        this.tipoEntidadEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad actividadEconomica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Define el valor de la propiedad actividadEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadEconomica(String value) {
        this.actividadEconomica = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    /**
     * Define el valor de la propiedad telefonoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoEmpresa(String value) {
        this.telefonoEmpresa = value;
    }

}
