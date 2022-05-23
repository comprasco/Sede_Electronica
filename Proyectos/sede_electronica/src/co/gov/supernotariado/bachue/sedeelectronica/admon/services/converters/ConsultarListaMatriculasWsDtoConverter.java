/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarListaMatriculasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarListaMatriculasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarListaMatriculasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar lista
 * matriculas ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarListaMatriculasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarListaMatriculasWsDtoConverter.
	 */
	private ConsultarListaMatriculasWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarListaMatriculasWSDTO
	 * <b>a</b> TipoEntradaConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar lista matriculas web
	 * service dto <b>a</b> Tipo entrada consultar lista matriculas objeto con
	 * valores de servicio.
	 *
	 * @param ateclm_tipoEntradaConsultarListaMatriculasWSDTO el parametro tipo
	 *                                                        entrada consultar
	 *                                                        lista matriculas WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarListaMatriculasVO
	 */
	public static TipoEntradaConsultarListaMatriculasVO wsDtoAVo(
			TipoEntradaConsultarListaMatriculasWSDTO ateclm_tipoEntradaConsultarListaMatriculasWSDTO) {
		TipoEntradaConsultarListaMatriculasVO lteclm_tipoEntradaConsultarListaMatriculas = new TipoEntradaConsultarListaMatriculasVO();
		lteclm_tipoEntradaConsultarListaMatriculas
				.setIllmclm_listaMatriculaConsultarListaMatriculasVo(ListaMatriculasWsDtoConverter.listaVoAListaWsdto(
						ateclm_tipoEntradaConsultarListaMatriculasWSDTO.getIllm_listaMatriculasWsDto()));

		return lteclm_tipoEntradaConsultarListaMatriculas;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarListaMatriculasVO
	 * <b>a</b> TipoSalidaConsultarListaMatriculasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar lista matriculas objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar lista matriculas web
	 * service dto.
	 *
	 * @param atsclm_tipoSalidaConsultarListaMatriculasVo el parametro tipo salida
	 *                                                    consultar lista matriculas
	 *                                                    vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarListaMatriculasWSDTO
	 */
	public static TipoSalidaConsultarListaMatriculasWSDTO voAWsDto(
			TipoSalidaConsultarListaMatriculasVO atsclm_tipoSalidaConsultarListaMatriculasVo) {
		TipoSalidaConsultarListaMatriculasWSDTO ltsclm_tipoSalidaConsultarListaMatriculasWSDTO = new TipoSalidaConsultarListaMatriculasWSDTO();
		ltsclm_tipoSalidaConsultarListaMatriculasWSDTO
				.setIs_codigoMensaje(atsclm_tipoSalidaConsultarListaMatriculasVo.getIs_codigo());
		ltsclm_tipoSalidaConsultarListaMatriculasWSDTO
				.setIs_descripcionMensaje(atsclm_tipoSalidaConsultarListaMatriculasVo.getIs_mensaje());
		ltsclm_tipoSalidaConsultarListaMatriculasWSDTO.setIllms_listaMatriculasSalidaWsDto(
				ListaMatriculasSalidaWsDtoConverter.listaVOAListaWsDto(atsclm_tipoSalidaConsultarListaMatriculasVo
						.getIllmclm_listaMatriculasConsultarListaMatriculasVo()));

		return ltsclm_tipoSalidaConsultarListaMatriculasWSDTO;
	}

}
