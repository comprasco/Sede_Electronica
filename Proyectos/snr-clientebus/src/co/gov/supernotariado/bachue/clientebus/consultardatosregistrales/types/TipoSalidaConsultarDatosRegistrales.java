package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoSalidaConsultarDatosRegistrales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarDatosRegistrales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadRegistros" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matriculas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}matricula" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="200"/>
 *               &lt;enumeration value="409"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarDatosRegistrales", propOrder = {
    "cantidadRegistros",
    "matriculas",
    "codigoMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultarDatosRegistrales {

    @XmlElement(required = true)
    protected String cantidadRegistros;
    @XmlElement(required = true)
    protected TipoSalidaConsultarDatosRegistrales.Matriculas matriculas;
    @XmlElement(required = true)
    protected String codigoMensaje;
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad cantidadRegistros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadRegistros() {
        return cantidadRegistros;
    }

    /**
     * Define el valor de la propiedad cantidadRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadRegistros(String value) {
        this.cantidadRegistros = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculas.
     * 
     * @return
     *     possible object is
     *     {@link TipoSalidaConsultarDatosRegistrales.Matriculas }
     *     
     */
    public TipoSalidaConsultarDatosRegistrales.Matriculas getMatriculas() {
        return matriculas;
    }

    /**
     * Define el valor de la propiedad matriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSalidaConsultarDatosRegistrales.Matriculas }
     *     
     */
    public void setMatriculas(TipoSalidaConsultarDatosRegistrales.Matriculas value) {
        this.matriculas = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1}matricula" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "matricula"
    })
    public static class Matriculas {

        @XmlElement(required = true)
        protected List<Matricula> matricula;

        /**
         * Gets the value of the matricula property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matricula property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatricula().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Matricula }
         * 
         * 
         */
        public List<Matricula> getMatricula() {
            if (matricula == null) {
                matricula = new ArrayList<>();
            }
            return this.matricula;
        }

    }

}
