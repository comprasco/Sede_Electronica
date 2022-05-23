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
 *         &lt;element name="tipoIdentificacionInterviniente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacionInterviniente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreInterviniente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombreInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoInterviniente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoApellidoInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tipoIdentificacionInterviniente",
    "identificacionInterviniente",
    "primerNombreInterviniente",
    "segundoNombreInterviniente",
    "primerApellidoInterviniente",
    "segundoApellidoInterviniente",
    "rol"
})
@XmlRootElement(name = "interviniente")
public class Interviniente {

    @XmlElement(required = true)
    protected String tipoIdentificacionInterviniente;
    @XmlElement(required = true)
    protected String identificacionInterviniente;
    @XmlElement(required = true)
    protected String primerNombreInterviniente;
    @XmlElementRef(name = "segundoNombreInterviniente", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombreInterviniente;
    @XmlElement(required = true)
    protected String primerApellidoInterviniente;
    @XmlElementRef(name = "segundoApellidoInterviniente", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoInterviniente;
    @XmlElement(required = true)
    protected String rol;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionInterviniente() {
        return tipoIdentificacionInterviniente;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionInterviniente(String value) {
        this.tipoIdentificacionInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionInterviniente() {
        return identificacionInterviniente;
    }

    /**
     * Define el valor de la propiedad identificacionInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionInterviniente(String value) {
        this.identificacionInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombreInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreInterviniente() {
        return primerNombreInterviniente;
    }

    /**
     * Define el valor de la propiedad primerNombreInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreInterviniente(String value) {
        this.primerNombreInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombreInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNombreInterviniente() {
        return segundoNombreInterviniente;
    }

    /**
     * Define el valor de la propiedad segundoNombreInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNombreInterviniente(JAXBElement<String> value) {
        this.segundoNombreInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoInterviniente() {
        return primerApellidoInterviniente;
    }

    /**
     * Define el valor de la propiedad primerApellidoInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoInterviniente(String value) {
        this.primerApellidoInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellidoInterviniente() {
        return segundoApellidoInterviniente;
    }

    /**
     * Define el valor de la propiedad segundoApellidoInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellidoInterviniente(JAXBElement<String> value) {
        this.segundoApellidoInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

}
