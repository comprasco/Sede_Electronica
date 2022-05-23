/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ParametroHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Parametro.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ParametroHelper.
	 */
	private ParametroHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como ParametroDTO
	 */
	public static ParametroDTO entidadADtoSimple(Parametro ap_entidad) {
		ParametroDTO lpd_dto = new ParametroDTO();
		lpd_dto.setIs_id(ap_entidad.getId());
		lpd_dto.setIs_activo(ap_entidad.getActivo());
		lpd_dto.setIs_codigoParametro(ap_entidad.getCodigoParametro());
		lpd_dto.setIs_descripcion(ap_entidad.getDescripcion());
		lpd_dto.setIs_editable(ap_entidad.getEditable());
		lpd_dto.setId_fechaCreacion(ap_entidad.getFechaCreacion());
		lpd_dto.setId_fechaModificacion(ap_entidad.getFechaModificacion());
		lpd_dto.setIs_textoAyuda(ap_entidad.getTextoAyuda());
		lpd_dto.setIs_idUsuarioCreacion(ap_entidad.getIdUsuarioCreacion());
		lpd_dto.setIs_idUsuarioModificacion(ap_entidad.getIdUsuarioModificacion());
		lpd_dto.setIs_ipCreacion(ap_entidad.getIpCreacion());
		lpd_dto.setIs_ipModificacion(ap_entidad.getIpModificacion());
		lpd_dto.setIs_nombre(ap_entidad.getNombre());
		lpd_dto.setIs_tipoVariable(ap_entidad.getTipoVariable());
		lpd_dto.setIs_unidadParametro(ap_entidad.getUnidadParametro());
		lpd_dto.setIs_valor(ap_entidad.getValor());
		lpd_dto.setIs_valorParametroDefecto(ap_entidad.getValorParametroDefecto());
		lpd_dto.setIbi_valorMinimo(ap_entidad.getValorMinimo());
		lpd_dto.setIbi_valorMaximo(ap_entidad.getValorMaximo());
		lpd_dto.setIs_valorUi(ap_entidad.getActivo().equals(EnumBoolean.CHAR_S.getIs_codigo()) ? ap_entidad.getValor()
				: ap_entidad.getValorParametroDefecto());
		lpd_dto.setIs_estereotipoCreacion(ap_entidad.getEstereotipoCreacion());
		lpd_dto.setIs_estereotipoModificacion(ap_entidad.getEstereotipoModificacion());
		return lpd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como ParametroDTO
	 */
	public static ParametroDTO entidadADtoCompleto(Parametro ap_entidad) {
		ParametroDTO lpd_dto = entidadADtoSimple(ap_entidad);
		if (ap_entidad.getTipoProceso() != null)
			lpd_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(ap_entidad.getTipoProceso()));

		return lpd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         ParametroDTO
	 */
	public static List<ParametroDTO> listaEntidadADtoSimple(List<Parametro> alp_listaEntidades) {
		List<ParametroDTO> llpd_listaDto = new ArrayList<>();
		for (Parametro lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoSimple(lp_entidad));
		}
		return llpd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alp_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de ParametroDTO
	 */
	public static List<ParametroDTO> listaEntidadADtoCompleto(List<Parametro> alp_listaEntidades) {
		List<ParametroDTO> llpd_listaDto = new ArrayList<>();
		for (Parametro lp_entidad : alp_listaEntidades) {
			llpd_listaDto.add(entidadADtoCompleto(lp_entidad));
		}
		return llpd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Parametro
	 */
	public static Parametro dtoAEntidadSimple(ParametroDTO apd_dto, Parametro ap_entidad) {
		if (null == ap_entidad) {
			ap_entidad = new Parametro();
		}
		ap_entidad.setId(apd_dto.getIs_id());
		ap_entidad.setActivo(apd_dto.getIs_activo());
		ap_entidad.setCodigoParametro(apd_dto.getIs_codigoParametro());
		ap_entidad.setDescripcion(apd_dto.getIs_descripcion());
		ap_entidad.setEditable(apd_dto.getIs_editable());
		ap_entidad.setFechaCreacion(apd_dto.getId_fechaCreacion());
		ap_entidad.setFechaModificacion(apd_dto.getId_fechaModificacion());
		ap_entidad.setTextoAyuda(apd_dto.getIs_textoAyuda());
		ap_entidad.setIdUsuarioCreacion(apd_dto.getIs_idUsuarioCreacion());
		ap_entidad.setIdUsuarioModificacion(apd_dto.getIs_idUsuarioModificacion());
		ap_entidad.setIpCreacion(apd_dto.getIs_ipCreacion());
		ap_entidad.setIpModificacion(apd_dto.getIs_ipModificacion());
		ap_entidad.setNombre(apd_dto.getIs_nombre());
		ap_entidad.setTipoVariable(apd_dto.getIs_tipoVariable());
		ap_entidad.setUnidadParametro(apd_dto.getIs_unidadParametro());
		ap_entidad.setValor(apd_dto.getIs_valor());
		ap_entidad.setValorParametroDefecto(apd_dto.getIs_valorParametroDefecto());
		ap_entidad.setValorMinimo(apd_dto.getIbi_valorMinimo());
		ap_entidad.setValorMaximo(apd_dto.getIbi_valorMaximo());
		ap_entidad.setEstereotipoCreacion(apd_dto.getIs_estereotipoCreacion());
		ap_entidad.setEstereotipoModificacion(apd_dto.getIs_estereotipoModificacion());
		return ap_entidad;
	}

	/**
	 * Metodo que convierte incluyendo relaciones Método que convierte un dto a una
	 * entidad usando todos los datos incluyendo relaciones.
	 *
	 * @param apd_dto    el parametro dto
	 * @param ap_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Parametro
	 */
	public static Parametro dtoAEntidadCompleto(ParametroDTO apd_dto, Parametro ap_entidad) {
		ap_entidad = dtoAEntidadSimple(apd_dto, ap_entidad);
		if (apd_dto.getItp_tipoProcesoDto() != null) {
			ap_entidad.setTipoProceso(new TipoProceso());
			ap_entidad.getTipoProceso().setId(apd_dto.getItp_tipoProcesoDto().getIs_id());
		}

		return ap_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Parametro
	 */
	public static List<Parametro> listaDtoAEntidadSimple(List<ParametroDTO> alpd_listaDto) {
		List<Parametro> llp_listaEntidades = new ArrayList<>();
		for (ParametroDTO lpd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadSimple(lpd_dto, null));
		}
		return llp_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alpd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Parametro
	 */
	public static List<Parametro> listaDtoAEntidadCompleto(List<ParametroDTO> alpd_listaDto) {
		List<Parametro> llp_listaEntidades = new ArrayList<>();
		for (ParametroDTO lpd_dto : alpd_listaDto) {
			llp_listaEntidades.add(dtoAEntidadCompleto(lpd_dto, null));
		}
		return llp_listaEntidades;
	}
	// --- fin to Entidad
}
