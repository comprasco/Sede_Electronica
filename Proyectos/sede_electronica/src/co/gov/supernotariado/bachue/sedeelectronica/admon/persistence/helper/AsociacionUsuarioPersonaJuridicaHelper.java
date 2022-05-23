/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridicaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AsociacionUsuarioPersonaJuridicaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Asociacion
 * usuario persona juridica. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioPersonaJuridicaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridicaHelper.
	 */
	// --- to DTO
	private AsociacionUsuarioPersonaJuridicaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Método que convierte de entidad a dto.
	 *
	 * @param aaupj_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static AsociacionUsuarioPersonaJuridicaDTO entidadADtoSimple(
			AsociacionUsuarioPersonaJuridica aaupj_entidad) {
		AsociacionUsuarioPersonaJuridicaDTO laupj_dto = new AsociacionUsuarioPersonaJuridicaDTO();
		laupj_dto.setIs_idAsociacion(aaupj_entidad.getIdAsociacion());
		laupj_dto.setIs_activo(aaupj_entidad.getActivo());
		laupj_dto.setIs_celularCorporativo(aaupj_entidad.getCelularCorporativo());
		laupj_dto.setIs_confirmacionUsuario(aaupj_entidad.getConfirmacionUsuario());
		laupj_dto.setIs_correoElectronicoCorporativo(aaupj_entidad.getCorreoElectronicoCorporativo());
		laupj_dto.setIs_estadoAsociacion(aaupj_entidad.getEstadoAsociacion());
		laupj_dto.setIs_estadoCuentaCupo(aaupj_entidad.getEstadoCuentaCupo());
		laupj_dto.setId_fechaCreacion(aaupj_entidad.getFechaCreacion());
		laupj_dto.setId_fechaModificacion(aaupj_entidad.getFechaModificacion());
		laupj_dto.setIs_idUsuarioCreacion(aaupj_entidad.getIdUsuarioCreacion());
		laupj_dto.setIs_idUsuarioModificacion(aaupj_entidad.getIdUsuarioModificacion());
		laupj_dto.setIs_ipCreacion(aaupj_entidad.getIpCreacion());
		laupj_dto.setIs_ipModificacion(aaupj_entidad.getIpModificacion());
		laupj_dto.setIs_activo(aaupj_entidad.getActivo());
		laupj_dto.setIs_estereotipoCreacion(aaupj_entidad.getEstereotipoCreacion());
		laupj_dto.setIs_estereotipoModificacion(aaupj_entidad.getEstereotipoModificacion());

		return laupj_dto;
	}

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aaupj_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static AsociacionUsuarioPersonaJuridicaDTO entidadADtoCompleto(
			AsociacionUsuarioPersonaJuridica aaupj_entidad) {
		AsociacionUsuarioPersonaJuridicaDTO laupj_dto = entidadADtoSimple(aaupj_entidad);
		if (aaupj_entidad.getUsuario() != null)
			laupj_dto.setIu_usuarioDto(
					UsuarioHelper.entidadADtoDireccionPersonaJuridaSinArchivo(aaupj_entidad.getUsuario()));

		if (aaupj_entidad.getPersonaJuridica() != null) {
			laupj_dto.setIpj_idPersonaJuridica(
					PersonaJuridicaHelper.entidadADtoCompleto(aaupj_entidad.getPersonaJuridica()));
			laupj_dto.setIs_idPersonaJuridica(aaupj_entidad.getIdPersonaJuridica());
		}
		return laupj_dto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO.
	 *
	 * @param alaupj_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static List<AsociacionUsuarioPersonaJuridicaDTO> listaEntidadADtoSimple(
			List<AsociacionUsuarioPersonaJuridica> alaupj_listaEntidad) {
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaDto = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridica laupj_entidad : alaupj_listaEntidad) {
			llaupj_listaDto.add(entidadADtoSimple(laupj_entidad));
		}
		return llaupj_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO usando
	 * todos los datos.
	 *
	 * @param alaupj_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static List<AsociacionUsuarioPersonaJuridicaDTO> listaentidadADtoCompleto(
			List<AsociacionUsuarioPersonaJuridica> alaupj_listaEntidad) {
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaDto = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridica laupj_entidad : alaupj_listaEntidad) {
			llaupj_listaDto.add(entidadADtoCompleto(laupj_entidad));
		}
		return llaupj_listaDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Método que convierte un DTO a una entidad.
	 *
	 * @param aaupj_dto     el parametro dto
	 * @param aaupj_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         AsociacionUsuarioPersonaJuridica
	 */
	public static AsociacionUsuarioPersonaJuridica dtoAEntidadSimple(AsociacionUsuarioPersonaJuridicaDTO aaupj_dto,
			AsociacionUsuarioPersonaJuridica aaupj_entidad) {
		if (null == aaupj_entidad) {
			aaupj_entidad = new AsociacionUsuarioPersonaJuridica();
		}
		aaupj_entidad.setIdAsociacion(aaupj_dto.getIs_idAsociacion());
		aaupj_entidad.setActivo(aaupj_dto.getIs_activo());
		aaupj_entidad.setCelularCorporativo(aaupj_dto.getIs_celularCorporativo());
		aaupj_entidad.setConfirmacionUsuario(aaupj_dto.getIs_confirmacionUsuario());
		aaupj_entidad.setCorreoElectronicoCorporativo(aaupj_dto.getIs_correoElectronicoCorporativo());
		aaupj_entidad.setEstadoAsociacion(aaupj_dto.getIs_estadoAsociacion());
		aaupj_entidad.setEstadoCuentaCupo(aaupj_dto.getIs_estadoCuentaCupo());
		aaupj_entidad.setFechaCreacion(aaupj_dto.getId_fechaCreacion());
		aaupj_entidad.setFechaModificacion(aaupj_dto.getId_fechaModificacion());
		aaupj_entidad.setIdUsuarioCreacion(aaupj_dto.getIs_idUsuarioCreacion());
		aaupj_entidad.setIdUsuarioModificacion(aaupj_dto.getIs_idUsuarioModificacion());
		aaupj_entidad.setIpCreacion(aaupj_dto.getIs_ipCreacion());
		aaupj_entidad.setIpModificacion(aaupj_dto.getIs_ipModificacion());
		aaupj_entidad.setActivo(aaupj_dto.getIs_activo());
		aaupj_entidad.setEstereotipoCreacion(aaupj_dto.getIs_estereotipoCreacion());
		aaupj_entidad.setEstereotipoModificacion(aaupj_dto.getIs_estereotipoModificacion());
		return aaupj_entidad;
	}

	/**
	 * Método que convierte un DTO a una entidad incluyendo relaciones.
	 *
	 * @param aaupj_dto     el parametro dto
	 * @param aaupj_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         AsociacionUsuarioPersonaJuridica
	 */
	public static AsociacionUsuarioPersonaJuridica dtoAEntidadCompleto(AsociacionUsuarioPersonaJuridicaDTO aaupj_dto,
			AsociacionUsuarioPersonaJuridica aaupj_entidad) {
		aaupj_entidad = dtoAEntidadSimple(aaupj_dto, aaupj_entidad);
		if (aaupj_dto.getIu_usuarioDto() != null) {
			aaupj_entidad.setUsuario(UsuarioHelper.dtoAEntidadCompleto(aaupj_dto.getIu_usuarioDto(), new Usuario()));
		}
		if (aaupj_dto.getIpj_idPersonaJuridica() != null) {
			aaupj_entidad.setPersonaJuridica(PersonaJuridicaHelper
					.dtoAEntidadCompleto(aaupj_dto.getIpj_idPersonaJuridica(), new PersonaJuridica()));
			aaupj_entidad.setIdPersonaJuridica(aaupj_entidad.getPersonaJuridica().getPersona().getId());
			aaupj_entidad.getPersonaJuridica().setPersona(PersonaHelper
					.dtoAEntidadCompleto(aaupj_dto.getIpj_idPersonaJuridica().getIp_personaDto(), new Persona()));
		}

		return aaupj_entidad;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades *.
	 *
	 * @param alaupj_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         AsociacionUsuarioPersonaJuridica
	 */
	public static List<AsociacionUsuarioPersonaJuridica> listadtoAEntidadSimple(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_listaDto) {
		List<AsociacionUsuarioPersonaJuridica> llaupj_listaEntidad = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridicaDTO laupj_dto : alaupj_listaDto) {
			llaupj_listaEntidad.add(dtoAEntidadSimple(laupj_dto, null));
		}
		return llaupj_listaEntidad;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alaupj_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de AsociacionUsuarioPersonaJuridica
	 */
	public static List<AsociacionUsuarioPersonaJuridica> listadtoAEntidadCompleto(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_listaDto) {
		List<AsociacionUsuarioPersonaJuridica> llaupj_listaEntidad = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridicaDTO laupj_dto : alaupj_listaDto) {
			llaupj_listaEntidad.add(dtoAEntidadCompleto(laupj_dto, null));
		}
		return llaupj_listaEntidad;
	}
	// --- fin to Entidad
}
