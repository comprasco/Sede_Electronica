
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoSalidaConsultarEstadoSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarEstadoSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idEtapa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEtapa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idMotivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionMotivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "tipoSalidaConsultarEstadoSolicitud", propOrder = {
    "nir",
    "idEtapa",
    "nombreEtapa",
    "idMotivo",
    "descripcionMotivo",
    "estado",
    "fechaFin",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarEstadoSolicitud {

    @XmlElement(name = "NIR", required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String idEtapa;
    @XmlElement(required = true)
    protected String nombreEtapa;
    @XmlElement(required = true)
    protected String idMotivo;
    @XmlElement(required = true)
    protected String descripcionMotivo;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
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
     * Obtiene el valor de la propiedad idEtapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEtapa() {
        return idEtapa;
    }

    /**
     * Define el valor de la propiedad idEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEtapa(String value) {
        this.idEtapa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEtapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEtapa() {
        return nombreEtapa;
    }

    /**
     * Define el valor de la propiedad nombreEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEtapa(String value) {
        this.nombreEtapa = value;
    }

    /**
     * Obtiene el valor de la propiedad idMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMotivo() {
        return idMotivo;
    }

    /**
     * Define el valor de la propiedad idMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMotivo(String value) {
        this.idMotivo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMotivo() {
        return descripcionMotivo;
    }

    /**
     * Define el valor de la propiedad descripcionMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMotivo(String value) {
        this.descripcionMotivo = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
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
