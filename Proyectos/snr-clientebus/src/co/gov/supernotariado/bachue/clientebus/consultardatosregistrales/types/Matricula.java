package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoOrip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreOrip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoNupre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nupre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccionPredio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titulares">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}titular" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="anotaciones">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}anotacion" maxOccurs="unbounded"/>
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
    "numero",
    "matricula",
    "codigoOrip",
    "nombreOrip",
    "chip",
    "estadoNupre",
    "nupre",
    "cedulaCatastral",
    "direccionPredio",
    "departamento",
    "municipio",
    "grupo",
    "titulares",
    "anotaciones"
})
@XmlRootElement(name = "matricula")
public class Matricula {

    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String codigoOrip;
    @XmlElement(required = true)
    protected String nombreOrip;
    @XmlElementRef(name = "chip", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chip;
    @XmlElementRef(name = "estadoNupre", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoNupre;
    @XmlElementRef(name = "nupre", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nupre;
    @XmlElement(required = true)
    protected String cedulaCatastral;
    @XmlElement(required = true)
    protected String direccionPredio;
    @XmlElement(required = true)
    protected String departamento;
    @XmlElement(required = true)
    protected String municipio;
    @XmlElement(required = true)
    protected String grupo;
    @XmlElement(required = true)
    protected Matricula.Titulares titulares;
    @XmlElement(required = true)
    protected Matricula.Anotaciones anotaciones;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrip() {
        return codigoOrip;
    }

    /**
     * Define el valor de la propiedad codigoOrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrip(String value) {
        this.codigoOrip = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOrip() {
        return nombreOrip;
    }

    /**
     * Define el valor de la propiedad nombreOrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOrip(String value) {
        this.nombreOrip = value;
    }

    /**
     * Obtiene el valor de la propiedad chip.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChip() {
        return chip;
    }

    /**
     * Define el valor de la propiedad chip.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChip(JAXBElement<String> value) {
        this.chip = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNupre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoNupre() {
        return estadoNupre;
    }

    /**
     * Define el valor de la propiedad estadoNupre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoNupre(JAXBElement<String> value) {
        this.estadoNupre = value;
    }

    /**
     * Obtiene el valor de la propiedad nupre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNupre() {
        return nupre;
    }

    /**
     * Define el valor de la propiedad nupre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNupre(JAXBElement<String> value) {
        this.nupre = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaCatastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    /**
     * Define el valor de la propiedad cedulaCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastral(String value) {
        this.cedulaCatastral = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionPredio() {
        return direccionPredio;
    }

    /**
     * Define el valor de la propiedad direccionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionPredio(String value) {
        this.direccionPredio = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad titulares.
     * 
     * @return
     *     possible object is
     *     {@link Matricula.Titulares }
     *     
     */
    public Matricula.Titulares getTitulares() {
        return titulares;
    }

    /**
     * Define el valor de la propiedad titulares.
     * 
     * @param value
     *     allowed object is
     *     {@link Matricula.Titulares }
     *     
     */
    public void setTitulares(Matricula.Titulares value) {
        this.titulares = value;
    }

    /**
     * Obtiene el valor de la propiedad anotaciones.
     * 
     * @return
     *     possible object is
     *     {@link Matricula.Anotaciones }
     *     
     */
    public Matricula.Anotaciones getAnotaciones() {
        return anotaciones;
    }

    /**
     * Define el valor de la propiedad anotaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Matricula.Anotaciones }
     *     
     */
    public void setAnotaciones(Matricula.Anotaciones value) {
        this.anotaciones = value;
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
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}anotacion" maxOccurs="unbounded"/>
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
        "anotacion"
    })
    public static class Anotaciones {

        @XmlElement(required = true)
        protected List<Anotacion> anotacion;

        /**
         * Gets the value of the anotacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anotacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnotacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Anotacion }
         * 
         * 
         */
        public List<Anotacion> getAnotacion() {
            if (anotacion == null) {
                anotacion = new ArrayList<>();
            }
            return this.anotacion;
        }

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
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}titular" maxOccurs="unbounded"/>
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
        "titular"
    })
    public static class Titulares {

        @XmlElement(required = true)
        protected List<Titular> titular;

        /**
         * Gets the value of the titular property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titular property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitular().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Titular }
         * 
         * 
         */
        public List<Titular> getTitular() {
            if (titular == null) {
                titular = new ArrayList<>();
            }
            return this.titular;
        }

    }

}
