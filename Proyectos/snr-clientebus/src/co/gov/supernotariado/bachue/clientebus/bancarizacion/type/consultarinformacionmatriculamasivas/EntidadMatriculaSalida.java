
package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarInformacionmatricula.RespuestaConsultarInformacionMatricula;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;


/**
 * <p>Clase Java para entidadMatriculaSalida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidadMatriculaSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="log" type="{http://services.ctls.supernotariado.gov.co/}entidadLog" minOccurs="0"/>
 *         &lt;element name="resultados" type="{http://services.ctls.supernotariado.gov.co/}respuestaConsultarInformacionMatricula" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidadMatriculaSalida", propOrder = {
    "estado",
    "log",
    "resultados"
})
public class EntidadMatriculaSalida {

    protected String estado;
    protected EntidadLog log;
    @XmlElement(nillable = true)
    protected List<RespuestaConsultarInformacionMatricula> resultados;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link EntidadLog }
     *     
     */
    public EntidadLog getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadLog }
     *     
     */
    public void setLog(EntidadLog value) {
        this.log = value;
    }

    /**
     * Gets the value of the resultados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespuestaConsultarInformacionMatricula }
     * 
     * 
     */
    public List<RespuestaConsultarInformacionMatricula> getResultados() {
        if (resultados == null) {
            resultados = new ArrayList<RespuestaConsultarInformacionMatricula>();
        }
        return this.resultados;
    }

}
