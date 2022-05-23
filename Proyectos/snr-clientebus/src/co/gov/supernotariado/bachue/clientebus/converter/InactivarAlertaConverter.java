/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InactivarAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: InactivarAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.inactivaralerta.TipoEntradaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.inactivaralerta.TipoSalidaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaInactivarAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Inactivar
 * alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class InactivarAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase InactivarAlertaConverter.
	 */
	private InactivarAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaInactivarAlertaVO <b>a</b>
	 * TipoEntradaInactivarAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inactivar alerta objeto con valores
	 * de servicio <b>a</b> Tipo entrada inactivar alerta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateia_tipoEntradaInactivarAlertaVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaInactivarAlerta.
	 */
	public static TipoEntradaInactivarAlerta voATipo(TipoEntradaInactivarAlertaVO ateia_tipoEntradaInactivarAlertaVO) {
		TipoEntradaInactivarAlerta lteia_tipoEntradaInactivarAlerta = new TipoEntradaInactivarAlerta();
		lteia_tipoEntradaInactivarAlerta.setModulo(ateia_tipoEntradaInactivarAlertaVO.getIs_modulo());
		lteia_tipoEntradaInactivarAlerta
				.setIdentificadorAlerta(ateia_tipoEntradaInactivarAlertaVO.getIs_identificadorAlerta());
		lteia_tipoEntradaInactivarAlerta.setTipoDocumento(ateia_tipoEntradaInactivarAlertaVO.getIs_tipoDocumento());
		lteia_tipoEntradaInactivarAlerta.setNumeroDocumento(ateia_tipoEntradaInactivarAlertaVO.getIs_numeroDocumento());
		lteia_tipoEntradaInactivarAlerta.setPrimerNombre(ateia_tipoEntradaInactivarAlertaVO.getIs_primerNombre());
		lteia_tipoEntradaInactivarAlerta.setSegundoNombre(ateia_tipoEntradaInactivarAlertaVO.getIs_segundoNombre());
		lteia_tipoEntradaInactivarAlerta.setPrimerApellido(ateia_tipoEntradaInactivarAlertaVO.getIs_primerApellido());
		lteia_tipoEntradaInactivarAlerta.setSegundoApellido(ateia_tipoEntradaInactivarAlertaVO.getIs_segundoApellido());
		lteia_tipoEntradaInactivarAlerta.setRazonSocial(ateia_tipoEntradaInactivarAlertaVO.getIs_razonSocial());
		return lteia_tipoEntradaInactivarAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInactivarAlerta <b>a</b>
	 * TipoSalidaInactivarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inactivar alerta (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * inactivar alerta objeto con valores de servicio.
	 *
	 * @param atsia_tipoSalidaInactivarAlerta el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaInactivarAlertaVO.
	 */
	public static TipoSalidaInactivarAlertaVO tipoAVo(TipoSalidaInactivarAlerta atsia_tipoSalidaInactivarAlerta) {
		TipoSalidaInactivarAlertaVO ltsia_tipoSalidaInactivarAlerta = new TipoSalidaInactivarAlertaVO();
		ltsia_tipoSalidaInactivarAlerta.setIs_codigoMensaje(atsia_tipoSalidaInactivarAlerta.getCodigoMensaje());
		ltsia_tipoSalidaInactivarAlerta
				.setIs_descripcionMensaje(atsia_tipoSalidaInactivarAlerta.getDescripcionMensaje());
		return ltsia_tipoSalidaInactivarAlerta;
	}
}