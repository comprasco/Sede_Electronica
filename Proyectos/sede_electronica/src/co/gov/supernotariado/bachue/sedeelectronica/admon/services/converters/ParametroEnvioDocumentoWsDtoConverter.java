/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroEnvioDocumentoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ParametroEnvioDocumentoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoParametroVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ParametroEnviarDocumentosWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Parametro envio
 * documento ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroEnvioDocumentoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametroEnvioDocumentoWsDtoConverter.
	 */
	private ParametroEnvioDocumentoWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> ParametroEnviarDocumentosWSDTO <b>a</b>
	 * TipoParametroVO, <br>
	 * En otras palabras, <b>de</b> Parametro enviar documentos web service dto
	 * <b>a</b> Tipo parametro objeto con valores de servicio.
	 *
	 * @param aped_parametroEnviarDocumentoWSDTO el parametro parametro enviar
	 *                                           documento WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoParametroVO
	 */
	public static TipoParametroVO wsDtoAVo(ParametroEnviarDocumentosWSDTO aped_parametroEnviarDocumentoWSDTO) {
		TipoParametroVO ltp_parametro = new TipoParametroVO();
		ltp_parametro.setIs_nombre(aped_parametroEnviarDocumentoWSDTO.getIs_nombre());
		ltp_parametro.setIs_valor(aped_parametroEnviarDocumentoWSDTO.getIs_valor());
		return ltp_parametro;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ParametroEnviarDocumentosWSDTO <b>a</b>
	 * TipoParametroVO, <br>
	 * En otras palabras, <b>de</b> Parametro enviar documentos web service dto
	 * <b>a</b> Tipo parametro objeto con valores de servicio.
	 *
	 * @param alped_listaParametroEnviarDocumentosWSDTO el parametro lista parametro
	 *                                                  enviar documentos WSDTO
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoParametroVO
	 */
	public static List<TipoParametroVO> listaWsDtoAListaVo(
			List<ParametroEnviarDocumentosWSDTO> alped_listaParametroEnviarDocumentosWSDTO) {
		List<TipoParametroVO> lltp_listaParametro = new ArrayList<>();
		for (ParametroEnviarDocumentosWSDTO lped_parametroEnviarDocumentosWSDTO : alped_listaParametroEnviarDocumentosWSDTO) {
			lltp_listaParametro.add(wsDtoAVo(lped_parametroEnviarDocumentosWSDTO));
		}
		return lltp_listaParametro;
	}
}
