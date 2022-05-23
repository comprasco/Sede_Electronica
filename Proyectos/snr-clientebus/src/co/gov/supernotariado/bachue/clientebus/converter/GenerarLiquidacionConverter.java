/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarLiquidacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: GenerarLiquidacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoEntradaGenerarLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoSalidaGenerarLiquidacion;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioGLIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Generar
 * liquidacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarLiquidacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase GenerarLiquidacionConverter.
	 */
	private GenerarLiquidacionConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaGenerarLiquidacionVO <b>a</b>
	 * TipoEntradaGenerarLiquidacion, <br>
	 * En otras palabras, <b>de</b> Tipo entrada generar liquidacion objeto con
	 * valores de servicio <b>a</b> Tipo entrada generar liquidacion (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ategl_tipoEntradaGenerarLiquidacionVo el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaGenerarLiquidacion.
	 */
	public static TipoEntradaGenerarLiquidacion voAtipo(
			TipoEntradaGenerarLiquidacionVO ategl_tipoEntradaGenerarLiquidacionVo) {
		TipoEntradaGenerarLiquidacion ltegl_liquidacionEntrada = new TipoEntradaGenerarLiquidacion();

		QName lqn_nombre = new QName(EnumTypesSoap.QNAME_CODIGO_COVENIO.getIs_valor());
		JAXBElement<String> ljes_codigoConvenio = new JAXBElement<>(lqn_nombre, String.class,
				ategl_tipoEntradaGenerarLiquidacionVo.getIs_codigoConvenio());
		QName lqn_orip = new QName(EnumTypesSoap.QNAME_ORIP_SOLICITUD.getIs_valor());
		JAXBElement<String> ljes_orip = new JAXBElement<>(lqn_orip, String.class,
				ategl_tipoEntradaGenerarLiquidacionVo.getIs_oripSolicitud());
		QName lqn_primerApellidoSolicitante = new QName(EnumTypesSoap.QNAME_PRIMER_APELLIDO_SOLICITANTE.getIs_valor());
		JAXBElement<String> ljes_primerApellido = new JAXBElement<>(lqn_primerApellidoSolicitante, String.class,
				ategl_tipoEntradaGenerarLiquidacionVo.getIs_primerApellidoSolicitante());
		QName lqn_primerNombreSolicitante = new QName(EnumTypesSoap.QNAME_PRIMER_NOMBRE_SOLICITANTE.getIs_valor());
		JAXBElement<String> ljes_primerNombreSolicitante = new JAXBElement<>(lqn_primerNombreSolicitante, String.class,
				ategl_tipoEntradaGenerarLiquidacionVo.getIs_primerNombreSolicitante());
		QName lqn_segundoApellidoSolicitante = new QName(
				EnumTypesSoap.QNAME_SEGUNDO_APELLIDO_SOLICITANTE.getIs_valor());
		JAXBElement<String> ljes_segundoApellidoSolicitante = new JAXBElement<>(lqn_segundoApellidoSolicitante,
				String.class, ategl_tipoEntradaGenerarLiquidacionVo.getIs_segundoApellidoSolicitante());
		QName lqn_segundoNombreSolicitante = new QName(EnumTypesSoap.QNAME_SEGUNDO_NOMBRE_SOLICITANTE.getIs_valor());
		JAXBElement<String> ljes_segundoNombreSolicitante = new JAXBElement<>(lqn_segundoNombreSolicitante,
				String.class, ategl_tipoEntradaGenerarLiquidacionVo.getIs_segundoNombreSolicitante());
		QName lqn_razonSocial = new QName(EnumTypesSoap.QNAME_RAZON_SOCIAL.getIs_valor());
		JAXBElement<String> ljes_razonSocial = new JAXBElement<>(lqn_razonSocial, String.class,
				ategl_tipoEntradaGenerarLiquidacionVo.getIs_razonSocial());

		ltegl_liquidacionEntrada.setCodigoConvenio(ljes_codigoConvenio);
		ltegl_liquidacionEntrada.setCodigoCanal(ategl_tipoEntradaGenerarLiquidacionVo.getIs_codigoCanal());
		ltegl_liquidacionEntrada
				.setCodigoSucursalCanal(ategl_tipoEntradaGenerarLiquidacionVo.getIs_codigoSucursalCanal());
		ltegl_liquidacionEntrada.setOripSolicitud(ljes_orip);
		ltegl_liquidacionEntrada.setTipoPersona(ategl_tipoEntradaGenerarLiquidacionVo.getIs_tipoPersona());
		ltegl_liquidacionEntrada
				.setTipoDocSolicitante(ategl_tipoEntradaGenerarLiquidacionVo.getIs_tipoDocSolicitante());
		ltegl_liquidacionEntrada
				.setNumeroDocSolicitante(ategl_tipoEntradaGenerarLiquidacionVo.getIs_numeroDocSolicitante());

		ltegl_liquidacionEntrada.setPrimerApellidoSolicitante(ljes_primerApellido);
		ltegl_liquidacionEntrada.setPrimerNombreSolicitante(ljes_primerNombreSolicitante);
		ltegl_liquidacionEntrada.setSegundoApellidoSolicitante(ljes_segundoApellidoSolicitante);
		ltegl_liquidacionEntrada.setSegundoNombreSolicitante(ljes_segundoNombreSolicitante);
		ltegl_liquidacionEntrada.setRazonSocial(ljes_razonSocial);

		TipoEntradaGenerarLiquidacion.Servicios ltegl_servicios = new TipoEntradaGenerarLiquidacion.Servicios();
		ltegl_liquidacionEntrada.setServicios(ltegl_servicios);

		for (TipoServicioGLIVO lsgl_servicioGenerarLiquidacionVo : ategl_tipoEntradaGenerarLiquidacionVo
				.getIlts_listaTipoServicioVo())
			ltegl_liquidacionEntrada.getServicios().getServicio()
					.add(TipoServicioGLIConverter.voATipo(lsgl_servicioGenerarLiquidacionVo));

		return ltegl_liquidacionEntrada;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaGenerarLiquidacion <b>a</b>
	 * TipoSalidaGenerarLiquidacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida generar liquidacion (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * generar liquidacion objeto con valores de servicio.
	 *
	 * @param atsgl_tipoSalidaGenerarLiquidacion el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaGenerarLiquidacionVO.
	 */
	public static TipoSalidaGenerarLiquidacionVO tipoAVo(
			TipoSalidaGenerarLiquidacion atsgl_tipoSalidaGenerarLiquidacion) {

		TipoSalidaGenerarLiquidacionVO ltsgl_tipoSalidaGenerarLiquidacionVo = new TipoSalidaGenerarLiquidacionVO();
		ltsgl_tipoSalidaGenerarLiquidacionVo
				.setIbi_codigoMensaje(atsgl_tipoSalidaGenerarLiquidacion.getCodigoMensaje());
		if (atsgl_tipoSalidaGenerarLiquidacion.getDescripcionMensaje() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo
					.setIs_descripcionMensaje(atsgl_tipoSalidaGenerarLiquidacion.getDescripcionMensaje().getValue());
		if (atsgl_tipoSalidaGenerarLiquidacion.getFechaLiquidacion() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo.setId_fechaLiquidacion(
					atsgl_tipoSalidaGenerarLiquidacion.getFechaLiquidacion().toGregorianCalendar().getTime());
		if (atsgl_tipoSalidaGenerarLiquidacion.getFechaVencimiento() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo.setId_fechaVencimiento(
					atsgl_tipoSalidaGenerarLiquidacion.getFechaVencimiento().toGregorianCalendar().getTime());
		if (atsgl_tipoSalidaGenerarLiquidacion.getValorTotalServicio() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo
					.setIbd_valorTotalServicio(atsgl_tipoSalidaGenerarLiquidacion.getValorTotalServicio());
		if (atsgl_tipoSalidaGenerarLiquidacion.getNumeroReferencia() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo
					.setIs_numeroReferencia(atsgl_tipoSalidaGenerarLiquidacion.getNumeroReferencia());
		if (atsgl_tipoSalidaGenerarLiquidacion.getNir() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo.setIs_nir(atsgl_tipoSalidaGenerarLiquidacion.getNir());
		if (atsgl_tipoSalidaGenerarLiquidacion.getServiciosLiquidados() != null)
			ltsgl_tipoSalidaGenerarLiquidacionVo.setIlts_serviciosLiquidadosVo(TipoServicioGLOConverter
					.listaTipoAVo(atsgl_tipoSalidaGenerarLiquidacion.getServiciosLiquidados().getServicioLiquidado()));

		return ltsgl_tipoSalidaGenerarLiquidacionVo;
	}

}
