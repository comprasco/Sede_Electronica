
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultaDetalleCertificado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultaDetalleCertificado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="certificado" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="subproceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tipoTarifa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoSalidaConsultaDetalleCertificado", propOrder = {
    "nir",
    "certificados",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultaDetalleCertificado {

    @XmlElement(required = true)
    protected String nir;
    @XmlElement(required = true)
    protected TipoSalidaConsultaDetalleCertificado.Certificados certificados;
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
     * Obtiene el valor de la propiedad certificados.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultaDetalleCertificado.Certificados }
     *     
     */
    public TipoSalidaConsultaDetalleCertificado.Certificados getCertificados() {
        return certificados;
    }

    /**
     * Define el valor de la propiedad certificados.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultaDetalleCertificado.Certificados }
     *     
     */
    public void setCertificados(TipoSalidaConsultaDetalleCertificado.Certificados value) {
        this.certificados = value;
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
     *         &lt;element name="certificado" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="subproceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tipoTarifa" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "certificado"
    })
    public static class Certificados {

        protected List<TipoSalidaConsultaDetalleCertificado.Certificados.Certificado> certificado;

        /**
         * Gets the value of the certificado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the certificado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultaDetalleCertificado.Certificados.Certificado }
         * 
         * 
         */
        public List<TipoSalidaConsultaDetalleCertificado.Certificados.Certificado> getCertificado() {
            if (certificado == null) {
                certificado = new ArrayList<TipoSalidaConsultaDetalleCertificado.Certificados.Certificado>();
            }
            return this.certificado;
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
         *         &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="subproceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tipoTarifa" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "proceso",
            "subproceso",
            "nombre",
            "codCirculoRegistral",
            "numMatriculaInmobiliaria",
            "tipoTarifa",
            "cantidad",
            "valor",
            "valorTotal"
        })
        public static class Certificado {

            @XmlElement(required = true)
            protected String proceso;
            @XmlElement(required = true)
            protected String subproceso;
            @XmlElement(required = true)
            protected String nombre;
            @XmlElement(required = true)
            protected String codCirculoRegistral;
            @XmlElement(required = true)
            protected String numMatriculaInmobiliaria;
            @XmlElement(required = true)
            protected String tipoTarifa;
            @XmlElement(required = true)
            protected String cantidad;
            @XmlElement(required = true)
            protected String valor;
            @XmlElement(required = true)
            protected String valorTotal;

            /**
             * Obtiene el valor de la propiedad proceso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProceso() {
                return proceso;
            }

            /**
             * Define el valor de la propiedad proceso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProceso(String value) {
                this.proceso = value;
            }

            /**
             * Obtiene el valor de la propiedad subproceso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubproceso() {
                return subproceso;
            }

            /**
             * Define el valor de la propiedad subproceso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubproceso(String value) {
                this.subproceso = value;
            }

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

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
             * Obtiene el valor de la propiedad tipoTarifa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoTarifa() {
                return tipoTarifa;
            }

            /**
             * Define el valor de la propiedad tipoTarifa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoTarifa(String value) {
                this.tipoTarifa = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCantidad(String value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad valor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValor() {
                return valor;
            }

            /**
             * Define el valor de la propiedad valor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValor(String value) {
                this.valor = value;
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
