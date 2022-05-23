package co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarurlcertificadostransaccion;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarURLCertificadosTransaccionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarURLCertificadosTransaccionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ctls.supernotariado.gov.co/}entidadConsultarCertificadosTransaccionURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarURLCertificadosTransaccionResponse", propOrder = {
    "_return"
})
public class ConsultarURLCertificadosTransaccionResponse {

    @XmlElement(name = "return")
    protected EntidadConsultarCertificadosTransaccionURL _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link EntidadConsultarCertificadosTransaccionURL }
     *     
     */
    public EntidadConsultarCertificadosTransaccionURL getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadConsultarCertificadosTransaccionURL }
     *     
     */
    public void setReturn(EntidadConsultarCertificadosTransaccionURL value) {
        this._return = value;
    }

}
