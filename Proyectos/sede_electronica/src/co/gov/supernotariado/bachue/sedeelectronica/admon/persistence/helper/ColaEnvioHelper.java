/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ColaEnvioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ColaEnvioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ColaEnvioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Cola envio.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ColaEnvioHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ColaEnvioHelper.
	 */
	// --- Constructor
	private ColaEnvioHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param ace_entidad entidad a convertir
	 * @return Resultado para entidad A dto simple retornado como ColaEnvioDTO
	 */
	public static ColaEnvioDTO entidadADtoSimple(ColaEnvio ace_entidad) {
		ColaEnvioDTO lce_dto = new ColaEnvioDTO();
		lce_dto.setIs_id(ace_entidad.getId());
		lce_dto.setIi_cantidadIntentos(Integer.parseInt(ace_entidad.getCantidadIntentos()));
		lce_dto.setIs_detalleEnvio(ace_entidad.getDetalleEnvio());
		lce_dto.setIs_estadoEnvio(ace_entidad.getEstadoEnvio());
		lce_dto.setIs_estereotipoCreacion(ace_entidad.getEstereotipoCreacion());
		lce_dto.setIs_estereotipoModificacion(ace_entidad.getEstereotipoModificacion());
		lce_dto.setId_fechaCreacion(ace_entidad.getFechaCreacion());
		lce_dto.setId_fechaModificacion(ace_entidad.getFechaModificacion());
		lce_dto.setIs_idUsuarioCreacion(ace_entidad.getIdUsuarioCreacion());
		lce_dto.setIs_idUsuarioModificacion(ace_entidad.getIdUsuarioModificacion());
		lce_dto.setIs_ipCreacion(ace_entidad.getIpCreacion());
		lce_dto.setIs_ipModificacion(ace_entidad.getIpModificacion());
		lce_dto.setIs_plantillaLlena(ace_entidad.getPlantillaLlena());
		lce_dto.setIs_prioridad(ace_entidad.getPrioridad());

		return lce_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ace_entidad entidad a convertir
	 * @return Resultado para entidad A dto completo retornado como ColaEnvioDTO
	 */
	public static ColaEnvioDTO entidadADtoCompleto(ColaEnvio ace_entidad) {
		ColaEnvioDTO lce_dto = entidadADtoSimple(ace_entidad);
		if (ace_entidad.getparametrizacionPlantilla() != null)
			lce_dto.setIpp_parametrizacionPlantilla(
					ParametrizacionPlantillaHelper.entidadADtoSimple(ace_entidad.getparametrizacionPlantilla()));

		return lce_dto;
	}

	/**
	 * Metodo que permite convertir una lista de entidadaes a dto.
	 *
	 * @param alce_listEntidad lista de entidades a convertir
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ColaEnvioDTO
	 */
	public static List<ColaEnvioDTO> listaEntidadADtoSimple(List<ColaEnvio> alce_listEntidad) {
		List<ColaEnvioDTO> llce_listDto = new ArrayList<>();
		for (ColaEnvio lce_entidad : alce_listEntidad) {
			llce_listDto.add(entidadADtoSimple(lce_entidad));
		}
		return llce_listDto;
	}

	/**
	 * Metodo que permite convertir una lista de entidades a una lista dts.
	 *
	 * @param alce_listEntidad el parametro list entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ColaEnvioDTO
	 */
	public static List<ColaEnvioDTO> listaEntidadADtoCompleto(List<ColaEnvio> alce_listEntidad) {
		List<ColaEnvioDTO> llce_listDto = new ArrayList<>();
		for (ColaEnvio lce_entidad : alce_listEntidad) {
			llce_listDto.add(entidadADtoCompleto(lce_entidad));
		}
		return llce_listDto;
	}

	/**
	 * Metodo que permite convertir dto a entidades.
	 *
	 * @param ace_dto     dto a convertir
	 * @param ace_entidad entidad resultado
	 * @return Resultado para dto A entidad simple retornado como ColaEnvio
	 */
	public static ColaEnvio dtoAEntidadSimple(ColaEnvioDTO ace_dto, ColaEnvio ace_entidad) {
		if (null == ace_entidad) {
			ace_entidad = new ColaEnvio();
		}
		ace_entidad.setId(ace_dto.getIs_id());
		ace_entidad.setCantidadIntentos(ace_dto.getIi_cantidadIntentos().toString());
		ace_entidad.setDetalleEnvio(ace_dto.getIs_detalleEnvio());
		ace_entidad.setEstadoEnvio(ace_dto.getIs_estadoEnvio());
		ace_entidad.setEstereotipoCreacion(ace_dto.getIs_estereotipoCreacion());
		ace_entidad.setEstereotipoModificacion(ace_dto.getIs_estereotipoModificacion());
		ace_entidad.setFechaCreacion(ace_dto.getId_fechaCreacion());
		ace_entidad.setFechaModificacion(ace_dto.getId_fechaModificacion());
		ace_entidad.setIdUsuarioCreacion(ace_dto.getIs_idUsuarioCreacion());
		ace_entidad.setIdUsuarioModificacion(ace_dto.getIs_idUsuarioModificacion());
		ace_entidad.setIpCreacion(ace_dto.getIs_ipCreacion());
		ace_entidad.setIpModificacion(ace_dto.getIs_ipModificacion());
		ace_entidad.setPlantillaLlena(ace_dto.getIs_plantillaLlena());
		ace_entidad.setPrioridad(ace_dto.getIs_prioridad());

		return ace_entidad;
	}

	/**
	 * Metodo que permite convertir un dto a una entidad.
	 *
	 * @param ace_dto     dto a convertir
	 * @param ace_entidad entidad a convertir
	 * @return Resultado para dto A entidad completo retornado como ColaEnvio
	 */
	public static ColaEnvio dtoAEntidadCompleto(ColaEnvioDTO ace_dto, ColaEnvio ace_entidad) {
		ace_entidad = dtoAEntidadSimple(ace_dto, ace_entidad);
		if (ace_dto.getIpp_parametrizacionPlantilla() != null) {
			ace_entidad.setparametrizacionPlantilla(new ParametrizacionPlantilla());
			ace_entidad.getparametrizacionPlantilla().setId(ace_dto.getIpp_parametrizacionPlantilla().getIs_id());
		}

		return ace_entidad;
	}

	/**
	 * Metodo que permite convertir lista de dtos a entidades .
	 *
	 * @param alce_listDto lista de dtos
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ColaEnvio
	 */
	public static List<ColaEnvio> listadtoAEntidadSimple(List<ColaEnvioDTO> alce_listDto) {
		List<ColaEnvio> llce_listEntidad = new ArrayList<>();
		for (ColaEnvioDTO lce_dto : alce_listDto) {
			llce_listEntidad.add(dtoAEntidadSimple(lce_dto, null));
		}
		return llce_listEntidad;
	}

	/**
	 * Metodo que permite convetir dtos a entidades.
	 *
	 * @param alce_listDto lista de dtos
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ColaEnvio
	 */
	public static List<ColaEnvio> listadtoAEntidadCompleto(List<ColaEnvioDTO> alce_listDto) {
		List<ColaEnvio> llce_listEntidad = new ArrayList<>();
		for (ColaEnvioDTO lce_dto : alce_listDto) {
			llce_listEntidad.add(dtoAEntidadCompleto(lce_dto, null));
		}
		return llce_listEntidad;
	}
	// --- fin to Entidad
}
