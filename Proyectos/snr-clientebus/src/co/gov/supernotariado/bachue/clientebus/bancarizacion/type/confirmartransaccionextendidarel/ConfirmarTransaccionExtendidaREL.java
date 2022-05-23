
package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendidarel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para confirmarTransaccionExtendidaREL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="confirmarTransaccionExtendidaREL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valorFinal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmarTransaccionExtendidaREL", propOrder = {
    "usuarioWS",
    "claveWS",
    "codigoConvenio",
    "codigoServicio",
    "codigoTransaccion",
    "valorFinal",
    "turno"
})
public class ConfirmarTransaccionExtendidaREL {

    protected String usuarioWS;
    protected String claveWS;
    protected String codigoConvenio;
    protected String codigoServicio;
    protected Long codigoTransaccion;
    protected Long valorFinal;
    protected String turno;

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

}
