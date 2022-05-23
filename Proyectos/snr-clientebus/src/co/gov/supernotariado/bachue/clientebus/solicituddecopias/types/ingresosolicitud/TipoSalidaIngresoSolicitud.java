
package co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaIngresoSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaIngresoSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSolicitudCopias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="200"/>
 *               &lt;enumeration value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaIngresoSolicitud", propOrder = {
    "idSolicitudCopias",
    "codigo",
    "mensaje"
})
public class TipoSalidaIngresoSolicitud {

    @XmlElement(required = true)
    protected String idSolicitudCopias;
    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad idSolicitudCopias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSolicitudCopias() {
        return idSolicitudCopias;
    }

    /**
     * Define el valor de la propiedad idSolicitudCopias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSolicitudCopias(String value) {
        this.idSolicitudCopias = value;
    }

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

}
