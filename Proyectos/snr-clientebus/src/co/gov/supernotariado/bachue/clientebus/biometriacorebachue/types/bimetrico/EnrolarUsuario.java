
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enrolarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enrolarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaHuella" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}huellaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrolarUsuario", propOrder = {
    "entradaHuella"
})
public class EnrolarUsuario {

    @XmlElement(nillable = true)
    protected List<HuellaDTO> entradaHuella;

    /**
     * Gets the value of the entradaHuella property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entradaHuella property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntradaHuella().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HuellaDTO }
     * 
     * 
     */
    public List<HuellaDTO> getEntradaHuella() {
        if (entradaHuella == null) {
            entradaHuella = new ArrayList<HuellaDTO>();
        }
        return this.entradaHuella;
    }

}
