
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaObtenerTurnosRefPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaObtenerTurnosRefPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="turnos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="turno" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1}turno" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoSalidaObtenerTurnosRefPago", propOrder = {
    "turnos",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaObtenerTurnosRefPago {

    @XmlElement(required = true)
    protected TipoSalidaObtenerTurnosRefPago.Turnos turnos;
    @XmlElement(required = true)
    protected String codigoMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad turnos.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaObtenerTurnosRefPago.Turnos }
     *     
     */
    public TipoSalidaObtenerTurnosRefPago.Turnos getTurnos() {
        return turnos;
    }

    /**
     * Define el valor de la propiedad turnos.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaObtenerTurnosRefPago.Turnos }
     *     
     */
    public void setTurnos(TipoSalidaObtenerTurnosRefPago.Turnos value) {
        this.turnos = value;
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="turno" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1}turno" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "turno"
    })
    public static class Turnos {

        protected List<Turno> turno;

        /**
         * Gets the value of the turno property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the turno property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTurno().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Turno }
         * 
         * 
         */
        public List<Turno> getTurno() {
            if (turno == null) {
                turno = new ArrayList<>();
            }
            return this.turno;
        }

    }

}
