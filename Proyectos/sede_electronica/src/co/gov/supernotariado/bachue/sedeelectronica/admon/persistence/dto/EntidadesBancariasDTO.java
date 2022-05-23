/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadesBancariasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: EntidadesBancariasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entidades
 * bacarias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadesBancariasDTO extends GenericoDTO implements Serializable {
    /**
     * Define la constante serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Atributo de instancia tipo cadena de caracteres para definir la propiedad
     * codigo entidad.
     */
    @SerializedName("ID_ENTIDAD_RECAUDADORA")
    private String is_idEntidadRecaudadora;
    /**
     * Atributo de instancia tipo cadena de caracteres para definir la propiedad
     * nombre entidad externa.
     */
    @SerializedName("NOMBRE_ENTIDAD_RECAUDADORA")
    private String is_nombreEntidadRecaudadora;
    /**
     * Obtiene el valor para la propiedad id entidad recaudadora.
     *
     * @return El valor de la propiedad id entidad recaudadora
     */
    public String getIs_idEntidadRecaudadora() {
        return is_idEntidadRecaudadora;
    }
    /**
     * Cambia/actualiza el valor para la propiedad id entidad recaudadora.
     *
     * @param as_idEntidadRecaudadora el nuevo valor para la propiedad id entidad
     *                                recaudadora
     */
    public void setIs_idEntidadRecaudadora(String as_idEntidadRecaudadora) {
        this.is_idEntidadRecaudadora = as_idEntidadRecaudadora;
    }
    /**
     * Obtiene el valor para la propiedad nombre entidad recaudadora.
     *
     * @return El valor de la propiedad nombre entidad recaudadora
     */
    public String getIs_nombreEntidadRecaudadora() {
        return is_nombreEntidadRecaudadora;
    }
    /**
     * Cambia/actualiza el valor para la propiedad nombre entidad recaudadora.
     *
     * @param as_nombreEntidadRecaudadora el nuevo valor para la propiedad nombre
     *                                    entidad recaudadora
     */
    public void setIs_nombreEntidadRecaudadora(String as_nombreEntidadRecaudadora) {
        this.is_nombreEntidadRecaudadora = as_nombreEntidadRecaudadora;
    }
}
