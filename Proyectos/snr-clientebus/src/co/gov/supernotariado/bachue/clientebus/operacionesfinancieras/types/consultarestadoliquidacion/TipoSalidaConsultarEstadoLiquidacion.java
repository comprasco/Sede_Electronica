package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarEstadoLiquidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarEstadoLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoTransaccionRecaudador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoTransaccion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ReferenciaVencida"/>
 *               &lt;enumeration value="ReferenciaPagada"/>
 *               &lt;enumeration value="ReferenciaDisponible"/>
 *               &lt;enumeration value="ReciboCajaGenerado"/>
 *               &lt;enumeration value="ProductoEntregado"/>
 *               &lt;enumeration value="ReferenciaAnulada"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarEstadoLiquidacion", propOrder = {
    "numeroReferencia",
    "codigoTransaccionRecaudador",
    "estadoTransaccion",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarEstadoLiquidacion {

    @XmlElement(required = true)
    protected String numeroReferencia;
    @XmlElementRef(name = "codigoTransaccionRecaudador", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTransaccionRecaudador;
    @XmlElement(required = true)
    protected String estadoTransaccion;
    @XmlElement(required = true)
    protected String codigoMensaje;
    @XmlElementRef(name = "descripcionMensaje", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad numeroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Define el valor de la propiedad numeroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferencia(String value) {
        this.numeroReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccionRecaudador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTransaccionRecaudador() {
        return codigoTransaccionRecaudador;
    }

    /**
     * Define el valor de la propiedad codigoTransaccionRecaudador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTransaccionRecaudador(JAXBElement<String> value) {
        this.codigoTransaccionRecaudador = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    /**
     * Define el valor de la propiedad estadoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTransaccion(String value) {
        this.estadoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
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
     *     {@link BigInteger }
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionMensaje(JAXBElement<String> value) {
        this.descripcionMensaje = value;
    }

}
