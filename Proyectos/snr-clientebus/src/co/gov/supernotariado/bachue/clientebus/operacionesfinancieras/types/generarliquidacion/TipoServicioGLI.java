package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoServicioGLI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoServicioGLI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidadSolicitada" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="valorServicio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="criterios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="criterio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2}tipoCriterioGLI" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "tipoServicioGLI", propOrder = {
    "tipoServicio",
    "subtipoServicio",
    "cantidadSolicitada",
    "valorServicio",
    "criterios"
})
public class TipoServicioGLI {

    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String subtipoServicio;
    @XmlElement(required = true)
    protected BigInteger cantidadSolicitada;
    @XmlElement(required = true)
    protected BigDecimal valorServicio;
    @XmlElement(required = true)
    protected TipoServicioGLI.Criterios criterios;

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

    /**
     * Obtiene el valor de la propiedad criterios.
     * 
     * @return
     *     possible object is
     *     {@link TipoServicioGLI.Criterios }
     *     
     */
    public TipoServicioGLI.Criterios getCriterios() {
        return criterios;
    }

    /**
     * Define el valor de la propiedad criterios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoServicioGLI.Criterios }
     *     
     */
    public void setCriterios(TipoServicioGLI.Criterios value) {
        this.criterios = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="criterio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2}tipoCriterioGLI" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "criterio"
    })
    public static class Criterios {

        protected List<TipoCriterioGLI> criterio;

        /**
         * Gets the value of the criterio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criterio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriterio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoCriterioGLI }
         * 
         * 
         */
        public List<TipoCriterioGLI> getCriterio() {
            if (criterio == null) {
                criterio = new ArrayList<>();
            }
            return this.criterio;
        }

    }

}
