/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialEnvioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: HistorialEnvioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialEnvioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialEnvio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Historial
 * envio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialEnvioHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase HistorialEnvioHelper.
	 */
	// --- Constructor
	private HistorialEnvioHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param ahe_entidad entidad a convertir
	 * @return Resultado para entidad A dto simple retornado como HistorialEnvioDTO
	 */
	public static HistorialEnvioDTO entidadADtoSimple(HistorialEnvio ahe_entidad) {

		HistorialEnvioDTO lhe_dto = new HistorialEnvioDTO();

		lhe_dto.setIs_id(ahe_entidad.getId());
		lhe_dto.setIs_estereotipoCreacion(ahe_entidad.getEstereotipoCreacion());
		lhe_dto.setIs_estereotipoModificacion(ahe_entidad.getEstereotipoModificacion());
		lhe_dto.setId_fechaCreacion(ahe_entidad.getFechaCreacion());
		lhe_dto.setId_fechaModificacion(ahe_entidad.getFechaModificacion());
		lhe_dto.setIs_idUsuarioCreacion(ahe_entidad.getIdUsuarioCreacion());
		lhe_dto.setIs_idUsuarioModificacion(ahe_entidad.getIdUsuarioModificacion());
		lhe_dto.setIs_ipCreacion(ahe_entidad.getIpCreacion());
		lhe_dto.setIs_ipModificacion(ahe_entidad.getIpModificacion());
		lhe_dto.setIs_plantillaLlenaEnvio(ahe_entidad.getPlantillaLlenaEnvio());
		lhe_dto.setIs_ultimoDetalle(ahe_entidad.getUltimoDetalle());
		lhe_dto.setIs_ultimoEstado(ahe_entidad.getUltimoEstado());
		lhe_dto.setIs_ultimoIntentoEnvio(ahe_entidad.getUltimoIntentoEnvio());

		return lhe_dto;
	}

	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param ahe_entidad entidad a convertir
	 * @return Resultado para entidad A dto completo retornado como
	 *         HistorialEnvioDTO
	 */
	public static HistorialEnvioDTO entidadADtoCompleto(HistorialEnvio ahe_entidad) {
		HistorialEnvioDTO lhe_dto = entidadADtoSimple(ahe_entidad);
		if (ahe_entidad.getParametrizacionPlantilla() != null)
			lhe_dto.setIppd_parametrizacionPlantilla(
					ParametrizacionPlantillaHelper.entidadADtoSimple(ahe_entidad.getParametrizacionPlantilla()));

		return lhe_dto;
	}

	/**
	 * Metodo que convierte lista de entidades a lista de dtos.
	 *
	 * @param alhe_listEntidad el parametro list entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         HistorialEnvioDTO
	 */
	public static List<HistorialEnvioDTO> listaEntidadADtoSimple(List<HistorialEnvio> alhe_listEntidad) {
		List<HistorialEnvioDTO> llhe_listDto = new ArrayList<>();
		for (HistorialEnvio lhe_entidad : alhe_listEntidad) {
			llhe_listDto.add(entidadADtoSimple(lhe_entidad));
		}
		return llhe_listDto;
	}

	/**
	 * Metodo que lista entidades a lista de dtos.
	 *
	 * @param alhe_listEntidad el parametro list entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de HistorialEnvioDTO
	 */
	public static List<HistorialEnvioDTO> listaEntidadADtoCompleto(List<HistorialEnvio> alhe_listEntidad) {
		List<HistorialEnvioDTO> llhe_listDto = new ArrayList<>();
		for (HistorialEnvio lhe_entidad : alhe_listEntidad) {
			llhe_listDto.add(entidadADtoCompleto(lhe_entidad));
		}
		return llhe_listDto;
	}

	/**
	 * Metodo que convierte de dto a entidad.
	 *
	 * @param ahe_dto     dto a convertir
	 * @param ahe_entidad entidad a convertir
	 * @return Resultado para dto A entidad simple retornado como HistorialEnvio
	 */
	public static HistorialEnvio dtoAEntidadSimple(HistorialEnvioDTO ahe_dto, HistorialEnvio ahe_entidad) {
		if (null == ahe_entidad) {
			ahe_entidad = new HistorialEnvio();
		}
		ahe_entidad.setId(ahe_dto.getIs_id());
		ahe_entidad.setEstereotipoCreacion(ahe_dto.getIs_estereotipoCreacion());
		ahe_entidad.setEstereotipoModificacion(ahe_dto.getIs_estereotipoModificacion());
		ahe_entidad.setFechaCreacion(ahe_dto.getId_fechaCreacion());
		ahe_entidad.setFechaModificacion(ahe_dto.getId_fechaModificacion());
		ahe_entidad.setIdUsuarioCreacion(ahe_dto.getIs_idUsuarioCreacion());
		ahe_entidad.setIdUsuarioModificacion(ahe_dto.getIs_idUsuarioModificacion());
		ahe_entidad.setIpCreacion(ahe_dto.getIs_ipCreacion());
		ahe_entidad.setIpModificacion(ahe_dto.getIs_ipModificacion());
		ahe_entidad.setPlantillaLlenaEnvio(ahe_dto.getIs_plantillaLlenaEnvio());
		ahe_entidad.setUltimoDetalle(ahe_dto.getIs_ultimoDetalle());
		ahe_entidad.setUltimoEstado(ahe_dto.getIs_ultimoEstado());
		ahe_entidad.setUltimoIntentoEnvio(ahe_dto.getIs_ultimoIntentoEnvio());

		return ahe_entidad;
	}

	/**
	 * Metodo que convierte de dto a entidad.
	 *
	 * @param ahe_dto     dto a convertir
	 * @param ahe_entidad entidad convertida
	 * @return Resultado para dto A entidad completo retornado como HistorialEnvio
	 */
	public static HistorialEnvio dtoAEntidadCompleto(HistorialEnvioDTO ahe_dto, HistorialEnvio ahe_entidad) {
		ahe_entidad = dtoAEntidadSimple(ahe_dto, ahe_entidad);
		if (ahe_dto.getIppd_parametrizacionPlantilla() != null) {
			ahe_entidad.setParametrizacionPlantilla(new ParametrizacionPlantilla());
			ahe_entidad.getParametrizacionPlantilla().setId(ahe_dto.getIppd_parametrizacionPlantilla().getIs_id());
		}

		return ahe_entidad;
	}

	/**
	 * Metodo que convierte de lista de dto a una lista de entidades.
	 *
	 * @param alhe_listDto lista de dtos
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         HistorialEnvio
	 */
	public static List<HistorialEnvio> listadtoAEntidadSimple(List<HistorialEnvioDTO> alhe_listDto) {
		List<HistorialEnvio> llhe_listEntidad = new ArrayList<>();
		for (HistorialEnvioDTO lhe_dto : alhe_listDto) {
			llhe_listEntidad.add(dtoAEntidadSimple(lhe_dto, null));
		}
		return llhe_listEntidad;
	}

	/**
	 * Metodo que convierte una lista de dtos a una de entidades.
	 *
	 * @param alhe_listDto lista de dtos generada
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de HistorialEnvio
	 */
	public static List<HistorialEnvio> listadtoAEntidadCompleto(List<HistorialEnvioDTO> alhe_listDto) {
		List<HistorialEnvio> llhe_listEntidad = new ArrayList<>();
		for (HistorialEnvioDTO lhe_dto : alhe_listDto) {
			llhe_listEntidad.add(dtoAEntidadCompleto(lhe_dto, null));
		}
		return llhe_listEntidad;
	}

}
