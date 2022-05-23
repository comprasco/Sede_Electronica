/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrizacionPlantillaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ParametrizacionPlantillaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad
 * Parametrizacion plantilla. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametrizacionPlantillaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametrizacionPlantillaHelper.
	 */
	private ParametrizacionPlantillaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a DTO.
	 *
	 * @param app_entidad a convertir
	 * @return Resultado para entidad A dto simple retornado como
	 *         ParametrizacionPlantillaDTO
	 */
	public static ParametrizacionPlantillaDTO entidadADtoSimple(ParametrizacionPlantilla app_entidad) {

		ParametrizacionPlantillaDTO lpp_dto = new ParametrizacionPlantillaDTO();

		lpp_dto.setIs_id(app_entidad.getId());
		lpp_dto.setIs_codigo(app_entidad.getCodigo());
		lpp_dto.setIs_confCamposAsunto(app_entidad.getConfCamposAsunto());
		lpp_dto.setIs_confCamposContenido(app_entidad.getConfCamposContenido());
		lpp_dto.setIs_confFrom(app_entidad.getConfFrom());
		lpp_dto.setIs_confHtmlContenido(app_entidad.getConfHtmlContenido());
		lpp_dto.setIs_confPrioridad(app_entidad.getConfPrioridad());
		lpp_dto.setIs_confTextoAsunto(app_entidad.getConfTextoAsunto());
		lpp_dto.setIs_confTo(app_entidad.getConfTo());
		lpp_dto.setIs_descripcion(app_entidad.getDescripcion());
		lpp_dto.setIs_estereotipoCreacion(app_entidad.getEstereotipoCreacion());
		lpp_dto.setIs_estereotipoModificacion(app_entidad.getEstereotipoModificacion());
		lpp_dto.setId_fechaCreacion(app_entidad.getFechaCreacion());
		lpp_dto.setId_fechaModificacion(app_entidad.getFechaModificacion());
		lpp_dto.setIs_idUsuarioCreacion(app_entidad.getIdUsuarioCreacion());
		lpp_dto.setIs_idUsuarioModificacion(app_entidad.getIdUsuarioModificacion());
		lpp_dto.setIs_ipCreacion(app_entidad.getIpCreacion());
		lpp_dto.setIs_ipModificacion(app_entidad.getIpModificacion());
		lpp_dto.setIs_maxIntentos(app_entidad.getMaxIntentos());
		lpp_dto.setIs_nombre(app_entidad.getNombre());

		return lpp_dto;
	}

	/**
	 * Método que convierte una una entidad a un dto usando todos los datos
	 * incluyendo relaciones.
	 *
	 * @param app_entidad entidad a convertir
	 * @return Resultado para entidad A dto completo retornado como
	 *         ParametrizacionPlantillaDTO
	 */
	public static ParametrizacionPlantillaDTO entidadADtoCompleto(ParametrizacionPlantilla app_entidad) {
		ParametrizacionPlantillaDTO lpp_dto;
		lpp_dto = entidadADtoSimple(app_entidad);
		return lpp_dto ;
	}

	/**
	 * Metodo que permite convertir lsita de entidad a dto.
	 *
	 * @param alpp_listEntidad lista de entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ParametrizacionPlantillaDTO
	 */
	public static List<ParametrizacionPlantillaDTO> listaEntidadADtoSimple(
			List<ParametrizacionPlantilla> alpp_listEntidad) {
		List<ParametrizacionPlantillaDTO> llpp_listDto = new ArrayList<>();
		for (ParametrizacionPlantilla lpp_entidad : alpp_listEntidad) {
			llpp_listDto.add(entidadADtoSimple(lpp_entidad));
		}
		return llpp_listDto;
	}

	/**
	 * Método que convierte una lista de entidad a una de dto usando todos los datos
	 * incluyendo relaciones.
	 *
	 * @param alpp_listEntidad lsita de entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ParametrizacionPlantillaDTO
	 */
	public static List<ParametrizacionPlantillaDTO> listaEntidadADtoCompleto(
			List<ParametrizacionPlantilla> alpp_listEntidad) {
		List<ParametrizacionPlantillaDTO> llpp_listDto = new ArrayList<>();
		for (ParametrizacionPlantilla lpp_entidad : alpp_listEntidad) {
			llpp_listDto.add(entidadADtoCompleto(lpp_entidad));
		}
		return llpp_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo qie convierte un dto a entidad.
	 *
	 * @param app_dto     a convertir
	 * @param app_entidad a convertir
	 * @return Resultado para dto A entidad simple retornado como
	 *         ParametrizacionPlantilla
	 */
	public static ParametrizacionPlantilla dtoAEntidadSimple(ParametrizacionPlantillaDTO app_dto,
			ParametrizacionPlantilla app_entidad) {
		if (null == app_entidad) {
			app_entidad = new ParametrizacionPlantilla();
		}
		app_entidad.setId(app_dto.getIs_id());
		app_entidad.setCodigo(app_dto.getIs_codigo());
		app_entidad.setConfCamposAsunto(app_dto.getIs_confCamposAsunto());
		app_entidad.setConfCamposContenido(app_dto.getIs_confCamposContenido());
		app_entidad.setConfFrom(app_dto.getIs_confFrom());
		app_entidad.setConfHtmlContenido(app_dto.getIs_confHtmlContenido());
		app_entidad.setConfPrioridad(app_dto.getIs_confPrioridad());
		app_entidad.setConfTextoAsunto(app_dto.getIs_confTextoAsunto());
		app_entidad.setConfTo(app_dto.getIs_confTo());
		app_entidad.setDescripcion(app_dto.getIs_descripcion());
		app_entidad.setEstereotipoCreacion(app_dto.getIs_estereotipoCreacion());
		app_entidad.setEstereotipoModificacion(app_dto.getIs_estereotipoModificacion());
		app_entidad.setFechaCreacion(app_dto.getId_fechaCreacion());
		app_entidad.setFechaModificacion(app_dto.getId_fechaModificacion());
		app_entidad.setIdUsuarioCreacion(app_dto.getIs_idUsuarioCreacion());
		app_entidad.setIdUsuarioModificacion(app_dto.getIs_idUsuarioModificacion());
		app_entidad.setIpCreacion(app_dto.getIs_idUsuarioCreacion());
		app_entidad.setIpModificacion(app_dto.getIs_ipModificacion());
		app_entidad.setMaxIntentos(app_dto.getIs_maxIntentos());
		app_entidad.setNombre(app_dto.getIs_nombre());

		return app_entidad;
	}

	/**
	 * Método que convierte de dto a entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param app_dto     el parametro dto
	 * @param app_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ParametrizacionPlantilla
	 */
	public static ParametrizacionPlantilla dtoAEntidadCompleto(ParametrizacionPlantillaDTO app_dto,
			ParametrizacionPlantilla app_entidad) {
		app_entidad = dtoAEntidadSimple(app_dto, app_entidad);

		return app_entidad;
	}

	/**
	 * Metodo que permite convertir lista de dto a entidad.
	 *
	 * @param alpp_listDto lista de dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ParametrizacionPlantilla
	 */
	public static List<ParametrizacionPlantilla> listadtoAEntidadSimple(
			List<ParametrizacionPlantillaDTO> alpp_listDto) {
		List<ParametrizacionPlantilla> llpp_listEntidad = new ArrayList<ParametrizacionPlantilla>();
		for (ParametrizacionPlantillaDTO lpp_dto : alpp_listDto) {
			llpp_listEntidad.add(dtoAEntidadSimple(lpp_dto, null));
		}
		return llpp_listEntidad;
	}

	/**
	 * Método que convierte lista de dto a una lista de entidades usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param alpp_listDto lista de dtos a convertir
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ParametrizacionPlantilla
	 */
	public static List<ParametrizacionPlantilla> listadtoAEntidadCompleto(
			List<ParametrizacionPlantillaDTO> alpp_listDto) {
		List<ParametrizacionPlantilla> llpp_listEntidad = new ArrayList<ParametrizacionPlantilla>();
		for (ParametrizacionPlantillaDTO lpp_dto : alpp_listDto) {
			llpp_listEntidad.add(dtoAEntidadCompleto(lpp_dto, null));
		}
		return llpp_listEntidad;
	}
	// --- fin to Entidad
}
