/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociarPersonaJuridicaBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AsociarPersonaJuridicaBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Asociar
 * persona juridica booleano. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociarPersonaJuridicaBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociarPersonaJuridicaBooleanoHelper.
	 */
	private AsociarPersonaJuridicaBooleanoHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Método que convierte de AsociacionUsuarioPersonaJuridicaBooleanoDTO a
	 * AsociacionUsuarioPersonaJuridicaDTO.
	 *
	 * @param aaupjb_asociacionUsuarioPersonajuridicaBooleanoDto el parametro
	 *                                                           asociacion usuario
	 *                                                           personajuridica
	 *                                                           booleano dto
	 * @return Resultado para booleano A dto simple retornado como
	 *         AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static AsociacionUsuarioPersonaJuridicaDTO booleanoADtoSimple(
			AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupjb_asociacionUsuarioPersonajuridicaBooleanoDto) {
		AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto = aaupjb_asociacionUsuarioPersonajuridicaBooleanoDto;
		laupj_asociacionUsuarioPersonaJuridicaDto.setIs_activo(
				EnumBoolean.buscarString(aaupjb_asociacionUsuarioPersonajuridicaBooleanoDto.getIb_estadoAsociacion())
						.getIs_codigo());
		return laupj_asociacionUsuarioPersonaJuridicaDto;
	}

	/**
	 * Método que convierte de AsociacionUsuarioPersonaJuridicaDTO a
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO.
	 *
	 * @param aaupj_asociacionUsuarioPersonaJuridicaDto el parametro asociacion
	 *                                                  usuario persona juridica dto
	 * @return Resultado para dto A booleano simple retornado como
	 *         AsociacionUsuarioPersonaJuridicaBooleanoDTO
	 */
	public static AsociacionUsuarioPersonaJuridicaBooleanoDTO dtoABooleanoSimple(
			AsociacionUsuarioPersonaJuridicaDTO aaupj_asociacionUsuarioPersonaJuridicaDto) {
		AsociacionUsuarioPersonaJuridicaBooleanoDTO laupjb_asociacionUsuarioPersonajuridicaBooleanoDto = new AsociacionUsuarioPersonaJuridicaBooleanoDTO(
				aaupj_asociacionUsuarioPersonaJuridicaDto);
		laupjb_asociacionUsuarioPersonajuridicaBooleanoDto.setIb_estadoAsociacion(
				EnumBoolean.buscarBooleano(aaupj_asociacionUsuarioPersonaJuridicaDto.getIs_activo()).getIb_valor());
		return laupjb_asociacionUsuarioPersonajuridicaBooleanoDto;
	}

	/**
	 * Método que convierte de una lista de
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO a una lista de
	 * AsociacionUsuarioPersonaJuridicaDTO.
	 *
	 * @param alaupjb_listaAsociarPersonaJuridicaBooleanoDto el parametro lista
	 *                                                       asociar persona
	 *                                                       juridica booleano dto
	 * @return Resultado para lista booleano A dto simple retornado como una lista
	 *         de AsociacionUsuarioPersonaJuridicaDTO
	 */
	public static List<AsociacionUsuarioPersonaJuridicaDTO> listaBooleanoADtoSimple(
			List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> alaupjb_listaAsociarPersonaJuridicaBooleanoDto) {
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaAsociacionUsuarioPersonaJuridicaDto = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridicaBooleanoDTO laupjb_asociacionUsuarioPersonaJuridicaBooleanoDto : alaupjb_listaAsociarPersonaJuridicaBooleanoDto) {
			llaupj_listaAsociacionUsuarioPersonaJuridicaDto
					.add(booleanoADtoSimple(laupjb_asociacionUsuarioPersonaJuridicaBooleanoDto));
		}
		return llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
	}

	/**
	 * Método que convierte de una lista de AsociacionUsuarioPersonaJuridicaDTO a
	 * una lista de AsociacionUsuarioPersonaJuridicaBooleanoDTO .
	 *
	 * @param alaupj_listaAsociarUsuarioPersonaJuridicaDto el parametro lista
	 *                                                     asociar usuario persona
	 *                                                     juridica dto
	 * @return Resultado para lista dto A booleano simple retornado como una lista
	 *         de AsociacionUsuarioPersonaJuridicaBooleanoDTO
	 */
	public static List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> listaDtoABooleanoSimple(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_listaAsociarUsuarioPersonaJuridicaDto) {
		List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> llaupjb_listaAsociarPersonaJuridicaBooleanoDto = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto : alaupj_listaAsociarUsuarioPersonaJuridicaDto) {
			llaupjb_listaAsociarPersonaJuridicaBooleanoDto
					.add(dtoABooleanoSimple(laupj_asociacionUsuarioPersonaJuridicaDto));
		}
		return llaupjb_listaAsociarPersonaJuridicaBooleanoDto;
	}
}
