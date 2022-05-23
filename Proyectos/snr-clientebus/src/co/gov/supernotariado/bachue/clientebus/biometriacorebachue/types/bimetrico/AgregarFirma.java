
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarFirma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarFirma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaAgregarFirma" type="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}agregarFirmaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarFirma", propOrder = {
    "entradaAgregarFirma"
})
public class AgregarFirma {

    protected AgregarFirmaDTO entradaAgregarFirma;

    /**
     * Obtiene el valor de la propiedad entradaAgregarFirma.
     * 
     * @return
     *     possible object is
     *     {@link AgregarFirmaDTO }
     *     
     */
    public AgregarFirmaDTO getEntradaAgregarFirma() {
        return entradaAgregarFirma;
    }

    /**
     * Define el valor de la propiedad entradaAgregarFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link AgregarFirmaDTO }
     *     
     */
    public void setEntradaAgregarFirma(AgregarFirmaDTO value) {
        this.entradaAgregarFirma = value;
    }

}
