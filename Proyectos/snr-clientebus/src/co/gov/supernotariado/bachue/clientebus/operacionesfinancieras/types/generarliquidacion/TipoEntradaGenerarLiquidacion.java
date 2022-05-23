package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaGenerarLiquidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaGenerarLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCanal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoSucursalCanal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oripSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellidoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servicio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2}tipoServicioGLI" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "tipoEntradaGenerarLiquidacion", propOrder = {
    "codigoConvenio",
    "codigoCanal",
    "codigoSucursalCanal",
    "oripSolicitud",
    "tipoPersona",
    "tipoDocSolicitante",
    "numeroDocSolicitante",
    "primerNombreSolicitante",
    "segundoNombreSolicitante",
    "primerApellidoSolicitante",
    "segundoApellidoSolicitante",
    "razonSocial",
    "servicios"
})
public class TipoEntradaGenerarLiquidacion {

    @XmlElementRef(name = "codigoConvenio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConvenio;
    @XmlElement(required = true)
    protected String codigoCanal;
    @XmlElement(required = true)
    protected String codigoSucursalCanal;
    @XmlElementRef(name = "oripSolicitud", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oripSolicitud;
    @XmlElement(required = true)
    protected String tipoPersona;
    @XmlElement(required = true)
    protected String tipoDocSolicitante;
    @XmlElement(required = true)
    protected String numeroDocSolicitante;
    @XmlElementRef(name = "primerNombreSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerNombreSolicitante;
    @XmlElementRef(name = "segundoNombreSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombreSolicitante;
    @XmlElementRef(name = "primerApellidoSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellidoSolicitante;
    @XmlElementRef(name = "segundoApellidoSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoSolicitante;
    @XmlElementRef(name = "razonSocial", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razonSocial;
    @XmlElement(required = true)
    protected TipoEntradaGenerarLiquidacion.Servicios servicios;

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
     * Obtiene el valor de la propiedad codigoCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCanal() {
        return codigoCanal;
    }

    /**
     * Define el valor de la propiedad codigoCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCanal(String value) {
        this.codigoCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSucursalCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSucursalCanal() {
        return codigoSucursalCanal;
    }

    /**
     * Define el valor de la propiedad codigoSucursalCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSucursalCanal(String value) {
        this.codigoSucursalCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad oripSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOripSolicitud() {
        return oripSolicitud;
    }

    /**
     * Define el valor de la propiedad oripSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOripSolicitud(JAXBElement<String> value) {
        this.oripSolicitud = value;
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
     * Obtiene el valor de la propiedad tipoDocSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocSolicitante() {
        return tipoDocSolicitante;
    }

    /**
     * Define el valor de la propiedad tipoDocSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocSolicitante(String value) {
        this.tipoDocSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocSolicitante() {
        return numeroDocSolicitante;
    }

    /**
     * Define el valor de la propiedad numeroDocSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocSolicitante(String value) {
        this.numeroDocSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombreSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerNombreSolicitante() {
        return primerNombreSolicitante;
    }

    /**
     * Define el valor de la propiedad primerNombreSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerNombreSolicitante(JAXBElement<String> value) {
        this.primerNombreSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombreSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNombreSolicitante() {
        return segundoNombreSolicitante;
    }

    /**
     * Define el valor de la propiedad segundoNombreSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNombreSolicitante(JAXBElement<String> value) {
        this.segundoNombreSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApellidoSolicitante() {
        return primerApellidoSolicitante;
    }

    /**
     * Define el valor de la propiedad primerApellidoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApellidoSolicitante(JAXBElement<String> value) {
        this.primerApellidoSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellidoSolicitante() {
        return segundoApellidoSolicitante;
    }

    /**
     * Define el valor de la propiedad segundoApellidoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellidoSolicitante(JAXBElement<String> value) {
        this.segundoApellidoSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazonSocial(JAXBElement<String> value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad servicios.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaGenerarLiquidacion.Servicios }
     *     
     */
    public TipoEntradaGenerarLiquidacion.Servicios getServicios() {
        return servicios;
    }

    /**
     * Define el valor de la propiedad servicios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaGenerarLiquidacion.Servicios }
     *     
     */
    public void setServicios(TipoEntradaGenerarLiquidacion.Servicios value) {
        this.servicios = value;
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
     *         &lt;element name="servicio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2}tipoServicioGLI" maxOccurs="unbounded" minOccurs="0"/>
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
        "servicio"
    })
    public static class Servicios {

        protected List<TipoServicioGLI> servicio;

        /**
         * Gets the value of the servicio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoServicioGLI }
         * 
         * 
         */
        public List<TipoServicioGLI> getServicio() {
            if (servicio == null) {
                servicio = new ArrayList<>();
            }
            return this.servicio;
        }

    }

}
