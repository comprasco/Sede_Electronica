/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GeneradorGrowlGenerico.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: GeneradorGrowlGenerico
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.LenguajeSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ExcepcionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumAlertas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * El elemento Class GeneradorGrowlGenerico.<br>
 * Representa un/una generador growl generico.<br>
 * Clase que permite activar los growls a partir de excepciones o textos simples
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GeneradorGrowlGenerico {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(GeneradorGrowlGenerico.class);
	
	/**
	 * Construye una nueva instancia/objeto de la clase GeneradorGrowlGenerico.
	 */
	private GeneradorGrowlGenerico() {
	}

	/**
	 * Metodo que permite generar mensaje de excepcion a partir de un modelo
	 * generico de excepcion.
	 *
	 * @param aeg_modeloGenericoExcepcionDto modelo de excepcion
	 */
	public static void manejadorExcepcionesPresentacion(ExcepcionGenericaDTO aeg_modeloGenericoExcepcionDto) {

		EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
				.consultarTipoExcepcion(aeg_modeloGenericoExcepcionDto.consultarTipoExcepcion());

		if (lete_tipoExcepcion != null) {
			generarMensajeExcepcion(lete_tipoExcepcion, aeg_modeloGenericoExcepcionDto);
		} else {
			generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, aeg_modeloGenericoExcepcionDto);
		}

	}

	/**
	 * Metodo que permite manejar las excepciones directamtente para presentar un
	 * mensaje.
	 *
	 * @param ae_excepcion Excepcion generada
	 * @param al_logger    logger para registro de auditoria
	 * @param as_idioma    Idioma
	 */
	public static void manejadorExcepcionesPresentacion(Exception ae_excepcion, Logger al_logger, String as_idioma) {

		ExcepcionGenericaDTO leg_respuestaDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion,
				al_logger, as_idioma);
		EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
				.consultarTipoExcepcion(leg_respuestaDto.consultarTipoExcepcion());

		if (lete_tipoExcepcion != null) {
			generarMensajeExcepcion(lete_tipoExcepcion, leg_respuestaDto);
		} else {
			generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, leg_respuestaDto);
		}

	}

	/**
	 * Metodo que permite manejar las excepciones directamtente para presentar un
	 * mensaje.
	 *
	 * @param ae_excepcion Excepcion generada
	 * @param as_idioma    Idioma
	 */
	public static void manejadorExcepcionesPresentacion(Exception ae_excepcion, String as_idioma) {
		ExcepcionGenericaDTO leg_respuestaDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, null,
				as_idioma);
		EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
				.consultarTipoExcepcion(leg_respuestaDto.consultarTipoExcepcion());
		if (lete_tipoExcepcion != null) {
			generarMensajeExcepcion(lete_tipoExcepcion, leg_respuestaDto);
		} else {
			generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, leg_respuestaDto);
		}
	}

	/**
	 * Metodo que permite manejar las excepciones directamtente para presentar un
	 * mensaje.
	 *
	 * @param ae_excepcion Excepcion generada
	 */
	public static void manejadorExcepcionPresentacion(Exception ae_excepcion) {
		LenguajeSelector lls_lenguaje = new LenguajeSelector();
		String ls_idioma = lls_lenguaje.getLocale().toString();
		ExcepcionGenericaDTO leg_respuestaDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, null,
				ls_idioma);
		EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
				.consultarTipoExcepcion(leg_respuestaDto.consultarTipoExcepcion());
		if (lete_tipoExcepcion != null) {
			generarMensajeInformacion(leg_respuestaDto.consultarMensajeExcepcion());
		} else {
			generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, leg_respuestaDto);
		}
	}

	/**
	 * Metodo que permite manejar las excepciones directamtente para presentar un
	 * mensaje.
	 *
	 * @param ae_excepcion Excepcion generada
	 */
	public static void manejadorExcepcionesPresentacion(Exception ae_excepcion) {
		try {
			LenguajeSelector lls_lenguaje = new LenguajeSelector();
			String ls_idioma = lls_lenguaje.getLocale().toString();
			ExcepcionGenericaDTO leg_respuestaDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, null,ls_idioma);
			EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
					.consultarTipoExcepcion(leg_respuestaDto.consultarTipoExcepcion());
			if (lete_tipoExcepcion != null) {
				generarMensajeExcepcion(lete_tipoExcepcion, leg_respuestaDto);
			} else {
				generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, leg_respuestaDto);
			}
		} catch (Exception ae_excepcionFinal) {
			CL_LOGGER.error(EnumMensajesLog.CONTROL_EXCEPCION_FALLIDO.getIs_criterio());
			FacesMessage lfm_mensaje = new FacesMessage(EnumMensajesLog.CONTROL_EXCEPCION_FALLIDO.getIs_criterio());
			PrimeFaces.current().executeScript(
					String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
		}
	}

	/**
	 * Metodo que permite manejar las excepciones directamtente para presentar un
	 * mensaje.
	 *
	 * @param ae_excepcion Excepcion generada
	 * @param as_idioma    idioma
	 * @param afc_context  contexto visual
	 */
	public static void manejadorExcepcionesPresentacion(Exception ae_excepcion, String as_idioma,
			FacesContext afc_context) {
		ExcepcionGenericaDTO leg_respuestaDto = UtilidadExcepciones.manejadorExcepcionesRespuesta(ae_excepcion, null,
				as_idioma);
		EnumTipoExcepciones lete_tipoExcepcion = EnumTipoExcepciones
				.consultarTipoExcepcion(leg_respuestaDto.consultarTipoExcepcion());
		if (lete_tipoExcepcion != null) {
			generarMensajeExcepcion(lete_tipoExcepcion, leg_respuestaDto, afc_context);
		} else {
			generarMensajeExcepcion(EnumTipoExcepciones.VALIDACION_DESCONOCIDO, leg_respuestaDto);
		}
	}

	/**
	 * Metodo que permite generar mensaje de excepcion.
	 *
	 * @param aete_tipoExcepcion             tipo de excepcion
	 * @param aeg_modeloGenericoExcepcionDto Modelo generico de excepcion
	 */
	public static void generarMensajeExcepcion(EnumTipoExcepciones aete_tipoExcepcion,
			ExcepcionGenericaDTO aeg_modeloGenericoExcepcionDto) {

		FacesMessage lfm_mensaje = new FacesMessage(aete_tipoExcepcion.consultarIs_severidad(), consultarEncabezado(),
				aeg_modeloGenericoExcepcionDto.consultarMensajeExcepcion());
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
	}

	/**
	 * Metodo que permite generar mensaje de excepcion.
	 *
	 * @param aete_tipoExcepcion             tipo de excepcion
	 * @param aeg_modeloGenericoExcepcionDto Modelo generico de excepcion
	 * @param afc_contexto                   contexto visual
	 */
	public static void generarMensajeExcepcion(EnumTipoExcepciones aete_tipoExcepcion,
			ExcepcionGenericaDTO aeg_modeloGenericoExcepcionDto, FacesContext afc_contexto) {
		FacesMessage lfm_mensaje = new FacesMessage(aete_tipoExcepcion.consultarIs_severidad(), consultarEncabezado(),
				aeg_modeloGenericoExcepcionDto.consultarMensajeExcepcion());
		afc_contexto.addMessage(null, lfm_mensaje);
		PrimeFaces.current()
				.executeScript(String.format(EnumAlertas.ALERTAR.getIs_criterio(), afc_contexto, EnumAlertas.ERROR));
	}

	/**
	 * Metodo para generar mensajes exitoso.
	 *
	 * @param as_mensaje mensaje a mostrar
	 */
	public static void generarMensajeExitoso(String as_mensaje) {
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, consultarEncabezado(), as_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.CONFIRMACION));
	}

	/**
	 * Metodo para generar mensaje exitoso.
	 *
	 * @param aiecm_catalogoMensaje enum con mensaje internacionalizado
	 */
	public static void generarMensajeExitoso(IEnumCatalogoMensajes aiecm_catalogoMensaje) {
		String ls_mensaje = LenguajeUtilidad.consultarMensaje(aiecm_catalogoMensaje,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, consultarEncabezado(), ls_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.CONFIRMACION));
	}

	/**
	 * Metodo para generar mensajes de error.
	 *
	 * @param as_mensaje mensaje a mostrar
	 */
	public static void generarMensajeError(String as_mensaje) {
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, consultarEncabezado(), as_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
	}

	/**
	 * Metodo para generar mensajes error.
	 *
	 * @param aiecm_catalogoMensaje enum con mensaje internacionalizado
	 */
	public static void generarMensajeError(IEnumCatalogoMensajes aiecm_catalogoMensaje) {
		String ls_mensaje = LenguajeUtilidad.consultarMensaje(aiecm_catalogoMensaje,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, consultarEncabezado(), ls_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
	}

	/**
	 * Metodo para generar mensajes fatal.
	 *
	 * @param as_mensaje mensaje a mostrar
	 */
	public static void generarMensajeFatal(String as_mensaje) {
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_FATAL, consultarEncabezado(), as_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
	}

	/**
	 * Metodo para generar mensajes fatal.
	 *
	 * @param aiecm_catalogoMensaje el parametro catalogo mensaje
	 */
	public static void generarMensajeFatal(IEnumCatalogoMensajes aiecm_catalogoMensaje) {
		String ls_mensaje = LenguajeUtilidad.consultarMensaje(aiecm_catalogoMensaje,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_FATAL, consultarEncabezado(), ls_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.ERROR));
	}

	/**
	 * Metodo para generar mensajes informacion.
	 *
	 * @param as_mensaje mensaje a mostrar
	 */
	public static void generarMensajeInformacion(String as_mensaje) {
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, consultarEncabezado(), as_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.INFORMACION));
	}

	/**
	 * Metodo para generar mensajes informacion.
	 *
	 * @param aiecm_catalogoMensaje enum con mensaje internacionalizado
	 */
	public static void generarMensajeInformacion(IEnumCatalogoMensajes aiecm_catalogoMensaje) {
		String ls_mensaje = LenguajeUtilidad.consultarMensaje(aiecm_catalogoMensaje,
				EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
		FacesMessage lfm_mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, consultarEncabezado(), ls_mensaje);
		PrimeFaces.current().executeScript(
				String.format(EnumAlertas.ALERTAR.getIs_criterio(), lfm_mensaje.getDetail(), EnumAlertas.INFORMACION));
	}

	/**
	 * Metodo para generar el encabezado de mensaje internacionalizado.
	 *
	 * @return Resultado para consultar encabezado retornado como String
	 */
	private static String consultarEncabezado() {
		String ls_encabezado;
		ls_encabezado = UtilidadExcepciones.consultarExcepcion(EnumExcepcionesGenerales.MENSAJE, new String[] {},
				LenguajeUtilidad.consultarIdioma(), EnumTipoExcepciones.VALIDACION_DESCONOCIDO);
		return ls_encabezado;
	}
}
