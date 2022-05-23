/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LetraEjeHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: LetraEjeHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.LetraEjeDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.LetraEje;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Letra eje.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LetraEjeHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase LetraEjeHelper.
	 */
	private LetraEjeHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ale_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como LetraEjeDTO
	 */
	public static LetraEjeDTO entidadADtoSimple(LetraEje ale_entidad) {
		LetraEjeDTO lle_dto = new LetraEjeDTO();

		lle_dto.setIs_id(ale_entidad.getId());
		lle_dto.setIs_letra(ale_entidad.getLetra());
		lle_dto.setId_fechaCreacion(ale_entidad.getFechaCreacion());
		lle_dto.setId_fechaModificacion(ale_entidad.getFechaModificacion());
		lle_dto.setIs_idUsuarioCreacion(ale_entidad.getIdUsuarioCreacion());
		lle_dto.setIs_idUsuarioModificacion(ale_entidad.getIdUsuarioModificacion());
		lle_dto.setIs_ipCreacion(ale_entidad.getIpCreacion());
		lle_dto.setIs_ipModificacion(ale_entidad.getIpModificacion());
		lle_dto.setIs_activo(ale_entidad.getActivo());
		lle_dto.setIs_estereotipoCreacion(ale_entidad.getEstereotipoCreacion());
		lle_dto.setIs_estereotipoModificacion(ale_entidad.getEstereotipoModificacion());
		return lle_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alle_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         LetraEjeDTO
	 */
	public static List<LetraEjeDTO> listaEntidadADtoSimple(List<LetraEje> alle_listaEntidades) {
		List<LetraEjeDTO> llle_listaDto = new ArrayList<>();
		for (LetraEje lle_entidad : alle_listaEntidades) {
			llle_listaDto.add(entidadADtoSimple(lle_entidad));
		}
		return llle_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ale_dto     el parametro dto
	 * @param ale_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como LetraEje
	 */
	public static LetraEje dtoAEntidadSimple(LetraEjeDTO ale_dto, LetraEje ale_entidad) {
		if (null == ale_entidad) {
			ale_entidad = new LetraEje();
		}
		ale_entidad.setId(ale_dto.getIs_id());
		ale_entidad.setLetra(ale_dto.getIs_letra());
		ale_entidad.setFechaCreacion(ale_dto.getId_fechaCreacion());
		ale_entidad.setFechaModificacion(ale_dto.getId_fechaModificacion());
		ale_entidad.setIdUsuarioCreacion(ale_dto.getIs_idUsuarioCreacion());
		ale_entidad.setIdUsuarioModificacion(ale_dto.getIs_idUsuarioModificacion());
		ale_entidad.setIpCreacion(ale_dto.getIs_ipCreacion());
		ale_entidad.setIpModificacion(ale_dto.getIs_ipModificacion());
		ale_entidad.setActivo(ale_dto.getIs_activo());
		ale_entidad.setEstereotipoCreacion(ale_dto.getIs_estereotipoCreacion());
		ale_entidad.setEstereotipoModificacion(ale_dto.getIs_estereotipoModificacion());
		return ale_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param alle_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         LetraEje
	 */
	public static List<LetraEje> listaDtoAEntidadSimple(List<LetraEjeDTO> alle_listaDto) {
		List<LetraEje> llle_listaEntidades = new ArrayList<>();
		for (LetraEjeDTO lle_dto : alle_listaDto) {
			llle_listaEntidades.add(dtoAEntidadSimple(lle_dto, null));
		}
		return llle_listaEntidades;
	}
	// --- fin to Entidad
}
