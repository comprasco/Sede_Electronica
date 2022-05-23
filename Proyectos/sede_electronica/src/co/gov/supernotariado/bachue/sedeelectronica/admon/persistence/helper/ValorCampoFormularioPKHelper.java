/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioPKHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ValorCampoFormularioPKHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormularioPK;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Valor campo
 * formulario PK. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValorCampoFormularioPKHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ValorCampoFormularioPKHelper.
	 */
	private ValorCampoFormularioPKHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ValorCampoFormularioPKDTO
	 */
	public static ValorCampoFormularioPKDTO entidadADtoSimple(ValorCampoFormularioPK avcf_entidad) {

		ValorCampoFormularioPKDTO lvcfd_dto = new ValorCampoFormularioPKDTO();
		lvcfd_dto.setIs_idConfiguracionCampo(avcf_entidad.getIdConfiguracionCampo());
		lvcfd_dto.setIs_idConfiguracionFormulario(avcf_entidad.getIdConfiguracionFormulario());
		lvcfd_dto.setIs_idFormularioUsuario(avcf_entidad.getIdFormularioUsuario());
		return lvcfd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ValorCampoFormularioPKDTO
	 */
	public static ValorCampoFormularioPKDTO entidadADtoCompleto(ValorCampoFormularioPK avcf_entidad) {
		ValorCampoFormularioPKDTO lvcfd_dto;
		lvcfd_dto = entidadADtoSimple(avcf_entidad);
		return lvcfd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alvcf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ValorCampoFormularioPKDTO
	 */
	public static List<ValorCampoFormularioPKDTO> listaEntidadADtoSimple(
			List<ValorCampoFormularioPK> alvcf_listaEntidades) {
		List<ValorCampoFormularioPKDTO> llvcfd_listaDto = new ArrayList<>();
		for (ValorCampoFormularioPK lvcf_entidad : alvcf_listaEntidades) {
			llvcfd_listaDto.add(entidadADtoSimple(lvcf_entidad));
		}
		return llvcfd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alvcf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ValorCampoFormularioPKDTO
	 */
	public static List<ValorCampoFormularioPKDTO> listaEntidadADtoCompleto(
			List<ValorCampoFormularioPK> alvcf_listaEntidades) {
		List<ValorCampoFormularioPKDTO> llvcfd_listaDto = new ArrayList<>();
		for (ValorCampoFormularioPK lvcf_entidad : alvcf_listaEntidades) {
			llvcfd_listaDto.add(entidadADtoCompleto(lvcf_entidad));
		}
		return llvcfd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param avcfd_dto    el parametro dto
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         ValorCampoFormularioPK
	 */
	public static ValorCampoFormularioPK dtoAEntidadSimple(ValorCampoFormularioPKDTO avcfd_dto,
			ValorCampoFormularioPK avcf_entidad) {
		if (null == avcf_entidad) {
			avcf_entidad = new ValorCampoFormularioPK();
		}
		avcf_entidad.setIdConfiguracionCampo(avcfd_dto.getIs_idConfiguracionCampo());
		avcf_entidad.setIdConfiguracionFormulario(avcfd_dto.getIs_idConfiguracionFormulario());
		avcf_entidad.setIdFormularioUsuario(avcfd_dto.getIs_idFormularioUsuario());
		return avcf_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param avcfd_dto    el parametro dto
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ValorCampoFormularioPK
	 */
	public static ValorCampoFormularioPK dtoAEntidadCompleto(ValorCampoFormularioPKDTO avcfd_dto,
			ValorCampoFormularioPK avcf_entidad) {
		avcf_entidad = dtoAEntidadSimple(avcfd_dto, avcf_entidad);

		return avcf_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alvcfd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         ValorCampoFormularioPK
	 */
	public static List<ValorCampoFormularioPK> listaDtoAEntidadSimple(List<ValorCampoFormularioPKDTO> alvcfd_listaDto) {
		List<ValorCampoFormularioPK> llvcf_listaEntidades = new ArrayList<>();
		for (ValorCampoFormularioPKDTO lvcfd_dto : alvcfd_listaDto) {
			llvcf_listaEntidades.add(dtoAEntidadSimple(lvcfd_dto, null));
		}
		return llvcf_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alvcfd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de ValorCampoFormularioPK
	 */
	public static List<ValorCampoFormularioPK> listaDtoAEntidadCompleto(
			List<ValorCampoFormularioPKDTO> alvcfd_listaDto) {
		List<ValorCampoFormularioPK> llvcf_listaEntidades = new ArrayList<>();
		for (ValorCampoFormularioPKDTO lvcfd_dto : alvcfd_listaDto) {
			llvcf_listaEntidades.add(dtoAEntidadCompleto(lvcfd_dto, null));
		}
		return llvcf_listaEntidades;
	}
	// --- fin to Entidad

}
