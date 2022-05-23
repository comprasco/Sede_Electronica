/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerCausalesCorreccionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerCausalesCorreccionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion.TipoSalidaObtenerCausalesCorreccion;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion.TipoSalidaObtenerCausalesCorreccion.ListaCausales;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion.TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.CausalVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaObtenerCausalesCorreccionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * causales correccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerCausalesCorreccionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerCausalesCorreccionConverter.
	 */
	private ObtenerCausalesCorreccionConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerCausalesCorreccion
	 * <b>a</b> TipoSalidaObtenerCausalesCorreccionVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener causales correccion
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida obtener causales correccion objeto con valores de servicio.
	 *
	 * @param atsocc_tipoSalidaObtenerCausalesCorreccion el parametro que representa
	 *                                                   el complex type a
	 *                                                   convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerCausalesCorreccionVO.
	 */
	public static TipoSalidaObtenerCausalesCorreccionVO entidaAVo(
			TipoSalidaObtenerCausalesCorreccion atsocc_tipoSalidaObtenerCausalesCorreccion) {
		TipoSalidaObtenerCausalesCorreccionVO ltsocc_tipoSalidaObtenerCausalesCorreccionVo = new TipoSalidaObtenerCausalesCorreccionVO();
		ltsocc_tipoSalidaObtenerCausalesCorreccionVo
				.setIlc_listaCausalVo(listaCausal(atsocc_tipoSalidaObtenerCausalesCorreccion.getListaCausales()));
		ltsocc_tipoSalidaObtenerCausalesCorreccionVo
				.setIs_codigo(atsocc_tipoSalidaObtenerCausalesCorreccion.getCodigo());
		ltsocc_tipoSalidaObtenerCausalesCorreccionVo
				.setIs_mensaje(atsocc_tipoSalidaObtenerCausalesCorreccion.getMensaje());
		return ltsocc_tipoSalidaObtenerCausalesCorreccionVo;
	}

	/**
	 * Lista causal.
	 *
	 * @param alc_listaCausales el parametro lista causales
	 * @return Resultado para lista causal retornado como una lista de CausalVO
	 */
	private static List<CausalVO> listaCausal(ListaCausales alc_listaCausales) {
		List<CausalVO> llc_listaCausal = new ArrayList<>();
		for (Causal lc_causal : alc_listaCausales.getCausal()) {
			CausalVO lc_causalVo = new CausalVO();
			lc_causalVo.setIs_descCausalCorreccion(lc_causal.getDescCausalCorreccion());
			lc_causalVo.setIs_descGrupoCausal(lc_causal.getDescGrupoCausal());
			lc_causalVo.setIs_descripcionCausal(lc_causal.getDescripcionCausal());
			lc_causalVo.setIs_idCausalCorreccion(lc_causal.getIdCausalCorreccion());
			lc_causalVo.setIs_idGrupoCausal(lc_causal.getIdGrupoCausal());
			llc_listaCausal.add(lc_causalVo);
		}
		return llc_listaCausal;
	}
}
