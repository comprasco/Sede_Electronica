/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerCausalesCorreccionWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ObtenerCausalesCorreccionWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.CausalVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaObtenerCausalesCorreccionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CausalWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerCausalesCorreccionWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener causales
 * correccion ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerCausalesCorreccionWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerCausalesCorreccionWsDtoConverter.
	 */
	private ObtenerCausalesCorreccionWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerCausalesCorreccionVO
	 * <b>a</b> TipoSalidaObtenerCausalesCorreccionWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener causales correccion objeto
	 * con valores de servicio <b>a</b> Tipo salida obtener causales correccion web
	 * service dto.
	 *
	 * @param atsocc_tipoSalidaObtenerCausalesCorreccionVo el parametro tipo salida
	 *                                                     obtener causales
	 *                                                     correccion vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerCausalesCorreccionWSDTO
	 */
	public static TipoSalidaObtenerCausalesCorreccionWSDTO entidaAWsdto(
			TipoSalidaObtenerCausalesCorreccionVO atsocc_tipoSalidaObtenerCausalesCorreccionVo) {
		TipoSalidaObtenerCausalesCorreccionWSDTO ltsocc_tipoSalidaObtenerCausalesCorreccionWsdto = new TipoSalidaObtenerCausalesCorreccionWSDTO();
		ltsocc_tipoSalidaObtenerCausalesCorreccionWsdto.setIlc_listaCausalWsdto(
				listaCausal(atsocc_tipoSalidaObtenerCausalesCorreccionVo.getIlc_listaCausalVo()));
		ltsocc_tipoSalidaObtenerCausalesCorreccionWsdto
				.setIs_codigo(atsocc_tipoSalidaObtenerCausalesCorreccionVo.getIs_codigo());
		ltsocc_tipoSalidaObtenerCausalesCorreccionWsdto
				.setIs_mensaje(atsocc_tipoSalidaObtenerCausalesCorreccionVo.getIs_mensaje());
		return ltsocc_tipoSalidaObtenerCausalesCorreccionWsdto;
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
	 * Especificamente convierte <b>de</b> una CausalVO <b>a</b> una CausalWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> una Causal objeto con valores de servicio
	 * <b>a</b> una Causal web service dto.
	 *
	 * @param alc_listaCausalVo el parametro lista causal vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de CausalWSDTO
	 */
	private static List<CausalWSDTO> listaCausal(List<CausalVO> alc_listaCausalVo) {
		List<CausalWSDTO> llc_listaCausal = new ArrayList<>();
		for (CausalVO lc_causal : alc_listaCausalVo) {
			CausalWSDTO lc_causalWsdto = new CausalWSDTO();
			lc_causalWsdto.setIs_descCausalCorreccion(lc_causal.getIs_descCausalCorreccion());
			lc_causalWsdto.setIs_descGrupoCausal(lc_causal.getIs_descGrupoCausal());
			lc_causalWsdto.setIs_descripcionCausal(lc_causal.getIs_descripcionCausal());
			lc_causalWsdto.setIs_idCausalCorreccion(lc_causal.getIs_idCausalCorreccion());
			lc_causalWsdto.setIs_idGrupoCausal(lc_causal.getIs_idGrupoCausal());
			llc_listaCausal.add(lc_causalWsdto);
		}
		return llc_listaCausal;
	}
}
