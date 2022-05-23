
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarEstadoSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarEstadoSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solicitante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoDocumento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CC"/>
 *                         &lt;enumeration value="CE"/>
 *                         &lt;enumeration value="NIT"/>
 *                         &lt;enumeration value="PS"/>
 *                         &lt;enumeration value="TI"/>
 *                         &lt;enumeration value="NU"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="servicios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1}servicio" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarEstadoSolicitud", propOrder = {
    "modulo",
    "solicitante",
    "servicios",
    "nir"
})
public class TipoEntradaConsultarEstadoSolicitud {

    @XmlElement(required = true)
    protected String modulo;
    @XmlElement(required = true)
    protected TipoEntradaConsultarEstadoSolicitud.Solicitante solicitante;
    @XmlElement(required = true)
    protected TipoEntradaConsultarEstadoSolicitud.Servicios servicios;
    @XmlElement(name = "NIR", required = true)
    protected String nir;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitante.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaConsultarEstadoSolicitud.Solicitante }
     *     
     */
    public TipoEntradaConsultarEstadoSolicitud.Solicitante getSolicitante() {
        return solicitante;
    }

    /**
     * Define el valor de la propiedad solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaConsultarEstadoSolicitud.Solicitante }
     *     
     */
    public void setSolicitante(TipoEntradaConsultarEstadoSolicitud.Solicitante value) {
        this.solicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad servicios.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaConsultarEstadoSolicitud.Servicios }
     *     
     */
    public TipoEntradaConsultarEstadoSolicitud.Servicios getServicios() {
        return servicios;
    }

    /**
     * Define el valor de la propiedad servicios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaConsultarEstadoSolicitud.Servicios }
     *     
     */
    public void setServicios(TipoEntradaConsultarEstadoSolicitud.Servicios value) {
        this.servicios = value;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1}servicio" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<Servicio> servicio;

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
         * {@link Servicio }
         * 
         * 
         */
        public List<Servicio> getServicio() {
            if (servicio == null) {
                servicio = new ArrayList<>();
            }
            return this.servicio;
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
     *         &lt;element name="tipoDocumento">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="CC"/>
     *               &lt;enumeration value="CE"/>
     *               &lt;enumeration value="NIT"/>
     *               &lt;enumeration value="PS"/>
     *               &lt;enumeration value="TI"/>
     *               &lt;enumeration value="NU"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tipoDocumento",
        "numeroDocumento",
        "tipoPersona"
    })
    public static class Solicitante {

        @XmlElement(required = true)
        protected String tipoDocumento;
        @XmlElement(required = true)
        protected String numeroDocumento;
        @XmlElement(required = true)
        protected String tipoPersona;

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

    }

}
