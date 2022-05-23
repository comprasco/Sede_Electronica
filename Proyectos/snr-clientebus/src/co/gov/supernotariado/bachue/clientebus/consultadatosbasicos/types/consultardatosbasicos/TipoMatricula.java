package co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoMatricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoMatricula">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numMatriculaInmobiliaria">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCirculoRegistral">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomCirculoRegistral">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numPredial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoNUPRE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUPRE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="direccionPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codDepartamento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomDepartamento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codMunicipio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomMunicipio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="propietarios" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoPropietario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMatricula", propOrder = {
    "estadoMatricula",
    "numMatriculaInmobiliaria",
    "codCirculoRegistral",
    "nomCirculoRegistral",
    "numPredial",
    "estadoNUPRE",
    "nupre",
    "direccionPredio",
    "codDepartamento",
    "nomDepartamento",
    "codMunicipio",
    "nomMunicipio",
    "tipoPredio",
    "propietarios"
})
public class TipoMatricula {

    protected int estadoMatricula;
    @XmlElement(required = true)
    protected String numMatriculaInmobiliaria;
    @XmlElement(required = true)
    protected String codCirculoRegistral;
    @XmlElement(required = true)
    protected String nomCirculoRegistral;
    @XmlElement(required = true)
    protected String numPredial;
    @XmlElement(required = true)
    protected String estadoNUPRE;
    @XmlElement(name = "NUPRE", required = true)
    protected String nupre;
    @XmlElement(required = true)
    protected String direccionPredio;
    @XmlElement(required = true)
    protected String codDepartamento;
    @XmlElement(required = true)
    protected String nomDepartamento;
    @XmlElement(required = true)
    protected String codMunicipio;
    @XmlElement(required = true)
    protected String nomMunicipio;
    @XmlElement(required = true)
    protected String tipoPredio;
    protected List<TipoPropietario> propietarios;

    /**
     * Obtiene el valor de la propiedad estadoMatricula.
     * 
     */
    public int getEstadoMatricula() {
        return estadoMatricula;
    }

    /**
     * Define el valor de la propiedad estadoMatricula.
     * 
     */
    public void setEstadoMatricula(int value) {
        this.estadoMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad numMatriculaInmobiliaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumMatriculaInmobiliaria() {
        return numMatriculaInmobiliaria;
    }

    /**
     * Define el valor de la propiedad numMatriculaInmobiliaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumMatriculaInmobiliaria(String value) {
        this.numMatriculaInmobiliaria = value;
    }

    /**
     * Obtiene el valor de la propiedad codCirculoRegistral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCirculoRegistral() {
        return codCirculoRegistral;
    }

    /**
     * Define el valor de la propiedad codCirculoRegistral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCirculoRegistral(String value) {
        this.codCirculoRegistral = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCirculoRegistral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCirculoRegistral() {
        return nomCirculoRegistral;
    }

    /**
     * Define el valor de la propiedad nomCirculoRegistral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCirculoRegistral(String value) {
        this.nomCirculoRegistral = value;
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
     * Obtiene el valor de la propiedad estadoNUPRE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNUPRE() {
        return estadoNUPRE;
    }

    /**
     * Define el valor de la propiedad estadoNUPRE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNUPRE(String value) {
        this.estadoNUPRE = value;
    }

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
     * Obtiene el valor de la propiedad codDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDepartamento() {
        return codDepartamento;
    }

    /**
     * Define el valor de la propiedad codDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDepartamento(String value) {
        this.codDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDepartamento() {
        return nomDepartamento;
    }

    /**
     * Define el valor de la propiedad nomDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDepartamento(String value) {
        this.nomDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Define el valor de la propiedad codMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMunicipio(String value) {
        this.codMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad nomMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMunicipio() {
        return nomMunicipio;
    }

    /**
     * Define el valor de la propiedad nomMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMunicipio(String value) {
        this.nomMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPredio() {
        return tipoPredio;
    }

    /**
     * Define el valor de la propiedad tipoPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPredio(String value) {
        this.tipoPredio = value;
    }

    /**
     * Gets the value of the propietarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propietarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropietarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPropietario }
     * 
     * 
     */
    public List<TipoPropietario> getPropietarios() {
        if (propietarios == null) {
            propietarios = new ArrayList<>();
        }
        return this.propietarios;
    }

}
