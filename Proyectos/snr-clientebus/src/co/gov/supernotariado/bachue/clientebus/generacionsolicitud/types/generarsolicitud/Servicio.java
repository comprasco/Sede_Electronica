
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtipoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criterios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1}criterio" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "tipoServicio",
    "subtipoServicio",
    "criterios"
})
@XmlRootElement(name = "servicio")
public class Servicio {

    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String subtipoServicio;
    @XmlElement(required = true)
    protected Servicio.Criterios criterios;

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
     *     {@link Servicio.Criterios }
     *     
     */
    public Servicio.Criterios getCriterios() {
        return criterios;
    }

    /**
     * Define el valor de la propiedad criterios.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicio.Criterios }
     *     
     */
    public void setCriterios(Servicio.Criterios value) {
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
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1}criterio" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<Criterio> criterio;

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
         * {@link Criterio }
         * 
         * 
         */
        public List<Criterio> getCriterio() {
            if (criterio == null) {
                criterio = new ArrayList<>();
            }
            return this.criterio;
        }

    }

}
