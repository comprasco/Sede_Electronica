/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaEntidadesEspecialesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ListaEntidadesEspecialesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista entidades
 * especiales.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaEntidadesBancariasDTO implements Serializable {

    /**
     * Define la constante serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Atributo de instancia tipo cadena de caracteres para definir la propiedad
     * codigo.
     */
    private String is_codigo;
    
    /**
     * Atributo de instancia tipo cadena de caracteres para definir la propiedad
     * nombre.
     */
    private String is_nombre;
    
    /**
     * Atributo de instancia tipo cadena de caracteres para definir la propiedad
     * nombre entidad.
     */
    private String is_nombreEntidad;
    /**
     * Obtiene el valor para la propiedad codigo.
     *
     * @return El valor de la propiedad codigo
     */
    public String getIs_codigo() {
        return is_codigo;
    }
    /**
     * Cambia/actualiza el valor para la propiedad codigo.
     *
     * @param as_codigo el nuevo valor para la propiedad codigo
     */
    public void setIs_codigo(String as_codigo) {
        this.is_codigo = as_codigo;
    }
    /**
     * Obtiene el valor para la propiedad nombre.
     *
     * @return El valor de la propiedad nombre
     */
    public String getIs_nombre() {
        return is_nombre;
    }
    /**
     * Cambia/actualiza el valor para la propiedad nombre.
     *
     * @param as_nombre el nuevo valor para la propiedad nombre
     */
    public void setIs_nombre(String as_nombre) {
        this.is_nombre = as_nombre;
    }
    /**
     * Obtiene el valor para la propiedad nombre entidad.
     *
     * @return El valor de la propiedad nombre entidad
     */
    public String getIs_nombreEntidad() {
        return is_nombreEntidad;
    }
    /**
     * Cambia/actualiza el valor para la propiedad nombre entidad.
     *
     * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
     */
    public void setIs_nombreEntidad(String as_nombreEntidad) {
        this.is_nombreEntidad = as_nombreEntidad;
    }
}

