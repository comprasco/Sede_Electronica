/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEjeHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoEjeHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Tipo eje.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEjeHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoEjeHelper.
	 */
	private TipoEjeHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ate_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como TipoEjeDTO
	 */
	public static TipoEjeDTO entidadADtoSimple(TipoEje ate_entidad) {
		TipoEjeDTO lted_dto = new TipoEjeDTO();
		lted_dto.setIs_id(ate_entidad.getId());
		lted_dto.setIs_activo(ate_entidad.getActivo());
		lted_dto.setId_fechaCreacion(ate_entidad.getFechaCreacion());
		lted_dto.setId_fechaModificacion(ate_entidad.getFechaModificacion());
		lted_dto.setIs_idUsuarioCreacion(ate_entidad.getIdUsuarioCreacion());
		lted_dto.setIs_idUsuarioModificacion(ate_entidad.getIdUsuarioModificacion());
		lted_dto.setIs_ipCreacion(ate_entidad.getIpCreacion());
		lted_dto.setIs_ipModificacion(ate_entidad.getIpModificacion());
		lted_dto.setIs_nombre(ate_entidad.getNombre());
		lted_dto.setIs_complemento(ate_entidad.getComplemento());
		lted_dto.setIs_tipoPredio(ate_entidad.getTipoPredio());
		lted_dto.setIs_estereotipoCreacion(ate_entidad.getEstereotipoCreacion());
		lted_dto.setIs_estereotipoModificacion(ate_entidad.getEstereotipoModificacion());
		return lted_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ate_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como TipoEjeDTO
	 */
	public static TipoEjeDTO entidadADtoCompleto(TipoEje ate_entidad) {
		TipoEjeDTO lted_dto;
		lted_dto = entidadADtoSimple(ate_entidad);

		return lted_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alte_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TipoEjeDTO
	 */
	public static List<TipoEjeDTO> listaEntidadADtoSimple(List<TipoEje> alte_listaEntidad) {
		List<TipoEjeDTO> llted_listaDto = new ArrayList<>();
		for (TipoEje lte_entidad : alte_listaEntidad) {
			llted_listaDto.add(entidadADtoSimple(lte_entidad));
		}
		return llted_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alte_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TipoEjeDTO
	 */
	public static List<TipoEjeDTO> listaEntidadADtoCompleto(List<TipoEje> alte_listaEntidad) {
		List<TipoEjeDTO> llted_listaDto = new ArrayList<>();
		for (TipoEje lte_entidad : alte_listaEntidad) {
			llted_listaDto.add(entidadADtoCompleto(lte_entidad));
		}
		return llted_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ated_dto    el parametro dto
	 * @param ate_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como TipoEje
	 */
	public static TipoEje dtoAEntidadSimple(TipoEjeDTO ated_dto, TipoEje ate_entidad) {
		if (null == ate_entidad) {
			ate_entidad = new TipoEje();
		}
		ate_entidad.setId(ated_dto.getIs_id());
		ate_entidad.setActivo(ated_dto.getIs_activo());
		ate_entidad.setFechaCreacion(ated_dto.getId_fechaCreacion());
		ate_entidad.setFechaModificacion(ated_dto.getId_fechaModificacion());
		ate_entidad.setIdUsuarioCreacion(ated_dto.getIs_idUsuarioCreacion());
		ate_entidad.setIdUsuarioModificacion(ated_dto.getIs_idUsuarioModificacion());
		ate_entidad.setIpCreacion(ated_dto.getIs_ipCreacion());
		ate_entidad.setIpModificacion(ated_dto.getIs_ipModificacion());
		ate_entidad.setNombre(ated_dto.getIs_nombre());
		ate_entidad.setTipoPredio(ated_dto.getIs_tipoPredio());
		ate_entidad.setComplemento(ated_dto.getIs_complemento());
		ate_entidad.setEstereotipoCreacion(ated_dto.getIs_estereotipoCreacion());
		ate_entidad.setEstereotipoModificacion(ated_dto.getIs_estereotipoModificacion());

		return ate_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ated_dto    el parametro dto
	 * @param ate_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoEje
	 */
	public static TipoEje dtoAEntidadCompleto(TipoEjeDTO ated_dto, TipoEje ate_entidad) {
		ate_entidad = dtoAEntidadSimple(ated_dto, ate_entidad);

		return ate_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alted_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoEje
	 */
	public static List<TipoEje> listaDtoAEntidadSimple(List<TipoEjeDTO> alted_listaDto) {
		List<TipoEje> llte_listaEntidad = new ArrayList<>();
		for (TipoEjeDTO lted_dto : alted_listaDto) {
			llte_listaEntidad.add(dtoAEntidadSimple(lted_dto, null));
		}
		return llte_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alted_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoEje
	 */
	public static List<TipoEje> listaDtoAEntidadCompleto(List<TipoEjeDTO> alted_listaDto) {
		List<TipoEje> llte_listaEntidad = new ArrayList<>();
		for (TipoEjeDTO lted_dto : alted_listaDto) {
			llte_listaEntidad.add(dtoAEntidadCompleto(lted_dto, null));
		}
		return llte_listaEntidad;
	}
	// --- fin to Entidad
}
