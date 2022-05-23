/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudRecuperacionClaveHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: SolicitudRecuperacionClaveHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Solicitud
 * recuperacion clave. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudRecuperacionClaveHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * SolicitudRecuperacionClaveHelper.
	 */
	private SolicitudRecuperacionClaveHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param asrc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         SolicitudRecuperacionClaveDTO
	 */
	public static SolicitudRecuperacionClaveDTO entidadADtoSimple(SolicitudRecuperacionClave asrc_entidad) {
		SolicitudRecuperacionClaveDTO lsrcd_dto = new SolicitudRecuperacionClaveDTO();
		lsrcd_dto.setIs_id(asrc_entidad.getId());
		lsrcd_dto.setIs_claveTemporal(asrc_entidad.getClaveTemporal());
		lsrcd_dto.setIs_claveTemporalUsada(asrc_entidad.getClaveTemporalUsada());
		lsrcd_dto.setId_fechaCierreSolicitud(asrc_entidad.getFechaCierreSolicitud());
		lsrcd_dto.setId_fechaCreacion(asrc_entidad.getFechaCreacion());
		lsrcd_dto.setId_fechaSolicitud(asrc_entidad.getFechaSolicitud());
		lsrcd_dto.setIs_idUsuarioCreacion(asrc_entidad.getIdUsuarioCreacion());
		lsrcd_dto.setIs_idUsuarioModificacion(asrc_entidad.getIdUsuarioModificacion());
		lsrcd_dto.setIs_ipCreacion(asrc_entidad.getIpCreacion());
		lsrcd_dto.setIs_ipModificacion(asrc_entidad.getIpModificacion());
		lsrcd_dto.setIs_uuidUrlRecuperacion(asrc_entidad.getUuidUrlRecuperacion());
		lsrcd_dto.setId_fechaModificacion(asrc_entidad.getFechaModificacion());
		lsrcd_dto.setIs_estereotipoCreacion(asrc_entidad.getEstereotipoCreacion());
		lsrcd_dto.setIs_estereotipoModificacion(asrc_entidad.getEstereotipoModificacion());

		return lsrcd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param asrc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         SolicitudRecuperacionClaveDTO
	 */
	public static SolicitudRecuperacionClaveDTO entidadADtoCompleto(SolicitudRecuperacionClave asrc_entidad) {
		SolicitudRecuperacionClaveDTO lsrcd_dto = entidadADtoSimple(asrc_entidad);
		if (asrc_entidad.getUsuario() != null)
			lsrcd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(asrc_entidad.getUsuario()));

		return lsrcd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alsrc_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         SolicitudRecuperacionClaveDTO
	 */
	public static List<SolicitudRecuperacionClaveDTO> listaEntidadADtoSimple(
			List<SolicitudRecuperacionClave> alsrc_listaEntidad) {
		List<SolicitudRecuperacionClaveDTO> llsrcd_listaDto = new ArrayList<>();
		for (SolicitudRecuperacionClave lsrc_entidad : alsrc_listaEntidad) {
			llsrcd_listaDto.add(entidadADtoSimple(lsrc_entidad));
		}
		return llsrcd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alsrc_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de SolicitudRecuperacionClaveDTO
	 */
	public static List<SolicitudRecuperacionClaveDTO> listaEntidadADtoCompleto(
			List<SolicitudRecuperacionClave> alsrc_listaEntidad) {
		List<SolicitudRecuperacionClaveDTO> llsrcd_listaDto = new ArrayList<>();
		for (SolicitudRecuperacionClave lsrc_entidad : alsrc_listaEntidad) {
			llsrcd_listaDto.add(entidadADtoCompleto(lsrc_entidad));
		}
		return llsrcd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param asrcd_dto     el parametro dto
	 * @param alsrc_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         SolicitudRecuperacionClave
	 */
	public static SolicitudRecuperacionClave dtoAEntidadSimple(SolicitudRecuperacionClaveDTO asrcd_dto,
			SolicitudRecuperacionClave alsrc_entidad) {
		if (null == alsrc_entidad) {
			alsrc_entidad = new SolicitudRecuperacionClave();
		}
		alsrc_entidad.setId(asrcd_dto.getIs_id());
		alsrc_entidad.setClaveTemporal(asrcd_dto.getIs_claveTemporal());
		alsrc_entidad.setClaveTemporalUsada(asrcd_dto.getIs_claveTemporalUsada());
		alsrc_entidad.setFechaCierreSolicitud(asrcd_dto.getId_fechaCierreSolicitud());
		alsrc_entidad.setFechaCreacion(asrcd_dto.getId_fechaCreacion());
		alsrc_entidad.setFechaSolicitud(asrcd_dto.getId_fechaSolicitud());
		alsrc_entidad.setIdUsuario(asrcd_dto.getIu_usuarioDto().getIs_id());
		alsrc_entidad.setIdUsuarioCreacion(asrcd_dto.getIs_idUsuarioCreacion());
		alsrc_entidad.setIdUsuarioModificacion(asrcd_dto.getIs_idUsuarioModificacion());
		alsrc_entidad.setIpCreacion(asrcd_dto.getIs_ipCreacion());
		alsrc_entidad.setIpModificacion(asrcd_dto.getIs_ipModificacion());
		alsrc_entidad.setUuidUrlRecuperacion(asrcd_dto.getIs_uuidUrlRecuperacion());
		alsrc_entidad.setFechaModificacion(asrcd_dto.getId_fechaModificacion());
		alsrc_entidad.setEstereotipoCreacion(asrcd_dto.getIs_estereotipoCreacion());
		alsrc_entidad.setEstereotipoModificacion(asrcd_dto.getIs_estereotipoModificacion());

		return alsrc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param asrcd_dto     el parametro dto
	 * @param alsrc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         SolicitudRecuperacionClave
	 */
	public static SolicitudRecuperacionClave dtoAEntidadCompleto(SolicitudRecuperacionClaveDTO asrcd_dto,
			SolicitudRecuperacionClave alsrc_entidad) {
		alsrc_entidad = dtoAEntidadSimple(asrcd_dto, alsrc_entidad);
		return alsrc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alsrcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         SolicitudRecuperacionClave
	 */
	public static List<SolicitudRecuperacionClave> listaDtoAEntidadSimple(
			List<SolicitudRecuperacionClaveDTO> alsrcd_listaDto) {
		List<SolicitudRecuperacionClave> llsrc_listaEntidad = new ArrayList<>();
		for (SolicitudRecuperacionClaveDTO lsrcd_dto : alsrcd_listaDto) {
			llsrc_listaEntidad.add(dtoAEntidadSimple(lsrcd_dto, null));
		}
		return llsrc_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alsrcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de SolicitudRecuperacionClave
	 */
	public static List<SolicitudRecuperacionClave> listaDtoAEntidadCompleto(
			List<SolicitudRecuperacionClaveDTO> alsrcd_listaDto) {
		List<SolicitudRecuperacionClave> llsrc_listaEntidad = new ArrayList<>();
		for (SolicitudRecuperacionClaveDTO lsrcd_dto : alsrcd_listaDto) {
			llsrc_listaEntidad.add(dtoAEntidadCompleto(lsrcd_dto, null));
		}
		return llsrc_listaEntidad;
	}
	// --- fin to Entidad

}
