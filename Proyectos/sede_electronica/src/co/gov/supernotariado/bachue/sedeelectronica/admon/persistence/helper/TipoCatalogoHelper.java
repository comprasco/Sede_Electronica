/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCatalogoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoCatalogoHelper
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
 * catalogo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCatalogoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCatalogoHelper.
	 */
	private TipoCatalogoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como TipoCatalogoDTO
	 */
	public static TipoCatalogoDTO entidadADtoSimple(TipoCatalogo atc_entidad) {
		TipoCatalogoDTO ltcd_dto = new TipoCatalogoDTO();
		ltcd_dto.setIs_id(atc_entidad.getId());
		ltcd_dto.setIs_activo(atc_entidad.getActivo());
		ltcd_dto.setIs_descripcion(atc_entidad.getDescripcion());
		ltcd_dto.setId_fechaCreacion(atc_entidad.getFechaCreacion());
		ltcd_dto.setId_fechaModificacion(atc_entidad.getFechaModificacion());
		ltcd_dto.setIs_idUsuarioCreacion(atc_entidad.getIdUsuarioCreacion());
		ltcd_dto.setIs_idUsuarioModificacion(atc_entidad.getIdUsuarioModificacion());
		ltcd_dto.setIs_ipCreacion(atc_entidad.getIpCreacion());
		ltcd_dto.setIs_ipModificacion(atc_entidad.getIpModificacion());
		ltcd_dto.setIs_nombre(atc_entidad.getNombre());
		ltcd_dto.setIs_codigo(atc_entidad.getCodigo());
		ltcd_dto.setIs_esNegocio(atc_entidad.getEsNegocio());
		ltcd_dto.setIs_estereotipoCreacion(atc_entidad.getEstereotipoCreacion());
		ltcd_dto.setIs_estereotipoModificacion(atc_entidad.getEstereotipoModificacion());
		return ltcd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como TipoCatalogoDTO
	 */
	public static TipoCatalogoDTO entidadADtoCompleto(TipoCatalogo atc_entidad) {
		TipoCatalogoDTO ltcd_dto;
		ltcd_dto = entidadADtoSimple(atc_entidad);

		return ltcd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altc_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TipoCatalogoDTO
	 */
	public static List<TipoCatalogoDTO> listaEntidadADtoSimple(List<TipoCatalogo> altc_listaEntidad) {
		List<TipoCatalogoDTO> lltcd_listaDto = new ArrayList<>();
		for (TipoCatalogo ltc_entidad : altc_listaEntidad) {
			lltcd_listaDto.add(entidadADtoSimple(ltc_entidad));
		}
		return lltcd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altc_listaEntidad el parametro lista entidad
	 * @return List<TipoCatalogoDTO>
	 */
	public static List<TipoCatalogoDTO> listaEntidadADtoCompleto(List<TipoCatalogo> altc_listaEntidad) {
		List<TipoCatalogoDTO> lltcd_listaDto = new ArrayList<>();
		for (TipoCatalogo ltc_entidad : altc_listaEntidad) {
			lltcd_listaDto.add(entidadADtoCompleto(ltc_entidad));
		}
		return lltcd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atcd_dto    el parametro dto
	 * @param atc_entidad el parametro entidad
	 * @return TipoCatalogoDTO
	 */
	public static TipoCatalogo dtoAEntidadSimple(TipoCatalogoDTO atcd_dto, TipoCatalogo atc_entidad) {
		if (atc_entidad == null) {
			atc_entidad = new TipoCatalogo();
		}
		atc_entidad.setId(atcd_dto.getIs_id());
		atc_entidad.setActivo(atcd_dto.getIs_activo());
		atc_entidad.setDescripcion(atcd_dto.getIs_descripcion());
		atc_entidad.setFechaCreacion(atcd_dto.getId_fechaCreacion());
		atc_entidad.setFechaModificacion(atcd_dto.getId_fechaModificacion());
		atc_entidad.setIdUsuarioCreacion(atcd_dto.getIs_idUsuarioCreacion());
		atc_entidad.setIdUsuarioModificacion(atcd_dto.getIs_idUsuarioModificacion());
		atc_entidad.setIpCreacion(atcd_dto.getIs_ipCreacion());
		atc_entidad.setIpModificacion(atcd_dto.getIs_ipModificacion());
		atc_entidad.setNombre(atcd_dto.getIs_nombre());
		atc_entidad.setCodigo(atcd_dto.getIs_codigo());
		atc_entidad.setEsNegocio(atcd_dto.getIs_esNegocio());
		atc_entidad.setEstereotipoCreacion(atcd_dto.getIs_estereotipoCreacion());
		atc_entidad.setEstereotipoModificacion(atcd_dto.getIs_estereotipoModificacion());
		return atc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param atcd_dto    el parametro dto
	 * @param atc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoCatalogo
	 */
	public static TipoCatalogo dtoAEntidadCompleto(TipoCatalogoDTO atcd_dto, TipoCatalogo atc_entidad) {
		atc_entidad = dtoAEntidadSimple(atcd_dto, atc_entidad);

		return atc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoCatalogo
	 */
	public static List<TipoCatalogo> listaDtoAEntidadSimple(List<TipoCatalogoDTO> altcd_listaDto) {
		List<TipoCatalogo> lltc_listaEntidad = new ArrayList<>();
		for (TipoCatalogoDTO ltcd_dto : altcd_listaDto) {
			lltc_listaEntidad.add(dtoAEntidadSimple(ltcd_dto, null));
		}
		return lltc_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoCatalogo
	 */
	public static List<TipoCatalogo> listaDtoAEntidadCompleto(List<TipoCatalogoDTO> altcd_listaDto) {
		List<TipoCatalogo> lltc_listaEntidad = new ArrayList<>();
		for (TipoCatalogoDTO ltcd_dto : altcd_listaDto) {
			lltc_listaEntidad.add(dtoAEntidadCompleto(ltcd_dto, null));
		}
		return lltc_listaEntidad;
	}
	// --- fin to Entidad
}
