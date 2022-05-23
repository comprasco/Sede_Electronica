/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: RolBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Rol booleano.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase RolBooleanoHelper.
	 */
	private RolBooleanoHelper() {
		// Constructor vacio de la clase
	}

	// --- to RolDTO
	/**
	 * Metodo que convierte de RolBooleanoDTO a RolDTO.
	 *
	 * @param arb_rolBooleanoDto el parametro rol booleano dto
	 * @return Resultado para booleano A dto simple retornado como RolDTO
	 */
	public static RolDTO booleanoADtoSimple(RolBooleanoDTO arb_rolBooleanoDto) {
		RolDTO lr_rolDto = arb_rolBooleanoDto;
		lr_rolDto.setIs_activo(EnumBoolean.buscarString(arb_rolBooleanoDto.getIb_activo()).getIs_codigo());
		lr_rolDto.setIs_activoPorDefecto(
				EnumBoolean.buscarString(arb_rolBooleanoDto.getIb_activoPorDefecto()).getIs_codigo());
		return lr_rolDto;
	}

	/**
	 * Metodo que convierte de RolDTO a RolBooleanoDTO.
	 *
	 * @param ar_rolDto el parametro rol dto
	 * @return Resultado para dto A booleano simple retornado como RolBooleanoDTO
	 */
	public static RolBooleanoDTO dtoABooleanoSimple(RolDTO ar_rolDto) {
		RolBooleanoDTO lrb_rolBooleanoDto = new RolBooleanoDTO(ar_rolDto);
		lrb_rolBooleanoDto.setIb_activo(EnumBoolean.buscarBooleano(ar_rolDto.getIs_activo()).getIb_valor());
		lrb_rolBooleanoDto
				.setIb_activoPorDefecto(EnumBoolean.buscarBooleano(ar_rolDto.getIs_activoPorDefecto()).getIb_valor());
		return lrb_rolBooleanoDto;
	}

	/**
	 * Metodo que convierte de una lista de RolBooleanoDTO a una lista de RolDTO.
	 *
	 * @param alrb_listaRolBooleanoDto el parametro lista rol booleano dto
	 * @return Resultado para lista booleano A dto simple retornado como una lista
	 *         de RolDTO
	 */
	public static List<RolDTO> listaBooleanoADtoSimple(List<RolBooleanoDTO> alrb_listaRolBooleanoDto) {
		List<RolDTO> llp_listaRolDto = new ArrayList<>();
		for (RolBooleanoDTO lrb_rolBooleanoDto : alrb_listaRolBooleanoDto) {
			llp_listaRolDto.add(booleanoADtoSimple(lrb_rolBooleanoDto));
		}
		return llp_listaRolDto;
	}

	/**
	 * Metodo que convierte de una lista de RolDTO a una lista de RolBooleanoDTO.
	 *
	 * @param alr_listaRolDto el parametro lista rol dto
	 * @return Resultado para lista dto A booleano simple retornado como una lista
	 *         de RolBooleanoDTO
	 */
	public static List<RolBooleanoDTO> listaDtoABooleanoSimple(List<RolDTO> alr_listaRolDto) {
		List<RolBooleanoDTO> llpb_listaRolBooleanoDto = new ArrayList<>();
		for (RolDTO lr_rolDto : alr_listaRolDto) {
			llpb_listaRolBooleanoDto.add(dtoABooleanoSimple(lr_rolDto));
		}
		return llpb_listaRolBooleanoDto;
	}
}
