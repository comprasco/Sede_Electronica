/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialInicioSesionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistorialInicioSesionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historial inicio
 * sesion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialInicioSesionDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * estereotipo.
 */
// --- Atributos
	private String is_estereotipo;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha.
	 */
	private Date id_fecha;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * catalogo accion usuario.
	 */
	private String is_idCatalogoAccionUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario.
	 */
	private String is_idUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip
	 * usuario.
	 */
	private String is_ipUsuario;

/**
 * Construye una nueva instancia/objeto de la clase HistorialInicioSesionDTO.
 */
// --- Constructor
	public HistorialInicioSesionDTO() {
		// Metodo constructor vacio para modelo DTO
	}

//--- Getters-Setters

	/**
 * Obtiene el valor para la propiedad estereotipo.
 *
 * @return El valor de la propiedad estereotipo
 */
public String getIs_estereotipo() {
		return is_estereotipo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo.
	 *
	 * @param as_estereotipo el nuevo valor para la propiedad estereotipo
	 */
	public void setIs_estereotipo(String as_estereotipo) {
		this.is_estereotipo = as_estereotipo;
	}

	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public Date getId_fecha() {
		return id_fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param ad_fecha el nuevo valor para la propiedad fecha
	 */
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}

	/**
	 * Obtiene el valor para la propiedad id catalogo accion usuario.
	 *
	 * @return El valor de la propiedad id catalogo accion usuario
	 */
	public String getIs_idCatalogoAccionUsuario() {
		return is_idCatalogoAccionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id catalogo accion usuario.
	 *
	 * @param as_idCatalogoAccionUsuario el nuevo valor para la propiedad id
	 *                                   catalogo accion usuario
	 */
	public void setIs_idCatalogoAccionUsuario(String as_idCatalogoAccionUsuario) {
		this.is_idCatalogoAccionUsuario = as_idCatalogoAccionUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad ip usuario.
	 *
	 * @return El valor de la propiedad ip usuario
	 */
	public String getIs_ipUsuario() {
		return is_ipUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip usuario.
	 *
	 * @param as_ipUsuario el nuevo valor para la propiedad ip usuario
	 */
	public void setIs_ipUsuario(String as_ipUsuario) {
		this.is_ipUsuario = as_ipUsuario;
	}

}
