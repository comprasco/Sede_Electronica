package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la HistorialSolicitudes Pagadas
 * <br>
 *
 * @author Smartsoft Solutions S.A.S	
 * @version 1.0
 */
public class HistorialSolicitudesPagadasHelper {
	
	private HistorialSolicitudesPagadasHelper() {
		// constructor vacio
	}
	private static final String CS_EXTENSION = ".pdf";	

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 * @param altb_transaccionBancarizacion Lista de historial de solicitudes entidad
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         HistorialSolicitudesSalidaDTO
	 */
	public static List<HistorialSolicitudesSalidaDTO> listaTransaccionBancarizacionDTOAListaHistorialSolicitudesSalidaDTO(
			List<TransaccionBancarizacionDTO> altb_transaccionBancarizacion) {
		List<HistorialSolicitudesSalidaDTO> llhss_historialSolicitudes = new ArrayList<>();
		for (TransaccionBancarizacionDTO ltb_transaccionBancarizacion :altb_transaccionBancarizacion) {
			llhss_historialSolicitudes.add(HistorialSolicitudesPagadasHelper.transaccionBancarizacionDTOAHistorialSolicitudesSalidaDTO(ltb_transaccionBancarizacion));
		}
		return llhss_historialSolicitudes;
	}

	/**
	 * Metodo que convierte una TransaccionBancarizacionDTO a una HistorialSolicitudesSalidaDTO
	 * @param atb_transaccionBancarizacion
	 * @return Resultado de una entidad simple retornado como un dto
	 *         HistorialSolicitudesSalidaDTO
	 */
	public static HistorialSolicitudesSalidaDTO transaccionBancarizacionDTOAHistorialSolicitudesSalidaDTO(TransaccionBancarizacionDTO atb_transaccionBancarizacion) {
		HistorialSolicitudesSalidaDTO lhss_historialSolicitudesSalida = new HistorialSolicitudesSalidaDTO();
		
		lhss_historialSolicitudesSalida.setId_fechaServicio(atb_transaccionBancarizacion.getId_fechaServicio());
		lhss_historialSolicitudesSalida.setIlths_turnoHistorialSolicitudesDto(HistorialSolicitudesPagadasHelper.turnoDtoATurnoHistorial(atb_transaccionBancarizacion.getIltb_turnosBancarizacion()));
		lhss_historialSolicitudesSalida.setIs_referenciaPago(atb_transaccionBancarizacion.getIs_referenciaPago());
		lhss_historialSolicitudesSalida.setIs_referenciaTransaccion(atb_transaccionBancarizacion.getIs_codigoSeguimiento());
		lhss_historialSolicitudesSalida.setIs_servicio(atb_transaccionBancarizacion.getIs_servicio());
		lhss_historialSolicitudesSalida.setIs_subServicio(atb_transaccionBancarizacion.getIs_subServicio());
		lhss_historialSolicitudesSalida.setIs_nir(EnumValores.NO_APLICA.getIs_valor());
		lhss_historialSolicitudesSalida.setIs_estadoBancarizacion(atb_transaccionBancarizacion.getIs_estadoServicio());
		lhss_historialSolicitudesSalida.setIs_reciboConvertido(atb_transaccionBancarizacion.getIs_reciboPago());
			
		return lhss_historialSolicitudesSalida;
	}

	/**
	 * Método que convierte una lista de TurnosBancarizacionDTO a una TurnoHistorialSolicitudesDTO
	 * 
	 * @param altb_turnosBancarizacion lista de los turnos a convertir
	 * @return Lista de turnos historial solicitudes
	 */
	private static List<TurnoHistorialSolicitudesDTO> turnoDtoATurnoHistorial(List<TurnosBancarizacionDTO> altb_turnosBancarizacion) {
		List<TurnoHistorialSolicitudesDTO> llths_historialSolicitudes = new ArrayList<>();
		for (TurnosBancarizacionDTO ltb_turnosBancarizacionDTO : altb_turnosBancarizacion) {
			llths_historialSolicitudes.add(turnoDtoATurnoHistorial(ltb_turnosBancarizacionDTO));
		}
		return llths_historialSolicitudes;
	}

	
	/**
	 * Metodo que convierte de tipos de datos TurnosBancarizacionDTO a TurnoHistorialSolicitudesDTO
	 * @param atb_turnosBancarizacion turnos a convertir
	 * @return TurnoHistorialSolicitudesDTO turno convertido
	 */
	private static TurnoHistorialSolicitudesDTO turnoDtoATurnoHistorial(TurnosBancarizacionDTO atb_turnosBancarizacion) {
		TurnoHistorialSolicitudesDTO lths_turnoHistorialSolicitudes = new TurnoHistorialSolicitudesDTO();
		
		lths_turnoHistorialSolicitudes.setIb_archivoDisponible(true);
		lths_turnoHistorialSolicitudes.setId_fechaTurno(atb_turnosBancarizacion.getId_fechaServicio());
		lths_turnoHistorialSolicitudes.setIs_archivoConvertido(atb_turnosBancarizacion.getIs_archivo());
		lths_turnoHistorialSolicitudes.setIs_turno(atb_turnosBancarizacion.getItb_id().getIdTurno());		
		lths_turnoHistorialSolicitudes.setIs_nombreArchivo(atb_turnosBancarizacion.getItb_id().getIdTurno()+CS_EXTENSION);
		return lths_turnoHistorialSolicitudes;
	}
}
