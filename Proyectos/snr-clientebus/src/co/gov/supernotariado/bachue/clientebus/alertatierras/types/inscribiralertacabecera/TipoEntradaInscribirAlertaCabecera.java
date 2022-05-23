
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaInscribirAlertaCabecera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaInscribirAlertaCabecera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="procesoNroRadicado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesoFechaRadicado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docIdSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docNameSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nitComunidadEtnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creadoSNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaInscribirAlertaCabecera", propOrder = {
    "tipoAlerta",
    "idEntidad",
    "procesoNroRadicado",
    "procesoFechaRadicado",
    "oficinaOrigen",
    "codTipoDocumentoPublico",
    "fechaDocumento",
    "docNumero",
    "docIdSGD",
    "docNameSGD",
    "nitComunidadEtnica",
    "creadoSNR",
    "idUsuario"
})
public class TipoEntradaInscribirAlertaCabecera {

    @XmlElement(required = true)
    protected String tipoAlerta;
    protected int idEntidad;
    @XmlElement(required = true)
    protected String procesoNroRadicado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procesoFechaRadicado;
    @XmlElement(required = true)
    protected String oficinaOrigen;
    @XmlElement(required = true)
    protected String codTipoDocumentoPublico;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumento;
    @XmlElement(required = true)
    protected String docNumero;
    @XmlElement(required = true)
    protected String docIdSGD;
    @XmlElement(required = true)
    protected String docNameSGD;
    protected String nitComunidadEtnica;
    @XmlElement(required = true)
    protected String creadoSNR;
    @XmlElement(required = true)
    protected String idUsuario;

    /**
     * Obtiene el valor de la propiedad tipoAlerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAlerta() {
        return tipoAlerta;
    }

    /**
     * Define el valor de la propiedad tipoAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAlerta(String value) {
        this.tipoAlerta = value;
    }

    /**
     * Obtiene el valor de la propiedad idEntidad.
     * 
     */
    public int getIdEntidad() {
        return idEntidad;
    }

    /**
     * Define el valor de la propiedad idEntidad.
     * 
     */
    public void setIdEntidad(int value) {
        this.idEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad procesoNroRadicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesoNroRadicado() {
        return procesoNroRadicado;
    }

    /**
     * Define el valor de la propiedad procesoNroRadicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesoNroRadicado(String value) {
        this.procesoNroRadicado = value;
    }

    /**
     * Obtiene el valor de la propiedad procesoFechaRadicado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcesoFechaRadicado() {
        return procesoFechaRadicado;
    }

    /**
     * Define el valor de la propiedad procesoFechaRadicado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcesoFechaRadicado(XMLGregorianCalendar value) {
        this.procesoFechaRadicado = value;
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
     * Obtiene el valor de la propiedad docNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumero() {
        return docNumero;
    }

    /**
     * Define el valor de la propiedad docNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumero(String value) {
        this.docNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad docIdSGD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdSGD() {
        return docIdSGD;
    }

    /**
     * Define el valor de la propiedad docIdSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdSGD(String value) {
        this.docIdSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad docNameSGD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNameSGD() {
        return docNameSGD;
    }

    /**
     * Define el valor de la propiedad docNameSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNameSGD(String value) {
        this.docNameSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad nitComunidadEtnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitComunidadEtnica() {
        return nitComunidadEtnica;
    }

    /**
     * Define el valor de la propiedad nitComunidadEtnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitComunidadEtnica(String value) {
        this.nitComunidadEtnica = value;
    }

    /**
     * Obtiene el valor de la propiedad creadoSNR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreadoSNR() {
        return creadoSNR;
    }

    /**
     * Define el valor de la propiedad creadoSNR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreadoSNR(String value) {
        this.creadoSNR = value;
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

}
