
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaObtenerConveniosEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaObtenerConveniosEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaObtenerConveniosEntidad", propOrder = {
    "codigoEntidad"
})
public class TipoEntradaObtenerConveniosEntidad {

    @XmlElement(required = true)
    protected String codigoEntidad;

    /**
     * Obtiene el valor de la propiedad codigoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * Define el valor de la propiedad codigoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEntidad(String value) {
        this.codigoEntidad = value;
    }

}
