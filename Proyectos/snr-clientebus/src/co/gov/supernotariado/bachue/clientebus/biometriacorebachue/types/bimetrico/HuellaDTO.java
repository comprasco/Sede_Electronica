
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para huellaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="huellaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posicion" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}dedosEnum" minOccurs="0"/>
 *         &lt;element name="imagenHuella" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "huellaDTO", propOrder = {
    "idUsuario",
    "idUsuarioCreacion",
    "posicion",
    "imagenHuella"
})
public class HuellaDTO
    extends BaseDTO
{

    @XmlElement(required = true)
    protected String idUsuario;
    @XmlElement(required = true)
    protected String idUsuarioCreacion;
    @XmlSchemaType(name = "string")
    protected DedosEnum posicion;
    @XmlElement(required = true)
    protected String imagenHuella;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuarioCreacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuarioCreacion() {
        return idUsuarioCreacion;
    }

    /**
     * Define el valor de la propiedad idUsuarioCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuarioCreacion(String value) {
        this.idUsuarioCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad posicion.
     * 
     * @return
     *     possible object is
     *     {@link DedosEnum }
     *     
     */
    public DedosEnum getPosicion() {
        return posicion;
    }

    /**
     * Define el valor de la propiedad posicion.
     * 
     * @param value
     *     allowed object is
     *     {@link DedosEnum }
     *     
     */
    public void setPosicion(DedosEnum value) {
        this.posicion = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenHuella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenHuella() {
        return imagenHuella;
    }

    /**
     * Define el valor de la propiedad imagenHuella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenHuella(String value) {
        this.imagenHuella = value;
    }

}
