/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioPKHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: MunicipioPKHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Municipio PK.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MunicipioPKHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase MunicipioPKHelper.
	 */
	private MunicipioPKHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param amp_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como MunicipioPKDTO
	 */
	public static MunicipioPKDTO entidadADtoSimple(MunicipioPK amp_entidad) {
		MunicipioPKDTO lmpd_dto = new MunicipioPKDTO();
		lmpd_dto.setIs_idMunicipio(amp_entidad.getIdMunicipio());
		lmpd_dto.setIs_idDepartamento(amp_entidad.getIdDepartamento());
		lmpd_dto.setIs_idPais(amp_entidad.getIdPais());

		return lmpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param amp_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como MunicipioPKDTO
	 */
	public static MunicipioPKDTO entidadADtoCompleto(MunicipioPK amp_entidad) {
		MunicipioPKDTO lmpd_dto;
		lmpd_dto = entidadADtoSimple(amp_entidad);

		return lmpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param almp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         MunicipioPKDTO
	 */
	public static List<MunicipioPKDTO> listaEntidadADtoSimple(List<MunicipioPK> almp_listaEntidades) {
		List<MunicipioPKDTO> llmpd_listaDto = new ArrayList<>();
		for (MunicipioPK lmp_entidad : almp_listaEntidades) {
			llmpd_listaDto.add(entidadADtoSimple(lmp_entidad));
		}
		return llmpd_listaDto;
	}

	/**
	 * Método que convierte un DTO usando todos los datos a una entidad incluyendo
	 * relaciones.
	 *
	 * @param almp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de MunicipioPKDTO
	 */
	public static List<MunicipioPKDTO> listaEntidadADtoCompleto(List<MunicipioPK> almp_listaEntidades) {
		List<MunicipioPKDTO> llmpd_listaDto = new ArrayList<>();
		for (MunicipioPK lmp_entidad : almp_listaEntidades) {
			llmpd_listaDto.add(entidadADtoCompleto(lmp_entidad));
		}
		return llmpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ampd_dto    el parametro dto
	 * @param amp_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como MunicipioPK
	 */
	public static MunicipioPK dtoAEntidadSimple(MunicipioPKDTO ampd_dto, MunicipioPK amp_entidad) {
		if (null == amp_entidad) {
			amp_entidad = new MunicipioPK();
		}
		amp_entidad.setIdMunicipio(ampd_dto.getIs_idMunicipio());
		amp_entidad.setIdDepartamento(ampd_dto.getIs_idDepartamento());
		amp_entidad.setIdPais(ampd_dto.getIs_idPais());

		return amp_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ampd_dto    el parametro dto
	 * @param amp_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como MunicipioPK
	 */
	public static MunicipioPK dtoAEntidadCompleto(MunicipioPKDTO ampd_dto, MunicipioPK amp_entidad) {
		amp_entidad = dtoAEntidadSimple(ampd_dto, amp_entidad);

		return amp_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param almpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         MunicipioPK
	 */
	public static List<MunicipioPK> listaDtoAEntidadSimple(List<MunicipioPKDTO> almpd_listaDto) {
		List<MunicipioPK> llmp_listaEntidades = new ArrayList<>();
		for (MunicipioPKDTO lmpd_dto : almpd_listaDto) {
			llmp_listaEntidades.add(dtoAEntidadSimple(lmpd_dto, null));
		}
		return llmp_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param almpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de MunicipioPK
	 */
	public static List<MunicipioPK> listaDtoAEntidadCompleto(List<MunicipioPKDTO> almpd_listaDto) {
		List<MunicipioPK> llmp_listaEntidades = new ArrayList<>();
		for (MunicipioPKDTO lmpd_dto : almpd_listaDto) {
			llmp_listaEntidades.add(dtoAEntidadCompleto(lmpd_dto, null));
		}
		return llmp_listaEntidades;
	}
	// --- fin to Entidad
}
