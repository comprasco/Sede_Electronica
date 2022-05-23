/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarCatalogosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarCatalogosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos.TipoEntradaConsultarCatalogos;
import co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos.TipoSalidaConsultarCatalogos;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoEntradaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoSalidaConsultarCatalogosVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * catalogos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarCatalogosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarCatalogosConverter.
	 */
	private ConsultarCatalogosConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarCatalogosVO <b>a</b>
	 * TipoEntradaConsultarCatalogos, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar catalogos objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar catalogos (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecc_tipoEntradaConsultarCatalogosVO el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarCatalogos.
	 */
	public static TipoEntradaConsultarCatalogos voATipo(
			TipoEntradaConsultarCatalogosVO atecc_tipoEntradaConsultarCatalogosVO) {
		TipoEntradaConsultarCatalogos ltecc_tipoEntradaConsultarCatalogos = new TipoEntradaConsultarCatalogos();
		ltecc_tipoEntradaConsultarCatalogos.setModulo(atecc_tipoEntradaConsultarCatalogosVO.getIs_modulo());
		ltecc_tipoEntradaConsultarCatalogos.setCatalogo(atecc_tipoEntradaConsultarCatalogosVO.getIs_catalogo());
		ltecc_tipoEntradaConsultarCatalogos.setParametro(atecc_tipoEntradaConsultarCatalogosVO.getIs_parametro());
		return ltecc_tipoEntradaConsultarCatalogos;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarCatalogos <b>a</b>
	 * TipoSalidaConsultarCatalogosVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar catalogos (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar catalogos objeto con valores de servicio.
	 *
	 * @param atscc_tipoSalidaConsultarCatalogos el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarCatalogosVO.
	 */
	public static TipoSalidaConsultarCatalogosVO tipoAVo(
			TipoSalidaConsultarCatalogos atscc_tipoSalidaConsultarCatalogos) {
		TipoSalidaConsultarCatalogosVO ltscc_tipoSalidaConsultarCatalogosVO = new TipoSalidaConsultarCatalogosVO();
		ltscc_tipoSalidaConsultarCatalogosVO.setIlc_listaCatalogo(CatalogoConsultarCatalogosConverter
				.listaTipoAListaVo(atscc_tipoSalidaConsultarCatalogos.getCatalogos()));
		ltscc_tipoSalidaConsultarCatalogosVO.setIs_codigoMensaje(atscc_tipoSalidaConsultarCatalogos.getCodigoMensaje());
		ltscc_tipoSalidaConsultarCatalogosVO
				.setIs_descripcionMensaje(atscc_tipoSalidaConsultarCatalogos.getDescripcionMensaje());
		return ltscc_tipoSalidaConsultarCatalogosVO;
	}
}
