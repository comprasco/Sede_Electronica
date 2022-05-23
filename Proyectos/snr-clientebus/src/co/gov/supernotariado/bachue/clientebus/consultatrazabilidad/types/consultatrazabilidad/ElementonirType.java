
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para elementonirType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="elementonirType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decisionCalificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faseActualTurno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesoTurno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentos" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1}documentos"/>
 *         &lt;element name="matriculas" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1}matricula"/>
 *         &lt;element name="trazabilidades" type="{https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1}trazabilidad"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementonirType", propOrder = {
    "turno",
    "orip",
    "decisionCalificacion",
    "faseActualTurno",
    "procesoTurno",
    "documentos",
    "matriculas",
    "trazabilidades"
})
public class ElementonirType {

    @XmlElement(required = true)
    protected String turno;
    @XmlElement(required = true)
    protected String orip;
    @XmlElement(required = true)
    protected String decisionCalificacion;
    @XmlElement(required = true)
    protected String faseActualTurno;
    @XmlElement(required = true)
    protected String procesoTurno;
    @XmlElement(required = true)
    protected Documentos documentos;
    @XmlElement(required = true)
    protected Matricula matriculas;
    @XmlElement(required = true)
    protected Trazabilidad trazabilidades;

    /**
     * Obtiene el valor de la propiedad turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define el valor de la propiedad turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtiene el valor de la propiedad orip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrip() {
        return orip;
    }

    /**
     * Define el valor de la propiedad orip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrip(String value) {
        this.orip = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionCalificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionCalificacion() {
        return decisionCalificacion;
    }

    /**
     * Define el valor de la propiedad decisionCalificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionCalificacion(String value) {
        this.decisionCalificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad faseActualTurno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaseActualTurno() {
        return faseActualTurno;
    }

    /**
     * Define el valor de la propiedad faseActualTurno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaseActualTurno(String value) {
        this.faseActualTurno = value;
    }

    /**
     * Obtiene el valor de la propiedad procesoTurno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesoTurno() {
        return procesoTurno;
    }

    /**
     * Define el valor de la propiedad procesoTurno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesoTurno(String value) {
        this.procesoTurno = value;
    }

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculas.
     * 
     * @return
     *     possible object is
     *     {@link Matricula }
     *     
     */
    public Matricula getMatriculas() {
        return matriculas;
    }

    /**
     * Define el valor de la propiedad matriculas.
     * 
     * @param value
     *     allowed object is
     *     {@link Matricula }
     *     
     */
    public void setMatriculas(Matricula value) {
        this.matriculas = value;
    }

    /**
     * Obtiene el valor de la propiedad trazabilidades.
     * 
     * @return
     *     possible object is
     *     {@link Trazabilidad }
     *     
     */
    public Trazabilidad getTrazabilidades() {
        return trazabilidades;
    }

    /**
     * Define el valor de la propiedad trazabilidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Trazabilidad }
     *     
     */
    public void setTrazabilidades(Trazabilidad value) {
        this.trazabilidades = value;
    }

}
