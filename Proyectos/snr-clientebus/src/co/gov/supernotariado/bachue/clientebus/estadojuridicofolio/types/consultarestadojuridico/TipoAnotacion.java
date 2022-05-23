package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoAnotacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numAnotacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anotacionesCanceladas" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoAnotacionCancelada" maxOccurs="unbounded"/>
 *         &lt;element name="comentario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codTipoDocumentoPublico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaDocumento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomDocumentoPublico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codDominioActoJuridico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomDominioActoJuridico">
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
 *         &lt;element name="comentarioEspecificoAnotacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DRR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codNaturalezaJuridicaFolio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaAnotacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="intervinientes" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoInterviniente" maxOccurs="unbounded"/>
 *         &lt;element name="NIR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="radicacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoAnotacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valorActo">
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
@XmlType(name = "tipoAnotacion", propOrder = {
    "numAnotacion",
    "anotacionesCanceladas",
    "comentario",
    "codTipoDocumentoPublico",
    "fechaDocumento",
    "nomDocumentoPublico",
    "codDominioActoJuridico",
    "nomDominioActoJuridico",
    "oficinaOrigen",
    "comentarioEspecificoAnotacion",
    "drr",
    "codNaturalezaJuridicaFolio",
    "fechaAnotacion",
    "intervinientes",
    "nir",
    "radicacion",
    "estadoAnotacion",
    "valorActo"
})
public class TipoAnotacion {

    @XmlElement(required = true)
    protected BigInteger numAnotacion;
    @XmlElement(required = true)
    protected List<TipoAnotacionCancelada> anotacionesCanceladas;
    @XmlElement(required = true)
    protected String comentario;
    @XmlElement(required = true)
    protected String codTipoDocumentoPublico;
    @XmlElement(required = true)
    protected XMLGregorianCalendar fechaDocumento;
    @XmlElement(required = true)
    protected String nomDocumentoPublico;
    @XmlElement(required = true)
    protected String codDominioActoJuridico;
    @XmlElement(required = true)
    protected String nomDominioActoJuridico;
    @XmlElement(required = true)
    protected String oficinaOrigen;
    @XmlElement(required = true)
    protected String comentarioEspecificoAnotacion;
    @XmlElement(name = "DRR", required = true)
    protected String drr;
    @XmlElement(required = true)
    protected String codNaturalezaJuridicaFolio;
    @XmlElement(required = true)
    protected XMLGregorianCalendar fechaAnotacion;
    @XmlElement(required = true)
    protected List<TipoInterviniente> intervinientes;
    @XmlElement(name = "NIR", required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String radicacion;
    @XmlElement(required = true)
    protected String estadoAnotacion;
    @XmlElement(required = true)
    protected String valorActo;

    /**
     * Obtiene el valor de la propiedad numAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumAnotacion() {
        return numAnotacion;
    }

    /**
     * Define el valor de la propiedad numAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumAnotacion(BigInteger value) {
        this.numAnotacion = value;
    }

    /**
     * Gets the value of the anotacionesCanceladas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anotacionesCanceladas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnotacionesCanceladas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAnotacionCancelada }
     * 
     * 
     */
    public List<TipoAnotacionCancelada> getAnotacionesCanceladas() {
        if (anotacionesCanceladas == null) {
            anotacionesCanceladas = new ArrayList<>();
        }
        return this.anotacionesCanceladas;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoDocumentoPublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoDocumentoPublico() {
        return codTipoDocumentoPublico;
    }

    /**
     * Define el valor de la propiedad codTipoDocumentoPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoDocumentoPublico(String value) {
        this.codTipoDocumentoPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumento(XMLGregorianCalendar value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDocumentoPublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDocumentoPublico() {
        return nomDocumentoPublico;
    }

    /**
     * Define el valor de la propiedad nomDocumentoPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDocumentoPublico(String value) {
        this.nomDocumentoPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad codDominioActoJuridico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDominioActoJuridico() {
        return codDominioActoJuridico;
    }

    /**
     * Define el valor de la propiedad codDominioActoJuridico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDominioActoJuridico(String value) {
        this.codDominioActoJuridico = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDominioActoJuridico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDominioActoJuridico() {
        return nomDominioActoJuridico;
    }

    /**
     * Define el valor de la propiedad nomDominioActoJuridico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDominioActoJuridico(String value) {
        this.nomDominioActoJuridico = value;
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
     * Obtiene el valor de la propiedad comentarioEspecificoAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioEspecificoAnotacion() {
        return comentarioEspecificoAnotacion;
    }

    /**
     * Define el valor de la propiedad comentarioEspecificoAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioEspecificoAnotacion(String value) {
        this.comentarioEspecificoAnotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad drr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRR() {
        return drr;
    }

    /**
     * Define el valor de la propiedad drr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRR(String value) {
        this.drr = value;
    }

    /**
     * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNaturalezaJuridicaFolio() {
        return codNaturalezaJuridicaFolio;
    }

    /**
     * Define el valor de la propiedad codNaturalezaJuridicaFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNaturalezaJuridicaFolio(String value) {
        this.codNaturalezaJuridicaFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAnotacion() {
        return fechaAnotacion;
    }

    /**
     * Define el valor de la propiedad fechaAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAnotacion(XMLGregorianCalendar value) {
        this.fechaAnotacion = value;
    }

    /**
     * Gets the value of the intervinientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervinientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervinientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInterviniente }
     * 
     * 
     */
    public List<TipoInterviniente> getIntervinientes() {
        if (intervinientes == null) {
            intervinientes = new ArrayList<>();
        }
        return this.intervinientes;
    }

    /**
     * Obtiene el valor de la propiedad nir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIR() {
        return nir;
    }

    /**
     * Define el valor de la propiedad nir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIR(String value) {
        this.nir = value;
    }

    /**
     * Obtiene el valor de la propiedad radicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacion() {
        return radicacion;
    }

    /**
     * Define el valor de la propiedad radicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacion(String value) {
        this.radicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoAnotacion() {
        return estadoAnotacion;
    }

    /**
     * Define el valor de la propiedad estadoAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoAnotacion(String value) {
        this.estadoAnotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorActo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorActo() {
        return valorActo;
    }

    /**
     * Define el valor de la propiedad valorActo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorActo(String value) {
        this.valorActo = value;
    }

}
