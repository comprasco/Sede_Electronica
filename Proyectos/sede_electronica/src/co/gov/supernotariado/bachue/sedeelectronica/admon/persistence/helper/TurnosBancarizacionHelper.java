package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacionPK;
/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S
* Nota: Helper que convierte la Turnos Bancarizacion entre entidades a dto
*/
public class TurnosBancarizacionHelper { 

	private TurnosBancarizacionHelper() {
		// constructor vacio
	}
	
	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto
	 * @param atb_entidad entidad a convertir
	 * @return dto generado
	 */
	public static TurnosBancarizacionDTO entidadADtoSimple(TurnosBancarizacion atb_entidad) {
		TurnosBancarizacionDTO ltb_dto = new TurnosBancarizacionDTO();
		TurnosBancarizacionPKDTO ltb_dtoPk = new TurnosBancarizacionPKDTO();
		
		ltb_dto.setIs_archivo(atb_entidad.getArchivo());
		ltb_dto.setId_fechaCreacion(atb_entidad.getFechaCreacion());
		ltb_dto.setId_fechaModificacion(atb_entidad.getFechaModificacion());
		ltb_dto.setIs_idUsuarioCreacion(atb_entidad.getIdUsuarioCreacion());
		ltb_dto.setIs_idUsuarioModificacion(atb_entidad.getIdUsuarioModificacion());
		ltb_dto.setIs_ipCreacion(atb_entidad.getIpCreacion());
		ltb_dto.setIs_ipModificacion(atb_entidad.getIpModificacion());
		ltb_dto.setIs_matricula(atb_entidad.getMatricula());
		ltb_dto.setIs_numeroPaginas(atb_entidad.getNumeroPaginas());
		ltb_dto.setIs_pin(atb_entidad.getPin());
		ltb_dto.setIs_activo(atb_entidad.getActivo());
		ltb_dto.setIs_estereotipoCreacion(atb_entidad.getEstereotipoCreacion());
		ltb_dto.setIs_estereotipoModificacion(atb_entidad.getEstereotipoModificacion());
		ltb_dto.setId_fechaServicio(atb_entidad.getFechaServicio());
		
		ltb_dtoPk.setIdTransaccionBancarizacion(atb_entidad.getId().getIdTransaccionBancarizacion());
		ltb_dtoPk.setIdTurno(atb_entidad.getId().getIdTurno());

		ltb_dto.setItb_id(ltb_dtoPk);
		return ltb_dto;
	}
	/**
	 * Metodo que convierte de entidad a dto
	 * @param atb_entidad entidad a convertir
	 * @return dto convertido 
	 */
	public static TurnosBancarizacionDTO entidadADtoCompleto(TurnosBancarizacion atb_entidad) {
		TurnosBancarizacionDTO ltb_dto = entidadADtoSimple(atb_entidad);
		if(atb_entidad.getId() != null)
			ltb_dto.setItb_id(TurnosBancarizacionPKHelper.entidadADtoSimple(atb_entidad.getId()));
		if(atb_entidad.getTransaccionBancarizacion() != null)
			ltb_dto.setItb_transaccionBancarizacion(TransaccionBancarizacionHelper.entidadADtoSimple(atb_entidad.getTransaccionBancarizacion()));

		return ltb_dto;
	}
	/**
	 * Metodo que convierte una lista de entidades a una de dtos
	 * @param altb_listEntidad lista de entidades a convertir
	 * @return lista de dtos
	 */
	public static List<TurnosBancarizacionDTO> listaentidadADtoSimple(List<TurnosBancarizacion> altb_listEntidad) {
		List<TurnosBancarizacionDTO> lltb_listDto = new ArrayList<TurnosBancarizacionDTO>();
		for (TurnosBancarizacion ltb_entidad : altb_listEntidad) {
			lltb_listDto.add(entidadADtoSimple(ltb_entidad));
		}
		return lltb_listDto;
	}
	/**
	 * Metodo que convierte una lista de entidades a una de dtos
	 * @param altb_listEntidad lista de entidades a convertir
	 * @return lista de dtos convertidos
	 */
	public static List<TurnosBancarizacionDTO> listaentidadADtoCompleto(List<TurnosBancarizacion> altb_listEntidad) {
		List<TurnosBancarizacionDTO> listDto = new ArrayList<TurnosBancarizacionDTO>();
		for (TurnosBancarizacion ltb_entidad : altb_listEntidad) {
			listDto.add(entidadADtoCompleto(ltb_entidad));
		}
		return listDto;
	}
	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte de dto a entidad
	 * @param atb_dto dto a convertir 
	 * @param atb_entidad entidad a retornar
	 * @return entidad con los datos respectivos del dto 
	 */
	public static TurnosBancarizacion dtoAEntidadSimple(TurnosBancarizacionDTO atb_dto, TurnosBancarizacion atb_entidad) {
		if (null == atb_entidad) {
			atb_entidad = new TurnosBancarizacion();
		}
		atb_entidad.setArchivo(atb_dto.getIs_archivo());
		atb_entidad.setFechaCreacion(atb_dto.getId_fechaCreacion());
		atb_entidad.setFechaModificacion(atb_dto.getId_fechaModificacion());
		atb_entidad.setIdUsuarioCreacion(atb_dto.getIs_idUsuarioCreacion());
		atb_entidad.setIdUsuarioModificacion(atb_dto.getIs_idUsuarioModificacion());
		atb_entidad.setIpCreacion(atb_dto.getIs_ipCreacion());
		atb_entidad.setIpModificacion(atb_dto.getIs_ipModificacion());
		atb_entidad.setMatricula(atb_dto.getIs_matricula());
		atb_entidad.setNumeroPaginas(atb_dto.getIs_numeroPaginas());
		atb_entidad.setPin(atb_dto.getIs_pin());
		atb_entidad.setActivo(atb_dto.getIs_activo());
		atb_entidad.setEstereotipoCreacion(atb_dto.getIs_estereotipoCreacion());
		atb_entidad.setEstereotipoModificacion(atb_dto.getIs_estereotipoModificacion());
		atb_entidad.setFechaServicio(atb_dto.getId_fechaServicio());
		return atb_entidad;
	}
	/**
	 * Metodo que permite convertir de dto a entidad
	 * @param atb_dto dto a convertir 
	 * @param atb_entidad entidad que se retorna
	 * @return entidad de tipo turnoBancarizacion
	 */
	public static TurnosBancarizacion dtoAEntidadCompleto(TurnosBancarizacionDTO atb_dto, TurnosBancarizacion atb_entidad) {
		atb_entidad = dtoAEntidadSimple(atb_dto, atb_entidad);
		if(atb_dto.getItb_id() != null){
			atb_entidad.setId(new TurnosBancarizacionPK());
			atb_entidad.getId().setIdTransaccionBancarizacion(atb_dto.getItb_id().getIdTransaccionBancarizacion());
			atb_entidad.getId().setIdTurno(atb_dto.getItb_id().getIdTurno());
		}
		if(atb_dto.getItb_transaccionBancarizacion() != null){
			atb_entidad.setTransaccionBancarizacion(new TransaccionBancarizacion());
			atb_entidad.getTransaccionBancarizacion().setId(atb_dto.getItb_transaccionBancarizacion().getIs_id());
		}

		return atb_entidad;
	}
	/**
	 * Metodo que convierte de una lista de dto a una de entidades
	 * @param altb_listDto lista de dtos a convertir
	 * @return lista de entidades de tipo TurnosBancarizacion convertida
	 */
	public static List<TurnosBancarizacion> listadtoAEntidadSimple(List<TurnosBancarizacionDTO> altb_listDto) {
		List<TurnosBancarizacion> altb_listEntidad = new ArrayList<TurnosBancarizacion>();
		for (TurnosBancarizacionDTO ltb_dto : altb_listDto) {
			altb_listEntidad.add(dtoAEntidadSimple(ltb_dto, null));
		}
		return altb_listEntidad;
	}
	/**
	 * Metodo que convierte de lista de dtos a entidades 
	 * @param altb_listDto lista de dtos a convertir
	 * @return lista de entidades convertida
	 */
	public static List<TurnosBancarizacion> listadtoAEntidadCompleto(List<TurnosBancarizacionDTO> altb_listDto) {
		List<TurnosBancarizacion> altb_listEntidad = new ArrayList<TurnosBancarizacion>();
		for (TurnosBancarizacionDTO ltb_dto : altb_listDto) {
			altb_listEntidad.add(dtoAEntidadCompleto(ltb_dto, null));
		}
		return altb_listEntidad;
	}
	// --- fin to Entidad
}
