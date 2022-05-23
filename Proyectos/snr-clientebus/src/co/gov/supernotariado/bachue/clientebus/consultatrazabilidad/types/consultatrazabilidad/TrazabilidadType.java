
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para trazabilidadType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trazabilidadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etapa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEtapa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoActividad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaAsignacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaReparto" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaInicioEtapa" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaFinalEtapa" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trazabilidadType", propOrder = {
    "etapa",
    "nombreEtapa",
    "estadoActividad",
    "usuario",
    "fechaAsignacion",
    "fechaReparto",
    "fechaInicioEtapa",
    "fechaFinalEtapa"
})
public class TrazabilidadType {

    @XmlElement(required = true)
    protected String etapa;
    @XmlElement(required = true)
    protected String nombreEtapa;
    @XmlElement(required = true)
    protected String estadoActividad;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAsignacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReparto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioEtapa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinalEtapa;

    /**
     * Obtiene el valor de la propiedad etapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Define el valor de la propiedad etapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapa(String value) {
        this.etapa = value;
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
     * Obtiene el valor de la propiedad estadoActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoActividad() {
        return estadoActividad;
    }

    /**
     * Define el valor de la propiedad estadoActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoActividad(String value) {
        this.estadoActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAsignacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Define el valor de la propiedad fechaAsignacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAsignacion(XMLGregorianCalendar value) {
        this.fechaAsignacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReparto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReparto() {
        return fechaReparto;
    }

    /**
     * Define el valor de la propiedad fechaReparto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReparto(XMLGregorianCalendar value) {
        this.fechaReparto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioEtapa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioEtapa() {
        return fechaInicioEtapa;
    }

    /**
     * Define el valor de la propiedad fechaInicioEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioEtapa(XMLGregorianCalendar value) {
        this.fechaInicioEtapa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinalEtapa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinalEtapa() {
        return fechaFinalEtapa;
    }

    /**
     * Define el valor de la propiedad fechaFinalEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinalEtapa(XMLGregorianCalendar value) {
        this.fechaFinalEtapa = value;
    }

}
