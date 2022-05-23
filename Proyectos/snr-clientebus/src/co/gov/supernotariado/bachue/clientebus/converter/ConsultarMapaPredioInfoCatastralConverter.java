/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMapaPredioInfoCatastralConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMapaPredioInfoCatastralConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.TipoEntradaConsultarMapaPredioInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.TipoSalidaConsultarMapaPredioInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMapaPredioInfoCatastralVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * mapa predio info catastral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMapaPredioInfoCatastralConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMapaPredioInfoCatastralConverter.
	 */
	ConsultarMapaPredioInfoCatastralConverter() {
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
	 * TipoEntradaConsultarMapaPredioInfoCatastralVO <b>a</b>
	 * TipoEntradaConsultarMapaPredioInfoCatastral, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar mapa predio info
	 * catastral objeto con valores de servicio <b>a</b> Tipo entrada consultar mapa
	 * predio info catastral (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atecmpic_tipoEntradaTipoEntradaConsultarMapaPredioInfoCatastralVo el
	 *                                                                          parametro
	 *                                                                          que
	 *                                                                          representa
	 *                                                                          el
	 *                                                                          objeto
	 *                                                                          con
	 *                                                                          valores
	 *                                                                          de
	 *                                                                          servicio
	 *                                                                          a
	 *                                                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarMapaPredioInfoCatastral.
	 */
	public static TipoEntradaConsultarMapaPredioInfoCatastral voATipo(
			TipoEntradaConsultarMapaPredioInfoCatastralVO atecmpic_tipoEntradaTipoEntradaConsultarMapaPredioInfoCatastralVo) {
		TipoEntradaConsultarMapaPredioInfoCatastral ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral = new TipoEntradaConsultarMapaPredioInfoCatastral();

		ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral.setNumeroCatastral(
				atecmpic_tipoEntradaTipoEntradaConsultarMapaPredioInfoCatastralVo.getIs_numeroCatastral());

		return ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral;
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
	 * TipoSalidaConsultarMapaPredioInfoCatastral <b>a</b>
	 * TipoSalidaConsultarMapaPredioInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar mapa predio info catastral
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar mapa predio info catastral objeto con valores de servicio.
	 *
	 * @param atscmpic_tipoSalidaConsultarMapaPredioInfoCatastral el parametro que
	 *                                                            representa el
	 *                                                            complex type a
	 *                                                            convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como
	 *         TipoSalidaConsultarMapaPredioInfoCatastralVO.
	 */

	public static TipoSalidaConsultarMapaPredioInfoCatastralVO tipoAVo(
			TipoSalidaConsultarMapaPredioInfoCatastral atscmpic_tipoSalidaConsultarMapaPredioInfoCatastral) {
		TipoSalidaConsultarMapaPredioInfoCatastralVO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo = new TipoSalidaConsultarMapaPredioInfoCatastralVO();

		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo
				.setIs_codigo(atscmpic_tipoSalidaConsultarMapaPredioInfoCatastral.getCodigo());
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo
				.setIs_mensaje(atscmpic_tipoSalidaConsultarMapaPredioInfoCatastral.getMensaje());
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo
				.setIs_png(atscmpic_tipoSalidaConsultarMapaPredioInfoCatastral.getPNG());

		return ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo;
	}

}
