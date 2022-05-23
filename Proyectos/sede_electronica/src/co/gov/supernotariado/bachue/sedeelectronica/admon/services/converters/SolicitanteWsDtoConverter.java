/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitanteWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: SolicitanteWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteDetalleVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SolicitanteWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Solicitante ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitanteWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase SolicitanteWsDtoConverter.
	 */
	private SolicitanteWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> SolicitanteWSDTO <b>a</b>
	 * SolicitanteDetalleVO, <br>
	 * En otras palabras, <b>de</b> Solicitante web service dto <b>a</b> Solicitante
	 * detalle objeto con valores de servicio.
	 *
	 * @param as_solicitanteWsdto el parametro solicitante wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como SolicitanteDetalleVO
	 */
	public static SolicitanteDetalleVO wsdtoAVo(SolicitanteWSDTO as_solicitanteWsdto) {
		SolicitanteDetalleVO lsd_solicitanteVo = new SolicitanteDetalleVO();
		lsd_solicitanteVo.setIs_tipoPersona(as_solicitanteWsdto.getIs_tipoPersona());
		lsd_solicitanteVo.setIs_tipoDocumento(as_solicitanteWsdto.getIs_tipoDocumento());
		lsd_solicitanteVo.setIs_numeroDocumento(as_solicitanteWsdto.getIs_numeroDocumento());
		return lsd_solicitanteVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SolicitanteVO <b>a</b> SolicitanteWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> Solicitante objeto con valores de servicio
	 * <b>a</b> Solicitante web service dto.
	 *
	 * @param as_solicitanteVo el parametro solicitante vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SolicitanteWSDTO
	 */
	public static SolicitanteWSDTO voAWsdto(SolicitanteVO as_solicitanteVo) {
		SolicitanteWSDTO lsw_solicitanteWsdto = new SolicitanteWSDTO();
		lsw_solicitanteWsdto.setIs_tipoPersona(as_solicitanteVo.getIs_tipoPersona());
		lsw_solicitanteWsdto.setIs_tipoDocumento(as_solicitanteVo.getIs_tipoDocumento());
		lsw_solicitanteWsdto.setIs_numeroDocumento(as_solicitanteVo.getIs_numeroDocumento());
		return lsw_solicitanteWsdto;
	}

}
