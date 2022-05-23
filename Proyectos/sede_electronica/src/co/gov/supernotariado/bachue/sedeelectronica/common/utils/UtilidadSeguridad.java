/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadSeguridad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadSeguridad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;

import org.jboss.logging.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm;

import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanDevolucionesServicioRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumExtension;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPermisoURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumSeguridad;

/**
 * El elemento Class UtilidadSeguridad.<br>
 * Representa un/una utilidad seguridad.<br>
 * Clase que permite gestionar utilidades de la capa de seguridad
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadSeguridad {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanDevolucionesServicioRegistral.class);
	
	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadSeguridad.
	 */
	private UtilidadSeguridad() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que permite generar hash de contrasena a partir del texto.
	 *
	 * @param as_texto Parametro con la contrasena en texto plano
	 * @return Hash generado
	 */
	public static String encriptarTexto(String as_texto) {

		Pbkdf2PasswordEncoder lppe_sha = new Pbkdf2PasswordEncoder(EnumSeguridad.SECRET.getIs_nombreParametro());
		lppe_sha.setAlgorithm(SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);

		String ls_hashContrasena;
		ls_hashContrasena = lppe_sha.encode(as_texto);
		return ls_hashContrasena;
	}

	/**
	 * Metodo que permite validar contrasena con un hash en SHA256.
	 *
	 * @param as_contrasena       Contrasena texto plano
	 * @param as_contrasenaEncode Hash de contrasena
	 * @return Verdadero si es correcta, falso si no es correcta la contrasena vs
	 *         hash
	 */
	public static Boolean validarContrasena(String as_contrasena, String as_contrasenaEncode) {

		Pbkdf2PasswordEncoder lppe_sha = new Pbkdf2PasswordEncoder(EnumSeguridad.SECRET.getIs_nombreParametro());
		lppe_sha.setAlgorithm(SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
		return lppe_sha.matches(as_contrasena, as_contrasenaEncode);

	}

	/**
	 * Metodo que permite verificar si una URL tiene acceso libre.
	 *
	 * @param as_url el parametro url
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public static Boolean validarAccesoLibre(String as_url) {

		String ls_urlFinal = as_url.replace(EnumExtension.XHTML.getIs_extension(), "").substring(1);
		String[] ls_urls = EnumPermisoURL.LIBRE_ACCESO.getIs_path();

		for (String ls_url : ls_urls) {
			if (ls_url.replace(EnumExtension.JSF.getIs_extension(), "").equals(ls_urlFinal)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que permite que genera enlace de redireccion url para el incio de
	 * sesion.
	 *
	 * @param aa_autenticacion Datos de autenticacion de usuario
	 * @return String con la ulr inicio de sesion
	 */
	public static String manejadorInicioSesionURL(Authentication aa_autenticacion) {

		Collection<? extends GrantedAuthority> lcg_autoridades = aa_autenticacion.getAuthorities();

		EnumRol lre_role = null;

		for (GrantedAuthority lg_autoridad : lcg_autoridades) {

			lre_role = EnumRol.consultarRol(
					(lg_autoridad.getAuthority()).replace(EnumSeguridad.PREFIJO_ROL.getIs_nombreParametro(), ""));

			if (lre_role == null) {
				continue;
			}

			return lre_role.consultarIs_urlInicioSesion();
		}

		return null;
	}

	/**
	 * Metodo que permite que genera enlace de redireccion url.
	 *
	 * @param aa_autenticacion Datos de autenticacion de usuario
	 * @return String con la ulr post inicio de sesion
	 */
	public static String manejadorPostInicioSesionURL(Authentication aa_autenticacion) {

		Collection<? extends GrantedAuthority> lcg_autoridades = aa_autenticacion.getAuthorities();

		EnumRol lre_role = null;

		for (GrantedAuthority lg_autoridad : lcg_autoridades) {

			lre_role = EnumRol.consultarRol(
					(lg_autoridad.getAuthority()).replace(EnumSeguridad.PREFIJO_ROL.getIs_nombreParametro(), ""));

			if (lre_role == null) {
				continue;
			}

			return lre_role.consultarIs_urlPostInicioSesion();
		}

		return null;
	}

	/**
	 * Metodo que transofrma el estandar de una url de permisos.
	 *
	 * @param as_url el parametro url
	 * @return url definitiva
	 */
	public static String convertirEstandarUrlPermiso(String as_url) {
		return as_url.substring(1).replace(".xhtml", ".jsf");
	}

	/**
	 * Metodo que consulta una url del servidor .
	 *
	 * @return Url del servidor
	 */
	public static String consultarUrlServidor() {
		HttpServletRequest lhsr_origRequest = (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();

		String ls_puerto = Integer.toString(lhsr_origRequest.getServerPort());
		String ls_proyecto = lhsr_origRequest.getContextPath();
		String ls_protocolo = lhsr_origRequest.getScheme();
		String ls_servidor = lhsr_origRequest.getServerName();

		// ejemplo de enlace: http://{ip-dominio:puerto}/sede_electronica
		String ls_enlace;
		ls_enlace = ls_protocolo + "://" + ls_servidor + ":" + ls_puerto + ls_proyecto;
		return ls_enlace;
	}

	/**
	 * Metodo que permite validar contrasena con un hash en SHA256.
	 * 
	 * @param as_original
	 * @param as_hash
	 * @return ls_hash
	 * @throws NoSuchAlgorithmException
	 */
	public static Boolean sha256(String as_original, String as_hash) {
		try {
			MessageDigest lmd_mensaje = MessageDigest.getInstance(EnumSeguridad.SHA_256.getIs_nombreParametro());
			lmd_mensaje.update(as_original.getBytes());
			byte[] lb_digest = lmd_mensaje.digest();
			String ls_hash;
			ls_hash = DatatypeConverter.printHexBinary(lb_digest);
			return ls_hash.equalsIgnoreCase(as_hash);
		} catch (Exception ae_exepcion) {
			CL_LOGGER.error(ae_exepcion);
			return false;
		}
	}

}
