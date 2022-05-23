
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarEntidadesJ_A complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarEntidadesJ_A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaAutoridadesJ_A" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="autoridad_A" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombreAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="esAgenciaNacionalTierras" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarEntidadesJ_A", propOrder = {
    "codigo",
    "mensaje",
    "listaAutoridadesJA"
})
public class TipoSalidaConsultarEntidadesJA {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(name = "listaAutoridadesJ_A")
    protected TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA listaAutoridadesJA;

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
     * Obtiene el valor de la propiedad listaAutoridadesJA.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA }
     *     
     */
    public TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA getListaAutoridadesJA() {
        return listaAutoridadesJA;
    }

    /**
     * Define el valor de la propiedad listaAutoridadesJA.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA }
     *     
     */
    public void setListaAutoridadesJA(TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA value) {
        this.listaAutoridadesJA = value;
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
     *         &lt;element name="autoridad_A" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombreAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="esAgenciaNacionalTierras" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "autoridadA"
    })
    public static class ListaAutoridadesJA {

        @XmlElement(name = "autoridad_A", required = true)
        protected List<TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA> autoridadA;

        /**
         * Gets the value of the autoridadA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autoridadA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutoridadA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA }
         * 
         * 
         */
        public List<TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA> getAutoridadA() {
            if (autoridadA == null) {
                autoridadA = new ArrayList<>();
            }
            return this.autoridadA;
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
         *         &lt;element name="codigoAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombreAutoridad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="esAgenciaNacionalTierras" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "codigoAutoridad",
            "nombreAutoridad",
            "esAgenciaNacionalTierras"
        })
        public static class AutoridadA {

            @XmlElement(required = true)
            protected String codigoAutoridad;
            @XmlElement(required = true)
            protected String nombreAutoridad;
            @XmlElement(required = true)
            protected String esAgenciaNacionalTierras;

            /**
             * Obtiene el valor de la propiedad codigoAutoridad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoAutoridad() {
                return codigoAutoridad;
            }

            /**
             * Define el valor de la propiedad codigoAutoridad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoAutoridad(String value) {
                this.codigoAutoridad = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAutoridad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAutoridad() {
                return nombreAutoridad;
            }

            /**
             * Define el valor de la propiedad nombreAutoridad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAutoridad(String value) {
                this.nombreAutoridad = value;
            }

            /**
             * Obtiene el valor de la propiedad esAgenciaNacionalTierras.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEsAgenciaNacionalTierras() {
                return esAgenciaNacionalTierras;
            }

            /**
             * Define el valor de la propiedad esAgenciaNacionalTierras.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEsAgenciaNacionalTierras(String value) {
                this.esAgenciaNacionalTierras = value;
            }

        }

    }

}
