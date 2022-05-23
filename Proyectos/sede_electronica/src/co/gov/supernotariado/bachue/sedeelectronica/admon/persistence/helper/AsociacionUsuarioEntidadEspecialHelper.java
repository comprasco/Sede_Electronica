/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspecialHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AsociacionUsuarioEntidadEspecialHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Asociacion
 * usuario entidad especial. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioEntidadEspecialHelper {
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecialHelper.
	 */
	// --- to DTO
	private AsociacionUsuarioEntidadEspecialHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Método que convierte de entidad a DTO.
	 *
	 * @param aauee_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public static AsociacionUsuarioEntidadEspecialDTO entidadADtoSimple(
			AsociacionUsuarioEntidadEspecial aauee_entidad) {
		AsociacionUsuarioEntidadEspecialDTO lauee_dto = new AsociacionUsuarioEntidadEspecialDTO();
		lauee_dto.setIs_idAsociacion(aauee_entidad.getIdAsociacion());
		lauee_dto.setIs_activo(aauee_entidad.getActivo());
		lauee_dto.setIs_celular(aauee_entidad.getCelular());
		lauee_dto.setIs_confirmacionUsuario(aauee_entidad.getConfirmacionUsuario());
		lauee_dto.setIs_correoElectronico(aauee_entidad.getCorreoElectronico());
		lauee_dto.setIs_estado(aauee_entidad.getEstado());
		lauee_dto.setId_fechaCreacion(aauee_entidad.getFechaCreacion());
		lauee_dto.setId_fechaModificacion(aauee_entidad.getFechaModificacion());
		lauee_dto.setIs_idUsuarioCreacion(aauee_entidad.getIdUsuarioCreacion());
		lauee_dto.setIs_idUsuarioModificacion(aauee_entidad.getIdUsuarioModificacion());
		lauee_dto.setIs_ipCreacion(aauee_entidad.getIpCreacion());
		lauee_dto.setIs_ipModificacion(aauee_entidad.getIpModificacion());
		lauee_dto.setIs_estereotipoCreacion(aauee_entidad.getEstereotipoCreacion());
		lauee_dto.setIs_estereotipoModificacion(aauee_entidad.getEstereotipoModificacion());

		return lauee_dto;
	}

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aauee_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public static AsociacionUsuarioEntidadEspecialDTO entidadADtoCompleto(
			AsociacionUsuarioEntidadEspecial aauee_entidad) {
		AsociacionUsuarioEntidadEspecialDTO lauee_dto = entidadADtoSimple(aauee_entidad);
		if (aauee_entidad.getEntidadEspecial() != null)
			lauee_dto.setIee_entidadEspecial(
					EntidadEspecialHelper.entidadADtoCompletoUsuario(aauee_entidad.getEntidadEspecial()));
		if (aauee_entidad.getUsuario() != null) {
			lauee_dto.setIu_usuarioDto(
					UsuarioHelper.entidadADtoDireccionPersonaJuridaSinArchivo(aauee_entidad.getUsuario()));
		}
		return lauee_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alauee_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public static List<AsociacionUsuarioEntidadEspecialDTO> listaentidadADtoSimple(
			List<AsociacionUsuarioEntidadEspecial> alauee_listaEntidad) {
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaDto = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecial lauee_entidad : alauee_listaEntidad) {
			llauee_listaDto.add(entidadADtoSimple(lauee_entidad));
		}
		return llauee_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO usando
	 * todos los datos.
	 *
	 * @param alauee_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de AsociacionUsuarioEntidadEspecialDTO
	 */
	public static List<AsociacionUsuarioEntidadEspecialDTO> listaentidadADtoCompleto(
			List<AsociacionUsuarioEntidadEspecial> alauee_listaEntidad) {
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaDto = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecial lauee_entidad : alauee_listaEntidad) {
			llauee_listaDto.add(entidadADtoCompleto(lauee_entidad));
		}
		return llauee_listaDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Método que convierte un dto a una entidad.
	 *
	 * @param aauee_dto     el parametro dto
	 * @param aauee_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         AsociacionUsuarioEntidadEspecial
	 */
	public static AsociacionUsuarioEntidadEspecial dtoAEntidadSimple(AsociacionUsuarioEntidadEspecialDTO aauee_dto,
			AsociacionUsuarioEntidadEspecial aauee_entidad) {
		if (null == aauee_entidad) {
			aauee_entidad = new AsociacionUsuarioEntidadEspecial();
		}
		aauee_entidad.setIdAsociacion(aauee_dto.getIs_idAsociacion());
		aauee_entidad.setActivo(aauee_dto.getIs_activo());
		aauee_entidad.setCelular(aauee_dto.getIs_celular());
		aauee_entidad.setConfirmacionUsuario(aauee_dto.getIs_confirmacionUsuario());
		aauee_entidad.setCorreoElectronico(aauee_dto.getIs_correoElectronico());
		aauee_entidad.setEstado(aauee_dto.getIs_estado());
		aauee_entidad.setFechaCreacion(aauee_dto.getId_fechaCreacion());
		aauee_entidad.setFechaModificacion(aauee_dto.getId_fechaModificacion());
		aauee_entidad.setIdUsuarioCreacion(aauee_dto.getIs_idUsuarioCreacion());
		aauee_entidad.setIdUsuarioModificacion(aauee_dto.getIs_idUsuarioModificacion());
		aauee_entidad.setIpCreacion(aauee_dto.getIs_ipCreacion());
		aauee_entidad.setIpModificacion(aauee_dto.getIs_ipModificacion());
		aauee_entidad.setEstereotipoCreacion(aauee_dto.getIs_estereotipoCreacion());
		aauee_entidad.setEstereotipoModificacion(aauee_dto.getIs_estereotipoModificacion());

		return aauee_entidad;
	}

	/**
	 * Método que convierte un DTO a una entidad incluyendo relaciones.
	 *
	 * @param aauee_dto     el parametro dto
	 * @param aauee_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         AsociacionUsuarioEntidadEspecial
	 */
	public static AsociacionUsuarioEntidadEspecial dtoAEntidadCompleto(AsociacionUsuarioEntidadEspecialDTO aauee_dto,
			AsociacionUsuarioEntidadEspecial aauee_entidad) {
		aauee_entidad = dtoAEntidadSimple(aauee_dto, aauee_entidad);
		if (aauee_dto.getIee_entidadEspecial() != null) {
			aauee_entidad.setEntidadEspecial(new EntidadEspecial());
			aauee_entidad.getEntidadEspecial().setId(aauee_dto.getIee_entidadEspecial().getIs_id());
		}
		if (aauee_dto.getIu_usuarioDto() != null) {
			aauee_entidad.setUsuario(new Usuario());
			aauee_entidad.getUsuario().setId(aauee_dto.getIu_usuarioDto().getIs_id());
		}

		return aauee_entidad;
	}

	/**
	 * Método que convierte una lista DTO a una lista de entidades *.
	 *
	 * @param alauee_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         AsociacionUsuarioEntidadEspecial
	 */
	public static List<AsociacionUsuarioEntidadEspecial> listadtoAEntidadSimple(
			List<AsociacionUsuarioEntidadEspecialDTO> alauee_listaDto) {
		List<AsociacionUsuarioEntidadEspecial> lauee_listaEntidad = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecialDTO lauee_dto : alauee_listaDto) {
			lauee_listaEntidad.add(dtoAEntidadSimple(lauee_dto, null));
		}
		return lauee_listaEntidad;
	}

	/**
	 * Método que convierte una lista DTO a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alauee_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de AsociacionUsuarioEntidadEspecial
	 */
	public static List<AsociacionUsuarioEntidadEspecial> listadtoAEntidadCompleto(
			List<AsociacionUsuarioEntidadEspecialDTO> alauee_listaDto) {
		List<AsociacionUsuarioEntidadEspecial> llauee_listaEntidad = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecialDTO lauee_dto : alauee_listaDto) {
			llauee_listaEntidad.add(dtoAEntidadCompleto(lauee_dto, null));
		}
		return llauee_listaEntidad;
	}
	// --- fin to Entidad
}
