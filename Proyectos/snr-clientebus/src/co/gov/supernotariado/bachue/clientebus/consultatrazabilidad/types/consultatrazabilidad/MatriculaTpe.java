
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para matriculaTpe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="matriculaTpe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alertaVigente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matriculaTpe", propOrder = {
    "orip",
    "numeroMatricula",
    "estado",
    "alertaVigente"
})
public class MatriculaTpe {

    @XmlElement(required = true)
    protected String orip;
    @XmlElement(required = true)
    protected String numeroMatricula;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String alertaVigente;

    /**
     * Obtiene el valor de la propiedad orip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrip() {
        return orip;
    }

    /**
     * Define el valor de la propiedad orip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrip(String value) {
        this.orip = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Define el valor de la propiedad numeroMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatricula(String value) {
        this.numeroMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad alertaVigente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertaVigente() {
        return alertaVigente;
    }

    /**
     * Define el valor de la propiedad alertaVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertaVigente(String value) {
        this.alertaVigente = value;
    }

}
