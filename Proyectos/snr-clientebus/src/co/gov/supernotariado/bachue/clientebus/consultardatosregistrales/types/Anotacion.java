package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoAnotacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumentoAnotacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actoJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="drr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intervinientes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}interviniente" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "consecutivoAnotacion",
    "tipoDocumentoAnotacion",
    "actoJuridico",
    "drr",
    "valorActo",
    "fechaAnotacion",
    "intervinientes"
})
@XmlRootElement(name = "anotacion")
public class Anotacion {

    @XmlElement(required = true)
    protected String consecutivoAnotacion;
    @XmlElement(required = true)
    protected String tipoDocumentoAnotacion;
    @XmlElement(required = true)
    protected String actoJuridico;
    @XmlElement(required = true)
    protected String drr;
    @XmlElement(required = true)
    protected String valorActo;
    @XmlElement(required = true)
    protected String fechaAnotacion;
    @XmlElement(required = true)
    protected Anotacion.Intervinientes intervinientes;

    /**
     * Obtiene el valor de la propiedad consecutivoAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoAnotacion() {
        return consecutivoAnotacion;
    }

    /**
     * Define el valor de la propiedad consecutivoAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoAnotacion(String value) {
        this.consecutivoAnotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoAnotacion() {
        return tipoDocumentoAnotacion;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoAnotacion(String value) {
        this.tipoDocumentoAnotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad actoJuridico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActoJuridico() {
        return actoJuridico;
    }

    /**
     * Define el valor de la propiedad actoJuridico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActoJuridico(String value) {
        this.actoJuridico = value;
    }

    /**
     * Obtiene el valor de la propiedad drr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrr() {
        return drr;
    }

    /**
     * Define el valor de la propiedad drr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrr(String value) {
        this.drr = value;
    }

    /**
     * Obtiene el valor de la propiedad valorActo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorActo() {
        return valorActo;
    }

    /**
     * Define el valor de la propiedad valorActo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorActo(String value) {
        this.valorActo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAnotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAnotacion() {
        return fechaAnotacion;
    }

    /**
     * Define el valor de la propiedad fechaAnotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAnotacion(String value) {
        this.fechaAnotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad intervinientes.
     * 
     * @return
     *     possible object is
     *     {@link Anotacion.Intervinientes }
     *     
     */
    public Anotacion.Intervinientes getIntervinientes() {
        return intervinientes;
    }

    /**
     * Define el valor de la propiedad intervinientes.
     * 
     * @param value
     *     allowed object is
     *     {@link Anotacion.Intervinientes }
     *     
     */
    public void setIntervinientes(Anotacion.Intervinientes value) {
        this.intervinientes = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}interviniente" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interviniente"
    })
    public static class Intervinientes {

        @XmlElement(required = true)
        protected List<Interviniente> interviniente;

        /**
         * Gets the value of the interviniente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interviniente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterviniente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Interviniente }
         * 
         * 
         */
        public List<Interviniente> getInterviniente() {
            if (interviniente == null) {
                interviniente = new ArrayList<>();
            }
            return this.interviniente;
        }

    }

}
