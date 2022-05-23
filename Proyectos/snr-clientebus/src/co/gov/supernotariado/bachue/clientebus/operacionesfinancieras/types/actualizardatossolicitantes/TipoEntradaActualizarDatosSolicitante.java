package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.actualizardatossolicitantes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaActualizarDatosSolicitante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaActualizarDatosSolicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDocSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primerNombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellidoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaActualizarDatosSolicitante", propOrder = {
    "numeroReferencia",
    "tipoDocSolicitante",
    "numeroDocSolicitante",
    "primerNombreSolicitante",
    "segundoNombreSolicitante",
    "primerApellidoSolicitante",
    "segundoApellidoSolicitante",
    "razonSocial"
})
public class TipoEntradaActualizarDatosSolicitante {

    @XmlElement(required = true)
    protected String numeroReferencia;
    @XmlElement(required = true)
    protected String tipoDocSolicitante;
    @XmlElement(required = true)
    protected String numeroDocSolicitante;
    @XmlElementRef(name = "primerNombreSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerNombreSolicitante;
    @XmlElementRef(name = "segundoNombreSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombreSolicitante;
    @XmlElementRef(name = "primerApellidoSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellidoSolicitante;
    @XmlElementRef(name = "segundoApellidoSolicitante", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoSolicitante;
    @XmlElementRef(name = "razonSocial", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razonSocial;

    /**
     * Obtiene el valor de la propiedad numeroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Define el valor de la propiedad numeroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferencia(String value) {
        this.numeroReferencia = value;
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

}
