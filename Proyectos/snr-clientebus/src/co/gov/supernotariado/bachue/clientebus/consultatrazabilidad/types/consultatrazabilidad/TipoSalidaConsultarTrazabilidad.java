
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarTrazabilidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarTrazabilidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faseActualNIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nirVinculado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tramiteVinculado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elementosnir" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1}elementonir"/>
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
@XmlType(name = "tipoSalidaConsultarTrazabilidad", propOrder = {
    "nir",
    "faseActualNIR",
    "nirVinculado",
    "tramiteVinculado",
    "elementosnir",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarTrazabilidad {

    @XmlElement(required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String faseActualNIR;
    @XmlElement(required = true)
    protected String nirVinculado;
    @XmlElement(required = true)
    protected String tramiteVinculado;
    @XmlElement(required = true)
    protected Elementonir elementosnir;
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
     * Obtiene el valor de la propiedad faseActualNIR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaseActualNIR() {
        return faseActualNIR;
    }

    /**
     * Define el valor de la propiedad faseActualNIR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaseActualNIR(String value) {
        this.faseActualNIR = value;
    }

    /**
     * Obtiene el valor de la propiedad nirVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNirVinculado() {
        return nirVinculado;
    }

    /**
     * Define el valor de la propiedad nirVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNirVinculado(String value) {
        this.nirVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad tramiteVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramiteVinculado() {
        return tramiteVinculado;
    }

    /**
     * Define el valor de la propiedad tramiteVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramiteVinculado(String value) {
        this.tramiteVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad elementosnir.
     * 
     * @return
     *     possible object is
     *     {@link Elementonir }
     *     
     */
    public Elementonir getElementosnir() {
        return elementosnir;
    }

    /**
     * Define el valor de la propiedad elementosnir.
     * 
     * @param value
     *     allowed object is
     *     {@link Elementonir }
     *     
     */
    public void setElementosnir(Elementonir value) {
        this.elementosnir = value;
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

}
