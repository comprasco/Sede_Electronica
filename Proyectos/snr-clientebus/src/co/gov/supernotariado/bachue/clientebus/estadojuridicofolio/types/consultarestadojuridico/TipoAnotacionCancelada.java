package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoAnotacionCancelada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoAnotacionCancelada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anotacionCancelada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAnotacionCancelada", propOrder = {
    "anotacionCancelada"
})
public class TipoAnotacionCancelada {

    @XmlElement(required = true)
    protected String anotacionCancelada;

    /**
     * Obtiene el valor de la propiedad anotacionCancelada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacionCancelada() {
        return anotacionCancelada;
    }

    /**
     * Define el valor de la propiedad anotacionCancelada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacionCancelada(String value) {
        this.anotacionCancelada = value;
    }

}
