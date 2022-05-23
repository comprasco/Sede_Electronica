/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ActualizarContactoAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ActualizarContactoAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.actualizarcontactoalerta.TipoEntradaActualizarContactoAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.actualizarcontactoalerta.TipoSalidaActualizarContactoAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaActualizarContactoAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Actualizar
 * contacto alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActualizarContactoAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActualizarContactoAlertaConverter.
	 */
	private ActualizarContactoAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaActualizarContactoAlerta
	 * <b>a</b> TipoSalidaActualizarContactoAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida actualizar contacto alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida actualizar contacto alerta objeto con valores de servicio.
	 *
	 * @param atsaca_tipoSalidaActualizarContactoAlerta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaActualizarContactoAlertaVO.
	 */
	public static TipoSalidaActualizarContactoAlertaVO tipoAVo(
			TipoSalidaActualizarContactoAlerta atsaca_tipoSalidaActualizarContactoAlerta) {
		TipoSalidaActualizarContactoAlertaVO ltsaca_tipoSalidaActualizarContactoAlertaVO = new TipoSalidaActualizarContactoAlertaVO();
		ltsaca_tipoSalidaActualizarContactoAlertaVO
				.setIs_codigoMensaje(atsaca_tipoSalidaActualizarContactoAlerta.getCodigoMensaje());
		ltsaca_tipoSalidaActualizarContactoAlertaVO
				.setIs_descripcionMensaje(atsaca_tipoSalidaActualizarContactoAlerta.getDescripcionMensaje());
		return ltsaca_tipoSalidaActualizarContactoAlertaVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActualizarContactoAlertaVO
	 * <b>a</b> TipoEntradaActualizarContactoAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada actualizar contacto alerta objeto
	 * con valores de servicio <b>a</b> Tipo entrada actualizar contacto alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateaca_tipoEntradaActualizarContactoAlertaVO el parametro que
	 *                                                     representa el objeto con
	 *                                                     valores de servicio a
	 *                                                     convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaActualizarContactoAlerta.
	 */
	public static TipoEntradaActualizarContactoAlerta voATipo(
			TipoEntradaActualizarContactoAlertaVO ateaca_tipoEntradaActualizarContactoAlertaVO) {
		TipoEntradaActualizarContactoAlerta lteaca_tipoEntradaActualizarContactoAlerta = new TipoEntradaActualizarContactoAlerta();
		lteaca_tipoEntradaActualizarContactoAlerta
				.setModulo(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_modulo());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setTipoDocumento(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_tipoDocumento());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setNumeroDocumento(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_numeroDocumento());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setPrimerNombre(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_primerNombre());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setSegundoNombre(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_segundoNombre());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setPrimerApellido(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_primerApellido());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setSegundoApellido(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_segundoApellido());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setRazonSocial(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_razonSocial());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setCorreoElectronico(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_correoElectronico());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setNumeroCelular(ateaca_tipoEntradaActualizarContactoAlertaVO.getIs_numeroCelular());
		return lteaca_tipoEntradaActualizarContactoAlerta;
	}

}
