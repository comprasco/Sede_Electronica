package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoServicioGLO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoServicioGLO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidadSolicitada" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="valorServicio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServicioGLO", propOrder = {
    "tipoServicio",
    "subtipoServicio",
    "cantidadSolicitada",
    "valorServicio"
})
public class TipoServicioGLO {

    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String subtipoServicio;
    @XmlElement(required = true)
    protected BigInteger cantidadSolicitada;
    @XmlElement(required = true)
    protected BigDecimal valorServicio;

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
     * Obtiene el valor de la propiedad cantidadSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    /**
     * Define el valor de la propiedad cantidadSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadSolicitada(BigInteger value) {
        this.cantidadSolicitada = value;
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

}
