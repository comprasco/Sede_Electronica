
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoUsuarioCNUI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoUsuarioCNUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDocUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="segundoApellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoElectronicoCorporativoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoUsuarioCNUI", propOrder = {
    "tipoDocUsuario",
    "numDocUsuario",
    "primerNombreUsuario",
    "segundoNombreUsuario",
    "primerApellidoUsuario",
    "segundoApellidoUsuario",
    "correoElectronicoCorporativoUsuario"
})
public class TipoUsuarioCNUI {

    @XmlElement(required = true)
    protected String tipoDocUsuario;
    @XmlElement(required = true)
    protected String numDocUsuario;
    @XmlElement(required = true)
    protected String primerNombreUsuario;
    @XmlElementRef(name = "segundoNombreUsuario", namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombreUsuario;
    @XmlElement(required = true)
    protected String primerApellidoUsuario;
    @XmlElementRef(name = "segundoApellidoUsuario", namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoUsuario;
    @XmlElement(required = true)
    protected String correoElectronicoCorporativoUsuario;

    /**
     * Obtiene el valor de la propiedad tipoDocUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocUsuario() {
        return tipoDocUsuario;
    }

    /**
     * Define el valor de la propiedad tipoDocUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocUsuario(String value) {
        this.tipoDocUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocUsuario() {
        return numDocUsuario;
    }

    /**
     * Define el valor de la propiedad numDocUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocUsuario(String value) {
        this.numDocUsuario = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNombreUsuario() {
        return segundoNombreUsuario;
    }

    /**
     * Define el valor de la propiedad segundoNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNombreUsuario(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellidoUsuario() {
        return segundoApellidoUsuario;
    }

    /**
     * Define el valor de la propiedad segundoApellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellidoUsuario(JAXBElement<String> value) {
        this.segundoApellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronicoCorporativoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronicoCorporativoUsuario() {
        return correoElectronicoCorporativoUsuario;
    }

    /**
     * Define el valor de la propiedad correoElectronicoCorporativoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronicoCorporativoUsuario(String value) {
        this.correoElectronicoCorporativoUsuario = value;
    }

}
