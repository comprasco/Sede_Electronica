
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoSalidaConsultarDetalleAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarDetalleAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesoNroRadicado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesoFechaRadicado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nomOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docIdSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docNameSGD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nitComunidadEtnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInactivacionAlerta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creadoSNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaMatriculas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="matricula" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="inactivacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoInactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nomOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="docIdSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="docNameSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="textoInactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaAlertasGeneradas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alertaGenerada" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="usuarioGenerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tipoSalidaConsultarDetalleAlerta", propOrder = {
    "codigo",
    "mensaje",
    "tipoAlerta",
    "nombreEntidad",
    "procesoNroRadicado",
    "procesoFechaRadicado",
    "nomOficinaOrigen",
    "nomTipoDocumentoPublico",
    "fechaDocumento",
    "docNumero",
    "docIdSGD",
    "docNameSGD",
    "nitComunidadEtnica",
    "estado",
    "fechaInactivacionAlerta",
    "creadoSNR",
    "listaMatriculas",
    "inactivacion",
    "listaAlertasGeneradas",
    "listaProcesosAS"
})
public class TipoSalidaConsultarDetalleAlerta {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected String tipoAlerta;
    @XmlElement(required = true)
    protected String nombreEntidad;
    @XmlElement(required = true)
    protected String procesoNroRadicado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procesoFechaRadicado;
    @XmlElement(required = true)
    protected String nomOficinaOrigen;
    @XmlElement(required = true)
    protected String nomTipoDocumentoPublico;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumento;
    @XmlElement(required = true)
    protected String docNumero;
    @XmlElement(required = true)
    protected String docIdSGD;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docNameSGD;
    protected String nitComunidadEtnica;
    @XmlElement(required = true)
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInactivacionAlerta;
    @XmlElement(required = true)
    protected String creadoSNR;
    @XmlElement(required = true)
    protected TipoSalidaConsultarDetalleAlerta.ListaMatriculas listaMatriculas;
    protected TipoSalidaConsultarDetalleAlerta.Inactivacion inactivacion;
    @XmlElement(required = true)
    protected TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas listaAlertasGeneradas;
    @XmlElement(required = true)
    protected TipoSalidaConsultarDetalleAlerta.ListaProcesosAS listaProcesosAS;

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
     * Obtiene el valor de la propiedad tipoAlerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAlerta() {
        return tipoAlerta;
    }

    /**
     * Define el valor de la propiedad tipoAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAlerta(String value) {
        this.tipoAlerta = value;
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
     * Obtiene el valor de la propiedad procesoNroRadicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesoNroRadicado() {
        return procesoNroRadicado;
    }

    /**
     * Define el valor de la propiedad procesoNroRadicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesoNroRadicado(String value) {
        this.procesoNroRadicado = value;
    }

    /**
     * Obtiene el valor de la propiedad procesoFechaRadicado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcesoFechaRadicado() {
        return procesoFechaRadicado;
    }

    /**
     * Define el valor de la propiedad procesoFechaRadicado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcesoFechaRadicado(XMLGregorianCalendar value) {
        this.procesoFechaRadicado = value;
    }

    /**
     * Obtiene el valor de la propiedad nomOficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomOficinaOrigen() {
        return nomOficinaOrigen;
    }

    /**
     * Define el valor de la propiedad nomOficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomOficinaOrigen(String value) {
        this.nomOficinaOrigen = value;
    }

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

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumento(XMLGregorianCalendar value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumero() {
        return docNumero;
    }

    /**
     * Define el valor de la propiedad docNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumero(String value) {
        this.docNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad docIdSGD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdSGD() {
        return docIdSGD;
    }

    /**
     * Define el valor de la propiedad docIdSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdSGD(String value) {
        this.docIdSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad docNameSGD.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocNameSGD() {
        return docNameSGD;
    }

    /**
     * Define el valor de la propiedad docNameSGD.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocNameSGD(XMLGregorianCalendar value) {
        this.docNameSGD = value;
    }

    /**
     * Obtiene el valor de la propiedad nitComunidadEtnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitComunidadEtnica() {
        return nitComunidadEtnica;
    }

    /**
     * Define el valor de la propiedad nitComunidadEtnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitComunidadEtnica(String value) {
        this.nitComunidadEtnica = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInactivacionAlerta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInactivacionAlerta() {
        return fechaInactivacionAlerta;
    }

    /**
     * Define el valor de la propiedad fechaInactivacionAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInactivacionAlerta(XMLGregorianCalendar value) {
        this.fechaInactivacionAlerta = value;
    }

    /**
     * Obtiene el valor de la propiedad creadoSNR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreadoSNR() {
        return creadoSNR;
    }

    /**
     * Define el valor de la propiedad creadoSNR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreadoSNR(String value) {
        this.creadoSNR = value;
    }

    /**
     * Obtiene el valor de la propiedad listaMatriculas.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaMatriculas }
     *     
     */
    public TipoSalidaConsultarDetalleAlerta.ListaMatriculas getListaMatriculas() {
        return listaMatriculas;
    }

    /**
     * Define el valor de la propiedad listaMatriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaMatriculas }
     *     
     */
    public void setListaMatriculas(TipoSalidaConsultarDetalleAlerta.ListaMatriculas value) {
        this.listaMatriculas = value;
    }

    /**
     * Obtiene el valor de la propiedad inactivacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarDetalleAlerta.Inactivacion }
     *     
     */
    public TipoSalidaConsultarDetalleAlerta.Inactivacion getInactivacion() {
        return inactivacion;
    }

    /**
     * Define el valor de la propiedad inactivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarDetalleAlerta.Inactivacion }
     *     
     */
    public void setInactivacion(TipoSalidaConsultarDetalleAlerta.Inactivacion value) {
        this.inactivacion = value;
    }

    /**
     * Obtiene el valor de la propiedad listaAlertasGeneradas.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas }
     *     
     */
    public TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas getListaAlertasGeneradas() {
        return listaAlertasGeneradas;
    }

    /**
     * Define el valor de la propiedad listaAlertasGeneradas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas }
     *     
     */
    public void setListaAlertasGeneradas(TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas value) {
        this.listaAlertasGeneradas = value;
    }

    /**
     * Obtiene el valor de la propiedad listaProcesosAS.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaProcesosAS }
     *     
     */
    public TipoSalidaConsultarDetalleAlerta.ListaProcesosAS getListaProcesosAS() {
        return listaProcesosAS;
    }

    /**
     * Define el valor de la propiedad listaProcesosAS.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarDetalleAlerta.ListaProcesosAS }
     *     
     */
    public void setListaProcesosAS(TipoSalidaConsultarDetalleAlerta.ListaProcesosAS value) {
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
     *         &lt;element name="motivoInactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nomOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nomTipoDocumentoPublico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="docNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="docIdSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="docNameSGD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="textoInactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "motivoInactivacion",
        "nomOficinaOrigen",
        "nomTipoDocumentoPublico",
        "fechaDocumento",
        "docNumero",
        "docIdSGD",
        "docNameSGD",
        "textoInactivacion"
    })
    public static class Inactivacion {

        @XmlElement(required = true)
        protected String motivoInactivacion;
        @XmlElement(required = true)
        protected String nomOficinaOrigen;
        @XmlElement(required = true)
        protected String nomTipoDocumentoPublico;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlElement(required = true)
        protected String docNumero;
        @XmlElement(required = true)
        protected String docIdSGD;
        @XmlElement(required = true)
        protected String docNameSGD;
        @XmlElement(required = true)
        protected String textoInactivacion;

        /**
         * Obtiene el valor de la propiedad motivoInactivacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoInactivacion() {
            return motivoInactivacion;
        }

        /**
         * Define el valor de la propiedad motivoInactivacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoInactivacion(String value) {
            this.motivoInactivacion = value;
        }

        /**
         * Obtiene el valor de la propiedad nomOficinaOrigen.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomOficinaOrigen() {
            return nomOficinaOrigen;
        }

        /**
         * Define el valor de la propiedad nomOficinaOrigen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomOficinaOrigen(String value) {
            this.nomOficinaOrigen = value;
        }

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

        /**
         * Obtiene el valor de la propiedad fechaDocumento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDocumento() {
            return fechaDocumento;
        }

        /**
         * Define el valor de la propiedad fechaDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDocumento(XMLGregorianCalendar value) {
            this.fechaDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad docNumero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNumero() {
            return docNumero;
        }

        /**
         * Define el valor de la propiedad docNumero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNumero(String value) {
            this.docNumero = value;
        }

        /**
         * Obtiene el valor de la propiedad docIdSGD.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocIdSGD() {
            return docIdSGD;
        }

        /**
         * Define el valor de la propiedad docIdSGD.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocIdSGD(String value) {
            this.docIdSGD = value;
        }

        /**
         * Obtiene el valor de la propiedad docNameSGD.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNameSGD() {
            return docNameSGD;
        }

        /**
         * Define el valor de la propiedad docNameSGD.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNameSGD(String value) {
            this.docNameSGD = value;
        }

        /**
         * Obtiene el valor de la propiedad textoInactivacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextoInactivacion() {
            return textoInactivacion;
        }

        /**
         * Define el valor de la propiedad textoInactivacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextoInactivacion(String value) {
            this.textoInactivacion = value;
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
     *         &lt;element name="alertaGenerada" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="usuarioGenerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "alertaGenerada"
    })
    public static class ListaAlertasGeneradas {

        protected List<TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada> alertaGenerada;

        /**
         * Gets the value of the alertaGenerada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alertaGenerada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlertaGenerada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada }
         * 
         * 
         */
        public List<TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada> getAlertaGenerada() {
            if (alertaGenerada == null) {
                alertaGenerada = new ArrayList<>();
            }
            return this.alertaGenerada;
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
         *         &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="usuarioGenerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "nomCirculoRegistral",
            "numMatriculaInmobiliaria",
            "turno",
            "texto",
            "usuarioGenerador"
        })
        public static class AlertaGenerada {

            @XmlElement(required = true)
            protected String nomCirculoRegistral;
            protected int numMatriculaInmobiliaria;
            @XmlElement(required = true)
            protected String turno;
            protected String texto;
            protected String usuarioGenerador;

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
             * Obtiene el valor de la propiedad turno.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTurno() {
                return turno;
            }

            /**
             * Define el valor de la propiedad turno.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTurno(String value) {
                this.turno = value;
            }

            /**
             * Obtiene el valor de la propiedad texto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTexto() {
                return texto;
            }

            /**
             * Define el valor de la propiedad texto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTexto(String value) {
                this.texto = value;
            }

            /**
             * Obtiene el valor de la propiedad usuarioGenerador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsuarioGenerador() {
                return usuarioGenerador;
            }

            /**
             * Define el valor de la propiedad usuarioGenerador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsuarioGenerador(String value) {
                this.usuarioGenerador = value;
            }

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
     *         &lt;element name="matricula" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

        protected List<TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula> matricula;

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
         * {@link TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula }
         * 
         * 
         */
        public List<TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula> getMatricula() {
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
         *         &lt;element name="nomCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "nomCirculoRegistral",
            "numMatriculaInmobiliaria",
            "numPredial"
        })
        public static class Matricula {

            @XmlElement(required = true)
            protected String nomCirculoRegistral;
            @XmlElement(required = true)
            protected String numMatriculaInmobiliaria;
            protected String numPredial;

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

        protected List<TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS> procesoAS;

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
         * {@link TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS }
         * 
         * 
         */
        public List<TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS> getProcesoAS() {
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
