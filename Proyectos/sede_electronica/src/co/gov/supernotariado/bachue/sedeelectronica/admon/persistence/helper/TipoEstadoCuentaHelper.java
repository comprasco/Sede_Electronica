/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEstadoCuentaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TipoEstadoCuentaHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Tipo estado
 * cuenta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEstadoCuentaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoEstadoCuentaHelper.
	 */
	private TipoEstadoCuentaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atec_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         TipoEstadoCuentaDTO
	 */
	public static TipoEstadoCuentaDTO entidadADtoSimple(TipoEstadoCuenta atec_entidad) {
		TipoEstadoCuentaDTO ltecd_dto = new TipoEstadoCuentaDTO();
		ltecd_dto.setIs_id(atec_entidad.getId());
		ltecd_dto.setIs_activo(atec_entidad.getActivo());
		ltecd_dto.setIs_descripcion(atec_entidad.getDescripcion());
		ltecd_dto.setId_fechaCreacion(atec_entidad.getFechaCreacion());
		ltecd_dto.setId_fechaModificacion(atec_entidad.getFechaModificacion());
		ltecd_dto.setIs_idUsuarioCreacion(atec_entidad.getIdUsuarioCreacion());
		ltecd_dto.setIs_idUsuarioModificacion(atec_entidad.getIdUsuarioModificacion());
		ltecd_dto.setIs_ipCreacion(atec_entidad.getIpCreacion());
		ltecd_dto.setIs_ipModificacion(atec_entidad.getIpModificacion());
		ltecd_dto.setIs_nombre(atec_entidad.getNombre());
		ltecd_dto.setIs_estereotipoCreacion(atec_entidad.getEstereotipoCreacion());
		ltecd_dto.setIs_estereotipoModificacion(atec_entidad.getEstereotipoModificacion());
		return ltecd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atec_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         TipoEstadoCuentaDTO
	 */
	public static TipoEstadoCuentaDTO entidadADtoCompleto(TipoEstadoCuenta atec_entidad) {
		TipoEstadoCuentaDTO ltecd_dto;
		ltecd_dto = entidadADtoSimple(atec_entidad);

		return ltecd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altec_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TipoEstadoCuentaDTO
	 */
	public static List<TipoEstadoCuentaDTO> listaEntidadADtoSimple(List<TipoEstadoCuenta> altec_listaEntidad) {
		List<TipoEstadoCuentaDTO> lltecd_listaDto = new ArrayList<>();
		for (TipoEstadoCuenta ltec_entidad : altec_listaEntidad) {
			lltecd_listaDto.add(entidadADtoSimple(ltec_entidad));
		}
		return lltecd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altec_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TipoEstadoCuentaDTO
	 */
	public static List<TipoEstadoCuentaDTO> listaEntidadADtoCompleto(List<TipoEstadoCuenta> altec_listaEntidad) {
		List<TipoEstadoCuentaDTO> lltecd_listaDto = new ArrayList<>();
		for (TipoEstadoCuenta ltec_entidad : altec_listaEntidad) {
			lltecd_listaDto.add(entidadADtoCompleto(ltec_entidad));
		}
		return lltecd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atecd_dto    el parametro dto
	 * @param atec_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como TipoEstadoCuenta
	 */
	public static TipoEstadoCuenta dtoAEntidadSimple(TipoEstadoCuentaDTO atecd_dto, TipoEstadoCuenta atec_entidad) {
		if (null == atec_entidad) {
			atec_entidad = new TipoEstadoCuenta();
		}
		atec_entidad.setId(atecd_dto.getIs_id());
		atec_entidad.setActivo(atecd_dto.getIs_activo());
		atec_entidad.setDescripcion(atecd_dto.getIs_descripcion());
		atec_entidad.setFechaCreacion(atecd_dto.getId_fechaCreacion());
		atec_entidad.setFechaModificacion(atecd_dto.getId_fechaModificacion());
		atec_entidad.setIdUsuarioCreacion(atecd_dto.getIs_idUsuarioCreacion());
		atec_entidad.setIdUsuarioModificacion(atecd_dto.getIs_idUsuarioModificacion());
		atec_entidad.setIpCreacion(atecd_dto.getIs_ipCreacion());
		atec_entidad.setIpModificacion(atecd_dto.getIs_ipModificacion());
		atec_entidad.setNombre(atecd_dto.getIs_nombre());
		atec_entidad.setEstereotipoCreacion(atecd_dto.getIs_estereotipoCreacion());
		atec_entidad.setEstereotipoModificacion(atecd_dto.getIs_estereotipoModificacion());

		return atec_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param atecd_dto    el parametro dto
	 * @param atec_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como TipoEstadoCuenta
	 */
	public static TipoEstadoCuenta dtoAEntidadCompleto(TipoEstadoCuentaDTO atecd_dto, TipoEstadoCuenta atec_entidad) {
		atec_entidad = dtoAEntidadSimple(atecd_dto, atec_entidad);

		return atec_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altecd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TipoEstadoCuenta
	 */
	public static List<TipoEstadoCuenta> listaDtoAEntidadSimple(List<TipoEstadoCuentaDTO> altecd_listaDto) {
		List<TipoEstadoCuenta> lltec_listaEntidad = new ArrayList<>();
		for (TipoEstadoCuentaDTO ltecd_dto : altecd_listaDto) {
			lltec_listaEntidad.add(dtoAEntidadSimple(ltecd_dto, null));
		}
		return lltec_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altecd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TipoEstadoCuenta
	 */
	public static List<TipoEstadoCuenta> listaDtoAEntidadCompleto(List<TipoEstadoCuentaDTO> altecd_listaDto) {
		List<TipoEstadoCuenta> lltec_listaEntidad = new ArrayList<>();
		for (TipoEstadoCuentaDTO ltecd_dto : altecd_listaDto) {
			lltec_listaEntidad.add(dtoAEntidadCompleto(ltecd_dto, null));
		}
		return lltec_listaEntidad;
	}
	// --- fin to Entidad
}
