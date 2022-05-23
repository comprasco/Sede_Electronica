/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroBusquedaDocumentosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ParametroBusquedaDocumentosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.ParametroVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ParametroBusquedaDocumentoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Parametro
 * busqueda documentos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroBusquedaDocumentosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametroBusquedaDocumentosWsDtoConverter.
	 */
	private ParametroBusquedaDocumentosWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> ParametroBusquedaDocumentoWSDTO <b>a</b>
	 * ParametroVO, <br>
	 * En otras palabras, <b>de</b> Parametro busqueda documento web service dto
	 * <b>a</b> Parametro objeto con valores de servicio.
	 *
	 * @param apbd_parametroBusquedaDocumentoWSDTO el parametro parametro busqueda
	 *                                             documento WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como ParametroVO
	 */
	public static ParametroVO wsDtoAVo(ParametroBusquedaDocumentoWSDTO apbd_parametroBusquedaDocumentoWSDTO) {
		ParametroVO lp_parametro = new ParametroVO();
		lp_parametro.setIs_nombre(apbd_parametroBusquedaDocumentoWSDTO.getIs_nombre());
		lp_parametro.setIs_valor(apbd_parametroBusquedaDocumentoWSDTO.getIs_valor());
		return lp_parametro;
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
	 * Especificamente convierte <b>de</b> ParametroBusquedaDocumentoWSDTO <b>a</b>
	 * ParametroVO, <br>
	 * En otras palabras, <b>de</b> Parametro busqueda documento web service dto
	 * <b>a</b> Parametro objeto con valores de servicio.
	 *
	 * @param alpbd_listaParametroBusquedaDocumentoWSDTO el parametro lista
	 *                                                   parametro busqueda
	 *                                                   documento WSDTO
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de ParametroVO
	 */
	public static List<ParametroVO> listaWsDtoAListaVo(
			List<ParametroBusquedaDocumentoWSDTO> alpbd_listaParametroBusquedaDocumentoWSDTO) {
		List<ParametroVO> llp_listaParametro = new ArrayList<>();
		for (ParametroBusquedaDocumentoWSDTO lpbd_parametroBusquedaDocumentoWSDTO : alpbd_listaParametroBusquedaDocumentoWSDTO) {
			llp_listaParametro.add(wsDtoAVo(lpbd_parametroBusquedaDocumentoWSDTO));
		}
		return llp_listaParametro;
	}

}
