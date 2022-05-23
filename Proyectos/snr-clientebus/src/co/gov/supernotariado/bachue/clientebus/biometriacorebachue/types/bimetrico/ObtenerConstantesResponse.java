
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerConstantesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerConstantesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salidaResultado" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}constantesSalidaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerConstantesResponse", propOrder = {
    "salidaResultado"
})
public class ObtenerConstantesResponse {

    protected ConstantesSalidaDTO salidaResultado;

    /**
     * Obtiene el valor de la propiedad salidaResultado.
     * 
     * @return
     *     possible object is
     *     {@link ConstantesSalidaDTO }
     *     
     */
    public ConstantesSalidaDTO getSalidaResultado() {
        return salidaResultado;
    }

    /**
     * Define el valor de la propiedad salidaResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantesSalidaDTO }
     *     
     */
    public void setSalidaResultado(ConstantesSalidaDTO value) {
        this.salidaResultado = value;
    }

}
