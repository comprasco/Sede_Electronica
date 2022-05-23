package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoInterviniente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoInterviniente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rolInterviniente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoPersona">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="esPropietario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoDocumentoPersona">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numDocumentoPersona">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numNIT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="porcentajeParticipacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="primerNombre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="segundoNombre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="primerApellido">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="segundoApellido">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codGenero">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="razonSocial">
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
@XmlType(name = "tipoInterviniente", propOrder = {
    "rolInterviniente",
    "tipoPersona",
    "esPropietario",
    "tipoDocumentoPersona",
    "numDocumentoPersona",
    "numNIT",
    "porcentajeParticipacion",
    "primerNombre",
    "segundoNombre",
    "primerApellido",
    "segundoApellido",
    "codGenero",
    "razonSocial"
})
public class TipoInterviniente {

    @XmlElement(required = true)
    protected String rolInterviniente;
    @XmlElement(required = true)
    protected String tipoPersona;
    @XmlElement(required = true)
    protected String esPropietario;
    @XmlElement(required = true)
    protected String tipoDocumentoPersona;
    @XmlElement(required = true)
    protected String numDocumentoPersona;
    @XmlElement(required = true)
    protected String numNIT;
    @XmlElement(required = true)
    protected String porcentajeParticipacion;
    @XmlElement(required = true)
    protected String primerNombre;
    @XmlElement(required = true)
    protected String segundoNombre;
    @XmlElement(required = true)
    protected String primerApellido;
    @XmlElement(required = true)
    protected String segundoApellido;
    @XmlElement(required = true)
    protected String codGenero;
    @XmlElement(required = true)
    protected String razonSocial;

    /**
     * Obtiene el valor de la propiedad rolInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolInterviniente() {
        return rolInterviniente;
    }

    /**
     * Define el valor de la propiedad rolInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolInterviniente(String value) {
        this.rolInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad esPropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsPropietario() {
        return esPropietario;
    }

    /**
     * Define el valor de la propiedad esPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsPropietario(String value) {
        this.esPropietario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoPersona() {
        return tipoDocumentoPersona;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoPersona(String value) {
        this.tipoDocumentoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocumentoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocumentoPersona() {
        return numDocumentoPersona;
    }

    /**
     * Define el valor de la propiedad numDocumentoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocumentoPersona(String value) {
        this.numDocumentoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numNIT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumNIT() {
        return numNIT;
    }

    /**
     * Define el valor de la propiedad numNIT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumNIT(String value) {
        this.numNIT = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeParticipacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Define el valor de la propiedad porcentajeParticipacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeParticipacion(String value) {
        this.porcentajeParticipacion = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad codGenero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGenero() {
        return codGenero;
    }

    /**
     * Define el valor de la propiedad codGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGenero(String value) {
        this.codGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

}
