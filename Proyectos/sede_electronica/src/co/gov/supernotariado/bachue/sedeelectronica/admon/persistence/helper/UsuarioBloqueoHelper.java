/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBloqueoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: UsuarioBloqueoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioBloqueo;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Usuario
 * bloqueo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioBloqueoHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioBloqueoHelper.
	 */
	private UsuarioBloqueoHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param au_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como UsuarioBloqueoDTO
	 */
	public static UsuarioBloqueoDTO entidadADtoSimple(UsuarioBloqueo au_entidad) {

		UsuarioBloqueoDTO lubd_dto = new UsuarioBloqueoDTO();
		lubd_dto.setIs_id(au_entidad.getId());
		lubd_dto.setId_fechaBloqueoFin(au_entidad.getFechaBloqueoFin());
		lubd_dto.setId_fechaBloqueoInicio(au_entidad.getFechaBloqueoInicio());
		lubd_dto.setId_fechaCreacion(au_entidad.getFechaCreacion());
		lubd_dto.setId_fechaModificacion(au_entidad.getFechaModificacion());
		lubd_dto.setIs_idUsuarioCreacion(au_entidad.getIdUsuarioCreacion());
		lubd_dto.setIs_idUsuarioModificacion(au_entidad.getIdUsuarioModificacion());
		lubd_dto.setIs_ipCreacion(au_entidad.getIpCreacion());
		lubd_dto.setIs_ipModificacion(au_entidad.getIpModificacion());
		lubd_dto.setIs_observacionBloqueo(au_entidad.getObservacionBloqueo());
		lubd_dto.setIb_soporteBloqueo(au_entidad.getSoporteBloqueo());
		lubd_dto.setIs_estereotipoCreacion(au_entidad.getEstereotipoCreacion());
		lubd_dto.setIs_estereotipoModificacion(au_entidad.getEstereotipoModificacion());
		return lubd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aub_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         UsuarioBloqueoDTO
	 */
	public static UsuarioBloqueoDTO entidadADtoCompleto(UsuarioBloqueo aub_entidad) {
		UsuarioBloqueoDTO lubd_dto = entidadADtoSimple(aub_entidad);
		if (aub_entidad.getUsuario() != null) {
			lubd_dto.setIud_usuarioDto(UsuarioHelper.entidadADtoSimple(aub_entidad.getUsuario()));
		}
		return lubd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alub_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         UsuarioBloqueoDTO
	 */
	public static List<UsuarioBloqueoDTO> listaEntidadADtoSimple(List<UsuarioBloqueo> alub_listaEntidades) {
		List<UsuarioBloqueoDTO> llubd_listaDto = new ArrayList<>();
		for (UsuarioBloqueo lub_entidad : alub_listaEntidades) {
			llubd_listaDto.add(entidadADtoSimple(lub_entidad));
		}
		return llubd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alub_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de UsuarioBloqueoDTO
	 */
	public static List<UsuarioBloqueoDTO> listaEntidadADtoCompleto(List<UsuarioBloqueo> alub_listaEntidades) {
		List<UsuarioBloqueoDTO> llubd_listaDto = new ArrayList<>();
		for (UsuarioBloqueo lub_entidad : alub_listaEntidades) {
			llubd_listaDto.add(entidadADtoCompleto(lub_entidad));
		}
		return llubd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param aubd_dto    el parametro dto
	 * @param aub_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como UsuarioBloqueo
	 */
	public static UsuarioBloqueo dtoAEntidadSimple(UsuarioBloqueoDTO aubd_dto, UsuarioBloqueo aub_entidad) {
		if (null == aub_entidad) {
			aub_entidad = new UsuarioBloqueo();
		}

		aub_entidad.setId(aubd_dto.getIs_id());
		aub_entidad.setFechaBloqueoFin(aubd_dto.getId_fechaBloqueoFin());
		aub_entidad.setFechaBloqueoInicio(aubd_dto.getId_fechaBloqueoInicio());
		aub_entidad.setFechaCreacion(aubd_dto.getId_fechaCreacion());
		aub_entidad.setFechaModificacion(aubd_dto.getId_fechaModificacion());
		aub_entidad.setIdUsuarioCreacion(aubd_dto.getIs_idUsuarioCreacion());
		aub_entidad.setIdUsuarioModificacion(aubd_dto.getIs_idUsuarioModificacion());
		aub_entidad.setIpCreacion(aubd_dto.getIs_ipCreacion());
		aub_entidad.setIpModificacion(aubd_dto.getIs_ipModificacion());
		aub_entidad.setObservacionBloqueo(aubd_dto.getIs_observacionBloqueo());
		aub_entidad.setSoporteBloqueo(aubd_dto.getIb_soporteBloqueo());
		aub_entidad.setEstereotipoCreacion(aubd_dto.getIs_estereotipoCreacion());
		aub_entidad.setEstereotipoModificacion(aubd_dto.getIs_estereotipoModificacion());
		return aub_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param aubd_dto    el parametro dto
	 * @param aub_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como UsuarioBloqueo
	 */
	public static UsuarioBloqueo dtoAEntidadCompleto(UsuarioBloqueoDTO aubd_dto, UsuarioBloqueo aub_entidad) {
		aub_entidad = dtoAEntidadSimple(aubd_dto, aub_entidad);
		if (aubd_dto.getIud_usuarioDto() != null) {
			aub_entidad.setUsuario(new Usuario());
			aub_entidad.getUsuario().setId(aubd_dto.getIud_usuarioDto().getIs_id());
		}

		return aub_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alubd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         UsuarioBloqueo
	 */
	public static List<UsuarioBloqueo> listaDtoAEntidadSimple(List<UsuarioBloqueoDTO> alubd_listaDto) {
		List<UsuarioBloqueo> llub_listaEntidades = new ArrayList<>();
		for (UsuarioBloqueoDTO lubd_dto : alubd_listaDto) {
			llub_listaEntidades.add(dtoAEntidadSimple(lubd_dto, null));
		}
		return llub_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alubd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de UsuarioBloqueo
	 */
	public static List<UsuarioBloqueo> listaDtoAEntidadCompleto(List<UsuarioBloqueoDTO> alubd_listaDto) {
		List<UsuarioBloqueo> llub_listaEntidades = new ArrayList<>();
		for (UsuarioBloqueoDTO lubd_dto : alubd_listaDto) {
			llub_listaEntidades.add(dtoAEntidadCompleto(lubd_dto, null));
		}
		return llub_listaEntidades;
	}
	// --- fin to Entidad

}
