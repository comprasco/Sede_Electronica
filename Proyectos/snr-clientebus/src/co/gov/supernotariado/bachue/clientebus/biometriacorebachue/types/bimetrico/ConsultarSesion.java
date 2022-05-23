
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarSesion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarSesion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaSesion" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}sesionEntradaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSesion", propOrder = {
    "entradaSesion"
})
public class ConsultarSesion {

    protected SesionEntradaDTO entradaSesion;

    /**
     * Obtiene el valor de la propiedad entradaSesion.
     * 
     * @return
     *     possible object is
     *     {@link SesionEntradaDTO }
     *     
     */
    public SesionEntradaDTO getEntradaSesion() {
        return entradaSesion;
    }

    /**
     * Define el valor de la propiedad entradaSesion.
     * 
     * @param value
     *     allowed object is
     *     {@link SesionEntradaDTO }
     *     
     */
    public void setEntradaSesion(SesionEntradaDTO value) {
        this.entradaSesion = value;
    }

}
