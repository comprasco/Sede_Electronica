
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoAdminIUI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoAdminIUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocAdmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDocAdmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAdminIUI", propOrder = {
    "tipoDocAdmin",
    "numDocAdmin"
})
public class TipoAdminIUI {

    @XmlElement(required = true)
    protected String tipoDocAdmin;
    @XmlElement(required = true)
    protected String numDocAdmin;

    /**
     * Obtiene el valor de la propiedad tipoDocAdmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocAdmin() {
        return tipoDocAdmin;
    }

    /**
     * Define el valor de la propiedad tipoDocAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocAdmin(String value) {
        this.tipoDocAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocAdmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocAdmin() {
        return numDocAdmin;
    }

    /**
     * Define el valor de la propiedad numDocAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocAdmin(String value) {
        this.numDocAdmin = value;
    }

}
