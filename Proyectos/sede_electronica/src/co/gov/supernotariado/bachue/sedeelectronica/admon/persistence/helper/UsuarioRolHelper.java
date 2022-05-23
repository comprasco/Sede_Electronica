/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioRolHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: UsuarioRolHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Usuario rol.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioRolHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioRolHelper.
	 */
	private UsuarioRolHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param aur_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como UsuarioRolDTO
	 */
	public static UsuarioRolDTO entidadADtoSimple(UsuarioRol aur_entidad) {

		UsuarioRolDTO lurd_dto = new UsuarioRolDTO();
		lurd_dto.setIs_id(aur_entidad.getId());
		lurd_dto.setIs_activo(aur_entidad.getActivo());
		lurd_dto.setIs_activoDefecto(aur_entidad.getActivoDefecto());
		lurd_dto.setId_fechaCreacion(aur_entidad.getFechaCreacion());
		lurd_dto.setId_fechaModificacion(aur_entidad.getFechaModificacion());
		lurd_dto.setIs_idUsuarioCreacion(aur_entidad.getIdUsuarioCreacion());
		lurd_dto.setIs_idUsuarioModificacion(aur_entidad.getIdUsuarioModificacion());
		lurd_dto.setIs_ipCreacion(aur_entidad.getIpCreacion());
		lurd_dto.setIs_ipModificacion(aur_entidad.getIpModificacion());
		lurd_dto.setIs_activoDefecto(aur_entidad.getActivo());
		lurd_dto.setIs_activoDefecto(aur_entidad.getActivoDefecto());
		lurd_dto.setIs_estereotipoCreacion(aur_entidad.getEstereotipoCreacion());
		lurd_dto.setIs_estereotipoModificacion(aur_entidad.getEstereotipoModificacion());

		return lurd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aur_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como UsuarioRolDTO
	 */
	public static UsuarioRolDTO entidadADtoCompleto(UsuarioRol aur_entidad) {
		UsuarioRolDTO lurd_dto = entidadADtoSimple(aur_entidad);
		if (aur_entidad.getRol() != null)
			lurd_dto.setIr_rolDto(RolHelper.entidadADtoSimple(aur_entidad.getRol()));
		if (aur_entidad.getUsuario() != null)
			lurd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(aur_entidad.getUsuario()));

		return lurd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alur_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         UsuarioRolDTO
	 */

	public static List<UsuarioRolDTO> listaEntidadADtoSimple(List<UsuarioRol> alur_listaEntidades) {
		List<UsuarioRolDTO> llurd_listaDto = new ArrayList<>();
		for (UsuarioRol lur_entidad : alur_listaEntidades) {
			llurd_listaDto.add(entidadADtoSimple(lur_entidad));
		}
		return llurd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alur_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de UsuarioRolDTO
	 */
	public static List<UsuarioRolDTO> listaEntidadADtoCompleto(List<UsuarioRol> alur_listaEntidades) {
		List<UsuarioRolDTO> llurd_listaDto = new ArrayList<>();
		for (UsuarioRol lur_entidad : alur_listaEntidades) {
			llurd_listaDto.add(entidadADtoCompleto(lur_entidad));
		}
		return llurd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aurd_dto    el parametro dto
	 * @param aur_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como UsuarioRol
	 */
	public static UsuarioRol dtoAEntidadSimple(UsuarioRolDTO aurd_dto, UsuarioRol aur_entidad) {
		if (null == aur_entidad) {
			aur_entidad = new UsuarioRol();
		}
		aur_entidad.setId(aurd_dto.getIs_id());
		aur_entidad.setActivo(aurd_dto.getIs_activo());
		aur_entidad.setActivoDefecto(aurd_dto.getIs_activoDefecto());
		aur_entidad.setFechaCreacion(aurd_dto.getId_fechaCreacion());
		aur_entidad.setFechaModificacion(aurd_dto.getId_fechaModificacion());
		aur_entidad.setIdUsuarioCreacion(aurd_dto.getIs_idUsuarioCreacion());
		aur_entidad.setIdUsuarioModificacion(aurd_dto.getIs_idUsuarioModificacion());
		aur_entidad.setIpCreacion(aurd_dto.getIs_ipCreacion());
		aur_entidad.setIpModificacion(aurd_dto.getIs_ipModificacion());
		aur_entidad.setActivoDefecto(aurd_dto.getIs_activoDefecto());
		aur_entidad.setEstereotipoCreacion(aurd_dto.getIs_estereotipoCreacion());
		aur_entidad.setEstereotipoModificacion(aurd_dto.getIs_estereotipoModificacion());
		return aur_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aurd_dto    el parametro dto
	 * @param aur_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como UsuarioRol
	 */
	public static UsuarioRol dtoAEntidadCompleto(UsuarioRolDTO aurd_dto, UsuarioRol aur_entidad) {
		aur_entidad = dtoAEntidadSimple(aurd_dto, aur_entidad);
		if (aurd_dto.getIr_rolDto() != null) {
			aur_entidad.setRol(new Rol());
			aur_entidad.getRol().setId(aurd_dto.getIr_rolDto().getIs_id());
		}
		if (aurd_dto.getIu_usuarioDto() != null) {
			aur_entidad.setUsuario(new Usuario());
			aur_entidad.getUsuario().setId(aurd_dto.getIu_usuarioDto().getIs_id());
		}

		return aur_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alurd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         UsuarioRol
	 */
	public static List<UsuarioRol> listaDtoAEntidadSimple(List<UsuarioRolDTO> alurd_listaDto) {
		List<UsuarioRol> llur_listaEntidades = new ArrayList<>();
		for (UsuarioRolDTO lurd_dto : alurd_listaDto) {
			llur_listaEntidades.add(dtoAEntidadSimple(lurd_dto, null));
		}
		return llur_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alurd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de UsuarioRol
	 */
	public static List<UsuarioRol> listaDtoAEntidadCompleto(List<UsuarioRolDTO> alurd_listaDto) {
		List<UsuarioRol> llur_listaEntidades = new ArrayList<>();
		for (UsuarioRolDTO lurd_dto : alurd_listaDto) {
			llur_listaEntidades.add(dtoAEntidadCompleto(lurd_dto, null));
		}
		return llur_listaEntidades;
	}

	/**
	 * Metodo que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aur_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo foraneas retornado como
	 *         UsuarioRolDTO
	 */
	public static UsuarioRolDTO entidadADtoCompletoForaneas(UsuarioRol aur_entidad) {
		UsuarioRolDTO lurd_dto = entidadADtoSimple(aur_entidad);
		if (aur_entidad.getRol() != null)
			lurd_dto.setIr_rolDto(RolHelper.entidadADtoCompleto(aur_entidad.getRol()));
		if (aur_entidad.getUsuario() != null)
			lurd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(aur_entidad.getUsuario()));

		return lurd_dto;
	}
	// --- fin to Entidad
}
