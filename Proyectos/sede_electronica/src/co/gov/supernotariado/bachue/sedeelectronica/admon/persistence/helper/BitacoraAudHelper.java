/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BitacoraAudHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: BitacoraAudHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BitacoraAudDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Accion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.BitacoraAud;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Bitacora aud.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BitacoraAudHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase BitacoraAudHelper.
	 */
	private BitacoraAudHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Método que convierte de entidad a dto.
	 *
	 * @param ab_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como BitacoraAudDTO
	 */
	public static BitacoraAudDTO entidadADtoSimple(BitacoraAud ab_entidad) {
		BitacoraAudDTO lbad_dto = new BitacoraAudDTO();
		lbad_dto.setIs_id(ab_entidad.getId());
		lbad_dto.setIs_campo(ab_entidad.getCampo());
		lbad_dto.setId_fechaCreacion(ab_entidad.getFechaCreacion());
		lbad_dto.setId_fechaModificacion(ab_entidad.getFechaModificacion());
		lbad_dto.setIs_idAccion(ab_entidad.getIdAccion());
		lbad_dto.setIs_idUsuario(ab_entidad.getIdUsuario());
		lbad_dto.setIs_idUsuarioCreacion(ab_entidad.getIdUsuarioCreacion());
		lbad_dto.setIs_idUsuarioModificacion(ab_entidad.getIdUsuarioModificacion());
		lbad_dto.setIs_ipCreacion(ab_entidad.getIpCreacion());
		lbad_dto.setIs_ipModificacion(ab_entidad.getIpModificacion());
		lbad_dto.setId_fecha(ab_entidad.getFecha());
		lbad_dto.setIs_llave1(ab_entidad.getLlave1());
		lbad_dto.setIs_llave2(ab_entidad.getLlave2());
		lbad_dto.setIs_llave3(ab_entidad.getLlave3());
		lbad_dto.setIs_llave4(ab_entidad.getLlave4());
		lbad_dto.setIs_llave5(ab_entidad.getLlave5());
		lbad_dto.setIs_nombreTabla(ab_entidad.getNombreTabla());
		lbad_dto.setIs_valorFinal(ab_entidad.getValorFinal());
		lbad_dto.setIb_valorFinalBlob(ab_entidad.getValorFinalBlob());
		lbad_dto.setIs_valorFinalClob(ab_entidad.getValorFinalClob());
		lbad_dto.setIs_valorInicial(ab_entidad.getValorInicial());
		lbad_dto.setIb_valorInicialBlob(ab_entidad.getValorInicialBlob());
		lbad_dto.setIs_valorInicialClob(ab_entidad.getValorInicialClob());

		return lbad_dto;
	}

	/**
	 * Método que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ab_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como BitacoraAudDTO
	 */
	public static BitacoraAudDTO entidadADtoCompleto(BitacoraAud ab_entidad) {
		BitacoraAudDTO lbad_dto = entidadADtoSimple(ab_entidad);
		if (ab_entidad.getAccion() != null)
			lbad_dto.setIa_accionDto(AccionHelper.entidadADtoSimple(ab_entidad.getAccion()));
		if (ab_entidad.getUsuario() != null)
			lbad_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoSimple(ab_entidad.getUsuario()));

		return lbad_dto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alba_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         BitacoraAudDTO
	 */
	public static List<BitacoraAudDTO> listaEntidadADtoSimple(List<BitacoraAud> alba_listaEntidades) {
		List<BitacoraAudDTO> llbad_listaDto = new ArrayList<>();
		for (BitacoraAud lb_entidad : alba_listaEntidades) {
			llbad_listaDto.add(entidadADtoSimple(lb_entidad));
		}
		return llbad_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alba_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de BitacoraAudDTO
	 */
	public static List<BitacoraAudDTO> listaEntidadADtoCompleto(List<BitacoraAud> alba_listaEntidades) {
		List<BitacoraAudDTO> llbad_listaDto = new ArrayList<>();
		for (BitacoraAud lb_entidad : alba_listaEntidades) {
			llbad_listaDto.add(entidadADtoCompleto(lb_entidad));
		}
		return llbad_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Método que convierte un dto a una entidad.
	 *
	 * @param abad_dto   el parametro dto
	 * @param ab_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como BitacoraAud
	 */
	public static BitacoraAud dtoAEntidadSimple(BitacoraAudDTO abad_dto, BitacoraAud ab_entidad) {
		if (null == ab_entidad) {
			ab_entidad = new BitacoraAud();
		}
		ab_entidad.setId(abad_dto.getIs_id());
		ab_entidad.setCampo(abad_dto.getIs_campo());
		ab_entidad.setFecha(abad_dto.getId_fecha());
		ab_entidad.setFechaCreacion(abad_dto.getId_fechaCreacion());
		ab_entidad.setFechaModificacion(abad_dto.getId_fechaModificacion());
		ab_entidad.setIdAccion(abad_dto.getIs_idAccion());
		ab_entidad.setIdUsuario(abad_dto.getIs_idUsuario());
		ab_entidad.setIdUsuarioCreacion(abad_dto.getIs_idUsuarioCreacion());
		ab_entidad.setIdUsuarioModificacion(abad_dto.getIs_idUsuarioModificacion());
		ab_entidad.setIpCreacion(abad_dto.getIs_ipCreacion());
		ab_entidad.setIpModificacion(abad_dto.getIs_ipModificacion());
		ab_entidad.setLlave1(abad_dto.getIs_llave1());
		ab_entidad.setLlave2(abad_dto.getIs_llave2());
		ab_entidad.setLlave3(abad_dto.getIs_llave3());
		ab_entidad.setLlave4(abad_dto.getIs_llave4());
		ab_entidad.setLlave5(abad_dto.getIs_llave5());
		ab_entidad.setNombreTabla(abad_dto.getIs_nombreTabla());
		ab_entidad.setValorFinal(abad_dto.getIs_valorFinal());
		ab_entidad.setValorFinalBlob(abad_dto.getIb_valorFinalBlob());
		ab_entidad.setValorFinalClob(abad_dto.getIs_valorFinalClob());
		ab_entidad.setValorInicial(abad_dto.getIs_valorInicial());
		ab_entidad.setValorInicialBlob(abad_dto.getIb_valorInicialBlob());
		ab_entidad.setValorInicialClob(abad_dto.getIs_valorInicialClob());

		return ab_entidad;
	}

	/**
	 * Método que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param abad_dto   el parametro dto
	 * @param ab_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como BitacoraAud
	 */
	public static BitacoraAud dtoAEntidadCompleto(BitacoraAudDTO abad_dto, BitacoraAud ab_entidad) {
		ab_entidad = dtoAEntidadSimple(abad_dto, ab_entidad);
		if (abad_dto.getIa_accionDto() != null) {
			ab_entidad.setAccion(new Accion());
			ab_entidad.getAccion().setId(abad_dto.getIa_accionDto().getIs_id());
		}
		if (abad_dto.getIu_usuarioDto() != null) {
			ab_entidad.setUsuario(new Usuario());
			ab_entidad.getUsuario().setId(abad_dto.getIu_usuarioDto().getIs_id());
		}

		return ab_entidad;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades.
	 *
	 * @param albad_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         BitacoraAud
	 */
	public static List<BitacoraAud> listaDtoAEntidadSimple(List<BitacoraAudDTO> albad_listaDto) {
		List<BitacoraAud> llba_listaEntidades = new ArrayList<>();
		for (BitacoraAudDTO lbad_dto : albad_listaDto) {
			llba_listaEntidades.add(dtoAEntidadSimple(lbad_dto, null));
		}
		return llba_listaEntidades;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param albad_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de BitacoraAud
	 */
	public static List<BitacoraAud> listaDtoAEntidadCompleto(List<BitacoraAudDTO> albad_listaDto) {
		List<BitacoraAud> llba_listaEntidades = new ArrayList<>();
		for (BitacoraAudDTO lbad_dto : albad_listaDto) {
			llba_listaEntidades.add(dtoAEntidadCompleto(lbad_dto, null));
		}
		return llba_listaEntidades;
	}
	// --- fin to Entidad
}
