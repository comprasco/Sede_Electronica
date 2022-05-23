/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionFormularioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ConfiguracionFormularioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Configuracion
 * formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionFormularioHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConfiguracionFormularioHelper.
	 */
	private ConfiguracionFormularioHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param acf_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ConfiguracionFormularioDTO
	 */
	public static ConfiguracionFormularioDTO entidadADtoSimple(ConfiguracionFormulario acf_entidad) {

		ConfiguracionFormularioDTO lcfd_dto = new ConfiguracionFormularioDTO();
		lcfd_dto.setIs_id(acf_entidad.getId());
		lcfd_dto.setId_fechaCreacion(acf_entidad.getFechaCreacion());
		lcfd_dto.setId_fechaModificacion(acf_entidad.getFechaModificacion());
		lcfd_dto.setIs_idUsuarioCreacion(acf_entidad.getIdUsuarioCreacion());
		lcfd_dto.setIs_idUsuarioModificacion(acf_entidad.getIdUsuarioModificacion());
		lcfd_dto.setIs_ipCreacion(acf_entidad.getIpCreacion());
		lcfd_dto.setIs_ipModificacion(acf_entidad.getIpModificacion());
		lcfd_dto.setIs_descripcion(acf_entidad.getDescripcion());
		lcfd_dto.setIs_nombre(acf_entidad.getNombre());
		lcfd_dto.setIs_activo(acf_entidad.getActivo());
		lcfd_dto.setIs_estereotipoCreacion(acf_entidad.getEstereotipoCreacion());
		lcfd_dto.setIs_estereotipoModificacion(acf_entidad.getEstereotipoModificacion());

		return lcfd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param acf_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ConfiguracionFormularioDTO
	 */
	public static ConfiguracionFormularioDTO entidadADtoCompleto(ConfiguracionFormulario acf_entidad) {
		ConfiguracionFormularioDTO lcfd_dto;
		lcfd_dto = entidadADtoSimple(acf_entidad);
		return lcfd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alcf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ConfiguracionFormularioDTO
	 */
	public static List<ConfiguracionFormularioDTO> listaEntidadADtoSimple(
			List<ConfiguracionFormulario> alcf_listaEntidades) {
		List<ConfiguracionFormularioDTO> llcfd_listaDto = new ArrayList<>();
		for (ConfiguracionFormulario lcf_entidad : alcf_listaEntidades) {
			llcfd_listaDto.add(entidadADtoSimple(lcf_entidad));
		}
		return llcfd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alcf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ConfiguracionFormularioDTO
	 */
	public static List<ConfiguracionFormularioDTO> listaEntidadADtoCompleto(
			List<ConfiguracionFormulario> alcf_listaEntidades) {
		List<ConfiguracionFormularioDTO> llcfd_listaDto = new ArrayList<>();
		for (ConfiguracionFormulario lcf_entidad : alcf_listaEntidades) {
			llcfd_listaDto.add(entidadADtoCompleto(lcf_entidad));
		}
		return llcfd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param acfd_dto    el parametro dto
	 * @param acf_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         ConfiguracionFormulario
	 */
	public static ConfiguracionFormulario dtoAEntidadSimple(ConfiguracionFormularioDTO acfd_dto,
			ConfiguracionFormulario acf_entidad) {
		if (null == acf_entidad) {
			acf_entidad = new ConfiguracionFormulario();
		}

		acf_entidad.setId(acfd_dto.getIs_id());
		acf_entidad.setFechaCreacion(acfd_dto.getId_fechaCreacion());
		acf_entidad.setFechaModificacion(acfd_dto.getId_fechaModificacion());
		acf_entidad.setIdUsuarioCreacion(acfd_dto.getIs_idUsuarioCreacion());
		acf_entidad.setIdUsuarioModificacion(acfd_dto.getIs_idUsuarioModificacion());
		acf_entidad.setIpCreacion(acfd_dto.getIs_ipCreacion());
		acf_entidad.setIpModificacion(acfd_dto.getIs_ipModificacion());
		acf_entidad.setDescripcion(acfd_dto.getIs_descripcion());
		acf_entidad.setNombre(acfd_dto.getIs_nombre());
		acf_entidad.setActivo(acfd_dto.getIs_activo());
		acf_entidad.setEstereotipoCreacion(acfd_dto.getIs_estereotipoCreacion());
		acf_entidad.setEstereotipoModificacion(acfd_dto.getIs_estereotipoModificacion());

		return acf_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param acfd_dto    el parametro dto
	 * @param acf_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ConfiguracionFormulario
	 */
	public static ConfiguracionFormulario dtoAEntidadCompleto(ConfiguracionFormularioDTO acfd_dto,
			ConfiguracionFormulario acf_entidad) {
		acf_entidad = dtoAEntidadSimple(acfd_dto, acf_entidad);

		return acf_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alcfd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         ConfiguracionFormulario
	 */
	public static List<ConfiguracionFormulario> listaDtoAEntidadSimple(
			List<ConfiguracionFormularioDTO> alcfd_listaDto) {
		List<ConfiguracionFormulario> llcf_listaEntidades = new ArrayList<>();
		for (ConfiguracionFormularioDTO lcfd_dto : alcfd_listaDto) {
			llcf_listaEntidades.add(dtoAEntidadSimple(lcfd_dto, null));
		}
		return llcf_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alcfd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de ConfiguracionFormulario
	 */
	public static List<ConfiguracionFormulario> listaDtoAEntidadCompleto(
			List<ConfiguracionFormularioDTO> alcfd_listaDto) {
		List<ConfiguracionFormulario> llcf_listaEntidades = new ArrayList<>();
		for (ConfiguracionFormularioDTO lcfd_dto : alcfd_listaDto) {
			llcf_listaEntidades.add(dtoAEntidadCompleto(lcfd_dto, null));
		}
		return llcf_listaEntidades;
	}
	// --- fin to Entidad

}
