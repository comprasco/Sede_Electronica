/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AccionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AccionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Accion;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Accion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AccionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase AccionHelper.
	 */
	private AccionHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como AccionDTO
	 */
	public static AccionDTO entidadADtoSimple(Accion aa_entidad) {
		AccionDTO lad_dto = new AccionDTO();
		lad_dto.setIs_id(aa_entidad.getId());
		lad_dto.setIs_descripcion(aa_entidad.getDescripcion());
		lad_dto.setId_fechaCreacion(aa_entidad.getFechaCreacion());
		lad_dto.setId_fechaModificacion(aa_entidad.getFechaModificacion());
		lad_dto.setIs_idUsuarioCreacion(aa_entidad.getIdUsuarioCreacion());
		lad_dto.setIs_idUsuarioModificacion(aa_entidad.getIdUsuarioModificacion());
		lad_dto.setIs_estereotipoCreacion(aa_entidad.getEstereotipoCreacion());
		lad_dto.setIs_estereotipoModificacion(aa_entidad.getEstereotipoModificacion());
		lad_dto.setIs_ipCreacion(aa_entidad.getIpCreacion());
		lad_dto.setIs_ipModificacion(aa_entidad.getIpModificacion());
		lad_dto.setIs_activo(aa_entidad.getActivo());
		lad_dto.setIs_valor(aa_entidad.getValor());

		return lad_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como AccionDTO
	 */
	public static AccionDTO entidadADtoCompleto(Accion aa_entidad) {
		AccionDTO lad_dto;
		lad_dto = entidadADtoSimple(aa_entidad);
		return lad_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param ala_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         AccionDTO
	 */
	public static List<AccionDTO> listaEntidadADtoSimple(List<Accion> ala_listaEntidades) {
		List<AccionDTO> llad_listaDto = new ArrayList<>();
		for (Accion la_entidad : ala_listaEntidades) {
			llad_listaDto.add(entidadADtoSimple(la_entidad));
		}
		return llad_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param ala_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de AccionDTO
	 */
	public static List<AccionDTO> listaEntidadADtoCompleto(List<Accion> ala_listaEntidades) {
		List<AccionDTO> llad_listaDto = new ArrayList<>();
		for (Accion la_entidad : ala_listaEntidades) {
			llad_listaDto.add(entidadADtoCompleto(la_entidad));
		}
		return llad_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aa_dto     el parametro dto
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Accion
	 */
	public static Accion dtoAEntidadSimple(AccionDTO aa_dto, Accion aa_entidad) {
		if (null == aa_entidad) {
			aa_entidad = new Accion();
		}
		aa_entidad.setId(aa_dto.getIs_id());
		aa_entidad.setDescripcion(aa_dto.getIs_descripcion());
		aa_entidad.setFechaCreacion(aa_dto.getId_fechaCreacion());
		aa_entidad.setFechaModificacion(aa_dto.getId_fechaModificacion());
		aa_entidad.setIdUsuarioCreacion(aa_dto.getIs_idUsuarioCreacion());
		aa_entidad.setIdUsuarioModificacion(aa_dto.getIs_idUsuarioModificacion());
		aa_entidad.setIpCreacion(aa_dto.getIs_ipCreacion());
		aa_entidad.setIpModificacion(aa_dto.getIs_ipModificacion());
		aa_entidad.setActivo(aa_dto.getIs_activo());
		aa_entidad.setValor(aa_dto.getIs_valor());
		aa_entidad.setEstereotipoCreacion(aa_dto.getIs_estereotipoCreacion());
		aa_entidad.setEstereotipoModificacion(aa_dto.getIs_estereotipoModificacion());
		return aa_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aa_dto     el parametro dto
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Accion
	 */
	public static Accion dtoAEntidadCompleto(AccionDTO aa_dto, Accion aa_entidad) {
		aa_entidad = dtoAEntidadSimple(aa_dto, aa_entidad);

		return aa_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param ala_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Accion
	 */
	public static List<Accion> listaDtoAEntidadSimple(List<AccionDTO> ala_listaDto) {
		List<Accion> lla_listaEntidades = new ArrayList<>();
		for (AccionDTO lad_dto : ala_listaDto) {
			lla_listaEntidades.add(dtoAEntidadSimple(lad_dto, null));
		}
		return lla_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param ala_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Accion
	 */
	public static List<Accion> listaDtoAEntidadCompleto(List<AccionDTO> ala_listaDto) {
		List<Accion> lla_listaEntidades = new ArrayList<>();
		for (AccionDTO lad_dto : ala_listaDto) {
			lla_listaEntidades.add(dtoAEntidadCompleto(lad_dto, null));
		}
		return lla_listaEntidades;
	}
	// --- fin to Entidad
}
