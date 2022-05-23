/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadUsuarioSesion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadUsuarioSesion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;

/**
 * El elemento Class UtilidadUsuarioSesion.<br>
 * Representa un/una utilidad usuario sesion.<br>
 * Clase que permite capturar el usuario en sesion
 * 
 * @author Smartsoft Solutions S.A.S
 */

public class UtilidadUsuarioSesion {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadUsuarioSesion.
	 */
	private UtilidadUsuarioSesion() {
		// Constructor vacio de la clase
	}

	/**
	 * Captura el usuario es sesion.
	 *
	 * @return Resultado para usuario sesion retornado como UsuarioDTO
	 */
	public static UsuarioDTO usuarioSesion() {
		IUsuarioBusiness liub_usuarioBusiness = BeansLocales.consultarUsuarioBusiness();
		UsuarioDTO lu_usuarioDto;
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuarioDto = liub_usuarioBusiness.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		return lu_usuarioDto;
	}
}
