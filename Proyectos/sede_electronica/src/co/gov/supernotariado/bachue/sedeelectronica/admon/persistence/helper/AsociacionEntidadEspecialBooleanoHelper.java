/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionEntidadEspecialBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AsociacionEntidadEspecialBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Asociacion
 * entidad especial booleano. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionEntidadEspecialBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionEntidadEspecialBooleanoHelper.
	 */
	private AsociacionEntidadEspecialBooleanoHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Método que convierte de AsociacionUsuarioEntidadEspecialBooleanoDTO a
	 * AsociacionUsuarioEntidadEspecialDTO.
	 *
	 * @param aaueeb_asociacionUsuarioEntidadEspecialBooleanDto el parametro
	 *                                                          asociacion usuario
	 *                                                          entidad especial
	 *                                                          boolean dto
	 * @return Resultado para booleano A dto simple retornado como
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public static AsociacionUsuarioEntidadEspecialDTO booleanoADtoSimple(
			AsociacionUsuarioEntidadEspecialBooleanoDTO aaueeb_asociacionUsuarioEntidadEspecialBooleanDto) {
		AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto = aaueeb_asociacionUsuarioEntidadEspecialBooleanDto;
		lauee_asociacionUsuarioEntidadEspecialDto.setIs_estado(
				EnumBoolean.buscarString(aaueeb_asociacionUsuarioEntidadEspecialBooleanDto.getIb_estadoAsociacion())
						.getIs_codigo());
		return lauee_asociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Método que convierte de AsociacionUsuarioEntidadEspecialDTO a
	 * AsociacionUsuarioEntidadEspecialBooleanoDTO.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialDto el parametro asociacion
	 *                                                  usuario entidad especial dto
	 * @return Resultado para dto A booleano simple retornado como
	 *         AsociacionUsuarioEntidadEspecialBooleanoDTO
	 */
	public static AsociacionUsuarioEntidadEspecialBooleanoDTO dtoABooleanoSimple(
			AsociacionUsuarioEntidadEspecialDTO aauee_asociacionUsuarioEntidadEspecialDto) {
		AsociacionUsuarioEntidadEspecialBooleanoDTO laueeb_asociarEntidadEspecialBooleanoDto = new AsociacionUsuarioEntidadEspecialBooleanoDTO(
				aauee_asociacionUsuarioEntidadEspecialDto);
		laueeb_asociarEntidadEspecialBooleanoDto.setIb_estadoAsociacion(
				EnumBoolean.buscarBooleano(aauee_asociacionUsuarioEntidadEspecialDto.getIs_estado()).getIb_valor());
		return laueeb_asociarEntidadEspecialBooleanoDto;
	}

	/**
	 * Método que convierte de una lista de
	 * AsociacionUsuarioEntidadEspecialBooleanoDTO a una lista de
	 * AsociacionUsuarioEntidadEspecialDTO.
	 *
	 * @param alaueeb_listaAsociarEntidadEspecialBooleanoDto el parametro lista
	 *                                                       asociar entidad
	 *                                                       especial booleano dto
	 * @return Resultado para lista booleano A dto simple retornado como una lista
	 *         de AsociacionUsuarioEntidadEspecialDTO
	 */
	public static List<AsociacionUsuarioEntidadEspecialDTO> listaBooleanoADtoSimple(
			List<AsociacionUsuarioEntidadEspecialBooleanoDTO> alaueeb_listaAsociarEntidadEspecialBooleanoDto) {
		List<AsociacionUsuarioEntidadEspecialDTO> llauee_listaAsociacionUsuarioEntidadEspecialDto = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecialBooleanoDTO laueeb_asociacionUsuarioEntidadEspecialBooleanoDto : alaueeb_listaAsociarEntidadEspecialBooleanoDto) {
			llauee_listaAsociacionUsuarioEntidadEspecialDto
					.add(booleanoADtoSimple(laueeb_asociacionUsuarioEntidadEspecialBooleanoDto));
		}
		return llauee_listaAsociacionUsuarioEntidadEspecialDto;
	}

	/**
	 * Método que convierte de una lista de AsociacionUsuarioEntidadEspecialDTO a
	 * una lista de AsociacionUsuarioEntidadEspecialBooleanoDTO .
	 *
	 * @param alauee_listaAsociarUsuarioEntidadEspecialDto el parametro lista
	 *                                                     asociar usuario entidad
	 *                                                     especial dto
	 * @return Resultado para lista dto A booleano simple retornado como una lista
	 *         de AsociacionUsuarioEntidadEspecialBooleanoDTO
	 */
	public static List<AsociacionUsuarioEntidadEspecialBooleanoDTO> listaDtoABooleanoSimple(
			List<AsociacionUsuarioEntidadEspecialDTO> alauee_listaAsociarUsuarioEntidadEspecialDto) {
		List<AsociacionUsuarioEntidadEspecialBooleanoDTO> llaueeb_listaAsociarEntidadEspecialBooleanoDto = new ArrayList<>();
		for (AsociacionUsuarioEntidadEspecialDTO lauee_asociacionUsuarioEntidadEspecialDto : alauee_listaAsociarUsuarioEntidadEspecialDto) {
			llaueeb_listaAsociarEntidadEspecialBooleanoDto
					.add(dtoABooleanoSimple(lauee_asociacionUsuarioEntidadEspecialDto));
		}
		return llaueeb_listaAsociarEntidadEspecialBooleanoDto;
	}
}
