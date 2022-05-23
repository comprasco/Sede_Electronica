/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarEntidadesJAWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarEntidadesJAWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.EntradaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EntradaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEntidadesJAWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * entidades JA ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEntidadesJAWsDtoConverter {
	

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ConsultarEntidadesJAWsDtoConverter.class);

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEntidadesJAWsDtoConverter.
	 */
	private ConsultarEntidadesJAWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> EntradaConsultarEntidadesJAWSDTO <b>a</b>
	 * EntradaConsultarEntidadesJAVO, <br>
	 * En otras palabras, <b>de</b> Entrada consultar entidades JAWSDTO <b>a</b>
	 * Entrada consultar entidades JAVO.
	 *
	 * @param aeceja_tipoEntradaConsultarEntidadesJAWSDTO el parametro tipo entrada
	 *                                                    consultar entidades
	 *                                                    JAWSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como EntradaConsultarEntidadesJAVO
	 */
	public static EntradaConsultarEntidadesJAVO wsDtoAVo(
			EntradaConsultarEntidadesJAWSDTO aeceja_tipoEntradaConsultarEntidadesJAWSDTO) {
		EntradaConsultarEntidadesJAVO leceja_tipoEntradaConsultarEntidadesJA;
		leceja_tipoEntradaConsultarEntidadesJA = new EntradaConsultarEntidadesJAVO();
		CL_LOGGER.info(aeceja_tipoEntradaConsultarEntidadesJAWSDTO);		

		return leceja_tipoEntradaConsultarEntidadesJA;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarEntidadesJAVO <b>a</b>
	 * TipoSalidaConsultarEntidadesJAWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar entidades JAVO <b>a</b>
	 * Tipo salida consultar entidades JAWSDTO.
	 *
	 * @param atsceja_tipoSalidaConsultarDocumentoAlertaVo el parametro tipo salida
	 *                                                     consultar documento
	 *                                                     alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarEntidadesJAWSDTO
	 */
	public static TipoSalidaConsultarEntidadesJAWSDTO voAWsDto(
			TipoSalidaConsultarEntidadesJAVO atsceja_tipoSalidaConsultarDocumentoAlertaVo) {
		TipoSalidaConsultarEntidadesJAWSDTO ltsceja_tipoSalidaConsultarEntidadesJAWSDTO = new TipoSalidaConsultarEntidadesJAWSDTO();
		ltsceja_tipoSalidaConsultarEntidadesJAWSDTO
				.setIs_codigoMensaje(atsceja_tipoSalidaConsultarDocumentoAlertaVo.getIs_codigo());
		ltsceja_tipoSalidaConsultarEntidadesJAWSDTO
				.setIs_descripcionMensaje(atsceja_tipoSalidaConsultarDocumentoAlertaVo.getIs_mensaje());
		ltsceja_tipoSalidaConsultarEntidadesJAWSDTO
				.setIlaja_listalistaAutoridadesJAWsDto(ListaAutoridadesJAWsDtoConverter.listaVOAListaWsDto(
						atsceja_tipoSalidaConsultarDocumentoAlertaVo.getIllaja_listaAutoridadesJAVo()));

		return ltsceja_tipoSalidaConsultarEntidadesJAWSDTO;
	}

}
