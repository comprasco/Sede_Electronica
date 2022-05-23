package co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * El esquema define los
 * 				datos de salida para la operacion ConsultarDatosBasicos que
 * 				permite
 * 				encontrar una lista de matriculas inmobiliarias con algunos
 * 				datos de
 * 				sus propietarios
 * 			
 * 
 * <p>Clase Java para tipoSalidaDatosBasicosMatricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaDatosBasicosMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadMatriculas">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoMatricula">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matriculas" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue}tipoMatricula" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaHoraConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroConsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcionMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "tipoSalidaDatosBasicosMatricula", propOrder = {
    "cantidadMatriculas",
    "estadoMatricula",
    "matriculas",
    "fechaHoraConsulta",
    "numeroConsulta",
    "codMensaje",
    "descripcionMensaje"
})
public class TipoSalidaDatosBasicosMatricula {

    @XmlElement(required = true)
    protected BigInteger cantidadMatriculas;
    protected short estadoMatricula;
    protected List<TipoMatricula> matriculas;
    @XmlElement(required = true)
    protected XMLGregorianCalendar fechaHoraConsulta;
    protected long numeroConsulta;
    @XmlElement(required = true)
    protected BigInteger codMensaje;
    @XmlElement(required = true)
    protected String descripcionMensaje;

    /**
     * Obtiene el valor de la propiedad cantidadMatriculas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadMatriculas() {
        return cantidadMatriculas;
    }

    /**
     * Define el valor de la propiedad cantidadMatriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadMatriculas(BigInteger value) {
        this.cantidadMatriculas = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoMatricula.
     * 
     */
    public short getEstadoMatricula() {
        return estadoMatricula;
    }

    /**
     * Define el valor de la propiedad estadoMatricula.
     * 
     */
    public void setEstadoMatricula(short value) {
        this.estadoMatricula = value;
    }

    /**
     * Gets the value of the matriculas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMatricula }
     * 
     * 
     */
    public List<TipoMatricula> getMatriculas() {
        if (matriculas == null) {
            matriculas = new ArrayList<>();
        }
        return this.matriculas;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraConsulta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    /**
     * Define el valor de la propiedad fechaHoraConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraConsulta(XMLGregorianCalendar value) {
        this.fechaHoraConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroConsulta.
     * 
     */
    public long getNumeroConsulta() {
        return numeroConsulta;
    }

    /**
     * Define el valor de la propiedad numeroConsulta.
     * 
     */
    public void setNumeroConsulta(long value) {
        this.numeroConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad codMensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodMensaje() {
        return codMensaje;
    }

    /**
     * Define el valor de la propiedad codMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodMensaje(BigInteger value) {
        this.codMensaje = value;
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

}
