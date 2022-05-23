/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TurnoConsultarDetallesSolicitudWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TurnoConsultarDetallesSolicitudWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TurnoDetalleVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TurnoConsultarDetallesSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesServicios;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Turno consultar
 * detalles solicitud ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoConsultarDetallesSolicitudWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TurnoConsultarDetallesSolicitudWsDtoConverter.
	 */
	private TurnoConsultarDetallesSolicitudWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TurnoDetalleVO <b>a</b>
	 * TurnoConsultarDetallesSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Turno detalle objeto con valores de servicio
	 * <b>a</b> Turno consultar detalles solicitud web service dto.
	 *
	 * @param atd_turnoDetalleVo el parametro turno detalle vo
	 * @param as_formatoFecha    el parametro formato fecha
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TurnoConsultarDetallesSolicitudWSDTO
	 */
	public static TurnoConsultarDetallesSolicitudWSDTO voAWsdto(TurnoDetalleVO atd_turnoDetalleVo,
			String as_formatoFecha) {
		TurnoConsultarDetallesSolicitudWSDTO ltcds_turnoConsultarDetallesSolicitudWsdto = new TurnoConsultarDetallesSolicitudWSDTO();
		ltcds_turnoConsultarDetallesSolicitudWsdto.setIs_nir(atd_turnoDetalleVo.getIs_nir());
		ltcds_turnoConsultarDetallesSolicitudWsdto.setIs_turno(atd_turnoDetalleVo.getIs_turno());
		ltcds_turnoConsultarDetallesSolicitudWsdto
				.setIs_descripcionServicio(atd_turnoDetalleVo.getIs_descripcionServicio());
		ltcds_turnoConsultarDetallesSolicitudWsdto
				.setIs_descripcionSubServicio(atd_turnoDetalleVo.getIs_descricionSubServicio());
		Date ld_fechaServicio;
		try {
			DateFormat ldf_formatoFecha = new SimpleDateFormat(as_formatoFecha);
			ld_fechaServicio = ldf_formatoFecha.parse(atd_turnoDetalleVo.getIs_fechaServicio());
		} catch (ParseException ape_excepcionConvertir) {
			throw new ExcepcionesNegocio(EnumMensajesServicios.CONVERSION_FALLO);
		}
		ltcds_turnoConsultarDetallesSolicitudWsdto.setId_fechaServicio(ld_fechaServicio);
		return ltcds_turnoConsultarDetallesSolicitudWsdto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TurnoDetalleVO <b>a</b> una
	 * TurnoConsultarDetallesSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> una Turno detalle objeto con valores de servicio
	 * <b>a</b> una Turno consultar detalles solicitud web service dto.
	 *
	 * @param altd_listaTurnoVo el parametro lista turno vo
	 * @param as_formatoFecha   el parametro formato fecha
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         TurnoConsultarDetallesSolicitudWSDTO
	 */
	public static List<TurnoConsultarDetallesSolicitudWSDTO> listaVoAListaWsdto(List<TurnoDetalleVO> altd_listaTurnoVo,
			String as_formatoFecha) {

		List<TurnoConsultarDetallesSolicitudWSDTO> lltcds_listaTurnoConsultarDetalleSolicitudWsdto = new ArrayList<>();

		for (TurnoDetalleVO ltd_turnoDetalleVo : altd_listaTurnoVo)
			lltcds_listaTurnoConsultarDetalleSolicitudWsdto.add(voAWsdto(ltd_turnoDetalleVo, as_formatoFecha));

		return lltcds_listaTurnoConsultarDetalleSolicitudWsdto;
	}
}
