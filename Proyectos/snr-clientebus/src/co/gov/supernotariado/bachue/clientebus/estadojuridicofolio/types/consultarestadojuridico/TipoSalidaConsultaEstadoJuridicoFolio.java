
package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * El esquema define los
 * 				datos de salida para la operacion Consultar Estado Jur�dico
 * 			
 * 
 * <p>Clase Java para tipoSalidaConsultaEstadoJuridicoFolio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultaEstadoJuridicoFolio">
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
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomCirculoRegistral">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numPredial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numPredialAnterior">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUPRE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoNUPRE">
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
 *         &lt;element name="propietarios" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoPropietario" maxOccurs="unbounded"/>
 *         &lt;element name="anotaciones" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoAnotacion" maxOccurs="unbounded"/>
 *         &lt;element name="matriculasMatriz" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoMatriculaMatriz" maxOccurs="unbounded"/>
 *         &lt;element name="matriculasDerivadas" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoMatriculaDerivada" maxOccurs="unbounded"/>
 *         &lt;element name="medidasCautelares" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoMedidaCautelar" maxOccurs="unbounded"/>
 *         &lt;element name="codMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcionMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaHoraConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
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
@XmlType(name = "tipoSalidaConsultaEstadoJuridicoFolio", propOrder = {
    "numMatriculaInmobiliaria",
    "codCirculoRegistral",
    "nomCirculoRegistral",
    "numPredial",
    "numPredialAnterior",
    "nupre",
    "estadoNUPRE",
    "direccionPredio",
    "codDepartamento",
    "nomDepartamento",
    "codMunicipio",
    "nomMunicipio",
    "propietarios",
    "anotaciones",
    "matriculasMatriz",
    "matriculasDerivadas",
    "medidasCautelares",
    "codMensaje",
    "descripcionMensaje",
    "numeroConsulta",
    "fechaHoraConsulta"
})
public class TipoSalidaConsultaEstadoJuridicoFolio {

    @XmlElement(required = true)
    protected String numMatriculaInmobiliaria;
    @XmlElement(required = true)
    protected String codCirculoRegistral;
    @XmlElement(required = true)
    protected String nomCirculoRegistral;
    @XmlElement(required = true)
    protected String numPredial;
    @XmlElement(required = true)
    protected String numPredialAnterior;
    @XmlElement(name = "NUPRE", required = true)
    protected String nupre;
    @XmlElement(required = true)
    protected String estadoNUPRE;
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
    protected List<TipoPropietario> propietarios;
    @XmlElement(required = true)
    protected List<TipoAnotacion> anotaciones;
    @XmlElement(required = true)
    protected List<TipoMatriculaMatriz> matriculasMatriz;
    @XmlElement(required = true)
    protected List<TipoMatriculaDerivada> matriculasDerivadas;
    @XmlElement(required = true)
    protected List<TipoMedidaCautelar> medidasCautelares;
    @XmlElement(required = true)
    protected BigInteger codMensaje;
    @XmlElement(required = true)
    protected String descripcionMensaje;
    protected long numeroConsulta;
    @XmlElement(required = true)
    protected XMLGregorianCalendar fechaHoraConsulta;

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
     * Obtiene el valor de la propiedad numPredialAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPredialAnterior() {
        return numPredialAnterior;
    }

    /**
     * Define el valor de la propiedad numPredialAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPredialAnterior(String value) {
        this.numPredialAnterior = value;
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

    /**
     * Gets the value of the anotaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anotaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnotaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAnotacion }
     * 
     * 
     */
    public List<TipoAnotacion> getAnotaciones() {
        if (anotaciones == null) {
            anotaciones = new ArrayList<>();
        }
        return this.anotaciones;
    }

    /**
     * Gets the value of the matriculasMatriz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculasMatriz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculasMatriz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMatriculaMatriz }
     * 
     * 
     */
    public List<TipoMatriculaMatriz> getMatriculasMatriz() {
        if (matriculasMatriz == null) {
            matriculasMatriz = new ArrayList<>();
        }
        return this.matriculasMatriz;
    }

    /**
     * Gets the value of the matriculasDerivadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculasDerivadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculasDerivadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMatriculaDerivada }
     * 
     * 
     */
    public List<TipoMatriculaDerivada> getMatriculasDerivadas() {
        if (matriculasDerivadas == null) {
            matriculasDerivadas = new ArrayList<>();
        }
        return this.matriculasDerivadas;
    }

    /**
     * Gets the value of the medidasCautelares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medidasCautelares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedidasCautelares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMedidaCautelar }
     * 
     * 
     */
    public List<TipoMedidaCautelar> getMedidasCautelares() {
        if (medidasCautelares == null) {
            medidasCautelares = new ArrayList<>();
        }
        return this.medidasCautelares;
    }

    /**
     * Obtiene el valor de la propiedad codMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodMensaje() {
        return codMensaje;
    }

    /**
     * Define el valor de la propiedad codMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodMensaje(BigInteger value) {
        this.codMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroConsulta.
     * 
     */
    public long getNumeroConsulta() {
        return numeroConsulta;
    }

    /**
     * Define el valor de la propiedad numeroConsulta.
     * 
     */
    public void setNumeroConsulta(long value) {
        this.numeroConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraConsulta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    /**
     * Define el valor de la propiedad fechaHoraConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraConsulta(XMLGregorianCalendar value) {
        this.fechaHoraConsulta = value;
    }

}
