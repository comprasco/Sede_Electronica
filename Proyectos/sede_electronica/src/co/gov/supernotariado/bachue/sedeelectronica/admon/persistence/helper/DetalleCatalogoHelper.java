/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCatalogoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: DetalleCatalogoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DetalleCatalogo;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Detalle
 * catalogo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DetalleCatalogoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase DetalleCatalogoHelper.
	 */
	private DetalleCatalogoHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param adc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como DetalleCatalogoDTO
	 */
	public static DetalleCatalogoDTO entidadADtoSimple(DetalleCatalogo adc_entidad) {

		DetalleCatalogoDTO ldc_dto = new DetalleCatalogoDTO();
		ldc_dto.setIs_idCatalogo(adc_entidad.getCatalogo().getId());
		ldc_dto.setIs_codigoDescripcion(adc_entidad.getCodigoDescripcion());
		ldc_dto.setIs_codigoServicio(adc_entidad.getCodigoServicio());
		ldc_dto.setIs_codigoSubServicio(adc_entidad.getCodigoSubServicio());
		ldc_dto.setIs_idCodigoServicio(adc_entidad.getIdCodigoServicio());
		ldc_dto.setIs_idCodigoSubServicio(adc_entidad.getIdCodigoSubServicio());
		ldc_dto.setId_fechaCreacion(adc_entidad.getFechaCreacion());
		ldc_dto.setId_fechaModificacion(adc_entidad.getFechaModificacion());
		ldc_dto.setIs_idUsuarioCreacion(adc_entidad.getIdUsuarioCreacion());
		ldc_dto.setIs_idUsuarioModificacion(adc_entidad.getIdUsuarioModificacion());
		ldc_dto.setIs_ipCreacion(adc_entidad.getIpCreacion());
		ldc_dto.setIs_ipModificacion(adc_entidad.getIpModificacion());
		ldc_dto.setIs_especial(adc_entidad.getEspecial());
		ldc_dto.setIs_estereotipoCreacion(adc_entidad.getEstereotipoCreacion());
		ldc_dto.setIs_estereotipoModificacion(adc_entidad.getEstereotipoModificacion());

		return ldc_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param adc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         DetalleCatalogoDTO
	 */
	public static DetalleCatalogoDTO entidadADtoCompleto(DetalleCatalogo adc_entidad) {
		DetalleCatalogoDTO ldc_dto = entidadADtoSimple(adc_entidad);
		if (adc_entidad.getCatalogo() != null)
			ldc_dto.setIc_catalogoDto(CatalogoHelper.entidadADtoSimple(adc_entidad.getCatalogo()));
		return ldc_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param aldc_detalleCatalogoListaEntidad el parametro detalle catalogo lista
	 *                                         entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         DetalleCatalogoDTO
	 */
	public static List<DetalleCatalogoDTO> listaEntidadADtoSimple(
			List<DetalleCatalogo> aldc_detalleCatalogoListaEntidad) {
		List<DetalleCatalogoDTO> lldc_detalleCatalogoDto = new ArrayList<>();
		for (DetalleCatalogo ldc_entidad : aldc_detalleCatalogoListaEntidad) {
			lldc_detalleCatalogoDto.add(entidadADtoSimple(ldc_entidad));
		}
		return lldc_detalleCatalogoDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param aldc_detalleCatalogoListaEntidad el parametro detalle catalogo lista
	 *                                         entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de DetalleCatalogoDTO
	 */
	public static List<DetalleCatalogoDTO> listaEntidadADtoCompleto(
			List<DetalleCatalogo> aldc_detalleCatalogoListaEntidad) {
		List<DetalleCatalogoDTO> lldc_detalleCatalogoDto = new ArrayList<>();
		for (DetalleCatalogo ldc_entidad : aldc_detalleCatalogoListaEntidad) {
			lldc_detalleCatalogoDto.add(entidadADtoCompleto(ldc_entidad));
		}
		return lldc_detalleCatalogoDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param adtd_dto    el parametro dto
	 * @param adc_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como DetalleCatalogo
	 */
	public static DetalleCatalogo dtoAEntidadSimple(DetalleCatalogoDTO adtd_dto, DetalleCatalogo adc_entidad) {
		if (null == adc_entidad) {
			adc_entidad = new DetalleCatalogo();
		}

		adc_entidad.setCodigoDescripcion(adtd_dto.getIs_codigoDescripcion());
		adc_entidad.setCodigoServicio(adtd_dto.getIs_codigoServicio());
		adc_entidad.setCodigoSubServicio(adtd_dto.getIs_codigoSubServicio());
		adc_entidad.setIdCodigoServicio(adtd_dto.getIs_idCodigoServicio());
		adc_entidad.setIdCodigoSubServicio(adtd_dto.getIs_idCodigoSubServicio());
		adc_entidad.setFechaCreacion(adtd_dto.getId_fechaCreacion());
		adc_entidad.setFechaModificacion(adtd_dto.getId_fechaModificacion());
		adc_entidad.setIdUsuarioCreacion(adtd_dto.getIs_idUsuarioCreacion());
		adc_entidad.setIdUsuarioModificacion(adtd_dto.getIs_idUsuarioModificacion());
		adc_entidad.setIpCreacion(adtd_dto.getIs_ipCreacion());
		adc_entidad.setIpModificacion(adtd_dto.getIs_ipModificacion());
		adc_entidad.setEspecial(adtd_dto.getIs_especial());
		adc_entidad.setEstereotipoCreacion(adtd_dto.getIs_estereotipoCreacion());
		adc_entidad.setEstereotipoModificacion(adtd_dto.getIs_estereotipoModificacion());
		return adc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param adtd_dto    el parametro dto
	 * @param adc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como DetalleCatalogo
	 */
	public static DetalleCatalogo dtoAEntidadCompleto(DetalleCatalogoDTO adtd_dto, DetalleCatalogo adc_entidad) {
		adc_entidad = dtoAEntidadSimple(adtd_dto, adc_entidad);
		if (adtd_dto.getIc_catalogoDto() != null) {
			adc_entidad.setCatalogo(new Catalogo());
			adc_entidad.getCatalogo().setId(adtd_dto.getIc_catalogoDto().getIs_id());
		}

		return adc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades *.
	 *
	 * @param aldc_detalleCatalogoDto el parametro detalle catalogo dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         DetalleCatalogo
	 */
	public static List<DetalleCatalogo> listaDtoAEntidadSimple(List<DetalleCatalogoDTO> aldc_detalleCatalogoDto) {
		List<DetalleCatalogo> lldc_detalleCatalogoDto = new ArrayList<>();
		for (DetalleCatalogoDTO ldc_detalleCatalogoDto : aldc_detalleCatalogoDto) {
			lldc_detalleCatalogoDto.add(dtoAEntidadSimple(ldc_detalleCatalogoDto, null));
		}
		return lldc_detalleCatalogoDto;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param aldc_detalleCatalogoDto el parametro detalle catalogo dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de DetalleCatalogo
	 */
	public static List<DetalleCatalogo> listaDtoAEntidadCompleto(List<DetalleCatalogoDTO> aldc_detalleCatalogoDto) {
		List<DetalleCatalogo> lldc_detalleCatalogoDto = new ArrayList<>();
		for (DetalleCatalogoDTO ldc_detalleCatalogoDto : aldc_detalleCatalogoDto) {
			lldc_detalleCatalogoDto.add(dtoAEntidadCompleto(ldc_detalleCatalogoDto, null));
		}
		return lldc_detalleCatalogoDto;
	}
	// --- fin to Entidad
}
