/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarInformacionMatriculaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarInformacionMatriculaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarInformacionmatricula.RespuestaConsultarInformacionMatricula;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula.RespuestaConsultarInformacionMatriculaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * informacion matricula. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarInformacionMatriculaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarInformacionMatriculaConverter.
	 */
	private ConsultarInformacionMatriculaConverter() {
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
	 * Especificamente convierte <b>de</b> RespuestaConsultarInformacionMatricula
	 * <b>a</b> RespuestaConsultarInformacionMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Respuesta consultar informacion matricula
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Respuesta consultar informacion matricula objeto con valores de servicio.
	 *
	 * @param arcim_respuestaConsultarMatricula el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaConsultarInformacionMatriculaVO.
	 */
	public static RespuestaConsultarInformacionMatriculaVO tipoAVo(
			RespuestaConsultarInformacionMatricula arcim_respuestaConsultarMatricula) {
		RespuestaConsultarInformacionMatriculaVO lrcim_respuestaConsultaInformacionMatricula = new RespuestaConsultarInformacionMatriculaVO();

		lrcim_respuestaConsultaInformacionMatricula.setIs_direccion(arcim_respuestaConsultarMatricula.getDireccion());
		lrcim_respuestaConsultaInformacionMatricula.setIs_estado(arcim_respuestaConsultarMatricula.getEstado());
		lrcim_respuestaConsultaInformacionMatricula
				.setIs_estadoGeneracion(arcim_respuestaConsultarMatricula.getEstadoGeneracion());
		lrcim_respuestaConsultaInformacionMatricula
				.setIel_log(EntidadLogConverter.tipoAVo(arcim_respuestaConsultarMatricula.getLog()));

		return lrcim_respuestaConsultaInformacionMatricula;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> RespuestaConsultarInformacionMatricula
	 * <b>a</b> RespuestaConsultarInformacionMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Respuesta consultar informacion matricula
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Respuesta consultar informacion matricula objeto con valores de servicio.
	 *
	 * @param alrcim_respuestaInformacionMatricula el parametro que representa la
	 *                                             lista de complex types a
	 *                                             convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         RespuestaConsultarInformacionMatriculaVO.
	 */
	public static List<RespuestaConsultarInformacionMatriculaVO> listaTipoAListaVo(
			List<RespuestaConsultarInformacionMatricula> alrcim_respuestaInformacionMatricula) {
		List<RespuestaConsultarInformacionMatriculaVO> llrcim_respuestaConsutarInformacionMatricula = new ArrayList<>();

		for (RespuestaConsultarInformacionMatricula lrcim_respuestaConsultarInformacionMatriculaVO : alrcim_respuestaInformacionMatricula)
			llrcim_respuestaConsutarInformacionMatricula.add(tipoAVo(lrcim_respuestaConsultarInformacionMatriculaVO));

		return llrcim_respuestaConsutarInformacionMatricula;
	}
}
