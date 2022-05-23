/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudRegistroHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistorialSolicitudRegistroHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialSolicitudRegistro;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Historial
 * solicitud registro. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialSolicitudRegistroHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * HistorialSolicitudRegistroHelper.
	 */
	private HistorialSolicitudRegistroHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de historialSolicitudRegistro a dto.
	 *
	 * @param ahsr_historialSolicitudRegistro el parametro historial solicitud
	 *                                        registro
	 * @return Resultado para entidad A dto simple retornado como
	 *         HistorialSolicitudRegistroDTO
	 */
	public static HistorialSolicitudRegistroDTO entidadADtoSimple(
			HistorialSolicitudRegistro ahsr_historialSolicitudRegistro) {
		HistorialSolicitudRegistroDTO lhsrd_dto = new HistorialSolicitudRegistroDTO();
		lhsrd_dto.setIs_id(ahsr_historialSolicitudRegistro.getId());
		lhsrd_dto.setIs_activo(ahsr_historialSolicitudRegistro.getActivo());
		lhsrd_dto.setIs_datoSolicitudRegistro(ahsr_historialSolicitudRegistro.getDatoSolicitudRegistro());
		lhsrd_dto.setIs_estadoSolicitud(ahsr_historialSolicitudRegistro.getEstadoSolicitud());
		lhsrd_dto.setIs_observaciones(ahsr_historialSolicitudRegistro.getObservaciones());
		lhsrd_dto.setId_fechaCreacion(ahsr_historialSolicitudRegistro.getFechaCreacion());
		lhsrd_dto.setId_fechaModificacion(ahsr_historialSolicitudRegistro.getFechaModificacion());
		lhsrd_dto.setIs_idUsuarioCreacion(ahsr_historialSolicitudRegistro.getIdUsuarioCreacion());
		lhsrd_dto.setIs_idUsuarioModificacion(ahsr_historialSolicitudRegistro.getIdUsuarioModificacion());
		lhsrd_dto.setIs_ipCreacion(ahsr_historialSolicitudRegistro.getIpCreacion());
		lhsrd_dto.setIs_ipModificacion(ahsr_historialSolicitudRegistro.getIpModificacion());
		lhsrd_dto.setIs_estereotipoCreacion(ahsr_historialSolicitudRegistro.getEstereotipoCreacion());
		lhsrd_dto.setIs_estereotipoModificacion(ahsr_historialSolicitudRegistro.getEstereotipoModificacion());

		return lhsrd_dto;
	}

	/**
	 * Metodo que convierte de historialSolicitudRegistro a dto utilizando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param ahsr_historialSolicitudRegistro el parametro historial solicitud
	 *                                        registro
	 * @return Resultado para entidad A dto completo retornado como
	 *         HistorialSolicitudRegistroDTO
	 */
	public static HistorialSolicitudRegistroDTO entidadADtoCompleto(
			HistorialSolicitudRegistro ahsr_historialSolicitudRegistro) {
		HistorialSolicitudRegistroDTO lhsrd_dto = entidadADtoSimple(ahsr_historialSolicitudRegistro);
		if (ahsr_historialSolicitudRegistro.getUsuario() != null) {
			lhsrd_dto.setIu_usuarioAccionDto(
					UsuarioHelper.entidadADtoSimple(ahsr_historialSolicitudRegistro.getUsuario()));
			lhsrd_dto.setIs_idUsuarioAccion(ahsr_historialSolicitudRegistro.getUsuario().getId());
		}
		return lhsrd_dto;
	}

	/**
	 * Metodo que convierte de una lista de historialSolicitudRegistro a una lista
	 * de dto.
	 *
	 * @param alhsr_listaSolicitudes el parametro lista solicitudes
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         HistorialSolicitudRegistroDTO
	 */
	public static List<HistorialSolicitudRegistroDTO> listaEntidadADtoSimple(
			List<HistorialSolicitudRegistro> alhsr_listaSolicitudes) {
		List<HistorialSolicitudRegistroDTO> llhsr_listaHistorialSolicitudRegistroDto = new ArrayList<>();
		for (HistorialSolicitudRegistro lhsr_historialSolicitudRegistro : alhsr_listaSolicitudes) {
			llhsr_listaHistorialSolicitudRegistroDto.add(entidadADtoSimple(lhsr_historialSolicitudRegistro));
		}
		return llhsr_listaHistorialSolicitudRegistroDto;
	}

	/**
	 * Metodo que convierte un dto a una historialSolicitudRegistro.
	 *
	 * @param ahsr_historialSolicitudRegistroDto el parametro historial solicitud
	 *                                           registro dto
	 * @param ahsr_historialSolicitudRegistro    el parametro historial solicitud
	 *                                           registro
	 * @return Resultado para dto A entidad simple retornado como
	 *         HistorialSolicitudRegistro
	 */
	public static HistorialSolicitudRegistro dtoAEntidadSimple(
			HistorialSolicitudRegistroDTO ahsr_historialSolicitudRegistroDto,
			HistorialSolicitudRegistro ahsr_historialSolicitudRegistro) {
		if (null == ahsr_historialSolicitudRegistro) {
			ahsr_historialSolicitudRegistro = new HistorialSolicitudRegistro();
		}
		ahsr_historialSolicitudRegistro.setActivo(ahsr_historialSolicitudRegistroDto.getIs_activo());
		ahsr_historialSolicitudRegistro
				.setDatoSolicitudRegistro(ahsr_historialSolicitudRegistroDto.getIs_datoSolicitudRegistro());
		ahsr_historialSolicitudRegistro.setEstadoSolicitud(ahsr_historialSolicitudRegistroDto.getIs_estadoSolicitud());
		ahsr_historialSolicitudRegistro.setObservaciones(ahsr_historialSolicitudRegistroDto.getIs_observaciones());
		ahsr_historialSolicitudRegistro.setFechaCreacion(ahsr_historialSolicitudRegistroDto.getId_fechaCreacion());
		ahsr_historialSolicitudRegistro
				.setFechaModificacion(ahsr_historialSolicitudRegistroDto.getId_fechaModificacion());
		ahsr_historialSolicitudRegistro
				.setIdUsuarioCreacion(ahsr_historialSolicitudRegistroDto.getIs_idUsuarioCreacion());
		ahsr_historialSolicitudRegistro
				.setIdUsuarioModificacion(ahsr_historialSolicitudRegistroDto.getIs_idUsuarioModificacion());
		ahsr_historialSolicitudRegistro.setIpCreacion(ahsr_historialSolicitudRegistroDto.getIs_ipCreacion());
		ahsr_historialSolicitudRegistro.setIpModificacion(ahsr_historialSolicitudRegistroDto.getIs_ipModificacion());
		ahsr_historialSolicitudRegistro
				.setEstereotipoCreacion(ahsr_historialSolicitudRegistroDto.getIs_estereotipoCreacion());
		ahsr_historialSolicitudRegistro
				.setEstereotipoModificacion(ahsr_historialSolicitudRegistroDto.getIs_estereotipoModificacion());
		return ahsr_historialSolicitudRegistro;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ahsrd_dto    , ahsr_entidad
	 * @param ahsr_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         HistorialSolicitudRegistro
	 */
	public static HistorialSolicitudRegistro dtoAEntidadCompleto(HistorialSolicitudRegistroDTO ahsrd_dto,
			HistorialSolicitudRegistro ahsr_entidad) {
		ahsr_entidad = dtoAEntidadSimple(ahsrd_dto, ahsr_entidad);
		if (ahsrd_dto.getIu_usuarioAccionDto() != null) {
			ahsr_entidad
					.setUsuario(UsuarioHelper.dtoAEntidadCompleto(ahsrd_dto.getIu_usuarioAccionDto(), new Usuario()));
			ahsr_entidad.getUsuario().setId(ahsrd_dto.getIu_usuarioAccionDto().getIs_id());
		}
		return ahsr_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades historial
	 * Solicitud registro.
	 *
	 * @param alhsr_historialSolicitudRegistroDto el parametro historial solicitud
	 *                                            registro dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         HistorialSolicitudRegistro
	 */
	public static List<HistorialSolicitudRegistro> listaDtoAEntidadSimple(
			List<HistorialSolicitudRegistroDTO> alhsr_historialSolicitudRegistroDto) {
		List<HistorialSolicitudRegistro> lhsr_listaHistorialSolicitudRegistro = new ArrayList<>();
		for (HistorialSolicitudRegistroDTO lhsr_historialSolicitudRegistroDto : alhsr_historialSolicitudRegistroDto) {
			lhsr_listaHistorialSolicitudRegistro.add(dtoAEntidadSimple(lhsr_historialSolicitudRegistroDto, null));
		}
		return lhsr_listaHistorialSolicitudRegistro;
	}

}
