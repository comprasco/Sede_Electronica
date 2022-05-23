/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarAlertaTarifaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarAlertaTarifaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares.TipoEntradaConsultarTarifaAlertasTitulares;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares.TipoSalidaConsultarTarifaAlertasTitulares;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarTarifaAlertasTitularesVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * alerta tarifa. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertaTarifaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarAlertaTarifaConverter.
	 */
	private ConsultarAlertaTarifaConverter() {
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
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultarTarifaAlertasTitularesVO <b>a</b>
	 * TipoEntradaConsultarTarifaAlertasTitulares, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar tarifa alertas titulares
	 * objeto con valores de servicio <b>a</b> Tipo entrada consultar tarifa alertas
	 * titulares (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atectat_tipoEntradaConsultarTarifaAlertasTitularesVO el parametro que
	 *                                                             representa el
	 *                                                             objeto con
	 *                                                             valores de
	 *                                                             servicio a
	 *                                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarTarifaAlertasTitulares.
	 */
	public static TipoEntradaConsultarTarifaAlertasTitulares voATipo(
			TipoEntradaConsultarTarifaAlertasTitularesVO atectat_tipoEntradaConsultarTarifaAlertasTitularesVO) {
		TipoEntradaConsultarTarifaAlertasTitulares ltectat_tipoEntradaConsultarTarifaAlertasTitulares = new TipoEntradaConsultarTarifaAlertasTitulares();
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setModulo(atectat_tipoEntradaConsultarTarifaAlertasTitularesVO.getIs_modulo());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares.setCantidadAlertasNuevas(
				atectat_tipoEntradaConsultarTarifaAlertasTitularesVO.getIs_cantidadAlertasNuevas());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setNumeroDocumento(atectat_tipoEntradaConsultarTarifaAlertasTitularesVO.getIs_numeroDocumento());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setTipoDocumento(atectat_tipoEntradaConsultarTarifaAlertasTitularesVO.getIs_tipoDocumento());
		return ltectat_tipoEntradaConsultarTarifaAlertasTitulares;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarTarifaAlertasTitulares
	 * <b>a</b> TipoSalidaConsultarTarifaAlertasTitularesVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar tarifa alertas titulares
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar tarifa alertas titulares objeto con valores de servicio.
	 *
	 * @param atsctat_tipoSalidaConsultarTarifaAlertaTitulares el parametro que
	 *                                                         representa el complex
	 *                                                         type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaConsultarTarifaAlertasTitularesVO.
	 */
	public static TipoSalidaConsultarTarifaAlertasTitularesVO tipoAVo(
			TipoSalidaConsultarTarifaAlertasTitulares atsctat_tipoSalidaConsultarTarifaAlertaTitulares) {
		TipoSalidaConsultarTarifaAlertasTitularesVO ltsctat_tipoSalidaConsultarAlertaVO = new TipoSalidaConsultarTarifaAlertasTitularesVO();
		ltsctat_tipoSalidaConsultarAlertaVO
				.setIs_codigoMensaje(atsctat_tipoSalidaConsultarTarifaAlertaTitulares.getCodigoMensaje());
		ltsctat_tipoSalidaConsultarAlertaVO
				.setIs_descripcionMensaje(atsctat_tipoSalidaConsultarTarifaAlertaTitulares.getDescripcionMensaje());
		ltsctat_tipoSalidaConsultarAlertaVO.setIlt_listaTarifaVo(TarifaConverter
				.listaTipoAListaVo(atsctat_tipoSalidaConsultarTarifaAlertaTitulares.getTarifas().getTarifa()));
		ltsctat_tipoSalidaConsultarAlertaVO
				.setIs_alertasInscrtitas(atsctat_tipoSalidaConsultarTarifaAlertaTitulares.getAlertasInscrtitas());
		ltsctat_tipoSalidaConsultarAlertaVO
				.setIs_tarifaNuevasAlertas(atsctat_tipoSalidaConsultarTarifaAlertaTitulares.getTarifaNuevasAlertas());
		return ltsctat_tipoSalidaConsultarAlertaVO;
	}
}
