
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarMatriculaInfoCatastral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarMatriculaInfoCatastral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUPRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarMatriculaInfoCatastral", propOrder = {
    "nupre",
    "numPredial",
    "chip"
})
public class TipoEntradaConsultarMatriculaInfoCatastral {

    @XmlElement(name = "NUPRE")
    protected String nupre;
    protected String numPredial;
    @XmlElement(name = "CHIP")
    protected String chip;

    /**
     * Obtiene el valor de la propiedad nupre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUPRE() {
        return nupre;
    }

    /**
     * Define el valor de la propiedad nupre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUPRE(String value) {
        this.nupre = value;
    }

    /**
     * Obtiene el valor de la propiedad numPredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPredial() {
        return numPredial;
    }

    /**
     * Define el valor de la propiedad numPredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPredial(String value) {
        this.numPredial = value;
    }

    /**
     * Obtiene el valor de la propiedad chip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIP() {
        return chip;
    }

    /**
     * Define el valor de la propiedad chip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIP(String value) {
        this.chip = value;
    }

}
