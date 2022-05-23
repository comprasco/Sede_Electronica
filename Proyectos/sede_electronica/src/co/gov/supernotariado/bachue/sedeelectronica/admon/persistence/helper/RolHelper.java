/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: RolHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Rol. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase RolHelper.
	 */
	private RolHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ar_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como RolDTO
	 */
	public static RolDTO entidadADtoSimple(Rol ar_entidad) {
		RolDTO lrd_dto = new RolDTO();
		lrd_dto.setIs_id(ar_entidad.getId());
		lrd_dto.setIs_descripcion(ar_entidad.getDescripcion());
		lrd_dto.setId_fechaCreacion(ar_entidad.getFechaCreacion());
		lrd_dto.setId_fechaModificacion(ar_entidad.getFechaModificacion());
		lrd_dto.setIs_idUsuarioCreacion(ar_entidad.getIdUsuarioCreacion());
		lrd_dto.setIs_idUsuarioModificacion(ar_entidad.getIdUsuarioModificacion());
		lrd_dto.setIs_ipCreacion(ar_entidad.getIpCreacion());
		lrd_dto.setIs_ipModificacion(ar_entidad.getIpModificacion());
		lrd_dto.setIs_nombre(ar_entidad.getNombre());
		lrd_dto.setIs_nombreLargo(ar_entidad.getNombreLargo());
		lrd_dto.setIs_activo(ar_entidad.getActivo());
		lrd_dto.setIs_activoPorDefecto(ar_entidad.getActivoPorDefecto());
		lrd_dto.setIs_estereotipoCreacion(ar_entidad.getEstereotipoCreacion());
		lrd_dto.setIs_estereotipoModificacion(ar_entidad.getEstereotipoModificacion());
		return lrd_dto;
	}

	/**
	 * Método que convierte de entidad a dto completa usando todos los datos
	 * incluyendo relaciones.
	 *
	 * @param ar_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como RolDTO
	 */
	public static RolDTO entidadADtoCompleto(Rol ar_entidad) {
		RolDTO lrd_dto;
		lrd_dto = entidadADtoSimple(ar_entidad);

		return lrd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alr_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         RolDTO
	 */
	public static List<RolDTO> listaEntidadADtoSimple(List<Rol> alr_listaEntidad) {
		List<RolDTO> llrd_listaDto = new ArrayList<>();
		for (Rol lr_entidad : alr_listaEntidad) {
			llrd_listaDto.add(entidadADtoSimple(lr_entidad));
		}
		return llrd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alr_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de RolDTO
	 */
	public static List<RolDTO> listaEntidadADtoCompleto(List<Rol> alr_listaEntidad) {
		List<RolDTO> llrd_listaDto = new ArrayList<>();
		for (Rol lr_entidad : alr_listaEntidad) {
			llrd_listaDto.add(entidadADtoCompleto(lr_entidad));
		}
		return llrd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ard_dto    el parametro dto
	 * @param ar_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Rol
	 */
	public static Rol dtoAEntidadSimple(RolDTO ard_dto, Rol ar_entidad) {
		if (null == ar_entidad) {
			ar_entidad = new Rol();
		}
		ar_entidad.setId(ard_dto.getIs_id());
		ar_entidad.setDescripcion(ard_dto.getIs_descripcion());
		ar_entidad.setFechaCreacion(ard_dto.getId_fechaCreacion());
		ar_entidad.setFechaModificacion(ard_dto.getId_fechaModificacion());
		ar_entidad.setIdUsuarioCreacion(ard_dto.getIs_idUsuarioCreacion());
		ar_entidad.setIdUsuarioModificacion(ard_dto.getIs_idUsuarioModificacion());
		ar_entidad.setIpCreacion(ard_dto.getIs_ipCreacion());
		ar_entidad.setIpModificacion(ard_dto.getIs_ipModificacion());
		ar_entidad.setNombre(ard_dto.getIs_nombre());
		ar_entidad.setNombreLargo(ard_dto.getIs_nombreLargo());
		ar_entidad.setActivo(ard_dto.getIs_activo());
		ar_entidad.setActivoPorDefecto(ard_dto.getIs_activoPorDefecto());
		ar_entidad.setEstereotipoCreacion(ard_dto.getIs_estereotipoCreacion());
		ar_entidad.setEstereotipoModificacion(ard_dto.getIs_estereotipoModificacion());
		return ar_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ard_dto    el parametro dto
	 * @param ar_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Rol
	 */
	public static Rol dtoAEntidadCompleto(RolDTO ard_dto, Rol ar_entidad) {
		ar_entidad = dtoAEntidadSimple(ard_dto, ar_entidad);

		return ar_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alrd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Rol
	 */
	public static List<Rol> listaDtoAEntidadSimple(List<RolDTO> alrd_listaDto) {
		List<Rol> llr_listaEntidad = new ArrayList<>();
		for (RolDTO lrd_dto : alrd_listaDto) {
			llr_listaEntidad.add(dtoAEntidadSimple(lrd_dto, null));
		}
		return llr_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alrd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Rol
	 */
	public static List<Rol> listaDtoAEntidadCompleto(List<RolDTO> alrd_listaDto) {
		List<Rol> llr_listaEntidad = new ArrayList<>();
		for (RolDTO lrd_dto : alrd_listaDto) {
			llr_listaEntidad.add(dtoAEntidadCompleto(lrd_dto, null));
		}
		return llr_listaEntidad;
	}
	// --- fin to Entidad
}
