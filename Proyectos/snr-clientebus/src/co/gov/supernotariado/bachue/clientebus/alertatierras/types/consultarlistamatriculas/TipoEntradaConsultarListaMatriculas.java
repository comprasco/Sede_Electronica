
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarListaMatriculas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarListaMatriculas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaMatricula">
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
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "tipoEntradaConsultarListaMatriculas", propOrder = {
    "listaMatricula"
})
public class TipoEntradaConsultarListaMatriculas {

    @XmlElement(required = true)
    protected TipoEntradaConsultarListaMatriculas.ListaMatricula listaMatricula;

    /**
     * Obtiene el valor de la propiedad listaMatricula.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaConsultarListaMatriculas.ListaMatricula }
     *     
     */
    public TipoEntradaConsultarListaMatriculas.ListaMatricula getListaMatricula() {
        return listaMatricula;
    }

    /**
     * Define el valor de la propiedad listaMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaConsultarListaMatriculas.ListaMatricula }
     *     
     */
    public void setListaMatricula(TipoEntradaConsultarListaMatriculas.ListaMatricula value) {
        this.listaMatricula = value;
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
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    public static class ListaMatricula {

        @XmlElement(required = true)
        protected List<TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula> matricula;

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
         * {@link TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula }
         * 
         * 
         */
        public List<TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula> getMatricula() {
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
            "numMatriculaInmobiliaria"
        })
        public static class Matricula {

            @XmlElement(required = true)
            protected String codCirculoRegistral;
            protected int numMatriculaInmobiliaria;

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

        }

    }

}
