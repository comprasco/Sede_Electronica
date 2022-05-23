
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarOficinasOrigenTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarOficinasOrigenTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaOficinasOrigen" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oficinaOrigen" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombreOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoSalidaConsultarOficinasOrigenTipo", propOrder = {
    "codigo",
    "mensaje",
    "listaOficinasOrigen"
})
public class TipoSalidaConsultarOficinasOrigenTipo {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    protected TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen listaOficinasOrigen;

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
     * Obtiene el valor de la propiedad listaOficinasOrigen.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen }
     *     
     */
    public TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen getListaOficinasOrigen() {
        return listaOficinasOrigen;
    }

    /**
     * Define el valor de la propiedad listaOficinasOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen }
     *     
     */
    public void setListaOficinasOrigen(TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen value) {
        this.listaOficinasOrigen = value;
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
     *         &lt;element name="oficinaOrigen" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombreOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "oficinaOrigen"
    })
    public static class ListaOficinasOrigen {

        @XmlElement(required = true)
        protected List<TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen> oficinaOrigen;

        /**
         * Gets the value of the oficinaOrigen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oficinaOrigen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOficinaOrigen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen }
         * 
         * 
         */
        public List<TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen> getOficinaOrigen() {
            if (oficinaOrigen == null) {
                oficinaOrigen = new ArrayList<>();
            }
            return this.oficinaOrigen;
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
         *         &lt;element name="oficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombreOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "oficinaOrigen",
            "nombreOficinaOrigen"
        })
        public static class OficinaOrigen {

            @XmlElement(required = true)
            protected String oficinaOrigen;
            @XmlElement(required = true)
            protected String nombreOficinaOrigen;

            /**
             * Obtiene el valor de la propiedad oficinaOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOficinaOrigen() {
                return oficinaOrigen;
            }

            /**
             * Define el valor de la propiedad oficinaOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOficinaOrigen(String value) {
                this.oficinaOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreOficinaOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreOficinaOrigen() {
                return nombreOficinaOrigen;
            }

            /**
             * Define el valor de la propiedad nombreOficinaOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreOficinaOrigen(String value) {
                this.nombreOficinaOrigen = value;
            }

        }

    }

}
