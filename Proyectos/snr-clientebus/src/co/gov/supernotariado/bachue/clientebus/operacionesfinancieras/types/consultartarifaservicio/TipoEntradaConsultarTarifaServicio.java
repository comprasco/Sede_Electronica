package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarTarifaServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarTarifaServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canalOrigen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="fisico"/>
 *               &lt;enumeration value="electronico"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="servicios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servicio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoServicioCTSI" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tipoEntradaConsultarTarifaServicio", propOrder = {
    "tipoDocSolicitante",
    "numeroDocSolicitante",
    "codigoConvenio",
    "canalOrigen",
    "servicios"
})
public class TipoEntradaConsultarTarifaServicio {

    @XmlElement(required = true)
    protected String tipoDocSolicitante;
    @XmlElement(required = true)
    protected String numeroDocSolicitante;
    @XmlElementRef(name = "codigoConvenio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConvenio;
    @XmlElement(required = true)
    protected String canalOrigen;
    @XmlElement(required = true)
    protected TipoEntradaConsultarTarifaServicio.Servicios servicios;

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
     * Obtiene el valor de la propiedad canalOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalOrigen() {
        return canalOrigen;
    }

    /**
     * Define el valor de la propiedad canalOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalOrigen(String value) {
        this.canalOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad servicios.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaConsultarTarifaServicio.Servicios }
     *     
     */
    public TipoEntradaConsultarTarifaServicio.Servicios getServicios() {
        return servicios;
    }

    /**
     * Define el valor de la propiedad servicios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaConsultarTarifaServicio.Servicios }
     *     
     */
    public void setServicios(TipoEntradaConsultarTarifaServicio.Servicios value) {
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
     *         &lt;element name="servicio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoServicioCTSI" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<TipoServicioCTSI> servicio;

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
         * {@link TipoServicioCTSI }
         * 
         * 
         */
        public List<TipoServicioCTSI> getServicio() {
            if (servicio == null) {
                servicio = new ArrayList<>();
            }
            return this.servicio;
        }

    }

}
