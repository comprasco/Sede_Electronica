package co.gov.supernotariado.bachue.clientebus.poderes.types.obtenerPoder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaObtenerPoder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaObtenerPoder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDocName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaObtenerPoder", propOrder = {
    "dDocName",
    "did"
})
public class TipoEntradaObtenerPoder {

    @XmlElement(required = true)
    protected String dDocName;
    @XmlElement(name = "dID", required = true)
    protected String did;

    /**
     * Obtiene el valor de la propiedad dDocName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDocName() {
        return dDocName;
    }

    /**
     * Define el valor de la propiedad dDocName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDocName(String value) {
        this.dDocName = value;
    }

    /**
     * Obtiene el valor de la propiedad did.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID() {
        return did;
    }

    /**
     * Define el valor de la propiedad did.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID(String value) {
        this.did = value;
    }

}
