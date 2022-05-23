
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarMapaPredioInfoCatastral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarMapaPredioInfoCatastral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCatastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarMapaPredioInfoCatastral", propOrder = {
    "numeroCatastral"
})
public class TipoEntradaConsultarMapaPredioInfoCatastral {

    @XmlElement(required = true)
    protected String numeroCatastral;

    /**
     * Obtiene el valor de la propiedad numeroCatastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCatastral() {
        return numeroCatastral;
    }

    /**
     * Define el valor de la propiedad numeroCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCatastral(String value) {
        this.numeroCatastral = value;
    }

}
