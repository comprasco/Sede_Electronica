/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarOficinasOrigenTipoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarOficinasOrigenTipoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoEntradaConsultarOficinasOrigenTipo;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoSalidaConsultarOficinasOrigenTipo;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarOficinasOrigenTipoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * oficinas origen tipo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarOficinasOrigenTipoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarOficinasOrigenTipoConverter.
	 */
	private ConsultarOficinasOrigenTipoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarOficinasOrigenTipoVO
	 * <b>a</b> TipoEntradaConsultarOficinasOrigenTipo, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar oficinas origen tipo
	 * objeto con valores de servicio <b>a</b> Tipo entrada consultar oficinas
	 * origen tipo (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecoot_tipoEntradaConsultarOficinasOrigenTipoVO el parametro que
	 *                                                         representa el objeto
	 *                                                         con valores de
	 *                                                         servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarOficinasOrigenTipo.
	 */
	public static TipoEntradaConsultarOficinasOrigenTipo voATipo(
			TipoEntradaConsultarOficinasOrigenTipoVO atecoot_tipoEntradaConsultarOficinasOrigenTipoVO) {
		TipoEntradaConsultarOficinasOrigenTipo ltecoot_tipoEntradaConsultarOficinasOrigenTipo = new TipoEntradaConsultarOficinasOrigenTipo();
		ltecoot_tipoEntradaConsultarOficinasOrigenTipo
				.setCodigoOficinaOrigen(atecoot_tipoEntradaConsultarOficinasOrigenTipoVO.getIs_codigoOficinaOrigen());
		ltecoot_tipoEntradaConsultarOficinasOrigenTipo.setNomParcialOficinaOrigen(
				atecoot_tipoEntradaConsultarOficinasOrigenTipoVO.getIs_nomParcialOficinaOrigen());
		ltecoot_tipoEntradaConsultarOficinasOrigenTipo
				.setTipoOficinaOrigen(atecoot_tipoEntradaConsultarOficinasOrigenTipoVO.getIs_tipoOficinaOrigen());
		return ltecoot_tipoEntradaConsultarOficinasOrigenTipo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarOficinasOrigenTipo
	 * <b>a</b> TipoSalidaConsultarOficinasOrigenTipoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar oficinas origen tipo
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar oficinas origen tipo objeto con valores de servicio.
	 *
	 * @param atscoot_tipoSalidaConsultarOficinasOrigenTipo el parametro que
	 *                                                      representa el complex
	 *                                                      type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarOficinasOrigenTipoVO.
	 */
	public static TipoSalidaConsultarOficinasOrigenTipoVO tipoAVo(
			TipoSalidaConsultarOficinasOrigenTipo atscoot_tipoSalidaConsultarOficinasOrigenTipo) {
		TipoSalidaConsultarOficinasOrigenTipoVO ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo = new TipoSalidaConsultarOficinasOrigenTipoVO();
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo
				.setIlloo_listaOficinaOrigenVo(ListaOficinasOrigenConverter.listaTipoAListaVo(
						atscoot_tipoSalidaConsultarOficinasOrigenTipo.getListaOficinasOrigen().getOficinaOrigen()));
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo
				.setIs_codigo(atscoot_tipoSalidaConsultarOficinasOrigenTipo.getCodigo());
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo
				.setIs_mensaje(atscoot_tipoSalidaConsultarOficinasOrigenTipo.getMensaje());
		return ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo;
	}
}
