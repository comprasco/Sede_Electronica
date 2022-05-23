/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultaRRRMatriculasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultaRRRMatriculasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoEntradaConsultarRRRMatriculas;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.DerechoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.HipotecaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.PublicidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.ResponsabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.RestriccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoEntradaConsultarRRRMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consulta RRR
 * matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaRRRMatriculasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaRRRMatriculasConverter.
	 */
	private ConsultaRRRMatriculasConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarRRRMatriculasVO
	 * <b>a</b> TipoEntradaConsultarRRRMatriculas, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar RRR matriculas objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar RRR matriculas
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atedbm_tipoEntradaDatosBasicosMatriculaVo el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarRRRMatriculas.
	 */
	public static TipoEntradaConsultarRRRMatriculas voATipo(
			TipoEntradaConsultarRRRMatriculasVO atedbm_tipoEntradaDatosBasicosMatriculaVo) {

		TipoEntradaConsultarRRRMatriculas ltecrrm_tipoEntradaConsultarRRRMatriculas = new TipoEntradaConsultarRRRMatriculas();

		ltecrrm_tipoEntradaConsultarRRRMatriculas
				.setNumIdentificacionPredio(atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_numIdentificacionPredio());
		ltecrrm_tipoEntradaConsultarRRRMatriculas.setTipoIdentificacionPredio(
				atedbm_tipoEntradaDatosBasicosMatriculaVo.getIs_tipoIdentificacionPredio());

		return ltecrrm_tipoEntradaConsultarRRRMatriculas;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarRRRMatriculas <b>a</b>
	 * TipoSalidaConsultarRRRMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar RRR matriculas
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar RRR matriculas objeto con valores de servicio.
	 *
	 * @param atscrrrm_consultarRRRMatriculas el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarRRRMatriculasVO.
	 */
	public static TipoSalidaConsultarRRRMatriculasVO tipoAVo(
			TipoSalidaConsultarRRRMatriculas atscrrrm_consultarRRRMatriculas) {
		TipoSalidaConsultarRRRMatriculasVO ltscrm_tipoSalidaConsultarRRRMatriculasVO = new TipoSalidaConsultarRRRMatriculasVO();
		if (atscrrrm_consultarRRRMatriculas.getListaDerechos() != null)
			ltscrm_tipoSalidaConsultarRRRMatriculasVO.setIld_listaDerechos(ConsultaRRRMatriculasConverter
					.listaTipoDerechoAVo(atscrrrm_consultarRRRMatriculas.getListaDerechos().getDerecho()));
		if (atscrrrm_consultarRRRMatriculas.getListaHipotecas() != null)
			ltscrm_tipoSalidaConsultarRRRMatriculasVO.setIlh_listaHipotecas(ConsultaRRRMatriculasConverter
					.listaTipoHipotecaAVo(atscrrrm_consultarRRRMatriculas.getListaHipotecas().getHipoteca()));
		if (atscrrrm_consultarRRRMatriculas.getListaPublicidades() != null)
			ltscrm_tipoSalidaConsultarRRRMatriculasVO.setIlp_listaPublicidades(ConsultaRRRMatriculasConverter
					.listaTipoPublicidadAVo(atscrrrm_consultarRRRMatriculas.getListaPublicidades().getPublicidad()));
		if (atscrrrm_consultarRRRMatriculas.getListaResponsabilidades() != null)
			ltscrm_tipoSalidaConsultarRRRMatriculasVO.setIlr_listaResponsabilidades(
					ConsultaRRRMatriculasConverter.listaResponsabilidadesTipoAVo(atscrrrm_consultarRRRMatriculas
							.getListaResponsabilidades().getValue().getResponsabilidad()));
		if (atscrrrm_consultarRRRMatriculas.getListaRestricciones() != null)
			ltscrm_tipoSalidaConsultarRRRMatriculasVO
					.setIlr_listaRestricciones(ConsultaRRRMatriculasConverter.listaRestriccioesTipoAVo(
							atscrrrm_consultarRRRMatriculas.getListaRestricciones().getRestriccion()));
		ltscrm_tipoSalidaConsultarRRRMatriculasVO
				.setIs_codCirculoRegistral(atscrrrm_consultarRRRMatriculas.getCodCirculoRegistral());
		ltscrm_tipoSalidaConsultarRRRMatriculasVO
				.setIs_codDepartamento(atscrrrm_consultarRRRMatriculas.getCodDepartamento());
		ltscrm_tipoSalidaConsultarRRRMatriculasVO
				.setIs_codMensaje(atscrrrm_consultarRRRMatriculas.getCodMensaje().toString());
		ltscrm_tipoSalidaConsultarRRRMatriculasVO.setIs_codMunicipio(atscrrrm_consultarRRRMatriculas.getCodMunicipio());
		ltscrm_tipoSalidaConsultarRRRMatriculasVO
				.setIs_descripcionMensaje(atscrrrm_consultarRRRMatriculas.getDescripcionMensaje());
		ltscrm_tipoSalidaConsultarRRRMatriculasVO
				.setIs_numMatriculaInmobiliaria(atscrrrm_consultarRRRMatriculas.getNumMatriculaInmobiliaria());
		return ltscrm_tipoSalidaConsultarRRRMatriculasVO;
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
	 * Especificamente convierte <b>de</b> Restriccion <b>a</b> RestriccionVO, <br>
	 * En otras palabras, <b>de</b> Restriccion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Restriccion objeto con valores de
	 * servicio.
	 *
	 * @param alr_restriccion el parametro que representa la lista de complex types
	 *                        a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         RestriccionVO.
	 */
	private static List<RestriccionVO> listaRestriccioesTipoAVo(List<Restriccion> alr_restriccion) {
		List<RestriccionVO> llr_resrticcionesVo = new ArrayList<RestriccionVO>();
		for (Restriccion lr_restriccionVO : alr_restriccion)
			llr_resrticcionesVo.add(ConsultaRRRMatriculasConverter.tipoAVo(lr_restriccionVO));

		return llr_resrticcionesVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Restriccion <b>a</b> RestriccionVO, <br>
	 * En otras palabras, <b>de</b> Restriccion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Restriccion objeto con valores de
	 * servicio.
	 *
	 * @param lr_restriccion el parametro que representa el complex type a
	 *                       convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RestriccionVO.
	 */
	private static RestriccionVO tipoAVo(Restriccion lr_restriccion) {
		RestriccionVO lr_restriccionVO = new RestriccionVO();
		if(lr_restriccion.getFechaAnotacion() != null)
			lr_restriccionVO.setId_fechaAnotacion(UtilidadFecha.cambioGregorianADate(lr_restriccion.getFechaAnotacion()));
		lr_restriccionVO.setIli_intervinientes(
				IntervinientesDrrConverter.listaTipoAListaVo(lr_restriccion.getIntervinientes()));
		lr_restriccionVO.setIs_codNaturalezaJuridicaFolio(lr_restriccion.getCodNaturalezaJuridicaFolio());
		lr_restriccionVO.setIs_comentario(lr_restriccion.getComentario());
		lr_restriccionVO.setIs_dominioDRR(lr_restriccion.getDominioDRR());
		lr_restriccionVO.setIs_nomNaturalezaJuridicaFolio(lr_restriccion.getNomNaturalezaJuridicaFolio());
		lr_restriccionVO.setIs_numAnotacion(lr_restriccion.getNumAnotacion());
		return lr_restriccionVO;
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
	 * Especificamente convierte <b>de</b> Responsabilidad <b>a</b>
	 * ResponsabilidadVO, <br>
	 * En otras palabras, <b>de</b> Responsabilidad (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Responsabilidad objeto con valores
	 * de servicio.
	 *
	 * @param alr_listaResponsabilidades el parametro que representa la lista de
	 *                                   complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ResponsabilidadVO.
	 */
	private static List<ResponsabilidadVO> listaResponsabilidadesTipoAVo(
			List<Responsabilidad> alr_listaResponsabilidades) {
		List<ResponsabilidadVO> llr_responsabilidadVO = new ArrayList<ResponsabilidadVO>();

		for (Responsabilidad lr_responsabilidad : alr_listaResponsabilidades)
			llr_responsabilidadVO.add(ConsultaRRRMatriculasConverter.tipoAVo(lr_responsabilidad));

		return llr_responsabilidadVO;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Responsabilidad <b>a</b>
	 * ResponsabilidadVO, <br>
	 * En otras palabras, <b>de</b> Responsabilidad (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Responsabilidad objeto con valores
	 * de servicio.
	 *
	 * @param lr_responsabilidad el parametro que representa el complex type a
	 *                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ResponsabilidadVO.
	 */
	private static ResponsabilidadVO tipoAVo(Responsabilidad lr_responsabilidad) {
		ResponsabilidadVO lr_responsabilidadVo = new ResponsabilidadVO();

		lr_responsabilidadVo
				.setId_fechaAnotacion(UtilidadFecha.cambioGregorianADate(lr_responsabilidad.getFechaAnotacion()));
		lr_responsabilidadVo.setIli_intervinientes(
				IntervinientesDrrConverter.listaTipoAListaVo(lr_responsabilidad.getIntervinientes()));
		lr_responsabilidadVo.setIs_codNaturalezaJuridicaFolio(lr_responsabilidad.getCodNaturalezaJuridicaFolio());
		lr_responsabilidadVo.setIs_comentario(lr_responsabilidad.getComentario());
		lr_responsabilidadVo.setIs_dominioDRR(lr_responsabilidad.getDominioDRR());
		lr_responsabilidadVo.setIs_nomNaturalezaJuridicaFolio(lr_responsabilidad.getNomNaturalezaJuridicaFolio());
		lr_responsabilidadVo.setIs_numAnotacion(lr_responsabilidad.getNumAnotacion());

		return lr_responsabilidadVo;
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
	 * Especificamente convierte <b>de</b> Publicidad <b>a</b> PublicidadVO, <br>
	 * En otras palabras, <b>de</b> Publicidad (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Publicidad objeto con valores de
	 * servicio.
	 *
	 * @param alp_publicidad el parametro que representa la lista de complex types a
	 *                       convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         PublicidadVO.
	 */
	private static List<PublicidadVO> listaTipoPublicidadAVo(List<Publicidad> alp_publicidad) {
		List<PublicidadVO> llp_publicidadVO = new ArrayList<PublicidadVO>();

		for (Publicidad lp_publicidad : alp_publicidad)
			llp_publicidadVO.add(ConsultaRRRMatriculasConverter.tipoAVo(lp_publicidad));

		return llp_publicidadVO;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Publicidad <b>a</b> PublicidadVO, <br>
	 * En otras palabras, <b>de</b> Publicidad (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Publicidad objeto con valores de
	 * servicio.
	 *
	 * @param ap_publicidad el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como PublicidadVO.
	 */
	private static PublicidadVO tipoAVo(Publicidad ap_publicidad) {
		PublicidadVO lp_publicidad = new PublicidadVO();

		lp_publicidad.setId_fechaAnotacion(UtilidadFecha.cambioGregorianADate(ap_publicidad.getFechaAnotacion()));
		lp_publicidad
				.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaVo(ap_publicidad.getIntervinientes()));
		lp_publicidad.setIs_codNaturalezaJuridicaFolio(ap_publicidad.getCodNaturalezaJuridicaFolio());
		lp_publicidad.setIs_comentario(ap_publicidad.getComentario());
		lp_publicidad.setIs_dominioDRR(ap_publicidad.getDominioDRR());
		lp_publicidad.setIs_numAnotacion(ap_publicidad.getNumAnotacion());
		lp_publicidad.setIs_nomNaturalezaJuridicaFolio(ap_publicidad.getNomNaturalezaJuridicaFolio());

		return lp_publicidad;
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
	 * Especificamente convierte <b>de</b> Hipoteca <b>a</b> HipotecaVO, <br>
	 * En otras palabras, <b>de</b> Hipoteca (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Hipoteca objeto con valores de
	 * servicio.
	 *
	 * @param alh_hipoteca el parametro que representa la lista de complex types a
	 *                     convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         HipotecaVO.
	 */
	private static List<HipotecaVO> listaTipoHipotecaAVo(List<Hipoteca> alh_hipoteca) {
		List<HipotecaVO> llh_hipotecaVO = new ArrayList<HipotecaVO>();

		for (Hipoteca lh_hipoteca : alh_hipoteca)
			llh_hipotecaVO.add(ConsultaRRRMatriculasConverter.tipoAVo(lh_hipoteca));

		return llh_hipotecaVO;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Hipoteca <b>a</b> HipotecaVO, <br>
	 * En otras palabras, <b>de</b> Hipoteca (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Hipoteca objeto con valores de
	 * servicio.
	 *
	 * @param ah_hipoteca el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como HipotecaVO.
	 */
	private static HipotecaVO tipoAVo(Hipoteca ah_hipoteca) {
		HipotecaVO lh_hipotecaVo = new HipotecaVO();

		lh_hipotecaVo
				.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaVo(ah_hipoteca.getIntervinientes()));
		lh_hipotecaVo.setIs_codNaturalezaJuridicaFolio(ah_hipoteca.getCodNaturalezaJuridicaFolio());
		lh_hipotecaVo.setIs_comentario(ah_hipoteca.getComentario());
		lh_hipotecaVo.setIs_dominioDRR(ah_hipoteca.getDominioDRR());
		lh_hipotecaVo.setId_fechaAnotacion(UtilidadFecha.cambioGregorianADate(ah_hipoteca.getFechaAnotacion()));
		lh_hipotecaVo.setIs_nomNaturalezaJuridicaFolio(ah_hipoteca.getNomNaturalezaJuridicaFolio());
		lh_hipotecaVo.setIs_numAnotacion(ah_hipoteca.getNumAnotacion());

		return lh_hipotecaVo;
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
	 * Especificamente convierte <b>de</b> Derecho <b>a</b> DerechoVO, <br>
	 * En otras palabras, <b>de</b> Derecho (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Derecho objeto con valores de
	 * servicio.
	 *
	 * @param ald_derecho el parametro que representa la lista de complex types a
	 *                    convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         DerechoVO.
	 */
	private static List<DerechoVO> listaTipoDerechoAVo(List<Derecho> ald_derecho) {
		List<DerechoVO> llr_derechoVO = new ArrayList<DerechoVO>();

		for (Derecho ld_derecho : ald_derecho)
			llr_derechoVO.add(ConsultaRRRMatriculasConverter.tipoAVo(ld_derecho));

		return llr_derechoVO;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Derecho <b>a</b> DerechoVO, <br>
	 * En otras palabras, <b>de</b> Derecho (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Derecho objeto con valores de
	 * servicio.
	 *
	 * @param ad_derecho el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como DerechoVO.
	 */
	private static DerechoVO tipoAVo(Derecho ad_derecho) {
		DerechoVO ld_derecho = new DerechoVO();

		ld_derecho.setId_fechaAnotacion(UtilidadFecha.cambioGregorianADate(ad_derecho.getFechaAnotacion()));
		ld_derecho.setIli_intervinientes(IntervinientesDrrConverter.listaTipoAListaVo(ad_derecho.getIntervinientes()));
		ld_derecho.setIs_codNaturalezaJuridicaFolio(ad_derecho.getCodNaturalezaJuridicaFolio());
		ld_derecho.setIs_comentario(ad_derecho.getComentario());
		ld_derecho.setIs_dominioDRR(ad_derecho.getDominioDRR());
		ld_derecho.setIs_nomNaturalezaJuridicaFolio(ad_derecho.getNomNaturalezaJuridicaFolio());
		ld_derecho.setIs_numAnotacion(ad_derecho.getNumAnotacion());

		return ld_derecho;
	}

}
