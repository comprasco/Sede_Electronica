
package co.gov.supernotariado.bachue.clientebus.types.obtenerrolesusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaObtenerRolesUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaObtenerRolesUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="componente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaObtenerRolesUsuario", propOrder = {
    "loginUsuario",
    "componente"
})
public class TipoEntradaObtenerRolesUsuario {

    @XmlElement(required = true)
    protected String loginUsuario;
    @XmlElement(required = true)
    protected String componente;

    /**
     * Obtiene el valor de la propiedad loginUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Define el valor de la propiedad loginUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsuario(String value) {
        this.loginUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad componente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponente() {
        return componente;
    }

    /**
     * Define el valor de la propiedad componente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponente(String value) {
        this.componente = value;
    }

}
