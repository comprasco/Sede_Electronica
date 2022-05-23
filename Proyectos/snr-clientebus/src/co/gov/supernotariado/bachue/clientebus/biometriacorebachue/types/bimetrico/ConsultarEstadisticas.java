
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarEstadisticas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarEstadisticas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaEstadisticas" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}estadisticasEntradaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarEstadisticas", propOrder = {
    "entradaEstadisticas"
})
public class ConsultarEstadisticas {

    protected EstadisticasEntradaDTO entradaEstadisticas;

    /**
     * Obtiene el valor de la propiedad entradaEstadisticas.
     * 
     * @return
     *     possible object is
     *     {@link EstadisticasEntradaDTO }
     *     
     */
    public EstadisticasEntradaDTO getEntradaEstadisticas() {
        return entradaEstadisticas;
    }

    /**
     * Define el valor de la propiedad entradaEstadisticas.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadisticasEntradaDTO }
     *     
     */
    public void setEntradaEstadisticas(EstadisticasEntradaDTO value) {
        this.entradaEstadisticas = value;
    }

}
