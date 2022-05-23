
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEstadoTramite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEstadoTramite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEstado">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaInicioEtapa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pasoPorEstado">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "tipoEstadoTramite", propOrder = {
    "codigoEstado",
    "fechaInicioEtapa",
    "pasoPorEstado"
})
public class TipoEstadoTramite {

    @XmlElement(required = true)
    protected String codigoEstado;
    @XmlElement(required = true)
    protected String fechaInicioEtapa;
    protected boolean pasoPorEstado;

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstado(String value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioEtapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioEtapa() {
        return fechaInicioEtapa;
    }

    /**
     * Define el valor de la propiedad fechaInicioEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioEtapa(String value) {
        this.fechaInicioEtapa = value;
    }

    /**
     * Obtiene el valor de la propiedad pasoPorEstado.
     * 
     */
    public boolean isPasoPorEstado() {
        return pasoPorEstado;
    }

    /**
     * Define el valor de la propiedad pasoPorEstado.
     * 
     */
    public void setPasoPorEstado(boolean value) {
        this.pasoPorEstado = value;
    }

}
