
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultaActosTurno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultaActosTurno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acto" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codigoTipoActo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nombreTipoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tieneCuantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tarifaExenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="valorCuantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="valorAvaluo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cantidadActos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="valorDerechos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="valorConservacionDocumental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultaActosTurno", propOrder = {
    "nir",
    "actos",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultaActosTurno {

    @XmlElement(required = true)
    protected String nir;
    @XmlElement(required = true)
    protected TipoSalidaConsultaActosTurno.Actos actos;
    @XmlElement(required = true)
    protected String codigoMensaje;
    @XmlElement(required = true)
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad nir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNir() {
        return nir;
    }

    /**
     * Define el valor de la propiedad nir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNir(String value) {
        this.nir = value;
    }

    /**
     * Obtiene el valor de la propiedad actos.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultaActosTurno.Actos }
     *     
     */
    public TipoSalidaConsultaActosTurno.Actos getActos() {
        return actos;
    }

    /**
     * Define el valor de la propiedad actos.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultaActosTurno.Actos }
     *     
     */
    public void setActos(TipoSalidaConsultaActosTurno.Actos value) {
        this.actos = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
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
     *         &lt;element name="acto" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codigoTipoActo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nombreTipoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tieneCuantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tarifaExenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="valorCuantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="valorAvaluo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cantidadActos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="valorDerechos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="valorConservacionDocumental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "acto"
    })
    public static class Actos {

        protected List<TipoSalidaConsultaActosTurno.Actos.Acto> acto;

        /**
         * Gets the value of the acto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultaActosTurno.Actos.Acto }
         * 
         * 
         */
        public List<TipoSalidaConsultaActosTurno.Actos.Acto> getActo() {
            if (acto == null) {
                acto = new ArrayList<TipoSalidaConsultaActosTurno.Actos.Acto>();
            }
            return this.acto;
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
         *         &lt;element name="codigoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codigoTipoActo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nombreTipoActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tieneCuantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tarifaExenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="valorCuantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="valorAvaluo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cantidadActos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="valorDerechos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="valorConservacionDocumental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "codigoActo",
            "codigoTipoActo",
            "nombreTipoActo",
            "tieneCuantia",
            "tarifaExenta",
            "valorCuantia",
            "valorAvaluo",
            "cantidadActos",
            "valorDerechos",
            "valorConservacionDocumental",
            "valorTotal"
        })
        public static class Acto {

            @XmlElement(required = true)
            protected String codigoActo;
            protected String codigoTipoActo;
            @XmlElement(required = true)
            protected String nombreTipoActo;
            @XmlElement(required = true)
            protected String tieneCuantia;
            @XmlElement(required = true)
            protected String tarifaExenta;
            protected String valorCuantia;
            protected String valorAvaluo;
            protected String cantidadActos;
            protected String valorDerechos;
            protected String valorConservacionDocumental;
            protected String valorTotal;

            /**
             * Obtiene el valor de la propiedad codigoActo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoActo() {
                return codigoActo;
            }

            /**
             * Define el valor de la propiedad codigoActo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoActo(String value) {
                this.codigoActo = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoTipoActo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoTipoActo() {
                return codigoTipoActo;
            }

            /**
             * Define el valor de la propiedad codigoTipoActo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoTipoActo(String value) {
                this.codigoTipoActo = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreTipoActo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreTipoActo() {
                return nombreTipoActo;
            }

            /**
             * Define el valor de la propiedad nombreTipoActo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreTipoActo(String value) {
                this.nombreTipoActo = value;
            }

            /**
             * Obtiene el valor de la propiedad tieneCuantia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTieneCuantia() {
                return tieneCuantia;
            }

            /**
             * Define el valor de la propiedad tieneCuantia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTieneCuantia(String value) {
                this.tieneCuantia = value;
            }

            /**
             * Obtiene el valor de la propiedad tarifaExenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTarifaExenta() {
                return tarifaExenta;
            }

            /**
             * Define el valor de la propiedad tarifaExenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTarifaExenta(String value) {
                this.tarifaExenta = value;
            }

            /**
             * Obtiene el valor de la propiedad valorCuantia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorCuantia() {
                return valorCuantia;
            }

            /**
             * Define el valor de la propiedad valorCuantia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorCuantia(String value) {
                this.valorCuantia = value;
            }

            /**
             * Obtiene el valor de la propiedad valorAvaluo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorAvaluo() {
                return valorAvaluo;
            }

            /**
             * Define el valor de la propiedad valorAvaluo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorAvaluo(String value) {
                this.valorAvaluo = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadActos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCantidadActos() {
                return cantidadActos;
            }

            /**
             * Define el valor de la propiedad cantidadActos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCantidadActos(String value) {
                this.cantidadActos = value;
            }

            /**
             * Obtiene el valor de la propiedad valorDerechos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorDerechos() {
                return valorDerechos;
            }

            /**
             * Define el valor de la propiedad valorDerechos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorDerechos(String value) {
                this.valorDerechos = value;
            }

            /**
             * Obtiene el valor de la propiedad valorConservacionDocumental.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorConservacionDocumental() {
                return valorConservacionDocumental;
            }

            /**
             * Define el valor de la propiedad valorConservacionDocumental.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorConservacionDocumental(String value) {
                this.valorConservacionDocumental = value;
            }

            /**
             * Obtiene el valor de la propiedad valorTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorTotal() {
                return valorTotal;
            }

            /**
             * Define el valor de la propiedad valorTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorTotal(String value) {
                this.valorTotal = value;
            }

        }

    }

}
