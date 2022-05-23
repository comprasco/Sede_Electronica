
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Mensaje de Entrada de
 * 				la consulta estado tramite trazabilidad registro en Nodo Central
 * 			
 * 
 * <p>Clase Java para tipoEntradaTrazabilidadTramiteRegistroNodoCentral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaTrazabilidadTramiteRegistroNodoCentral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCirculoRegisral">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="radicacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "tipoEntradaTrazabilidadTramiteRegistroNodoCentral", propOrder = {
    "codCirculoRegisral",
    "radicacion"
})
public class TipoEntradaTrazabilidadTramiteRegistroNodoCentral {

    @XmlElement(required = true)
    protected String codCirculoRegisral;
    @XmlElement(required = true)
    protected String radicacion;

    /**
     * Obtiene el valor de la propiedad codCirculoRegisral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCirculoRegisral() {
        return codCirculoRegisral;
    }

    /**
     * Define el valor de la propiedad codCirculoRegisral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCirculoRegisral(String value) {
        this.codCirculoRegisral = value;
    }

    /**
     * Obtiene el valor de la propiedad radicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacion() {
        return radicacion;
    }

    /**
     * Define el valor de la propiedad radicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacion(String value) {
        this.radicacion = value;
    }

}
