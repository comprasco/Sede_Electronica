package co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaCrearProcAntiguoSistemaTierras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaCrearProcAntiguoSistemaTierras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codDepartamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="RURAL"/>
 *               &lt;enumeration value="URBANO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numLibro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numTomo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTipoPartida">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PAR"/>
 *               &lt;enumeration value="IMPAR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numPartida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numFolio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anio" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1}anio"/>
 *         &lt;element name="nomPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaCrearProcAntiguoSistemaTierras", propOrder = {
    "idAlerta",
    "codCirculoRegistral",
    "codPais",
    "codDepartamento",
    "codMunicipio",
    "tipoPredio",
    "numLibro",
    "numTomo",
    "idTipoPartida",
    "numPartida",
    "numFolio",
    "anio",
    "nomPredio",
    "numPredio"
})
public class TipoEntradaCrearProcAntiguoSistemaTierras {

    protected int idAlerta;
    @XmlElement(required = true)
    protected String codCirculoRegistral;
    protected int codPais;
    protected int codDepartamento;
    protected int codMunicipio;
    @XmlElement(required = true)
    protected String tipoPredio;
    protected int numLibro;
    protected int numTomo;
    @XmlElement(required = true)
    protected String idTipoPartida;
    protected int numPartida;
    protected int numFolio;
    @XmlSchemaType(name = "integer")
    protected int anio;
    protected String nomPredio;
    protected Integer numPredio;

    /**
     * Obtiene el valor de la propiedad idAlerta.
     * 
     */
    public int getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define el valor de la propiedad idAlerta.
     * 
     */
    public void setIdAlerta(int value) {
        this.idAlerta = value;
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
     * Obtiene el valor de la propiedad codPais.
     * 
     */
    public int getCodPais() {
        return codPais;
    }

    /**
     * Define el valor de la propiedad codPais.
     * 
     */
    public void setCodPais(int value) {
        this.codPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codDepartamento.
     * 
     */
    public int getCodDepartamento() {
        return codDepartamento;
    }

    /**
     * Define el valor de la propiedad codDepartamento.
     * 
     */
    public void setCodDepartamento(int value) {
        this.codDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunicipio.
     * 
     */
    public int getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Define el valor de la propiedad codMunicipio.
     * 
     */
    public void setCodMunicipio(int value) {
        this.codMunicipio = value;
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
     * Obtiene el valor de la propiedad numLibro.
     * 
     */
    public int getNumLibro() {
        return numLibro;
    }

    /**
     * Define el valor de la propiedad numLibro.
     * 
     */
    public void setNumLibro(int value) {
        this.numLibro = value;
    }

    /**
     * Obtiene el valor de la propiedad numTomo.
     * 
     */
    public int getNumTomo() {
        return numTomo;
    }

    /**
     * Define el valor de la propiedad numTomo.
     * 
     */
    public void setNumTomo(int value) {
        this.numTomo = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoPartida() {
        return idTipoPartida;
    }

    /**
     * Define el valor de la propiedad idTipoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoPartida(String value) {
        this.idTipoPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad numPartida.
     * 
     */
    public int getNumPartida() {
        return numPartida;
    }

    /**
     * Define el valor de la propiedad numPartida.
     * 
     */
    public void setNumPartida(int value) {
        this.numPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad numFolio.
     * 
     */
    public int getNumFolio() {
        return numFolio;
    }

    /**
     * Define el valor de la propiedad numFolio.
     * 
     */
    public void setNumFolio(int value) {
        this.numFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     */
    public void setAnio(int value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPredio() {
        return nomPredio;
    }

    /**
     * Define el valor de la propiedad nomPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPredio(String value) {
        this.nomPredio = value;
    }

    /**
     * Obtiene el valor de la propiedad numPredio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPredio() {
        return numPredio;
    }

    /**
     * Define el valor de la propiedad numPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPredio(Integer value) {
        this.numPredio = value;
    }

}
