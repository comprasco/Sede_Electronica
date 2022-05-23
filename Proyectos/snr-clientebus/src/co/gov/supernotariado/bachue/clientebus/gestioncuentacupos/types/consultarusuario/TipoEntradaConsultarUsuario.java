
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDCuentaCupo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="admin" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1}tipoAdminCUI"/>
 *         &lt;element name="usuario" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1}tipoUsuarioCUI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarUsuario", propOrder = {
    "modulo",
    "idCuentaCupo",
    "admin",
    "usuario"
})
public class TipoEntradaConsultarUsuario {

    @XmlElement(required = true)
    protected String modulo;
    @XmlElement(name = "IDCuentaCupo", required = true)
    protected String idCuentaCupo;
    @XmlElement(required = true)
    protected TipoAdminCUI admin;
    @XmlElement(required = true)
    protected TipoUsuarioCUI usuario;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad idCuentaCupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCuentaCupo() {
        return idCuentaCupo;
    }

    /**
     * Define el valor de la propiedad idCuentaCupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCuentaCupo(String value) {
        this.idCuentaCupo = value;
    }

    /**
     * Obtiene el valor de la propiedad admin.
     * 
     * @return
     *     possible object is
     *     {@link TipoAdminCUI }
     *     
     */
    public TipoAdminCUI getAdmin() {
        return admin;
    }

    /**
     * Define el valor de la propiedad admin.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAdminCUI }
     *     
     */
    public void setAdmin(TipoAdminCUI value) {
        this.admin = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuarioCUI }
     *     
     */
    public TipoUsuarioCUI getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuarioCUI }
     *     
     */
    public void setUsuario(TipoUsuarioCUI value) {
        this.usuario = value;
    }

}
