/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionExtendidaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: GenerarTransaccionExtendidaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccion.EntidadMatricula;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.GenerarTransaccionExtendida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.GenerarTransaccionExtendidaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.RespuestaGenerarTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.EntidadMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.GenerarTransaccionExtendidaResponseVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.GenerarTransaccionExtendidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.RespuestaGenerarTransaccionVO;
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
 * transaccion extendida. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionExtendidaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * GenerarTransaccionExtendidaConverter.
	 */
	private GenerarTransaccionExtendidaConverter() {
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
	 * Especificamente convierte <b>de</b> GenerarTransaccionExtendidaVO <b>a</b>
	 * GenerarTransaccionExtendida, <br>
	 * En otras palabras, <b>de</b> Generar transaccion extendida objeto con valores
	 * de servicio <b>a</b> Generar transaccion extendida (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param agte_generarTransaccionExtendidaVo el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como GenerarTransaccionExtendida.
	 */
	public static GenerarTransaccionExtendida voATipo(
			GenerarTransaccionExtendidaVO agte_generarTransaccionExtendidaVo) {
		GenerarTransaccionExtendida lgte_generarTransaccionExtendida = new GenerarTransaccionExtendida();
		lgte_generarTransaccionExtendida.setUsuarioWS(agte_generarTransaccionExtendidaVo.getIs_usuarioWS());
		lgte_generarTransaccionExtendida.setClaveWS(agte_generarTransaccionExtendidaVo.getIs_claveWS());
		lgte_generarTransaccionExtendida.setCodigoConvenio(agte_generarTransaccionExtendidaVo.getIs_codigoConvenio());
		lgte_generarTransaccionExtendida.setCodigoServicio(agte_generarTransaccionExtendidaVo.getIs_codigoServicio());
		lgte_generarTransaccionExtendida
				.setCodigoSeguimiento(agte_generarTransaccionExtendidaVo.getIs_codigoSeguimiento());
		lgte_generarTransaccionExtendida.setMatriculas(
				listaEntidadVoAListaEntidadTipo(agte_generarTransaccionExtendidaVo.getIlem_matriculas()));
		return lgte_generarTransaccionExtendida;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntidadMatriculaVO <b>a</b>
	 * EntidadMatricula, <br>
	 * En otras palabras, <b>de</b> Entidad matricula objeto con valores de servicio
	 * <b>a</b> Entidad matricula (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param aem_entidadMatriculaVo el parametro que representa el objeto con
	 *                               valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como EntidadMatricula.
	 */
	public static EntidadMatricula entidadVoAEntidadTipo(EntidadMatriculaVO aem_entidadMatriculaVo) {
		EntidadMatricula lem_entidadMatricula = new EntidadMatricula();
		lem_entidadMatricula.setCodigoCirculo(aem_entidadMatriculaVo.getIs_codigoCirculo());
		lem_entidadMatricula.setNumeroMatricula(aem_entidadMatriculaVo.getIs_numeroMatricula());
		return lem_entidadMatricula;
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
	 * Especificamente convierte <b>de</b> una EntidadMatriculaVO <b>a</b> una
	 * EntidadMatricula, <br>
	 * En otras palabras, <b>de</b> una Entidad matricula objeto con valores de
	 * servicio <b>a</b> una Entidad matricula (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param alem_listaEntidadMatriculaVo el parametro que representa la lista de
	 *                                     objetos con valores de servicio a
	 *                                     convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         EntidadMatricula.
	 */
	public static List<EntidadMatricula> listaEntidadVoAListaEntidadTipo(
			List<EntidadMatriculaVO> alem_listaEntidadMatriculaVo) {
		List<EntidadMatricula> llem_listaEntidadMatricula = new ArrayList<>();
		for (EntidadMatriculaVO lem_entidadMatriculaVo : alem_listaEntidadMatriculaVo) {
			llem_listaEntidadMatricula.add(entidadVoAEntidadTipo(lem_entidadMatriculaVo));
		}
		return llem_listaEntidadMatricula;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> GenerarTransaccionExtendidaResponse
	 * <b>a</b> GenerarTransaccionExtendidaResponseVO, <br>
	 * En otras palabras, <b>de</b> Generar transaccion extendida response
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Generar transaccion extendida response objeto con valores de servicio.
	 *
	 * @param agter_generarTransaccionExtendidaResponse el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como GenerarTransaccionExtendidaResponseVO.
	 */
	public static GenerarTransaccionExtendidaResponseVO tipoAVo(
			GenerarTransaccionExtendidaResponse agter_generarTransaccionExtendidaResponse) {
		GenerarTransaccionExtendidaResponseVO lgter_generarTransaccionExtendidaResponseVo = new GenerarTransaccionExtendidaResponseVO();
		lgter_generarTransaccionExtendidaResponseVo.setIrgt_respuestaGenerarTransaccionVo(
				respuestaTipoARespuestaVo(agter_generarTransaccionExtendidaResponse.getReturn()));
		return lgter_generarTransaccionExtendidaResponseVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> RespuestaGenerarTransaccion <b>a</b>
	 * RespuestaGenerarTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Respuesta generar transaccion (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Respuesta generar
	 * transaccion objeto con valores de servicio.
	 *
	 * @param argt_respuestaGenerarTransaccion el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaGenerarTransaccionVO.
	 */
	public static RespuestaGenerarTransaccionVO respuestaTipoARespuestaVo(
			RespuestaGenerarTransaccion argt_respuestaGenerarTransaccion) {
		RespuestaGenerarTransaccionVO lrgt_respuestaGenerarTransaccionVo = new RespuestaGenerarTransaccionVO();
		lrgt_respuestaGenerarTransaccionVo
				.setIl_codigoTransaccion(argt_respuestaGenerarTransaccion.getCodigoTransaccion());
		lrgt_respuestaGenerarTransaccionVo.setIs_estado(argt_respuestaGenerarTransaccion.getEstado());
		lrgt_respuestaGenerarTransaccionVo
				.setIel_entidadLogVo(logTipoALogVo(argt_respuestaGenerarTransaccion.getLog()));
		return lrgt_respuestaGenerarTransaccionVo;
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
