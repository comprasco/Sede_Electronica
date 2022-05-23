
package co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaObtenerCausalesCorreccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaObtenerCausalesCorreccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaCausales">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Causal" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="descGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="descCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="descripcionCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="200"/>
 *               &lt;enumeration value="404"/>
 *               &lt;enumeration value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaObtenerCausalesCorreccion", propOrder = {
    "listaCausales",
    "codigo",
    "mensaje"
})
public class TipoSalidaObtenerCausalesCorreccion {

    @XmlElement(required = true)
    protected TipoSalidaObtenerCausalesCorreccion.ListaCausales listaCausales;
    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad listaCausales.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaObtenerCausalesCorreccion.ListaCausales }
     *     
     */
    public TipoSalidaObtenerCausalesCorreccion.ListaCausales getListaCausales() {
        return listaCausales;
    }

    /**
     * Define el valor de la propiedad listaCausales.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaObtenerCausalesCorreccion.ListaCausales }
     *     
     */
    public void setListaCausales(TipoSalidaObtenerCausalesCorreccion.ListaCausales value) {
        this.listaCausales = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
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
     *         &lt;element name="Causal" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descripcionCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "causal"
    })
    public static class ListaCausales {

        @XmlElement(name = "Causal")
        protected List<TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal> causal;

        /**
         * Gets the value of the causal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the causal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCausal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal }
         * 
         * 
         */
        public List<TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal> getCausal() {
            if (causal == null) {
                causal = new ArrayList<>();
            }
            return this.causal;
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
         *         &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descripcionCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "idGrupoCausal",
            "descGrupoCausal",
            "idCausalCorreccion",
            "descCausalCorreccion",
            "descripcionCausal"
        })
        public static class Causal {

            @XmlElement(required = true)
            protected String idGrupoCausal;
            @XmlElement(required = true)
            protected String descGrupoCausal;
            @XmlElement(required = true)
            protected String idCausalCorreccion;
            @XmlElement(required = true)
            protected String descCausalCorreccion;
            @XmlElement(required = true)
            protected String descripcionCausal;

            /**
             * Obtiene el valor de la propiedad idGrupoCausal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdGrupoCausal() {
                return idGrupoCausal;
            }

            /**
             * Define el valor de la propiedad idGrupoCausal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdGrupoCausal(String value) {
                this.idGrupoCausal = value;
            }

            /**
             * Obtiene el valor de la propiedad descGrupoCausal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescGrupoCausal() {
                return descGrupoCausal;
            }

            /**
             * Define el valor de la propiedad descGrupoCausal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescGrupoCausal(String value) {
                this.descGrupoCausal = value;
            }

            /**
             * Obtiene el valor de la propiedad idCausalCorreccion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdCausalCorreccion() {
                return idCausalCorreccion;
            }

            /**
             * Define el valor de la propiedad idCausalCorreccion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdCausalCorreccion(String value) {
                this.idCausalCorreccion = value;
            }

            /**
             * Obtiene el valor de la propiedad descCausalCorreccion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescCausalCorreccion() {
                return descCausalCorreccion;
            }

            /**
             * Define el valor de la propiedad descCausalCorreccion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescCausalCorreccion(String value) {
                this.descCausalCorreccion = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionCausal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionCausal() {
                return descripcionCausal;
            }

            /**
             * Define el valor de la propiedad descripcionCausal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionCausal(String value) {
                this.descripcionCausal = value;
            }

        }

    }

}
