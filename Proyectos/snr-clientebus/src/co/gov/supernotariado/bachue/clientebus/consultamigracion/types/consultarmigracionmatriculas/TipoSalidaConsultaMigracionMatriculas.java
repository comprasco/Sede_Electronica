
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * El esquema define los
 * 						datos de salida para saber con cada una de las matr�culas
 * 						recibidas,
 * 						si se busca en Nodo Central o en los
 * 						Servicios de Bachu�
 * 					
 * 
 * <p>Clase Java para tipoSalidaConsultaMigracionMatriculas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultaMigracionMatriculas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="datosMatriculasMigracion" type="{https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1}tipoDatosMatriculasMigracion" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tipoSalidaConsultaMigracionMatriculas", propOrder = {
    "datosMatriculasMigracion",
    "codMensaje",
    "descripcionMensaje"
})
public class TipoSalidaConsultaMigracionMatriculas {

    protected List<TipoDatosMatriculasMigracion> datosMatriculasMigracion;
    protected BigInteger codMensaje;
    protected String descripcionMensaje;

    /**
     * Gets the value of the datosMatriculasMigracion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosMatriculasMigracion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosMatriculasMigracion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDatosMatriculasMigracion }
     * 
     * 
     */
    public List<TipoDatosMatriculasMigracion> getDatosMatriculasMigracion() {
        if (datosMatriculasMigracion == null) {
            datosMatriculasMigracion = new ArrayList<TipoDatosMatriculasMigracion>();
        }
        return this.datosMatriculasMigracion;
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
