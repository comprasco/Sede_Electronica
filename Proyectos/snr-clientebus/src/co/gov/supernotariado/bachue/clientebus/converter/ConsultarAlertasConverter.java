/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarAlertasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarAlertasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoEntradaConsultarAlertas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoSalidaConsultarAlertas;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarAlertasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * alertas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarAlertasConverter.
	 */
	private ConsultarAlertasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarAlertasVO <b>a</b>
	 * TipoEntradaConsultarAlertas, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alertas objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar alertas (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateca_tipoEntradaConsultarAlertasVo el parametro que representa el
	 *                                            objeto con valores de servicio a
	 *                                            convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarAlertas.
	 */
	public static TipoEntradaConsultarAlertas voATipo(
			TipoEntradaConsultarAlertasVO ateca_tipoEntradaConsultarAlertasVo) {

		TipoEntradaConsultarAlertas lteca_tipoEntradaConsultarAlertas = new TipoEntradaConsultarAlertas();

		lteca_tipoEntradaConsultarAlertas.setEsSNR(ateca_tipoEntradaConsultarAlertasVo.getIs_esSNR());
		lteca_tipoEntradaConsultarAlertas.setCodigoEstado(ateca_tipoEntradaConsultarAlertasVo.getIs_codigoEstado());
		lteca_tipoEntradaConsultarAlertas.setIdEntidad(ateca_tipoEntradaConsultarAlertasVo.getIs_idEntidad());
		lteca_tipoEntradaConsultarAlertas.setFechaInscripcion(UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(ateca_tipoEntradaConsultarAlertasVo.getId_fechaInscripcion()));
		lteca_tipoEntradaConsultarAlertas
				.setCodTipoDocumentoPublico(ateca_tipoEntradaConsultarAlertasVo.getIs_codTipoDocumentoPublico());
		lteca_tipoEntradaConsultarAlertas
				.setCodCirculoRegistral(ateca_tipoEntradaConsultarAlertasVo.getIs_codCirculoRegistral());
		lteca_tipoEntradaConsultarAlertas
				.setNumMatriculaInmobiliaria(ateca_tipoEntradaConsultarAlertasVo.getIi_numMatriculaInmobiliaria());
		lteca_tipoEntradaConsultarAlertas
				.setNombreComunidadEtnica(ateca_tipoEntradaConsultarAlertasVo.getIs_nombreComunidadEtnica());

		return lteca_tipoEntradaConsultarAlertas;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarAlertas <b>a</b>
	 * TipoSalidaConsultarAlertasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alertas (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar alertas objeto con valores de servicio.
	 *
	 * @param atsca_tipoSalidaConsultarAlertas el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarAlertasVO.
	 */
	public static TipoSalidaConsultarAlertasVO tipoAVo(TipoSalidaConsultarAlertas atsca_tipoSalidaConsultarAlertas) {
		TipoSalidaConsultarAlertasVO ltsca_tipoSalidaConsultarAlertasVo = new TipoSalidaConsultarAlertasVO();

		ltsca_tipoSalidaConsultarAlertasVo.setIs_codigo(atsca_tipoSalidaConsultarAlertas.getCodigo());
		ltsca_tipoSalidaConsultarAlertasVo.setIs_mensaje(atsca_tipoSalidaConsultarAlertas.getMensaje());
		ltsca_tipoSalidaConsultarAlertasVo.setIlla_listaAlertasVo(ListaAlertasConverter
				.listaTipoAListaVo(atsca_tipoSalidaConsultarAlertas.getListaAlertas().getAlerta()));
		return ltsca_tipoSalidaConsultarAlertasVo;
	}
}
