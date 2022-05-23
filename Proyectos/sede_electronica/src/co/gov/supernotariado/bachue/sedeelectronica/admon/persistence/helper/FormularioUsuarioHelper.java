/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioUsuarioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: FormularioUsuarioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioUsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Formulario
 * usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioUsuarioHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase FormularioUsuarioHelper.
	 */
	private FormularioUsuarioHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param afu_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         FormularioUsuarioDTO
	 */
	public static FormularioUsuarioDTO entidadADtoSimple(FormularioUsuario afu_entidad) {

		FormularioUsuarioDTO lfud_dto = new FormularioUsuarioDTO();
		lfud_dto.setIs_id(afu_entidad.getId());
		lfud_dto.setIs_idUsuarioCreacion(afu_entidad.getIdUsuarioCreacion());
		lfud_dto.setIs_idUsuarioModificacion(afu_entidad.getIdUsuarioModificacion());
		lfud_dto.setIs_ipCreacion(afu_entidad.getIpCreacion());
		lfud_dto.setIs_ipModificacion(afu_entidad.getIpModificacion());
		lfud_dto.setId_fechaCreacion(afu_entidad.getFechaCreacion());
		lfud_dto.setId_fechaModificacion(afu_entidad.getFechaModificacion());
		lfud_dto.setIs_activo(afu_entidad.getActivo());
		lfud_dto.setIs_estereotipoCreacion(afu_entidad.getEstereotipoCreacion());
		lfud_dto.setIs_estereotipoModificacion(afu_entidad.getEstereotipoModificacion());
		return lfud_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param afu_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         FormularioUsuarioDTO
	 */
	public static FormularioUsuarioDTO entidadADtoCompleto(FormularioUsuario afu_entidad) {
		FormularioUsuarioDTO lfud_dto = entidadADtoSimple(afu_entidad);
		if (afu_entidad.getConfiguracionFormulario() != null)
			lfud_dto.setIcf_idConfiguracionFormularioDto(
					ConfiguracionFormularioHelper.entidadADtoSimple(afu_entidad.getConfiguracionFormulario()));
		if (afu_entidad.getIdUsuario() != null)
			lfud_dto.setIud_usuarioDto(new UsuarioDTO(afu_entidad.getIdUsuario()));
		return lfud_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alfu_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         FormularioUsuarioDTO
	 */
	public static List<FormularioUsuarioDTO> listaEntidadADtoSimple(List<FormularioUsuario> alfu_listaEntidades) {
		List<FormularioUsuarioDTO> llfud_listaDto = new ArrayList<>();
		for (FormularioUsuario lfu_entidad : alfu_listaEntidades) {
			llfud_listaDto.add(entidadADtoSimple(lfu_entidad));
		}
		return llfud_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alfu_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de FormularioUsuarioDTO
	 */
	public static List<FormularioUsuarioDTO> listaEntidadADtoCompleto(List<FormularioUsuario> alfu_listaEntidades) {
		List<FormularioUsuarioDTO> llfud_listaDto = new ArrayList<>();
		for (FormularioUsuario lfu_entidad : alfu_listaEntidades) {
			llfud_listaDto.add(entidadADtoCompleto(lfu_entidad));
		}
		return llfud_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param afud_dto    el parametro dto
	 * @param afu_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como FormularioUsuario
	 */
	public static FormularioUsuario dtoAEntidadSimple(FormularioUsuarioDTO afud_dto, FormularioUsuario afu_entidad) {
		if (null == afu_entidad) {
			afu_entidad = new FormularioUsuario();
		}

		afu_entidad.setId(afud_dto.getIs_id());
		afu_entidad.setFechaCreacion(afud_dto.getId_fechaCreacion());
		afu_entidad.setFechaModificacion(afud_dto.getId_fechaModificacion());
		afu_entidad.setIdUsuarioCreacion(afud_dto.getIs_idUsuarioCreacion());
		afu_entidad.setIdUsuarioModificacion(afud_dto.getIs_idUsuarioModificacion());
		afu_entidad.setIpCreacion(afud_dto.getIs_ipCreacion());
		afu_entidad.setIpModificacion(afud_dto.getIs_ipModificacion());
		afu_entidad.setActivo(afud_dto.getIs_activo());
		afu_entidad.setEstereotipoCreacion(afud_dto.getIs_estereotipoCreacion());
		afu_entidad.setEstereotipoModificacion(afud_dto.getIs_estereotipoModificacion());

		return afu_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param afud_dto    el parametro dto
	 * @param afu_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         FormularioUsuario
	 */
	public static FormularioUsuario dtoAEntidadCompleto(FormularioUsuarioDTO afud_dto, FormularioUsuario afu_entidad) {
		afu_entidad = dtoAEntidadSimple(afud_dto, afu_entidad);
		if (afud_dto.getIcf_idConfiguracionFormularioDto() != null) {
			afu_entidad.setConfiguracionFormulario(new ConfiguracionFormulario());
			afu_entidad.getConfiguracionFormulario().setId(afud_dto.getIcf_idConfiguracionFormularioDto().getIs_id());
		}
		if (afud_dto.getIud_usuarioDto() != null) {
			afu_entidad.setIdUsuario(afud_dto.getIud_usuarioDto().getIs_id());
		}
		return afu_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alfud_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         FormularioUsuario
	 */
	public static List<FormularioUsuario> listaDtoAEntidadSimple(List<FormularioUsuarioDTO> alfud_listaDto) {
		List<FormularioUsuario> llfu_listaEntidades = new ArrayList<>();
		for (FormularioUsuarioDTO lfud_dto : alfud_listaDto) {
			llfu_listaEntidades.add(dtoAEntidadSimple(lfud_dto, null));
		}
		return llfu_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alfud_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de FormularioUsuario
	 */
	public static List<FormularioUsuario> listaDtoAEntidadCompleto(List<FormularioUsuarioDTO> alfud_listaDto) {
		List<FormularioUsuario> llub_listaEntidades = new ArrayList<>();
		for (FormularioUsuarioDTO lubd_dto : alfud_listaDto) {
			llub_listaEntidades.add(dtoAEntidadCompleto(lubd_dto, null));
		}
		return llub_listaEntidades;
	}
	// --- fin to Entidad

}
