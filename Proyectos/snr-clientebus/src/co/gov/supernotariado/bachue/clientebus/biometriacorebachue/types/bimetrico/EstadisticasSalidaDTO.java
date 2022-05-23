
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadisticasSalidaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estadisticasSalidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.servicios.corebachue.bachue.supernotariado.gov.co/}baseSalidaDTO">
 *       &lt;sequence>
 *         &lt;element name="contador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadisticasSalidaDTO", propOrder = {
    "contador"
})
public class EstadisticasSalidaDTO
    extends BaseSalidaDTO
{

    protected int contador;

    /**
     * Obtiene el valor de la propiedad contador.
     * 
     */
    public int getContador() {
        return contador;
    }

    /**
     * Define el valor de la propiedad contador.
     * 
     */
    public void setContador(int value) {
        this.contador = value;
    }

}
