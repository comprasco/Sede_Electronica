/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoDocumentoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoDocumentoHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Tipo
 * documento. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoDocumentoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoDocumentoHelper.
	 */
	private TipoDocumentoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atd_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como TipoDocumentoDTO
	 */
	public static TipoDocumentoDTO entidadADtoSimple(TipoDocumento atd_entidad) {
		TipoDocumentoDTO ltdd_dto = new TipoDocumentoDTO();
		ltdd_dto.setIs_id(atd_entidad.getId());
		ltdd_dto.setIs_activo(atd_entidad.getActivo());
		ltdd_dto.setIs_descripcion(atd_entidad.getDescripcion());
		ltdd_dto.setId_fechaCreacion(atd_entidad.getFechaCreacion());
		ltdd_dto.setId_fechaModificacion(atd_entidad.getFechaModificacion());
		ltdd_dto.setIs_idUsuarioCreacion(atd_entidad.getIdUsuarioCreacion());
		ltdd_dto.setIs_idUsuarioModificacion(atd_entidad.getIdUsuarioModificacion());
		ltdd_dto.setIs_ipCreacion(atd_entidad.getIpCreacion());
		ltdd_dto.setIs_ipModificacion(atd_entidad.getIpModificacion());
		ltdd_dto.setIs_nombre(atd_entidad.getNombre());
		ltdd_dto.setIs_estereotipoCreacion(atd_entidad.getEstereotipoCreacion());
		ltdd_dto.setIs_estereotipoModificacion(atd_entidad.getEstereotipoModificacion());
		return ltdd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atd_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como TipoDocumentoDTO
	 */
	public static TipoDocumentoDTO entidadADtoCompleto(TipoDocumento atd_entidad) {
		TipoDocumentoDTO ltdd_dto;
		ltdd_dto = entidadADtoSimple(atd_entidad);

		return ltdd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altd_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TipoDocumentoDTO
	 */
	public static List<TipoDocumentoDTO> listaEntidadADtoSimple(List<TipoDocumento> altd_listaEntidad) {
		List<TipoDocumentoDTO> lltdd_listaDto = new ArrayList<>();
		for (TipoDocumento ltd_entidad : altd_listaEntidad) {
			lltdd_listaDto.add(entidadADtoSimple(ltd_entidad));
		}
		return lltdd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altd_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TipoDocumentoDTO
	 */
	public static List<TipoDocumentoDTO> listaEntidadADtoCompleto(List<TipoDocumento> altd_listaEntidad) {
		List<TipoDocumentoDTO> lltdd_listaDto = new ArrayList<>();
		for (TipoDocumento ltd_entidad : altd_listaEntidad) {
			lltdd_listaDto.add(entidadADtoCompleto(ltd_entidad));
		}
		return lltdd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atdd_dto    el parametro dto
	 * @param atd_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como TipoDocumento
	 */
	public static TipoDocumento dtoAEntidadSimple(TipoDocumentoDTO atdd_dto, TipoDocumento atd_entidad) {
		if (null == atd_entidad) {
			atd_entidad = new TipoDocumento();
		}
		atd_entidad.setId(atdd_dto.getIs_id());
		atd_entidad.setActivo(atdd_dto.getIs_activo());
		atd_entidad.setDescripcion(atdd_dto.getIs_descripcion());
		atd_entidad.setFechaCreacion(atdd_dto.getId_fechaCreacion());
		atd_entidad.setFechaModificacion(atdd_dto.getId_fechaModificacion());
		atd_entidad.setIdUsuarioCreacion(atdd_dto.getIs_idUsuarioCreacion());
		atd_entidad.setIdUsuarioModificacion(atdd_dto.getIs_idUsuarioModificacion());
		atd_entidad.setIpCreacion(atdd_dto.getIs_ipCreacion());
		atd_entidad.setIpModificacion(atdd_dto.getIs_ipModificacion());
		atd_entidad.setNombre(atdd_dto.getIs_nombre());
		atd_entidad.setEstereotipoCreacion(atdd_dto.getIs_estereotipoCreacion());
		atd_entidad.setEstereotipoModificacion(atdd_dto.getIs_estereotipoModificacion());
		return atd_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param atdd_dto    el parametro dto
	 * @param atd_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoDocumento
	 */
	public static TipoDocumento dtoAEntidadCompleto(TipoDocumentoDTO atdd_dto, TipoDocumento atd_entidad) {
		atd_entidad = dtoAEntidadSimple(atdd_dto, atd_entidad);

		return atd_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altdd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoDocumento
	 */
	public static List<TipoDocumento> listaDtoAEntidadSimple(List<TipoDocumentoDTO> altdd_listaDto) {
		List<TipoDocumento> lltd_listaEntidad = new ArrayList<>();
		for (TipoDocumentoDTO ltdd_dto : altdd_listaDto) {
			lltd_listaEntidad.add(dtoAEntidadSimple(ltdd_dto, null));
		}
		return lltd_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altdd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoDocumento
	 */
	public static List<TipoDocumento> listaDtoAEntidadCompleto(List<TipoDocumentoDTO> altdd_listaDto) {
		List<TipoDocumento> lltd_listaEntidad = new ArrayList<>();
		for (TipoDocumentoDTO ltdd_dto : altdd_listaDto) {
			lltd_listaEntidad.add(dtoAEntidadCompleto(ltdd_dto, null));
		}
		return lltd_listaEntidad;
	}
	// --- fin to Entidad
}
