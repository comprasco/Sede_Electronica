
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerusuariosrolorip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaObtenerUsuariosRolOrip complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaObtenerUsuariosRolOrip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCirculo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoRol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaObtenerUsuariosRolOrip", propOrder = {
    "codigoCirculo",
    "codigoRol"
})
public class TipoEntradaObtenerUsuariosRolOrip {

    @XmlElement(required = true)
    protected String codigoCirculo;
    @XmlElement(required = true)
    protected String codigoRol;

    /**
     * Obtiene el valor de la propiedad codigoCirculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCirculo() {
        return codigoCirculo;
    }

    /**
     * Define el valor de la propiedad codigoCirculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCirculo(String value) {
        this.codigoCirculo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRol() {
        return codigoRol;
    }

    /**
     * Define el valor de la propiedad codigoRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRol(String value) {
        this.codigoRol = value;
    }

}
