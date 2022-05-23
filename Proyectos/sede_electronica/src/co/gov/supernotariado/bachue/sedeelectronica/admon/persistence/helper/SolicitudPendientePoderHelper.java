package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudPendientePoder;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Solicitudes Pendientes Poderes helper.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudPendientePoderHelper { 
	// --- to DTO
	public static SolicitudPendientePoderDTO entidadADtoSimple(SolicitudPendientePoder aspp_entidad) {
		
		SolicitudPendientePoderDTO lspp_dto = new SolicitudPendientePoderDTO();
		
		lspp_dto.setIs_id(aspp_entidad.getId());
		lspp_dto.setIs_activo(aspp_entidad.getActivo());
		lspp_dto.setIs_estadoSolicitud(aspp_entidad.getEstadoSolicitud());
		lspp_dto.setIs_estereotipoCreacion(aspp_entidad.getEstereotipoCreacion());
		lspp_dto.setIs_estereotipoModificacion(aspp_entidad.getEstereotipoModificacion());
		lspp_dto.setId_fechaCreacion(aspp_entidad.getFechaCreacion());
		lspp_dto.setId_fechaModificacion(aspp_entidad.getFechaModificacion());
		lspp_dto.setIs_idNotariaOrigen(aspp_entidad.getIdNotariaOrigen());
		lspp_dto.setIs_idNotariaSolicitante(aspp_entidad.getIdNotariaSolicitante());
		lspp_dto.setIs_idPoder(aspp_entidad.getIdPoder());
		lspp_dto.setIs_idUsuarioCreacion(aspp_entidad.getIdUsuarioCreacion());
		lspp_dto.setIs_idUsuarioModificacion(aspp_entidad.getIdUsuarioModificacion());
		lspp_dto.setIs_ipCreacion(aspp_entidad.getIpCreacion());
		lspp_dto.setIs_ipModificacion(aspp_entidad.getIpModificacion());
		lspp_dto.setIs_observacion(aspp_entidad.getObservacion());
		lspp_dto.setIs_tipoPoder(aspp_entidad.getTipoPoder());
		lspp_dto.setIee_entidadEspecialSolicitante(EntidadEspecialHelper.entidadADtoCompletoUsuario(aspp_entidad.getNotariaSolicitante()));
		lspp_dto.setIee_entidadEspecialOrigen(EntidadEspecialHelper.entidadADtoCompletoUsuario(aspp_entidad.getNotariaOrigen()));
		lspp_dto.setIs_tipoTransaccion(aspp_entidad.getTipoTransaccion());
		lspp_dto.setIs_tipoTramite(aspp_entidad.getTipoTramite());
		lspp_dto.setIs_justificacion(aspp_entidad.getJustificacion());
		lspp_dto.setIs_idVersionPoder(aspp_entidad.getIdVersionPoder());

		return lspp_dto;
	}
	public static SolicitudPendientePoderDTO entidadADtoCompleto(SolicitudPendientePoder aspp_entidad) {
		SolicitudPendientePoderDTO lspp_dto = entidadADtoSimple(aspp_entidad);
		return lspp_dto;
	}
	public static List<SolicitudPendientePoderDTO> listaentidadADtoSimple(List<SolicitudPendientePoder> alspp_listEntidad) {
		List<SolicitudPendientePoderDTO> llspp_listDto = new ArrayList<SolicitudPendientePoderDTO>();
		for (SolicitudPendientePoder lspp_entidad : alspp_listEntidad) {
			llspp_listDto.add(entidadADtoSimple(lspp_entidad));
		}
		return llspp_listDto;
	}
	public static List<SolicitudPendientePoderDTO> listaentidadADtoCompleto(List<SolicitudPendientePoder> alspp_listEntidad) {
		List<SolicitudPendientePoderDTO> llspp_listDto = new ArrayList<SolicitudPendientePoderDTO>();
		for (SolicitudPendientePoder lspp_entidad : alspp_listEntidad) {
			llspp_listDto.add(entidadADtoCompleto(lspp_entidad));
		}
		return llspp_listDto;
	}
	// --- fin to DTO
	// --- to Entidad
	public static SolicitudPendientePoder dtoAEntidadSimple(SolicitudPendientePoderDTO aspp_dto, SolicitudPendientePoder aspp_entidad) {
		if (null == aspp_entidad) {
			aspp_entidad = new SolicitudPendientePoder();
		}
		aspp_entidad.setId(aspp_dto.getIs_id());
		aspp_entidad.setActivo(aspp_dto.getIs_activo());
		aspp_entidad.setEstadoSolicitud(aspp_dto.getIs_estadoSolicitud());
		aspp_entidad.setEstereotipoCreacion(aspp_dto.getIs_estereotipoCreacion());
		aspp_entidad.setEstereotipoModificacion(aspp_dto.getIs_estereotipoModificacion());
		aspp_entidad.setFechaCreacion(aspp_dto.getId_fechaCreacion());
		aspp_entidad.setFechaModificacion(aspp_dto.getId_fechaModificacion());
		aspp_entidad.setIdNotariaOrigen(aspp_dto.getIee_entidadEspecialOrigen().getIs_id());
		aspp_entidad.setIdNotariaSolicitante(aspp_dto.getIs_idNotariaSolicitante());
		aspp_entidad.setIdPoder(aspp_dto.getIs_idPoder());
		aspp_entidad.setIdUsuarioCreacion(aspp_dto.getIs_idUsuarioCreacion());
		aspp_entidad.setIdUsuarioModificacion(aspp_dto.getIs_idUsuarioModificacion());
		aspp_entidad.setIpCreacion(aspp_dto.getIs_ipCreacion());
		aspp_entidad.setIpModificacion(aspp_dto.getIs_ipModificacion());
		aspp_entidad.setObservacion(aspp_dto.getIs_observacion());
		aspp_entidad.setTipoPoder(aspp_dto.getIs_tipoPoder());
		aspp_entidad.setTipoTransaccion(aspp_dto.getIs_tipoTransaccion());
		aspp_entidad.setTipoTramite(aspp_dto.getIs_tipoTramite());
		aspp_entidad.setJustificacion(aspp_dto.getIs_justificacion());
		aspp_entidad.setIdVersionPoder(aspp_dto.getIs_idVersionPoder());

		return aspp_entidad;
	}
	public static SolicitudPendientePoder dtoAEntidadCompleto(SolicitudPendientePoderDTO aspp_dto, SolicitudPendientePoder aspp_entidad) {
		aspp_entidad = dtoAEntidadSimple(aspp_dto, aspp_entidad);

		return aspp_entidad;
	}
	public static List<SolicitudPendientePoder> listadtoAEntidadSimple(List<SolicitudPendientePoderDTO> alspp_listDto) {
		List<SolicitudPendientePoder> llspp_listEntidad = new ArrayList<SolicitudPendientePoder>();
		for (SolicitudPendientePoderDTO lspp_dto : alspp_listDto) {
			llspp_listEntidad.add(dtoAEntidadSimple(lspp_dto, null));
		}
		return llspp_listEntidad;
	}
	public static List<SolicitudPendientePoder> listadtoAEntidadCompleto(List<SolicitudPendientePoderDTO> alspp_listDto) {
		List<SolicitudPendientePoder> llspp_listEntidad = new ArrayList<SolicitudPendientePoder>();
		for (SolicitudPendientePoderDTO lspp_dto : alspp_listDto) {
			llspp_listEntidad.add(dtoAEntidadCompleto(lspp_dto, null));
		}
		return llspp_listEntidad;
	}
	// --- fin to Entidad
}
