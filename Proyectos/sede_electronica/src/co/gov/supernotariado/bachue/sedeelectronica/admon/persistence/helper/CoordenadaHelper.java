/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CoordenadaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: CoordenadaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CoordenadaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Coordenada;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Coordenada.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CoordenadaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase CoordenadaHelper.
	 */
	private CoordenadaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como CoordenadaDTO
	 */
	public static CoordenadaDTO entidadADtoSimple(Coordenada ac_entidad) {
		CoordenadaDTO lc_dto = new CoordenadaDTO();

		lc_dto.setIs_id(ac_entidad.getId());
		lc_dto.setIs_nombre(ac_entidad.getNombre());
		lc_dto.setId_fechaCreacion(ac_entidad.getFechaCreacion());
		lc_dto.setId_fechaModificacion(ac_entidad.getFechaModificacion());
		lc_dto.setIs_idUsuarioCreacion(ac_entidad.getIdUsuarioCreacion());
		lc_dto.setIs_idUsuarioModificacion(ac_entidad.getIdUsuarioModificacion());
		lc_dto.setIs_ipCreacion(ac_entidad.getIpCreacion());
		lc_dto.setIs_ipModificacion(ac_entidad.getIpModificacion());
		lc_dto.setIs_activo(ac_entidad.getActivo());
		lc_dto.setIs_estereotipoCreacion(ac_entidad.getEstereotipoCreacion());
		lc_dto.setIs_estereotipoModificacion(ac_entidad.getEstereotipoModificacion());
		return lc_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         CoordenadaDTO
	 */
	public static List<CoordenadaDTO> listaEntidadADtoSimple(List<Coordenada> alc_listaEntidades) {
		List<CoordenadaDTO> llc_listaDto = new ArrayList<>();
		for (Coordenada lc_entidad : alc_listaEntidades) {
			llc_listaDto.add(entidadADtoSimple(lc_entidad));
		}
		return llc_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ac_dto     el parametro dto
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Coordenada
	 */
	public static Coordenada dtoAEntidadSimple(CoordenadaDTO ac_dto, Coordenada ac_entidad) {
		if (null == ac_entidad) {
			ac_entidad = new Coordenada();
		}
		ac_entidad.setId(ac_dto.getIs_id());
		ac_entidad.setNombre(ac_dto.getIs_nombre());
		ac_entidad.setFechaCreacion(ac_dto.getId_fechaCreacion());
		ac_entidad.setFechaModificacion(ac_dto.getId_fechaModificacion());
		ac_entidad.setIdUsuarioCreacion(ac_dto.getIs_idUsuarioCreacion());
		ac_entidad.setIdUsuarioModificacion(ac_dto.getIs_idUsuarioModificacion());
		ac_entidad.setIpCreacion(ac_dto.getIs_ipCreacion());
		ac_entidad.setIpModificacion(ac_dto.getIs_ipModificacion());
		ac_entidad.setActivo(ac_dto.getIs_activo());
		ac_entidad.setEstereotipoCreacion(ac_dto.getIs_estereotipoCreacion());
		ac_entidad.setEstereotipoModificacion(ac_dto.getIs_estereotipoModificacion());
		return ac_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alc_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Coordenada
	 */
	public static List<Coordenada> listaDtoAEntidadSimple(List<CoordenadaDTO> alc_listaDto) {
		List<Coordenada> llc_listaEntidades = new ArrayList<>();
		for (CoordenadaDTO lc_dto : alc_listaDto) {
			llc_listaEntidades.add(dtoAEntidadSimple(lc_dto, null));
		}
		return llc_listaEntidades;
	}
	// --- fin to Entidad
}
