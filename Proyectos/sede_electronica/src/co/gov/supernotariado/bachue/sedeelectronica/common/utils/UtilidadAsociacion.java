/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadAsociacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadAsociacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO;

/**
 * El elemento Class UtilidadAsociacion.<br>
 * Representa un/una utilidad asociacion.<br>
 * Clase con utilidades para obtener asociaciones de DTO especializadas de
 * personas juridicas o entidades especiales.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadAsociacion {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadAsociacion.
	 */
	private UtilidadAsociacion() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo encargado de cargar lista de persona juridica.
	 *
	 * @param alia_listaAsosiacionesDto el parametro lista asosiaciones dto
	 * @param aia_asosiacionDto         el parametro asosiacion dto
	 * @return Resultado para cargar lista persona juridica retornado como una lista
	 *         de IAsociacionesDTO
	 */
	public static List<IAsociacionesDTO> cargarListaPJ(List<IAsociacionesDTO> alia_listaAsosiacionesDto,
			List<AsociacionUsuarioPersonaJuridicaDTO> aia_asosiacionDto) {
		for (AsociacionUsuarioPersonaJuridicaDTO prueba : aia_asosiacionDto) {
			alia_listaAsosiacionesDto.add(prueba);
		}
		return alia_listaAsosiacionesDto;
	}

	/**
	 * Metodo encargado de cargar lista de entidad especial.
	 *
	 * @param alia_listaAsosiacionesDto el parametro lista asosiaciones dto
	 * @param aia_asosiacionDto         el parametro asosiacion dto
	 * @return Resultado para cargar lista entidad especial retornado como una lista
	 *         de IAsociacionesDTO
	 */
	public static List<IAsociacionesDTO> cargarListaEE(List<IAsociacionesDTO> alia_listaAsosiacionesDto,
			List<AsociacionUsuarioEntidadEspecialDTO> aia_asosiacionDto) {
		for (AsociacionUsuarioEntidadEspecialDTO prueba : aia_asosiacionDto) {
			alia_listaAsosiacionesDto.add(prueba);
		}
		return alia_listaAsosiacionesDto;
	}
}
