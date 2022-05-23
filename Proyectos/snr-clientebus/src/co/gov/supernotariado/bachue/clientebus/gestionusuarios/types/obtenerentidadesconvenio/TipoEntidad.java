
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerentidadesconvenio;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="codigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntidad", propOrder = {
    "codigoEntidad",
    "nombreEntidad",
    "codigoPais",
    "codigoDepartamento",
    "codigoMunicipio"
})
public class TipoEntidad {

    @XmlElement(required = true)
    protected String codigoEntidad;
    @XmlElement(required = true)
    protected String nombreEntidad;
    @XmlElement(required = true)
    protected BigInteger codigoPais;
    @XmlElement(required = true)
    protected BigInteger codigoDepartamento;
    @XmlElement(required = true)
    protected BigInteger codigoMunicipio;

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

    /**
     * Obtiene el valor de la propiedad nombreEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Define el valor de la propiedad nombreEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoPais(BigInteger value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /**
     * Define el valor de la propiedad codigoDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoDepartamento(BigInteger value) {
        this.codigoDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define el valor de la propiedad codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoMunicipio(BigInteger value) {
        this.codigoMunicipio = value;
    }

}
