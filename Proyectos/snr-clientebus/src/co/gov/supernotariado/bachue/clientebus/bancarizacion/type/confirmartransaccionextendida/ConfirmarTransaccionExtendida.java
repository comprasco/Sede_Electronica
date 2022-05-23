package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para confirmarTransaccionExtendida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="confirmarTransaccionExtendida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPuntoRecaudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enviarPorCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMedioPago" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valorFinal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmarTransaccionExtendida", propOrder = {
    "usuarioWS",
    "claveWS",
    "codigoConvenio",
    "codigoServicio",
    "codigoPuntoRecaudo",
    "codigoTransaccion",
    "correo",
    "enviarPorCorreo",
    "codigoMedioPago",
    "valorFinal"
})
public class ConfirmarTransaccionExtendida {

    protected String usuarioWS;
    protected String claveWS;
    protected String codigoConvenio;
    protected String codigoServicio;
    protected String codigoPuntoRecaudo;
    protected Long codigoTransaccion;
    protected String correo;
    protected String enviarPorCorreo;
    protected Long codigoMedioPago;
    protected Long valorFinal;

    /**
     * Obtiene el valor de la propiedad usuarioWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioWS() {
        return usuarioWS;
    }

    /**
     * Define el valor de la propiedad usuarioWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioWS(String value) {
        this.usuarioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad claveWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveWS() {
        return claveWS;
    }

    /**
     * Define el valor de la propiedad claveWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveWS(String value) {
        this.claveWS = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    /**
     * Define el valor de la propiedad codigoConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConvenio(String value) {
        this.codigoConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Define el valor de la propiedad codigoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServicio(String value) {
        this.codigoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPuntoRecaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPuntoRecaudo() {
        return codigoPuntoRecaudo;
    }

    /**
     * Define el valor de la propiedad codigoPuntoRecaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPuntoRecaudo(String value) {
        this.codigoPuntoRecaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Define el valor de la propiedad codigoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTransaccion(Long value) {
        this.codigoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad enviarPorCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviarPorCorreo() {
        return enviarPorCorreo;
    }

    /**
     * Define el valor de la propiedad enviarPorCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviarPorCorreo(String value) {
        this.enviarPorCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoMedioPago() {
        return codigoMedioPago;
    }

    /**
     * Define el valor de la propiedad codigoMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoMedioPago(Long value) {
        this.codigoMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFinal.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValorFinal() {
        return valorFinal;
    }

    /**
     * Define el valor de la propiedad valorFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValorFinal(Long value) {
        this.valorFinal = value;
    }

}
