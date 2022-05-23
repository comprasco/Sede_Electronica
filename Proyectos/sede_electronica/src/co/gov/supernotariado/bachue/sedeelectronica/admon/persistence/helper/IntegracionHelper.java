/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: IntegracionHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Integracion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntegracionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase IntegracionHelper.
	 */
	private IntegracionHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ai_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como IntegracionDTO
	 */
	public static IntegracionDTO entidadADtoSimple(Integracion ai_entidad) {
		IntegracionDTO lid_dto = new IntegracionDTO();
		lid_dto.setIs_id(ai_entidad.getId());
		lid_dto.setIs_codigoRespuesta(ai_entidad.getCodigoRespuesta());
		lid_dto.setIs_entrada(ai_entidad.getEntrada());
		lid_dto.setIs_modeloEntrada(ai_entidad.getModeloEntrada());
		lid_dto.setId_fechaCreacion(ai_entidad.getFechaCreacion());
		lid_dto.setId_fechaModificacion(ai_entidad.getFechaModificacion());
		lid_dto.setIs_idUsuarioModificacion(ai_entidad.getIdUsuarioModificacion());
		lid_dto.setIs_ipCreacion(ai_entidad.getIpCreacion());
		lid_dto.setIs_ipModificacion(ai_entidad.getIpModificacion());
		lid_dto.setIs_nir(ai_entidad.getNir());
		lid_dto.setIs_operacion(ai_entidad.getOperacion());
		lid_dto.setIs_referenciaPago(ai_entidad.getReferenciaPago());
		lid_dto.setIs_resultadoGeneral(ai_entidad.getResultadoGeneral());
		lid_dto.setIs_salida(ai_entidad.getSalida());
		lid_dto.setIs_turno(ai_entidad.getTurno());
		lid_dto.setIs_idUsuarioCreacion(ai_entidad.getUsuario());
		lid_dto.setIs_idAsosiacion(ai_entidad.getIdAsosiacion());
		return lid_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ai_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como IntegracionDTO
	 */
	public static IntegracionDTO entidadADtoCompleto(Integracion ai_entidad) {
		IntegracionDTO lid_dto = entidadADtoSimple(ai_entidad);
		if (ai_entidad.getTipoProceso() != null)
			lid_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(ai_entidad.getTipoProceso()));
		if (ai_entidad.getUsuario() != null) {
			lid_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(ai_entidad.getIdUsuario()));
			lid_dto.setIs_usuarioDto(ai_entidad.getIdUsuario().getId());
		}
		return lid_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param ali_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         IntegracionDTO
	 */
	public static List<IntegracionDTO> listaEntidadADtoSimple(List<Integracion> ali_listaEntidades) {
		List<IntegracionDTO> llid_listaDto = new ArrayList<>();
		for (Integracion li_entidad : ali_listaEntidades) {
			llid_listaDto.add(entidadADtoSimple(li_entidad));
		}
		return llid_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param ali_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de IntegracionDTO
	 */
	public static List<IntegracionDTO> listaEntidadADtoCompleto(List<Integracion> ali_listaEntidades) {
		List<IntegracionDTO> llid_listaDto = new ArrayList<>();
		for (Integracion li_entidad : ali_listaEntidades) {
			llid_listaDto.add(entidadADtoCompleto(li_entidad));
		}
		return llid_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aid_dto    el parametro dto
	 * @param ai_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Integracion
	 */
	public static Integracion dtoAEntidadSimple(IntegracionDTO aid_dto, Integracion ai_entidad) {
		if (null == ai_entidad) {
			ai_entidad = new Integracion();
		}
		ai_entidad.setId(aid_dto.getIs_id());
		ai_entidad.setCodigoRespuesta(aid_dto.getIs_codigoRespuesta());
		ai_entidad.setEntrada(aid_dto.getIs_entrada());
		ai_entidad.setModeloEntrada(aid_dto.getIs_modeloEntrada());
		ai_entidad.setIdAsosiacion(aid_dto.getIs_idAsosiacion());
		ai_entidad.setFechaCreacion(aid_dto.getId_fechaCreacion());
		ai_entidad.setFechaModificacion(aid_dto.getId_fechaModificacion());
		ai_entidad.setIdUsuarioModificacion(aid_dto.getIs_idUsuarioModificacion());
		ai_entidad.setIpCreacion(aid_dto.getIs_ipCreacion());
		ai_entidad.setIpModificacion(aid_dto.getIs_ipModificacion());
		ai_entidad.setNir(aid_dto.getIs_nir());
		ai_entidad.setOperacion(aid_dto.getIs_operacion());
		ai_entidad.setReferenciaPago(aid_dto.getIs_referenciaPago());
		ai_entidad.setResultadoGeneral(aid_dto.getIs_resultadoGeneral());
		ai_entidad.setSalida(aid_dto.getIs_salida());
		ai_entidad.setTurno(aid_dto.getIs_turno());
		ai_entidad.setUsuario(aid_dto.getIs_idUsuarioCreacion());		
		ai_entidad.setEstereotipoCreacion(aid_dto.getIs_estereotipoCreacion());
		ai_entidad.setEstereotipoModificacion(aid_dto.getIs_estereotipoModificacion());
		return ai_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aid_dto    el parametro dto
	 * @param ai_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Integracion
	 */
	public static Integracion dtoAEntidadCompleto(IntegracionDTO aid_dto, Integracion ai_entidad) {
		ai_entidad = dtoAEntidadSimple(aid_dto, ai_entidad);
		if (aid_dto.getItp_tipoProcesoDto() != null) {
			ai_entidad.setTipoProceso(new TipoProceso());
			ai_entidad.getTipoProceso().setId(aid_dto.getItp_tipoProcesoDto().getIs_id());
		}
		if (aid_dto.getIu_usuarioDto() != null) {
			ai_entidad.setIdUsuario(new Usuario());
			ai_entidad.getIdUsuario().setId(aid_dto.getIu_usuarioDto().getIs_id());
		}
		return ai_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alid_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Integracion
	 */
	public static List<Integracion> listaDtoAEntidadCompleto(List<IntegracionDTO> alid_listaDto) {
		List<Integracion> lli_listaEntidades = new ArrayList<>();
		for (IntegracionDTO lid_dto : alid_listaDto) {
			lli_listaEntidades.add(dtoAEntidadCompleto(lid_dto, null));
		}
		return lli_listaEntidades;
	}
	// --- fin to Entidad
}
