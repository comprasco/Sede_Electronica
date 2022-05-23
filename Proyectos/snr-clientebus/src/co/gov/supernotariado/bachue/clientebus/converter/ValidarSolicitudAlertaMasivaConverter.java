/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ValidarSolicitudAlertaMasivaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ValidarSolicitudAlertaMasivaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertamasiva.TipoEntradaValidarSolicitudAlertaMasiva;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertamasiva.TipoSalidaValidarSolicitudAlertaMasiva;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaMasivaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Validar
 * solicitud alerta masiva. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValidarSolicitudAlertaMasivaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ValidarSolicitudAlertaMasivaConverter.
	 */
	private ValidarSolicitudAlertaMasivaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaValidarSolicitudAlertaMasiva
	 * <b>a</b> TipoSalidaValidarSolicitudAlertaMasivaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida validar solicitud alerta masiva
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida validar solicitud alerta masiva objeto con valores de servicio.
	 *
	 * @param atsvsam_tipoSalidaValidarSolicitudAlertaMasiva el parametro que
	 *                                                       representa el complex
	 *                                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaValidarSolicitudAlertaMasivaVO.
	 */
	public static TipoSalidaValidarSolicitudAlertaMasivaVO tipoAVo(
			TipoSalidaValidarSolicitudAlertaMasiva atsvsam_tipoSalidaValidarSolicitudAlertaMasiva) {
		TipoSalidaValidarSolicitudAlertaMasivaVO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVO = new TipoSalidaValidarSolicitudAlertaMasivaVO();
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVO
				.setIb_archivo(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getArchivo());
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVO
				.setIs_codigoMensaje(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getCodigoMensaje());
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVO
				.setIs_descripcionMensaje(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getDescripcionMensaje());
		return ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaValidarSolicitudAlertaMasivaVO
	 * <b>a</b> TipoEntradaValidarSolicitudAlertaMasiva, <br>
	 * En otras palabras, <b>de</b> Tipo entrada validar solicitud alerta masiva
	 * objeto con valores de servicio <b>a</b> Tipo entrada validar solicitud alerta
	 * masiva (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO el parametro que
	 *                                                          representa el objeto
	 *                                                          con valores de
	 *                                                          servicio a
	 *                                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaValidarSolicitudAlertaMasiva.
	 */
	public static TipoEntradaValidarSolicitudAlertaMasiva voATipo(
			TipoEntradaValidarSolicitudAlertaMasivaVO atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO) {
		TipoEntradaValidarSolicitudAlertaMasiva ltevsam_tipoEntradaValidarSolicitudAlertaMasiva = new TipoEntradaValidarSolicitudAlertaMasiva();
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setTipoDocumento(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_tipoDocumento());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setNumeroDocumento(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_numeroDocumento());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setPrimerNombre(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_primerNombre());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setSegundoNombre(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_segundoNombre());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setPrimerApellido(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_primerApellido());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setSegundoApellido(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_segundoApellido());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setRazonSocial(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_razonSocial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setOripSecuencia(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_oripSecuencia());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setArchivo(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIb_archivo());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setMatriculaInicial(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_matriculaInicial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setMatriculaFinal(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_matriculaFinal());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setModulo(atevsam_tipoEntradaValidarSolicitudAlertaMasivaVO.getIs_modulo());
		return ltevsam_tipoEntradaValidarSolicitudAlertaMasiva;
	}
}
