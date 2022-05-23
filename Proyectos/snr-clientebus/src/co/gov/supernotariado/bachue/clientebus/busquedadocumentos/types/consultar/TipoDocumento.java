package co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoRegistrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFolios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actoNaturalezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nirVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlVisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "did",
    "docName",
    "tipoDocumental",
    "orip",
    "nir",
    "codOrip",
    "turno",
    "documentoRegistrado",
    "numeroDocumento",
    "fechaDocumento",
    "entidadOrigen",
    "pais",
    "departamento",
    "municipio",
    "matricula",
    "anotacion",
    "numeroPagina",
    "numeroFolios",
    "nombreInterviniente",
    "identificacionInterviniente",
    "fechaPublicacion",
    "fechaVigencia",
    "tipoOficina",
    "actoNaturalezaJuridica",
    "proceso",
    "nirVinculado",
    "turnoVinculado",
    "urlVisor"
})
public class TipoDocumento {

    @XmlElement(name = "dID", required = true)
    protected String did;
    @XmlElement(required = true)
    protected String docName;
    @XmlElementRef(name = "tipoDocumental", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumental;
    @XmlElementRef(name = "orip", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orip;
    @XmlElementRef(name = "nir", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nir;
    @XmlElementRef(name = "codOrip", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codOrip;
    @XmlElementRef(name = "turno", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> turno;
    @XmlElementRef(name = "documentoRegistrado", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentoRegistrado;
    @XmlElementRef(name = "numeroDocumento", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumento;
    @XmlElementRef(name = "fechaDocumento", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaDocumento;
    @XmlElementRef(name = "entidadOrigen", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entidadOrigen;
    @XmlElementRef(name = "pais", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "departamento", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamento;
    @XmlElementRef(name = "municipio", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipio;
    @XmlElementRef(name = "matricula", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "anotacion", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anotacion;
    @XmlElementRef(name = "numeroPagina", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPagina;
    @XmlElementRef(name = "numeroFolios", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroFolios;
    @XmlElementRef(name = "nombreInterviniente", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreInterviniente;
    @XmlElementRef(name = "identificacionInterviniente", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionInterviniente;
    @XmlElementRef(name = "fechaPublicacion", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaPublicacion;
    @XmlElementRef(name = "fechaVigencia", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaVigencia;
    @XmlElementRef(name = "tipoOficina", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOficina;
    @XmlElementRef(name = "actoNaturalezaJuridica", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actoNaturalezaJuridica;
    @XmlElementRef(name = "proceso", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proceso;
    @XmlElementRef(name = "nirVinculado", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nirVinculado;
    @XmlElementRef(name = "turnoVinculado", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> turnoVinculado;
    @XmlElementRef(name = "urlVisor", namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlVisor;

    /**
     * Obtiene el valor de la propiedad did.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID() {
        return did;
    }

    /**
     * Define el valor de la propiedad did.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID(String value) {
        this.did = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumental() {
        return tipoDocumental;
    }

    /**
     * Define el valor de la propiedad tipoDocumental.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumental(JAXBElement<String> value) {
        this.tipoDocumental = value;
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
     * Obtiene el valor de la propiedad nir.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNir() {
        return nir;
    }

    /**
     * Define el valor de la propiedad nir.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNir(JAXBElement<String> value) {
        this.nir = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrip.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOrip() {
        return codOrip;
    }

    /**
     * Define el valor de la propiedad codOrip.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOrip(JAXBElement<String> value) {
        this.codOrip = value;
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
     * Obtiene el valor de la propiedad documentoRegistrado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentoRegistrado() {
        return documentoRegistrado;
    }

    /**
     * Define el valor de la propiedad documentoRegistrado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentoRegistrado(JAXBElement<String> value) {
        this.documentoRegistrado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumento(JAXBElement<String> value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaDocumento(JAXBElement<String> value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntidadOrigen() {
        return entidadOrigen;
    }

    /**
     * Define el valor de la propiedad entidadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntidadOrigen(JAXBElement<String> value) {
        this.entidadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPais(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartamento(JAXBElement<String> value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipio(JAXBElement<String> value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatricula(JAXBElement<String> value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad anotacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnotacion() {
        return anotacion;
    }

    /**
     * Define el valor de la propiedad anotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnotacion(JAXBElement<String> value) {
        this.anotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPagina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Define el valor de la propiedad numeroPagina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPagina(JAXBElement<String> value) {
        this.numeroPagina = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFolios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroFolios() {
        return numeroFolios;
    }

    /**
     * Define el valor de la propiedad numeroFolios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroFolios(JAXBElement<String> value) {
        this.numeroFolios = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreInterviniente() {
        return nombreInterviniente;
    }

    /**
     * Define el valor de la propiedad nombreInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreInterviniente(JAXBElement<String> value) {
        this.nombreInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionInterviniente() {
        return identificacionInterviniente;
    }

    /**
     * Define el valor de la propiedad identificacionInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionInterviniente(JAXBElement<String> value) {
        this.identificacionInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaPublicacion(JAXBElement<String> value) {
        this.fechaPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaVigencia(JAXBElement<String> value) {
        this.fechaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOficina() {
        return tipoOficina;
    }

    /**
     * Define el valor de la propiedad tipoOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOficina(JAXBElement<String> value) {
        this.tipoOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad actoNaturalezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActoNaturalezaJuridica() {
        return actoNaturalezaJuridica;
    }

    /**
     * Define el valor de la propiedad actoNaturalezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActoNaturalezaJuridica(JAXBElement<String> value) {
        this.actoNaturalezaJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad proceso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProceso() {
        return proceso;
    }

    /**
     * Define el valor de la propiedad proceso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProceso(JAXBElement<String> value) {
        this.proceso = value;
    }

    /**
     * Obtiene el valor de la propiedad nirVinculado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNirVinculado() {
        return nirVinculado;
    }

    /**
     * Define el valor de la propiedad nirVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNirVinculado(JAXBElement<String> value) {
        this.nirVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad turnoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTurnoVinculado() {
        return turnoVinculado;
    }

    /**
     * Define el valor de la propiedad turnoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTurnoVinculado(JAXBElement<String> value) {
        this.turnoVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad urlVisor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlVisor() {
        return urlVisor;
    }

    /**
     * Define el valor de la propiedad urlVisor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlVisor(JAXBElement<String> value) {
        this.urlVisor = value;
    }

}
