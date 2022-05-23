
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para borrarHuellas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="borrarHuellas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaUsuario" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}borrarHuellasDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrarHuellas", propOrder = {
    "entradaUsuario"
})
public class BorrarHuellas {

    protected BorrarHuellasDTO entradaUsuario;

    /**
     * Obtiene el valor de la propiedad entradaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link BorrarHuellasDTO }
     *     
     */
    public BorrarHuellasDTO getEntradaUsuario() {
        return entradaUsuario;
    }

    /**
     * Define el valor de la propiedad entradaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrarHuellasDTO }
     *     
     */
    public void setEntradaUsuario(BorrarHuellasDTO value) {
        this.entradaUsuario = value;
    }

}
