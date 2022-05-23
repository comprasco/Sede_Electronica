/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoServicioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoServicioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo servicio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo servicio.
	 */
	private String is_tipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad sub
	 * tipo servicio.
	 */
	private String is_subTipoServicio;
	
	/**
	 * Atributo de instancia tipo EnumModoTipoServicio para definir la propiedad
	 * enum modo tipo servicio.
	 */
	private EnumModoTipoServicio iemts_enumModoTipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad enum modo tipo servicio.
	 *
	 * @return El valor de la propiedad enum modo tipo servicio
	 */
	public EnumModoTipoServicio getIemts_enumModoTipoServicio() {
		return iemts_enumModoTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum modo tipo servicio.
	 *
	 * @param aemts_enumModoTipoServicio el nuevo valor para la propiedad enum modo
	 *                                   tipo servicio
	 */
	public void setIemts_enumModoTipoServicio(EnumModoTipoServicio aemts_enumModoTipoServicio) {
		this.iemts_enumModoTipoServicio = aemts_enumModoTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad sub tipo servicio.
	 *
	 * @return El valor de la propiedad sub tipo servicio
	 */
	public String getIs_subTipoServicio() {
		return is_subTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad sub tipo servicio.
	 *
	 * @param as_subTipoServicio el nuevo valor para la propiedad sub tipo servicio
	 */
	public void setIs_subTipoServicio(String as_subTipoServicio) {
		this.is_subTipoServicio = as_subTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo servicio.
	 *
	 * @return El valor de la propiedad tipo servicio
	 */
	public String getIs_tipoServicio() {
		return is_tipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio.
	 *
	 * @param as_tipoServicio el nuevo valor para la propiedad tipo servicio
	 */
	public void setIs_tipoServicio(String as_tipoServicio) {
		this.is_tipoServicio = as_tipoServicio;
	}

}
