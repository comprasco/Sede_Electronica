
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoUsuarioCSI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoUsuarioCSI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDocUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoUsuarioCSI", propOrder = {
    "tipoDocUsuario",
    "numDocUsuario"
})
public class TipoUsuarioCSI {

    @XmlElement(required = true)
    protected String tipoDocUsuario;
    @XmlElement(required = true)
    protected String numDocUsuario;

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

}
