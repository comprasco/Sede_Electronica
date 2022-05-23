/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMatriculaInfoCatastralConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMatriculaInfoCatastralConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoEntradaConsultarMatriculaInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoSalidaConsultarMatriculaICatastral;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaInfoCatastralVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * matricula info catastral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaInfoCatastralConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaInfoCatastralConverter.
	 */
	private ConsultarMatriculaInfoCatastralConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultarMatriculaInfoCatastralVO <b>a</b>
	 * TipoEntradaConsultarMatriculaInfoCatastral, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula info catastral
	 * objeto con valores de servicio <b>a</b> Tipo entrada consultar matricula info
	 * catastral (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecmic_tipoEntradaConsultarMatriculaInfoCatastralVo el parametro que
	 *                                                             representa el
	 *                                                             objeto con
	 *                                                             valores de
	 *                                                             servicio a
	 *                                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarMatriculaInfoCatastral.
	 */
	public static TipoEntradaConsultarMatriculaInfoCatastral voATipo(
			TipoEntradaConsultarMatriculaInfoCatastralVO atecmic_tipoEntradaConsultarMatriculaInfoCatastralVo) {
		TipoEntradaConsultarMatriculaInfoCatastral ltecmic_tipoEntradaConsultarMatriculaInfoCatastral = new TipoEntradaConsultarMatriculaInfoCatastral();
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastral
				.setCHIP(atecmic_tipoEntradaConsultarMatriculaInfoCatastralVo.getIi_chip().toString());
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastral
				.setNumPredial(atecmic_tipoEntradaConsultarMatriculaInfoCatastralVo.getIi_numPredial().toString());
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastral
				.setNUPRE(atecmic_tipoEntradaConsultarMatriculaInfoCatastralVo.getIs_nupre());
		return ltecmic_tipoEntradaConsultarMatriculaInfoCatastral;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMatriculaICatastral
	 * <b>a</b> TipoSalidaConsultarMatriculaInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula I catastral
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar matricula info catastral objeto con valores de servicio.
	 *
	 * @param atscmic_tipoSalidaConsultarMatriculaICatastral el parametro que
	 *                                                       representa el complex
	 *                                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaConsultarMatriculaInfoCatastralVO.
	 */
	public static TipoSalidaConsultarMatriculaInfoCatastralVO tipoAVo(
			TipoSalidaConsultarMatriculaICatastral atscmic_tipoSalidaConsultarMatriculaICatastral) {
		TipoSalidaConsultarMatriculaInfoCatastralVO ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo = new TipoSalidaConsultarMatriculaInfoCatastralVO();
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo
				.setIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo(
						ListaMatriculasConsultarMatriculaInfoCatastralConverter.listaTipoAlistaVo(
								atscmic_tipoSalidaConsultarMatriculaICatastral.getListaMatriculas().getMatricula()));
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo
				.setIs_codigo(atscmic_tipoSalidaConsultarMatriculaICatastral.getCodigo());
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo
				.setIs_mensaje(atscmic_tipoSalidaConsultarMatriculaICatastral.getMensaje());
		return ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo;
	}
}
