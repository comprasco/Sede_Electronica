/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadExcepciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadExcepciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.MissingFormatArgumentException;

import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.TransactionRolledbackLocalException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;
import org.eclipse.persistence.exceptions.DatabaseException;

import com.sun.xml.ws.client.ClientTransportException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesTecnicas;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n.PropiedadesSelector;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ExcepcionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;

/**
 * El elemento Class UtilidadExcepciones.<br>
 * Representa un/una utilidad excepciones.<br>
 * Clase que permite recibir excepciones, consulta los mensajes en los archivos
 * de internacionalizacion y genera estructuras de datos correctas para manejar
 * dichas excepciones
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadExcepciones {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadExcepciones.
	 */
	private UtilidadExcepciones() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(UtilidadExcepciones.class);

	/**
	 * Define la constante CS_MATRICULA_TRASLADADA.
	 */
	private static final String CS_MATRICULA_TRASLADADA = "El certificado no se puede expedir porque el folio %s se encuentra trasladado.";

	/**
	 * Define la constante CS_MATRICULA_ANULADA.
	 */
	private static final String CS_MATRICULA_ANULADA = "El certificado no se puede expedir porque el folio %s se encuentra anulado.";

	/**
	 * Metodo que recibe las excepciones y retorna un modelo con la información de
	 * la excepcion.
	 *
	 * @param ae_excepcion excepción generada en el sistema
	 * @param ao_clase     el parametro clase
	 * @param as_lenguaje  lenguaje del cual se va a consultar el mensaje de error
	 * @return Modelo con la excepcion generada
	 */
	public static ExcepcionGenericaDTO manejadorExcepcionesRespuesta(Exception ae_excepcion, Object ao_clase,
			String as_lenguaje) {

		Logger ll_logger = CL_LOGGER;

		if (ao_clase != null) {
			ll_logger = Logger.getLogger(ao_clase.getClass());
		}

		// Valida si son problemas de datos de entrada
		if (ae_excepcion.getCause() instanceof ExcepcionesDatosEntrada
				|| ae_excepcion instanceof ExcepcionesDatosEntrada) {

			ExcepcionesDatosEntrada lede_excepcinoEspecifica = (ExcepcionesDatosEntrada) (ae_excepcion
					.getCause() == null ? ae_excepcion : ae_excepcion.getCause());
			String ls_mensajePropiedades = consultarExcepcion(lede_excepcinoEspecifica.consultarCatalogo(),
					lede_excepcinoEspecifica.consultarMensajeExcepcion(), as_lenguaje,
					EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA);
			ll_logger.error(ls_mensajePropiedades + lede_excepcinoEspecifica.getMessage(), lede_excepcinoEspecifica);
			return crearModelo(lede_excepcinoEspecifica.consultarCodigoExcepcion(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_DATOS_ENTRADA.consultarIs_nombre());
		}
		// Valida si son problemas de Excepciones de negocio
		else if (ae_excepcion.getCause() instanceof ExcepcionesNegocio || ae_excepcion instanceof ExcepcionesNegocio) {

			ExcepcionesNegocio le_excepcionEspecifica = (ExcepcionesNegocio) (ae_excepcion.getCause() == null
					? ae_excepcion
					: ae_excepcion.getCause());
			String ls_mensajePropiedades = consultarExcepcion(le_excepcionEspecifica.consultarCatalogo(),
					le_excepcionEspecifica.consultarMensajeExcepcion(), as_lenguaje,
					EnumTipoExcepciones.VALIDACION_NEGOCIO);
			ll_logger.error(ls_mensajePropiedades + le_excepcionEspecifica.getMessage(), le_excepcionEspecifica);

			return crearModelo(le_excepcionEspecifica.consultarCodigoExcepcion(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_NEGOCIO.consultarIs_nombre());
		}
		// Valida si son problemas de excepciones tecnicas
		else if (ae_excepcion.getCause() instanceof ExcepcionesTecnicas
				|| ae_excepcion instanceof ExcepcionesTecnicas) {

			ExcepcionesTecnicas le_excepcionEspecifica = (ExcepcionesTecnicas) (ae_excepcion.getCause() == null
					? ae_excepcion
					: ae_excepcion.getCause());
			String ls_mensajePropiedades = consultarExcepcion(le_excepcionEspecifica.consultarCatalogo(),
					le_excepcionEspecifica.consultarMensajeExcepcion(), as_lenguaje,
					EnumTipoExcepciones.VALIDACION_TECNICA);
			ll_logger.error(ls_mensajePropiedades + le_excepcionEspecifica.getMessage(), le_excepcionEspecifica);

			return crearModelo(le_excepcionEspecifica.consultarCodigoExcepcion(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_TECNICA.consultarIs_nombre());
		} else if (ae_excepcion instanceof TransactionRolledbackLocalException) {

			TransactionRolledbackLocalException ltrle_expcepcion = (TransactionRolledbackLocalException) ae_excepcion;
			String ls_mensajePropiedades = manejadorExcepcionPersistenceEjb(
					(PersistenceException) ltrle_expcepcion.getCause(), as_lenguaje);
			ll_logger.error(ls_mensajePropiedades + ltrle_expcepcion.getMessage(), ltrle_expcepcion);

			return crearModelo(EnumExcepcionesGenerales.ERROR_TECNICO.consultarIs_codigo(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_NEGOCIO.consultarIs_nombre());

		} else if (ae_excepcion instanceof EJBTransactionRolledbackException) {

			EJBTransactionRolledbackException letre_expcepcion = (EJBTransactionRolledbackException) ae_excepcion;
			String ls_mensajePropiedades = manejadorExcepcionTransacionesEjb(letre_expcepcion, as_lenguaje);
			ll_logger.error(ls_mensajePropiedades + letre_expcepcion.getMessage(), letre_expcepcion);

			return crearModelo(EnumExcepcionesGenerales.ERROR_TECNICO.consultarIs_codigo(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_TECNICA.consultarIs_nombre());

		} else {
			String ls_mensajePropiedades = consultarExcepcion(EnumExcepcionesGenerales.ERROR_TECNICO,
					new String[] { "" }, as_lenguaje, EnumTipoExcepciones.VALIDACION_TECNICA);
			ll_logger.error(ls_mensajePropiedades + ae_excepcion.getMessage(), ae_excepcion);

			return crearModelo(EnumExcepcionesGenerales.ERROR_TECNICO.consultarIs_codigo(), ls_mensajePropiedades,
					EnumTipoExcepciones.VALIDACION_TECNICA.consultarIs_nombre());
		}
	}

	/**
	 * Manejador excepciones respuesta.
	 *
	 * @param ae_excepcion el parametro excepcion
	 * @param ao_clase     el parametro clase
	 * @return Resultado para manejador excepciones respuesta retornado como
	 *         ExcepcionGenericaDTO
	 */
	public static ExcepcionGenericaDTO manejadorExcepcionesRespuesta(Exception ae_excepcion, Object ao_clase) {
		return manejadorExcepcionesRespuesta(ae_excepcion, ao_clase, LenguajeUtilidad.consultarIdioma());
	}

	/**
	 * Metodo que genera un modelo de datos que contiene propiedades de una
	 * excepcion.
	 *
	 * @param as_codigoExcepcion  condigo de la excepcion generada
	 * @param as_mensajeExcepcion mensaje de la excepcion
	 * @param as_tipoExcepcion    tipo de excepcion
	 * @return modelo de datos de la excepcion
	 */
	private static ExcepcionGenericaDTO crearModelo(String as_codigoExcepcion, String as_mensajeExcepcion,
			String as_tipoExcepcion) {

		ExcepcionGenericaDTO leg_excepcionDto = new ExcepcionGenericaDTO();

		leg_excepcionDto.actualizarCodigoExcepcion(as_codigoExcepcion);
		leg_excepcionDto.actualizarMensajeExcepcion(as_mensajeExcepcion);
		leg_excepcionDto.actualizarTipoExcepcion(as_tipoExcepcion);

		return leg_excepcionDto;
	}

	/**
	 * Metodo que consulta la excepcion al bundle de mensajes internacionalizados.
	 *
	 * @param aiece_catalogo          catalogo que contiene la información del
	 *                                bundle a consultar
	 * @param as_informacionExcepcion Arreglo que contiene información para insertar
	 *                                en el mensaje base existente en el bundle
	 * @param as_idioma               idioma en el que se requiere el mensaje de
	 *                                error
	 * @param aete_excepcionesDefecto Información de la expcepcion en caso que se
	 *                                genere un problema con la lectura del
	 *                                bundleExcepcion por defecto
	 * @return Retorna el mensaje a mostrar al usuario
	 */
	public static String consultarExcepcion(IEnumCatalogoMensajes aiece_catalogo, String[] as_informacionExcepcion,
			String as_idioma, EnumTipoExcepciones aete_excepcionesDefecto) {

		String ls_mensaje = PropiedadesSelector.consultarPropiedades(
				String.format(aiece_catalogo.consultarIs_nombreArchivo(), as_idioma),
				aiece_catalogo.consultarIs_codigo());

		try {
			ls_mensaje = String.format(ls_mensaje, (Object[]) as_informacionExcepcion);
		} catch (MissingFormatArgumentException e) {
			return aete_excepcionesDefecto.consultarIs_detalleNombre();
		}

		return ls_mensaje;
	}

	/**
	 * Metodo que recibe la excepcion de tipo TransactionRolledbackLocalException y
	 * retorna un mensaje segun la violacion de constraint.
	 * 
	 * @param atrle_excepcion excepción generada en el sistema
	 * @param as_idioma       lenguaje del cual se va a consultar el mensaje de
	 *                        error
	 * @return Mensaje con la excepcion generada
	 */
	private static String manejadorExcepcionPersistenceEjb(PersistenceException atrle_excepcion, String as_idioma) {

		String ls_mensaje = consultarExcepcion(EnumExcepcionesGenerales.ERROR_TECNICO, new String[] {}, as_idioma,
				EnumTipoExcepciones.VALIDACION_TECNICA);

		if (atrle_excepcion instanceof PersistenceException) {

			PersistenceException lpe_persistenciaExcepcion = atrle_excepcion;
			if(lpe_persistenciaExcepcion instanceof NoResultException) {
				ls_mensaje = consultarExcepcion(EnumExcepcionesGenerales.DATOS_INEXISTENTES_GENERAL, new String[] {},
						as_idioma, EnumTipoExcepciones.VALIDACION_TECNICA);
			}else {
				DatabaseException ldbe_baseDatosExcepcion = (DatabaseException) lpe_persistenciaExcepcion.getCause();
				
				if (ldbe_baseDatosExcepcion.getCause() instanceof SQLIntegrityConstraintViolationException) {
					if (ldbe_baseDatosExcepcion.getCause().getLocalizedMessage()
							.contains("IDU_AUT_USUARIO_CORREO_ELECTRONICO")) {
						ls_mensaje = consultarExcepcion(EnumExcepcionesPersona.CORREO_ELECTRONICO_EXISTENTE,
								new String[] {}, as_idioma, EnumTipoExcepciones.VALIDACION_TECNICA);
					}
					
					else if (ldbe_baseDatosExcepcion.getCause().getLocalizedMessage().contains("IDU_AUT_USUARIO_USUARIO")) {
						ls_mensaje = consultarExcepcion(EnumExcepcionesPersona.NUMERO_DOCUMENTO_EXISTENTE, new String[] {},
								as_idioma, EnumTipoExcepciones.VALIDACION_TECNICA);
						
					} else if (ldbe_baseDatosExcepcion.getCause().getLocalizedMessage().contains("IDU_ACC_MODELO_MINUTA")) {
						ls_mensaje = consultarExcepcion(EnumExcepcionesModeloMinuta.NOMBRE_MODELO_MINUTA, new String[] {},
								as_idioma, EnumTipoExcepciones.VALIDACION_TECNICA);
						
					} else if (ldbe_baseDatosExcepcion.getCause().getLocalizedMessage()
							.contains("IDU_ACC_MODELO_MINUTA_NOMBRE")) {
						ls_mensaje = consultarExcepcion(EnumExcepcionesModeloMinuta.NOMBRE_MODELO_MINUTA, new String[] {},
								as_idioma, EnumTipoExcepciones.VALIDACION_TECNICA);
						
					}
				}				
			}
		}
		return ls_mensaje;
	}

	/**
	 * Metodo que sirve para verificar los codigo de error de los servicios.
	 *
	 * @param aiss_salidaServicioVo salida de servicios a verificar
	 */
	public static void manejadorExcepcionesServicios(ISalidaServicioWSDTO aiss_salidaServicioVo) {
		
		if (aiss_salidaServicioVo.getIs_codigoMensaje() == null) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_404.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.CODIGO_GENERO_NO_VALIDO);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_SERVICIO);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_461.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
		if(aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_504.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_DEVOLUCION);
		}
		if(aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_508.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_DEVOLUCION_ACTOS);
		}
		if(aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_400.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_DEVOLUCION_RECEPCION);
		}
		if(aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_526.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.CALIDAD_SOLICITANTE_NO_VALIDA);
		}
		if(aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_419.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_SERVICIO);
		}
		
	}

	/**
	 * Metodo que sirve para verificar los codigo de error del servicio de historial
	 * solicitudes.
	 *
	 * @param aiss_salidaServicioVo salida de historial solicitudes
	 */
	public static void manejadorExcepcionesServiciosHistorial(ISalidaServicioWSDTO aiss_salidaServicioVo) {
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
		if (aiss_salidaServicioVo.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_461.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioVo.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		}
	}

	/**
	 * Manejador excepcion servicios.
	 *
	 * @param aiss_salidaServicioWsDto el parametro salida servicio ws dto
	 */
	public static void manejadorExcepcionServicios(ISalidaServicioWSDTO aiss_salidaServicioWsDto) {
		if (aiss_salidaServicioWsDto.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioWsDto.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_NO_INFO);
		}
		if (aiss_salidaServicioWsDto.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioWsDto.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_SERVICIO);
		}
	}

	/**
	 * Metodo que sirve para verificar los codigo de error del servicio de consulta
	 * tarifa en el caso de certificados y validar las matriculas trasladadas y
	 * anuladas.
	 *
	 * @param aiss_salidaServicioWsDto salida del servicio de consulta tarifa
	 * @param as_matricula             datos de matricula
	 */
	public static void manejadorExcepcionServiciosCertificados(ISalidaServicioWSDTO aiss_salidaServicioWsDto,
			String as_matricula) {
		if (aiss_salidaServicioWsDto.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioWsDto.getIs_descripcionMensaje());
			String ls_trasaldada = String.format(CS_MATRICULA_TRASLADADA, as_matricula);
			String ls_anulada = String.format(CS_MATRICULA_ANULADA, as_matricula);
			if (aiss_salidaServicioWsDto.getIs_descripcionMensaje().equals(ls_trasaldada))
				throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_MATRICULA_TRASLADADA);
			else if (aiss_salidaServicioWsDto.getIs_descripcionMensaje().equals(ls_anulada))
				throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_MATRICULA_ANULADA);
			else
				throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_NO_INFO);
		}
		if (aiss_salidaServicioWsDto.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_500.getIs_codigo())) {
			CL_LOGGER.error(aiss_salidaServicioWsDto.getIs_descripcionMensaje());
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_SERVICIO);
		}
	}

	/**
	 * Manejador excepcion T client transport ejb.
	 *
	 * @param as_idioma el parametro idioma
	 * @return Resultado para manejador excepcion T client transport ejb retornado
	 *         como String
	 */
	private static String manejadorExcepcionTClientTransportEjb(String as_idioma) {

		String ls_mensaje;
		ls_mensaje = consultarExcepcion(EnumExcepcionesGenerales.DATOS_SOAP_INCORRECTOS, new String[] {}, as_idioma,
				EnumTipoExcepciones.VALIDACION_TECNICA);
		return ls_mensaje;
	}

	/**
	 * Manejador excepcion transaciones ejb.
	 *
	 * @param atre_excepcion el parametro excepcion
	 * @param as_lenguaje    el parametro lenguaje
	 * @return Resultado para manejador excepcion transaciones ejb retornado como
	 *         String
	 */
	private static String manejadorExcepcionTransacionesEjb(EJBTransactionRolledbackException atre_excepcion,
			String as_lenguaje) {

		String ls_mensajePropiedades = consultarExcepcion(EnumExcepcionesGenerales.ERROR_TECNICO, new String[] {},
				as_lenguaje, EnumTipoExcepciones.VALIDACION_TECNICA);
		if (atre_excepcion.getCause() instanceof PersistenceException) {
			ls_mensajePropiedades = manejadorExcepcionPersistenceEjb((PersistenceException) atre_excepcion.getCause(),
					as_lenguaje);
		} else if (atre_excepcion.getCause() instanceof ClientTransportException) {
			ls_mensajePropiedades = manejadorExcepcionTClientTransportEjb(as_lenguaje);
		}
		return ls_mensajePropiedades;
	}

}
