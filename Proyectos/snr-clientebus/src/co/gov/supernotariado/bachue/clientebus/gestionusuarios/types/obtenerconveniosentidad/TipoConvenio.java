
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoConvenio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoConvenio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinalizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConvenio", propOrder = {
    "codigoConvenio",
    "descripcionConvenio",
    "fechaInicio",
    "fechaFinalizacion"
})
public class TipoConvenio {

    @XmlElement(required = true)
    protected String codigoConvenio;
    @XmlElement(required = true)
    protected String descripcionConvenio;
    @XmlElement(required = true)
    protected String fechaInicio;
    @XmlElement(required = true)
    protected String fechaFinalizacion;

    /**
     * Obtiene el valor de la propiedad codigoConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    /**
     * Define el valor de la propiedad codigoConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConvenio(String value) {
        this.codigoConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionConvenio() {
        return descripcionConvenio;
    }

    /**
     * Define el valor de la propiedad descripcionConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionConvenio(String value) {
        this.descripcionConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    /**
     * Define el valor de la propiedad fechaFinalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalizacion(String value) {
        this.fechaFinalizacion = value;
    }

}
