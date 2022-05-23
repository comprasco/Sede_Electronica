package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alertasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alertasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerta" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1}alertaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertasType", propOrder = {
    "alerta"
})
public class AlertasType {

    protected List<AlertaType> alerta;

    /**
     * Gets the value of the alerta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertaType }
     * 
     * 
     */
    public List<AlertaType> getAlerta() {
        if (alerta == null) {
            alerta = new ArrayList<>();
        }
        return this.alerta;
    }

}
