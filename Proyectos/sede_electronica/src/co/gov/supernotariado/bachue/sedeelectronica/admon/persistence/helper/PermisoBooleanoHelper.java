/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: PermisoBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Permiso
 * booleano. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PermisoBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoBooleanoHelper.
	 */
	private PermisoBooleanoHelper() {
		// Constructor vacio de la clase
	}

	// --- to PermisoDTO
	/**
	 * Metodo que convierte de PermisoBooleanoDTO a PermisoDTO.
	 *
	 * @param apb_permisoBooleanoDto el parametro permiso booleano dto
	 * @return Resultado para booleano A dto simple retornado como PermisoDTO
	 */
	public static PermisoDTO booleanoADtoSimple(PermisoBooleanoDTO apb_permisoBooleanoDto) {
		PermisoDTO lp_permisoDto = apb_permisoBooleanoDto;
		lp_permisoDto.setIs_activo(EnumBoolean.buscarString(apb_permisoBooleanoDto.getIb_activo()).getIs_codigo());
		lp_permisoDto.setIs_activoPorDefecto(
				EnumBoolean.buscarString(apb_permisoBooleanoDto.getIb_activoPorDefecto()).getIs_codigo());
		return lp_permisoDto;
	}

	/**
	 * Metodo que convierte de PermisoDTO a PermisoBooleanoDTO.
	 *
	 * @param ap_permisoDto el parametro permiso dto
	 * @return Resultado para dto A booleano simple retornado como
	 *         PermisoBooleanoDTO
	 */
	public static PermisoBooleanoDTO dtoABooleanoSimple(PermisoDTO ap_permisoDto) {
		PermisoBooleanoDTO lpb_permisoBooleanoDto = new PermisoBooleanoDTO(ap_permisoDto);
		lpb_permisoBooleanoDto.setIb_activo(EnumBoolean.buscarBooleano(ap_permisoDto.getIs_activo()).getIb_valor());
		lpb_permisoBooleanoDto.setIb_activoPorDefecto(
				EnumBoolean.buscarBooleano(ap_permisoDto.getIs_activoPorDefecto()).getIb_valor());
		return lpb_permisoBooleanoDto;
	}

	/**
	 * Metodo que convierte de una lista de PermisoBooleanoDTO a una lista de
	 * PermisoDTO.
	 *
	 * @param alpb_listaPermisoBooleanoDto el parametro lista permiso booleano dto
	 * @return Resultado para lista booleano A dto simple retornado como una lista
	 *         de PermisoDTO
	 */
	public static List<PermisoDTO> listaBooleanoADtoSimple(List<PermisoBooleanoDTO> alpb_listaPermisoBooleanoDto) {
		List<PermisoDTO> llp_listaPermisoDto = new ArrayList<>();
		for (PermisoBooleanoDTO lpb_permisoBooleanoDto : alpb_listaPermisoBooleanoDto) {
			llp_listaPermisoDto.add(booleanoADtoSimple(lpb_permisoBooleanoDto));
		}
		return llp_listaPermisoDto;
	}

	/**
	 * Metodo que convierte de una lista de PermisoDTO a una lista de
	 * PermisoBooleanoDTO .
	 *
	 * @param alp_listaPermisoDto el parametro lista permiso dto
	 * @return Resultado para lista dto A booleano simple retornado como una lista
	 *         de PermisoBooleanoDTO
	 */
	public static List<PermisoBooleanoDTO> listaDtoABooleanoSimple(List<PermisoDTO> alp_listaPermisoDto) {
		List<PermisoBooleanoDTO> llpb_listaPermisoBooleanoDto = new ArrayList<>();
		for (PermisoDTO lp_permisoDto : alp_listaPermisoDto) {
			llpb_listaPermisoBooleanoDto.add(dtoABooleanoSimple(lp_permisoDto));
		}
		return llpb_listaPermisoBooleanoDto;
	}

}
