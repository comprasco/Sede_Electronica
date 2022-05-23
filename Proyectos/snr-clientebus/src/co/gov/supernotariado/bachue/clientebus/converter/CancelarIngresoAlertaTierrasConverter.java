/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CancelarIngresoAlertaTierrasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CancelarIngresoAlertaTierrasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.TipoEntradaCancelarIngresoAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.TipoSalidaCancelarIngresoAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCancelarIngresoAlertaTierrasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Cancelar
 * ingreso alerta tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelarIngresoAlertaTierrasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CancelarIngresoAlertaTierrasConverter.
	 */
	private CancelarIngresoAlertaTierrasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaCancelarIngresoAlertaTierrasVO
	 * <b>a</b> TipoEntradaCancelarIngresoAlertaTierras, <br>
	 * En otras palabras, <b>de</b> Tipo entrada cancelar ingreso alerta tierras
	 * objeto con valores de servicio <b>a</b> Tipo entrada cancelar ingreso alerta
	 * tierras (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateciat_tipoEntradaCancelarIngresoAlertaTierrasVo el parametro que
	 *                                                          representa el objeto
	 *                                                          con valores de
	 *                                                          servicio a
	 *                                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaCancelarIngresoAlertaTierras.
	 */
	public static TipoEntradaCancelarIngresoAlertaTierras voATipo(
			TipoEntradaCancelarIngresoAlertaTierrasVO ateciat_tipoEntradaCancelarIngresoAlertaTierrasVo) {

		TipoEntradaCancelarIngresoAlertaTierras lteciat_tipoEntradaCancelarIngresoAlertaTierras = new TipoEntradaCancelarIngresoAlertaTierras();

		lteciat_tipoEntradaCancelarIngresoAlertaTierras
				.setIdAlerta(ateciat_tipoEntradaCancelarIngresoAlertaTierrasVo.getIi_idAlerta());

		return lteciat_tipoEntradaCancelarIngresoAlertaTierras;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaCancelarIngresoAlertaTierras
	 * <b>a</b> TipoSalidaCancelarIngresoAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida cancelar ingreso alerta tierras
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida cancelar ingreso alerta tierras objeto con valores de servicio.
	 *
	 * @param atsciat_tipoSalidaCancelarIngresoAlertaTierras el parametro que
	 *                                                       representa el complex
	 *                                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaCancelarIngresoAlertaTierrasVO.
	 */
	public static TipoSalidaCancelarIngresoAlertaTierrasVO tipoAVo(
			TipoSalidaCancelarIngresoAlertaTierras atsciat_tipoSalidaCancelarIngresoAlertaTierras) {
		TipoSalidaCancelarIngresoAlertaTierrasVO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo = new TipoSalidaCancelarIngresoAlertaTierrasVO();

		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo
				.setIs_codigo(atsciat_tipoSalidaCancelarIngresoAlertaTierras.getCodigo());
		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo
				.setIs_mensaje(atsciat_tipoSalidaCancelarIngresoAlertaTierras.getMensaje());

		return ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo;
	}
}
