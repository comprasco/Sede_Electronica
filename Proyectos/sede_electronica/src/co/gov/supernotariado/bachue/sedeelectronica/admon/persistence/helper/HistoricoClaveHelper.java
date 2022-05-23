/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoClaveHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistoricoClaveHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Historico
 * clave. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoClaveHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase HistoricoClaveHelper.
	 */
	private HistoricoClaveHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como HistoricoClaveDTO
	 */
	public static HistoricoClaveDTO entidadADtoSimple(HistoricoClave ahc_entidad) {
		HistoricoClaveDTO lhcd_dto = new HistoricoClaveDTO();
		lhcd_dto.setIs_id(ahc_entidad.getId());
		lhcd_dto.setIs_claveHash(ahc_entidad.getClaveHash());
		lhcd_dto.setId_fechaCreacion(ahc_entidad.getFechaCreacion());
		lhcd_dto.setId_fechaModificacion(ahc_entidad.getFechaModificacion());
		lhcd_dto.setIs_idUsuarioCreacion(ahc_entidad.getIdUsuarioCreacion());
		lhcd_dto.setIs_idUsuarioModificacion(ahc_entidad.getIdUsuarioModificacion());
		lhcd_dto.setIs_ipCreacion(ahc_entidad.getIpCreacion());
		lhcd_dto.setIs_ipModificacion(ahc_entidad.getIpModificacion());
		lhcd_dto.setIs_estereotipoCreacion(ahc_entidad.getEstereotipoCreacion());
		lhcd_dto.setIs_estereotipoModificacion(ahc_entidad.getEstereotipoModificacion());

		return lhcd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         HistoricoClaveDTO
	 */
	public static HistoricoClaveDTO entidadADtoCompleto(HistoricoClave ahc_entidad) {
		HistoricoClaveDTO lhcd_dto = entidadADtoSimple(ahc_entidad);
		if (ahc_entidad.getUsuario() != null)
			lhcd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(ahc_entidad.getUsuario()));

		return lhcd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alhc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         HistoricoClaveDTO
	 */
	public static List<HistoricoClaveDTO> listaEntidadADtoSimple(List<HistoricoClave> alhc_listaEntidades) {
		List<HistoricoClaveDTO> llhcd_listaDto = new ArrayList<>();
		for (HistoricoClave lhc_entidad : alhc_listaEntidades) {
			llhcd_listaDto.add(entidadADtoSimple(lhc_entidad));
		}
		return llhcd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alhc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de HistoricoClaveDTO
	 */
	public static List<HistoricoClaveDTO> listaEntidadADtoCompleto(List<HistoricoClave> alhc_listaEntidades) {
		List<HistoricoClaveDTO> llhcd_listaDto = new ArrayList<>();
		for (HistoricoClave lhc_entidad : alhc_listaEntidades) {
			llhcd_listaDto.add(entidadADtoCompleto(lhc_entidad));
		}
		return llhcd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ahcd_dto    el parametro dto
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como HistoricoClave
	 */
	public static HistoricoClave dtoAEntidadSimple(HistoricoClaveDTO ahcd_dto, HistoricoClave ahc_entidad) {
		if (null == ahc_entidad) {
			ahc_entidad = new HistoricoClave();
		}
		ahc_entidad.setId(ahcd_dto.getIs_id());
		ahc_entidad.setClaveHash(ahcd_dto.getIs_claveHash());
		ahc_entidad.setFechaCreacion(ahcd_dto.getId_fechaCreacion());
		ahc_entidad.setFechaModificacion(ahcd_dto.getId_fechaModificacion());
		ahc_entidad.setIdUsuarioCreacion(ahcd_dto.getIs_idUsuarioCreacion());
		ahc_entidad.setIdUsuarioModificacion(ahcd_dto.getIs_idUsuarioModificacion());
		ahc_entidad.setIpCreacion(ahcd_dto.getIs_ipCreacion());
		ahc_entidad.setIpModificacion(ahcd_dto.getIs_ipModificacion());
		ahc_entidad.setEstereotipoCreacion(ahcd_dto.getIs_estereotipoCreacion());
		ahc_entidad.setEstereotipoModificacion(ahcd_dto.getIs_estereotipoModificacion());
		return ahc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ahcd_dto    el parametro dto
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como HistoricoClave
	 */
	public static HistoricoClave dtoAEntidadCompleto(HistoricoClaveDTO ahcd_dto, HistoricoClave ahc_entidad) {
		ahc_entidad = dtoAEntidadSimple(ahcd_dto, ahc_entidad);
		if (ahcd_dto.getIu_usuarioDto() != null) {
			ahc_entidad.setUsuario(new Usuario());
			ahc_entidad.getUsuario().setId(ahcd_dto.getIu_usuarioDto().getIs_id());
		}

		return ahc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alhcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         HistoricoClave
	 */
	public static List<HistoricoClave> listaDtoAEntidadSimple(List<HistoricoClaveDTO> alhcd_listaDto) {
		List<HistoricoClave> llhc_listaEntidades = new ArrayList<>();
		for (HistoricoClaveDTO lhcd_dto : alhcd_listaDto) {
			llhc_listaEntidades.add(dtoAEntidadSimple(lhcd_dto, null));
		}
		return llhc_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alhcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de HistoricoClave
	 */
	public static List<HistoricoClave> listaDtoAEntidadCompleto(List<HistoricoClaveDTO> alhcd_listaDto) {
		List<HistoricoClave> llhc_listaEntidades = new ArrayList<>();
		for (HistoricoClaveDTO lhcd_dto : alhcd_listaDto) {
			llhc_listaEntidades.add(dtoAEntidadCompleto(lhcd_dto, null));
		}
		return llhc_listaEntidades;
	}
	// --- fin to Entidad
}
