/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: UsuarioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioHelper.
	 */
	private UsuarioHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoSimple(Usuario au_entidad) {

		UsuarioDTO lusd_dto = new UsuarioDTO();

		lusd_dto.setIs_id(au_entidad.getId());
		lusd_dto.setIs_activo(au_entidad.getActivo());
		lusd_dto.setIs_celular(au_entidad.getCelular());
		lusd_dto.setIs_celularConfirmado(au_entidad.getCelularConfirmado());
		lusd_dto.setIs_claveHash(au_entidad.getClaveHash());
		lusd_dto.setIs_correoElectronico(au_entidad.getCorreoElectronico());
		lusd_dto.setIs_correoElectronicoConfirmado(au_entidad.getCorreoElectronicoConfirmado());
		lusd_dto.setId_fechaConfirmacionCelular(au_entidad.getFechaConfirmacionCelular());
		lusd_dto.setId_fechaConfirmacionCorreoElectronico(au_entidad.getFechaConfirmacionCorreoElectronico());
		lusd_dto.setId_fechaCreacion(au_entidad.getFechaCreacion());
		lusd_dto.setId_fechaModificacion(au_entidad.getFechaModificacion());
		lusd_dto.setId_fechaUltimoInicioSesion(au_entidad.getFechaUltimoInicioSesion());
		lusd_dto.setId_fechaUltimoIntento(au_entidad.getFechaUltimoIntento());
		lusd_dto.setIs_idUsuarioCreacion(au_entidad.getIdUsuarioCreacion());
		lusd_dto.setIs_idUsuarioModificacion(au_entidad.getIdUsuarioModificacion());
		lusd_dto.setIi_intentosFallidosAcceso(au_entidad.getIntentosFallidosAcceso());
		lusd_dto.setIs_ipCreacion(au_entidad.getIpCreacion());
		lusd_dto.setIs_ipModificacion(au_entidad.getIpModificacion());
		lusd_dto.setIs_usuario(au_entidad.getNombreUsuario());
		lusd_dto.setIs_uuidUrlActivacion(au_entidad.getUuidUrlActivacion());
		lusd_dto.setId_fechaModificacionClave(au_entidad.getFechaModificacionClave());
		lusd_dto.setIs_rol(au_entidad.getUsuarioRols().iterator().next().getRol().getNombre());
		lusd_dto.setIs_rolLegible(au_entidad.getUsuarioRols().iterator().next().getRol().getNombreLargo());
		lusd_dto.setIs_descripcion(au_entidad.getDescripcion());
		lusd_dto.setIs_estereotipoCreacion(au_entidad.getEstereotipoCreacion());
		lusd_dto.setIs_estereotipoModificacion(au_entidad.getEstereotipoModificacion());
		if (au_entidad.getEntidadEspecial() != null)
			lusd_dto.setIs_entidadEspecial(au_entidad.getEntidadEspecial().getId());

		return lusd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoCompleto(Usuario au_entidad) {
		UsuarioDTO lusd_dto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona() != null)
			lusd_dto.setIp_personaDto(PersonaHelper.entidadADtoConTipoDocumento(au_entidad.getPersona()));
		if (au_entidad.getTipoEstadoCuenta() != null)
			lusd_dto.setItec_tipoEstadoCuentaDto(
					TipoEstadoCuentaHelper.entidadADtoSimple(au_entidad.getTipoEstadoCuenta()));
		if (au_entidad.getEntidadEspecial() != null)
			lusd_dto.setIee_entidadEspecial(EntidadEspecialHelper.entidadADtoSimple(au_entidad.getEntidadEspecial()));
		if (au_entidad.getPersonaJuridica() != null)
			lusd_dto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompleto(au_entidad.getPersonaJuridica()));
		return lusd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo persona con tipo documento
	 *         persona natural direccion retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoCompletoPersonaConTipoDPerNatDireccion(Usuario au_entidad) {
		UsuarioDTO lud_dto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona() != null)
			lud_dto.setIp_personaDto(PersonaHelper.entidadADtoConDireccionYTipoDocumento(au_entidad.getPersona()));
		if (au_entidad.getTipoEstadoCuenta() != null)
			lud_dto.setItec_tipoEstadoCuentaDto(
					TipoEstadoCuentaHelper.entidadADtoSimple(au_entidad.getTipoEstadoCuenta()));
		if (au_entidad.getEntidadEspecial() != null)
			lud_dto.setIee_entidadEspecial(EntidadEspecialHelper.entidadADtoSimple(au_entidad.getEntidadEspecial()));
		if (au_entidad.getPersonaJuridica() != null)
			lud_dto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompleto(au_entidad.getPersonaJuridica()));
		return lud_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones y con tipoDocumento.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo con persona tipo documento
	 *         retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoCompletoConPersonaTipoDocumento(Usuario au_entidad) {
		UsuarioDTO lusd_dto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona() != null)
			lusd_dto.setIp_personaDto(PersonaHelper.entidadADtoConTipoDocumento(au_entidad.getPersona()));
		if (au_entidad.getTipoEstadoCuenta() != null)
			lusd_dto.setItec_tipoEstadoCuentaDto(
					TipoEstadoCuentaHelper.entidadADtoSimple(au_entidad.getTipoEstadoCuenta()));
		if (au_entidad.getEntidadEspecial() != null)
			lusd_dto.setIee_entidadEspecial(EntidadEspecialHelper.entidadADtoSimple(au_entidad.getEntidadEspecial()));
		return lusd_dto;
	}

	/**
	 * Método que convierte de entidad a DTO sin archivo.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto direccion persona jurida sin archivo
	 *         retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoDireccionPersonaJuridaSinArchivo(Usuario au_entidad) {
		UsuarioDTO lu_usuarioDto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona() != null)
			lu_usuarioDto
					.setIp_personaDto(PersonaHelper.entidadADtoConDireccionYTipoDocumento(au_entidad.getPersona()));
		if (au_entidad.getPersonaJuridica() != null)
			lu_usuarioDto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompletoConTipoOrganizacion(au_entidad.getPersonaJuridica()));
		if (au_entidad.getEntidadEspecial() != null)
			lu_usuarioDto
					.setIee_entidadEspecial(EntidadEspecialHelper.entidadADtoSimple(au_entidad.getEntidadEspecial()));
		return lu_usuarioDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alu_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         UsuarioDTO
	 */
	public static List<UsuarioDTO> listaEntidadADtoSimple(List<Usuario> alu_listaEntidades) {
		List<UsuarioDTO> llud_listaDto = new ArrayList<>();
		for (Usuario lu_entidad : alu_listaEntidades) {
			llud_listaDto.add(entidadADtoSimple(lu_entidad));
		}
		return llud_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alu_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de UsuarioDTO
	 */
	public static List<UsuarioDTO> listaEntidadADtoCompleto(List<Usuario> alu_listaEntidades) {
		List<UsuarioDTO> llud_listaDto = new ArrayList<>();
		for (Usuario lu_entidad : alu_listaEntidades) {
			llud_listaDto.add(entidadADtoCompleto(lu_entidad));
		}
		return llud_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aud_dto    el parametro dto
	 * @param au_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Usuario
	 */
	public static Usuario dtoAEntidadSimple(UsuarioDTO aud_dto, Usuario au_entidad) {
		if (null != aud_dto.getIs_entidadEspecial()) {
			EntidadEspecial lee_entidadEspecial = new EntidadEspecial();
			lee_entidadEspecial.setId(aud_dto.getIs_entidadEspecial());
			au_entidad.setEntidadEspecial(lee_entidadEspecial);
		}

		if (null != aud_dto.getIpj_personaJuridicaDto()) {
			PersonaJuridica lpj_personaJuridica = PersonaJuridicaHelper
					.dtoAEntidadCompleto(aud_dto.getIpj_personaJuridicaDto(), new PersonaJuridica());
			au_entidad.setPersonaJuridica(lpj_personaJuridica);
		}

		if (null != aud_dto.getIp_personaDto()) {
			Persona lpj_persona = PersonaHelper.dtoAEntidadCompleto(aud_dto.getIp_personaDto(), new Persona());
			au_entidad.setPersona(lpj_persona);
		}

		au_entidad.setId(aud_dto.getIs_id());
		au_entidad.setActivo(aud_dto.getIs_activo());
		if (aud_dto.getIs_celular() != null)
			au_entidad.setCelular(aud_dto.getIs_celular().replace(" ", ""));
		au_entidad.setCelularConfirmado(aud_dto.getIs_celularConfirmado());
		au_entidad.setClaveHash(aud_dto.getIs_claveHash());
		au_entidad.setCorreoElectronico(aud_dto.getIs_correoElectronico());
		au_entidad.setCorreoElectronicoConfirmado(aud_dto.getIs_correoElectronicoConfirmado());
		au_entidad.setFechaConfirmacionCelular(aud_dto.getId_fechaConfirmacionCelular());
		au_entidad.setFechaConfirmacionCorreoElectronico(aud_dto.getId_fechaConfirmacionCorreoElectronico());
		au_entidad.setFechaCreacion(aud_dto.getId_fechaCreacion());
		au_entidad.setFechaModificacion(aud_dto.getId_fechaModificacion());
		au_entidad.setFechaUltimoInicioSesion(aud_dto.getId_fechaUltimoInicioSesion());
		au_entidad.setFechaUltimoIntento(aud_dto.getId_fechaUltimoIntento());
		au_entidad.setIdUsuarioCreacion(aud_dto.getIs_idUsuarioCreacion());
		au_entidad.setIdUsuarioModificacion(aud_dto.getIs_idUsuarioModificacion());
		au_entidad.setIntentosFallidosAcceso(aud_dto.getIi_intentosFallidosAcceso());
		au_entidad.setIpCreacion(aud_dto.getIs_ipCreacion());
		au_entidad.setIpModificacion(aud_dto.getIs_ipModificacion());
		au_entidad.setNombreUsuario(aud_dto.getIs_usuario());
		au_entidad.setUuidUrlActivacion(aud_dto.getIs_uuidUrlActivacion());
		au_entidad.setFechaModificacionClave(aud_dto.getId_fechaModificacionClave());
		au_entidad.setDescripcion(aud_dto.getIs_descripcion());
		au_entidad.setEstereotipoCreacion(aud_dto.getIs_estereotipoCreacion());
		au_entidad.setEstereotipoModificacion(aud_dto.getIs_estereotipoModificacion());
		return au_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aud_dto    el parametro dto
	 * @param au_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Usuario
	 */
	public static Usuario dtoAEntidadCompleto(UsuarioDTO aud_dto, Usuario au_entidad) {
		dtoAEntidadSimple(aud_dto, au_entidad);

		if (aud_dto.getItec_tipoEstadoCuentaDto() != null) {
			au_entidad.setTipoEstadoCuenta(new TipoEstadoCuenta());
			au_entidad.getTipoEstadoCuenta().setId(aud_dto.getItec_tipoEstadoCuentaDto().getIs_id());
		}

		if (aud_dto.getIp_personaDto() != null) {
			au_entidad.setPersona(new Persona());
			au_entidad.getPersona().setId(aud_dto.getIp_personaDto().getIs_id());
		}

		return au_entidad;
	}

	/**
	 * Metodo que convierte de entidad a Dto simple con direccion.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto persona con direccion retornado como
	 *         UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoPersonaConDireccion(Usuario au_entidad) {
		UsuarioDTO lud_dto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona().getPersonaDireccions() != null
				&& !au_entidad.getPersona().getPersonaDireccions().isEmpty()) {
			lud_dto.setIp_personaDto(
					PersonaHelper.entidadADtoCompletoConPersonaJuridicaSinDocumentos(au_entidad.getPersona()));
		}
		return lud_dto;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param llud_listaDto el parametro llud lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Usuario
	 */
	public static List<Usuario> listaDtoAEntidadSimple(List<UsuarioDTO> llud_listaDto) {
		List<Usuario> llu_listaEntidades = new ArrayList<>();
		for (UsuarioDTO lusd_dto : llud_listaDto) {
			llu_listaEntidades.add(dtoAEntidadSimple(lusd_dto, null));
		}
		return llu_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param llud_listaDto el parametro llud lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Usuario
	 */
	public static List<Usuario> listaDtoAEntidadCompleto(List<UsuarioDTO> llud_listaDto) {
		List<Usuario> llu_listaEntidades = new ArrayList<>();
		for (UsuarioDTO lusd_dto : llud_listaDto) {
			llu_listaEntidades.add(dtoAEntidadCompleto(lusd_dto, null));
		}
		return llu_listaEntidades;
	}
	// --- fin to Entidad

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * se crea este metodo para devolver todos los datos de la persona ya que no se
	 * encontro uno que realice esta funcionalidad.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo DTO retornado como UsuarioDTO
	 */
	public static UsuarioDTO entidadADtoCompletoDTO(Usuario au_entidad) {
		UsuarioDTO lu_usuarioDto = entidadADtoSimple(au_entidad);
		if (au_entidad.getPersona() != null)
			lu_usuarioDto.setIp_personaDto(PersonaHelper.entidadADtoCompleto(au_entidad.getPersona()));
		if (au_entidad.getTipoEstadoCuenta() != null)
			lu_usuarioDto.setItec_tipoEstadoCuentaDto(
					TipoEstadoCuentaHelper.entidadADtoSimple(au_entidad.getTipoEstadoCuenta()));
		if (au_entidad.getEntidadEspecial() != null)
			lu_usuarioDto
					.setIee_entidadEspecial(EntidadEspecialHelper.entidadADtoSimple(au_entidad.getEntidadEspecial()));
		if (au_entidad.getPersonaJuridica() != null)
			lu_usuarioDto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompleto(au_entidad.getPersonaJuridica()));
		return lu_usuarioDto;
	}

	/**
	 * Metodo que convierte una lista de entidades usuario a una lista completa de
	 * UsuarioDto.
	 *
	 * @param alu_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo DTO retornado como una
	 *         lista de UsuarioDTO
	 */
	public static List<UsuarioDTO> listaEntidadADtoCompletoDTO(List<Usuario> alu_listaEntidades) {
		List<UsuarioDTO> llud_listaDto = new ArrayList<>();
		for (Usuario lu_entidad : alu_listaEntidades) {
			llud_listaDto.add(entidadADtoCompletoDTO(lu_entidad));
		}
		return llud_listaDto;
	}
}
