
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarOficinasOrigenTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarOficinasOrigenTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomParcialOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarOficinasOrigenTipo", propOrder = {
    "tipoOficinaOrigen",
    "codigoOficinaOrigen",
    "nomParcialOficinaOrigen"
})
public class TipoEntradaConsultarOficinasOrigenTipo {

    @XmlElement(required = true)
    protected String tipoOficinaOrigen;
    protected String codigoOficinaOrigen;
    protected String nomParcialOficinaOrigen;

    /**
     * Obtiene el valor de la propiedad tipoOficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOficinaOrigen() {
        return tipoOficinaOrigen;
    }

    /**
     * Define el valor de la propiedad tipoOficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOficinaOrigen(String value) {
        this.tipoOficinaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOficinaOrigen() {
        return codigoOficinaOrigen;
    }

    /**
     * Define el valor de la propiedad codigoOficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOficinaOrigen(String value) {
        this.codigoOficinaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad nomParcialOficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomParcialOficinaOrigen() {
        return nomParcialOficinaOrigen;
    }

    /**
     * Define el valor de la propiedad nomParcialOficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomParcialOficinaOrigen(String value) {
        this.nomParcialOficinaOrigen = value;
    }

}
