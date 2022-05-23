/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoTransaccionesDescartadasHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistoricoTransaccionesDescartadasHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoTransaccionesDescartadas;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Historico
 * transacciones descartadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoTransaccionesDescartadasHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * HistoricoTransaccionesDescartadasHelper.
	 */
	private HistoricoTransaccionesDescartadasHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ahtd_historicoTransaccionesDescartadas el parametro historico
	 *                                               transacciones descartadas
	 * @return Resultado para entidad A dto simple retornado como
	 *         HistoricoTransaccionesDescartadasDTO
	 */
	public static HistoricoTransaccionesDescartadasDTO entidadADtoSimple(
			HistoricoTransaccionesDescartadas ahtd_historicoTransaccionesDescartadas) {

		HistoricoTransaccionesDescartadasDTO lhtd_dto = new HistoricoTransaccionesDescartadasDTO();
		lhtd_dto.setIs_id(ahtd_historicoTransaccionesDescartadas.getId());
		lhtd_dto.setIs_nir(ahtd_historicoTransaccionesDescartadas.getNir());
		lhtd_dto.setIs_motivo(ahtd_historicoTransaccionesDescartadas.getMotivo());
		lhtd_dto.setIs_observaciones(ahtd_historicoTransaccionesDescartadas.getObservaciones());
		lhtd_dto.setIs_ultimoEstadoTransaccion(ahtd_historicoTransaccionesDescartadas.getUltimoEstadoTransaccion());
		lhtd_dto.setIs_idUsuarioCreacion(ahtd_historicoTransaccionesDescartadas.getIdUsuarioCreacion());
		lhtd_dto.setIs_idUsuarioModificacion(ahtd_historicoTransaccionesDescartadas.getIdUsuarioModificacion());
		lhtd_dto.setIs_ipCreacion(ahtd_historicoTransaccionesDescartadas.getIpCreacion());
		lhtd_dto.setIs_ipModificacion(ahtd_historicoTransaccionesDescartadas.getIpModificacion());
		lhtd_dto.setIs_estereotipoCreacion(ahtd_historicoTransaccionesDescartadas.getEstereotipoCreacion());
		lhtd_dto.setIs_estereotipoModificacion(ahtd_historicoTransaccionesDescartadas.getEstereotipoModificacion());
		lhtd_dto.setId_fechaCreacion(ahtd_historicoTransaccionesDescartadas.getFechaCreacion());
		lhtd_dto.setId_fechaModificacion(ahtd_historicoTransaccionesDescartadas.getFechaModificacion());
		return lhtd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alhtd_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         HistoricoTransaccionesDescartadasDTO
	 */
	public static List<HistoricoTransaccionesDescartadasDTO> listaEntidadADtoSimple(
			List<HistoricoTransaccionesDescartadas> alhtd_listaEntidades) {
		List<HistoricoTransaccionesDescartadasDTO> llhtd_listaDto = new ArrayList<>();
		for (HistoricoTransaccionesDescartadas lhtd_entidad : alhtd_listaEntidades) {
			llhtd_listaDto.add(entidadADtoSimple(lhtd_entidad));
		}
		return llhtd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ahtd_dto     el parametro dto
	 * @param ahtd_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         HistoricoTransaccionesDescartadas
	 */
	public static HistoricoTransaccionesDescartadas dtoAEntidadSimple(HistoricoTransaccionesDescartadasDTO ahtd_dto,
			HistoricoTransaccionesDescartadas ahtd_entidad) {
		if (null == ahtd_entidad) {
			ahtd_entidad = new HistoricoTransaccionesDescartadas();
		}
		ahtd_entidad.setId(ahtd_dto.getIs_id());
		ahtd_entidad.setNir(ahtd_dto.getIs_nir());
		ahtd_entidad.setMotivo(ahtd_dto.getIs_motivo());
		ahtd_entidad.setObservaciones(ahtd_dto.getIs_observaciones());
		ahtd_entidad.setUltimoEstadoTransaccion(ahtd_dto.getIs_ultimoEstadoTransaccion());
		ahtd_entidad.setFechaCreacion(ahtd_dto.getId_fechaCreacion());
		ahtd_entidad.setFechaModificacion(ahtd_dto.getId_fechaModificacion());
		ahtd_entidad.setIdUsuarioCreacion(ahtd_dto.getIs_idUsuarioCreacion());
		ahtd_entidad.setIdUsuarioModificacion(ahtd_dto.getIs_idUsuarioModificacion());
		ahtd_entidad.setIpCreacion(ahtd_dto.getIs_ipCreacion());
		ahtd_entidad.setIpModificacion(ahtd_dto.getIs_ipModificacion());
		ahtd_entidad.setEstereotipoCreacion(ahtd_dto.getIs_estereotipoCreacion());
		ahtd_entidad.setEstereotipoModificacion(ahtd_dto.getIs_estereotipoModificacion());
		return ahtd_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alhtd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         HistoricoTransaccionesDescartadas
	 */
	public static List<HistoricoTransaccionesDescartadas> listaDtoAEntidadSimple(
			List<HistoricoTransaccionesDescartadasDTO> alhtd_listaDto) {
		List<HistoricoTransaccionesDescartadas> llhtd_listaEntidades = new ArrayList<>();
		for (HistoricoTransaccionesDescartadasDTO lthtd_dto : alhtd_listaDto) {
			llhtd_listaEntidades.add(dtoAEntidadSimple(lthtd_dto, null));
		}
		return llhtd_listaEntidades;
	}

	// --- fin to Entidad
}
