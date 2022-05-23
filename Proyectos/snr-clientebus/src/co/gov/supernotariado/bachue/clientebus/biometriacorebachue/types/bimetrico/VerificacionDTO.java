
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificacionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posicion" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}dedosEnum" minOccurs="0"/>
 *         &lt;element name="sesion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "verificacionDTO", propOrder = {
    "idUsuario",
    "posicion",
    "sesion",
    "imagenHuella"
})
public class VerificacionDTO
    extends BaseDTO
{

    @XmlElement(required = true)
    protected String idUsuario;
    @XmlSchemaType(name = "string")
    protected DedosEnum posicion;
    @XmlElement(required = true)
    protected String sesion;
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
     * Obtiene el valor de la propiedad sesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesion() {
        return sesion;
    }

    /**
     * Define el valor de la propiedad sesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesion(String value) {
        this.sesion = value;
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
