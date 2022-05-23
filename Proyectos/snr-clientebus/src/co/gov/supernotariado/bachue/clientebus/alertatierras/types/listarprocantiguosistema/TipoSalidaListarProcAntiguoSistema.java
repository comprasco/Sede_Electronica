
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaListarProcAntiguoSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaListarProcAntiguoSistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaProcesosAS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procesoAS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nomPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nomDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nomMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tipoPredio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numLibro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="numTomo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="idTipoPartida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numPartida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="numFolio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="nomPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "tipoSalidaListarProcAntiguoSistema", propOrder = {
    "codigo",
    "mensaje",
    "listaProcesosAS"
})
public class TipoSalidaListarProcAntiguoSistema {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected TipoSalidaListarProcAntiguoSistema.ListaProcesosAS listaProcesosAS;

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
     * Obtiene el valor de la propiedad listaProcesosAS.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaListarProcAntiguoSistema.ListaProcesosAS }
     *     
     */
    public TipoSalidaListarProcAntiguoSistema.ListaProcesosAS getListaProcesosAS() {
        return listaProcesosAS;
    }

    /**
     * Define el valor de la propiedad listaProcesosAS.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaListarProcAntiguoSistema.ListaProcesosAS }
     *     
     */
    public void setListaProcesosAS(TipoSalidaListarProcAntiguoSistema.ListaProcesosAS value) {
        this.listaProcesosAS = value;
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
     *         &lt;element name="procesoAS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nomPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nomDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nomMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tipoPredio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numLibro" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="numTomo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="idTipoPartida" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numPartida" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="numFolio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="nomPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "procesoAS"
    })
    public static class ListaProcesosAS {

        protected List<TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS> procesoAS;

        /**
         * Gets the value of the procesoAS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procesoAS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcesoAS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS }
         * 
         * 
         */
        public List<TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS> getProcesoAS() {
            if (procesoAS == null) {
                procesoAS = new ArrayList<>();
            }
            return this.procesoAS;
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
         *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nomPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nomDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nomMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tipoPredio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numLibro" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="numTomo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="idTipoPartida" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numPartida" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="numFolio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="nomPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "idAlerta",
            "nomCirculoRegistral",
            "nomPais",
            "nomDepartamento",
            "nomMunicipio",
            "tipoPredio",
            "numLibro",
            "numTomo",
            "idTipoPartida",
            "numPartida",
            "numFolio",
            "anio",
            "nomPredio",
            "numPredio"
        })
        public static class ProcesoAS {

            protected int idAlerta;
            @XmlElement(required = true)
            protected String nomCirculoRegistral;
            @XmlElement(required = true)
            protected String nomPais;
            @XmlElement(required = true)
            protected String nomDepartamento;
            @XmlElement(required = true)
            protected String nomMunicipio;
            @XmlElement(required = true)
            protected String tipoPredio;
            protected int numLibro;
            protected int numTomo;
            @XmlElement(required = true)
            protected String idTipoPartida;
            protected int numPartida;
            protected int numFolio;
            protected int anio;
            protected String nomPredio;
            protected Integer numPredio;

            /**
             * Obtiene el valor de la propiedad idAlerta.
             * 
             */
            public int getIdAlerta() {
                return idAlerta;
            }

            /**
             * Define el valor de la propiedad idAlerta.
             * 
             */
            public void setIdAlerta(int value) {
                this.idAlerta = value;
            }

            /**
             * Obtiene el valor de la propiedad nomCirculoRegistral.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomCirculoRegistral() {
                return nomCirculoRegistral;
            }

            /**
             * Define el valor de la propiedad nomCirculoRegistral.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomCirculoRegistral(String value) {
                this.nomCirculoRegistral = value;
            }

            /**
             * Obtiene el valor de la propiedad nomPais.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomPais() {
                return nomPais;
            }

            /**
             * Define el valor de la propiedad nomPais.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomPais(String value) {
                this.nomPais = value;
            }

            /**
             * Obtiene el valor de la propiedad nomDepartamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomDepartamento() {
                return nomDepartamento;
            }

            /**
             * Define el valor de la propiedad nomDepartamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomDepartamento(String value) {
                this.nomDepartamento = value;
            }

            /**
             * Obtiene el valor de la propiedad nomMunicipio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomMunicipio() {
                return nomMunicipio;
            }

            /**
             * Define el valor de la propiedad nomMunicipio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomMunicipio(String value) {
                this.nomMunicipio = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoPredio() {
                return tipoPredio;
            }

            /**
             * Define el valor de la propiedad tipoPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoPredio(String value) {
                this.tipoPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad numLibro.
             * 
             */
            public int getNumLibro() {
                return numLibro;
            }

            /**
             * Define el valor de la propiedad numLibro.
             * 
             */
            public void setNumLibro(int value) {
                this.numLibro = value;
            }

            /**
             * Obtiene el valor de la propiedad numTomo.
             * 
             */
            public int getNumTomo() {
                return numTomo;
            }

            /**
             * Define el valor de la propiedad numTomo.
             * 
             */
            public void setNumTomo(int value) {
                this.numTomo = value;
            }

            /**
             * Obtiene el valor de la propiedad idTipoPartida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdTipoPartida() {
                return idTipoPartida;
            }

            /**
             * Define el valor de la propiedad idTipoPartida.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdTipoPartida(String value) {
                this.idTipoPartida = value;
            }

            /**
             * Obtiene el valor de la propiedad numPartida.
             * 
             */
            public int getNumPartida() {
                return numPartida;
            }

            /**
             * Define el valor de la propiedad numPartida.
             * 
             */
            public void setNumPartida(int value) {
                this.numPartida = value;
            }

            /**
             * Obtiene el valor de la propiedad numFolio.
             * 
             */
            public int getNumFolio() {
                return numFolio;
            }

            /**
             * Define el valor de la propiedad numFolio.
             * 
             */
            public void setNumFolio(int value) {
                this.numFolio = value;
            }

            /**
             * Obtiene el valor de la propiedad anio.
             * 
             */
            public int getAnio() {
                return anio;
            }

            /**
             * Define el valor de la propiedad anio.
             * 
             */
            public void setAnio(int value) {
                this.anio = value;
            }

            /**
             * Obtiene el valor de la propiedad nomPredio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomPredio() {
                return nomPredio;
            }

            /**
             * Define el valor de la propiedad nomPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomPredio(String value) {
                this.nomPredio = value;
            }

            /**
             * Obtiene el valor de la propiedad numPredio.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumPredio() {
                return numPredio;
            }

            /**
             * Define el valor de la propiedad numPredio.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumPredio(Integer value) {
                this.numPredio = value;
            }

        }

    }

}
