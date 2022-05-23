package co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * El esquema define los
 * 				datos de entrada para la operacion de consulta de datos Basicos que
 * 				permite encontrar una lista de matriculas inmobiliarias con algunos
 * 				datos de sus propietarios
 * 			
 * 
 * <p>Clase Java para tipoEntradaDatosBasicosMatricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaDatosBasicosMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="convenio">
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
 *         &lt;element name="codMunicipio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="criterioBusqueda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="numPredial"/>
 *               &lt;enumeration value="numPredialAnterior"/>
 *               &lt;enumeration value="matricula"/>
 *               &lt;enumeration value="NUPRE"/>
 *               &lt;enumeration value="numeroDocumentoCC"/>
 *               &lt;enumeration value="numeroDocumentoCE"/>
 *               &lt;enumeration value="numeroDocumentoNUIP"/>
 *               &lt;enumeration value="numeroDocumentoPA"/>
 *               &lt;enumeration value="numeroDocumentoTI"/>
 *               &lt;enumeration value="numeroDocumentoNIT"/>
 *               &lt;enumeration value="nombres"/>
 *               &lt;enumeration value="razonSocial"/>
 *               &lt;enumeration value="direccion"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valorCriterioBusqueda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaDatosBasicosMatricula", propOrder = {
    "convenio",
    "codDepartamento",
    "codMunicipio",
    "criterioBusqueda",
    "valorCriterioBusqueda"
})
public class TipoEntradaDatosBasicosMatricula {

    protected String convenio;
    protected String codDepartamento;
    protected String codMunicipio;
    @XmlElementRef(name = "criterioBusqueda", namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", type = JAXBElement.class, required = false)
    protected JAXBElement<String> criterioBusqueda;
    protected String valorCriterioBusqueda;

    /**
     * Obtiene el valor de la propiedad convenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * Define el valor de la propiedad convenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenio(String value) {
        this.convenio = value;
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
     * Obtiene el valor de la propiedad criterioBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCriterioBusqueda() {
        return criterioBusqueda;
    }

    /**
     * Define el valor de la propiedad criterioBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCriterioBusqueda(JAXBElement<String> value) {
        this.criterioBusqueda = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCriterioBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorCriterioBusqueda() {
        return valorCriterioBusqueda;
    }

    /**
     * Define el valor de la propiedad valorCriterioBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorCriterioBusqueda(String value) {
        this.valorCriterioBusqueda = value;
    }

}
