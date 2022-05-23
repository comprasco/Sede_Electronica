/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ArchivoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoBDDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Archivo;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Archivo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ArchivoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ArchivoHelper.
	 */
	private ArchivoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Método que convierte de entidad a DTO sin archivo .
	 *
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para entidad A dto sin archivo retornado como ArchivoBDDTO
	 */
	public static ArchivoBDDTO entidadADtoSinArchivo(Archivo aa_entidad) {
		ArchivoBDDTO lad_dto = new ArchivoBDDTO();
		lad_dto.setIs_id(aa_entidad.getId());
		lad_dto.setId_fechaCreacion(aa_entidad.getFechaCreacion());
		lad_dto.setId_fechaModificacion(aa_entidad.getFechaModificacion());
		lad_dto.setIs_idUsuarioCreacion(aa_entidad.getIdUsuarioCreacion());
		lad_dto.setIs_idUsuarioModificacion(aa_entidad.getIdUsuarioModificacion());
		lad_dto.setIs_estereotipoCreacion(aa_entidad.getEstereotipoCreacion());
		lad_dto.setIs_estereotipoModificacion(aa_entidad.getEstereotipoModificacion());
		lad_dto.setIs_ipCreacion(aa_entidad.getIpCreacion());
		lad_dto.setIs_ipModificacion(aa_entidad.getIpModificacion());
		lad_dto.setIs_activo(aa_entidad.getActivo());

		lad_dto.setIs_descripcion(aa_entidad.getDescripcion());
		lad_dto.setIs_nombre(aa_entidad.getNombre());
		lad_dto.setIs_codigo(aa_entidad.getCodigo());
		lad_dto.setIs_extension(aa_entidad.getExtension());
		return lad_dto;
	}

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para entidad A dto con archivo retornado como ArchivoBDDTO
	 */
	public static ArchivoBDDTO entidadADtoConArchivo(Archivo aa_entidad) {
		ArchivoBDDTO lad_dto;
		lad_dto = entidadADtoSinArchivo(aa_entidad);
		lad_dto.setIs_contenido(aa_entidad.getContenido());
		return lad_dto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO sin
	 * archivo.
	 *
	 * @param ala_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto sin archivo retornado como una
	 *         lista de ArchivoBDDTO
	 */
	public static List<ArchivoBDDTO> listaEntidadADtoSinArchivo(List<Archivo> ala_listaEntidades) {
		List<ArchivoBDDTO> llad_listaDto = new ArrayList<>();
		for (Archivo la_entidad : ala_listaEntidades) {
			llad_listaDto.add(entidadADtoSinArchivo(la_entidad));
		}
		return llad_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO usando
	 * todos los datos.
	 *
	 * @param ala_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto con archivo retornado como una
	 *         lista de ArchivoBDDTO
	 */
	public static List<ArchivoBDDTO> listaEntidadADtoConArchivo(List<Archivo> ala_listaEntidades) {
		List<ArchivoBDDTO> llad_listaDto = new ArrayList<>();
		for (Archivo la_entidad : ala_listaEntidades) {
			llad_listaDto.add(entidadADtoConArchivo(la_entidad));
		}
		return llad_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Método que convierte un DTO a una entidad.
	 *
	 * @param aa_dto     el parametro dto
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Archivo
	 */
	public static Archivo dtoAEntidadSimple(ArchivoBDDTO aa_dto, Archivo aa_entidad) {
		if (null == aa_entidad) {
			aa_entidad = new Archivo();
		}
		aa_entidad.setId(aa_dto.getIs_id());
		aa_entidad.setFechaCreacion(aa_dto.getId_fechaCreacion());
		aa_entidad.setFechaModificacion(aa_dto.getId_fechaModificacion());
		aa_entidad.setIdUsuarioCreacion(aa_dto.getIs_idUsuarioCreacion());
		aa_entidad.setIdUsuarioModificacion(aa_dto.getIs_idUsuarioModificacion());
		aa_entidad.setEstereotipoCreacion(aa_dto.getIs_estereotipoCreacion());
		aa_entidad.setEstereotipoModificacion(aa_dto.getIs_estereotipoModificacion());
		aa_entidad.setIpCreacion(aa_dto.getIs_ipCreacion());
		aa_entidad.setIpModificacion(aa_dto.getIs_ipModificacion());
		aa_entidad.setActivo(aa_dto.getIs_activo());

		aa_entidad.setDescripcion(aa_dto.getIs_descripcion());
		aa_entidad.setCodigo(aa_dto.getIs_codigo());
		aa_entidad.setContenido(aa_dto.getIs_contenido());
		aa_entidad.setExtension(aa_dto.getIs_extension());
		aa_entidad.setNombre(aa_dto.getIs_nombre());

		return aa_entidad;
	}

	/**
	 * Método que convierte un DTO a una entidad incluyendo relaciones.
	 *
	 * @param aa_dto     el parametro dto
	 * @param aa_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Archivo
	 */
	public static Archivo dtoAEntidadCompleto(ArchivoBDDTO aa_dto, Archivo aa_entidad) {
		aa_entidad = dtoAEntidadSimple(aa_dto, aa_entidad);

		return aa_entidad;
	}

	/**
	 * Método que convierte una lista DTO a una lista de entidades.
	 *
	 * @param ala_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Archivo
	 */
	public static List<Archivo> listaDtoAEntidadSimple(List<ArchivoBDDTO> ala_listaDto) {
		List<Archivo> lla_listaEntidades = new ArrayList<>();
		for (ArchivoBDDTO lad_dto : ala_listaDto) {
			lla_listaEntidades.add(dtoAEntidadSimple(lad_dto, null));
		}
		return lla_listaEntidades;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param ala_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Archivo
	 */
	public static List<Archivo> listaDtoAEntidadCompleto(List<ArchivoBDDTO> ala_listaDto) {
		List<Archivo> lla_listaEntidades = new ArrayList<>();
		for (ArchivoBDDTO lad_dto : ala_listaDto) {
			lla_listaEntidades.add(dtoAEntidadCompleto(lad_dto, null));
		}
		return lla_listaEntidades;
	}
	// --- fin to Entidad
}
