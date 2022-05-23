
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaGenerarSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaGenerarSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoEstadoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionEstadoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeAlSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="200"/>
 *               &lt;enumeration value="404"/>
 *               &lt;enumeration value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "tipoSalidaGenerarSolicitud", propOrder = {
    "nir",
    "codigoEstadoSolicitud",
    "descripcionEstadoSolicitud",
    "mensajeAlSolicitante",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaGenerarSolicitud {

    @XmlElement(name = "NIR", required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String codigoEstadoSolicitud;
    @XmlElement(required = true)
    protected String descripcionEstadoSolicitud;
    @XmlElement(required = true)
    protected String mensajeAlSolicitante;
    @XmlElement(required = true)
    protected String codigoMensaje;
    protected String descripcionMensaje;

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
     * Obtiene el valor de la propiedad codigoEstadoSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoSolicitud() {
        return codigoEstadoSolicitud;
    }

    /**
     * Define el valor de la propiedad codigoEstadoSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoSolicitud(String value) {
        this.codigoEstadoSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoSolicitud() {
        return descripcionEstadoSolicitud;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoSolicitud(String value) {
        this.descripcionEstadoSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeAlSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeAlSolicitante() {
        return mensajeAlSolicitante;
    }

    /**
     * Define el valor de la propiedad mensajeAlSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeAlSolicitante(String value) {
        this.mensajeAlSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

}
