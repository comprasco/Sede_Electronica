
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaUsuario" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}usuarioDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearUsuario", propOrder = {
    "entradaUsuario"
})
public class CrearUsuario {

    protected UsuarioDTO entradaUsuario;

    /**
     * Obtiene el valor de la propiedad entradaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioDTO }
     *     
     */
    public UsuarioDTO getEntradaUsuario() {
        return entradaUsuario;
    }

    /**
     * Define el valor de la propiedad entradaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioDTO }
     *     
     */
    public void setEntradaUsuario(UsuarioDTO value) {
        this.entradaUsuario = value;
    }

}
