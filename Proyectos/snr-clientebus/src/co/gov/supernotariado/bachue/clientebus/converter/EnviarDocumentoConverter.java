/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EnviarDocumentoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: EnviarDocumentoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.enviodocumento.types.TipoEntradaEnviarDocumento;
import co.gov.supernotariado.bachue.clientebus.enviodocumento.types.TipoEntradaEnviarDocumento.Parametros;
import co.gov.supernotariado.bachue.clientebus.enviodocumento.types.TipoParametro;
import co.gov.supernotariado.bachue.clientebus.enviodocumento.types.TipoSalidaEnviarDocumento;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoEntradaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoSalidaEnviarDocumentoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Enviar
 * documento. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EnviarDocumentoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase EnviarDocumentoConverter.
	 */
	private EnviarDocumentoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaEnviarDocumento <b>a</b>
	 * TipoSalidaEnviarDocumentoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida enviar documento (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida enviar
	 * documento objeto con valores de servicio.
	 *
	 * @param atsed_tipoSalidaEnviarDocumento el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaEnviarDocumentoVO.
	 */
	public static TipoSalidaEnviarDocumentoVO tipoAVo(TipoSalidaEnviarDocumento atsed_tipoSalidaEnviarDocumento) {
		TipoSalidaEnviarDocumentoVO ltsed_tipoSalidaEnviarDocumentoVO = new TipoSalidaEnviarDocumentoVO();
		ltsed_tipoSalidaEnviarDocumentoVO.setIs_dId(atsed_tipoSalidaEnviarDocumento.getDID());
		ltsed_tipoSalidaEnviarDocumentoVO.setIs_docName(atsed_tipoSalidaEnviarDocumento.getDocName());
		ltsed_tipoSalidaEnviarDocumentoVO.setIbi_codigoMensaje(atsed_tipoSalidaEnviarDocumento.getCodigoMensaje());
		ltsed_tipoSalidaEnviarDocumentoVO
				.setIs_descripcionMensaje(atsed_tipoSalidaEnviarDocumento.getDescripcionMensaje());
		return ltsed_tipoSalidaEnviarDocumentoVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaEnviarDocumentoVO <b>a</b>
	 * TipoEntradaEnviarDocumento, <br>
	 * En otras palabras, <b>de</b> Tipo entrada enviar documento objeto con valores
	 * de servicio <b>a</b> Tipo entrada enviar documento (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateed_tipoEntradaEnviarDocumentoVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaEnviarDocumento.
	 */
	public static TipoEntradaEnviarDocumento voATipo(TipoEntradaEnviarDocumentoVO ateed_tipoEntradaEnviarDocumentoVO) {
		TipoEntradaEnviarDocumento lteed_tipoEntradaEnviarDocumento = new TipoEntradaEnviarDocumento();
		lteed_tipoEntradaEnviarDocumento.setRepositorio(ateed_tipoEntradaEnviarDocumentoVO.getIs_repositorio());
		lteed_tipoEntradaEnviarDocumento.setArchivo(ateed_tipoEntradaEnviarDocumentoVO.getIb_archivo());
		lteed_tipoEntradaEnviarDocumento.setNombreArchivo(ateed_tipoEntradaEnviarDocumentoVO.getIs_nombreArchivo());
		lteed_tipoEntradaEnviarDocumento.setSistemaOrigen(ateed_tipoEntradaEnviarDocumentoVO.getIs_sistemaOrigen());
		Parametros lp_parametros = new Parametros();
		for (TipoParametro ltp_parametro : listaVoAListaTipoTipoParametro(
				ateed_tipoEntradaEnviarDocumentoVO.getIltp_listaTipoParametro())) {
			lp_parametros.getParametro().add(ltp_parametro);
		}
		lteed_tipoEntradaEnviarDocumento.setParametros(lp_parametros);
		return lteed_tipoEntradaEnviarDocumento;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoParametroVO <b>a</b> TipoParametro,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo parametro objeto con valores de servicio
	 * <b>a</b> Tipo parametro (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atp_tipoParametroVo el parametro que representa el objeto con valores
	 *                            de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoParametro.
	 */
	public static TipoParametro voATipoParametro(TipoParametroVO atp_tipoParametroVo) {
		TipoParametro ltp_tipoParametro = new TipoParametro();

		ltp_tipoParametro.setNombre(atp_tipoParametroVo.getIs_nombre());
		ltp_tipoParametro.setValor(atp_tipoParametroVo.getIs_valor());

		return ltp_tipoParametro;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de ComplexType (De lista
	 * de Objeto de valores de Servicio, entrada del cliente bus; a una lista de
	 * elementos especificos del esquema de un Servicio Web, entrada de una peticion
	 * de Servicio SOAP).<br>
	 * Se usa para convertir una lista de objetos con los valores de entrada de un
	 * servicio web (objetos VO) a una lista de objetos ComplexType para ser
	 * enviados en una operacion de un servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoParametroVO <b>a</b> una
	 * TipoParametro, <br>
	 * En otras palabras, <b>de</b> una Tipo parametro objeto con valores de
	 * servicio <b>a</b> una Tipo parametro (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param altp_listaTipoParametroVo el parametro que representa la lista de
	 *                                  objetos con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         TipoParametro.
	 */
	public static List<TipoParametro> listaVoAListaTipoTipoParametro(List<TipoParametroVO> altp_listaTipoParametroVo) {
		List<TipoParametro> lltp_listaTipoParametro = new ArrayList<>();
		for (TipoParametroVO ltp_tipoParametroVo : altp_listaTipoParametroVo) {
			lltp_listaTipoParametro.add(voATipoParametro(ltp_tipoParametroVo));
		}
		return lltp_listaTipoParametro;
	}
}
