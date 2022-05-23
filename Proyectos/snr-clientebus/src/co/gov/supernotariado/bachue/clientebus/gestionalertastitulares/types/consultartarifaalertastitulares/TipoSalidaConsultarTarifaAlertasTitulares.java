package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarTarifaAlertasTitulares complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarTarifaAlertasTitulares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarifas" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1}tarifasType" minOccurs="0"/>
 *         &lt;element name="alertasInscrtitas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaNuevasAlertas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tipoSalidaConsultarTarifaAlertasTitulares", propOrder = {
    "tarifas",
    "alertasInscrtitas",
    "tarifaNuevasAlertas",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarTarifaAlertasTitulares {

    protected TarifasType tarifas;
    protected String alertasInscrtitas;
    protected String tarifaNuevasAlertas;
    protected String codigoMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad tarifas.
     * 
     * @return
     *     possible object is
     *     {@link TarifasType }
     *     
     */
    public TarifasType getTarifas() {
        return tarifas;
    }

    /**
     * Define el valor de la propiedad tarifas.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifasType }
     *     
     */
    public void setTarifas(TarifasType value) {
        this.tarifas = value;
    }

    /**
     * Obtiene el valor de la propiedad alertasInscrtitas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertasInscrtitas() {
        return alertasInscrtitas;
    }

    /**
     * Define el valor de la propiedad alertasInscrtitas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertasInscrtitas(String value) {
        this.alertasInscrtitas = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaNuevasAlertas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaNuevasAlertas() {
        return tarifaNuevasAlertas;
    }

    /**
     * Define el valor de la propiedad tarifaNuevasAlertas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaNuevasAlertas(String value) {
        this.tarifaNuevasAlertas = value;
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
