
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarClave complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarClave">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaClave" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}claveDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarClave", propOrder = {
    "entradaClave"
})
public class VerificarClave {

    protected ClaveDTO entradaClave;

    /**
     * Obtiene el valor de la propiedad entradaClave.
     * 
     * @return
     *     possible object is
     *     {@link ClaveDTO }
     *     
     */
    public ClaveDTO getEntradaClave() {
        return entradaClave;
    }

    /**
     * Define el valor de la propiedad entradaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveDTO }
     *     
     */
    public void setEntradaClave(ClaveDTO value) {
        this.entradaClave = value;
    }

}
