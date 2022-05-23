
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * El esquema define los
 * 						datos de entrada para la operacion Consulta Migracion Matriculas
 * 					
 * 
 * <p>Clase Java para tipoEntradaConsultaMigracionMatriculas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultaMigracionMatriculas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matriculasConsultadas" type="{https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1}tipoMatriculaConsultada" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultaMigracionMatriculas", propOrder = {
    "matriculasConsultadas",
    "usuario"
})
public class TipoEntradaConsultaMigracionMatriculas {

    protected List<TipoMatriculaConsultada> matriculasConsultadas;
    @XmlElement(required = true)
    protected String usuario;

    /**
     * Gets the value of the matriculasConsultadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculasConsultadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculasConsultadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMatriculaConsultada }
     * 
     * 
     */
    public List<TipoMatriculaConsultada> getMatriculasConsultadas() {
        if (matriculasConsultadas == null) {
            matriculasConsultadas = new ArrayList<TipoMatriculaConsultada>();
        }
        return this.matriculasConsultadas;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

	public void setMatriculasConsultadas(List<TipoMatriculaConsultada> matriculasConsultadas) {
		this.matriculasConsultadas = matriculasConsultadas;
	}
    
    
}
