/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoProcesoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoProcesoHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Tipo proceso.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoProcesoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoProcesoHelper.
	 */
	private TipoProcesoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como TipoProcesoDTO
	 */
	public static TipoProcesoDTO entidadADtoSimple(TipoProceso atp_entidad) {
		TipoProcesoDTO ltpd_dto = new TipoProcesoDTO();
		ltpd_dto.setIs_id(atp_entidad.getId());
		ltpd_dto.setIs_activo(atp_entidad.getActivo());
		ltpd_dto.setIs_codigo(atp_entidad.getCodigo());
		ltpd_dto.setIs_descripcion(atp_entidad.getDescripcion());
		ltpd_dto.setId_fechaCreacion(atp_entidad.getFechaCreacion());
		ltpd_dto.setId_fechaModificacion(atp_entidad.getFechaModificacion());
		ltpd_dto.setIs_idUsuarioCreacion(atp_entidad.getIdUsuarioCreacion());
		ltpd_dto.setIs_idUsuarioModificacion(atp_entidad.getIdUsuarioModificacion());
		ltpd_dto.setIs_ipCreacion(atp_entidad.getIpCreacion());
		ltpd_dto.setIs_ipModificacion(atp_entidad.getIpModificacion());
		ltpd_dto.setIs_nombre(atp_entidad.getNombre());
		ltpd_dto.setIs_estereotipoCreacion(atp_entidad.getEstereotipoCreacion());
		ltpd_dto.setIs_estereotipoModificacion(atp_entidad.getEstereotipoModificacion());
		return ltpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como TipoProcesoDTO
	 */
	public static TipoProcesoDTO entidadADtoCompleto(TipoProceso atp_entidad) {
		TipoProcesoDTO ltpd_dto;
		ltpd_dto = entidadADtoSimple(atp_entidad);
		ltpd_dto.setIlp_parametrosDto(new ArrayList<ParametroDTO>());
		if (atp_entidad.getParametros() == null || !atp_entidad.getParametros().isEmpty()) {
			atp_entidad.getParametros().forEach(lp_parametro -> {
				ltpd_dto.getIlp_parametrosDto().add(ParametroHelper.entidadADtoSimple(lp_parametro));
			});
		}

		return ltpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altp_listaEntidad el parametro lista entidad
	 * @return List<TipoProcesoDTO>
	 */
	public static List<TipoProcesoDTO> listaEntidadADtoSimple(List<TipoProceso> altp_listaEntidad) {
		List<TipoProcesoDTO> lltpd_listaDto = new ArrayList<>();
		for (TipoProceso ltp_entidad : altp_listaEntidad) {
			lltpd_listaDto.add(entidadADtoSimple(ltp_entidad));
		}
		return lltpd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altp_listaEntidad el parametro lista entidad
	 * @return List<TipoProcesoDTO>
	 */
	public static List<TipoProcesoDTO> listaEntidadADtoCompleto(List<TipoProceso> altp_listaEntidad) {
		List<TipoProcesoDTO> lltpd_listaDto = new ArrayList<>();
		for (TipoProceso ltp_entidad : altp_listaEntidad) {
			lltpd_listaDto.add(entidadADtoCompleto(ltp_entidad));
		}
		return lltpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atpd_dto    el parametro dto
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como TipoProceso
	 */
	public static TipoProceso dtoAEntidadSimple(TipoProcesoDTO atpd_dto, TipoProceso atp_entidad) {
		if (null == atp_entidad) {
			atp_entidad = new TipoProceso();
		}
		atp_entidad.setId(atpd_dto.getIs_id());
		atp_entidad.setActivo(atpd_dto.getIs_activo());
		atp_entidad.setCodigo(atpd_dto.getIs_codigo());
		atp_entidad.setDescripcion(atpd_dto.getIs_descripcion());
		atp_entidad.setFechaCreacion(atpd_dto.getId_fechaCreacion());
		atp_entidad.setFechaModificacion(atpd_dto.getId_fechaModificacion());
		atp_entidad.setIdUsuarioCreacion(atpd_dto.getIs_idUsuarioCreacion());
		atp_entidad.setIdUsuarioModificacion(atpd_dto.getIs_idUsuarioModificacion());
		atp_entidad.setIpCreacion(atpd_dto.getIs_ipCreacion());
		atp_entidad.setIpModificacion(atpd_dto.getIs_ipModificacion());
		atp_entidad.setNombre(atpd_dto.getIs_nombre());
		atp_entidad.setEstereotipoCreacion(atpd_dto.getIs_estereotipoCreacion());
		atp_entidad.setEstereotipoModificacion(atpd_dto.getIs_estereotipoModificacion());
		return atp_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param atpd_dto    el parametro dto
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoProceso
	 */
	public static TipoProceso dtoAEntidadCompleto(TipoProcesoDTO atpd_dto, TipoProceso atp_entidad) {
		atp_entidad = dtoAEntidadSimple(atpd_dto, atp_entidad);

		return atp_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoProceso
	 */
	public static List<TipoProceso> listaDtoAEntidadSimple(List<TipoProcesoDTO> altpd_listaDto) {
		List<TipoProceso> lltp_listaEntidad = new ArrayList<>();
		for (TipoProcesoDTO ltpd_dto : altpd_listaDto) {
			lltp_listaEntidad.add(dtoAEntidadSimple(ltpd_dto, null));
		}
		return lltp_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoProceso
	 */
	public static List<TipoProceso> listaDtoAEntidadCompleto(List<TipoProcesoDTO> altpd_listaDto) {
		List<TipoProceso> lltp_listaEntidad = new ArrayList<>();
		for (TipoProcesoDTO ltpd_dto : altpd_listaDto) {
			lltp_listaEntidad.add(dtoAEntidadCompleto(ltpd_dto, null));
		}
		return lltp_listaEntidad;
	}
	// --- fin to Entidad
}
