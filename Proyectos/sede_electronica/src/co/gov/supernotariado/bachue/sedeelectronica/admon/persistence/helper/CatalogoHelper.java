/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CatalogoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: CatalogoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Catalogo.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalogoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase CatalogoHelper.
	 */
	private CatalogoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Método que convierte de entidad a DTO.
	 *
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como CatalogoDTO
	 */
	public static CatalogoDTO entidadADtoSimple(Catalogo ac_entidad) {
		CatalogoDTO lcd_dto = new CatalogoDTO();
		lcd_dto.setIs_id(ac_entidad.getId());
		lcd_dto.setIs_activo(ac_entidad.getActivo());
		lcd_dto.setIs_codigoValor(ac_entidad.getCodigoValor());
		lcd_dto.setIs_nombre(ac_entidad.getNombre());
		lcd_dto.setIs_descripcion(ac_entidad.getDescripcion());
		lcd_dto.setId_fechaCreacion(ac_entidad.getFechaCreacion());
		lcd_dto.setId_fechaModificacion(ac_entidad.getFechaModificacion());
		lcd_dto.setIs_idUsuarioCreacion(ac_entidad.getIdUsuarioCreacion());
		lcd_dto.setIs_idUsuarioModificacion(ac_entidad.getIdUsuarioModificacion());
		lcd_dto.setIs_ipCreacion(ac_entidad.getIpCreacion());
		lcd_dto.setIs_ipModificacion(ac_entidad.getIpModificacion());
		lcd_dto.setIs_estereotipoCreacion(ac_entidad.getEstereotipoCreacion());
		lcd_dto.setIs_estereotipoModificacion(ac_entidad.getEstereotipoModificacion());
		return lcd_dto;
	}

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como CatalogoDTO
	 */
	public static CatalogoDTO entidadADtoCompleto(Catalogo ac_entidad) {
		CatalogoDTO lcd_dto = entidadADtoSimple(ac_entidad);
		if (ac_entidad.getTipoCatalogo() != null)
			lcd_dto.setItc_tipoCatalogoDto(TipoCatalogoHelper.entidadADtoSimple(ac_entidad.getTipoCatalogo()));

		return lcd_dto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO.
	 *
	 * @param alc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         CatalogoDTO
	 */
	public static List<CatalogoDTO> listaEntidadADtoSimple(List<Catalogo> alc_listaEntidades) {
		List<CatalogoDTO> llc_listaDto = new ArrayList<>();
		for (Catalogo lc_entidad : alc_listaEntidades) {
			llc_listaDto.add(entidadADtoSimple(lc_entidad));
		}
		return llc_listaDto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alc_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de CatalogoDTO
	 */
	public static List<CatalogoDTO> listaEntidadADtoCompleto(List<Catalogo> alc_listaEntidades) {
		List<CatalogoDTO> llc_listaDto = new ArrayList<>();
		for (Catalogo lc_entidad : alc_listaEntidades) {
			llc_listaDto.add(entidadADtoCompleto(lc_entidad));
		}
		return llc_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Método que convierte un DTO a una entidad.
	 *
	 * @param acd_dto    el parametro dto
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Catalogo
	 */
	public static Catalogo dtoAEntidadSimple(CatalogoDTO acd_dto, Catalogo ac_entidad) {
		if (null == ac_entidad) {
			ac_entidad = new Catalogo();
		}
		ac_entidad.setId(acd_dto.getIs_id());
		ac_entidad.setActivo(acd_dto.getIs_activo());
		ac_entidad.setCodigoValor(acd_dto.getIs_codigoValor());
		ac_entidad.setDescripcion(acd_dto.getIs_descripcion());
		ac_entidad.setFechaCreacion(acd_dto.getId_fechaCreacion());
		ac_entidad.setFechaModificacion(acd_dto.getId_fechaModificacion());
		ac_entidad.setIdUsuarioCreacion(acd_dto.getIs_idUsuarioCreacion());
		ac_entidad.setIdUsuarioModificacion(acd_dto.getIs_idUsuarioModificacion());
		ac_entidad.setIpCreacion(acd_dto.getIs_ipCreacion());
		ac_entidad.setIpModificacion(acd_dto.getIs_ipModificacion());
		ac_entidad.setNombre(acd_dto.getIs_nombre());
		ac_entidad.setEstereotipoCreacion(acd_dto.getIs_estereotipoCreacion());
		ac_entidad.setEstereotipoModificacion(acd_dto.getIs_estereotipoModificacion());
		return ac_entidad;
	}

	/**
	 * Método que convierte un DTO a una entidad incluyendo relaciones.
	 *
	 * @param acd_dto    el parametro dto
	 * @param ac_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Catalogo
	 */
	public static Catalogo dtoAEntidadCompleto(CatalogoDTO acd_dto, Catalogo ac_entidad) {
		ac_entidad = dtoAEntidadSimple(acd_dto, ac_entidad);
		if (acd_dto.getItc_tipoCatalogoDto() != null) {
			ac_entidad.setTipoCatalogo(new TipoCatalogo());
			ac_entidad.getTipoCatalogo().setId(acd_dto.getItc_tipoCatalogoDto().getIs_id());
		}

		return ac_entidad;
	}

	/**
	 * Método que convierte una lista DTO a una lista de entidades.
	 *
	 * @param alcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Catalogo
	 */
	public static List<Catalogo> listaDtoAEntidadSimple(List<CatalogoDTO> alcd_listaDto) {
		List<Catalogo> llc_listaEntidades = new ArrayList<>();
		for (CatalogoDTO lcd_dto : alcd_listaDto) {
			llc_listaEntidades.add(dtoAEntidadSimple(lcd_dto, null));
		}
		return llc_listaEntidades;
	}

	/**
	 * Método que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param alcd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Catalogo
	 */
	public static List<Catalogo> listaDtoAEntidadCompleto(List<CatalogoDTO> alcd_listaDto) {
		List<Catalogo> llc_listaEntidades = new ArrayList<>();
		for (CatalogoDTO lcd_dto : alcd_listaDto) {
			llc_listaEntidades.add(dtoAEntidadCompleto(lcd_dto, null));
		}
		return llc_listaEntidades;
	}
	// --- fin to Entidad
}
