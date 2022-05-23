/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarHistorialConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarHistorialConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoEntradaConsultarHistorial;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoSalidaConsultarHistorial;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoSalidaConsultarHistorial.ListaMensajes.Mensaje;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.MensajeVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoDocumentalVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoEntradaConsultarHistorialVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoSalidaConsultarHistorialVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * historial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarHistorialConverter {

	/**
	 * Define la constante CS_NOMBRE_ESPACIO.
	 */
	private static final String CS_NOMBRE_ESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1";

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarHistorialConverter.
	 */
	private ConsultarHistorialConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarHistorialVO <b>a</b>
	 * TipoEntradaConsultarHistorial, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar historial objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar historial (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atech_tipoEntradaConsultarHistorialVo el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarHistorial.
	 */
	public static TipoEntradaConsultarHistorial voATipo(
			TipoEntradaConsultarHistorialVO atech_tipoEntradaConsultarHistorialVo) {
		TipoEntradaConsultarHistorial ltech_tipoEntradaConsultarHistorial = new TipoEntradaConsultarHistorial();

		ltech_tipoEntradaConsultarHistorial.setFechaInicial(UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(atech_tipoEntradaConsultarHistorialVo.getId_fechaInicial()));
		QName lqn_qNameFechaFinal = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_FECHA_FINAL.getIs_valor());
		XMLGregorianCalendar lgc_fechaFinal = UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(atech_tipoEntradaConsultarHistorialVo.getId_fechaFinal());
		ltech_tipoEntradaConsultarHistorial
				.setFechaFinal(new JAXBElement<>(lqn_qNameFechaFinal, XMLGregorianCalendar.class, lgc_fechaFinal));
		QName lqn_qNameTipoID = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_TIPO_ID.getIs_valor());
		ltech_tipoEntradaConsultarHistorial.setTipoID(
				new JAXBElement<>(lqn_qNameTipoID, String.class, atech_tipoEntradaConsultarHistorialVo.getIs_tipoID()));
		QName lqn_qNameIdentificador = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_IDENTIFICADOR.getIs_valor());
		ltech_tipoEntradaConsultarHistorial.setIdentificador(new JAXBElement<>(lqn_qNameIdentificador, String.class,
				atech_tipoEntradaConsultarHistorialVo.getIs_identificador()));
		QName lqn_qNamePagina = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_PAGINA.getIs_valor());
		ltech_tipoEntradaConsultarHistorial.setPagina(
				new JAXBElement<>(lqn_qNamePagina, String.class, atech_tipoEntradaConsultarHistorialVo.getIs_pagina()));
		QName lqn_qNameCorreo = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_CORREO.getIs_valor());
		ltech_tipoEntradaConsultarHistorial.setDireccionCorreoElectronicoDestinatario(new JAXBElement<>(lqn_qNameCorreo,
				String.class, atech_tipoEntradaConsultarHistorialVo.getIs_direccionCorreoElectronicoDestinatario()));
		QName lqn_qNameTelefono = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_TELEFONO.getIs_valor());
		ltech_tipoEntradaConsultarHistorial.setNumeroTelefonoDestinatario(new JAXBElement<>(lqn_qNameTelefono,
				BigInteger.class, atech_tipoEntradaConsultarHistorialVo.getIbi_numeroTelefonoDestinatario()));

		return ltech_tipoEntradaConsultarHistorial;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarHistorial <b>a</b>
	 * TipoSalidaConsultarHistorialVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar historial (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar historial objeto con valores de servicio.
	 *
	 * @param atsch_tipoSalidaConsultarHistorial el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarHistorialVO.
	 */
	public static TipoSalidaConsultarHistorialVO tipoAVo(
			TipoSalidaConsultarHistorial atsch_tipoSalidaConsultarHistorial) {
		TipoSalidaConsultarHistorialVO ltsch_tipoSalidaConsultarHistorialVo = new TipoSalidaConsultarHistorialVO();

		ltsch_tipoSalidaConsultarHistorialVo
				.setIbi_numeroRegistros(atsch_tipoSalidaConsultarHistorial.getNumeroRegistros());
		if (atsch_tipoSalidaConsultarHistorial.getListaMensajes() != null)
			ltsch_tipoSalidaConsultarHistorialVo.setIlm_listaMensajes(listaTipoMensajeAListaVoMensaje(
					atsch_tipoSalidaConsultarHistorial.getListaMensajes().getMensaje()));
		ltsch_tipoSalidaConsultarHistorialVo.setIbi_codMensaje(atsch_tipoSalidaConsultarHistorial.getCodMensaje());
		ltsch_tipoSalidaConsultarHistorialVo
				.setIs_descripcionMensaje(atsch_tipoSalidaConsultarHistorial.getDescripcionMensaje());

		return ltsch_tipoSalidaConsultarHistorialVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Mensaje <b>a</b> MensajeVO, <br>
	 * En otras palabras, <b>de</b> Mensaje (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Mensaje objeto con valores de
	 * servicio.
	 *
	 * @param am_mensaje el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como MensajeVO.
	 */
	public static MensajeVO tipoMensajeAVoMensaje(Mensaje am_mensaje) {
		MensajeVO lm_mensajeVo = new MensajeVO();

		lm_mensajeVo.setIs_nir(am_mensaje.getNir());
		lm_mensajeVo.setIs_turno(am_mensaje.getTurno().getValue());
		lm_mensajeVo.setIs_orip(am_mensaje.getOrip().getValue());
		lm_mensajeVo.setIs_identificadorEE(am_mensaje.getIdentificadorEE().getValue());
		lm_mensajeVo.setId_fechaEnvio(UtilidadFecha.cambioGregorianADate(am_mensaje.getFechaEnvio()));
		lm_mensajeVo.setIs_tipoTramiteCurso(am_mensaje.getTipoTramiteCurso());
		lm_mensajeVo.setIs_asunto(am_mensaje.getAsunto());
		lm_mensajeVo.setIs_cuerpo(am_mensaje.getCuerpo());
		lm_mensajeVo.setIs_para(am_mensaje.getPara());
		lm_mensajeVo.setIltd_listaTipoDocumental(listaTipoDocumentalAlistaVoDocumental(am_mensaje.getTipoDocumental()));

		return lm_mensajeVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Mensaje <b>a</b> MensajeVO, <br>
	 * En otras palabras, <b>de</b> Mensaje (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Mensaje objeto con valores de
	 * servicio.
	 *
	 * @param alm_listaMensaje el parametro que representa la lista de complex types
	 *                         a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         MensajeVO.
	 */
	public static List<MensajeVO> listaTipoMensajeAListaVoMensaje(List<Mensaje> alm_listaMensaje) {
		List<MensajeVO> llm_listaMensajeVo = new ArrayList<>();

		for (Mensaje lm_mensaje : alm_listaMensaje) {
			llm_listaMensajeVo.add(tipoMensajeAVoMensaje(lm_mensaje));
		}

		return llm_listaMensajeVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoDocumental <b>a</b> TipoDocumentalVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo documental (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo documental objeto con valores
	 * de servicio.
	 *
	 * @param atd_tipoDocumental el parametro que representa el complex type a
	 *                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoDocumentalVO.
	 */
	public static TipoDocumentalVO tipoDocumentalAVoDocumental(TipoDocumental atd_tipoDocumental) {
		TipoDocumentalVO ltd_tipoDocumentalVo = new TipoDocumentalVO();

		ltd_tipoDocumentalVo.setIs_nomTipoDocumentoPublico(atd_tipoDocumental.getNomTipoDocumentoPublico());

		return ltd_tipoDocumentalVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoDocumental <b>a</b> TipoDocumentalVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo documental (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo documental objeto con valores
	 * de servicio.
	 *
	 * @param altd_listaTipoDocumental el parametro que representa la lista de
	 *                                 complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoDocumentalVO.
	 */
	public static List<TipoDocumentalVO> listaTipoDocumentalAlistaVoDocumental(
			List<TipoDocumental> altd_listaTipoDocumental) {
		List<TipoDocumentalVO> lltd_listaTipoDocumentalVo = new ArrayList<>();

		for (TipoDocumental ltd_tipoDocumental : altd_listaTipoDocumental) {
			lltd_listaTipoDocumentalVo.add(tipoDocumentalAVoDocumental(ltd_tipoDocumental));
		}

		return lltd_listaTipoDocumentalVo;
	}
}
