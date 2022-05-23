
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para constante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="constante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caracter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idConstante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constante", propOrder = {
    "caracter",
    "idConstante"
})
public class Constante {

    protected String caracter;
    protected String idConstante;

    /**
     * Obtiene el valor de la propiedad caracter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracter() {
        return caracter;
    }

    /**
     * Define el valor de la propiedad caracter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracter(String value) {
        this.caracter = value;
    }

    /**
     * Obtiene el valor de la propiedad idConstante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConstante() {
        return idConstante;
    }

    /**
     * Define el valor de la propiedad idConstante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConstante(String value) {
        this.idConstante = value;
    }

}
