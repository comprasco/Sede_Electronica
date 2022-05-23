/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ConfiguracionCampoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionCampoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampoPK;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Configuracion
 * campo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionCampoHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampoHelper.
	 */
	private ConfiguracionCampoHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ConfiguracionCampoDTO
	 */
	public static ConfiguracionCampoDTO entidadADtoSimple(ConfiguracionCampo acc_entidad) {

		ConfiguracionCampoDTO lcc_dto = new ConfiguracionCampoDTO();
		lcc_dto.setId_fechaCreacion(acc_entidad.getFechaCreacion());
		lcc_dto.setId_fechaModificacion(acc_entidad.getFechaModificacion());
		lcc_dto.setIs_idUsuarioCreacion(acc_entidad.getIdUsuarioCreacion());
		lcc_dto.setIs_idUsuarioModificacion(acc_entidad.getIdUsuarioModificacion());
		lcc_dto.setIs_ipCreacion(acc_entidad.getIpCreacion());
		lcc_dto.setIs_ipModificacion(acc_entidad.getIpModificacion());
		lcc_dto.setIs_descripcion(acc_entidad.getDescripcion());
		lcc_dto.setIs_formato(acc_entidad.getFormato());
		lcc_dto.setIs_nombre(acc_entidad.getNombre());
		lcc_dto.setIs_obligatorio(acc_entidad.getObligatorio());
		lcc_dto.setIs_tipoDato(acc_entidad.getTipoDato());
		lcc_dto.setIs_valorDefecto(acc_entidad.getValorDefecto());
		lcc_dto.setIs_activo(acc_entidad.getActivo());
		lcc_dto.setIs_estereotipoCreacion(acc_entidad.getEstereotipoCreacion());
		lcc_dto.setIs_estereotipoModificacion(acc_entidad.getEstereotipoModificacion());

		return lcc_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ConfiguracionCampoDTO
	 */
	public static ConfiguracionCampoDTO entidadADtoCompleto(ConfiguracionCampo acc_entidad) {
		ConfiguracionCampoDTO lcc_dto = entidadADtoSimple(acc_entidad);

		if (acc_entidad.getId() != null)
			lcc_dto.setIccp_idConfiguracionFormularioDto(
					ConfiguracionCampoPKHelper.entidadADtoSimple(acc_entidad.getId()));
		if (acc_entidad.getConfiguracionFormulario() != null) {
			lcc_dto.setIcf_idConfiguracionFormulario(
					ConfiguracionFormularioHelper.entidadADtoSimple(acc_entidad.getConfiguracionFormulario()));

		}
		return lcc_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alcc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ConfiguracionCampoDTO
	 */
	public static List<ConfiguracionCampoDTO> listaEntidadADtoSimple(List<ConfiguracionCampo> alcc_listaEntidades) {
		List<ConfiguracionCampoDTO> llcc_listaDto = new ArrayList<>();
		for (ConfiguracionCampo lcc_entidad : alcc_listaEntidades) {
			llcc_listaDto.add(entidadADtoSimple(lcc_entidad));
		}
		return llcc_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alcc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ConfiguracionCampoDTO
	 */
	public static List<ConfiguracionCampoDTO> listaEntidadADtoCompleto(List<ConfiguracionCampo> alcc_listaEntidades) {
		List<ConfiguracionCampoDTO> llccd_listaDto = new ArrayList<>();
		for (ConfiguracionCampo lcc_entidad : alcc_listaEntidades) {
			llccd_listaDto.add(entidadADtoCompleto(lcc_entidad));
		}
		return llccd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param accd_dto    el parametro dto
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como ConfiguracionCampo
	 */
	public static ConfiguracionCampo dtoAEntidadSimple(ConfiguracionCampoDTO accd_dto, ConfiguracionCampo acc_entidad) {
		if (null == acc_entidad) {
			acc_entidad = new ConfiguracionCampo();
		}
		acc_entidad.setFechaCreacion(accd_dto.getId_fechaCreacion());
		acc_entidad.setFechaModificacion(accd_dto.getId_fechaModificacion());
		acc_entidad.setIdUsuarioCreacion(accd_dto.getIs_idUsuarioCreacion());
		acc_entidad.setIdUsuarioModificacion(accd_dto.getIs_idUsuarioModificacion());
		acc_entidad.setIpCreacion(accd_dto.getIs_ipCreacion());
		acc_entidad.setIpModificacion(accd_dto.getIs_ipModificacion());
		acc_entidad.setActivo(accd_dto.getIs_activo());
		acc_entidad.setEstereotipoCreacion(accd_dto.getIs_estereotipoCreacion());
		acc_entidad.setEstereotipoModificacion(accd_dto.getIs_estereotipoModificacion());

		return acc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param accd_dto    el parametro dto
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ConfiguracionCampo
	 */
	public static ConfiguracionCampo dtoAEntidadCompleto(ConfiguracionCampoDTO accd_dto,
			ConfiguracionCampo acc_entidad) {
		acc_entidad = dtoAEntidadSimple(accd_dto, acc_entidad);

		if (accd_dto.getIcf_idConfiguracionFormulario() != null) {
			acc_entidad.setConfiguracionFormulario(new ConfiguracionFormulario());
			acc_entidad.getConfiguracionFormulario().setId(accd_dto.getIcf_idConfiguracionFormulario().getIs_id());
		}
		if (accd_dto.getIccp_idConfiguracionFormularioDto() != null) {
			acc_entidad.setId(ConfiguracionCampoPKHelper
					.dtoAEntidadCompleto(accd_dto.getIccp_idConfiguracionFormularioDto(), new ConfiguracionCampoPK()));
		}
		return acc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alccd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         ConfiguracionCampo
	 */
	public static List<ConfiguracionCampo> listaDtoAEntidadSimple(List<ConfiguracionCampoDTO> alccd_listaDto) {
		List<ConfiguracionCampo> llcc_listaEntidades = new ArrayList<>();
		for (ConfiguracionCampoDTO lccd_dto : alccd_listaDto) {
			llcc_listaEntidades.add(dtoAEntidadSimple(lccd_dto, null));
		}
		return llcc_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alccd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de ConfiguracionCampo
	 */
	public static List<ConfiguracionCampo> listaDtoAEntidadCompleto(List<ConfiguracionCampoDTO> alccd_listaDto) {
		List<ConfiguracionCampo> llcc_listaEntidades = new ArrayList<>();
		for (ConfiguracionCampoDTO lccd_dto : alccd_listaDto) {
			llcc_listaEntidades.add(dtoAEntidadCompleto(lccd_dto, null));
		}
		return llcc_listaEntidades;
	}
	// --- fin to Entidad

}
