
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaRegistrarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaRegistrarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
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
@XmlType(name = "tipoSalidaRegistrarUsuario", propOrder = {
    "codigoMensajeAndDescripcionMensaje"
})
public class TipoSalidaRegistrarUsuario {

    @XmlElements({
        @XmlElement(name = "codigoMensaje", type = BigInteger.class),
        @XmlElement(name = "descripcionMensaje", type = String.class)
    })
    protected List<Serializable> codigoMensajeAndDescripcionMensaje;

    /**
     * Gets the value of the codigoMensajeAndDescripcionMensaje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoMensajeAndDescripcionMensaje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoMensajeAndDescripcionMensaje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getCodigoMensajeAndDescripcionMensaje() {
        if (codigoMensajeAndDescripcionMensaje == null) {
            codigoMensajeAndDescripcionMensaje = new ArrayList<Serializable>();
        }
        return this.codigoMensajeAndDescripcionMensaje;
    }

}
