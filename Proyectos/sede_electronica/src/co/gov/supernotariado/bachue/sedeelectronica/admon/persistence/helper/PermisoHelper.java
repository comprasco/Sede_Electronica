/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PermisoHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Permiso. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PermisoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoHelper.
	 */
	private PermisoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como PermisoDTO
	 */
	public static PermisoDTO entidadADtoSimple(Permiso ap_entidad) {
		PermisoDTO lpd_dto = new PermisoDTO();
		lpd_dto.setIs_id(ap_entidad.getId());
		lpd_dto.setIs_codigoMenu(ap_entidad.getCodigoMenu());
		lpd_dto.setIs_descripcion(ap_entidad.getDescripcion());
		lpd_dto.setId_fechaCreacion(ap_entidad.getFechaCreacion());
		lpd_dto.setId_fechaModificacion(ap_entidad.getFechaModificacion());
		lpd_dto.setIs_idUsuarioCreacion(ap_entidad.getIdUsuarioCreacion());
		lpd_dto.setIs_idUsuarioModificacion(ap_entidad.getIdUsuarioModificacion());
		lpd_dto.setIs_ipCreacion(ap_entidad.getIpCreacion());
		lpd_dto.setIs_ipModificacion(ap_entidad.getIpModificacion());
		lpd_dto.setIs_nombre(ap_entidad.getNombre());
		lpd_dto.setIs_nombreLargo(ap_entidad.getNombreLargo());
		lpd_dto.setIs_activo(ap_entidad.getActivo());
		lpd_dto.setIs_activoPorDefecto(ap_entidad.getActivoPorDefecto());
		lpd_dto.setIs_estereotipoCreacion(ap_entidad.getEstereotipoCreacion());
		lpd_dto.setIs_estereotipoModificacion(ap_entidad.getEstereotipoModificacion());

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como PermisoDTO
	 */
	public static PermisoDTO entidadADtoCompleto(Permiso ap_entidad) {
		PermisoDTO lpd_dto;
		lpd_dto = entidadADtoSimple(ap_entidad);

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         PermisoDTO
	 */
	public static List<PermisoDTO> listaEntidadADtoSimple(List<Permiso> alp_listaEntidades) {
		List<PermisoDTO> lpd_listaDto = new ArrayList<>();
		for (Permiso lp_entidad : alp_listaEntidades) {
			lpd_listaDto.add(entidadADtoSimple(lp_entidad));
		}
		return lpd_listaDto;
	}

	/**
	 * Método que convierte una lista de entidades a una lista de dto usando todos
	 * los datos incluyendo relaciones.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de PermisoDTO
	 */
	public static List<PermisoDTO> listaEntidadADtoCompleto(List<Permiso> alp_listaEntidades) {
		List<PermisoDTO> lpd_listaDto = new ArrayList<>();
		for (Permiso lp_entidad : alp_listaEntidades) {
			lpd_listaDto.add(entidadADtoCompleto(lp_entidad));
		}
		return lpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Permiso
	 */
	public static Permiso dtoAEntidadSimple(PermisoDTO apd_dto, Permiso ap_entidad) {
		if (null == ap_entidad) {
			ap_entidad = new Permiso();
		}
		ap_entidad.setId(apd_dto.getIs_id());
		ap_entidad.setCodigoMenu(apd_dto.getIs_codigoMenu());
		ap_entidad.setDescripcion(apd_dto.getIs_descripcion());
		ap_entidad.setFechaCreacion(apd_dto.getId_fechaCreacion());
		ap_entidad.setFechaModificacion(apd_dto.getId_fechaModificacion());
		ap_entidad.setIdUsuarioCreacion(apd_dto.getIs_idUsuarioCreacion());
		ap_entidad.setIdUsuarioModificacion(apd_dto.getIs_idUsuarioModificacion());
		ap_entidad.setIpCreacion(apd_dto.getIs_ipCreacion());
		ap_entidad.setIpModificacion(apd_dto.getIs_ipModificacion());
		ap_entidad.setNombre(apd_dto.getIs_nombre());
		ap_entidad.setNombreLargo(apd_dto.getIs_nombreLargo());
		ap_entidad.setActivo(apd_dto.getIs_activo());
		ap_entidad.setActivoPorDefecto(apd_dto.getIs_activoPorDefecto());
		ap_entidad.setEstereotipoCreacion(apd_dto.getIs_estereotipoCreacion());
		ap_entidad.setEstereotipoModificacion(apd_dto.getIs_estereotipoModificacion());
		return ap_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Permiso
	 */
	public static Permiso dtoAEntidadCompleto(PermisoDTO apd_dto, Permiso ap_entidad) {
		ap_entidad = dtoAEntidadSimple(apd_dto, ap_entidad);

		return ap_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Permiso
	 */
	public static List<Permiso> listaDtoAEntidadSimple(List<PermisoDTO> alpd_listaDto) {
		List<Permiso> llp_listaEntidades = new ArrayList<>();
		for (PermisoDTO lpd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadSimple(lpd_dto, null));
		}
		return llp_listaEntidades;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return List<Permiso>
	 */
	public static List<Permiso> listaDtoAEntidadCompleto(List<PermisoDTO> alpd_listaDto) {
		List<Permiso> llp_listaEntidades = new ArrayList<>();
		for (PermisoDTO lpd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadCompleto(lpd_dto, null));
		}
		return llp_listaEntidades;
	}
	// --- fin to Entidad
}
