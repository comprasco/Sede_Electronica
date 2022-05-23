
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerorips;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoOrip complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoOrip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoORIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreORIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nombreMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoOrip", propOrder = {
    "codigoORIP",
    "nombreORIP",
    "codigoDepartamento",
    "nombreDepartamento",
    "codigoMunicipio",
    "nombreMunicipio"
})
public class TipoOrip {

    @XmlElement(required = true)
    protected String codigoORIP;
    @XmlElement(required = true)
    protected String nombreORIP;
    @XmlElement(required = true)
    protected BigInteger codigoDepartamento;
    @XmlElement(required = true)
    protected String nombreDepartamento;
    @XmlElement(required = true)
    protected BigInteger codigoMunicipio;
    @XmlElement(required = true)
    protected String nombreMunicipio;

    /**
     * Obtiene el valor de la propiedad codigoORIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoORIP() {
        return codigoORIP;
    }

    /**
     * Define el valor de la propiedad codigoORIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoORIP(String value) {
        this.codigoORIP = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreORIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreORIP() {
        return nombreORIP;
    }

    /**
     * Define el valor de la propiedad nombreORIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreORIP(String value) {
        this.nombreORIP = value;
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
     * Obtiene el valor de la propiedad nombreDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    /**
     * Define el valor de la propiedad nombreDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDepartamento(String value) {
        this.nombreDepartamento = value;
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

    /**
     * Obtiene el valor de la propiedad nombreMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    /**
     * Define el valor de la propiedad nombreMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMunicipio(String value) {
        this.nombreMunicipio = value;
    }

}
