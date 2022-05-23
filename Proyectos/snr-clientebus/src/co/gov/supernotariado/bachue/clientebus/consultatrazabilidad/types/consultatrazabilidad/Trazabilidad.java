
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trazabilidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trazabilidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trazabilidad" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1}trazabilidadType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trazabilidad", propOrder = {
    "trazabilidad"
})
public class Trazabilidad {

    protected List<TrazabilidadType> trazabilidad;

    /**
     * Gets the value of the trazabilidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trazabilidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrazabilidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrazabilidadType }
     * 
     * 
     */
    public List<TrazabilidadType> getTrazabilidad() {
        if (trazabilidad == null) {
            trazabilidad = new ArrayList<TrazabilidadType>();
        }
        return this.trazabilidad;
    }

}
