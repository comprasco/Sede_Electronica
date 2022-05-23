/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarTarifaServicioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarTarifaServicioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoEntradaConsultarTarifaServicio;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoEntradaConsultarTarifaServicio.Servicios;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoSalidaConsultarTarifaServicio;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoServicioCTSI;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultarTarifaServicioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * tarifa servicio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarTarifaServicioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarTarifaServicioConverter.
	 */
	private ConsultarTarifaServicioConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarTarifaServicio
	 * <b>a</b> TipoSalidaConsultarTarifaServicioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar tarifa servicio
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar tarifa servicio objeto con valores de servicio.
	 *
	 * @param atscts_consultarTarifaServicio el parametro que representa el complex
	 *                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarTarifaServicioVO.
	 */
	public static TipoSalidaConsultarTarifaServicioVO tipoAVo(
			TipoSalidaConsultarTarifaServicio atscts_consultarTarifaServicio) {
		TipoSalidaConsultarTarifaServicioVO ltss_tarifaServicioSalidaVO = new TipoSalidaConsultarTarifaServicioVO();
		ltss_tarifaServicioSalidaVO.setIbi_codigoMensaje(atscts_consultarTarifaServicio.getCodigoMensaje());
		if (atscts_consultarTarifaServicio.getDescripcionMensaje() != null)
			ltss_tarifaServicioSalidaVO
					.setIs_descripcionMensaje(atscts_consultarTarifaServicio.getDescripcionMensaje().getValue());
		if (atscts_consultarTarifaServicio.getServiciosTarifados() != null) {
			ltss_tarifaServicioSalidaVO.setIlts_listaTipoServicioCtsoVo(ServicioTarifiadoConsultarTarifaConverter
					.listaTipoAlistaVo(atscts_consultarTarifaServicio.getServiciosTarifados().getServicioTarifado()));
		}
		return ltss_tarifaServicioSalidaVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarTarifaServicioVO
	 * <b>a</b> TipoEntradaConsultarTarifaServicio, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar tarifa servicio objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar tarifa servicio
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atse_tarifaServicioEntrada el parametro que representa el objeto con
	 *                                   valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarTarifaServicio.
	 */
	public static TipoEntradaConsultarTarifaServicio voATipo(
			TipoEntradaConsultarTarifaServicioVO atse_tarifaServicioEntrada) {
		TipoEntradaConsultarTarifaServicio ltects_consultaTarifaServicio = new TipoEntradaConsultarTarifaServicio();
		ltects_consultaTarifaServicio.setCanalOrigen(atse_tarifaServicioEntrada.getIs_canalOrigen());
		if (atse_tarifaServicioEntrada.getIs_codigoConvenio() != null) {
			QName lqn_qName = new QName(EnumTypesSoap.QNAME_CODIGO_COVENIO.getIs_valor());
			ltects_consultaTarifaServicio.setCodigoConvenio(
					new JAXBElement<>(lqn_qName, String.class, atse_tarifaServicioEntrada.getIs_codigoConvenio()));
		}
		Servicios ls_servicioConsultarTarifa = new Servicios();
		List<TipoServicioCTSI> lltsc_listaServicio = ServicioConsultarTarifaConverter
				.listaVoAListaTipo(atse_tarifaServicioEntrada.getIltsc_servicios());

		for (TipoServicioCTSI ls_servicio : lltsc_listaServicio)
			ls_servicioConsultarTarifa.getServicio().add(ls_servicio);

		ltects_consultaTarifaServicio.setServicios(ls_servicioConsultarTarifa);
		ltects_consultaTarifaServicio.setNumeroDocSolicitante(atse_tarifaServicioEntrada.getIs_numeroDocSolicitante());
		ltects_consultaTarifaServicio.setTipoDocSolicitante(atse_tarifaServicioEntrada.getIs_tipoDocSolicitante());

		return ltects_consultaTarifaServicio;
	}

}