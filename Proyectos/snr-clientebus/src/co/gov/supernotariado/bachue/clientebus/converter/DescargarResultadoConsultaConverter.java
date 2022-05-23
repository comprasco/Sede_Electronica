/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DescargarResultadoConsultaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: DescargarResultadoConsultaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.DescargarResultadoConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.DescargarResultadoConsultaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.RespuestaDescargarResultadoConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta.DescargarResultadoConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta.RespuestaDescargarResultadoConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Descargar
 * resultado consulta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DescargarResultadoConsultaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * DescargarResultadoConsultaConverter.
	 */
	private DescargarResultadoConsultaConverter() {
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
	 * Especificamente convierte <b>de</b> DescargarResultadoConsultaVO <b>a</b>
	 * DescargarResultadoConsulta, <br>
	 * En otras palabras, <b>de</b> Descargar resultado consulta objeto con valores
	 * de servicio <b>a</b> Descargar resultado consulta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param adrc_descargarResultadoConsultaVo el parametro que representa el
	 *                                          objeto con valores de servicio a
	 *                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como DescargarResultadoConsulta.
	 */
	public static DescargarResultadoConsulta voATipo(DescargarResultadoConsultaVO adrc_descargarResultadoConsultaVo) {
		DescargarResultadoConsulta ldrc_descargarResultadoConsulta = new DescargarResultadoConsulta();

		ldrc_descargarResultadoConsulta.setUsuarioWS(adrc_descargarResultadoConsultaVo.getIs_usuarioWS());
		ldrc_descargarResultadoConsulta.setClaveWS(adrc_descargarResultadoConsultaVo.getIs_claveWS());
		ldrc_descargarResultadoConsulta.setCodigoConvenio(adrc_descargarResultadoConsultaVo.getIs_codigoConvenio());
		ldrc_descargarResultadoConsulta.setCodigoServicio(adrc_descargarResultadoConsultaVo.getIs_codigoServicio());
		ldrc_descargarResultadoConsulta
				.setCodigoTransaccion(adrc_descargarResultadoConsultaVo.getIl_codigoTransaccion());
		ldrc_descargarResultadoConsulta.setTipoRespuesta(adrc_descargarResultadoConsultaVo.getIs_tipoRespuesta());

		return ldrc_descargarResultadoConsulta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> DescargarResultadoConsultaResponse
	 * <b>a</b> DescargarResultadoConsultaResponseVO, <br>
	 * En otras palabras, <b>de</b> Descargar resultado consulta response
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Descargar resultado consulta response objeto con valores de servicio.
	 *
	 * @param adrcr_descargarResultadoConsultaResponse el parametro que representa
	 *                                                 el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaDescargarResultadoConsultaVO.
	 */
	public static RespuestaDescargarResultadoConsultaVO tipoAVo(DescargarResultadoConsultaResponse adrcr_descargarResultadoConsultaResponse)
	{
		return respuestaTipoARespuestaVo(adrcr_descargarResultadoConsultaResponse.getReturn());
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> RespuestaDescargarResultadoConsulta
	 * <b>a</b> RespuestaDescargarResultadoConsultaVO, <br>
	 * En otras palabras, <b>de</b> Respuesta descargar resultado consulta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Respuesta descargar resultado consulta objeto con valores de servicio.
	 *
	 * @param ardrc_respuestaDescargarResultadoConsulta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaDescargarResultadoConsultaVO.
	 */
	public static RespuestaDescargarResultadoConsultaVO respuestaTipoARespuestaVo(
			RespuestaDescargarResultadoConsulta ardrc_respuestaDescargarResultadoConsulta) {
		RespuestaDescargarResultadoConsultaVO lrdrc_respuestaDescargarResultadoConsultaVo = new RespuestaDescargarResultadoConsultaVO();
		lrdrc_respuestaDescargarResultadoConsultaVo
				.setIb_archivo(ardrc_respuestaDescargarResultadoConsulta.getArchivo());
		lrdrc_respuestaDescargarResultadoConsultaVo
				.setIi_cantidadHojas(ardrc_respuestaDescargarResultadoConsulta.getCantidadHojas());
		lrdrc_respuestaDescargarResultadoConsultaVo
				.setIl_codigoTransaccion(ardrc_respuestaDescargarResultadoConsulta.getCodigoTransaccion());
		lrdrc_respuestaDescargarResultadoConsultaVo.setIs_estado(ardrc_respuestaDescargarResultadoConsulta.getEstado());
		lrdrc_respuestaDescargarResultadoConsultaVo
				.setIel_log(logTipoALogVo(ardrc_respuestaDescargarResultadoConsulta.getLog()));
		lrdrc_respuestaDescargarResultadoConsultaVo.setIs_pin(ardrc_respuestaDescargarResultadoConsulta.getPin());
		lrdrc_respuestaDescargarResultadoConsultaVo.setIs_url(ardrc_respuestaDescargarResultadoConsulta.getUrl());
		return lrdrc_respuestaDescargarResultadoConsultaVo;
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
