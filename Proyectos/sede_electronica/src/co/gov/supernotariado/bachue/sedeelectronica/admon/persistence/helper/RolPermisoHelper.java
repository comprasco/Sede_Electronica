/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolPermisoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: RolPermisoHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Rol permiso.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolPermisoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase RolPermisoHelper.
	 */
	private RolPermisoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param arp_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como RolPermisoDTO
	 */
	public static RolPermisoDTO entidadADtoSimple(RolPermiso arp_entidad) {
		RolPermisoDTO lrpd_dto = new RolPermisoDTO();
		lrpd_dto.setIs_id(arp_entidad.getId());
		lrpd_dto.setIs_activo(arp_entidad.getActivo());
		lrpd_dto.setIs_activoPorDefecto(arp_entidad.getActivoPorDefecto());
		lrpd_dto.setIs_editable(arp_entidad.getEditable());
		lrpd_dto.setId_fechaCreacion(arp_entidad.getFechaCreacion());
		lrpd_dto.setId_fechaModificacion(arp_entidad.getFechaModificacion());
		lrpd_dto.setIs_idUsuarioCreacion(arp_entidad.getIdUsuarioCreacion());
		lrpd_dto.setIs_idUsuarioModificacion(arp_entidad.getIdUsuarioModificacion());
		lrpd_dto.setIs_ipCreacion(arp_entidad.getIpCreacion());
		lrpd_dto.setIs_ipModificacion(arp_entidad.getIpModificacion());
		lrpd_dto.setIs_estereotipoCreacion(arp_entidad.getEstereotipoCreacion());
		lrpd_dto.setIs_estereotipoModificacion(arp_entidad.getEstereotipoModificacion());
		return lrpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param arp_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como RolPermisoDTO
	 */
	public static RolPermisoDTO entidadADtoCompleto(RolPermiso arp_entidad) {
		RolPermisoDTO lrpd_dto = entidadADtoSimple(arp_entidad);
		if (arp_entidad.getPermiso() != null)
			lrpd_dto.setIp_permisoDto(PermisoHelper.entidadADtoSimple(arp_entidad.getPermiso()));
		if (arp_entidad.getRol() != null)
			lrpd_dto.setIr_rolDto(RolHelper.entidadADtoSimple(arp_entidad.getRol()));

		return lrpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alrp_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         RolPermisoDTO
	 */
	public static List<RolPermisoDTO> listaEntidadADtoSimple(List<RolPermiso> alrp_listaEntidad) {
		List<RolPermisoDTO> llrpd_listaDto = new ArrayList<>();
		for (RolPermiso lrp_entidad : alrp_listaEntidad) {
			llrpd_listaDto.add(entidadADtoSimple(lrp_entidad));
		}
		return llrpd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alrp_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de RolPermisoDTO
	 */
	public static List<RolPermisoDTO> listaEntidadADtoCompleto(List<RolPermiso> alrp_listaEntidad) {
		List<RolPermisoDTO> llrpd_listaDto = new ArrayList<>();
		for (RolPermiso lrp_entidad : alrp_listaEntidad) {
			llrpd_listaDto.add(entidadADtoCompleto(lrp_entidad));
		}
		return llrpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param arpd_dto    el parametro dto
	 * @param arp_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como RolPermiso
	 */
	public static RolPermiso dtoAEntidadSimple(RolPermisoDTO arpd_dto, RolPermiso arp_entidad) {
		if (null == arp_entidad) {
			arp_entidad = new RolPermiso();
		}
		arp_entidad.setId(arpd_dto.getIs_id());
		arp_entidad.setActivo(arpd_dto.getIs_activo());
		arp_entidad.setActivoPorDefecto(arpd_dto.getIs_activoPorDefecto());
		arp_entidad.setEditable(arpd_dto.getIs_editable());
		arp_entidad.setFechaCreacion(arpd_dto.getId_fechaCreacion());
		arp_entidad.setFechaModificacion(arpd_dto.getId_fechaModificacion());
		arp_entidad.setIdUsuarioCreacion(arpd_dto.getIs_idUsuarioCreacion());
		arp_entidad.setIdUsuarioModificacion(arpd_dto.getIs_idUsuarioModificacion());
		arp_entidad.setIpCreacion(arpd_dto.getIs_ipCreacion());
		arp_entidad.setIpModificacion(arpd_dto.getIs_ipModificacion());
		arp_entidad.setEstereotipoCreacion(arpd_dto.getIs_estereotipoCreacion());
		arp_entidad.setEstereotipoModificacion(arpd_dto.getIs_estereotipoModificacion());
		return arp_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param arpd_dto    el parametro dto
	 * @param arp_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como RolPermiso
	 */
	public static RolPermiso dtoAEntidadCompleto(RolPermisoDTO arpd_dto, RolPermiso arp_entidad) {
		arp_entidad = dtoAEntidadSimple(arpd_dto, arp_entidad);
		if (arpd_dto.getIp_permisoDto() != null) {
			arp_entidad.setPermiso(new Permiso());
			arp_entidad.getPermiso().setId(arpd_dto.getIp_permisoDto().getIs_id());
		}
		if (arpd_dto.getIr_rolDto() != null) {
			arp_entidad.setRol(new Rol());
			arp_entidad.getRol().setId(arpd_dto.getIr_rolDto().getIs_id());
		}

		return arp_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alrpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         RolPermiso
	 */
	public static List<RolPermiso> listaDtoAEntidadSimple(List<RolPermisoDTO> alrpd_listaDto) {
		List<RolPermiso> llrp_listaEntidad = new ArrayList<>();
		for (RolPermisoDTO lrpd_dto : alrpd_listaDto) {
			llrp_listaEntidad.add(dtoAEntidadSimple(lrpd_dto, null));
		}
		return llrp_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alrpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de RolPermiso
	 */
	public static List<RolPermiso> listaDtoAEntidadCompleto(List<RolPermisoDTO> alrpd_listaDto) {
		List<RolPermiso> llrp_listaEntidad = new ArrayList<>();
		for (RolPermisoDTO lrpd_dto : alrpd_listaDto) {
			llrp_listaEntidad.add(dtoAEntidadCompleto(lrpd_dto, null));
		}
		return llrp_listaEntidad;
	}
	// --- fin to Entidad
}
