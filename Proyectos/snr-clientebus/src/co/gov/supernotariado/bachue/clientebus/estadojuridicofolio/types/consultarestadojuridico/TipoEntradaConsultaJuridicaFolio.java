package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * El esquema define los
 * 				datos de entrada para la operacion consultarEstadoJuridico
 * 			
 * 
 * <p>Clase Java para tipoEntradaConsultaJuridicaFolio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultaJuridicaFolio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoIdentificacionPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="matricula"/>
 *               &lt;enumeration value="numeroPredial"/>
 *               &lt;enumeration value="numeroPredialAnterior"/>
 *               &lt;enumeration value="NUPRE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numIdentificacionPredio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="convenio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
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
@XmlType(name = "tipoEntradaConsultaJuridicaFolio", propOrder = {
    "tipoIdentificacionPredio",
    "numIdentificacionPredio",
    "convenio"
})
public class TipoEntradaConsultaJuridicaFolio {

    @XmlElement(required = true)
    protected String tipoIdentificacionPredio;
    @XmlElement(required = true)
    protected String numIdentificacionPredio;
    @XmlElement(required = true, nillable = true)
    protected String convenio;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionPredio() {
        return tipoIdentificacionPredio;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionPredio(String value) {
        this.tipoIdentificacionPredio = value;
    }

    /**
     * Obtiene el valor de la propiedad numIdentificacionPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentificacionPredio() {
        return numIdentificacionPredio;
    }

    /**
     * Define el valor de la propiedad numIdentificacionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentificacionPredio(String value) {
        this.numIdentificacionPredio = value;
    }

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

}
