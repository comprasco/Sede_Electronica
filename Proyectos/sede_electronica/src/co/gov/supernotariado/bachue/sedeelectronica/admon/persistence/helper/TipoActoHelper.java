/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoActoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoActoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Tipo acto.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoActoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoActoHelper.
	 */
	// --- to DTO
	private TipoActoHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ata_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como TipoActoDTO
	 */
	public static TipoActoDTO entidadADtoSimple(TipoActo ata_entidad) {
		TipoActoDTO lta_dto = new TipoActoDTO();
		lta_dto.setIs_id(ata_entidad.getId());
		lta_dto.setIs_activo(ata_entidad.getActivo());
		lta_dto.setId_fechaCreacion(ata_entidad.getFechaCreacion());
		lta_dto.setId_fechaModificacion(ata_entidad.getFechaModificacion());
		lta_dto.setIs_idUsuarioCreacion(ata_entidad.getIdUsuarioCreacion());
		lta_dto.setIs_idUsuarioModificacion(ata_entidad.getIdUsuarioModificacion());
		lta_dto.setIs_ipCreacion(ata_entidad.getIpCreacion());
		lta_dto.setIs_ipModificacion(ata_entidad.getIpModificacion());
		lta_dto.setIs_nombre(ata_entidad.getNombre());
		lta_dto.setIs_estereotipoCreacion(ata_entidad.getEstereotipoCreacion());
		lta_dto.setIs_estereotipoModificacion(ata_entidad.getEstereotipoModificacion());
		return lta_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ata_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como TipoActoDTO
	 */
	public static TipoActoDTO entidadADtoCompleto(TipoActo ata_entidad) {
		TipoActoDTO lta_dto;
		lta_dto = entidadADtoSimple(ata_entidad);
		return lta_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alta_listEntidad el parametro list entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TipoActoDTO
	 */
	public static List<TipoActoDTO> listaEntidadADtoSimple(List<TipoActo> alta_listEntidad) {
		List<TipoActoDTO> llta_listDto = new ArrayList<>();
		for (TipoActo lta_entidad : alta_listEntidad) {
			llta_listDto.add(entidadADtoSimple(lta_entidad));
		}
		return llta_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alta_listEntidad el parametro list entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TipoActoDTO
	 */
	public static List<TipoActoDTO> listaEntidadADtoCompleto(List<TipoActo> alta_listEntidad) {
		List<TipoActoDTO> llta_listDto = new ArrayList<>();
		for (TipoActo lta_entidad : alta_listEntidad) {
			llta_listDto.add(entidadADtoCompleto(lta_entidad));
		}
		return llta_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ata_dto     el parametro dto
	 * @param ata_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como TipoActo
	 */
	public static TipoActo dtoAEntidadSimple(TipoActoDTO ata_dto, TipoActo ata_entidad) {
		if (null == ata_entidad) {
			ata_entidad = new TipoActo();
		}
		ata_entidad.setId(ata_dto.getIs_id());
		ata_entidad.setActivo(ata_dto.getIs_activo());
		ata_entidad.setFechaCreacion(ata_dto.getId_fechaCreacion());
		ata_entidad.setFechaModificacion(ata_dto.getId_fechaModificacion());
		ata_entidad.setIdUsuarioCreacion(ata_dto.getIs_idUsuarioCreacion());
		ata_entidad.setIdUsuarioModificacion(ata_dto.getIs_idUsuarioModificacion());
		ata_entidad.setIpCreacion(ata_dto.getIs_ipCreacion());
		ata_entidad.setIpModificacion(ata_dto.getIs_ipModificacion());
		ata_entidad.setNombre(ata_dto.getIs_nombre());
		ata_entidad.setEstereotipoCreacion(ata_dto.getIs_estereotipoCreacion());
		ata_entidad.setEstereotipoModificacion(ata_dto.getIs_estereotipoModificacion());
		return ata_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad utilizando todos los datos.
	 *
	 * @param ata_dto     el parametro dto
	 * @param ata_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoActo
	 */
	public static TipoActo dtoAEntidadCompleto(TipoActoDTO ata_dto, TipoActo ata_entidad) {
		ata_entidad = dtoAEntidadSimple(ata_dto, ata_entidad);

		return ata_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alta_listDto el parametro list dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoActo
	 */
	public static List<TipoActo> listaDtoAEntidadSimple(List<TipoActoDTO> alta_listDto) {
		List<TipoActo> llta_listEntidad = new ArrayList<>();
		for (TipoActoDTO lta_dto : alta_listDto) {
			llta_listEntidad.add(dtoAEntidadSimple(lta_dto, null));
		}
		return llta_listEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alta_listDto el parametro list dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoActo
	 */
	public static List<TipoActo> listaDtoAEntidadCompleto(List<TipoActoDTO> alta_listDto) {
		List<TipoActo> llta_listEntidad = new ArrayList<>();
		for (TipoActoDTO lta_dto : alta_listDto) {
			llta_listEntidad.add(dtoAEntidadCompleto(lta_dto, null));
		}
		return llta_listEntidad;
	}
	// --- fin to Entidad
}
