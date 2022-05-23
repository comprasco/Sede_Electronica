/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoPKHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: DepartamentoPKHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Departamento
 * PK. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DepartamentoPKHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase DepartamentoPKHelper.
	 */
	private DepartamentoPKHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param adp_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como DepartamentoPKDTO
	 */
	public static DepartamentoPKDTO entidadADtoSimple(DepartamentoPK adp_entidad) {
		DepartamentoPKDTO ldp_dto = new DepartamentoPKDTO();
		ldp_dto.setIs_idDepartamento(adp_entidad.getIdDepartamento());
		ldp_dto.setIs_idPais(adp_entidad.getIdPais());

		return ldp_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param adp_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         DepartamentoPKDTO
	 */
	public static DepartamentoPKDTO entidadADtoCompleto(DepartamentoPK adp_entidad) {

		DepartamentoPKDTO ldp_dto;
		ldp_dto = entidadADtoSimple(adp_entidad);

		return ldp_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param aldp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         DepartamentoPKDTO
	 */
	public static List<DepartamentoPKDTO> listaEntidadADtoSimple(List<DepartamentoPK> aldp_listaEntidades) {
		List<DepartamentoPKDTO> lldp_listaDto = new ArrayList<>();
		for (DepartamentoPK ldp_entidad : aldp_listaEntidades) {
			lldp_listaDto.add(entidadADtoSimple(ldp_entidad));
		}
		return lldp_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param aldp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de DepartamentoPKDTO
	 */
	public static List<DepartamentoPKDTO> listaEntidadADtoCompleto(List<DepartamentoPK> aldp_listaEntidades) {
		List<DepartamentoPKDTO> lldp_listaDto = new ArrayList<>();
		for (DepartamentoPK ldp_entidad : aldp_listaEntidades) {
			lldp_listaDto.add(entidadADtoCompleto(ldp_entidad));
		}
		return lldp_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param adp_dto     el parametro dto
	 * @param adp_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como DepartamentoPK
	 */
	public static DepartamentoPK dtoAEntidadSimple(DepartamentoPKDTO adp_dto, DepartamentoPK adp_entidad) {
		if (null == adp_entidad) {
			adp_entidad = new DepartamentoPK();
		}
		adp_entidad.setIdDepartamento(adp_dto.getIs_idDepartamento());
		adp_entidad.setIdPais(adp_dto.getIs_idPais());

		return adp_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param adp_dto     el parametro dto
	 * @param adp_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como DepartamentoPK
	 */
	public static DepartamentoPK dtoAEntidadCompleto(DepartamentoPKDTO adp_dto, DepartamentoPK adp_entidad) {
		adp_entidad = dtoAEntidadSimple(adp_dto, adp_entidad);

		return adp_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param aldp_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         DepartamentoPK
	 */
	public static List<DepartamentoPK> listaDtoAEntidadSimple(List<DepartamentoPKDTO> aldp_listaDto) {
		List<DepartamentoPK> lldpk_listaEntidades = new ArrayList<>();
		for (DepartamentoPKDTO ldp_dto : aldp_listaDto) {
			lldpk_listaEntidades.add(dtoAEntidadSimple(ldp_dto, null));
		}
		return lldpk_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param aldp_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de DepartamentoPK
	 */
	public static List<DepartamentoPK> listaDtoAEntidadCompleto(List<DepartamentoPKDTO> aldp_listaDto) {
		List<DepartamentoPK> lldpk_listaEntidades = new ArrayList<>();
		for (DepartamentoPKDTO ldp_dto : aldp_listaDto) {
			lldpk_listaEntidades.add(dtoAEntidadCompleto(ldp_dto, null));
		}
		return lldpk_listaEntidades;
	}
	// --- fin to Entidad
}
