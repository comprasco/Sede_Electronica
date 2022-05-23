/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioSesionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: UsuarioSesionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.Objects;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Usuario
 * sesion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioSesionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioSesionHelper.
	 */
	private UsuarioSesionHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte una entidad a un dto usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param au_usuario el parametro usuario
	 * @return Resultado para entidad A dto completo retornado como UsuarioSesionDTO
	 */
	public static UsuarioSesionDTO entidadADtoCompleto(Usuario au_usuario) {

		UsuarioSesionDTO lus_usuario = new UsuarioSesionDTO();
		Persona lp_persona = au_usuario.getPersona();

		PersonaJuridica lpj_persona = null;
		PersonaNatural lpn_persona = null;
		EntidadEspecial lee_entidadEspecial = null;

		lus_usuario.setIs_nombreUsuario(au_usuario.getNombreUsuario());
		lus_usuario.setIs_idUsuario(au_usuario.getId());
		lus_usuario.setIs_rol(au_usuario.getUsuarioRols().iterator().next().getRol().getNombre());
		lus_usuario.setIs_correo(au_usuario.getCorreoElectronico());
		if (lp_persona != null || au_usuario.getPersonaJuridica() != null) {

			if (au_usuario.getPersonaJuridica() != null) {
				lpj_persona = au_usuario.getPersonaJuridica();
				lp_persona = lpj_persona.getPersona();

				lus_usuario.setIs_razonSocial(lpj_persona.getRazonSocial());
				lus_usuario.setIs_idPersona(lp_persona.getId());
			} else if (lp_persona != null && !Objects.isNull(lp_persona.getPersonaNatural())) {

				lpn_persona = lp_persona.getPersonaNatural();
				lus_usuario.setIs_nombre(lpn_persona.getPrimerNombre());
				lus_usuario.setIs_segundoNombre(lpn_persona.getSegundoNombre());
				lus_usuario.setIs_apellido(lpn_persona.getPrimerApellido());
				lus_usuario.setIs_segundopellido(lpn_persona.getSegundoApellido());
				lus_usuario.setIs_nombreConcatenado(String.format("%s %s %s %s", lpn_persona.getPrimerNombre(),
						(lpn_persona.getSegundoNombre() != null ? lpn_persona.getSegundoNombre() : ""),
						lpn_persona.getPrimerApellido(),
						(lpn_persona.getSegundoApellido() != null ? lpn_persona.getSegundoApellido() : "")));
				lus_usuario.setIs_idPersona(lp_persona.getId());
			}

			validarPersona(lus_usuario, lp_persona);

		} else if (au_usuario.getEntidadEspecial() != null) {
			lee_entidadEspecial = au_usuario.getEntidadEspecial();
			lus_usuario.setIs_razonSocial(lee_entidadEspecial.getRazonSocial());
			lus_usuario.setIs_nombreConcatenado(lee_entidadEspecial.getRepresentanteLegal());
			lus_usuario.setIs_numeroDocumento(lee_entidadEspecial.getDocumentoEntidadEspecial());
			lus_usuario.setIs_tipoDocumento(lee_entidadEspecial.getIdTipoDocumentoEntidadEspecial());
		}
		return lus_usuario;
	}

	/**
	 * Metodo que valida la persona.
	 *
	 * @param aus_usuario el parametro usuario
	 * @param ap_persona  el parametro persona
	 */
	private static void validarPersona(UsuarioSesionDTO aus_usuario, Persona ap_persona) {
		if (ap_persona != null) {

			aus_usuario.setIs_tipoDocumento(ap_persona.getTipoDocumento().getId());
			aus_usuario.setIs_numeroDocumento(ap_persona.getNumeroDocumento());

			if (validarRolDireccion(aus_usuario.getIs_rol())
					&& (!ap_persona.getPersonaDireccions().isEmpty()
							&& Objects.nonNull(ap_persona.getPersonaDireccions()))
					&& (!Objects.isNull(
							ap_persona.getPersonaDireccions().iterator().next().getDireccion().getMunicipio()))) {
				aus_usuario.setIs_idPais(ap_persona.getPersonaDireccions().iterator().next().getDireccion()
						.getMunicipio().getDepartamento().getPais().getIdPais());
				aus_usuario.setIs_idDepartamento(ap_persona.getPersonaDireccions().iterator().next().getDireccion()
						.getMunicipio().getDepartamento().getId().getIdDepartamento());
				aus_usuario.setIs_idCiudad(ap_persona.getPersonaDireccions().iterator().next().getDireccion()
						.getMunicipio().getId().getIdMunicipio());
				cargarDireccionCompleta(aus_usuario, ap_persona);
			}
		}
	}

	/**
	 * Método que permite cargar dirección completa del usuario.
	 *
	 * @param lus_usuario el parametro lus usuario
	 * @param lp_persona  el parametro lp persona
	 * @return Resultado para cargar direccion completa retornado como
	 *         UsuarioSesionDTO
	 */
	private static UsuarioSesionDTO cargarDireccionCompleta(UsuarioSesionDTO lus_usuario, Persona lp_persona) {
		String ls_nombrePais = "";
		String ls_nombreDepartamento = "";
		String ls_nombreCiudad = "";
		String ls_ubicacion = "";
		if (!StringUtils.isNullOrEmpty(lus_usuario.getIs_idPais())) {
			ls_nombrePais = lp_persona.getPersonaDireccions().iterator().next().getDireccion().getMunicipio()
					.getDepartamento().getPais().getNombre();

			if (!StringUtils.isNullOrEmpty(lus_usuario.getIs_idDepartamento())) {
				ls_nombreDepartamento = lp_persona.getPersonaDireccions().iterator().next().getDireccion()
						.getMunicipio().getDepartamento().getNombre();

				if (!StringUtils.isNullOrEmpty(lus_usuario.getIs_idCiudad())) {
					MunicipioDTO lm_municipioDto = MunicipioHelper.entidadADtoCompleto(
							lp_persona.getPersonaDireccions().iterator().next().getDireccion().getMunicipio());
					ls_nombreCiudad = (lm_municipioDto != null) ? lm_municipioDto.getIs_nombre() : "";
				}
				if (ls_nombreDepartamento.equals(ls_nombreCiudad)) {
					ls_ubicacion = ls_nombreDepartamento;
				} else {
					ls_ubicacion = ls_nombreDepartamento + " / " + ls_nombreCiudad;
				}
			} else {
				ls_ubicacion = ls_nombrePais;
			}
		}
		if (!ls_ubicacion.equals("")) {
			lus_usuario.setIs_ubicacionConcatenado(ls_ubicacion);
		}
		return lus_usuario;
	}

	/**
	 * Método que valida un booleano el rol de dirección usuario.
	 *
	 * @param as_usuarioRol el parametro usuario rol
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private static boolean validarRolDireccion(String as_usuarioRol) {
		return !(as_usuarioRol.equals(EnumRol.SUPER_ADMIN.getIs_rol())
				|| as_usuarioRol.equals(EnumRol.ADMIN_TECNICO.getIs_rol())
				|| as_usuarioRol.equals(EnumRol.ADMIN_NEGOCIO.getIs_rol()));
	}

}
