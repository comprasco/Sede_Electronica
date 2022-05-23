package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tarifasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tarifasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarifa" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1}tarifaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifasType", propOrder = {
    "tarifa"
})
public class TarifasType {

    protected List<TarifaType> tarifa;

    /**
     * Gets the value of the tarifa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarifa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarifa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TarifaType }
     * 
     * 
     */
    public List<TarifaType> getTarifa() {
        if (tarifa == null) {
            tarifa = new ArrayList<>();
        }
        return this.tarifa;
    }

}
