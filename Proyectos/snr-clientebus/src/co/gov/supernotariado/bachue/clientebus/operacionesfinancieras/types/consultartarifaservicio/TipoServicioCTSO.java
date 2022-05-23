package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoServicioCTSO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoServicioCTSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorServicio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="direccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServicioCTSO", propOrder = {
    "tipoServicio",
    "subtipoServicio",
    "valorServicio",
    "direccionPredio",
    "estadoPredio"
})
public class TipoServicioCTSO {

    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String subtipoServicio;
    @XmlElement(required = true)
    protected BigDecimal valorServicio;
    @XmlElementRef(name = "direccionPredio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionPredio;
    @XmlElementRef(name = "estadoPredio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoPredio;

    /**
     * Obtiene el valor de la propiedad tipoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Define el valor de la propiedad tipoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServicio(String value) {
        this.tipoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad subtipoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtipoServicio() {
        return subtipoServicio;
    }

    /**
     * Define el valor de la propiedad subtipoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtipoServicio(String value) {
        this.subtipoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad valorServicio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorServicio() {
        return valorServicio;
    }

    /**
     * Define el valor de la propiedad valorServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorServicio(BigDecimal value) {
        this.valorServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionPredio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionPredio() {
        return direccionPredio;
    }

    /**
     * Define el valor de la propiedad direccionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionPredio(JAXBElement<String> value) {
        this.direccionPredio = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoPredio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoPredio() {
        return estadoPredio;
    }

    /**
     * Define el valor de la propiedad estadoPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoPredio(JAXBElement<String> value) {
        this.estadoPredio = value;
    }

}
