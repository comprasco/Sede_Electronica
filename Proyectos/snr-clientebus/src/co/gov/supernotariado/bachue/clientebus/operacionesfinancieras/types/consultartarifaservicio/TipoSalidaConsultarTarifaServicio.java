package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarTarifaServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarTarifaServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviciosTarifados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servicioTarifado" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoServicioCTSO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarTarifaServicio", propOrder = {
    "serviciosTarifados",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarTarifaServicio {

    @XmlElement(required = true)
    protected TipoSalidaConsultarTarifaServicio.ServiciosTarifados serviciosTarifados;
    @XmlElement(required = true)
    protected BigInteger codigoMensaje;
    @XmlElementRef(name = "descripcionMensaje", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad serviciosTarifados.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarTarifaServicio.ServiciosTarifados }
     *     
     */
    public TipoSalidaConsultarTarifaServicio.ServiciosTarifados getServiciosTarifados() {
        return serviciosTarifados;
    }

    /**
     * Define el valor de la propiedad serviciosTarifados.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarTarifaServicio.ServiciosTarifados }
     *     
     */
    public void setServiciosTarifados(TipoSalidaConsultarTarifaServicio.ServiciosTarifados value) {
        this.serviciosTarifados = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoMensaje(BigInteger value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionMensaje(JAXBElement<String> value) {
        this.descripcionMensaje = value;
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
     *         &lt;element name="servicioTarifado" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoServicioCTSO" maxOccurs="unbounded" minOccurs="0"/>
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
        "servicioTarifado"
    })
    public static class ServiciosTarifados {

        protected List<TipoServicioCTSO> servicioTarifado;

        /**
         * Gets the value of the servicioTarifado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicioTarifado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicioTarifado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoServicioCTSO }
         * 
         * 
         */
        public List<TipoServicioCTSO> getServicioTarifado() {
            if (servicioTarifado == null) {
                servicioTarifado = new ArrayList<>();
            }
            return this.servicioTarifado;
        }

    }

}
