package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionBancarizacion;

/**
 *
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * Nota: Helper que convierte la transaccion bancarizacion entre entidades a dto
 */
public class TransaccionBancarizacionHelper { 
	
	private TransaccionBancarizacionHelper() {
		// constructor vacio
	}
	
	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto
	 * @param atb_entidad entidad de tipo TransaccionBancarizacion
	 * @return entidad convertida dto
	 */ 
	public static TransaccionBancarizacionDTO entidadADtoSimple(TransaccionBancarizacion atb_entidad) {
		TransaccionBancarizacionDTO ltb_dto = new TransaccionBancarizacionDTO();
		ltb_dto.setIs_id(atb_entidad.getId());
		ltb_dto.setIs_codigoSeguimiento(atb_entidad.getCodigoSeguimiento());
		ltb_dto.setId_fechaCreacion(atb_entidad.getFechaCreacion());
		ltb_dto.setId_fechaModificacion(atb_entidad.getFechaModificacion());
		ltb_dto.setId_fechaServicio(atb_entidad.getFechaServicio());
		ltb_dto.setIs_idUsuario(atb_entidad.getIdUsuario());
		ltb_dto.setIs_idUsuarioCreacion(atb_entidad.getIdUsuarioCreacion());
		ltb_dto.setIs_idUsuarioModificacion(atb_entidad.getIdUsuarioModificacion());
		ltb_dto.setIs_ipCreacion(atb_entidad.getIpCreacion());
		ltb_dto.setIs_ipModificacion(atb_entidad.getIpModificacion());
		ltb_dto.setIs_referenciaPago(atb_entidad.getReferenciaPago());
		ltb_dto.setIs_estadoServicio(atb_entidad.getEstadoServicio());
		ltb_dto.setIs_activo(atb_entidad.getActivo());
		ltb_dto.setIs_estereotipoCreacion(atb_entidad.getEstereotipoCreacion());
		ltb_dto.setIs_estereotipoModificacion(atb_entidad.getEstereotipoModificacion());
		ltb_dto.setIltb_turnosBancarizacion(TurnosBancarizacionHelper.listaentidadADtoSimple(atb_entidad.getTurnosBancarizacions()));
		ltb_dto.setIs_reciboPago(atb_entidad.getReciboPago());
		ltb_dto.setIs_estadoServicio(atb_entidad.getEstadoServicio());

		return ltb_dto;
	}
	/**
	 * Metodo que convierte de entidad a dto completo
	 * @param atb_entidad transaccion bancarizacion
	 * @return transaccion bancarizacion en dto
	 */
	public static TransaccionBancarizacionDTO entidadADtoCompleto(TransaccionBancarizacion atb_entidad) {
		TransaccionBancarizacionDTO ltb_dto = entidadADtoSimple(atb_entidad);
		if (atb_entidad.getTurnosBancarizacions()!= null && !atb_entidad.getTurnosBancarizacions().isEmpty()) {
			ltb_dto.setIltb_turnosBancarizacion(TurnosBancarizacionHelper.listaentidadADtoCompleto(atb_entidad.getTurnosBancarizacions()));
		}
		return ltb_dto;
	}
	/**
	 * Metodo que convierte una lista de entidades a una de dtos
	 * @param altb_listEntidad lista de transacciones bancarizacion
	 * @return lista de transacciones de bancarizacion en dto
	 */
	public static List<TransaccionBancarizacionDTO> listaEntidadADtoSimple(List<TransaccionBancarizacion> altb_listEntidad) {
		List<TransaccionBancarizacionDTO> lltb_listDto = new ArrayList<TransaccionBancarizacionDTO>();
		for (TransaccionBancarizacion ltb_entidad : altb_listEntidad) {
			lltb_listDto.add(entidadADtoSimple(ltb_entidad));
		}
		return lltb_listDto;
	}
	/**
	 * Metodo que convierte una lista de entidades a una de dos
	 * @param altb_listEntidad lsita de entidades a convertir 
	 * @return lista de transacciones de bancarizacion convertida
	 */
	public static List<TransaccionBancarizacionDTO> listaEntidadADtoCompleto(List<TransaccionBancarizacion> altb_listEntidad) {
		List<TransaccionBancarizacionDTO> lltb_listDto = new ArrayList<TransaccionBancarizacionDTO>();
		for (TransaccionBancarizacion ltb_entidad : altb_listEntidad) {
			lltb_listDto.add(entidadADtoCompleto(ltb_entidad));
		}
		return lltb_listDto;
	}


	/**
	 * Metodo que convierte de dtos a entidades
	 * @param atb_dto dtos a convertir
	 * @param atb_entidad entidad transaccion a generar
	 * @return entidad transaccion bancarizacion generada
	 */
	public static TransaccionBancarizacion dtoAEntidadSimple(TransaccionBancarizacionDTO atb_dto, TransaccionBancarizacion atb_entidad) {
		if (null == atb_entidad) {
			atb_entidad = new TransaccionBancarizacion();
		}
		atb_entidad.setId(atb_dto.getIs_id());
		atb_entidad.setCodigoSeguimiento(atb_dto.getIs_codigoSeguimiento());
		atb_entidad.setFechaCreacion(atb_dto.getId_fechaCreacion());
		atb_entidad.setFechaModificacion(atb_dto.getId_fechaModificacion());
		atb_entidad.setFechaServicio(atb_dto.getId_fechaServicio());
		atb_entidad.setIdUsuario(atb_dto.getIs_idUsuario());
		atb_entidad.setIdUsuarioCreacion(atb_dto.getIs_idUsuarioCreacion());
		atb_entidad.setIdUsuarioModificacion(atb_dto.getIs_idUsuarioModificacion());
		atb_entidad.setIpCreacion(atb_dto.getIs_ipCreacion());
		atb_entidad.setIpModificacion(atb_dto.getIs_ipModificacion());
		atb_entidad.setReferenciaPago(atb_dto.getIs_referenciaPago());
		atb_entidad.setActivo(atb_dto.getIs_activo());
		atb_entidad.setEstereotipoCreacion(atb_dto.getIs_estereotipoCreacion());
		atb_entidad.setEstereotipoModificacion(atb_dto.getIs_estereotipoModificacion());
		atb_entidad.setReciboPago(atb_dto.getIs_reciboPago());
		atb_entidad.setEstadoServicio(atb_dto.getIs_estadoServicio());

		return atb_entidad;
	}
	/**
	 * Metodo que convierte de dto a entidad 
	 * @param atb_dto dto a convertir
	 * @param atb_entidad entidad a retornar
	 * @return entidad generada 
	 */
	public static TransaccionBancarizacion dtoAEntidadCompleto(TransaccionBancarizacionDTO atb_dto, TransaccionBancarizacion atb_entidad) {
		atb_entidad = dtoAEntidadSimple(atb_dto, atb_entidad);

		return atb_entidad;
	}
	/**
	 * Metodo que convierte de una lista de dtos a una de entidades
	 * @param altb_listDto dtos a generar
	 * @return Lista de transacciones bancarizacion en modo entidad
	 */
	public static List<TransaccionBancarizacion> listadtoAEntidadSimple(List<TransaccionBancarizacionDTO> altb_listDto) {
		List<TransaccionBancarizacion> altb_listEntidad = new ArrayList<TransaccionBancarizacion>();
		for (TransaccionBancarizacionDTO ltb_dto : altb_listDto) {
			altb_listEntidad.add(dtoAEntidadSimple(ltb_dto, null));
		}
		return altb_listEntidad;
	}
	/**
	 * Metodo que convierte una lista de dtos a entidades
	 * @param altb_listDto lista de dtos  
	 * @return lista de entidades convertidas
	 */
	public static List<TransaccionBancarizacion> listadtoAEntidadCompleto(List<TransaccionBancarizacionDTO> altb_listDto) {
		List<TransaccionBancarizacion> lltb_listEntidad = new ArrayList<TransaccionBancarizacion>();
		for (TransaccionBancarizacionDTO ltb_dto : altb_listDto) {
			lltb_listEntidad.add(dtoAEntidadCompleto(ltb_dto, null));
		}
		return lltb_listEntidad;
	}

}
