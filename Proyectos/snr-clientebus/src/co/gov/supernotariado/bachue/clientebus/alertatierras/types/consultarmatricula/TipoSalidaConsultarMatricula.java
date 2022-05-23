
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarMatricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaMatriculas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="matricula" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="esDerivada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoSalidaConsultarMatricula", propOrder = {
    "codigo",
    "mensaje",
    "listaMatriculas"
})
public class TipoSalidaConsultarMatricula {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    protected TipoSalidaConsultarMatricula.ListaMatriculas listaMatriculas;

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
     * Obtiene el valor de la propiedad listaMatriculas.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarMatricula.ListaMatriculas }
     *     
     */
    public TipoSalidaConsultarMatricula.ListaMatriculas getListaMatriculas() {
        return listaMatriculas;
    }

    /**
     * Define el valor de la propiedad listaMatriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarMatricula.ListaMatriculas }
     *     
     */
    public void setListaMatriculas(TipoSalidaConsultarMatricula.ListaMatriculas value) {
        this.listaMatriculas = value;
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
     *         &lt;element name="matricula" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="esDerivada" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class ListaMatriculas {

        protected List<TipoSalidaConsultarMatricula.ListaMatriculas.Matricula> matricula;

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
         * {@link TipoSalidaConsultarMatricula.ListaMatriculas.Matricula }
         * 
         * 
         */
        public List<TipoSalidaConsultarMatricula.ListaMatriculas.Matricula> getMatricula() {
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
         *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="esDerivada" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "esDerivada",
            "numPredial"
        })
        public static class Matricula {

            @XmlElement(required = true)
            protected String codCirculoRegistral;
            protected int numMatriculaInmobiliaria;
            @XmlElement(required = true)
            protected String esDerivada;
            @XmlElement(required = true)
            protected String numPredial;

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
             */
            public int getNumMatriculaInmobiliaria() {
                return numMatriculaInmobiliaria;
            }

            /**
             * Define el valor de la propiedad numMatriculaInmobiliaria.
             * 
             */
            public void setNumMatriculaInmobiliaria(int value) {
                this.numMatriculaInmobiliaria = value;
            }

            /**
             * Obtiene el valor de la propiedad esDerivada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEsDerivada() {
                return esDerivada;
            }

            /**
             * Define el valor de la propiedad esDerivada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEsDerivada(String value) {
                this.esDerivada = value;
            }

            /**
             * Obtiene el valor de la propiedad numPredial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPredial() {
                return numPredial;
            }

            /**
             * Define el valor de la propiedad numPredial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPredial(String value) {
                this.numPredial = value;
            }

        }

    }

}
