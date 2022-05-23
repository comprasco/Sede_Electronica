
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaEliminarProcAntiguoSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaEliminarProcAntiguoSistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAntiguoSistemaTierras" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaEliminarProcAntiguoSistema", propOrder = {
    "idAlerta",
    "idAntiguoSistemaTierras"
})
public class TipoEntradaEliminarProcAntiguoSistema {

    protected int idAlerta;
    protected int idAntiguoSistemaTierras;

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

    /**
     * Obtiene el valor de la propiedad idAntiguoSistemaTierras.
     * 
     */
    public int getIdAntiguoSistemaTierras() {
        return idAntiguoSistemaTierras;
    }

    /**
     * Define el valor de la propiedad idAntiguoSistemaTierras.
     * 
     */
    public void setIdAntiguoSistemaTierras(int value) {
        this.idAntiguoSistemaTierras = value;
    }

}
