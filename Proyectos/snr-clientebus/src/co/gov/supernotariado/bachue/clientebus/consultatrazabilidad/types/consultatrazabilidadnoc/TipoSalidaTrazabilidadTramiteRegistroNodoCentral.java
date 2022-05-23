
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Mensaje de Salida de la
 * 				consulta de Trazabilidad Tramite Registro o Estado del Tramite en
 * 				Nodo Central
 * 			
 * 
 * <p>Clase Java para tipoSalidaTrazabilidadTramiteRegistroNodoCentral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaTrazabilidadTramiteRegistroNodoCentral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDepartamento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomDepartamento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codMunicipio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomMunicipio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="oficinaOrigen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadosTramite" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoEstadoTramite" maxOccurs="unbounded"/>
 *         &lt;element name="fechaHoraConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaRadicacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaInstrumento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroInstrumento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomTipoDocumentoPublico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcionMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaTrazabilidadTramiteRegistroNodoCentral", propOrder = {
    "codDepartamento",
    "nomDepartamento",
    "codMunicipio",
    "nomMunicipio",
    "oficinaOrigen",
    "estadosTramite",
    "fechaHoraConsulta",
    "fechaRadicacion",
    "fechaInstrumento",
    "numeroInstrumento",
    "nomTipoDocumentoPublico",
    "descripcionMensaje",
    "numeroConsulta"
})
public class TipoSalidaTrazabilidadTramiteRegistroNodoCentral {

    @XmlElement(required = true)
    protected String codDepartamento;
    @XmlElement(required = true)
    protected String nomDepartamento;
    @XmlElement(required = true)
    protected String codMunicipio;
    @XmlElement(required = true)
    protected String nomMunicipio;
    @XmlElement(required = true)
    protected String oficinaOrigen;
    @XmlElement(required = true)
    protected List<TipoEstadoTramite> estadosTramite;
    @XmlElement(required = true)
    protected String fechaHoraConsulta;
    @XmlElement(required = true)
    protected String fechaRadicacion;
    @XmlElement(required = true)
    protected String fechaInstrumento;
    @XmlElement(required = true)
    protected String numeroInstrumento;
    @XmlElement(required = true)
    protected String nomTipoDocumentoPublico;
    @XmlElement(required = true)
    protected String descripcionMensaje;
    @XmlElement(required = true)
    protected String numeroConsulta;

    /**
     * Obtiene el valor de la propiedad codDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDepartamento() {
        return codDepartamento;
    }

    /**
     * Define el valor de la propiedad codDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDepartamento(String value) {
        this.codDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDepartamento() {
        return nomDepartamento;
    }

    /**
     * Define el valor de la propiedad nomDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDepartamento(String value) {
        this.nomDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Define el valor de la propiedad codMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMunicipio(String value) {
        this.codMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad nomMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMunicipio() {
        return nomMunicipio;
    }

    /**
     * Define el valor de la propiedad nomMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMunicipio(String value) {
        this.nomMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad oficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaOrigen() {
        return oficinaOrigen;
    }

    /**
     * Define el valor de la propiedad oficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaOrigen(String value) {
        this.oficinaOrigen = value;
    }

    /**
     * Gets the value of the estadosTramite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estadosTramite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadosTramite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoEstadoTramite }
     * 
     * 
     */
    public List<TipoEstadoTramite> getEstadosTramite() {
        if (estadosTramite == null) {
            estadosTramite = new ArrayList<>();
        }
        return this.estadosTramite;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    /**
     * Define el valor de la propiedad fechaHoraConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraConsulta(String value) {
        this.fechaHoraConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRadicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Define el valor de la propiedad fechaRadicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRadicacion(String value) {
        this.fechaRadicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInstrumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInstrumento() {
        return fechaInstrumento;
    }

    /**
     * Define el valor de la propiedad fechaInstrumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInstrumento(String value) {
        this.fechaInstrumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInstrumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInstrumento() {
        return numeroInstrumento;
    }

    /**
     * Define el valor de la propiedad numeroInstrumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInstrumento(String value) {
        this.numeroInstrumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nomTipoDocumentoPublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoDocumentoPublico() {
        return nomTipoDocumentoPublico;
    }

    /**
     * Define el valor de la propiedad nomTipoDocumentoPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoDocumentoPublico(String value) {
        this.nomTipoDocumentoPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    /**
     * Define el valor de la propiedad numeroConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsulta(String value) {
        this.numeroConsulta = value;
    }

}
