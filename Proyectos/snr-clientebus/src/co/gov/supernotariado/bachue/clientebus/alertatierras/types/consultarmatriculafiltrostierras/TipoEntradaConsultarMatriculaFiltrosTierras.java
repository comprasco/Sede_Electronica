
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarMatriculaFiltrosTierras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarMatriculaFiltrosTierras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idVereda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombrePredio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaPredio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarMatriculaFiltrosTierras", propOrder = {
    "idDepartamento",
    "idMunicipio",
    "idVereda",
    "nombrePredio",
    "areaPredio"
})
public class TipoEntradaConsultarMatriculaFiltrosTierras {

    @XmlElement(required = true)
    protected String idDepartamento;
    @XmlElement(required = true)
    protected String idMunicipio;
    @XmlElement(required = true)
    protected String idVereda;
    @XmlElement(required = true)
    protected String nombrePredio;
    protected int areaPredio;

    /**
     * Obtiene el valor de la propiedad idDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDepartamento() {
        return idDepartamento;
    }

    /**
     * Define el valor de la propiedad idDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDepartamento(String value) {
        this.idDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad idMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * Define el valor de la propiedad idMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMunicipio(String value) {
        this.idMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad idVereda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVereda() {
        return idVereda;
    }

    /**
     * Define el valor de la propiedad idVereda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVereda(String value) {
        this.idVereda = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePredio() {
        return nombrePredio;
    }

    /**
     * Define el valor de la propiedad nombrePredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePredio(String value) {
        this.nombrePredio = value;
    }

    /**
     * Obtiene el valor de la propiedad areaPredio.
     * 
     */
    public int getAreaPredio() {
        return areaPredio;
    }

    /**
     * Define el valor de la propiedad areaPredio.
     * 
     */
    public void setAreaPredio(int value) {
        this.areaPredio = value;
    }

}
