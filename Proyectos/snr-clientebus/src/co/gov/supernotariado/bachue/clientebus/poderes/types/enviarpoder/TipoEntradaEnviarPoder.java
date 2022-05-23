package co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaEnviarPoder complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaEnviarPoder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parametros">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parametro" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dDocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dDocTittle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="xIdcProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="x_Justificacion_Revocado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="x_Tipo_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xDepartamentos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xMunicipios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xTip_Doc_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xNotaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xCC_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xNombre_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xTip_Doc_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xCC_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xNombre_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xNum_Matricula_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xDireccion_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xDepartamento_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xCiudad_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xNumero_Instrumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xFecha_Instrumento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="xCirculo_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xFinalizacion_Poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="xJustificacion_Usado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dOutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="xEstado_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="xUso_Poder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="xFecha_cargue_poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="xActualizar_Documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dDocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="nombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaEnviarPoder", propOrder = {
    "sistemaOrigen",
    "parametros",
    "archivo",
    "nombreArchivo"
})
public class TipoEntradaEnviarPoder {

    @XmlElement(required = true)
    protected String sistemaOrigen;
    @XmlElement(required = true)
    protected TipoEntradaEnviarPoder.Parametros parametros;
    @XmlElement(required = true)
    protected byte[] archivo;
    @XmlElement(required = true)
    protected String nombreArchivo;

    /**
     * Obtiene el valor de la propiedad sistemaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Define el valor de la propiedad sistemaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad parametros.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaEnviarPoder.Parametros }
     *     
     */
    public TipoEntradaEnviarPoder.Parametros getParametros() {
        return parametros;
    }

    /**
     * Define el valor de la propiedad parametros.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaEnviarPoder.Parametros }
     *     
     */
    public void setParametros(TipoEntradaEnviarPoder.Parametros value) {
        this.parametros = value;
    }

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivo(byte[] value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Define el valor de la propiedad nombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
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
     *         &lt;element name="parametro" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dDocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dDocTittle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="xIdcProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="x_Justificacion_Revocado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="x_Tipo_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xDepartamentos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xMunicipios" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xTip_Doc_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xNotaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xCC_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xNombre_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xTip_Doc_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xCC_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xNombre_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xNum_Matricula_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xDireccion_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xDepartamento_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xCiudad_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xNumero_Instrumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xFecha_Instrumento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="xCirculo_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xFinalizacion_Poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="xJustificacion_Usado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dOutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="xEstado_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="xUso_Poder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="xFecha_cargue_poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="xActualizar_Documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dDocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "parametro"
    })
    public static class Parametros {

        protected List<TipoEntradaEnviarPoder.Parametros.Parametro> parametro;

        /**
         * Gets the value of the parametro property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parametro property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParametro().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoEntradaEnviarPoder.Parametros.Parametro }
         * 
         * 
         */
        public List<TipoEntradaEnviarPoder.Parametros.Parametro> getParametro() {
            if (parametro == null) {
                parametro = new ArrayList<TipoEntradaEnviarPoder.Parametros.Parametro>();
            }
            return this.parametro;
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
         *         &lt;element name="dDocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dDocTittle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="xIdcProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="x_Justificacion_Revocado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="x_Tipo_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xDepartamentos" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xMunicipios" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xTip_Doc_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xNotaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xCC_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xNombre_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xTip_Doc_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xCC_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xNombre_Poderdante" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xNum_Matricula_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xDireccion_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xDepartamento_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xCiudad_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xNumero_Instrumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xFecha_Instrumento" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="xCirculo_Predio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xFinalizacion_Poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="xJustificacion_Usado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dOutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="xEstado_Poder" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="xUso_Poder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="xFecha_cargue_poder" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="xActualizar_Documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dDocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dDocType",
            "dDocTittle",
            "xComments",
            "xIdcProfile",
            "xJustificacionRevocado",
            "xTipoPoder",
            "xDepartamentos",
            "xMunicipios",
            "xTipDocApoderado",
            "xNotaria",
            "xccApoderado",
            "xNombreApoderado",
            "xTipDocPoderdante",
            "xccPoderdante",
            "xNombrePoderdante",
            "xNumMatriculaPoder",
            "xDireccionPredio",
            "xDepartamentoPredio",
            "xCiudadPredio",
            "xNumeroInstrumento",
            "xFechaInstrumento",
            "xCirculoPredio",
            "xFinalizacionPoder",
            "xJustificacionUsado",
            "dOutDate",
            "xEstadoPoder",
            "xUsoPoder",
            "xFechaCarguePoder",
            "xActualizarDocumento",
            "dDocName",
            "xDiligenciaReconocimiento",
            "xTipoDocumento"
        })
        public static class Parametro {

            @XmlElement(required = true)
            protected String dDocType;
            @XmlElement(required = true)
            protected String dDocTittle;
            protected String xComments;
            @XmlElement(required = true)
            protected String xIdcProfile;
            @XmlElement(name = "x_Justificacion_Revocado", required = true)
            protected String xJustificacionRevocado;
            @XmlElement(name = "x_Tipo_Poder", required = true)
            protected String xTipoPoder;
            @XmlElement(required = true)
            protected String xDepartamentos;
            @XmlElement(required = true)
            protected String xMunicipios;
            @XmlElement(name = "xTip_Doc_Apoderado", required = true)
            protected String xTipDocApoderado;
            @XmlElement(required = true)
            protected String xNotaria;
            @XmlElement(name = "xCC_Apoderado", required = true)
            protected String xccApoderado;
            @XmlElement(name = "xNombre_Apoderado", required = true)
            protected String xNombreApoderado;
            @XmlElement(name = "xTip_Doc_Poderdante", required = true)
            protected String xTipDocPoderdante;
            @XmlElement(name = "xCC_Poderdante", required = true)
            protected String xccPoderdante;
            @XmlElement(name = "xNombre_Poderdante", required = true)
            protected String xNombrePoderdante;
            @XmlElement(name = "xNum_Matricula_Poder", required = true)
            protected String xNumMatriculaPoder;
            @XmlElement(name = "xDireccion_Predio", required = true)
            protected String xDireccionPredio;
            @XmlElement(name = "xDepartamento_Predio", required = true)
            protected String xDepartamentoPredio;
            @XmlElement(name = "xCiudad_Predio", required = true)
            protected String xCiudadPredio;
            @XmlElement(name = "xNumero_Instrumento", required = true)
            protected String xNumeroInstrumento;
            @XmlElement(name = "xFecha_Instrumento", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar xFechaInstrumento;
            @XmlElement(name = "xCirculo_Predio", required = true)
            protected String xCirculoPredio;
            @XmlElement(name = "xFinalizacion_Poder", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar xFinalizacionPoder;
            @XmlElement(name = "xJustificacion_Usado", required = true)
            protected String xJustificacionUsado;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dOutDate;
            @XmlElement(name = "xEstado_Poder", required = true)
            protected String xEstadoPoder;
            @XmlElement(name = "xUso_Poder")
            protected String xUsoPoder;
            @XmlElement(name = "xFecha_cargue_poder", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar xFechaCarguePoder;
            @XmlElement(name = "xActualizar_Documento", required = true)
            protected String xActualizarDocumento;
            protected String dDocName;
            @XmlElement(name = "xDiligenciaReconocimiento")
            protected String xDiligenciaReconocimiento;
            @XmlElement(name = "xTipo_Documento")
            protected String xTipoDocumento;

            /**
             * Obtiene el valor de la propiedad dDocType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDocType() {
                return dDocType;
            }

            /**
             * Define el valor de la propiedad dDocType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDocType(String value) {
                this.dDocType = value;
            }
            

            public String getxDiligenciaReconocimiento() {
				return xDiligenciaReconocimiento;
			}

			public void setxDiligenciaReconocimiento(String xDiligenciaReconocimiento) {
				this.xDiligenciaReconocimiento = xDiligenciaReconocimiento;
			}
			
			public String getxTipoDocumento() {
				return xTipoDocumento;
			}

			public void setxTipoDocumento(String xTipoDocumento) {
				this.xTipoDocumento = xTipoDocumento;
			}

			/**
             * Obtiene el valor de la propiedad dDocTittle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDocTittle() {
                return dDocTittle;
            }

            /**
             * Define el valor de la propiedad dDocTittle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDocTittle(String value) {
                this.dDocTittle = value;
            }

            /**
             * Obtiene el valor de la propiedad xComments.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXComments() {
                return xComments;
            }

            /**
             * Define el valor de la propiedad xComments.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXComments(String value) {
                this.xComments = value;
            }

            /**
             * Obtiene el valor de la propiedad xIdcProfile.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXIdcProfile() {
                return xIdcProfile;
            }

            /**
             * Define el valor de la propiedad xIdcProfile.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXIdcProfile(String value) {
                this.xIdcProfile = value;
            }

            /**
             * Obtiene el valor de la propiedad xJustificacionRevocado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXJustificacionRevocado() {
                return xJustificacionRevocado;
            }

            /**
             * Define el valor de la propiedad xJustificacionRevocado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXJustificacionRevocado(String value) {
                this.xJustificacionRevocado = value;
            }

            /**
             * Obtiene el valor de la propiedad xTipoPoder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXTipoPoder() {
                return xTipoPoder;
            }

            /**
             * Define el valor de la propiedad xTipoPoder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXTipoPoder(String value) {
                this.xTipoPoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xDepartamentos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDepartamentos() {
                return xDepartamentos;
            }

            /**
             * Define el valor de la propiedad xDepartamentos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDepartamentos(String value) {
                this.xDepartamentos = value;
            }

            /**
             * Obtiene el valor de la propiedad xMunicipios.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunicipios() {
                return xMunicipios;
            }

            /**
             * Define el valor de la propiedad xMunicipios.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunicipios(String value) {
                this.xMunicipios = value;
            }

            /**
             * Obtiene el valor de la propiedad xTipDocApoderado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXTipDocApoderado() {
                return xTipDocApoderado;
            }

            /**
             * Define el valor de la propiedad xTipDocApoderado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXTipDocApoderado(String value) {
                this.xTipDocApoderado = value;
            }

            /**
             * Obtiene el valor de la propiedad xNotaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNotaria() {
                return xNotaria;
            }

            /**
             * Define el valor de la propiedad xNotaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNotaria(String value) {
                this.xNotaria = value;
            }

            /**
             * Obtiene el valor de la propiedad xccApoderado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCCApoderado() {
                return xccApoderado;
            }

            /**
             * Define el valor de la propiedad xccApoderado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCCApoderado(String value) {
                this.xccApoderado = value;
            }

            /**
             * Obtiene el valor de la propiedad xNombreApoderado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNombreApoderado() {
                return xNombreApoderado;
            }

            /**
             * Define el valor de la propiedad xNombreApoderado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNombreApoderado(String value) {
                this.xNombreApoderado = value;
            }

            /**
             * Obtiene el valor de la propiedad xTipDocPoderdante.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXTipDocPoderdante() {
                return xTipDocPoderdante;
            }

            /**
             * Define el valor de la propiedad xTipDocPoderdante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXTipDocPoderdante(String value) {
                this.xTipDocPoderdante = value;
            }

            /**
             * Obtiene el valor de la propiedad xccPoderdante.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCCPoderdante() {
                return xccPoderdante;
            }

            /**
             * Define el valor de la propiedad xccPoderdante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCCPoderdante(String value) {
                this.xccPoderdante = value;
            }

            /**
             * Obtiene el valor de la propiedad xNombrePoderdante.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNombrePoderdante() {
                return xNombrePoderdante;
            }

            /**
             * Define el valor de la propiedad xNombrePoderdante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNombrePoderdante(String value) {
                this.xNombrePoderdante = value;
            }

            /**
             * Obtiene el valor de la propiedad xNumMatriculaPoder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNumMatriculaPoder() {
                return xNumMatriculaPoder;
            }

            /**
             * Define el valor de la propiedad xNumMatriculaPoder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNumMatriculaPoder(String value) {
                this.xNumMatriculaPoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xDireccionPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDireccionPredio() {
                return xDireccionPredio;
            }

            /**
             * Define el valor de la propiedad xDireccionPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDireccionPredio(String value) {
                this.xDireccionPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad xDepartamentoPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDepartamentoPredio() {
                return xDepartamentoPredio;
            }

            /**
             * Define el valor de la propiedad xDepartamentoPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDepartamentoPredio(String value) {
                this.xDepartamentoPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad xCiudadPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCiudadPredio() {
                return xCiudadPredio;
            }

            /**
             * Define el valor de la propiedad xCiudadPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCiudadPredio(String value) {
                this.xCiudadPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad xNumeroInstrumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNumeroInstrumento() {
                return xNumeroInstrumento;
            }

            /**
             * Define el valor de la propiedad xNumeroInstrumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNumeroInstrumento(String value) {
                this.xNumeroInstrumento = value;
            }

            /**
             * Obtiene el valor de la propiedad xFechaInstrumento.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getXFechaInstrumento() {
                return xFechaInstrumento;
            }

            /**
             * Define el valor de la propiedad xFechaInstrumento.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setXFechaInstrumento(XMLGregorianCalendar value) {
                this.xFechaInstrumento = value;
            }

            /**
             * Obtiene el valor de la propiedad xCirculoPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCirculoPredio() {
                return xCirculoPredio;
            }

            /**
             * Define el valor de la propiedad xCirculoPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCirculoPredio(String value) {
                this.xCirculoPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad xFinalizacionPoder.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getXFinalizacionPoder() {
                return xFinalizacionPoder;
            }

            /**
             * Define el valor de la propiedad xFinalizacionPoder.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setXFinalizacionPoder(XMLGregorianCalendar value) {
                this.xFinalizacionPoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xJustificacionUsado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXJustificacionUsado() {
                return xJustificacionUsado;
            }

            /**
             * Define el valor de la propiedad xJustificacionUsado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXJustificacionUsado(String value) {
                this.xJustificacionUsado = value;
            }

            /**
             * Obtiene el valor de la propiedad dOutDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDOutDate() {
                return dOutDate;
            }

            /**
             * Define el valor de la propiedad dOutDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDOutDate(XMLGregorianCalendar value) {
                this.dOutDate = value;
            }

            /**
             * Obtiene el valor de la propiedad xEstadoPoder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXEstadoPoder() {
                return xEstadoPoder;
            }

            /**
             * Define el valor de la propiedad xEstadoPoder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXEstadoPoder(String value) {
                this.xEstadoPoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xUsoPoder.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXUsoPoder() {
                return xUsoPoder;
            }

            /**
             * Define el valor de la propiedad xUsoPoder.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXUsoPoder(String value) {
                this.xUsoPoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xFechaCarguePoder.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getXFechaCarguePoder() {
                return xFechaCarguePoder;
            }

            /**
             * Define el valor de la propiedad xFechaCarguePoder.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setXFechaCarguePoder(XMLGregorianCalendar value) {
                this.xFechaCarguePoder = value;
            }

            /**
             * Obtiene el valor de la propiedad xActualizarDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXActualizarDocumento() {
                return xActualizarDocumento;
            }

            /**
             * Define el valor de la propiedad xActualizarDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXActualizarDocumento(String value) {
                this.xActualizarDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad dDocName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDocName() {
                return dDocName;
            }

            /**
             * Define el valor de la propiedad dDocName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDocName(String value) {
                this.dDocName = value;
            }

        }

    }

}
