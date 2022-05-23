
package co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud;

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
 *         &lt;element name="listaDocumentos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentoSGD" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tipoDocumental" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "listaDocumentos"
})
public class TipoEntradaIngresoSolicitud {

    @XmlElement(required = true)
    protected TipoEntradaIngresoSolicitud.ListaDocumentos listaDocumentos;

    /**
     * Obtiene el valor de la propiedad listaDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntradaIngresoSolicitud.ListaDocumentos }
     *     
     */
    public TipoEntradaIngresoSolicitud.ListaDocumentos getListaDocumentos() {
        return listaDocumentos;
    }

    /**
     * Define el valor de la propiedad listaDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntradaIngresoSolicitud.ListaDocumentos }
     *     
     */
    public void setListaDocumentos(TipoEntradaIngresoSolicitud.ListaDocumentos value) {
        this.listaDocumentos = value;
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
     *         &lt;element name="documentoSGD" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tipoDocumental" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "documentoSGD"
    })
    public static class ListaDocumentos {

        @XmlElement(required = true)
        protected List<TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD> documentoSGD;

        /**
         * Gets the value of the documentoSGD property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentoSGD property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentoSGD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD }
         * 
         * 
         */
        public List<TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD> getDocumentoSGD() {
            if (documentoSGD == null) {
                documentoSGD = new ArrayList<>();
            }
            return this.documentoSGD;
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
         *         &lt;element name="dId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tipoDocumental" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "dId",
            "docName",
            "tipoDocumental"
        })
        public static class DocumentoSGD {

            @XmlElement(required = true)
            protected String dId;
            @XmlElement(required = true)
            protected String docName;
            @XmlElement(required = true)
            protected String tipoDocumental;

            /**
             * Obtiene el valor de la propiedad dId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDId() {
                return dId;
            }

            /**
             * Define el valor de la propiedad dId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDId(String value) {
                this.dId = value;
            }

            /**
             * Obtiene el valor de la propiedad docName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocName() {
                return docName;
            }

            /**
             * Define el valor de la propiedad docName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocName(String value) {
                this.docName = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDocumental.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDocumental() {
                return tipoDocumental;
            }

            /**
             * Define el valor de la propiedad tipoDocumental.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDocumental(String value) {
                this.tipoDocumental = value;
            }

        }

    }

}
