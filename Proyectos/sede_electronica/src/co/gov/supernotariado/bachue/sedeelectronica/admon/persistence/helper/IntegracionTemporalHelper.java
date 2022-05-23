/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionTemporalHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: IntegracionTemporalHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Integracion
 * temporal. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntegracionTemporalHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase IntegracionTemporalHelper.
	 */
	private IntegracionTemporalHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ait_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         IntegracionTemporalDTO
	 */
	public static IntegracionTemporalDTO entidadADtoSimple(IntegracionTemporal ait_entidad) {
		IntegracionTemporalDTO litd_dto = new IntegracionTemporalDTO();
		litd_dto.setIs_id(ait_entidad.getId());
		litd_dto.setIs_nir(ait_entidad.getNir());
		litd_dto.setIs_modeloEntrada(ait_entidad.getModeloEntrada());
		litd_dto.setIs_entrada(ait_entidad.getEntrada());
		litd_dto.setIs_salida(ait_entidad.getSalida());
		litd_dto.setIbd_valorTotalServicio(ait_entidad.getValorTotalServicio());
		litd_dto.setIs_operacion(ait_entidad.getOperacion());
		litd_dto.setIs_idAsosiacion(ait_entidad.getIdAsosiacion());
		litd_dto.setIs_resultadoGeneral(ait_entidad.getResultadoGeneral());
		litd_dto.setIs_codigoRespuesta(ait_entidad.getCodigoRespuesta());
		litd_dto.setIs_referenciaPago(ait_entidad.getReferenciaPago());
		litd_dto.setIs_activo(ait_entidad.getActivo());
		litd_dto.setIs_estereotipoCreacion(ait_entidad.getEstereotipoCreacion());
		litd_dto.setIs_idUsuarioCreacion(ait_entidad.getUsuario());
		litd_dto.setId_fechaCreacion(ait_entidad.getFechaCreacion());
		litd_dto.setIs_ipCreacion(ait_entidad.getIpCreacion());
		litd_dto.setIs_estereotipoModificacion(ait_entidad.getEstereotipoModificacion());
		litd_dto.setIs_idUsuarioModificacion(ait_entidad.getIdUsuarioModificacion());
		litd_dto.setId_fechaModificacion(ait_entidad.getFechaModificacion());
		litd_dto.setIs_visibilidad(ait_entidad.getVisibilidad());

		return litd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ait_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         IntegracionTemporalDTO
	 */
	public static IntegracionTemporalDTO entidadADtoCompleto(IntegracionTemporal ait_entidad) {
		IntegracionTemporalDTO litd_dto = entidadADtoSimple(ait_entidad);
		if (ait_entidad.getTipoProceso() != null)
			litd_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(ait_entidad.getTipoProceso()));
		if (ait_entidad.getIdUsuario() != null)
			litd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompletoDTO(ait_entidad.getIdUsuario()));

		return litd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alit_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         IntegracionTemporalDTO
	 */
	public static List<IntegracionTemporalDTO> listaEntidadADtoSimple(List<IntegracionTemporal> alit_listaEntidades) {
		List<IntegracionTemporalDTO> llitd_listaDto = new ArrayList<>();
		for (IntegracionTemporal lit_entidad : alit_listaEntidades) {
			llitd_listaDto.add(entidadADtoSimple(lit_entidad));
		}
		return llitd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alit_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de IntegracionTemporalDTO
	 */
	public static List<IntegracionTemporalDTO> listaEntidadADtoCompleto(List<IntegracionTemporal> alit_listaEntidades) {
		List<IntegracionTemporalDTO> llitd_listaDto = new ArrayList<>();
		for (IntegracionTemporal lit_entidad : alit_listaEntidades) {
			llitd_listaDto.add(entidadADtoCompleto(lit_entidad));
		}
		return llitd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aitd_dto    el parametro dto
	 * @param ait_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         IntegracionTemporal
	 */
	public static IntegracionTemporal dtoAEntidadSimple(IntegracionTemporalDTO aitd_dto,
			IntegracionTemporal ait_entidad) {
		if (null == ait_entidad) {
			ait_entidad = new IntegracionTemporal();
		}
		ait_entidad.setId(aitd_dto.getIs_id());
		ait_entidad.setNir(aitd_dto.getIs_nir());
		ait_entidad.setModeloEntrada(aitd_dto.getIs_modeloEntrada());
		ait_entidad.setEntrada(aitd_dto.getIs_entrada());
		ait_entidad.setSalida(aitd_dto.getIs_salida());
		ait_entidad.setValorTotalServicio(aitd_dto.getIbd_valorTotalServicio());
		ait_entidad.setOperacion(aitd_dto.getIs_operacion());
		ait_entidad.setIdAsosiacion(aitd_dto.getIs_idAsosiacion());
		ait_entidad.setResultadoGeneral(aitd_dto.getIs_resultadoGeneral());
		ait_entidad.setCodigoRespuesta(aitd_dto.getIs_codigoRespuesta());
		ait_entidad.setReferenciaPago(aitd_dto.getIs_referenciaPago());
		ait_entidad.setActivo(aitd_dto.getIs_activo());
		ait_entidad.setEstereotipoCreacion(aitd_dto.getIs_estereotipoCreacion());
		ait_entidad.setUsuario(aitd_dto.getIs_idUsuarioCreacion());
		ait_entidad.setFechaCreacion(aitd_dto.getId_fechaCreacion());
		ait_entidad.setIpCreacion(aitd_dto.getIs_ipCreacion());
		ait_entidad.setEstereotipoModificacion(aitd_dto.getIs_estereotipoModificacion());
		ait_entidad.setIdUsuarioModificacion(aitd_dto.getIs_idUsuarioModificacion());
		ait_entidad.setFechaModificacion(aitd_dto.getId_fechaModificacion());
		ait_entidad.setIpModificacion(aitd_dto.getIs_ipModificacion());
		ait_entidad.setVisibilidad(aitd_dto.getIs_visibilidad());

		return ait_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aitd_dto    el parametro dto
	 * @param ait_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         IntegracionTemporal
	 */
	public static IntegracionTemporal dtoAEntidadCompleto(IntegracionTemporalDTO aitd_dto,
			IntegracionTemporal ait_entidad) {
		ait_entidad = dtoAEntidadSimple(aitd_dto, ait_entidad);
		if (aitd_dto.getItp_tipoProcesoDto() != null) {
			ait_entidad.setTipoProceso(new TipoProceso());
			ait_entidad.getTipoProceso().setId(aitd_dto.getItp_tipoProcesoDto().getIs_id());
		}
		if (aitd_dto.getIu_usuarioDto() != null) {
			ait_entidad.setIdUsuario(new Usuario());
			ait_entidad.getIdUsuario().setId(aitd_dto.getIu_usuarioDto().getIs_id());
		}

		return ait_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alitd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         IntegracionTemporal
	 */
	public static List<IntegracionTemporal> listaDtoAEntidadSimple(List<IntegracionTemporalDTO> alitd_listaDto) {
		List<IntegracionTemporal> llit_listaEntidades = new ArrayList<>();
		for (IntegracionTemporalDTO litd_dto : alitd_listaDto) {
			llit_listaEntidades.add(dtoAEntidadSimple(litd_dto, null));
		}
		return llit_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alitd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de IntegracionTemporal
	 */
	public static List<IntegracionTemporal> listaDtoAEntidadCompleto(List<IntegracionTemporalDTO> alitd_listaDto) {
		List<IntegracionTemporal> llit_listaEntidades = new ArrayList<>();
		for (IntegracionTemporalDTO litd_dto : alitd_listaDto) {
			llit_listaEntidades.add(dtoAEntidadCompleto(litd_dto, null));
		}
		return llit_listaEntidades;
	}
	// --- fin to Entidad
}
