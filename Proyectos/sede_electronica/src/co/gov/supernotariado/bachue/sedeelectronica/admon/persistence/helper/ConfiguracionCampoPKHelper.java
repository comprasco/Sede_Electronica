/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoPKHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ConfiguracionCampoPKHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionCampoPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampoPK;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Configuracion
 * campo PK. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionCampoPKHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampoPKHelper.
	 */
	private ConfiguracionCampoPKHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ConfiguracionCampoPKDTO
	 */
	public static ConfiguracionCampoPKDTO entidadADtoSimple(ConfiguracionCampoPK acc_entidad) {

		ConfiguracionCampoPKDTO lcc_dto = new ConfiguracionCampoPKDTO();
		lcc_dto.setIs_id(acc_entidad.getId());
		lcc_dto.setIs_idConfiguracionFormulario(acc_entidad.getIdConfiguracionFormulario());

		return lcc_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ConfiguracionCampoPKDTO
	 */
	public static ConfiguracionCampoPKDTO entidadADtoCompleto(ConfiguracionCampoPK acc_entidad) {
		ConfiguracionCampoPKDTO lcc_dto;
		lcc_dto = entidadADtoSimple(acc_entidad);
		return lcc_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alcc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ConfiguracionCampoPKDTO
	 */
	public static List<ConfiguracionCampoPKDTO> listaEntidadADtoSimple(List<ConfiguracionCampoPK> alcc_listaEntidades) {
		List<ConfiguracionCampoPKDTO> llcc_listaDto = new ArrayList<>();
		for (ConfiguracionCampoPK lcc_entidad : alcc_listaEntidades) {
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
	 *         de ConfiguracionCampoPKDTO
	 */
	public static List<ConfiguracionCampoPKDTO> listaEntidadADtoCompleto(
			List<ConfiguracionCampoPK> alcc_listaEntidades) {
		List<ConfiguracionCampoPKDTO> llccd_listaDto = new ArrayList<>();
		for (ConfiguracionCampoPK lcc_entidad : alcc_listaEntidades) {
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
	 * @return Resultado para dto A entidad simple retornado como
	 *         ConfiguracionCampoPK
	 */
	public static ConfiguracionCampoPK dtoAEntidadSimple(ConfiguracionCampoPKDTO accd_dto,
			ConfiguracionCampoPK acc_entidad) {
		if (null == acc_entidad) {
			acc_entidad = new ConfiguracionCampoPK();
		}

		acc_entidad.setId(accd_dto.getIs_id());
		acc_entidad.setIdConfiguracionFormulario(accd_dto.getIs_idConfiguracionFormulario());

		return acc_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param accd_dto    el parametro dto
	 * @param acc_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ConfiguracionCampoPK
	 */
	public static ConfiguracionCampoPK dtoAEntidadCompleto(ConfiguracionCampoPKDTO accd_dto,
			ConfiguracionCampoPK acc_entidad) {
		acc_entidad = dtoAEntidadSimple(accd_dto, acc_entidad);

		return acc_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param alccd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         ConfiguracionCampoPK
	 */
	public static List<ConfiguracionCampoPK> listaDtoAEntidadSimple(List<ConfiguracionCampoPKDTO> alccd_listaDto) {
		List<ConfiguracionCampoPK> llcc_listaEntidades = new ArrayList<>();
		for (ConfiguracionCampoPKDTO lccd_dto : alccd_listaDto) {
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
	 *         de ConfiguracionCampoPK
	 */
	public static List<ConfiguracionCampoPK> listaDtoAEntidadCompleto(List<ConfiguracionCampoPKDTO> alccd_listaDto) {
		List<ConfiguracionCampoPK> llcc_listaEntidades = new ArrayList<>();
		for (ConfiguracionCampoPKDTO lccd_dto : alccd_listaDto) {
			llcc_listaEntidades.add(dtoAEntidadCompleto(lccd_dto, null));
		}
		return llcc_listaEntidades;
	}
	// --- fin to Entidad

}
