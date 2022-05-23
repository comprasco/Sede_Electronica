
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para constantesSalidaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="constantesSalidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}baseSalidaDTO">
 *       &lt;sequence>
 *         &lt;element name="constante" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}constante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constantesSalidaDTO", propOrder = {
    "constante"
})
public class ConstantesSalidaDTO
    extends BaseSalidaDTO
{

    protected List<Constante> constante;

    /**
     * Gets the value of the constante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constante }
     * 
     * 
     */
    public List<Constante> getConstante() {
        if (constante == null) {
            constante = new ArrayList<Constante>();
        }
        return this.constante;
    }

}
