
package co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaIngresoSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaIngresoSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interesado" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoDocumentoPersona">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="RE"/>
 *                         &lt;enumeration value="TI"/>
 *                         &lt;enumeration value="CC"/>
 *                         &lt;enumeration value="CE"/>
 *                         &lt;enumeration value="PE"/>
 *                         &lt;enumeration value="PTP"/>
 *                         &lt;enumeration value="PA"/>
 *                         &lt;enumeration value="NUIP"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="codGenero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matriculas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="matricula" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="datosCorregir">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="datoCorregir" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaIngresoSolicitud", propOrder = {
    "interesado",
    "observacion",
    "matriculas"
})
public class TipoEntradaIngresoSolicitud {

    @XmlElement(required = true)
    protected List<TipoEntradaIngresoSolicitud.Interesado> interesado;
    @XmlElement(required = true)
    protected String observacion;
    @XmlElement(required = true)
    protected TipoEntradaIngresoSolicitud.Matriculas matriculas;

    /**
     * Gets the value of the interesado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interesado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteresado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoEntradaIngresoSolicitud.Interesado }
     * 
     * 
     */
    public List<TipoEntradaIngresoSolicitud.Interesado> getInteresado() {
        if (interesado == null) {
            interesado = new ArrayList<>();
        }
        return this.interesado;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculas.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaIngresoSolicitud.Matriculas }
     *     
     */
    public TipoEntradaIngresoSolicitud.Matriculas getMatriculas() {
        return matriculas;
    }

    /**
     * Define el valor de la propiedad matriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaIngresoSolicitud.Matriculas }
     *     
     */
    public void setMatriculas(TipoEntradaIngresoSolicitud.Matriculas value) {
        this.matriculas = value;
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
     *         &lt;element name="tipoDocumentoPersona">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="RE"/>
     *               &lt;enumeration value="TI"/>
     *               &lt;enumeration value="CC"/>
     *               &lt;enumeration value="CE"/>
     *               &lt;enumeration value="PE"/>
     *               &lt;enumeration value="PTP"/>
     *               &lt;enumeration value="PA"/>
     *               &lt;enumeration value="NUIP"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="codGenero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tipoDocumentoPersona",
        "numDocumentoPersona",
        "primerNombre",
        "segundoNombre",
        "primerApellido",
        "segundoApellido",
        "codGenero",
        "email"
    })
    public static class Interesado {

        @XmlElement(required = true)
        protected String tipoDocumentoPersona;
        @XmlElement(required = true)
        protected String numDocumentoPersona;
        @XmlElement(required = true)
        protected String primerNombre;
        protected String segundoNombre;
        @XmlElement(required = true)
        protected String primerApellido;
        protected String segundoApellido;
        @XmlElement(required = true)
        protected String codGenero;
        @XmlElement(required = true)
        protected String email;

        /**
         * Obtiene el valor de la propiedad tipoDocumentoPersona.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDocumentoPersona() {
            return tipoDocumentoPersona;
        }

        /**
         * Define el valor de la propiedad tipoDocumentoPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDocumentoPersona(String value) {
            this.tipoDocumentoPersona = value;
        }

        /**
         * Obtiene el valor de la propiedad numDocumentoPersona.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumDocumentoPersona() {
            return numDocumentoPersona;
        }

        /**
         * Define el valor de la propiedad numDocumentoPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumDocumentoPersona(String value) {
            this.numDocumentoPersona = value;
        }

        /**
         * Obtiene el valor de la propiedad primerNombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimerNombre() {
            return primerNombre;
        }

        /**
         * Define el valor de la propiedad primerNombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimerNombre(String value) {
            this.primerNombre = value;
        }

        /**
         * Obtiene el valor de la propiedad segundoNombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegundoNombre() {
            return segundoNombre;
        }

        /**
         * Define el valor de la propiedad segundoNombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegundoNombre(String value) {
            this.segundoNombre = value;
        }

        /**
         * Obtiene el valor de la propiedad primerApellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimerApellido() {
            return primerApellido;
        }

        /**
         * Define el valor de la propiedad primerApellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimerApellido(String value) {
            this.primerApellido = value;
        }

        /**
         * Obtiene el valor de la propiedad segundoApellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegundoApellido() {
            return segundoApellido;
        }

        /**
         * Define el valor de la propiedad segundoApellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegundoApellido(String value) {
            this.segundoApellido = value;
        }

        /**
         * Obtiene el valor de la propiedad codGenero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodGenero() {
            return codGenero;
        }

        /**
         * Define el valor de la propiedad codGenero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodGenero(String value) {
            this.codGenero = value;
        }

        /**
         * Obtiene el valor de la propiedad email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define el valor de la propiedad email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
     *         &lt;element name="matricula" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="datosCorregir">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="datoCorregir" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "matricula"
    })
    public static class Matriculas {

        @XmlElement(required = true)
        protected List<TipoEntradaIngresoSolicitud.Matriculas.Matricula> matricula;

        /**
         * Gets the value of the matricula property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matricula property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatricula().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoEntradaIngresoSolicitud.Matriculas.Matricula }
         * 
         * 
         */
        public List<TipoEntradaIngresoSolicitud.Matriculas.Matricula> getMatricula() {
            if (matricula == null) {
                matricula = new ArrayList<>();
            }
            return this.matricula;
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
         *         &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="datosCorregir">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="datoCorregir" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "codCirculoRegistral",
            "numMatriculaInmobiliaria",
            "datosCorregir"
        })
        public static class Matricula {

            @XmlElement(required = true)
            protected String codCirculoRegistral;
            @XmlElement(required = true)
            protected String numMatriculaInmobiliaria;
            @XmlElement(required = true)
            protected TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir datosCorregir;

            /**
             * Obtiene el valor de la propiedad codCirculoRegistral.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodCirculoRegistral() {
                return codCirculoRegistral;
            }

            /**
             * Define el valor de la propiedad codCirculoRegistral.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodCirculoRegistral(String value) {
                this.codCirculoRegistral = value;
            }

            /**
             * Obtiene el valor de la propiedad numMatriculaInmobiliaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumMatriculaInmobiliaria() {
                return numMatriculaInmobiliaria;
            }

            /**
             * Define el valor de la propiedad numMatriculaInmobiliaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumMatriculaInmobiliaria(String value) {
                this.numMatriculaInmobiliaria = value;
            }

            /**
             * Obtiene el valor de la propiedad datosCorregir.
             * 
             * @return
             *     possible object is
             *     {@link TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir }
             *     
             */
            public TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir getDatosCorregir() {
                return datosCorregir;
            }

            /**
             * Define el valor de la propiedad datosCorregir.
             * 
             * @param value
             *     allowed object is
             *     {@link TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir }
             *     
             */
            public void setDatosCorregir(TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir value) {
                this.datosCorregir = value;
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
             *         &lt;element name="datoCorregir" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="idGrupoCausal" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "datoCorregir"
            })
            public static class DatosCorregir {

                @XmlElement(required = true)
                protected List<TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir.DatoCorregir> datoCorregir;

                /**
                 * Gets the value of the datoCorregir property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the datoCorregir property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDatoCorregir().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir.DatoCorregir }
                 * 
                 * 
                 */
                public List<TipoEntradaIngresoSolicitud.Matriculas.Matricula.DatosCorregir.DatoCorregir> getDatoCorregir() {
                    if (datoCorregir == null) {
                        datoCorregir = new ArrayList<>();
                    }
                    return this.datoCorregir;
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
                 *         &lt;element name="idCausalCorreccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "idCausalCorreccion",
                    "observacion"
                })
                public static class DatoCorregir {

                    @XmlElement(required = true)
                    protected String idGrupoCausal;
                    @XmlElement(required = true)
                    protected String idCausalCorreccion;
                    @XmlElement(required = true)
                    protected String observacion;

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
                     * Obtiene el valor de la propiedad observacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getObservacion() {
                        return observacion;
                    }

                    /**
                     * Define el valor de la propiedad observacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setObservacion(String value) {
                        this.observacion = value;
                    }

                }

            }

        }

    }

}
