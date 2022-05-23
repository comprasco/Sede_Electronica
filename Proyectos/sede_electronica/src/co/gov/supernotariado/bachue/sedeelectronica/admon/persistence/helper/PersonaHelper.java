/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PersonaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Persona. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaHelper.
	 */
	private PersonaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como PersonaDTO
	 */
	public static PersonaDTO entidadADtoSimple(Persona ap_entidad) {

		PersonaDTO lpd_dto = new PersonaDTO();
		lpd_dto.setIs_id(ap_entidad.getId());
		lpd_dto.setIs_activo(ap_entidad.getActivo());
		lpd_dto.setId_fechaCreacion(ap_entidad.getFechaCreacion());
		lpd_dto.setId_fechaModificacion(ap_entidad.getFechaModificacion());
		lpd_dto.setIs_idUsuarioCreacion(ap_entidad.getIdUsuarioCreacion());
		lpd_dto.setIs_idUsuarioModificacion(ap_entidad.getIdUsuarioModificacion());
		lpd_dto.setIs_ipCreacion(ap_entidad.getIpCreacion());
		lpd_dto.setIs_ipModificacion(ap_entidad.getIpModificacion());
		lpd_dto.setIs_numeroDocumento(ap_entidad.getNumeroDocumento());
		lpd_dto.setIs_estereotipoCreacion(ap_entidad.getEstereotipoCreacion());
		lpd_dto.setIs_estereotipoModificacion(ap_entidad.getEstereotipoModificacion());
		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a Dto simple con tipo documento.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto con tipo documento retornado como
	 *         PersonaDTO
	 */
	public static PersonaDTO entidadADtoConTipoDocumento(Persona ap_entidad) {
		PersonaDTO lpd_dto = entidadADtoSimple(ap_entidad);
		if (ap_entidad.getTipoDocumento() != null)
			lpd_dto.setItd_tipoDocumentoDto(TipoDocumentoHelper.entidadADtoSimple(ap_entidad.getTipoDocumento()));
		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a Dto simple con direccion.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto con direccion Y tipo documento retornado
	 *         como PersonaDTO
	 */
	public static PersonaDTO entidadADtoConDireccionYTipoDocumento(Persona ap_entidad) {
		PersonaDTO lpd_dto = entidadADtoSimple(ap_entidad);
		if (ap_entidad.getPersonaDireccions() != null && !ap_entidad.getPersonaDireccions().isEmpty()) {

			List<PersonaDireccionDTO> llpd_personasDireccion = PersonaDireccionHelper
					.listaentidadADtoCompleto(ap_entidad.getPersonaDireccions());

			List<DireccionDTO> lld_direccionesDto = new ArrayList<>();

			for (PersonaDireccionDTO lpd_personaDireccionDTO : llpd_personasDireccion) {
				lld_direccionesDto.add(lpd_personaDireccionDTO.getId_direccion());
			}

			lpd_dto.setIlpd_personaDireccionesDto(lld_direccionesDto);
		}
		if (ap_entidad.getTipoDocumento() != null)
			lpd_dto.setItd_tipoDocumentoDto(TipoDocumentoHelper.entidadADtoCompleto(ap_entidad.getTipoDocumento()));
		if (ap_entidad.getPersonaNatural() != null)
			lpd_dto.setIpn_personaNaturalDto(PersonaNaturalHelper.entidadADtoSimple(ap_entidad.getPersonaNatural()));
		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a Dto simple con persona juridica sin
	 * documentos.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo con persona juridica sin
	 *         documentos retornado como PersonaDTO
	 */
	public static PersonaDTO entidadADtoCompletoConPersonaJuridicaSinDocumentos(Persona ap_entidad) {
		PersonaDTO lpd_dto = entidadADtoSimple(ap_entidad);
		if (ap_entidad.getCatalogo() != null)
			lpd_dto.setIc_catalogoDto(CatalogoHelper.entidadADtoSimple(ap_entidad.getCatalogo()));
		if (ap_entidad.getTipoDocumento() != null)
			lpd_dto.setItd_tipoDocumentoDto(TipoDocumentoHelper.entidadADtoSimple(ap_entidad.getTipoDocumento()));
		if (ap_entidad.getPersonaJuridica() != null)
			lpd_dto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompletoConTipoOrganizacion(ap_entidad.getPersonaJuridica()));
		if (ap_entidad.getPersonaNatural() != null)
			lpd_dto.setIpn_personaNaturalDto(PersonaNaturalHelper.entidadADtoCompleto(ap_entidad.getPersonaNatural()));
		if (ap_entidad.getUsuario() != null)
			lpd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(ap_entidad.getUsuario()));
		if (ap_entidad.getPersonaDireccions() != null && !ap_entidad.getPersonaDireccions().isEmpty()) {

			List<PersonaDireccionDTO> llpd_personasDireccion = PersonaDireccionHelper
					.listaentidadADtoCompleto(ap_entidad.getPersonaDireccions());

			List<DireccionDTO> lld_direccionesDto = new ArrayList<>();

			for (PersonaDireccionDTO lpd_personaDireccionDTO : llpd_personasDireccion) {
				lld_direccionesDto.add(lpd_personaDireccionDTO.getId_direccion());
			}

			lpd_dto.setIlpd_personaDireccionesDto(lld_direccionesDto);
		}
		return lpd_dto;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como PersonaDTO
	 */
	public static PersonaDTO entidadADtoCompleto(Persona ap_entidad) {
		PersonaDTO lpd_dto = entidadADtoSimple(ap_entidad);
		if (ap_entidad.getCatalogo() != null)
			lpd_dto.setIc_catalogoDto(CatalogoHelper.entidadADtoCompleto(ap_entidad.getCatalogo()));
		if (ap_entidad.getTipoDocumento() != null)
			lpd_dto.setItd_tipoDocumentoDto(TipoDocumentoHelper.entidadADtoCompleto(ap_entidad.getTipoDocumento()));
		if (ap_entidad.getPersonaJuridica() != null)
			lpd_dto.setIpj_personaJuridicaDto(
					PersonaJuridicaHelper.entidadADtoCompleto(ap_entidad.getPersonaJuridica()));
		if (ap_entidad.getPersonaNatural() != null)
			lpd_dto.setIpn_personaNaturalDto(PersonaNaturalHelper.entidadADtoCompleto(ap_entidad.getPersonaNatural()));
		if (ap_entidad.getUsuario() != null)
			lpd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(ap_entidad.getUsuario()));
		if (ap_entidad.getPersonaDireccions() != null && !ap_entidad.getPersonaDireccions().isEmpty()) {

			List<PersonaDireccionDTO> llpd_personasDireccion = PersonaDireccionHelper
					.listaentidadADtoCompleto(ap_entidad.getPersonaDireccions());

			List<DireccionDTO> lld_direccionesDto = new ArrayList<>();

			for (PersonaDireccionDTO lpd_personaDireccionDTO : llpd_personasDireccion) {
				lld_direccionesDto.add(lpd_personaDireccionDTO.getId_direccion());
			}

			lpd_dto.setIlpd_personaDireccionesDto(lld_direccionesDto);
		}

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         PersonaDTO
	 */
	public static List<PersonaDTO> listaEntidadADtoSimple(List<Persona> alp_listaEntidades) {
		List<PersonaDTO> llpd_listaDto = new ArrayList<>();
		for (Persona lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoSimple(lp_entidad));
		}
		return llpd_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos incluyendo relaciones.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de PersonaDTO
	 */
	public static List<PersonaDTO> listaEntidadADtoCompleto(List<Persona> alp_listaEntidades) {
		List<PersonaDTO> llpd_listaDto = new ArrayList<>();
		for (Persona lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoCompleto(lp_entidad));
		}
		return llpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Persona
	 */
	public static Persona dtoAEntidadSimple(PersonaDTO apd_dto, Persona ap_entidad) {
		if (null == ap_entidad) {
			ap_entidad = new Persona();
		}
		ap_entidad.setId(apd_dto.getIs_id());
		ap_entidad.setActivo(apd_dto.getIs_activo());
		ap_entidad.setFechaCreacion(apd_dto.getId_fechaCreacion());
		ap_entidad.setFechaModificacion(apd_dto.getId_fechaModificacion());
		ap_entidad.setIdUsuarioCreacion(apd_dto.getIs_idUsuarioCreacion());
		ap_entidad.setIdUsuarioModificacion(apd_dto.getIs_idUsuarioModificacion());
		ap_entidad.setIpCreacion(apd_dto.getIs_ipCreacion());
		ap_entidad.setIpModificacion(apd_dto.getIs_ipModificacion());
		ap_entidad.setNumeroDocumento(apd_dto.getIs_numeroDocumento());
		ap_entidad.setEstereotipoCreacion(apd_dto.getIs_estereotipoCreacion());
		ap_entidad.setEstereotipoModificacion(apd_dto.getIs_estereotipoModificacion());
		return ap_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Persona
	 */
	public static Persona dtoAEntidadCompleto(PersonaDTO apd_dto, Persona ap_entidad) {
		ap_entidad = dtoAEntidadSimple(apd_dto, ap_entidad);
		if (apd_dto.getIc_catalogoDto() != null) {
			ap_entidad.setCatalogo(new Catalogo());
			ap_entidad.getCatalogo().setId(apd_dto.getIc_catalogoDto().getIs_id());
		}
		if (apd_dto.getItd_tipoDocumentoDto() != null) {
			ap_entidad.setTipoDocumento(new TipoDocumento());
			ap_entidad.getTipoDocumento().setId(apd_dto.getItd_tipoDocumentoDto().getIs_id());
		}
		if (apd_dto.getIpn_personaNaturalDto() != null) {
			ap_entidad.setPersonaNatural(new PersonaNatural());
			ap_entidad.getPersonaNatural().getPersona().setId(apd_dto.getIpn_personaNaturalDto().getIs_idPersona());
		}

		return ap_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param lpd_listaDto el parametro lpd lista dto
	 * @return List<Persona>
	 */
	public static List<Persona> listaDtoAEntidadSimple(List<PersonaDTO> lpd_listaDto) {
		List<Persona> llp_listaEntidad = new ArrayList<>();
		for (PersonaDTO lpd_dto : lpd_listaDto) {
			llp_listaEntidad.add(dtoAEntidadSimple(lpd_dto, null));
		}
		return llp_listaEntidad;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param lpd_listaDto el parametro lpd lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Persona
	 */
	public static List<Persona> listaDtoAEntidadCompleto(List<PersonaDTO> lpd_listaDto) {
		List<Persona> llp_listaEntidad = new ArrayList<>();
		for (PersonaDTO lpd_dto : lpd_listaDto) {
			llp_listaEntidad.add(dtoAEntidadCompleto(lpd_dto, null));
		}
		return llp_listaEntidad;
	}
	// --- fin to Entidad
}
