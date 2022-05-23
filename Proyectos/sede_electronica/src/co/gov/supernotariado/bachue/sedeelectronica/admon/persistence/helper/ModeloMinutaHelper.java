/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ModeloMinutaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Modelo
 * minuta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ModeloMinutaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ModeloMinutaHelper.
	 */
	// --- to DTO
	private ModeloMinutaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param amm_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como ModeloMinutaDTO
	 */
	public static ModeloMinutaDTO entidadADtoSimple(ModeloMinuta amm_entidad) {
		ModeloMinutaDTO lmm_dto = new ModeloMinutaDTO();
		lmm_dto.setIs_id(amm_entidad.getId());
		lmm_dto.setIs_activo(amm_entidad.getActivo());
		lmm_dto.setIf_archivo(amm_entidad.getArchivo());
		lmm_dto.setIs_estado(amm_entidad.getEstado());
		lmm_dto.setIs_extension(amm_entidad.getExtension());
		lmm_dto.setId_fechaCreacion(amm_entidad.getFechaCreacion());
		lmm_dto.setId_fechaModificacion(amm_entidad.getFechaModificacion());
		lmm_dto.setIs_idUsuarioCreacion(amm_entidad.getIdUsuarioCreacion());
		lmm_dto.setIs_idUsuarioModificacion(amm_entidad.getIdUsuarioModificacion());
		lmm_dto.setIs_ipCreacion(amm_entidad.getIpCreacion());
		lmm_dto.setIs_ipModificacion(amm_entidad.getIpModificacion());
		lmm_dto.setIs_nombre(amm_entidad.getNombre());
		lmm_dto.setIs_nombreDocumento(amm_entidad.getNombreDocumento());
		lmm_dto.setIs_estereotipoCreacion(amm_entidad.getEstereotipoCreacion());
		lmm_dto.setIs_estereotipoModificacion(amm_entidad.getEstereotipoModificacion());
		return lmm_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param amm_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como ModeloMinutaDTO
	 */
	public static ModeloMinutaDTO entidadADtoCompleto(ModeloMinuta amm_entidad) {
		ModeloMinutaDTO lmm_dto;
		lmm_dto = entidadADtoSimple(amm_entidad);
		return lmm_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param almm_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         ModeloMinutaDTO
	 */
	public static List<ModeloMinutaDTO> listaentidadADtoSimple(List<ModeloMinuta> almm_listEntidad) {
		List<ModeloMinutaDTO> llmm_listDto = new ArrayList<>();
		for (ModeloMinuta lmm_entidad : almm_listEntidad) {
			llmm_listDto.add(entidadADtoSimple(lmm_entidad));
		}
		return llmm_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param almm_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de ModeloMinutaDTO
	 */
	public static List<ModeloMinutaDTO> listaentidadADtoCompleto(List<ModeloMinuta> almm_listEntidad) {
		List<ModeloMinutaDTO> llmm_listDto = new ArrayList<>();
		for (ModeloMinuta lmm_entidad : almm_listEntidad) {
			llmm_listDto.add(entidadADtoCompleto(lmm_entidad));
		}
		return llmm_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param amm_dto     el parametro dto
	 * @param amm_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como ModeloMinuta
	 */
	public static ModeloMinuta dtoAEntidadSimple(ModeloMinutaDTO amm_dto, ModeloMinuta amm_entidad) {
		if (null == amm_entidad) {
			amm_entidad = new ModeloMinuta();
		}
		amm_entidad.setId(amm_dto.getIs_id());
		amm_entidad.setActivo(amm_dto.getIs_activo());
		amm_entidad.setArchivo(amm_dto.getIf_archivo());
		amm_entidad.setExtension(amm_dto.getIs_extension());
		amm_entidad.setEstado(amm_dto.getIs_estado());
		amm_entidad.setFechaCreacion(amm_dto.getId_fechaCreacion());
		amm_entidad.setFechaModificacion(amm_dto.getId_fechaModificacion());
		amm_entidad.setIdUsuarioCreacion(amm_dto.getIs_idUsuarioCreacion());
		amm_entidad.setIdUsuarioModificacion(amm_dto.getIs_idUsuarioModificacion());
		amm_entidad.setIpCreacion(amm_dto.getIs_ipCreacion());
		amm_entidad.setIpModificacion(amm_dto.getIs_ipModificacion());
		amm_entidad.setNombre(amm_dto.getIs_nombre());
		amm_entidad.setNombreDocumento(amm_dto.getIs_nombreDocumento());
		amm_entidad.setEstereotipoCreacion(amm_dto.getIs_estereotipoCreacion());
		amm_entidad.setEstereotipoModificacion(amm_dto.getIs_estereotipoModificacion());
		return amm_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param amm_dto     el parametro dto
	 * @param amm_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como ModeloMinuta
	 */
	public static ModeloMinuta dtoAEntidadCompleto(ModeloMinutaDTO amm_dto, ModeloMinuta amm_entidad) {
		amm_entidad = dtoAEntidadSimple(amm_dto, amm_entidad);

		return amm_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param almm_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ModeloMinuta
	 */
	public static List<ModeloMinuta> listadtoAEntidadSimple(List<ModeloMinutaDTO> almm_listDto) {
		List<ModeloMinuta> llmm_listEntidad = new ArrayList<>();
		for (ModeloMinutaDTO lmm_dto : almm_listDto) {
			llmm_listEntidad.add(dtoAEntidadSimple(lmm_dto, null));
		}
		return llmm_listEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param almm_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ModeloMinuta
	 */
	public static List<ModeloMinuta> listadtoAEntidadCompleto(List<ModeloMinutaDTO> almm_listDto) {
		List<ModeloMinuta> llmm_listEntidad = new ArrayList<>();
		for (ModeloMinutaDTO lmm_dto : almm_listDto) {
			llmm_listEntidad.add(dtoAEntidadCompleto(lmm_dto, null));
		}
		return llmm_listEntidad;
	}
	// --- fin to Entidad
}
