
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFirma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFirma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaObtenerFirma" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}consultarFirmaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFirma", propOrder = {
    "entradaObtenerFirma"
})
public class ObtenerFirma {

    protected ConsultarFirmaDTO entradaObtenerFirma;

    /**
     * Obtiene el valor de la propiedad entradaObtenerFirma.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarFirmaDTO }
     *     
     */
    public ConsultarFirmaDTO getEntradaObtenerFirma() {
        return entradaObtenerFirma;
    }

    /**
     * Define el valor de la propiedad entradaObtenerFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarFirmaDTO }
     *     
     */
    public void setEntradaObtenerFirma(ConsultarFirmaDTO value) {
        this.entradaObtenerFirma = value;
    }

}
