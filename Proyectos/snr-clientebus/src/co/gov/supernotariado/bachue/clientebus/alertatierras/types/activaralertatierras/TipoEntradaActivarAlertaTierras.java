
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaActivarAlertaTierras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaActivarAlertaTierras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaActivarAlertaTierras", propOrder = {
    "idAlerta"
})
public class TipoEntradaActivarAlertaTierras {

    protected int idAlerta;

    /**
     * Obtiene el valor de la propiedad idAlerta.
     * 
     */
    public int getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define el valor de la propiedad idAlerta.
     * 
     */
    public void setIdAlerta(int value) {
        this.idAlerta = value;
    }

}
