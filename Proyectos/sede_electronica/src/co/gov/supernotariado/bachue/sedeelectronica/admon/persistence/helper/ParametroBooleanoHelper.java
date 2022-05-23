/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ParametroBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Parametro
 * booleano. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ParametroBooleanoHelper.
	 */
	private ParametroBooleanoHelper() {
		// Constructor vacio de la clase
	}

	// --- to BOOLEANO DTO
	/**
	 * Metodo que convierte de dto a dto booleano.
	 *
	 * @param ap_parametroDto el parametro parametro dto
	 * @return Resultado para dto A booleano dto retornado como ParametroBooleanoDTO
	 */
	public static ParametroBooleanoDTO dtoABooleanoDto(ParametroDTO ap_parametroDto) {
		ParametroBooleanoDTO lpb_parametroBooleanoDto = new ParametroBooleanoDTO(ap_parametroDto);
		lpb_parametroBooleanoDto
				.setIb_activo(EnumBoolean.buscarBooleano(lpb_parametroBooleanoDto.getIs_activo()).getIb_valor());
		lpb_parametroBooleanoDto
				.setIb_editable(EnumBoolean.buscarBooleano(lpb_parametroBooleanoDto.getIs_editable()).getIb_valor());
		return lpb_parametroBooleanoDto;
	}

	/**
	 * Metodo que convierte de una lista de parametros dto a una lista de parametros
	 * booleanos dto.
	 *
	 * @param alp_listaParametroDto el parametro lista parametro dto
	 * @return Resultado para lista dto A booleano dto retornado como una lista de
	 *         ParametroBooleanoDTO
	 */
	public static List<ParametroBooleanoDTO> listaDtoABooleanoDto(List<ParametroDTO> alp_listaParametroDto) {
		List<ParametroBooleanoDTO> llpb_listaParametroBooleanoDto = new ArrayList<>();
		for (ParametroDTO lp_parametroDto : alp_listaParametroDto) {
			llpb_listaParametroBooleanoDto.add(dtoABooleanoDto(lp_parametroDto));
		}
		return llpb_listaParametroBooleanoDto;
	}

	// --- fin to BOOLEANO DTO
	// --- to DTO
	/**
	 * Metodo que convierte de un ParametroBooleanoDTO a un ParametroDTO .
	 *
	 * @param apb_parametroBooleanoDto el parametro parametro booleano dto
	 * @return Resultado para booleano dto A dto retornado como ParametroDTO
	 */
	public static ParametroDTO booleanoDtoADto(ParametroBooleanoDTO apb_parametroBooleanoDto) {
		apb_parametroBooleanoDto
				.setIs_activo(EnumBoolean.buscarString(apb_parametroBooleanoDto.getIb_activo()).getIs_codigo());
		apb_parametroBooleanoDto
				.setIs_editable(EnumBoolean.buscarString(apb_parametroBooleanoDto.getIb_editable()).getIs_codigo());
		ParametroDTO lp_parametroDto;
		lp_parametroDto = apb_parametroBooleanoDto;
		return lp_parametroDto;
	}

	/**
	 * Metodo que convierte una lista booleano dto a una lista de dto.
	 *
	 * @param alpb_listaParametroBooleanoDto el parametro lista parametro booleano
	 *                                       dto
	 * @return Resultado para lista booleano dto A dto retornado como una lista de
	 *         ParametroDTO
	 */
	public static List<ParametroDTO> listaBooleanoDtoADto(List<ParametroBooleanoDTO> alpb_listaParametroBooleanoDto) {
		List<ParametroDTO> llp_listaParametrosDto = new ArrayList<>();
		for (ParametroBooleanoDTO lpb_parametroBooleanoDto : alpb_listaParametroBooleanoDto) {
			llp_listaParametrosDto.add(booleanoDtoADto(lpb_parametroBooleanoDto));
		}
		return llp_listaParametrosDto;
	}
	// --- fin to DTO
}
