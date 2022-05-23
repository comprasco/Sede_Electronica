/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaJuridicaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PersonaJuridicaHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Persona
 * juridica. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaJuridicaHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaJuridicaHelper.
	 */
	private PersonaJuridicaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como PersonaJuridicaDTO
	 */
	public static PersonaJuridicaDTO entidadADtoSimple(PersonaJuridica apj_entidad) {

		PersonaJuridicaDTO lpjd_dto = new PersonaJuridicaDTO();
		lpjd_dto.setIs_idPersona(apj_entidad.getPersona().getId());
		lpjd_dto.setIs_razonSocial(apj_entidad.getRazonSocial());
		lpjd_dto.setIs_primerNombreRepresentanteLegal(apj_entidad.getPrimerNombreRepresentanteLegal());
		lpjd_dto.setIs_segundoNombreRepresentanteLegal(apj_entidad.getSegundoNombreRepresentanteLegal());
		lpjd_dto.setIs_primerApellidoRepresentanteLegal(apj_entidad.getPrimerApellidoRepresentanteLegal());
		lpjd_dto.setIs_segundoApellidoRepresentanteLegal(apj_entidad.getSegundoApellidoRepresentanteLegal());
		lpjd_dto.setId_fechaCreacion(apj_entidad.getFechaCreacion());
		lpjd_dto.setId_fechaModificacion(apj_entidad.getFechaModificacion());
		lpjd_dto.setIs_idUsuarioCreacion(apj_entidad.getIdUsuarioCreacion());
		lpjd_dto.setIs_idUsuarioModificacion(apj_entidad.getIdUsuarioModificacion());
		lpjd_dto.setIs_ipCreacion(apj_entidad.getIpCreacion());
		lpjd_dto.setIs_ipModificacion(apj_entidad.getIpModificacion());
		lpjd_dto.setIs_telefono(apj_entidad.getTelefono());
		lpjd_dto.setIb_documentoCamaraComercio(apj_entidad.getDocumentoCamaraComercio());
		lpjd_dto.setIb_documentoCartaRepresentanteLegal(apj_entidad.getDocumentoCartaRepresentanteLegal());
		lpjd_dto.setIs_nombreDocumentoCamara(apj_entidad.getNombreDocumentoCamara());
		lpjd_dto.setIs_nombreDocumentoRepresentante(apj_entidad.getNombreDocumentoRepresentante());
		lpjd_dto.setIs_activo(apj_entidad.getActivo());
		lpjd_dto.setIs_estereotipoCreacion(apj_entidad.getEstereotipoCreacion());
		lpjd_dto.setIs_estereotipoModificacion(apj_entidad.getEstereotipoModificacion());
		return lpjd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         PersonaJuridicaDTO
	 */
	public static PersonaJuridicaDTO entidadADtoCompleto(PersonaJuridica apj_entidad) {
		PersonaJuridicaDTO lpjd_dto = entidadADtoSimple(apj_entidad);
		if (apj_entidad.getPersona() != null)
			lpjd_dto.setIp_personaDto(PersonaHelper.entidadADtoConTipoDocumento(apj_entidad.getPersona()));
		if (apj_entidad.getTipoCatalogoTipoOrganizacion() != null)
			lpjd_dto.setIc_tipoCatalogoTipoOrganizacion(
					CatalogoHelper.entidadADtoSimple(apj_entidad.getTipoCatalogoTipoOrganizacion()));
		if (apj_entidad.getAsociacionUsuarioPersonaJuridicas() != null
				&& !apj_entidad.getAsociacionUsuarioPersonaJuridicas().isEmpty())
			lpjd_dto.setIlaupj_asociacionUsuarioPersonaJuridicaDto(AsociacionUsuarioPersonaJuridicaHelper
					.listaEntidadADtoSimple(apj_entidad.getAsociacionUsuarioPersonaJuridicas()));
		if (apj_entidad.getUsuarios() != null && !apj_entidad.getUsuarios().isEmpty())
			lpjd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(apj_entidad.getUsuarios().iterator().next()));
		return lpjd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto sin los archivos de persona juridica.
	 *
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple sin archivos retornado como
	 *         PersonaJuridicaDTO
	 */
	public static PersonaJuridicaDTO entidadADtoSimpleSinArchivos(PersonaJuridica apj_entidad) {
		PersonaJuridicaDTO lpjd_dto = new PersonaJuridicaDTO();
		lpjd_dto.setIs_idPersona(apj_entidad.getPersona().getId());
		lpjd_dto.setIs_razonSocial(apj_entidad.getRazonSocial());
		lpjd_dto.setIs_primerNombreRepresentanteLegal(apj_entidad.getPrimerNombreRepresentanteLegal());
		lpjd_dto.setIs_segundoNombreRepresentanteLegal(apj_entidad.getSegundoNombreRepresentanteLegal());
		lpjd_dto.setIs_primerApellidoRepresentanteLegal(apj_entidad.getPrimerApellidoRepresentanteLegal());
		lpjd_dto.setIs_segundoApellidoRepresentanteLegal(apj_entidad.getSegundoApellidoRepresentanteLegal());
		lpjd_dto.setId_fechaCreacion(apj_entidad.getFechaCreacion());
		lpjd_dto.setId_fechaModificacion(apj_entidad.getFechaModificacion());
		lpjd_dto.setIs_idUsuarioCreacion(apj_entidad.getIdUsuarioCreacion());
		lpjd_dto.setIs_idUsuarioModificacion(apj_entidad.getIdUsuarioModificacion());
		lpjd_dto.setIs_ipCreacion(apj_entidad.getIpCreacion());
		lpjd_dto.setIs_ipModificacion(apj_entidad.getIpModificacion());
		lpjd_dto.setIs_telefono(apj_entidad.getTelefono());
		lpjd_dto.setIs_nombreDocumentoCamara(apj_entidad.getNombreDocumentoCamara());
		lpjd_dto.setIs_nombreDocumentoRepresentante(apj_entidad.getNombreDocumentoRepresentante());
		lpjd_dto.setIs_activo(apj_entidad.getActivo());
		lpjd_dto.setIs_estereotipoCreacion(apj_entidad.getEstereotipoCreacion());
		lpjd_dto.setIs_estereotipoModificacion(apj_entidad.getEstereotipoModificacion());
		return lpjd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo con tipo organizacion retornado
	 *         como PersonaJuridicaDTO
	 */
	public static PersonaJuridicaDTO entidadADtoCompletoConTipoOrganizacion(PersonaJuridica apj_entidad) {
		PersonaJuridicaDTO lpjd_dto = entidadADtoSimpleSinArchivos(apj_entidad);
		if (apj_entidad.getTipoCatalogoTipoOrganizacion() != null)
			lpjd_dto.setIc_tipoCatalogoTipoOrganizacion(
					CatalogoHelper.entidadADtoSimple(apj_entidad.getTipoCatalogoTipoOrganizacion()));
		return lpjd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alpj_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         PersonaJuridicaDTO
	 */
	public static List<PersonaJuridicaDTO> listaEntidadADtoSimple(List<PersonaJuridica> alpj_listaEntidad) {
		List<PersonaJuridicaDTO> llpjd_listaDto = new ArrayList<>();
		for (PersonaJuridica lpj_entidad : alpj_listaEntidad) {
			llpjd_listaDto.add(entidadADtoSimple(lpj_entidad));
		}
		return llpjd_listaDto;
	}

	/**
	 * Método que conviertede una lista de entidades a una lista de dto usando todos
	 * los datos incluyendo relaciones.
	 *
	 * @param alpj_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de PersonaJuridicaDTO
	 */
	public static List<PersonaJuridicaDTO> listaEntidadADtoCompleto(List<PersonaJuridica> alpj_listaEntidad) {
		List<PersonaJuridicaDTO> llpjd_listaDto = new ArrayList<>();
		for (PersonaJuridica lpj_entidad : alpj_listaEntidad) {
			llpjd_listaDto.add(entidadADtoCompleto(lpj_entidad));
		}
		return llpjd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apjd_dto    el parametro dto
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como PersonaJuridica
	 */
	public static PersonaJuridica dtoAEntidadSimple(PersonaJuridicaDTO apjd_dto, PersonaJuridica apj_entidad) {
		if (null == apj_entidad) {
			apj_entidad = new PersonaJuridica();
		}
		apj_entidad.setRazonSocial(apjd_dto.getIs_razonSocial());
		apj_entidad.setPrimerApellidoRepresentanteLegal(apjd_dto.getIs_primerApellidoRepresentanteLegal());
		apj_entidad.setSegundoApellidoRepresentanteLegal(apjd_dto.getIs_segundoApellidoRepresentanteLegal());
		apj_entidad.setPrimerNombreRepresentanteLegal(apjd_dto.getIs_primerNombreRepresentanteLegal());
		apj_entidad.setSegundoNombreRepresentanteLegal(apjd_dto.getIs_segundoNombreRepresentanteLegal());
		apj_entidad.setTelefono(apjd_dto.getIs_telefono());
		apj_entidad.setFechaCreacion(apjd_dto.getId_fechaCreacion());
		apj_entidad.setFechaModificacion(apjd_dto.getId_fechaModificacion());
		apj_entidad.setIdUsuarioCreacion(apjd_dto.getIs_idUsuarioCreacion());
		apj_entidad.setIdUsuarioModificacion(apjd_dto.getIs_idUsuarioModificacion());
		apj_entidad.setIpCreacion(apjd_dto.getIs_ipCreacion());
		apj_entidad.setIpModificacion(apjd_dto.getIs_ipModificacion());
		apj_entidad.setDocumentoCamaraComercio(apjd_dto.getIb_documentoCamaraComercio());
		apj_entidad.setDocumentoCartaRepresentanteLegal(apjd_dto.getIb_documentoCartaRepresentanteLegal());
		apj_entidad.setNombreDocumentoCamara(apjd_dto.getIs_nombreDocumentoCamara());
		apj_entidad.setNombreDocumentoRepresentante(apjd_dto.getIs_nombreDocumentoRepresentante());
		apj_entidad.setActivo(apjd_dto.getIs_activo());
		apj_entidad.setEstereotipoCreacion(apjd_dto.getIs_estereotipoCreacion());
		apj_entidad.setEstereotipoModificacion(apjd_dto.getIs_estereotipoModificacion());
		return apj_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apjd_dto    el parametro dto
	 * @param apj_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como PersonaJuridica
	 */
	public static PersonaJuridica dtoAEntidadCompleto(PersonaJuridicaDTO apjd_dto, PersonaJuridica apj_entidad) {
		apj_entidad = dtoAEntidadSimple(apjd_dto, apj_entidad);
		if (apjd_dto.getIp_personaDto() != null) {
			apj_entidad.setPersona(PersonaHelper.dtoAEntidadCompleto(apjd_dto.getIp_personaDto(), new Persona()));
		}
		if (apjd_dto.getIc_tipoCatalogoTipoOrganizacion() != null) {
			apj_entidad.setTipoCatalogoTipoOrganizacion(new Catalogo());
			apj_entidad.getTipoCatalogoTipoOrganizacion()
					.setId(apjd_dto.getIc_tipoCatalogoTipoOrganizacion().getIs_id());
		}
		return apj_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alpjd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         PersonaJuridica
	 */
	public static List<PersonaJuridica> listaDtoAEntidadSimple(List<PersonaJuridicaDTO> alpjd_listaDto) {
		List<PersonaJuridica> llpj_listaEntidad = new ArrayList<>();
		for (PersonaJuridicaDTO lpjd_dto : alpjd_listaDto) {
			llpj_listaEntidad.add(dtoAEntidadSimple(lpjd_dto, null));
		}
		return llpj_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alpjd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de PersonaJuridica
	 */
	public static List<PersonaJuridica> listaDtoAEntidadCompleto(List<PersonaJuridicaDTO> alpjd_listaDto) {
		List<PersonaJuridica> llpj_listaEntidad = new ArrayList<>();
		for (PersonaJuridicaDTO lpjd_dto : alpjd_listaDto) {
			llpj_listaEntidad.add(dtoAEntidadCompleto(lpjd_dto, null));
		}
		return llpj_listaEntidad;
	}
	// --- fin to Entidad
}
