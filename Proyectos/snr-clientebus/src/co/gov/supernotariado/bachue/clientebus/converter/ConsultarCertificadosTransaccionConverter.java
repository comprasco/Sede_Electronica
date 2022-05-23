/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarCertificadosTransaccionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarCertificadosTransaccionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarcertificadostransaccion.EntidadConsultarCertificado;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccion;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * certificados transaccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarCertificadosTransaccionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarCertificadosTransaccionConverter.
	 */
	private ConsultarCertificadosTransaccionConverter() {
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
	 * Especificamente convierte <b>de</b> EntidadConsultarCertificadosTransaccion
	 * <b>a</b> EntidadConsultarCertificadosTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Entidad consultar certificados transaccion
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b>
	 * Entidad consultar certificados transaccion objeto con valores de servicio.
	 *
	 * @param aecct_consultarCertificadosTransaccion el parametro que representa el
	 *                                               complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         EntidadConsultarCertificadosTransaccionVO.
	 */
	public static EntidadConsultarCertificadosTransaccionVO tipoAVo(
			EntidadConsultarCertificadosTransaccion aecct_consultarCertificadosTransaccion) {
		EntidadConsultarCertificadosTransaccionVO lecct_respuesta = new EntidadConsultarCertificadosTransaccionVO();

		lecct_respuesta.setIel_log(EntidadLogConverter.tipoAVo(aecct_consultarCertificadosTransaccion.getLog()));
		lecct_respuesta
				.setIlecc_certificados(listaTipoAListaVo(aecct_consultarCertificadosTransaccion.getCertificados()));
		lecct_respuesta.setIs_estado(aecct_consultarCertificadosTransaccion.getEstado());

		return lecct_respuesta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntidadConsultarCertificado <b>a</b>
	 * EntidadConsultarCertificadoVO, <br>
	 * En otras palabras, <b>de</b> Entidad consultar certificado (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Entidad consultar
	 * certificado objeto con valores de servicio.
	 *
	 * @param aecc_consultarCertificadosTransaccion el parametro que representa el
	 *                                              complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como EntidadConsultarCertificadoVO.
	 */
	public static EntidadConsultarCertificadoVO tipoAVo(
			EntidadConsultarCertificado aecc_consultarCertificadosTransaccion) {

		EntidadConsultarCertificadoVO lecc_respuesta = new EntidadConsultarCertificadoVO();

		lecc_respuesta.setIb_archivo(aecc_consultarCertificadosTransaccion.getArchivo());
		lecc_respuesta.setIs_circulo(aecc_consultarCertificadosTransaccion.getCirculo());
		lecc_respuesta.setIs_estado(aecc_consultarCertificadosTransaccion.getEstado());
		lecc_respuesta.setIel_log(EntidadLogConverter.tipoAVo(aecc_consultarCertificadosTransaccion.getLog()));
		lecc_respuesta.setIs_matricula(aecc_consultarCertificadosTransaccion.getMatricula());
		lecc_respuesta.setIi_numeroPaginas(aecc_consultarCertificadosTransaccion.getNumeroPaginas());
		lecc_respuesta.setIs_pin(aecc_consultarCertificadosTransaccion.getPin());
		lecc_respuesta.setIs_turno(aecc_consultarCertificadosTransaccion.getTurno());

		return lecc_respuesta;
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
	 * Especificamente convierte <b>de</b> EntidadConsultarCertificado <b>a</b>
	 * EntidadConsultarCertificadoVO, <br>
	 * En otras palabras, <b>de</b> Entidad consultar certificado (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Entidad consultar
	 * certificado objeto con valores de servicio.
	 *
	 * @param alecc_listaEntidadCertificados el parametro que representa la lista de
	 *                                       complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         EntidadConsultarCertificadoVO.
	 */
	public static List<EntidadConsultarCertificadoVO> listaTipoAListaVo(
			List<EntidadConsultarCertificado> alecc_listaEntidadCertificados) {
		List<EntidadConsultarCertificadoVO> llecc_entidadConsultaCertificadoVO = new ArrayList<>();

		for (EntidadConsultarCertificado lecc_listaEntidadCertificados : alecc_listaEntidadCertificados)
			llecc_entidadConsultaCertificadoVO.add(tipoAVo(lecc_listaEntidadCertificados));

		return llecc_entidadConsultaCertificadoVO;

	}

}
