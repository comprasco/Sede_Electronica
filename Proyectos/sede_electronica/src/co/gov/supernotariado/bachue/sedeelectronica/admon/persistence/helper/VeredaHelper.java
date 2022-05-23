/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: VeredaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Vereda;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.VeredaPK;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Vereda. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VeredaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase VeredaHelper.
	 */
	private VeredaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param av_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como VeredaDTO
	 */
	public static VeredaDTO entidadADtoSimple(Vereda av_entidad) {
		VeredaDTO lv_dto = new VeredaDTO();
		lv_dto.setIs_activo(av_entidad.getActivo());
		lv_dto.setIs_cabeceraMunicipal(av_entidad.getCabeceraMunicipal());
		lv_dto.setId_fechaCreacion(av_entidad.getFechaCreacion());
		lv_dto.setId_fechaModificacion(av_entidad.getFechaModificacion());
		lv_dto.setIs_idUsuarioCreacion(av_entidad.getIdUsuarioCreacion());
		lv_dto.setIs_idUsuarioModificacion(av_entidad.getIdUsuarioModificacion());
		lv_dto.setIs_ipCreacion(av_entidad.getIpCreacion());
		lv_dto.setIs_ipModificacion(av_entidad.getIpModificacion());
		lv_dto.setIs_nombre(av_entidad.getNombre());
		lv_dto.setIs_estereotipoCreacion(av_entidad.getEstereotipoCreacion());
		lv_dto.setIs_estereotipoModificacion(av_entidad.getEstereotipoModificacion());
		return lv_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param av_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como VeredaDTO
	 */
	public static VeredaDTO entidadADtoCompleto(Vereda av_entidad) {
		VeredaDTO lv_dto = entidadADtoSimple(av_entidad);
		if (av_entidad.getId() != null)
			lv_dto.setIvpk_idDto(VeredaPKHelper.entidadADtoSimple(av_entidad.getId()));

		return lv_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alv_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         VeredaDTO
	 */
	public static List<VeredaDTO> listaentidadADtoSimple(List<Vereda> alv_listEntidad) {
		List<VeredaDTO> llv_listDto = new ArrayList<>();
		for (Vereda lv_entidad : alv_listEntidad) {
			llv_listDto.add(entidadADtoSimple(lv_entidad));
		}
		return llv_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alv_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de VeredaDTO
	 */
	public static List<VeredaDTO> listaentidadADtoCompleto(List<Vereda> alv_listEntidad) {
		List<VeredaDTO> llv_listDto = new ArrayList<>();
		for (Vereda lv_entidad : alv_listEntidad) {
			llv_listDto.add(entidadADtoCompleto(lv_entidad));
		}
		return llv_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param av_dto     el parametro dto
	 * @param av_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Vereda
	 */
	public static Vereda dtoAEntidadSimple(VeredaDTO av_dto, Vereda av_entidad) {
		if (null == av_entidad) {
			av_entidad = new Vereda();
		}
		av_entidad.setActivo(av_dto.getIs_activo());
		av_entidad.setCabeceraMunicipal(av_dto.getIs_cabeceraMunicipal());
		av_entidad.setFechaCreacion(av_dto.getId_fechaCreacion());
		av_entidad.setFechaModificacion(av_dto.getId_fechaModificacion());
		av_entidad.setIdUsuarioCreacion(av_dto.getIs_idUsuarioCreacion());
		av_entidad.setIdUsuarioModificacion(av_dto.getIs_idUsuarioModificacion());
		av_entidad.setIpCreacion(av_dto.getIs_ipCreacion());
		av_entidad.setIpModificacion(av_dto.getIs_ipModificacion());
		av_entidad.setNombre(av_dto.getIs_nombre());
		av_entidad.setEstereotipoCreacion(av_dto.getIs_estereotipoCreacion());
		av_entidad.setEstereotipoModificacion(av_dto.getIs_estereotipoModificacion());
		return av_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad utilizando todos los datos
	 * incluyendo relaciones.
	 *
	 * @param av_dto     el parametro dto
	 * @param av_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Vereda
	 */
	public static Vereda dtoAEntidadCompleto(VeredaDTO av_dto, Vereda av_entidad) {
		av_entidad = dtoAEntidadSimple(av_dto, av_entidad);
		if (av_dto.getIvpk_idDto() != null) {
			VeredaPK lvpk_veredaPk = new VeredaPK();
			lvpk_veredaPk.setIdVereda(av_dto.getIvpk_idDto().getIs_idVereda());
			lvpk_veredaPk.setIdMunicipio(av_dto.getIvpk_idDto().getIs_idMunicipio());
			lvpk_veredaPk.setIdDepartamento(av_dto.getIvpk_idDto().getIs_idDepartamento());
			lvpk_veredaPk.setIdPais(av_dto.getIvpk_idDto().getIs_idPais());
			av_entidad.setId(lvpk_veredaPk);
		}

		return av_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alv_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         Vereda
	 */
	public static List<Vereda> listadtoAEntidadSimple(List<VeredaDTO> alv_listDto) {
		List<Vereda> llv_listEntidad = new ArrayList<>();
		for (VeredaDTO lv_dto : alv_listDto) {
			llv_listEntidad.add(dtoAEntidadSimple(lv_dto, null));
		}
		return llv_listEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alv_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de Vereda
	 */
	public static List<Vereda> listadtoAEntidadCompleto(List<VeredaDTO> alv_listDto) {
		List<Vereda> llv_listEntidad = new ArrayList<>();
		for (VeredaDTO lv_dto : alv_listDto) {
			llv_listEntidad.add(dtoAEntidadCompleto(lv_dto, null));
		}
		return llv_listEntidad;
	}
	// --- fin to Entidad
}
