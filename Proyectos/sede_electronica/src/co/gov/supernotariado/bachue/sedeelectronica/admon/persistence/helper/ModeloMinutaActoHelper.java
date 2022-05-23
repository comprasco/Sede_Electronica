/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaActoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ModeloMinutaActoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Modelo minuta
 * acto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ModeloMinutaActoHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase ModeloMinutaActoHelper.
	 */
	private ModeloMinutaActoHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param amma_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ModeloMinutaActoDTO
	 */
	public static ModeloMinutaActoDTO entidadADtoSimple(ModeloMinutaActo amma_entidad) {
		ModeloMinutaActoDTO lmma_dto = new ModeloMinutaActoDTO();
		lmma_dto.setIs_id(amma_entidad.getId());
		lmma_dto.setIs_activo(amma_entidad.getActivo());
		lmma_dto.setId_fechaCreacion(amma_entidad.getFechaCreacion());
		lmma_dto.setId_fechaModificacion(amma_entidad.getFechaModificacion());
		lmma_dto.setIs_idUsuarioCreacion(amma_entidad.getIdUsuarioCreacion());
		lmma_dto.setIs_idUsuarioModificacion(amma_entidad.getIdUsuarioModificacion());
		lmma_dto.setIs_ipCreacion(amma_entidad.getIpCreacion());
		lmma_dto.setIs_ipModificacion(amma_entidad.getIpModificacion());
		lmma_dto.setIs_estereotipoCreacion(amma_entidad.getEstereotipoCreacion());
		lmma_dto.setIs_estereotipoModificacion(amma_entidad.getEstereotipoModificacion());
		return lmma_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param amma_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ModeloMinutaActoDTO
	 */
	public static ModeloMinutaActoDTO entidadADtoCompleto(ModeloMinutaActo amma_entidad) {
		ModeloMinutaActoDTO lmma_dto = entidadADtoSimple(amma_entidad);
		if (amma_entidad.getModeloMinuta() != null)
			lmma_dto.setImm_modeloMinuta(ModeloMinutaHelper.entidadADtoSimple(amma_entidad.getModeloMinuta()));
		if (amma_entidad.getTipoActo() != null)
			lmma_dto.setIta_tipoActo(TipoActoHelper.entidadADtoSimple(amma_entidad.getTipoActo()));

		return lmma_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param almma_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         ModeloMinutaActoDTO
	 */
	public static List<ModeloMinutaActoDTO> listaentidadADtoSimple(List<ModeloMinutaActo> almma_listEntidad) {
		List<ModeloMinutaActoDTO> llmma_listDto = new ArrayList<>();
		for (ModeloMinutaActo lmma_entidad : almma_listEntidad) {
			llmma_listDto.add(entidadADtoSimple(lmma_entidad));
		}
		return llmma_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param almma_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de ModeloMinutaActoDTO
	 */
	public static List<ModeloMinutaActoDTO> listaentidadADtoCompleto(List<ModeloMinutaActo> almma_listEntidad) {
		List<ModeloMinutaActoDTO> llmma_listDto = new ArrayList<>();
		for (ModeloMinutaActo lmma_entidad : almma_listEntidad) {
			llmma_listDto.add(entidadADtoCompleto(lmma_entidad));
		}
		return llmma_listDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param amma_dto     el parametro dto
	 * @param amma_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como ModeloMinutaActo
	 */
	public static ModeloMinutaActo dtoAEntidadSimple(ModeloMinutaActoDTO amma_dto, ModeloMinutaActo amma_entidad) {
		if (null == amma_entidad) {
			amma_entidad = new ModeloMinutaActo();
		}
		amma_entidad.setId(amma_dto.getIs_id());
		amma_entidad.setActivo(amma_dto.getIs_activo());
		amma_entidad.setFechaCreacion(amma_dto.getId_fechaCreacion());
		amma_entidad.setFechaModificacion(amma_dto.getId_fechaModificacion());
		amma_entidad.setIdUsuarioCreacion(amma_dto.getIs_idUsuarioCreacion());
		amma_entidad.setIdUsuarioModificacion(amma_dto.getIs_idUsuarioModificacion());
		amma_entidad.setIpCreacion(amma_dto.getIs_ipCreacion());
		amma_entidad.setIpModificacion(amma_dto.getIs_ipModificacion());
		amma_entidad.setEstereotipoCreacion(amma_dto.getIs_estereotipoCreacion());
		amma_entidad.setEstereotipoModificacion(amma_dto.getIs_estereotipoModificacion());
		return amma_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param amma_dto     el parametro dto
	 * @param amma_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como ModeloMinutaActo
	 */
	public static ModeloMinutaActo dtoAEntidadCompleto(ModeloMinutaActoDTO amma_dto, ModeloMinutaActo amma_entidad) {
		amma_entidad = dtoAEntidadSimple(amma_dto, amma_entidad);
		if (amma_dto.getImm_modeloMinuta() != null) {
			amma_entidad.setModeloMinuta(new ModeloMinuta());
			amma_entidad.getModeloMinuta().setId(amma_dto.getImm_modeloMinuta().getIs_id());
		}
		if (amma_dto.getIta_tipoActo() != null) {
			amma_entidad.setTipoActo(new TipoActo());
			amma_entidad.getTipoActo().setId(amma_dto.getIta_tipoActo().getIs_id());
		}

		return amma_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param almma_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ModeloMinutaActo
	 */
	public static List<ModeloMinutaActo> listadtoAEntidadSimple(List<ModeloMinutaActoDTO> almma_listDto) {
		List<ModeloMinutaActo> llmma_listEntidad = new ArrayList<>();
		for (ModeloMinutaActoDTO lmma_dto : almma_listDto) {
			llmma_listEntidad.add(dtoAEntidadSimple(lmma_dto, null));
		}
		return llmma_listEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param almma_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ModeloMinutaActo
	 */
	public static List<ModeloMinutaActo> listadtoAEntidadCompleto(List<ModeloMinutaActoDTO> almma_listDto) {
		List<ModeloMinutaActo> llmma_listEntidad = new ArrayList<>();
		for (ModeloMinutaActoDTO lmma_dto : almma_listDto) {
			llmma_listEntidad.add(dtoAEntidadCompleto(lmma_dto, null));
		}
		return llmma_listEntidad;
	}
	// --- fin to Entidad
}
