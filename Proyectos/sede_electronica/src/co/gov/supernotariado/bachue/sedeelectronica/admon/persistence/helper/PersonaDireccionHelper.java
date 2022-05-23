/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaDireccionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PersonaDireccionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Persona
 * direccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaDireccionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaDireccionHelper.
	 */
	// --- to DTO
	private PersonaDireccionHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param apd_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         PersonaDireccionDTO
	 */
	public static PersonaDireccionDTO entidadADtoSimple(PersonaDireccion apd_entidad) {
		PersonaDireccionDTO lpd_dto = new PersonaDireccionDTO();
		lpd_dto.setIs_id(apd_entidad.getId());
		lpd_dto.setIs_activo(apd_entidad.getActivo());
		lpd_dto.setId_fechaCreacion(apd_entidad.getFechaCreacion());
		lpd_dto.setId_fechaModificacion(apd_entidad.getFechaModificacion());
		lpd_dto.setIs_idUsuarioCreacion(apd_entidad.getIdUsuarioCreacion());
		lpd_dto.setIs_idUsuarioModificacion(apd_entidad.getIdUsuarioModificacion());
		lpd_dto.setIs_ipCreacion(apd_entidad.getIpCreacion());
		lpd_dto.setIs_ipModificacion(apd_entidad.getIpModificacion());
		lpd_dto.setIs_estereotipoCreacion(apd_entidad.getEstereotipoCreacion());
		lpd_dto.setIs_estereotipoModificacion(apd_entidad.getEstereotipoModificacion());

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apd_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         PersonaDireccionDTO
	 */
	public static PersonaDireccionDTO entidadADtoCompleto(PersonaDireccion apd_entidad) {
		PersonaDireccionDTO lpd_dto = entidadADtoSimple(apd_entidad);
		if (apd_entidad.getDireccion() != null)
			lpd_dto.setId_direccion(DireccionHelper.entidadADtoCompleto(apd_entidad.getDireccion()));
		if (apd_entidad.getPersona() != null)
			lpd_dto.setIp_persona(PersonaHelper.entidadADtoSimple(apd_entidad.getPersona()));

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alpd_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         PersonaDireccionDTO
	 */
	public static List<PersonaDireccionDTO> listaentidadADtoSimple(List<PersonaDireccion> alpd_listaEntidad) {
		List<PersonaDireccionDTO> llpd_listaDto = new ArrayList<>();
		for (PersonaDireccion lpd_entidad : alpd_listaEntidad) {
			llpd_listaDto.add(entidadADtoSimple(lpd_entidad));
		}
		return llpd_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos incluyendo relaciones.
	 *
	 * @param alpd_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de PersonaDireccionDTO
	 */
	public static List<PersonaDireccionDTO> listaentidadADtoCompleto(List<PersonaDireccion> alpd_listaEntidad) {
		List<PersonaDireccionDTO> llpd_listaDto = new ArrayList<>();
		for (PersonaDireccion lpd_entidad : alpd_listaEntidad) {
			llpd_listaDto.add(entidadADtoCompleto(lpd_entidad));
		}
		return llpd_listaDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apd_dto     el parametro dto
	 * @param apd_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como PersonaDireccion
	 */
	public static PersonaDireccion dtoAEntidadSimple(PersonaDireccionDTO apd_dto, PersonaDireccion apd_entidad) {
		if (null == apd_entidad) {
			apd_entidad = new PersonaDireccion();
		}
		apd_entidad.setId(apd_dto.getIs_id());
		apd_entidad.setActivo(apd_dto.getIs_activo());
		apd_entidad.setFechaCreacion(apd_dto.getId_fechaCreacion());
		apd_entidad.setFechaModificacion(apd_dto.getId_fechaModificacion());
		apd_entidad.setIdUsuarioCreacion(apd_dto.getIs_idUsuarioCreacion());
		apd_entidad.setIdUsuarioModificacion(apd_dto.getIs_idUsuarioModificacion());
		apd_entidad.setIpCreacion(apd_dto.getIs_ipCreacion());
		apd_entidad.setIpModificacion(apd_dto.getIs_ipModificacion());
		apd_entidad.setEstereotipoCreacion(apd_dto.getIs_estereotipoCreacion());
		apd_entidad.setEstereotipoModificacion(apd_dto.getIs_estereotipoModificacion());
		return apd_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apd_dto     el parametro dto
	 * @param apd_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como PersonaDireccion
	 */
	public static PersonaDireccion dtoAEntidadCompleto(PersonaDireccionDTO apd_dto, PersonaDireccion apd_entidad) {
		apd_entidad = dtoAEntidadSimple(apd_dto, apd_entidad);
		if (apd_dto.getId_direccion() != null) {
			apd_entidad.setDireccion(DireccionHelper.dtoAEntidadCompleto(apd_dto.getId_direccion(), new Direccion()));
		}
		if (apd_dto.getIp_persona() != null) {
			apd_entidad.setPersona(new Persona());
			apd_entidad.getPersona().setId(apd_dto.getIp_persona().getIs_id());
		}

		return apd_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         PersonaDireccion
	 */
	public static List<PersonaDireccion> listadtoAEntidadSimple(List<PersonaDireccionDTO> alpd_listaDto) {
		List<PersonaDireccion> llpd_listaEntidad = new ArrayList<>();
		for (PersonaDireccionDTO lpd_dto : alpd_listaDto) {
			llpd_listaEntidad.add(dtoAEntidadSimple(lpd_dto, null));
		}
		return llpd_listaEntidad;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de PersonaDireccion
	 */
	public static List<PersonaDireccion> listadtoAEntidadCompleto(List<PersonaDireccionDTO> alpd_listaDto) {
		List<PersonaDireccion> llpd_listaEntidad = new ArrayList<>();
		for (PersonaDireccionDTO lpd_dto : alpd_listaDto) {
			llpd_listaEntidad.add(dtoAEntidadCompleto(lpd_dto, null));
		}
		return llpd_listaEntidad;
	}
	// --- fin to Entidad
}
