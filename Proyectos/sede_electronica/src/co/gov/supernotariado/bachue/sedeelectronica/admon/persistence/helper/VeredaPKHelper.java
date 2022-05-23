/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaPKHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: VeredaPKHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.VeredaPK;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Vereda PK.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VeredaPKHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase VeredaPKHelper.
	 */
	private VeredaPKHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param avpk_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como VeredaPKDTO
	 */
	public static VeredaPKDTO entidadADtoSimple(VeredaPK avpk_entidad) {
		VeredaPKDTO lvpf_dto = new VeredaPKDTO();
		lvpf_dto.setIs_idPais(avpk_entidad.getIdPais());
		lvpf_dto.setIs_idDepartamento(avpk_entidad.getIdDepartamento());
		lvpf_dto.setIs_idMunicipio(avpk_entidad.getIdMunicipio());
		lvpf_dto.setIs_idVereda(avpk_entidad.getIdVereda());

		return lvpf_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param avpk_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como VeredaPKDTO
	 */
	public static VeredaPKDTO entidadADtoCompleto(VeredaPK avpk_entidad) {
		VeredaPKDTO lvpk_dto;
		lvpk_dto = entidadADtoSimple(avpk_entidad);

		return lvpk_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alvpk_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         VeredaPKDTO
	 */
	public static List<VeredaPKDTO> listaentidadADtoSimple(List<VeredaPK> alvpk_listEntidad) {
		List<VeredaPKDTO> llvpk_listDto = new ArrayList<>();
		for (VeredaPK lvpk_entidad : alvpk_listEntidad) {
			llvpk_listDto.add(entidadADtoSimple(lvpk_entidad));
		}
		return llvpk_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alvpk_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de VeredaPKDTO
	 */
	public static List<VeredaPKDTO> listaentidadADtoCompleto(List<VeredaPK> alvpk_listEntidad) {
		List<VeredaPKDTO> llvpk_listDto = new ArrayList<>();
		for (VeredaPK lvpk_entidad : alvpk_listEntidad) {
			llvpk_listDto.add(entidadADtoCompleto(lvpk_entidad));
		}
		return llvpk_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param avpk_dto     el parametro dto
	 * @param avpk_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como VeredaPK
	 */
	public static VeredaPK dtoAEntidadSimple(VeredaPKDTO avpk_dto, VeredaPK avpk_entidad) {
		if (null == avpk_entidad) {
			avpk_entidad = new VeredaPK();
		}
		avpk_entidad.setIdPais(avpk_dto.getIs_idPais());
		avpk_entidad.setIdDepartamento(avpk_dto.getIs_idDepartamento());
		avpk_entidad.setIdMunicipio(avpk_dto.getIs_idMunicipio());
		avpk_entidad.setIdVereda(avpk_dto.getIs_idVereda());

		return avpk_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param avpk_dto     el parametro dto
	 * @param avpk_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como VeredaPK
	 */
	public static VeredaPK dtoAEntidadCompleto(VeredaPKDTO avpk_dto, VeredaPK avpk_entidad) {
		avpk_entidad = dtoAEntidadSimple(avpk_dto, avpk_entidad);

		return avpk_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alvpk_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         VeredaPK
	 */
	public static List<VeredaPK> listadtoAEntidadSimple(List<VeredaPKDTO> alvpk_listDto) {
		List<VeredaPK> llvpk_listEntidad = new ArrayList<>();
		for (VeredaPKDTO lvpk_dto : alvpk_listDto) {
			llvpk_listEntidad.add(dtoAEntidadSimple(lvpk_dto, null));
		}
		return llvpk_listEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alvpk_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de VeredaPK
	 */
	public static List<VeredaPK> listadtoAEntidadCompleto(List<VeredaPKDTO> alvpk_listDto) {
		List<VeredaPK> llvpk_listEntidad = new ArrayList<>();
		for (VeredaPKDTO dto : alvpk_listDto) {
			llvpk_listEntidad.add(dtoAEntidadCompleto(dto, null));
		}
		return llvpk_listEntidad;
	}
	// --- fin to Entidad
}
