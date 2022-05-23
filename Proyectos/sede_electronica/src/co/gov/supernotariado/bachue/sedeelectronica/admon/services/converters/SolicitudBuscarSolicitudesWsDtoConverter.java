/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudBuscarSolicitudesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: SolicitudBuscarSolicitudesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesServicios;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Solicitud buscar
 * solicitudes ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudBuscarSolicitudesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * SolicitudBuscarSolicitudesWsDtoConverter.
	 */
	private SolicitudBuscarSolicitudesWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> SolicitudWSDTO <b>a</b> SolicitudVO, <br>
	 * En otras palabras, <b>de</b> Solicitud web service dto <b>a</b> Solicitud
	 * objeto con valores de servicio.
	 *
	 * @param as_solicitudWsdto el parametro solicitud wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como SolicitudVO
	 */
	public static SolicitudVO wsdtoAVo(SolicitudWSDTO as_solicitudWsdto) {
		SolicitudVO ls_solicitudVo = new SolicitudVO();
		ls_solicitudVo.setIs_nir(as_solicitudWsdto.getIs_nir());
		ls_solicitudVo.setIs_descripcionServicio(as_solicitudWsdto.getIs_descripcionServicio());
		ls_solicitudVo.setIs_descripcionSubServicio(as_solicitudWsdto.getIs_descripcionSubServicio());
		SimpleDateFormat lsdf_formatoFecha = new SimpleDateFormat("MM/dd/yyyy");
		String ls_textoFecha = lsdf_formatoFecha.format(as_solicitudWsdto.getId_fechaServicio());
		ls_solicitudVo.setIs_fechaServicio(ls_textoFecha);
		return ls_solicitudVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SolicitudVO <b>a</b> SolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Solicitud objeto con valores de servicio
	 * <b>a</b> Solicitud web service dto.
	 *
	 * @param as_solicitudVo el parametro solicitud vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SolicitudWSDTO
	 */
	public static SolicitudWSDTO voAWsdto(SolicitudVO as_solicitudVo) {
		SolicitudWSDTO ls_solicitudWsdto = new SolicitudWSDTO();
		ls_solicitudWsdto.setIs_nir(as_solicitudVo.getIs_nir());
		ls_solicitudWsdto.setIs_descripcionServicio(as_solicitudVo.getIs_descripcionServicio());
		ls_solicitudWsdto.setIs_descripcionSubServicio(as_solicitudVo.getIs_descripcionSubServicio());
		Date ld_fechaServicio;
		try {
			ld_fechaServicio = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato()).parse(as_solicitudVo.getIs_fechaServicio());
		} catch (ParseException ape_excepcionConvertir) {
			throw new ExcepcionesNegocio(EnumMensajesServicios.CONVERSION_FALLO);
		}
		ls_solicitudWsdto.setId_fechaServicio(ld_fechaServicio);
		return ls_solicitudWsdto;
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
	 * Especificamente convierte <b>de</b> una SolicitudVO <b>a</b> una
	 * SolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> una Solicitud objeto con valores de servicio
	 * <b>a</b> una Solicitud web service dto.
	 *
	 * @param als_listaSolicitudVo el parametro lista solicitud vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de SolicitudWSDTO
	 */
	public static List<SolicitudWSDTO> listaVoAListaWsdto(List<SolicitudVO> als_listaSolicitudVo) {

		List<SolicitudWSDTO> lls_solicitudWsDto = new ArrayList<>();

		for (SolicitudVO ls_solicitud : als_listaSolicitudVo)
			lls_solicitudWsDto.add(voAWsdto(ls_solicitud));

		return lls_solicitudWsDto;
	}
}
