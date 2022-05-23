
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarEstadisticasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarEstadisticasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salidaEstadisticas" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}estadisticasSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarEstadisticasResponse", propOrder = {
    "salidaEstadisticas"
})
public class ConsultarEstadisticasResponse {

    protected EstadisticasSalidaDTO salidaEstadisticas;

    /**
     * Obtiene el valor de la propiedad salidaEstadisticas.
     * 
     * @return
     *     possible object is
     *     {@link EstadisticasSalidaDTO }
     *     
     */
    public EstadisticasSalidaDTO getSalidaEstadisticas() {
        return salidaEstadisticas;
    }

    /**
     * Define el valor de la propiedad salidaEstadisticas.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadisticasSalidaDTO }
     *     
     */
    public void setSalidaEstadisticas(EstadisticasSalidaDTO value) {
        this.salidaEstadisticas = value;
    }

}
