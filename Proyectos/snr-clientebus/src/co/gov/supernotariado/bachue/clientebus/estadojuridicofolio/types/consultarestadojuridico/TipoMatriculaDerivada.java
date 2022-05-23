package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoMatriculaDerivada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoMatriculaDerivada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="direccionPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NIR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="radicacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anotacionRelacionada">
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
@XmlType(name = "tipoMatriculaDerivada", propOrder = {
    "numMatriculaInmobiliaria",
    "codCirculoRegistral",
    "direccionPredio",
    "nir",
    "radicacion",
    "anotacionRelacionada"
})
public class TipoMatriculaDerivada {

    @XmlElement(required = true)
    protected String numMatriculaInmobiliaria;
    @XmlElement(required = true)
    protected String codCirculoRegistral;
    @XmlElement(required = true)
    protected String direccionPredio;
    @XmlElement(name = "NIR", required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String radicacion;
    @XmlElement(required = true)
    protected String anotacionRelacionada;

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
     * Obtiene el valor de la propiedad nir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIR() {
        return nir;
    }

    /**
     * Define el valor de la propiedad nir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIR(String value) {
        this.nir = value;
    }

    /**
     * Obtiene el valor de la propiedad radicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacion() {
        return radicacion;
    }

    /**
     * Define el valor de la propiedad radicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacion(String value) {
        this.radicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad anotacionRelacionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacionRelacionada() {
        return anotacionRelacionada;
    }

    /**
     * Define el valor de la propiedad anotacionRelacionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacionRelacionada(String value) {
        this.anotacionRelacionada = value;
    }

}
