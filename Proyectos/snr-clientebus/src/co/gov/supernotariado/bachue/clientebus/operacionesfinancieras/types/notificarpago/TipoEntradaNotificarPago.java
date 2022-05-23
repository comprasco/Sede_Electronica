package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.notificarpago;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoEntradaNotificarPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaNotificarPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEntidadRecaudadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoPuntoRecaudoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoTipoRecaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechaBancaria" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="codigoTransaccionRecaudador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoTransaccion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numeroReferenciaBachue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaNotificarPago", propOrder = {
    "codigoEntidadRecaudadora",
    "codigoPuntoRecaudoEntidad",
    "codigoTipoRecaudo",
    "fechaTransaccion",
    "fechaBancaria",
    "codigoTransaccionRecaudador",
    "montoTransaccion",
    "numeroReferenciaBachue"
})
public class TipoEntradaNotificarPago {

    @XmlElement(required = true)
    protected String codigoEntidadRecaudadora;
    @XmlElement(required = true)
    protected String codigoPuntoRecaudoEntidad;
    @XmlElement(required = true)
    protected String codigoTipoRecaudo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransaccion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaBancaria;
    @XmlElement(required = true)
    protected String codigoTransaccionRecaudador;
    @XmlElement(required = true)
    protected BigDecimal montoTransaccion;
    @XmlElement(required = true)
    protected String numeroReferenciaBachue;

    /**
     * Obtiene el valor de la propiedad codigoEntidadRecaudadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEntidadRecaudadora() {
        return codigoEntidadRecaudadora;
    }

    /**
     * Define el valor de la propiedad codigoEntidadRecaudadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEntidadRecaudadora(String value) {
        this.codigoEntidadRecaudadora = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPuntoRecaudoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPuntoRecaudoEntidad() {
        return codigoPuntoRecaudoEntidad;
    }

    /**
     * Define el valor de la propiedad codigoPuntoRecaudoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPuntoRecaudoEntidad(String value) {
        this.codigoPuntoRecaudoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoRecaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoRecaudo() {
        return codigoTipoRecaudo;
    }

    /**
     * Define el valor de la propiedad codigoTipoRecaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoRecaudo(String value) {
        this.codigoTipoRecaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Define el valor de la propiedad fechaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransaccion(XMLGregorianCalendar value) {
        this.fechaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaBancaria() {
        return fechaBancaria;
    }

    /**
     * Define el valor de la propiedad fechaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaBancaria(XMLGregorianCalendar value) {
        this.fechaBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccionRecaudador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransaccionRecaudador() {
        return codigoTransaccionRecaudador;
    }

    /**
     * Define el valor de la propiedad codigoTransaccionRecaudador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransaccionRecaudador(String value) {
        this.codigoTransaccionRecaudador = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTransaccion() {
        return montoTransaccion;
    }

    /**
     * Define el valor de la propiedad montoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTransaccion(BigDecimal value) {
        this.montoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReferenciaBachue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferenciaBachue() {
        return numeroReferenciaBachue;
    }

    /**
     * Define el valor de la propiedad numeroReferenciaBachue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferenciaBachue(String value) {
        this.numeroReferenciaBachue = value;
    }

}
