/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ActivarAlertaTierrasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ActivarAlertaTierrasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.TipoEntradaActivarAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.TipoSalidaActivarAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaActivarAlertaTierrasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Activar
 * alerta tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActivarAlertaTierrasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActivarAlertaTierrasConverter.
	 */
	private ActivarAlertaTierrasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaActivarAlertaTierrasVO
	 * <b>a</b> TipoEntradaActivarAlertaTierras, <br>
	 * En otras palabras, <b>de</b> Tipo entrada activar alerta tierras objeto con
	 * valores de servicio <b>a</b> Tipo entrada activar alerta tierras (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateaat_tipoEntradaActivarAlertaTierrasVo el parametro que representa
	 *                                                 el objeto con valores de
	 *                                                 servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaActivarAlertaTierras.
	 */
	public static TipoEntradaActivarAlertaTierras voATipo(
			TipoEntradaActivarAlertaTierrasVO ateaat_tipoEntradaActivarAlertaTierrasVo) {
		TipoEntradaActivarAlertaTierras lteaat_tipoEntradaActivarAlertaTierras = new TipoEntradaActivarAlertaTierras();

		lteaat_tipoEntradaActivarAlertaTierras.setIdAlerta(ateaat_tipoEntradaActivarAlertaTierrasVo.getIi_idAlerta());

		return lteaat_tipoEntradaActivarAlertaTierras;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaActivarAlertaTierras <b>a</b>
	 * TipoSalidaActivarAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida activar alerta tierras (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * activar alerta tierras objeto con valores de servicio.
	 *
	 * @param atsaat_tipoSalidaActivarAlertaTierras el parametro que representa el
	 *                                              complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaActivarAlertaTierrasVO.
	 */
	public static TipoSalidaActivarAlertaTierrasVO tipoAVo(
			TipoSalidaActivarAlertaTierras atsaat_tipoSalidaActivarAlertaTierras) {
		TipoSalidaActivarAlertaTierrasVO ltsaat_tipoSalidaActivarAlertaTierrasVo = new TipoSalidaActivarAlertaTierrasVO();

		ltsaat_tipoSalidaActivarAlertaTierrasVo.setIs_codigo(atsaat_tipoSalidaActivarAlertaTierras.getCodigo());
		ltsaat_tipoSalidaActivarAlertaTierrasVo.setIs_mensaje(atsaat_tipoSalidaActivarAlertaTierras.getMensaje());

		return ltsaat_tipoSalidaActivarAlertaTierrasVo;
	}

}
