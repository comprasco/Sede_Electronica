
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarFirma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarFirma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaEliminarFirma" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}consultarFirmaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarFirma", propOrder = {
    "entradaEliminarFirma"
})
public class EliminarFirma {

    protected ConsultarFirmaDTO entradaEliminarFirma;

    /**
     * Obtiene el valor de la propiedad entradaEliminarFirma.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarFirmaDTO }
     *     
     */
    public ConsultarFirmaDTO getEntradaEliminarFirma() {
        return entradaEliminarFirma;
    }

    /**
     * Define el valor de la propiedad entradaEliminarFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarFirmaDTO }
     *     
     */
    public void setEntradaEliminarFirma(ConsultarFirmaDTO value) {
        this.entradaEliminarFirma = value;
    }

}
