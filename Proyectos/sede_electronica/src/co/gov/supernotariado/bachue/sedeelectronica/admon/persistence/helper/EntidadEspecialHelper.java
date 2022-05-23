/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadEspecialHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: EntidadEspecialHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumValores;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Entidad
 * especial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadEspecialHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase EntidadEspecialHelper.
	 */
	// --- to DTO
	private EntidadEspecialHelper() {
		// Constructor vacio de clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param aee_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como EntidadEspecialDTO
	 */
	public static EntidadEspecialDTO entidadADtoSimple(EntidadEspecial aee_entidad) {
		EntidadEspecialDTO lee_dto = new EntidadEspecialDTO();
		lee_dto.setIs_id(aee_entidad.getId());
		lee_dto.setIs_activo(aee_entidad.getActivo());
		lee_dto.setIs_numeroDocumentoRL(aee_entidad.getDocumentoRepresentanteLegal());
		lee_dto.setId_fechaCreacion(aee_entidad.getFechaCreacion());
		lee_dto.setId_fechaModificacion(aee_entidad.getFechaModificacion());
		lee_dto.setIs_tipoDocumentoRL(aee_entidad.getIdTipoDocumentoEntidadEspecial());
		lee_dto.setIs_idUsuarioCreacion(aee_entidad.getIdUsuarioCreacion());
		lee_dto.setIs_idUsuarioModificacion(aee_entidad.getIdUsuarioModificacion());
		lee_dto.setIs_ipCreacion(aee_entidad.getIpCreacion());
		lee_dto.setIs_ipModificacion(aee_entidad.getIpModificacion());
		lee_dto.setIs_nombreEntidadExterna(aee_entidad.getRazonSocial());
		lee_dto.setIs_nombreCompletoRL(aee_entidad.getRepresentanteLegal());
		lee_dto.setIs_telefono(aee_entidad.getTelefono());
		lee_dto.setIs_tipoEntidad(aee_entidad.getTipoEntidad());
		lee_dto.setIs_codigoEntidad(aee_entidad.getCodigoEntidad());
		lee_dto.setIs_estereotipoCreacion(aee_entidad.getEstereotipoCreacion());
		lee_dto.setIs_estereotipoModificacion(aee_entidad.getEstereotipoModificacion());

		return lee_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aee_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         EntidadEspecialDTO
	 */
	public static EntidadEspecialDTO entidadADtoCompleto(EntidadEspecial aee_entidad) {
		EntidadEspecialDTO lee_dto = entidadADtoSimple(aee_entidad);
		if(aee_entidad.getUsuarios() != null) {
			lee_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(aee_entidad.getUsuarios().iterator().next()));
		}
		return lee_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones de usuario.
	 *
	 * @param aee_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo usuario retornado como
	 *         EntidadEspecialDTO
	 */
	public static EntidadEspecialDTO entidadADtoCompletoUsuario(EntidadEspecial aee_entidad) {
		if (aee_entidad == null) {
			return null;
		}
		EntidadEspecialDTO lee_dto = entidadADtoSimple(aee_entidad);
		if (aee_entidad.getUsuarios() != null && !aee_entidad.getUsuarios().isEmpty()) {
			lee_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(aee_entidad.getUsuarios().iterator().next()));
			lee_dto.setIs_correoElectronico(lee_dto.getIu_usuarioDto().getIs_correoElectronico());
		}
		return lee_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alee_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         EntidadEspecialDTO
	 */
	public static List<EntidadEspecialDTO> listaentidadADtoSimple(List<EntidadEspecial> alee_listaEntidad) {
		List<EntidadEspecialDTO> llee_listaDto = new ArrayList<>();
		for (EntidadEspecial lee_entidad : alee_listaEntidad) {
			llee_listaDto.add(entidadADtoSimple(lee_entidad));
		}
		return llee_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alee_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de EntidadEspecialDTO
	 */
	public static List<EntidadEspecialDTO> listaentidadADtoCompleto(List<EntidadEspecial> alee_listaEntidad) {
		List<EntidadEspecialDTO> llee_listaDto = new ArrayList<>();
		for (EntidadEspecial lee_entidad : alee_listaEntidad) {
			llee_listaDto.add(entidadADtoCompletoUsuario(lee_entidad));
		}
		return llee_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aee_dto     el parametro dto
	 * @param aee_entidad el parametro lee entidad
	 * @return Resultado para dto A entidad simple retornado como EntidadEspecial
	 */
	public static EntidadEspecial dtoAEntidadSimple(EntidadEspecialDTO aee_dto, EntidadEspecial aee_entidad) {
		if (null == aee_entidad) {
			aee_entidad = new EntidadEspecial();
		}
		aee_entidad.setId(aee_dto.getIs_id());
		aee_entidad.setActivo(aee_dto.getIs_activo());
		aee_entidad.setDocumentoRepresentanteLegal(aee_dto.getIs_numeroDocumentoRL()==null? EnumValores.NO_APLICA.getIs_valor():aee_dto.getIs_numeroDocumentoRL());
		aee_entidad.setFechaCreacion(aee_dto.getId_fechaCreacion());
		aee_entidad.setFechaModificacion(aee_dto.getId_fechaModificacion());
		aee_entidad.setIdTipoDocumentoEntidadEspecial(aee_dto.getIs_tipoDocumentoRL());
		aee_entidad.setIdUsuarioCreacion(aee_dto.getIs_idUsuarioCreacion());
		aee_entidad.setIdUsuarioModificacion(aee_dto.getIs_idUsuarioModificacion());
		aee_entidad.setIpCreacion(aee_dto.getIs_ipCreacion());
		aee_entidad.setIpModificacion(aee_dto.getIs_ipModificacion());
		aee_entidad.setRazonSocial(aee_dto.getIs_nombreEntidadExterna()==null? EnumValores.NO_APLICA.getIs_valor():aee_dto.getIs_nombreEntidadExterna());
		aee_entidad.setRepresentanteLegal(aee_dto.getIs_nombreCompletoRL()==null? EnumValores.NO_APLICA.getIs_valor():aee_dto.getIs_nombreCompletoRL());
		aee_entidad.setTelefono(aee_dto.getIs_telefono());
		aee_entidad.setTipoEntidad(aee_dto.getIs_tipoEntidad()==null? EnumValores.NO_APLICA.getIs_valor():aee_dto.getIs_tipoEntidad());
		aee_entidad.setCodigoEntidad(aee_dto.getIs_codigoEntidad());
		aee_entidad.setDocumentoEntidadEspecial(aee_dto.getIs_codigoEntidad());
		aee_entidad.setEstereotipoCreacion(aee_dto.getIs_estereotipoCreacion());
		aee_entidad.setEstereotipoModificacion(aee_dto.getIs_estereotipoModificacion());
		return aee_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aee_dto     el parametro dto
	 * @param aee_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como EntidadEspecial
	 */
	public static EntidadEspecial dtoAEntidadCompleto(EntidadEspecialDTO aee_dto, EntidadEspecial aee_entidad) {
		aee_entidad = dtoAEntidadSimple(aee_dto, aee_entidad);
		return aee_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param alee_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         EntidadEspecial
	 */
	public static List<EntidadEspecial> listadtoAEntidadSimple(List<EntidadEspecialDTO> alee_listaDto) {
		List<EntidadEspecial> llee_listaEntidad = new ArrayList<>();
		for (EntidadEspecialDTO lee_dto : alee_listaDto) {
			llee_listaEntidad.add(dtoAEntidadSimple(lee_dto, null));
		}
		return llee_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alee_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de EntidadEspecial
	 */
	public static List<EntidadEspecial> listadtoAEntidadCompleto(List<EntidadEspecialDTO> alee_listaDto) {
		List<EntidadEspecial> llee_listaEntidad = new ArrayList<>();
		for (EntidadEspecialDTO lee_dto : alee_listaDto) {
			llee_listaEntidad.add(dtoAEntidadCompleto(lee_dto, null));
		}
		return llee_listaEntidad;
	}
	// --- fin to Entidad
}
