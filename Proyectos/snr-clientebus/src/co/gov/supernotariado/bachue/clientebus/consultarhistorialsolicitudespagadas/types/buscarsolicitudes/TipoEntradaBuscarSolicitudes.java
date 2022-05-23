
package co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaBuscarSolicitudes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaBuscarSolicitudes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaSolicitante" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1}solicitantesType" minOccurs="0"/>
 *         &lt;element name="servicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaBuscarSolicitudes", propOrder = {
    "modulo",
    "listaSolicitante",
    "servicio",
    "nir",
    "fechaDesdeBusqueda",
    "fechaHastaBusqueda"
})
public class TipoEntradaBuscarSolicitudes {

    protected String modulo;
    protected SolicitantesType listaSolicitante;
    protected String servicio;
    protected String nir;
    protected String fechaDesdeBusqueda;
    protected String fechaHastaBusqueda;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad listaSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link SolicitantesType }
     *     
     */
    public SolicitantesType getListaSolicitante() {
        return listaSolicitante;
    }

    /**
     * Define el valor de la propiedad listaSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitantesType }
     *     
     */
    public void setListaSolicitante(SolicitantesType value) {
        this.listaSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

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
     * Obtiene el valor de la propiedad fechaDesdeBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeBusqueda() {
        return fechaDesdeBusqueda;
    }

    /**
     * Define el valor de la propiedad fechaDesdeBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeBusqueda(String value) {
        this.fechaDesdeBusqueda = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHastaBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaBusqueda() {
        return fechaHastaBusqueda;
    }

    /**
     * Define el valor de la propiedad fechaHastaBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaBusqueda(String value) {
        this.fechaHastaBusqueda = value;
    }

}
