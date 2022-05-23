/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ValidarSolicitudAlertaIndividualConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ValidarSolicitudAlertaIndividualConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertaindividual.TipoEntradaValidarSolicitudAlertaIndividual;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertaindividual.TipoSalidaValidarSolicitudAlertaIndividual;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaIndividualVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Validar
 * solicitud alerta individual. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValidarSolicitudAlertaIndividualConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ValidarSolicitudAlertaIndividualConverter.
	 */
	private ValidarSolicitudAlertaIndividualConverter() {
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
	 * TipoSalidaValidarSolicitudAlertaIndividual <b>a</b>
	 * TipoSalidaValidarSolicitudAlertaIndividualVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida validar solicitud alerta individual
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida validar solicitud alerta individual objeto con valores de servicio.
	 *
	 * @param atsvsai_tipoSalidaValidarSolicitudAlertaIndividual el parametro que
	 *                                                           representa el
	 *                                                           complex type a
	 *                                                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaValidarSolicitudAlertaIndividualVO.
	 */
	public static TipoSalidaValidarSolicitudAlertaIndividualVO tipoAVo(
			TipoSalidaValidarSolicitudAlertaIndividual atsvsai_tipoSalidaValidarSolicitudAlertaIndividual) {
		TipoSalidaValidarSolicitudAlertaIndividualVO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO = new TipoSalidaValidarSolicitudAlertaIndividualVO();
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO
				.setIs_codigoMensaje(atsvsai_tipoSalidaValidarSolicitudAlertaIndividual.getCodigoMensaje());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO
				.setIs_descripcionMensaje(atsvsai_tipoSalidaValidarSolicitudAlertaIndividual.getDescripcionMensaje());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO
				.setIs_ciudad(atsvsai_tipoSalidaValidarSolicitudAlertaIndividual.getCiudad());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO
				.setIs_departamento(atsvsai_tipoSalidaValidarSolicitudAlertaIndividual.getDepartamento());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO
				.setIs_direccion(atsvsai_tipoSalidaValidarSolicitudAlertaIndividual.getDireccion());
		return ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVO;
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
	 * TipoEntradaValidarSolicitudAlertaIndividualVO <b>a</b>
	 * TipoEntradaValidarSolicitudAlertaIndividual, <br>
	 * En otras palabras, <b>de</b> Tipo entrada validar solicitud alerta individual
	 * objeto con valores de servicio <b>a</b> Tipo entrada validar solicitud alerta
	 * individual (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO el parametro que
	 *                                                              representa el
	 *                                                              objeto con
	 *                                                              valores de
	 *                                                              servicio a
	 *                                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaValidarSolicitudAlertaIndividual.
	 */
	public static TipoEntradaValidarSolicitudAlertaIndividual voATipo(
			TipoEntradaValidarSolicitudAlertaIndividualVO atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO) {
		TipoEntradaValidarSolicitudAlertaIndividual ltevsai_tipoEntradaValidarSolicitudAlertaIndividual = new TipoEntradaValidarSolicitudAlertaIndividual();
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setModulo(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_modulo());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setNumeroDocumento(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_numeroDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setPrimerNombre(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_primerNombre());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setSegundoNombre(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_segundoNombre());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setPrimerApellido(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_primerApellido());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setSegundoApellido(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_segundoApellido());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setRazonSocial(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_razonSocial());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setTipoDocumento(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_tipoDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setOrip(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_orip());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setNumeroMatricula(atevsai_tipoEntradaValidarSolicitudAlertaIndividualVO.getIs_numeroMatricula());
		return ltevsai_tipoEntradaValidarSolicitudAlertaIndividual;
	}
}
