package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoServicioCTSI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoServicioCTSI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="criterio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoCriterioCTSI" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tipoServicioCTSI", propOrder = {
    "tipoServicio",
    "subtipoServicio",
    "criterios"
})
public class TipoServicioCTSI {

    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String subtipoServicio;
    @XmlElement(required = true)
    protected TipoServicioCTSI.Criterios criterios;

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
     * Obtiene el valor de la propiedad criterios.
     * 
     * @return
     *     possible object is
     *     {@link TipoServicioCTSI.Criterios }
     *     
     */
    public TipoServicioCTSI.Criterios getCriterios() {
        return criterios;
    }

    /**
     * Define el valor de la propiedad criterios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoServicioCTSI.Criterios }
     *     
     */
    public void setCriterios(TipoServicioCTSI.Criterios value) {
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
     *         &lt;element name="criterio" type="{https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2}tipoCriterioCTSI" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<TipoCriterioCTSI> criterio;

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
         * {@link TipoCriterioCTSI }
         * 
         * 
         */
        public List<TipoCriterioCTSI> getCriterio() {
            if (criterio == null) {
                criterio = new ArrayList<>();
            }
            return this.criterio;
        }

    }

}
