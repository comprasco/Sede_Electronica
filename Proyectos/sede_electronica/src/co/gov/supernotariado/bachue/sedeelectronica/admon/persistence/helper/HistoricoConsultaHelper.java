/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoConsultaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistoricoConsultaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoConsulta;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Historico
 * consulta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoConsultaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase HistoricoConsultaHelper.
	 */
	private HistoricoConsultaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         HistoricoConsultaDTO
	 */
	public static HistoricoConsultaDTO entidadADtoSimple(HistoricoConsulta ahc_entidad) {
		HistoricoConsultaDTO lhc_dto = new HistoricoConsultaDTO();
		lhc_dto.setIs_id(ahc_entidad.getId());
		lhc_dto.setIs_activo(ahc_entidad.getActivo());
		lhc_dto.setIs_estereotipoCreacion(ahc_entidad.getEstereotipoCreacion());
		lhc_dto.setIs_estereotipoModificacion(ahc_entidad.getEstereotipoModificacion());
		lhc_dto.setId_fechaCreacion(ahc_entidad.getFechaCreacion());
		lhc_dto.setId_fechaModificacion(ahc_entidad.getFechaModificacion());
		lhc_dto.setIs_idUsuario(ahc_entidad.getIdUsuario());
		lhc_dto.setIs_idUsuarioCreacion(ahc_entidad.getIdUsuarioCreacion());
		lhc_dto.setIs_idUsuarioModificacion(ahc_entidad.getIdUsuarioModificacion());
		lhc_dto.setIs_ipCreacion(ahc_entidad.getIpCreacion());
		lhc_dto.setIs_ipModificacion(ahc_entidad.getIpModificacion());
		lhc_dto.setIs_nombreConsulta(ahc_entidad.getNombreConsulta());
		lhc_dto.setIs_url(ahc_entidad.getUrl());
		lhc_dto.setIs_modeloEntrada(ahc_entidad.getModeloEntrada());
		lhc_dto.setIs_modeloSalida(ahc_entidad.getModeloSalida());
		lhc_dto.setIs_resultado(ahc_entidad.getResultado());

		return lhc_dto;
	}

	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         HistoricoConsultaDTO
	 */
	public static HistoricoConsultaDTO entidadADtoCompleto(HistoricoConsulta ahc_entidad) {
		HistoricoConsultaDTO lhc_dto;
		lhc_dto = entidadADtoSimple(ahc_entidad);

		return lhc_dto;
	}

	/**
	 * Metodo que permite convertir delista de entidad a dto.
	 *
	 * @param alhc_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         HistoricoConsultaDTO
	 */
	public static List<HistoricoConsultaDTO> listaentidadADtoSimple(List<HistoricoConsulta> alhc_listEntidad) {
		List<HistoricoConsultaDTO> llhc_listDto = new ArrayList<>();
		for (HistoricoConsulta lhc_entidad : alhc_listEntidad) {
			llhc_listDto.add(entidadADtoSimple(lhc_entidad));
		}
		return llhc_listDto;
	}

	/**
	 * Metodo que permite convertir lista de entidades a lista de dtos.
	 *
	 * @param alhc_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de HistoricoConsultaDTO
	 */
	public static List<HistoricoConsultaDTO> listaentidadADtoCompleto(List<HistoricoConsulta> alhc_listEntidad) {
		List<HistoricoConsultaDTO> llhc_listDto = new ArrayList<>();
		for (HistoricoConsulta lhc_entidad : alhc_listEntidad) {
			llhc_listDto.add(entidadADtoCompleto(lhc_entidad));
		}
		return llhc_listDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que permite convertir de dto a entidad.
	 *
	 * @param ahc_dto     el parametro dto
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como HistoricoConsulta
	 */
	public static HistoricoConsulta dtoAEntidadSimple(HistoricoConsultaDTO ahc_dto, HistoricoConsulta ahc_entidad) {
		if (null == ahc_entidad) {
			ahc_entidad = new HistoricoConsulta();
		}
		ahc_entidad.setId(ahc_dto.getIs_id());
		ahc_entidad.setActivo(ahc_dto.getIs_activo());
		ahc_entidad.setEstereotipoCreacion(ahc_dto.getIs_estereotipoCreacion());
		ahc_entidad.setEstereotipoModificacion(ahc_dto.getIs_estereotipoCreacion());
		ahc_entidad.setFechaCreacion(ahc_dto.getId_fechaCreacion());
		ahc_entidad.setFechaModificacion(ahc_dto.getId_fechaModificacion());
		ahc_entidad.setIdUsuario(ahc_dto.getIs_idUsuario());
		ahc_entidad.setIdUsuarioCreacion(ahc_dto.getIs_idUsuarioCreacion());
		ahc_entidad.setIdUsuarioModificacion(ahc_dto.getIs_idUsuarioModificacion());
		ahc_entidad.setIpCreacion(ahc_dto.getIs_ipCreacion());
		ahc_entidad.setIpModificacion(ahc_dto.getIs_ipModificacion());
		ahc_entidad.setNombreConsulta(ahc_dto.getIs_nombreConsulta());
		ahc_entidad.setUrl(ahc_dto.getIs_url());
		ahc_entidad.setModeloEntrada(ahc_dto.getIs_modeloEntrada());
		ahc_entidad.setModeloSalida(ahc_dto.getIs_modeloSalida());
		ahc_entidad.setResultado(ahc_dto.getIs_resultado());

		return ahc_entidad;
	}

	/**
	 * Metodo que permite convertir de dto a entidad .
	 *
	 * @param ahc_dto     el parametro dto
	 * @param ahc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         HistoricoConsulta
	 */
	public static HistoricoConsulta dtoAEntidadCompleto(HistoricoConsultaDTO ahc_dto, HistoricoConsulta ahc_entidad) {
		ahc_entidad = dtoAEntidadSimple(ahc_dto, ahc_entidad);

		return ahc_entidad;
	}

	/**
	 * Metodo que permite convertir de lista de dto a lista de entidad.
	 *
	 * @param alhc_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         HistoricoConsulta
	 */
	public static List<HistoricoConsulta> listadtoAEntidadSimple(List<HistoricoConsultaDTO> alhc_listDto) {
		List<HistoricoConsulta> llhc_listEntidad = new ArrayList<>();
		for (HistoricoConsultaDTO lhc_dto : alhc_listDto) {
			llhc_listEntidad.add(dtoAEntidadSimple(lhc_dto, null));
		}
		return llhc_listEntidad;
	}

	/**
	 * Metodo que permite convertir de lista de dto a lista de entidad.
	 *
	 * @param alhc_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de HistoricoConsulta
	 */
	public static List<HistoricoConsulta> listadtoAEntidadCompleto(List<HistoricoConsultaDTO> alhc_listDto) {
		List<HistoricoConsulta> llhc_listEntidad = new ArrayList<>();
		for (HistoricoConsultaDTO lhc_dto : alhc_listDto) {
			llhc_listEntidad.add(dtoAEntidadCompleto(lhc_dto, null));
		}
		return llhc_listEntidad;
	}
	// --- fin to Entidad
}
