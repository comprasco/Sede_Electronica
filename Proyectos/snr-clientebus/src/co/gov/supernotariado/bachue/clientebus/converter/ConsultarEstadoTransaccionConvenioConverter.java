/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEstadoTransaccionConvenioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarEstadoTransaccionConvenioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadotransaccionconvenio.RespuestaConsultarEstadoTransaccionConvenio;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio.RespuestaConsultarEstadoTransaccionConvenioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * estado transaccion convenio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoTransaccionConvenioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEstadoTransaccionConvenioConverter.
	 */
	public ConsultarEstadoTransaccionConvenioConverter() {
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
	 * Especificamente convierte <b>de</b>
	 * RespuestaConsultarEstadoTransaccionConvenio <b>a</b>
	 * RespuestaConsultarEstadoTransaccionConvenioVO, <br>
	 * En otras palabras, <b>de</b> Respuesta consultar estado transaccion convenio
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Respuesta consultar estado transaccion convenio objeto con valores de
	 * servicio.
	 *
	 * @param arcetc_respuestaConsultarEstadoTransaccionConvenio el parametro que
	 *                                                           representa el
	 *                                                           complex type a
	 *                                                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         RespuestaConsultarEstadoTransaccionConvenioVO.
	 */
	public static RespuestaConsultarEstadoTransaccionConvenioVO tipoAVo(
			RespuestaConsultarEstadoTransaccionConvenio arcetc_respuestaConsultarEstadoTransaccionConvenio) {

		RespuestaConsultarEstadoTransaccionConvenioVO arcetc_respuestaConsultaEstadoTransaccionConvenio = new RespuestaConsultarEstadoTransaccionConvenioVO();

		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIel_log(EntidadLogConverter.tipoAVo(arcetc_respuestaConsultarEstadoTransaccionConvenio.getLog()));
		arcetc_respuestaConsultaEstadoTransaccionConvenio.setIs_codigoTransaccion(
				arcetc_respuestaConsultarEstadoTransaccionConvenio.getCodigoTransaccion().toString());
		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIs_estado(arcetc_respuestaConsultarEstadoTransaccionConvenio.getEstado());
		arcetc_respuestaConsultaEstadoTransaccionConvenio.getIs_estadoTransaccion();
		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIs_fechaFinGeneracion(arcetc_respuestaConsultarEstadoTransaccionConvenio.getFechaFinGeneracion());
		arcetc_respuestaConsultaEstadoTransaccionConvenio.setIs_fechaInicioGeneracion(
				arcetc_respuestaConsultarEstadoTransaccionConvenio.getFechaInicioGeneracion());
		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIs_fechaTransaccion(arcetc_respuestaConsultarEstadoTransaccionConvenio.getFechaTransaccion());
		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIs_matricula(arcetc_respuestaConsultarEstadoTransaccionConvenio.getMatricula());
		arcetc_respuestaConsultaEstadoTransaccionConvenio
				.setIs_oficina(arcetc_respuestaConsultarEstadoTransaccionConvenio.getOficina());

		return arcetc_respuestaConsultaEstadoTransaccionConvenio;
	}

}
