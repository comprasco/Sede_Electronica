
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaObtenerProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaObtenerProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoVerificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenciaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaObtenerProducto", propOrder = {
    "turno",
    "codigoVerificacion",
    "referenciaPago"
})
public class TipoEntradaObtenerProducto {

    @XmlElement(name = "Turno", required = true)
    protected String turno;
    @XmlElement(name = "CodigoVerificacion", required = true)
    protected String codigoVerificacion;
    @XmlElement(name = "ReferenciaPago", required = true)
    protected String referenciaPago;

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
     * Obtiene el valor de la propiedad codigoVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    /**
     * Define el valor de la propiedad codigoVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacion(String value) {
        this.codigoVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaPago() {
        return referenciaPago;
    }

    /**
     * Define el valor de la propiedad referenciaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaPago(String value) {
        this.referenciaPago = value;
    }

}
