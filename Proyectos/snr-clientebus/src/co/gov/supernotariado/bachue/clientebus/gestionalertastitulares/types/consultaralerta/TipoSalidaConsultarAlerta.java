package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertas" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1}alertasType" minOccurs="0"/>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tipoSalidaConsultarAlerta", propOrder = {
    "alertas",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarAlerta {

    protected AlertasType alertas;
    protected String codigoMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad alertas.
     * 
     * @return
     *     possible object is
     *     {@link AlertasType }
     *     
     */
    public AlertasType getAlertas() {
        return alertas;
    }

    /**
     * Define el valor de la propiedad alertas.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertasType }
     *     
     */
    public void setAlertas(AlertasType value) {
        this.alertas = value;
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
