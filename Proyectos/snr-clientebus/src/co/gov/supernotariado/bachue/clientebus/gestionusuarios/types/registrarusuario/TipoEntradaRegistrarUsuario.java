
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaRegistrarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaRegistrarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correoElectronicoCorporativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoElectronicoPersonal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoCambio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Creacion"/>
 *               &lt;enumeration value="Modificacion"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="segundoFactor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Huella"/>
 *               &lt;enumeration value="SegundaClave"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigosRoles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoRol" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigosORIPs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoORIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEntidadExterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoUsuario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="L"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cargo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="justificacionCambio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaVigenciaSegundaClave" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaRegistrarUsuario", propOrder = {
    "numeroSolicitud",
    "loginUsuario",
    "tipoDocumento",
    "numeroDocumento",
    "primerNombreUsuario",
    "segundoNombreUsuario",
    "primerApellidoUsuario",
    "segundoApellidoUsuario",
    "correoElectronicoCorporativo",
    "correoElectronicoPersonal",
    "tipoCambio",
    "segundoFactor",
    "codigosRoles",
    "codigosORIPs",
    "codigoConvenio",
    "idEntidadExterna",
    "estadoUsuario",
    "cargo",
    "justificacionCambio",
    "fechaInicio",
    "fechaFin",
    "fechaVigenciaSegundaClave"
})
public class TipoEntradaRegistrarUsuario {

    @XmlElement(required = true)
    protected String numeroSolicitud;
    @XmlElement(required = true)
    protected String loginUsuario;
    @XmlElement(required = true)
    protected String tipoDocumento;
    @XmlElement(required = true)
    protected String numeroDocumento;
    @XmlElement(required = true)
    protected String primerNombreUsuario;
    @XmlElement(required = true)
    protected String segundoNombreUsuario;
    @XmlElement(required = true)
    protected String primerApellidoUsuario;
    @XmlElement(required = true)
    protected String segundoApellidoUsuario;
    @XmlElementRef(name = "correoElectronicoCorporativo", namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correoElectronicoCorporativo;
    @XmlElement(required = true)
    protected String correoElectronicoPersonal;
    @XmlElement(required = true)
    protected String tipoCambio;
    @XmlElement(required = true)
    protected String segundoFactor;
    @XmlElement(required = true)
    protected TipoEntradaRegistrarUsuario.CodigosRoles codigosRoles;
    @XmlElement(required = true)
    protected TipoEntradaRegistrarUsuario.CodigosORIPs codigosORIPs;
    @XmlElementRef(name = "codigoConvenio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConvenio;
    @XmlElementRef(name = "idEntidadExterna", namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idEntidadExterna;
    @XmlElement(required = true)
    protected String estadoUsuario;
    @XmlElement(required = true)
    protected String cargo;
    @XmlElement(required = true)
    protected String justificacionCambio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVigenciaSegundaClave;

    /**
     * Obtiene el valor de la propiedad numeroSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    /**
     * Define el valor de la propiedad numeroSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSolicitud(String value) {
        this.numeroSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad loginUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Define el valor de la propiedad loginUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsuario(String value) {
        this.loginUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreUsuario() {
        return primerNombreUsuario;
    }

    /**
     * Define el valor de la propiedad primerNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreUsuario(String value) {
        this.primerNombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombreUsuario() {
        return segundoNombreUsuario;
    }

    /**
     * Define el valor de la propiedad segundoNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombreUsuario(String value) {
        this.segundoNombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoUsuario() {
        return primerApellidoUsuario;
    }

    /**
     * Define el valor de la propiedad primerApellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoUsuario(String value) {
        this.primerApellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoUsuario() {
        return segundoApellidoUsuario;
    }

    /**
     * Define el valor de la propiedad segundoApellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoUsuario(String value) {
        this.segundoApellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronicoCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreoElectronicoCorporativo() {
        return correoElectronicoCorporativo;
    }

    /**
     * Define el valor de la propiedad correoElectronicoCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreoElectronicoCorporativo(JAXBElement<String> value) {
        this.correoElectronicoCorporativo = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronicoPersonal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronicoPersonal() {
        return correoElectronicoPersonal;
    }

    /**
     * Define el valor de la propiedad correoElectronicoPersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronicoPersonal(String value) {
        this.correoElectronicoPersonal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoFactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoFactor() {
        return segundoFactor;
    }

    /**
     * Define el valor de la propiedad segundoFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoFactor(String value) {
        this.segundoFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosRoles.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaRegistrarUsuario.CodigosRoles }
     *     
     */
    public TipoEntradaRegistrarUsuario.CodigosRoles getCodigosRoles() {
        return codigosRoles;
    }

    /**
     * Define el valor de la propiedad codigosRoles.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaRegistrarUsuario.CodigosRoles }
     *     
     */
    public void setCodigosRoles(TipoEntradaRegistrarUsuario.CodigosRoles value) {
        this.codigosRoles = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosORIPs.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaRegistrarUsuario.CodigosORIPs }
     *     
     */
    public TipoEntradaRegistrarUsuario.CodigosORIPs getCodigosORIPs() {
        return codigosORIPs;
    }

    /**
     * Define el valor de la propiedad codigosORIPs.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaRegistrarUsuario.CodigosORIPs }
     *     
     */
    public void setCodigosORIPs(TipoEntradaRegistrarUsuario.CodigosORIPs value) {
        this.codigosORIPs = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConvenio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoConvenio() {
        return codigoConvenio;
    }

    /**
     * Define el valor de la propiedad codigoConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoConvenio(JAXBElement<String> value) {
        this.codigoConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad idEntidadExterna.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdEntidadExterna() {
        return idEntidadExterna;
    }

    /**
     * Define el valor de la propiedad idEntidadExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdEntidadExterna(JAXBElement<String> value) {
        this.idEntidadExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    /**
     * Define el valor de la propiedad estadoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoUsuario(String value) {
        this.estadoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad justificacionCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacionCambio() {
        return justificacionCambio;
    }

    /**
     * Define el valor de la propiedad justificacionCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacionCambio(String value) {
        this.justificacionCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigenciaSegundaClave.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVigenciaSegundaClave() {
        return fechaVigenciaSegundaClave;
    }

    /**
     * Define el valor de la propiedad fechaVigenciaSegundaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVigenciaSegundaClave(XMLGregorianCalendar value) {
        this.fechaVigenciaSegundaClave = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoORIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoORIP"
    })
    public static class CodigosORIPs {

        @XmlElement(required = true)
        protected List<String> codigoORIP;

        /**
         * Gets the value of the codigoORIP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codigoORIP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodigoORIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCodigoORIP() {
            if (codigoORIP == null) {
                codigoORIP = new ArrayList<String>();
            }
            return this.codigoORIP;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoRol" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoRol"
    })
    public static class CodigosRoles {

        @XmlElement(required = true)
        protected List<String> codigoRol;

        /**
         * Gets the value of the codigoRol property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codigoRol property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodigoRol().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCodigoRol() {
            if (codigoRol == null) {
                codigoRol = new ArrayList<String>();
            }
            return this.codigoRol;
        }

    }

}
