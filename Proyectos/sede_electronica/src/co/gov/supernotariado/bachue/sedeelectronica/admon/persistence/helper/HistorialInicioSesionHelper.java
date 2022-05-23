/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialInicioSesionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistorialInicioSesionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialInicioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialInicioSesion;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Historial
 * inicio sesion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialInicioSesionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase HistorialInicioSesionHelper.
	 */
	// --- to DTO
	private HistorialInicioSesionHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ahis_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         HistorialInicioSesionDTO
	 */
	public static HistorialInicioSesionDTO entidadADtoSimple(HistorialInicioSesion ahis_entidad) {
		HistorialInicioSesionDTO lhis_dto = new HistorialInicioSesionDTO();
		lhis_dto.setIs_id(ahis_entidad.getId());
		lhis_dto.setIs_activo(ahis_entidad.getActivo());
		lhis_dto.setIs_estereotipo(ahis_entidad.getEstereotipo());
		lhis_dto.setId_fecha(ahis_entidad.getFecha());
		lhis_dto.setId_fechaCreacion(ahis_entidad.getFechaCreacion());
		lhis_dto.setId_fechaModificacion(ahis_entidad.getFechaModificacion());
		lhis_dto.setIs_idCatalogoAccionUsuario(ahis_entidad.getIdCatalogoAccionUsuario());
		lhis_dto.setIs_idUsuario(ahis_entidad.getIdUsuario());
		lhis_dto.setIs_idUsuarioCreacion(ahis_entidad.getIdUsuarioCreacion());
		lhis_dto.setIs_idUsuarioModificacion(ahis_entidad.getIdUsuarioModificacion());
		lhis_dto.setIs_ipCreacion(ahis_entidad.getIpCreacion());
		lhis_dto.setIs_ipModificacion(ahis_entidad.getIpModificacion());
		lhis_dto.setIs_ipUsuario(ahis_entidad.getIpUsuario());
		lhis_dto.setIs_estereotipoCreacion(ahis_entidad.getEstereotipoCreacion());
		lhis_dto.setIs_estereotipoModificacion(ahis_entidad.getEstereotipoModificacion());

		return lhis_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ahis_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         HistorialInicioSesionDTO
	 */
	public static HistorialInicioSesionDTO entidadADtoCompleto(HistorialInicioSesion ahis_entidad) {
		HistorialInicioSesionDTO lhis_dto;
		lhis_dto = entidadADtoSimple(ahis_entidad);
		return lhis_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alhis_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         HistorialInicioSesionDTO
	 */
	public static List<HistorialInicioSesionDTO> listaentidadADtoSimple(
			List<HistorialInicioSesion> alhis_listaEntidad) {
		List<HistorialInicioSesionDTO> llhis_listaDto = new ArrayList<>();
		for (HistorialInicioSesion lhis_entidad : alhis_listaEntidad) {
			llhis_listaDto.add(entidadADtoSimple(lhis_entidad));
		}
		return llhis_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alhis_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de HistorialInicioSesionDTO
	 */
	public static List<HistorialInicioSesionDTO> listaentidadADtoCompleto(
			List<HistorialInicioSesion> alhis_listaEntidad) {
		List<HistorialInicioSesionDTO> llhis_listaDto = new ArrayList<>();
		for (HistorialInicioSesion lhis_entidad : alhis_listaEntidad) {
			llhis_listaDto.add(entidadADtoCompleto(lhis_entidad));
		}
		return llhis_listaDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ahis_dto     el parametro dto
	 * @param ahis_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         HistorialInicioSesion
	 */
	public static HistorialInicioSesion dtoAEntidadSimple(HistorialInicioSesionDTO ahis_dto,
			HistorialInicioSesion ahis_entidad) {
		if (null == ahis_entidad) {
			ahis_entidad = new HistorialInicioSesion();
		}
		ahis_entidad.setId(ahis_dto.getIs_id());
		ahis_entidad.setActivo(ahis_dto.getIs_activo());
		ahis_entidad.setEstereotipo(ahis_dto.getIs_estereotipo());
		ahis_entidad.setFecha(ahis_dto.getId_fecha());
		ahis_entidad.setFechaCreacion(ahis_dto.getId_fechaCreacion());
		ahis_entidad.setFechaModificacion(ahis_dto.getId_fechaModificacion());
		ahis_entidad.setIdCatalogoAccionUsuario(ahis_dto.getIs_idCatalogoAccionUsuario());
		ahis_entidad.setIdUsuario(ahis_dto.getIs_idUsuario());
		ahis_entidad.setIdUsuarioCreacion(ahis_dto.getIs_idUsuarioCreacion());
		ahis_entidad.setIdUsuarioModificacion(ahis_dto.getIs_idUsuarioModificacion());
		ahis_entidad.setIpCreacion(ahis_dto.getIs_ipCreacion());
		ahis_entidad.setIpModificacion(ahis_dto.getIs_ipModificacion());
		ahis_entidad.setIpUsuario(ahis_dto.getIs_ipUsuario());
		ahis_entidad.setEstereotipoCreacion(ahis_dto.getIs_estereotipoCreacion());
		ahis_entidad.setEstereotipoModificacion(ahis_dto.getIs_estereotipoModificacion());
		return ahis_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ahis_dto     el parametro dto
	 * @param ahis_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         HistorialInicioSesion
	 */
	public static HistorialInicioSesion dtoAEntidadCompleto(HistorialInicioSesionDTO ahis_dto,
			HistorialInicioSesion ahis_entidad) {
		ahis_entidad = dtoAEntidadSimple(ahis_dto, ahis_entidad);

		return ahis_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param alhis_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         HistorialInicioSesion
	 */
	public static List<HistorialInicioSesion> listadtoAEntidadSimple(List<HistorialInicioSesionDTO> alhis_listaDto) {
		List<HistorialInicioSesion> llhis_listaEntidad = new ArrayList<>();
		for (HistorialInicioSesionDTO lhis_dto : alhis_listaDto) {
			llhis_listaEntidad.add(dtoAEntidadSimple(lhis_dto, null));
		}
		return llhis_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alhis_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de HistorialInicioSesion
	 */
	public static List<HistorialInicioSesion> listadtoAEntidadCompleto(List<HistorialInicioSesionDTO> alhis_listaDto) {
		List<HistorialInicioSesion> llhis_listaEntidad = new ArrayList<>();
		for (HistorialInicioSesionDTO lhis_dto : alhis_listaDto) {
			llhis_listaEntidad.add(dtoAEntidadCompleto(lhis_dto, null));
		}
		return llhis_listaEntidad;
	}
	// --- fin to Entidad
}
