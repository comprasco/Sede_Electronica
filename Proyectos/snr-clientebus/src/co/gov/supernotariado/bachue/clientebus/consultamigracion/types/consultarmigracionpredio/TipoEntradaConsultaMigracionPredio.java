
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionpredio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * El esquema define los
 * 						datos de entrada para saber si la informaci�n del Predio ha sido
 * 						migrada a Bachue o si todav�a se debe consultar en Nodo Central
 * 					
 * 
 * <p>Clase Java para tipoEntradaConsultaMigracionPredio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultaMigracionPredio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoIdentificacionPredio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="matricula"/>
 *               &lt;enumeration value="numeroPredial"/>
 *               &lt;enumeration value="numeroPredialAnterior"/>
 *               &lt;enumeration value="NUPRE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numIdentificacionPredio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultaMigracionPredio", propOrder = {
    "tipoIdentificacionPredio",
    "numIdentificacionPredio"
})
public class TipoEntradaConsultaMigracionPredio {

    protected String tipoIdentificacionPredio;
    protected String numIdentificacionPredio;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionPredio() {
        return tipoIdentificacionPredio;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionPredio(String value) {
        this.tipoIdentificacionPredio = value;
    }

    /**
     * Obtiene el valor de la propiedad numIdentificacionPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentificacionPredio() {
        return numIdentificacionPredio;
    }

    /**
     * Define el valor de la propiedad numIdentificacionPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentificacionPredio(String value) {
        this.numIdentificacionPredio = value;
    }

}
