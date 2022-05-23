/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionConsultaExtendidaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: GenerarTransaccionConsultaExtendidaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;
/**
* 
* @version 1.0
* @author Smartsoft Solutions S.A.S 
* Nota: Converter servicio a Vo
*/

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsulta.RespuestaGenerarTransaccionConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendidaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendidaResponseVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida.RespuestaGenerarTransaccionConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Generar
 * transaccion consulta extendida. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionConsultaExtendidaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * GenerarTransaccionConsultaExtendidaConverter.
	 */
	private GenerarTransaccionConsultaExtendidaConverter() {
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
	 * Especificamente convierte <b>de</b> GenerarTransaccionConsultaExtendidaVO
	 * <b>a</b> GenerarTransaccionConsultaExtendida, <br>
	 * En otras palabras, <b>de</b> Generar transaccion consulta extendida objeto
	 * con valores de servicio <b>a</b> Generar transaccion consulta extendida
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param agtce_generarTransaccionConsultaExtendidaVo el parametro que
	 *                                                    representa el objeto con
	 *                                                    valores de servicio a
	 *                                                    convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como GenerarTransaccionConsultaExtendida.
	 */
	public static GenerarTransaccionConsultaExtendida voATipo(
			GenerarTransaccionConsultaExtendidaVO agtce_generarTransaccionConsultaExtendidaVo) {
		GenerarTransaccionConsultaExtendida lgtce_generarTransaccionConsultaExtendida = new GenerarTransaccionConsultaExtendida();
		lgtce_generarTransaccionConsultaExtendida
				.setUsuarioWS(agtce_generarTransaccionConsultaExtendidaVo.getIs_usuarioWS());
		lgtce_generarTransaccionConsultaExtendida
				.setClaveWS(agtce_generarTransaccionConsultaExtendidaVo.getIs_claveWS());
		lgtce_generarTransaccionConsultaExtendida
				.setCodigoConvenio(agtce_generarTransaccionConsultaExtendidaVo.getIs_codigoConvenio());
		lgtce_generarTransaccionConsultaExtendida
				.setCodigoServicio(agtce_generarTransaccionConsultaExtendidaVo.getIs_codigoServicio());
		lgtce_generarTransaccionConsultaExtendida
				.setCodigoSeguimiento(agtce_generarTransaccionConsultaExtendidaVo.getIs_codigoSeguimiento());
		lgtce_generarTransaccionConsultaExtendida
				.setTipoDocumento(agtce_generarTransaccionConsultaExtendidaVo.getIs_tipoDocumento());
		lgtce_generarTransaccionConsultaExtendida
				.setNumeroDocumento(agtce_generarTransaccionConsultaExtendidaVo.getIs_numeroDocumento());
		lgtce_generarTransaccionConsultaExtendida
				.setUsaNombres(agtce_generarTransaccionConsultaExtendidaVo.isIb_usaNombres());
		lgtce_generarTransaccionConsultaExtendida
				.setPrimerNombre(agtce_generarTransaccionConsultaExtendidaVo.getIs_primerNombre());
		lgtce_generarTransaccionConsultaExtendida
				.setSegundoNombre(agtce_generarTransaccionConsultaExtendidaVo.getIs_segundoNombre());
		lgtce_generarTransaccionConsultaExtendida
				.setPrimerApellido(agtce_generarTransaccionConsultaExtendidaVo.getIs_primerApellido());
		lgtce_generarTransaccionConsultaExtendida
				.setSegundoApellido(agtce_generarTransaccionConsultaExtendidaVo.getIs_segundoApellido());
		lgtce_generarTransaccionConsultaExtendida
				.setRazonSocial(agtce_generarTransaccionConsultaExtendidaVo.getIs_razonSocial());
		lgtce_generarTransaccionConsultaExtendida
				.setUsaMatricula(agtce_generarTransaccionConsultaExtendidaVo.isIb_usaMatricula());
		lgtce_generarTransaccionConsultaExtendida
				.setMatriculaCatastral(agtce_generarTransaccionConsultaExtendidaVo.getIs_matriculaCatastral());
		return lgtce_generarTransaccionConsultaExtendida;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * GenerarTransaccionConsultaExtendidaResponse <b>a</b>
	 * GenerarTransaccionConsultaExtendidaResponseVO, <br>
	 * En otras palabras, <b>de</b> Generar transaccion consulta extendida response
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Generar transaccion consulta extendida response objeto con valores de
	 * servicio.
	 *
	 * @param agtce_generarTransaccionConsultaExtendidaResponse el parametro que
	 *                                                          representa el
	 *                                                          complex type a
	 *                                                          convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         GenerarTransaccionConsultaExtendidaResponseVO.
	 */
	public static GenerarTransaccionConsultaExtendidaResponseVO tipoAVo(
			GenerarTransaccionConsultaExtendidaResponse agtce_generarTransaccionConsultaExtendidaResponse) {
		GenerarTransaccionConsultaExtendidaResponseVO lgtce_generarTransaccionConsultaExtendidaResponseVo = new GenerarTransaccionConsultaExtendidaResponseVO();
		lgtce_generarTransaccionConsultaExtendidaResponseVo.setIrgtc_respuestaGenerarTransaccionConsultaVo(
				respuestaTipoARespuestaVo(agtce_generarTransaccionConsultaExtendidaResponse.getReturn()));
		return lgtce_generarTransaccionConsultaExtendidaResponseVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> RespuestaGenerarTransaccionConsulta
	 * <b>a</b> RespuestaGenerarTransaccionConsultaVO, <br>
	 * En otras palabras, <b>de</b> Respuesta generar transaccion consulta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Respuesta generar transaccion consulta objeto con valores de servicio.
	 *
	 * @param argtc_respuestaGenerarTransaccionConsulta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaGenerarTransaccionConsultaVO.
	 */
	public static RespuestaGenerarTransaccionConsultaVO respuestaTipoARespuestaVo(
			RespuestaGenerarTransaccionConsulta argtc_respuestaGenerarTransaccionConsulta) {
		RespuestaGenerarTransaccionConsultaVO lrgtc_respuestaGenerarTransaccionConsultaVo = new RespuestaGenerarTransaccionConsultaVO();
		lrgtc_respuestaGenerarTransaccionConsultaVo
				.setIl_codigoTransaccion(argtc_respuestaGenerarTransaccionConsulta.getCodigoTransaccion());
		lrgtc_respuestaGenerarTransaccionConsultaVo.setIs_estado(argtc_respuestaGenerarTransaccionConsulta.getEstado());
		lrgtc_respuestaGenerarTransaccionConsultaVo
				.setIel_log(logTipoALogVo(argtc_respuestaGenerarTransaccionConsulta.getLog()));
		lrgtc_respuestaGenerarTransaccionConsultaVo
				.setIs_numeroDocumento(argtc_respuestaGenerarTransaccionConsulta.getNumeroDocumento());
		lrgtc_respuestaGenerarTransaccionConsultaVo
				.setIs_tipoDocumento(argtc_respuestaGenerarTransaccionConsulta.getTipoDocumento());
		return lrgtc_respuestaGenerarTransaccionConsultaVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntidadLog <b>a</b> EntidadLogVO, <br>
	 * En otras palabras, <b>de</b> Entidad log (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Entidad log objeto con valores de
	 * servicio.
	 *
	 * @param ael_entidadLog el parametro que representa el complex type a
	 *                       convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como EntidadLogVO.
	 */
	public static EntidadLogVO logTipoALogVo(EntidadLog ael_entidadLog) {
		EntidadLogVO lel_entidadLogVo = new EntidadLogVO();
		lel_entidadLogVo.setIs_codigo(ael_entidadLog.getCodigo());
		lel_entidadLogVo.setId_fecha(UtilidadFecha.cambioGregorianADate(ael_entidadLog.getFecha()));
		lel_entidadLogVo.setIs_mensaje(ael_entidadLog.getMensaje());
		lel_entidadLogVo.setIs_mensajeTecnico(ael_entidadLog.getMensajeTecnico());
		lel_entidadLogVo.setIs_tipo(ael_entidadLog.getTipo());
		return lel_entidadLogVo;
	}
}
