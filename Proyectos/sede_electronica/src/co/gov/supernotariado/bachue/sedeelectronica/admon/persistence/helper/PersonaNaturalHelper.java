/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaNaturalHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PersonaNaturalHelper
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
 * natural. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaNaturalHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaNaturalHelper.
	 */
	private PersonaNaturalHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param apn_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como PersonaNaturalDTO
	 */
	public static PersonaNaturalDTO entidadADtoSimple(PersonaNatural apn_entidad) {
		PersonaNaturalDTO lpnd_dto = new PersonaNaturalDTO();
		lpnd_dto.setIs_idPersona(apn_entidad.getPersona().getId());
		lpnd_dto.setId_fechaExpedicion(apn_entidad.getFechaExpedicion());
		lpnd_dto.setId_fechaNacimiento(apn_entidad.getFechaNacimiento());
		lpnd_dto.setIs_primerApellido(apn_entidad.getPrimerApellido());
		lpnd_dto.setIs_primerNombre(apn_entidad.getPrimerNombre());
		lpnd_dto.setIs_segundoApellido(apn_entidad.getSegundoApellido());
		lpnd_dto.setIs_segundoNombre(apn_entidad.getSegundoNombre());
		lpnd_dto.setIs_telefono(apn_entidad.getTelefono());
		lpnd_dto.setIs_activo(apn_entidad.getActivo());
		lpnd_dto.setId_fechaCreacion(apn_entidad.getFechaCreacion());
		lpnd_dto.setId_fechaModificacion(apn_entidad.getFechaModificacion());
		lpnd_dto.setIs_idUsuarioCreacion(apn_entidad.getIdUsuarioCreacion());
		lpnd_dto.setIs_idUsuarioModificacion(apn_entidad.getIdUsuarioModificacion());
		lpnd_dto.setIs_ipCreacion(apn_entidad.getIpCreacion());
		lpnd_dto.setIs_ipModificacion(apn_entidad.getIpModificacion());
		lpnd_dto.setIs_estereotipoCreacion(apn_entidad.getEstereotipoCreacion());
		lpnd_dto.setIs_estereotipoModificacion(apn_entidad.getEstereotipoModificacion());
		return lpnd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apn_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         PersonaNaturalDTO
	 */
	public static PersonaNaturalDTO entidadADtoCompleto(PersonaNatural apn_entidad) {
		PersonaNaturalDTO lpnd_dto = entidadADtoSimple(apn_entidad);
		if (apn_entidad.getPersona() != null) {
			PersonaDTO lph_persona = PersonaHelper.entidadADtoSimple(apn_entidad.getPersona());
			lph_persona.setItd_tipoDocumentoDto(
					TipoDocumentoHelper.entidadADtoCompleto(apn_entidad.getPersona().getTipoDocumento()));
			lpnd_dto.setIp_personaDto(PersonaHelper.entidadADtoSimple(apn_entidad.getPersona()));
		}
		if (apn_entidad.getCatalogoTipoGenero() != null)
			lpnd_dto.setIc_catalogoTipoGenero(CatalogoHelper.entidadADtoSimple(apn_entidad.getCatalogoTipoGenero()));

		return lpnd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alpn_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         PersonaNaturalDTO
	 */
	public static List<PersonaNaturalDTO> listaEntidadADtoSimple(List<PersonaNatural> alpn_listaEntidad) {
		List<PersonaNaturalDTO> llpnd_listaDto = new ArrayList<>();
		for (PersonaNatural lpn_entidad : alpn_listaEntidad) {
			llpnd_listaDto.add(entidadADtoSimple(lpn_entidad));
		}
		return llpnd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alpn_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de PersonaNaturalDTO
	 */
	public static List<PersonaNaturalDTO> listaEntidadADtoCompleto(List<PersonaNatural> alpn_listaEntidad) {
		List<PersonaNaturalDTO> llpnd_listaDto = new ArrayList<>();
		for (PersonaNatural lpn_entidad : alpn_listaEntidad) {
			llpnd_listaDto.add(entidadADtoCompleto(lpn_entidad));
		}
		return llpnd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apnd_dto    el parametro dto
	 * @param apn_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como PersonaNatural
	 */
	public static PersonaNatural dtoAEntidadSimple(PersonaNaturalDTO apnd_dto, PersonaNatural apn_entidad) {
		if (null == apn_entidad) {
			apn_entidad = new PersonaNatural();
		}
		apn_entidad.setFechaExpedicion(apnd_dto.getId_fechaExpedicion());
		apn_entidad.setFechaNacimiento(apnd_dto.getId_fechaNacimiento());
		apn_entidad.setPrimerApellido(apnd_dto.getIs_primerApellido());
		apn_entidad.setPrimerNombre(apnd_dto.getIs_primerNombre());
		apn_entidad.setSegundoApellido(apnd_dto.getIs_segundoApellido());
		apn_entidad.setSegundoNombre(apnd_dto.getIs_segundoNombre());
		apn_entidad.setTelefono(apnd_dto.getIs_telefono());
		apn_entidad.setFechaCreacion(apnd_dto.getId_fechaCreacion());
		apn_entidad.setFechaModificacion(apnd_dto.getId_fechaModificacion());
		apn_entidad.setIdUsuarioCreacion(apnd_dto.getIs_idUsuarioCreacion());
		apn_entidad.setIdUsuarioModificacion(apnd_dto.getIs_idUsuarioModificacion());
		apn_entidad.setIpCreacion(apnd_dto.getIs_ipCreacion());
		apn_entidad.setIpModificacion(apnd_dto.getIs_ipModificacion());
		apn_entidad.setEstereotipoCreacion(apnd_dto.getIs_estereotipoCreacion());
		apn_entidad.setEstereotipoModificacion(apnd_dto.getIs_estereotipoModificacion());
		apn_entidad.setActivo(apnd_dto.getIs_activo());
		return apn_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param apnd_dto    el parametro dto
	 * @param apn_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como PersonaNatural
	 */
	public static PersonaNatural dtoAEntidadCompleto(PersonaNaturalDTO apnd_dto, PersonaNatural apn_entidad) {
		apn_entidad = dtoAEntidadSimple(apnd_dto, apn_entidad);
		if (apnd_dto.getIp_personaDto() != null) {
			apn_entidad.setPersona(new Persona());
			apn_entidad.getPersona().setId(apnd_dto.getIp_personaDto().getIs_id());
		}
		if (apnd_dto.getIc_catalogoTipoGenero() != null) {
			apn_entidad.setCatalogoTipoGenero(new Catalogo());
			apn_entidad.getCatalogoTipoGenero().setId(apnd_dto.getIc_catalogoTipoGenero().getIs_id());
		}

		return apn_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpnd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         PersonaNatural
	 */
	public static List<PersonaNatural> listaDtoAEntidadSimple(List<PersonaNaturalDTO> alpnd_listaDto) {
		List<PersonaNatural> llpn_listaEntidad = new ArrayList<>();
		for (PersonaNaturalDTO lpnd_dto : alpnd_listaDto) {
			llpn_listaEntidad.add(dtoAEntidadSimple(lpnd_dto, null));
		}
		return llpn_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alpnd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de PersonaNatural
	 */
	public static List<PersonaNatural> listaDtoAEntidadCompleto(List<PersonaNaturalDTO> alpnd_listaDto) {
		List<PersonaNatural> llpn_listaEntidad = new ArrayList<>();
		for (PersonaNaturalDTO lpnd_dto : alpnd_listaDto) {
			llpn_listaEntidad.add(dtoAEntidadCompleto(lpnd_dto, null));
		}
		return llpn_listaEntidad;
	}
	// --- fin to Entidad
}
