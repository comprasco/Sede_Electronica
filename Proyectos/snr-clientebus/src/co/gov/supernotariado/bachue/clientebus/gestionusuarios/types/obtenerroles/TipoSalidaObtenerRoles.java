
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerroles;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaObtenerRoles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaObtenerRoles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rol" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1}rolTypeOR" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "tipoSalidaObtenerRoles", propOrder = {
    "roles",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaObtenerRoles {

    @XmlElement(required = true)
    protected TipoSalidaObtenerRoles.Roles roles;
    @XmlElement(required = true)
    protected BigInteger codigoMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad roles.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaObtenerRoles.Roles }
     *     
     */
    public TipoSalidaObtenerRoles.Roles getRoles() {
        return roles;
    }

    /**
     * Define el valor de la propiedad roles.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaObtenerRoles.Roles }
     *     
     */
    public void setRoles(TipoSalidaObtenerRoles.Roles value) {
        this.roles = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoMensaje(BigInteger value) {
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rol" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1}rolTypeOR" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rol"
    })
    public static class Roles {

        @XmlElement(required = true)
        protected List<RolTypeOR> rol;

        /**
         * Gets the value of the rol property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rol property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRol().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RolTypeOR }
         * 
         * 
         */
        public List<RolTypeOR> getRol() {
            if (rol == null) {
                rol = new ArrayList<RolTypeOR>();
            }
            return this.rol;
        }

    }

}
