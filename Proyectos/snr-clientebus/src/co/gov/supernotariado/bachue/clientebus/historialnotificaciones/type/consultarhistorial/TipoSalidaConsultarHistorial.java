
package co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoSalidaConsultarHistorial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarHistorial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRegistros" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="listaMensajes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mensaje" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="identificadorEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="tipoTramiteCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cuerpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="para" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tipoDocumental" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="codMensaje" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarHistorial", propOrder = {
    "numeroRegistros",
    "listaMensajes",
    "codMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarHistorial {

    protected BigInteger numeroRegistros;
    protected TipoSalidaConsultarHistorial.ListaMensajes listaMensajes;
    @XmlElement(required = true)
    protected BigInteger codMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad numeroRegistros.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroRegistros() {
        return numeroRegistros;
    }

    /**
     * Define el valor de la propiedad numeroRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroRegistros(BigInteger value) {
        this.numeroRegistros = value;
    }

    /**
     * Obtiene el valor de la propiedad listaMensajes.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarHistorial.ListaMensajes }
     *     
     */
    public TipoSalidaConsultarHistorial.ListaMensajes getListaMensajes() {
        return listaMensajes;
    }

    /**
     * Define el valor de la propiedad listaMensajes.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarHistorial.ListaMensajes }
     *     
     */
    public void setListaMensajes(TipoSalidaConsultarHistorial.ListaMensajes value) {
        this.listaMensajes = value;
    }

    /**
     * Obtiene el valor de la propiedad codMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodMensaje() {
        return codMensaje;
    }

    /**
     * Define el valor de la propiedad codMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodMensaje(BigInteger value) {
        this.codMensaje = value;
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
     *         &lt;element name="mensaje" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="identificadorEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="tipoTramiteCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cuerpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="para" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tipoDocumental" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "mensaje"
    })
    public static class ListaMensajes {

        protected List<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje> mensaje;

        /**
         * Gets the value of the mensaje property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mensaje property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMensaje().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultarHistorial.ListaMensajes.Mensaje }
         * 
         * 
         */
        public List<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje> getMensaje() {
            if (mensaje == null) {
                mensaje = new ArrayList<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje>();
            }
            return this.mensaje;
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
         *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="identificadorEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="tipoTramiteCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cuerpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="para" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tipoDocumental" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "nir",
            "turno",
            "orip",
            "identificadorEE",
            "fechaEnvio",
            "tipoTramiteCurso",
            "asunto",
            "cuerpo",
            "para",
            "tipoDocumental"
        })
        public static class Mensaje {

            protected String nir;
            @XmlElementRef(name = "turno", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", type = JAXBElement.class, required = false)
            protected JAXBElement<String> turno;
            @XmlElementRef(name = "orip", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", type = JAXBElement.class, required = false)
            protected JAXBElement<String> orip;
            @XmlElementRef(name = "identificadorEE", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", type = JAXBElement.class, required = false)
            protected JAXBElement<String> identificadorEE;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEnvio;
            protected String tipoTramiteCurso;
            protected String asunto;
            protected String cuerpo;
            protected String para;
            protected List<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental> tipoDocumental;

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
             * Obtiene el valor de la propiedad turno.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTurno() {
                return turno;
            }

            /**
             * Define el valor de la propiedad turno.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTurno(JAXBElement<String> value) {
                this.turno = value;
            }

            /**
             * Obtiene el valor de la propiedad orip.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getOrip() {
                return orip;
            }

            /**
             * Define el valor de la propiedad orip.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setOrip(JAXBElement<String> value) {
                this.orip = value;
            }

            /**
             * Obtiene el valor de la propiedad identificadorEE.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIdentificadorEE() {
                return identificadorEE;
            }

            /**
             * Define el valor de la propiedad identificadorEE.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIdentificadorEE(JAXBElement<String> value) {
                this.identificadorEE = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEnvio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaEnvio() {
                return fechaEnvio;
            }

            /**
             * Define el valor de la propiedad fechaEnvio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaEnvio(XMLGregorianCalendar value) {
                this.fechaEnvio = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoTramiteCurso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoTramiteCurso() {
                return tipoTramiteCurso;
            }

            /**
             * Define el valor de la propiedad tipoTramiteCurso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoTramiteCurso(String value) {
                this.tipoTramiteCurso = value;
            }

            /**
             * Obtiene el valor de la propiedad asunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAsunto() {
                return asunto;
            }

            /**
             * Define el valor de la propiedad asunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAsunto(String value) {
                this.asunto = value;
            }

            /**
             * Obtiene el valor de la propiedad cuerpo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCuerpo() {
                return cuerpo;
            }

            /**
             * Define el valor de la propiedad cuerpo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCuerpo(String value) {
                this.cuerpo = value;
            }

            /**
             * Obtiene el valor de la propiedad para.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPara() {
                return para;
            }

            /**
             * Define el valor de la propiedad para.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPara(String value) {
                this.para = value;
            }

            /**
             * Gets the value of the tipoDocumental property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tipoDocumental property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTipoDocumental().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental }
             * 
             * 
             */
            public List<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental> getTipoDocumental() {
                if (tipoDocumental == null) {
                    tipoDocumental = new ArrayList<TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental>();
                }
                return this.tipoDocumental;
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
             *         &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "nomTipoDocumentoPublico"
            })
            public static class TipoDocumental {

                protected String nomTipoDocumentoPublico;

                /**
                 * Obtiene el valor de la propiedad nomTipoDocumentoPublico.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomTipoDocumentoPublico() {
                    return nomTipoDocumentoPublico;
                }

                /**
                 * Define el valor de la propiedad nomTipoDocumentoPublico.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomTipoDocumentoPublico(String value) {
                    this.nomTipoDocumentoPublico = value;
                }

            }

        }

    }

}
