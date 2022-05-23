/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: BusquedaDocumentosConsultarConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: BusquedaDocumentosConsultarConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoEntradaConsultar;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoEntradaConsultar.Parametros;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoParametro;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoSalidaConsultar;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaConsultarVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Busqueda
 * documentos consultar. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BusquedaDocumentosConsultarConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * BusquedaDocumentosConsultarConverter.
	 */
	private BusquedaDocumentosConsultarConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultar <b>a</b>
	 * TipoSalidaConsultarVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Tipo salida consultar objeto con
	 * valores de servicio.
	 *
	 * @param atsc_tipoSalidaConsultar el parametro que representa el complex type a
	 *                                 convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarVO.
	 */
	public static TipoSalidaConsultarVO tipoAVo(TipoSalidaConsultar atsc_tipoSalidaConsultar) {
		TipoSalidaConsultarVO ltsc_tipoSalidaConsultarVO = new TipoSalidaConsultarVO();
		if (atsc_tipoSalidaConsultar.getDocumentos() != null)
			ltsc_tipoSalidaConsultarVO.setIld_listaDocumentosVo(DocumentoBusquedaDocumentosConverter
					.listaTipoAListaVo(atsc_tipoSalidaConsultar.getDocumentos().getDocumento()));
		ltsc_tipoSalidaConsultarVO.setIs_codigoMensaje(atsc_tipoSalidaConsultar.getCodigoMensaje().toString());
		ltsc_tipoSalidaConsultarVO.setIs_descripcionMensaje(atsc_tipoSalidaConsultar.getDescripcionMensaje());
		return ltsc_tipoSalidaConsultarVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarVO <b>a</b>
	 * TipoEntradaConsultar, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar objeto con valores de
	 * servicio <b>a</b> Tipo entrada consultar (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param atec_tipoEntradaConsultarVO el parametro que representa el objeto con
	 *                                    valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultar.
	 */
	public static TipoEntradaConsultar voATipo(TipoEntradaConsultarVO atec_tipoEntradaConsultarVO) {
		TipoEntradaConsultar ltec_tipoEntradaConsultar = new TipoEntradaConsultar();
		ltec_tipoEntradaConsultar.setSistemaOrigen(atec_tipoEntradaConsultarVO.getIs_sistemaOrigen());
		Parametros lp_parametros = new Parametros();
		for (TipoParametro ltp_parametro : ParametroBusquedaDocumentosConverter
				.listaVoAListaTipo(atec_tipoEntradaConsultarVO.getIlp_listaParametrosVo())) {
			lp_parametros.getParametro().add(ltp_parametro);
		}
		ltec_tipoEntradaConsultar.setParametros(lp_parametros);
		ltec_tipoEntradaConsultar.setRepositorio(atec_tipoEntradaConsultarVO.getIs_repositorio());
		return ltec_tipoEntradaConsultar;
	}
}
