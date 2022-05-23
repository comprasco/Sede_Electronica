
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoSalidaConsultarAlertas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarAlertas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaAlertas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alerta" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="estadoAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombreComunidadEtnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoSalidaConsultarAlertas", propOrder = {
    "codigo",
    "mensaje",
    "listaAlertas"
})
public class TipoSalidaConsultarAlertas {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected TipoSalidaConsultarAlertas.ListaAlertas listaAlertas;

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
     * Obtiene el valor de la propiedad listaAlertas.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarAlertas.ListaAlertas }
     *     
     */
    public TipoSalidaConsultarAlertas.ListaAlertas getListaAlertas() {
        return listaAlertas;
    }

    /**
     * Define el valor de la propiedad listaAlertas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarAlertas.ListaAlertas }
     *     
     */
    public void setListaAlertas(TipoSalidaConsultarAlertas.ListaAlertas value) {
        this.listaAlertas = value;
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
     *         &lt;element name="alerta" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="estadoAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombreComunidadEtnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "alerta"
    })
    public static class ListaAlertas {

        protected List<TipoSalidaConsultarAlertas.ListaAlertas.Alerta> alerta;

        /**
         * Gets the value of the alerta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alerta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlerta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultarAlertas.ListaAlertas.Alerta }
         * 
         * 
         */
        public List<TipoSalidaConsultarAlertas.ListaAlertas.Alerta> getAlerta() {
            if (alerta == null) {
                alerta = new ArrayList<>();
            }
            return this.alerta;
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
         *         &lt;element name="estadoAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="codTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombreComunidadEtnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "estadoAlerta",
            "nombreEntidad",
            "fechaInscripcion",
            "codTipoDocumentoPublico",
            "nombreComunidadEtnica"
        })
        public static class Alerta {

            protected int idAlerta;
            @XmlElement(required = true)
            protected String estadoAlerta;
            @XmlElement(required = true)
            protected String nombreEntidad;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaInscripcion;
            @XmlElement(required = true)
            protected String codTipoDocumentoPublico;
            @XmlElement(required = true)
            protected String nombreComunidadEtnica;

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
             * Obtiene el valor de la propiedad estadoAlerta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstadoAlerta() {
                return estadoAlerta;
            }

            /**
             * Define el valor de la propiedad estadoAlerta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstadoAlerta(String value) {
                this.estadoAlerta = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEntidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEntidad() {
                return nombreEntidad;
            }

            /**
             * Define el valor de la propiedad nombreEntidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEntidad(String value) {
                this.nombreEntidad = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaInscripcion.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaInscripcion() {
                return fechaInscripcion;
            }

            /**
             * Define el valor de la propiedad fechaInscripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaInscripcion(XMLGregorianCalendar value) {
                this.fechaInscripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad codTipoDocumentoPublico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodTipoDocumentoPublico() {
                return codTipoDocumentoPublico;
            }

            /**
             * Define el valor de la propiedad codTipoDocumentoPublico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodTipoDocumentoPublico(String value) {
                this.codTipoDocumentoPublico = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreComunidadEtnica.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreComunidadEtnica() {
                return nombreComunidadEtnica;
            }

            /**
             * Define el valor de la propiedad nombreComunidadEtnica.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreComunidadEtnica(String value) {
                this.nombreComunidadEtnica = value;
            }

        }

    }

}
