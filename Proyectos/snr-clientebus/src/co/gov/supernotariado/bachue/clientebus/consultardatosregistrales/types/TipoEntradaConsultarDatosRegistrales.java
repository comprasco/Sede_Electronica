package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarDatosRegistrales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarDatosRegistrales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterioBusqueda" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoEntradaConsultarDatosRegistrales", propOrder = {
    "modulo",
    "criterioBusqueda",
    "valorCriterioBusqueda"
})
public class TipoEntradaConsultarDatosRegistrales {

    @XmlElement(required = true)
    protected String modulo;
    @XmlElement(required = true)
    protected String criterioBusqueda;
    @XmlElement(required = true)
    protected String valorCriterioBusqueda;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad criterioBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }

    /**
     * Define el valor de la propiedad criterioBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterioBusqueda(String value) {
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
