/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolListaPermisosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RolListaPermisosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Rol lista
 * permisos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolListaPermisosDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo RolDTO para definir la propiedad rol.
	 */
	private RolDTO ir_rolDto;
	
	/**
	 * Atributo de instancia tipo lista de PermisoEstadoDTO para definir la
	 * propiedad permiso estado.
	 */
	private List<PermisoEstadoDTO> ilpe_permisoEstadoDto;

	/**
	 * Obtiene el valor para la propiedad rol dto.
	 *
	 * @return El valor de la propiedad rol dto
	 */
	public RolDTO getIr_rolDto() {
		return ir_rolDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol dto.
	 *
	 * @param ar_rolDto el nuevo valor para la propiedad rol dto
	 */
	public void setIr_rolDto(RolDTO ar_rolDto) {
		this.ir_rolDto = ar_rolDto;
	}

	/**
	 * Obtiene el valor para la propiedad permiso estado dto.
	 *
	 * @return El valor de la propiedad permiso estado dto
	 */
	public List<PermisoEstadoDTO> getIlpe_permisoEstadoDto() {
		return ilpe_permisoEstadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad permiso estado dto.
	 *
	 * @param alpe_permisoEstadoDto el nuevo valor para la propiedad permiso estado
	 *                              dto
	 */
	public void setIlpe_permisoEstadoDto(List<PermisoEstadoDTO> alpe_permisoEstadoDto) {
		this.ilpe_permisoEstadoDto = alpe_permisoEstadoDto;
	}

}
