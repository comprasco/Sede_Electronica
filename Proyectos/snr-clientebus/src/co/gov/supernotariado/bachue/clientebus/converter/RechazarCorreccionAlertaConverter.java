/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RechazarCorreccionAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: RechazarCorreccionAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.TipoEntradaRechazarCorreccionAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.TipoSalidaRechazarCorreccionAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRechazarCorreccionAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Rechazar
 * correccion alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class RechazarCorreccionAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * RechazarCorreccionAlertaConverter.
	 */
	private RechazarCorreccionAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaRechazarCorreccionAlertaVO
	 * <b>a</b> TipoEntradaRechazarCorreccionAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada rechazar correccion alerta objeto
	 * con valores de servicio <b>a</b> Tipo entrada rechazar correccion alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param aterca_tipoEntradaRechazarCorreccionAlertaVo el parametro que
	 *                                                     representa el objeto con
	 *                                                     valores de servicio a
	 *                                                     convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaRechazarCorreccionAlerta.
	 */
	public static TipoEntradaRechazarCorreccionAlerta voATipo(
			TipoEntradaRechazarCorreccionAlertaVO aterca_tipoEntradaRechazarCorreccionAlertaVo) {
		TipoEntradaRechazarCorreccionAlerta lterca_tipoEntradaRechazarCorreccionAlerta = new TipoEntradaRechazarCorreccionAlerta();

		lterca_tipoEntradaRechazarCorreccionAlerta
				.setIdAlerta(aterca_tipoEntradaRechazarCorreccionAlertaVo.getIi_idAlerta());
		lterca_tipoEntradaRechazarCorreccionAlerta
				.setIdUsuario(aterca_tipoEntradaRechazarCorreccionAlertaVo.getIs_idUsuario());
		lterca_tipoEntradaRechazarCorreccionAlerta.setTexto(aterca_tipoEntradaRechazarCorreccionAlertaVo.getIs_texto());

		return lterca_tipoEntradaRechazarCorreccionAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaRechazarCorreccionAlerta
	 * <b>a</b> TipoSalidaRechazarCorreccionAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida rechazar correccion alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida rechazar correccion alerta objeto con valores de servicio.
	 *
	 * @param atsrca_tipoSalidaRechazarCorreccionAlerta el parametro que representa
	 *                                                  el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaRechazarCorreccionAlertaVO.
	 */
	public static TipoSalidaRechazarCorreccionAlertaVO tipoAVo(
			TipoSalidaRechazarCorreccionAlerta atsrca_tipoSalidaRechazarCorreccionAlerta) {
		TipoSalidaRechazarCorreccionAlertaVO ltsrca_tipoSalidaRechazarCorreccionAlertaVo = new TipoSalidaRechazarCorreccionAlertaVO();

		ltsrca_tipoSalidaRechazarCorreccionAlertaVo.setIs_codigo(atsrca_tipoSalidaRechazarCorreccionAlerta.getCodigo());
		ltsrca_tipoSalidaRechazarCorreccionAlertaVo
				.setIs_mensaje(atsrca_tipoSalidaRechazarCorreccionAlerta.getMensaje());

		return ltsrca_tipoSalidaRechazarCorreccionAlertaVo;
	}
}
