package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarInformacionMatriculaMasivasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarInformacionMatriculaMasivasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}entidadMatriculaSalida" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionMatriculaMasivasResponse", propOrder = {
    "_return"
})
public class ConsultarInformacionMatriculaMasivasResponse {

    @XmlElement(name = "return")
    protected EntidadMatriculaSalida _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link EntidadMatriculaSalida }
     *     
     */
    public EntidadMatriculaSalida getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadMatriculaSalida }
     *     
     */
    public void setReturn(EntidadMatriculaSalida value) {
        this._return = value;
    }

}
