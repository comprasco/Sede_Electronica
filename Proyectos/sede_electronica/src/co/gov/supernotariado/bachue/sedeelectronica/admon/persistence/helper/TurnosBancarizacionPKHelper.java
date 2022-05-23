package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacionPK;
/**
 *
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * Nota: helper de la llave compuesta de turnos bancarizacion
 * 
 */
public class TurnosBancarizacionPKHelper { 
	
	private TurnosBancarizacionPKHelper() {
		// constructor vacio
	}
	
	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto
	 * @param atb_entidad entidad a converitr
	 * @return dto generado
	 */
	public static TurnosBancarizacionPKDTO entidadADtoSimple(TurnosBancarizacionPK atb_entidad) {
		TurnosBancarizacionPKDTO ltb_dto = new TurnosBancarizacionPKDTO();
		ltb_dto.setIdTransaccionBancarizacion(atb_entidad.getIdTransaccionBancarizacion());
		ltb_dto.setIdTurno(atb_entidad.getIdTurno());

		return ltb_dto;
	}
	/**
	 * Metodo que convierte de entidad a dto
	 * @param atb_entidad entidad a converitr
	 * @return dto generado
	 */
	public static TurnosBancarizacionPKDTO entidadADtoCompleto(TurnosBancarizacionPK atb_entidad) {
		TurnosBancarizacionPKDTO ltb_dto = entidadADtoSimple(atb_entidad);
		return ltb_dto;
	}
	
	/**
	 * Metodo que convierte de lista de entidad a dto
	 * @param altb_altblistEntidad lista de entidad a converitr
	 * @return lista de dtos generado
	 */
	public static List<TurnosBancarizacionPKDTO> listaentidadADtoSimple(List<TurnosBancarizacionPK> altb_altblistEntidad) {
		List<TurnosBancarizacionPKDTO> lltb_listDto = new ArrayList<TurnosBancarizacionPKDTO>();
		for (TurnosBancarizacionPK ltb_entidad : altb_altblistEntidad) {
			lltb_listDto.add(entidadADtoSimple(ltb_entidad));
		}
		return lltb_listDto;
	}
	
	/**
	 * Metodo que convierte de lista de entidad a dto
	 * @param altb_altblistEntidad lista de entidad a converitr
	 * @return lista de dtos generado
	 */
	public static List<TurnosBancarizacionPKDTO> listaentidadADtoCompleto(List<TurnosBancarizacionPK> altb_listEntidad) {
		List<TurnosBancarizacionPKDTO> lltb_listDto = new ArrayList<TurnosBancarizacionPKDTO>();
		for (TurnosBancarizacionPK ltb_entidad : altb_listEntidad) {
			lltb_listDto.add(entidadADtoCompleto(ltb_entidad));
		}
		return lltb_listDto;
	}
	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte de dto a entidad
	 * @param atb_dto dto generado 
	 * @param atb_entidad entidad generada
	 * @return TurnosBancarizacionPK entidad generada
	 */
	public static TurnosBancarizacionPK dtoAEntidadSimple(TurnosBancarizacionPKDTO atb_dto, TurnosBancarizacionPK atb_entidad) {
		if (null == atb_entidad) {
			atb_entidad = new TurnosBancarizacionPK();
		}
		atb_entidad.setIdTransaccionBancarizacion(atb_dto.getIdTransaccionBancarizacion());
		atb_entidad.setIdTurno(atb_dto.getIdTurno());

		return atb_entidad;
	}
	/**
	 * Metodo que convierte de dto a entidad
	 * @param atb_dto dto generado 
	 * @param atb_entidad entidad generada
	 * @return TurnosBancarizacionPK entidad generada
	 */
	public static TurnosBancarizacionPK dtoAEntidadCompleto(TurnosBancarizacionPKDTO atb_dto, TurnosBancarizacionPK atb_entidad) {
		atb_entidad = dtoAEntidadSimple(atb_dto, atb_entidad);

		return atb_entidad;
	}
	
	/**
	 * Metodo que permite convertir lista de dto a entidad
	 * @param altb_listDto lista de dto
	 * @return lista de entidad generada
	 */
	public static List<TurnosBancarizacionPK> listadtoAEntidadSimple(List<TurnosBancarizacionPKDTO> altb_listDto) {
		List<TurnosBancarizacionPK> lltb_listEntidad = new ArrayList<TurnosBancarizacionPK>();
		for (TurnosBancarizacionPKDTO ltb_dto : altb_listDto) {
			lltb_listEntidad.add(dtoAEntidadSimple(ltb_dto, null));
		}
		return lltb_listEntidad;
	}
	/**
	 * Metodo que permite convertir lista de dto a entidad
	 * @param altb_listDto lista de dto
	 * @return lista de entidad generada
	 */
	public static List<TurnosBancarizacionPK> listadtoAEntidadCompleto(List<TurnosBancarizacionPKDTO> altb_listDto) {
		List<TurnosBancarizacionPK> lltb_listEntidad = new ArrayList<TurnosBancarizacionPK>();
		for (TurnosBancarizacionPKDTO ltb_dto : altb_listDto) {
			lltb_listEntidad.add(dtoAEntidadCompleto(ltb_dto, null));
		}
		return lltb_listEntidad;
	}
	// --- fin to Entidad
}
