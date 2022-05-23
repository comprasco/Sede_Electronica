package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tipoIdentificacionTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacionTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoApellidoTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tipoIdentificacionTitular",
    "identificacionTitular",
    "primerNombreTitular",
    "segundoNombreTitular",
    "primerApellidoTitular",
    "segundoApellidoTitular",
    "porcentajeParticipacion"
})
@XmlRootElement(name = "titular")
public class Titular {

    @XmlElement(required = true)
    protected String tipoIdentificacionTitular;
    @XmlElement(required = true)
    protected String identificacionTitular;
    @XmlElement(required = true)
    protected String primerNombreTitular;
    @XmlElementRef(name = "segundoNombreTitular", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombreTitular;
    @XmlElement(required = true)
    protected String primerApellidoTitular;
    @XmlElementRef(name = "segundoApellidoTitular", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoTitular;
    @XmlElement(required = true)
    protected String porcentajeParticipacion;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionTitular() {
        return tipoIdentificacionTitular;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionTitular(String value) {
        this.tipoIdentificacionTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTitular() {
        return identificacionTitular;
    }

    /**
     * Define el valor de la propiedad identificacionTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTitular(String value) {
        this.identificacionTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreTitular() {
        return primerNombreTitular;
    }

    /**
     * Define el valor de la propiedad primerNombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreTitular(String value) {
        this.primerNombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNombreTitular() {
        return segundoNombreTitular;
    }

    /**
     * Define el valor de la propiedad segundoNombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNombreTitular(JAXBElement<String> value) {
        this.segundoNombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoTitular() {
        return primerApellidoTitular;
    }

    /**
     * Define el valor de la propiedad primerApellidoTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoTitular(String value) {
        this.primerApellidoTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoTitular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellidoTitular() {
        return segundoApellidoTitular;
    }

    /**
     * Define el valor de la propiedad segundoApellidoTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellidoTitular(JAXBElement<String> value) {
        this.segundoApellidoTitular = value;
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

}
