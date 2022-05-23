/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BuscarSolicitudesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: BuscarSolicitudesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesServicios;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Buscar
 * solicitudes ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BuscarSolicitudesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * BuscarSolicitudesWsDtoConverter.
	 */
	private BuscarSolicitudesWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaBuscarSolicitudesWSDTO
	 * <b>a</b> TipoEntradaBuscarSolicitudesVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada buscar solicitudes web service dto
	 * <b>a</b> Tipo entrada buscar solicitudes objeto con valores de servicio.
	 *
	 * @param atebs_tipoEntradaBuscarSolicitudesWsdto el parametro tipo entrada
	 *                                                buscar solicitudes wsdto
	 * @param as_fechaPeticion                        el parametro fecha peticion
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaBuscarSolicitudesVO
	 */
	public static TipoEntradaBuscarSolicitudesVO wsdtoAVo(
			TipoEntradaBuscarSolicitudesWSDTO atebs_tipoEntradaBuscarSolicitudesWsdto, String as_fechaPeticion) {
		TipoEntradaBuscarSolicitudesVO ltebs_tipoEntradaBuscarSolicitudesVo = new TipoEntradaBuscarSolicitudesVO();
		ltebs_tipoEntradaBuscarSolicitudesVo.setIs_nir(atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_nir());
		ltebs_tipoEntradaBuscarSolicitudesVo.setIs_modulo(atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_modulo());
		ltebs_tipoEntradaBuscarSolicitudesVo.setIs_servicio(atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_servicio());
		DateFormat ldf_formatoFecha = new SimpleDateFormat(as_fechaPeticion);
		String ls_fechaDesde = ldf_formatoFecha
				.format(atebs_tipoEntradaBuscarSolicitudesWsdto.getId_fechaDesdeBusqueda());
		ltebs_tipoEntradaBuscarSolicitudesVo.setIs_fechaDesdeBusqueda(ls_fechaDesde);
		String ls_fechaHasta = ldf_formatoFecha
				.format(atebs_tipoEntradaBuscarSolicitudesWsdto.getId_fechaHastaBusqueda());
		ltebs_tipoEntradaBuscarSolicitudesVo.setIs_fechaHastaBusqueda(ls_fechaHasta);
		ltebs_tipoEntradaBuscarSolicitudesVo.setIls_listaSolicitante(new ArrayList<>());
		SolicitanteVO ls_solicitanteVo = new SolicitanteVO();
		ls_solicitanteVo.setIs_numeroDocumento(
				atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_solicitante().getIs_numeroDocumento());
		ls_solicitanteVo
				.setIs_tipoDocumento(atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_solicitante().getIs_tipoDocumento());
		ls_solicitanteVo
				.setIs_tipoPersona(atebs_tipoEntradaBuscarSolicitudesWsdto.getIs_solicitante().getIs_tipoPersona());
		ltebs_tipoEntradaBuscarSolicitudesVo.getIls_listaSolicitante().add(ls_solicitanteVo);
		return ltebs_tipoEntradaBuscarSolicitudesVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaBuscarSolicitudesVO <b>a</b>
	 * TipoSalidaBuscarSolicitudesWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida buscar solicitudes objeto con
	 * valores de servicio <b>a</b> Tipo salida buscar solicitudes web service dto.
	 *
	 * @param atsbs_tipoSalidaBuscarSolicitudesVo el parametro tipo salida buscar
	 *                                            solicitudes vo
	 * @param as_formatoFecha                     el parametro formato fecha
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaBuscarSolicitudesWSDTO
	 */
	public static TipoSalidaBuscarSolicitudesWSDTO voAWsdto(
			TipoSalidaBuscarSolicitudesVO atsbs_tipoSalidaBuscarSolicitudesVo, String as_formatoFecha) {
		TipoSalidaBuscarSolicitudesWSDTO ltsbs_tipoSalidaBuscarSolicitudesWsdto = new TipoSalidaBuscarSolicitudesWSDTO();
		ltsbs_tipoSalidaBuscarSolicitudesWsdto
				.setIs_codigoMensaje(atsbs_tipoSalidaBuscarSolicitudesVo.getIs_codigoMensaje());
		ltsbs_tipoSalidaBuscarSolicitudesWsdto
				.setIs_descripcionMensaje(atsbs_tipoSalidaBuscarSolicitudesVo.getIs_descripcionMensaje());
		DateFormat ldf_formatoFecha = new SimpleDateFormat(as_formatoFecha);
		ltsbs_tipoSalidaBuscarSolicitudesWsdto.setIls_solicitudes(new ArrayList<>());
			for (SolicitudVO ls_solicitudVo : atsbs_tipoSalidaBuscarSolicitudesVo.getIls_listaSolicitud()) {
				SolicitudWSDTO ls_solicitudWsDto = new SolicitudWSDTO();
				if(!ls_solicitudVo.getIs_fechaServicio().equals("")) {
					try {
						ls_solicitudWsDto.setId_fechaServicio(ldf_formatoFecha.parse(ls_solicitudVo.getIs_fechaServicio()));
					} catch (ParseException ape_excepcionConvertir) {
						throw new ExcepcionesNegocio(EnumMensajesServicios.CONVERSION_FALLO);
					}
				}
				ls_solicitudWsDto.setIs_descripcionServicio(ls_solicitudVo.getIs_descripcionServicio());
				ls_solicitudWsDto.setIs_descripcionSubServicio(ls_solicitudVo.getIs_descripcionSubServicio());
				ls_solicitudWsDto.setIs_nir(ls_solicitudVo.getIs_nir());
				ltsbs_tipoSalidaBuscarSolicitudesWsdto.getIls_solicitudes().add(ls_solicitudWsDto);
			}
		return ltsbs_tipoSalidaBuscarSolicitudesWsdto;
	}
}
