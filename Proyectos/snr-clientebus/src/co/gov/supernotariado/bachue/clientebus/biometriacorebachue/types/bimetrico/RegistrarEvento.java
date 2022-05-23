
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarEvento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaLog" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}logDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarEvento", propOrder = {
    "entradaLog"
})
public class RegistrarEvento {

    protected LogDTO entradaLog;

    /**
     * Obtiene el valor de la propiedad entradaLog.
     * 
     * @return
     *     possible object is
     *     {@link LogDTO }
     *     
     */
    public LogDTO getEntradaLog() {
        return entradaLog;
    }

    /**
     * Define el valor de la propiedad entradaLog.
     * 
     * @param value
     *     allowed object is
     *     {@link LogDTO }
     *     
     */
    public void setEntradaLog(LogDTO value) {
        this.entradaLog = value;
    }

}
