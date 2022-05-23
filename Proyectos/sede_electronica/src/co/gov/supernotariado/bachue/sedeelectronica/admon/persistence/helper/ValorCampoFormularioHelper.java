/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ValorCampoFormularioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormularioPK;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Valor campo
 * formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValorCampoFormularioHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase ValorCampoFormularioHelper.
	 */
	private ValorCampoFormularioHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ValorCampoFormularioDTO
	 */
	public static ValorCampoFormularioDTO entidadADtoSimple(ValorCampoFormulario avcf_entidad) {

		ValorCampoFormularioDTO lvcfd_dto = new ValorCampoFormularioDTO();
		lvcfd_dto.setId_fechaCreacion(avcf_entidad.getFechaCreacion());
		lvcfd_dto.setId_fechaModificacion(avcf_entidad.getFechaModificacion());
		lvcfd_dto.setIs_idUsuarioCreacion(avcf_entidad.getIdUsuarioCreacion());
		lvcfd_dto.setIs_idUsuarioModificacion(avcf_entidad.getIdUsuarioModificacion());
		lvcfd_dto.setIs_ipCreacion(avcf_entidad.getIpCreacion());
		lvcfd_dto.setIs_ipModificacion(avcf_entidad.getIpModificacion());
		lvcfd_dto.setIs_valor(avcf_entidad.getValor());
		lvcfd_dto.setIs_activo(avcf_entidad.getActivo());
		lvcfd_dto.setIs_estereotipoCreacion(avcf_entidad.getEstereotipoCreacion());
		lvcfd_dto.setIs_estereotipoModificacion(avcf_entidad.getEstereotipoModificacion());
		return lvcfd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ValorCampoFormularioDTO
	 */
	public static ValorCampoFormularioDTO entidadADtoCompleto(ValorCampoFormulario avcf_entidad) {
		ValorCampoFormularioDTO lvcfd_dto = entidadADtoSimple(avcf_entidad);
		if (avcf_entidad.getId() != null) {
			lvcfd_dto.setIvcfp_idValorCampoFormularioDto(
					ValorCampoFormularioPKHelper.entidadADtoSimple(avcf_entidad.getId()));
			lvcfd_dto.setIcc_idConfiguracionCampo(
					ConfiguracionCampoHelper.entidadADtoCompleto(avcf_entidad.getConfiguracionCampo()));
		} else if (avcf_entidad.getConfiguracionCampo() != null && avcf_entidad.getIdFormularioUsuario() != null) {
			ValorCampoFormularioPK lvcf_valorCampoFormularioFk = new ValorCampoFormularioPK();
			lvcf_valorCampoFormularioFk.setIdConfiguracionCampo(avcf_entidad.getConfiguracionCampo().getId().getId());
			lvcf_valorCampoFormularioFk.setIdConfiguracionFormulario(
					avcf_entidad.getConfiguracionCampo().getId().getIdConfiguracionFormulario());
			lvcf_valorCampoFormularioFk.setIdFormularioUsuario(avcf_entidad.getIdFormularioUsuario().getId());
			lvcfd_dto.setIvcfp_idValorCampoFormularioDto(
					ValorCampoFormularioPKHelper.entidadADtoSimple(lvcf_valorCampoFormularioFk));
			lvcfd_dto.setIcc_idConfiguracionCampo(
					ConfiguracionCampoHelper.entidadADtoCompleto(avcf_entidad.getConfiguracionCampo()));
		}
		return lvcfd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alvcf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ValorCampoFormularioDTO
	 */
	public static List<ValorCampoFormularioDTO> listaEntidadADtoSimple(
			List<ValorCampoFormulario> alvcf_listaEntidades) {
		List<ValorCampoFormularioDTO> llvcfd_listaDto = new ArrayList<>();
		for (ValorCampoFormulario lvcf_entidad : alvcf_listaEntidades) {
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
	 *         de ValorCampoFormularioDTO
	 */
	public static List<ValorCampoFormularioDTO> listaEntidadADtoCompleto(
			List<ValorCampoFormulario> alvcf_listaEntidades) {
		List<ValorCampoFormularioDTO> llvcfd_listaDto = new ArrayList<>();
		for (ValorCampoFormulario lvcf_entidad : alvcf_listaEntidades) {
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
	 *         ValorCampoFormulario
	 */
	public static ValorCampoFormulario dtoAEntidadSimple(ValorCampoFormularioDTO avcfd_dto,
			ValorCampoFormulario avcf_entidad) {
		if (null == avcf_entidad) {
			avcf_entidad = new ValorCampoFormulario();
		}
		avcf_entidad.setActivo(avcfd_dto.getIs_activo());
		avcf_entidad.setFechaCreacion(avcfd_dto.getId_fechaCreacion());
		avcf_entidad.setFechaModificacion(avcfd_dto.getId_fechaModificacion());
		avcf_entidad.setIdUsuarioCreacion(avcfd_dto.getIs_idUsuarioCreacion());
		avcf_entidad.setIdUsuarioModificacion(avcfd_dto.getIs_idUsuarioModificacion());
		avcf_entidad.setIpCreacion(avcfd_dto.getIs_ipCreacion());
		avcf_entidad.setIpModificacion(avcfd_dto.getIs_ipModificacion());
		avcf_entidad.setValor(avcfd_dto.getIs_valor());
		avcf_entidad.setEstereotipoCreacion(avcfd_dto.getIs_estereotipoCreacion());
		avcf_entidad.setEstereotipoModificacion(avcfd_dto.getIs_estereotipoModificacion());
		return avcf_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param avcfd_dto    el parametro dto
	 * @param avcf_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ValorCampoFormulario
	 */
	public static ValorCampoFormulario dtoAEntidadCompleto(ValorCampoFormularioDTO avcfd_dto,
			ValorCampoFormulario avcf_entidad) {
		avcf_entidad = dtoAEntidadSimple(avcfd_dto, avcf_entidad);
		if (avcfd_dto.getIvcfp_idValorCampoFormularioDto() != null) {
			ValorCampoFormularioPK lvcfp_valorCampoFormularioPk = new ValorCampoFormularioPK();
			lvcfp_valorCampoFormularioPk.setIdConfiguracionCampo(
					avcfd_dto.getIvcfp_idValorCampoFormularioDto().getIs_idConfiguracionCampo());
			lvcfp_valorCampoFormularioPk.setIdConfiguracionFormulario(
					avcfd_dto.getIvcfp_idValorCampoFormularioDto().getIs_idConfiguracionFormulario());
			lvcfp_valorCampoFormularioPk
					.setIdFormularioUsuario(avcfd_dto.getIvcfp_idValorCampoFormularioDto().getIs_idFormularioUsuario());
			avcf_entidad.setId(lvcfp_valorCampoFormularioPk);
		}
		if (avcfd_dto.getIcc_idConfiguracionCampo() != null) {
			ConfiguracionCampo lcc_configuracionCampo = ConfiguracionCampoHelper
					.dtoAEntidadCompleto(avcfd_dto.getIcc_idConfiguracionCampo(), new ConfiguracionCampo());
			avcf_entidad.setConfiguracionCampo(lcc_configuracionCampo);
		}
		if (avcfd_dto.getIfu_idFormularioUsuario() != null) {
			FormularioUsuario lfu_formularioUsuario = FormularioUsuarioHelper
					.dtoAEntidadCompleto(avcfd_dto.getIfu_idFormularioUsuario(), new FormularioUsuario());
			avcf_entidad.setIdFormularioUsuario(lfu_formularioUsuario);
		}
		return avcf_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alvcfd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         ValorCampoFormulario
	 */
	public static List<ValorCampoFormulario> listaDtoAEntidadSimple(List<ValorCampoFormularioDTO> alvcfd_listaDto) {
		List<ValorCampoFormulario> llvcf_listaEntidades = new ArrayList<>();
		for (ValorCampoFormularioDTO lvcfd_dto : alvcfd_listaDto) {
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
	 *         de ValorCampoFormulario
	 */
	public static List<ValorCampoFormulario> listaDtoAEntidadCompleto(List<ValorCampoFormularioDTO> alvcfd_listaDto) {
		List<ValorCampoFormulario> llvcf_listaEntidades = new ArrayList<>();
		for (ValorCampoFormularioDTO lvcfd_dto : alvcfd_listaDto) {
			llvcf_listaEntidades.add(dtoAEntidadCompleto(lvcfd_dto, null));
		}
		return llvcf_listaEntidades;
	}
	// --- fin to Entidad

}
