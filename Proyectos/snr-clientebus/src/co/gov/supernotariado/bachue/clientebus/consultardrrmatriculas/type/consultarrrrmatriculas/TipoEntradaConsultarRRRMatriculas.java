
package co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarRRRMatriculas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarRRRMatriculas">
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
 *         &lt;element name="numIdentificacionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarRRRMatriculas", propOrder = {
		"tipoIdentificacionPredio",
		"numIdentificacionPredio"
})
@XmlRootElement(name = "tipoEntradaConsultarRRRMatriculas") 
public class TipoEntradaConsultarRRRMatriculas {

	@XmlElement(name = "tipoIdentificacionPredio",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String tipoIdentificacionPredio;
	@XmlElement(name = "numIdentificacionPredio",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
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
