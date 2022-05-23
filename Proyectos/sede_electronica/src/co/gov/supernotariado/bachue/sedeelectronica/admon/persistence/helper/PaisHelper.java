/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PaisHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PaisHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Pais. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PaisHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase PaisHelper.
	 */
	private PaisHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como PaisDTO
	 */
	public static PaisDTO entidadADtoSimple(Pais ap_entidad) {
		PaisDTO lpd_dto = new PaisDTO();
		lpd_dto.setIs_idPais(ap_entidad.getIdPais());
		lpd_dto.setIs_activo(ap_entidad.getActivo());
		lpd_dto.setId_fechaCreacion(ap_entidad.getFechaCreacion());
		lpd_dto.setId_fechaModificacion(ap_entidad.getFechaModificacion());
		lpd_dto.setIs_idUsuarioCreacion(ap_entidad.getIdUsuarioCreacion());
		lpd_dto.setIs_idUsuarioModificacion(ap_entidad.getIdUsuarioModificacion());
		lpd_dto.setIs_ipCreacion(ap_entidad.getIpCreacion());
		lpd_dto.setIs_ipModificacion(ap_entidad.getIpModificacion());
		lpd_dto.setIs_nacionalidad(ap_entidad.getNacionalidad());
		lpd_dto.setIs_nombre(ap_entidad.getNombre());
		lpd_dto.setIs_estereotipoCreacion(ap_entidad.getEstereotipoCreacion());
		lpd_dto.setIs_estereotipoModificacion(ap_entidad.getEstereotipoModificacion());
		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como PaisDTO
	 */
	public static PaisDTO entidadADtoCompleto(Pais ap_entidad) {
		PaisDTO lpd_dto;
		lpd_dto = entidadADtoSimple(ap_entidad);

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         PaisDTO
	 */
	public static List<PaisDTO> listaEntidadADtoSimple(List<Pais> alp_listaEntidades) {
		List<PaisDTO> llpd_listaDto = new ArrayList<>();
		for (Pais lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoSimple(lp_entidad));
		}
		return llpd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de PaisDTO
	 */
	public static List<PaisDTO> listaEntidadADtoCompleto(List<Pais> alp_listaEntidades) {
		List<PaisDTO> llpd_listaDto = new ArrayList<>();
		for (Pais lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoCompleto(lp_entidad));
		}
		return llpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Pais
	 */
	public static Pais dtoAEntidadSimple(PaisDTO apd_dto, Pais ap_entidad) {
		if (null == ap_entidad) {
			ap_entidad = new Pais();
		}
		ap_entidad.setIdPais(apd_dto.getIs_idPais());
		ap_entidad.setActivo(apd_dto.getIs_activo());
		ap_entidad.setFechaCreacion(apd_dto.getId_fechaCreacion());
		ap_entidad.setFechaModificacion(apd_dto.getId_fechaModificacion());
		ap_entidad.setIdUsuarioCreacion(apd_dto.getIs_idUsuarioCreacion());
		ap_entidad.setIdUsuarioModificacion(apd_dto.getIs_idUsuarioModificacion());
		ap_entidad.setIpCreacion(apd_dto.getIs_ipCreacion());
		ap_entidad.setIpModificacion(apd_dto.getIs_ipModificacion());
		ap_entidad.setNacionalidad(apd_dto.getIs_nacionalidad());
		ap_entidad.setNombre(apd_dto.getIs_nombre());
		ap_entidad.setEstereotipoCreacion(apd_dto.getIs_estereotipoCreacion());
		ap_entidad.setEstereotipoModificacion(apd_dto.getIs_estereotipoModificacion());
		return ap_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Pais
	 */
	public static Pais dtoAEntidadCompleto(PaisDTO apd_dto, Pais ap_entidad) {
		ap_entidad = dtoAEntidadSimple(apd_dto, ap_entidad);

		return ap_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Pais
	 */
	public static List<Pais> listaDtoAEntidadSimple(List<PaisDTO> alpd_listaDto) {
		List<Pais> llp_listaEntidades = new ArrayList<>();
		for (PaisDTO apd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadSimple(apd_dto, null));
		}
		return llp_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Pais
	 */
	public static List<Pais> listaDtoAEntidadCompleto(List<PaisDTO> alpd_listaDto) {
		List<Pais> llp_listaEntidades = new ArrayList<>();
		for (PaisDTO lpd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadCompleto(lpd_dto, null));
		}
		return llp_listaEntidades;
	}
	// --- fin to Entidad
}
