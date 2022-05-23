/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarTarifaConvenioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarTarifaConvenioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.ConsultarTarifaConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.ConsultarTarifaConvenioResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.RespuestaConsultarTarifaConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.ConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.RespuestaConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * tarifa convenio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarTarifaConvenioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarTarifaConvenioConverter.
	 */
	private ConsultarTarifaConvenioConverter() {
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
	 * Especificamente convierte <b>de</b> ConsultarTarifaConvenioVO <b>a</b>
	 * ConsultarTarifaConvenio, <br>
	 * En otras palabras, <b>de</b> Consultar tarifa convenio objeto con valores de
	 * servicio <b>a</b> Consultar tarifa convenio (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param actc_consultarTarifaConvenioVo el parametro que representa el objeto
	 *                                       con valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como ConsultarTarifaConvenio.
	 */
	public static ConsultarTarifaConvenio voATipo(ConsultarTarifaConvenioVO actc_consultarTarifaConvenioVo) {
		ConsultarTarifaConvenio lctc_consultarTarifaConvenio = new ConsultarTarifaConvenio();
		lctc_consultarTarifaConvenio.setUsuarioWS(actc_consultarTarifaConvenioVo.getIs_usuarioWS());
		lctc_consultarTarifaConvenio.setClaveWS(actc_consultarTarifaConvenioVo.getIs_claveWS());
		lctc_consultarTarifaConvenio.setCodigoConvenio(actc_consultarTarifaConvenioVo.getIs_codigoConvenio());
		lctc_consultarTarifaConvenio.setCodigoServicio(actc_consultarTarifaConvenioVo.getIs_codigoServicio());
		return lctc_consultarTarifaConvenio;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> ConsultarTarifaConvenioResponse <b>a</b>
	 * ConsultarTarifaConvenioResponseVO, <br>
	 * En otras palabras, <b>de</b> Consultar tarifa convenio response (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Consultar tarifa
	 * convenio response objeto con valores de servicio.
	 *
	 * @param actcr_consultarTarifaConvenioResponse el parametro que representa el
	 *                                              complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaConsultarTarifaConvenioVO.
	 */
	public static RespuestaConsultarTarifaConvenioVO tipoAVo(ConsultarTarifaConvenioResponse actcr_consultarTarifaConvenioResponse){
		return respuestaTipoARespuestaVo(actcr_consultarTarifaConvenioResponse.getReturn());		
	}
	
	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> RespuestaConsultarTarifaConvenio <b>a</b>
	 * RespuestaConsultarTarifaConvenioVO, <br>
	 * En otras palabras, <b>de</b> Respuesta consultar tarifa convenio (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Respuesta
	 * consultar tarifa convenio objeto con valores de servicio.
	 *
	 * @param arctc_respuestaConsultarTarifaConvenio el parametro que representa el
	 *                                               complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaConsultarTarifaConvenioVO.
	 */
	public static RespuestaConsultarTarifaConvenioVO respuestaTipoARespuestaVo(
			RespuestaConsultarTarifaConvenio arctc_respuestaConsultarTarifaConvenio) {
		RespuestaConsultarTarifaConvenioVO lrctc_respuestaConsultarTarifaConvenioVo = new RespuestaConsultarTarifaConvenioVO();
		lrctc_respuestaConsultarTarifaConvenioVo.setIs_estado(arctc_respuestaConsultarTarifaConvenio.getEstado());
		lrctc_respuestaConsultarTarifaConvenioVo
				.setIel_log(logTipoALogVo(arctc_respuestaConsultarTarifaConvenio.getLog()));
		lrctc_respuestaConsultarTarifaConvenioVo.setIl_tarifa(arctc_respuestaConsultarTarifaConvenio.getTarifa());
		return lrctc_respuestaConsultarTarifaConvenioVo;
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
