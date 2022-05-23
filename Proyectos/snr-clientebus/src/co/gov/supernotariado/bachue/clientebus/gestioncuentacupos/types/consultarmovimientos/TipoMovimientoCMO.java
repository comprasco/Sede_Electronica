
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoMovimientoCMO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoMovimientoCMO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaMovimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notaCredito" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1}tipoNotaCreditoCMO" minOccurs="0"/>
 *         &lt;element name="reciboCaja" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1}tipoReciboCajaCMO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMovimientoCMO", propOrder = {
    "id",
    "fechaMovimiento",
    "tipo",
    "notaCredito",
    "reciboCaja"
})
public class TipoMovimientoCMO {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaMovimiento;
    @XmlElement(required = true)
    protected String tipo;
    protected TipoNotaCreditoCMO notaCredito;
    protected TipoReciboCajaCMO reciboCaja;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaMovimiento() {
        return fechaMovimiento;
    }

    /**
     * Define el valor de la propiedad fechaMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaMovimiento(XMLGregorianCalendar value) {
        this.fechaMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad notaCredito.
     * 
     * @return
     *     possible object is
     *     {@link TipoNotaCreditoCMO }
     *     
     */
    public TipoNotaCreditoCMO getNotaCredito() {
        return notaCredito;
    }

    /**
     * Define el valor de la propiedad notaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNotaCreditoCMO }
     *     
     */
    public void setNotaCredito(TipoNotaCreditoCMO value) {
        this.notaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad reciboCaja.
     * 
     * @return
     *     possible object is
     *     {@link TipoReciboCajaCMO }
     *     
     */
    public TipoReciboCajaCMO getReciboCaja() {
        return reciboCaja;
    }

    /**
     * Define el valor de la propiedad reciboCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReciboCajaCMO }
     *     
     */
    public void setReciboCaja(TipoReciboCajaCMO value) {
        this.reciboCaja = value;
    }

}
