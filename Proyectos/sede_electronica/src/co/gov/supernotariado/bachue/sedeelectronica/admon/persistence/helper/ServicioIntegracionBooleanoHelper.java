/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioIntegracionBooleanoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ServicioIntegracionBooleanoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Servicio
 * integracion booleano. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioIntegracionBooleanoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ServicioIntegracionBooleanoHelper.
	 */
	private ServicioIntegracionBooleanoHelper() {
		// Constructor vacio de la clase
	}

	// --- to ServicioIntegracionDTO
	/**
	 * Metodo que convierte de ServicioIntegracionBooleanoDTO a
	 * ServicioIntegracionDTO.
	 *
	 * @param asib_servicioIntegracionBooleanoDto el parametro servicio integracion
	 *                                            booleano dto
	 * @return Resultado para booleano A dto simple retornado como
	 *         ServicioIntegracionDTO
	 */
	public static ServicioIntegracionDTO booleanoADtoSimple(
			ServicioIntegracionBooleanoDTO asib_servicioIntegracionBooleanoDto) {
		ServicioIntegracionDTO lsi_servicioIntegracionDto = asib_servicioIntegracionBooleanoDto;
		lsi_servicioIntegracionDto.setIs_activo(
				EnumBoolean.buscarString(asib_servicioIntegracionBooleanoDto.getIb_activo()).getIs_codigo());
		return lsi_servicioIntegracionDto;
	}

	/**
	 * Metodo que convierte de ServicioIntegracionDTO a
	 * ServicioIntegracionBooleanoDTO.
	 *
	 * @param asi_servicioIntegracionDto el parametro servicio integracion dto
	 * @return Resultado para dto A booleano simple retornado como
	 *         ServicioIntegracionBooleanoDTO
	 */
	public static ServicioIntegracionBooleanoDTO dtoABooleanoSimple(ServicioIntegracionDTO asi_servicioIntegracionDto) {
		ServicioIntegracionBooleanoDTO lsib_servicioIntegracionBooleanoDto = new ServicioIntegracionBooleanoDTO(
				asi_servicioIntegracionDto);
		lsib_servicioIntegracionBooleanoDto
				.setIb_activo(EnumBoolean.buscarBooleano(asi_servicioIntegracionDto.getIs_activo()).getIb_valor());
		return lsib_servicioIntegracionBooleanoDto;
	}

	/**
	 * Metodo que convierte de una lista de ServicioIntegracionBooleanoDTO a una
	 * lista de ServicioIntegracionDTO.
	 *
	 * @param alsib_listaServicioIntegracionBooleanoDTO el parametro lista servicio
	 *                                                  integracion booleano DTO
	 * @return Resultado para lista booleano A dto simple retornado como una lista
	 *         de ServicioIntegracionDTO
	 */
	public static List<ServicioIntegracionDTO> listaBooleanoADtoSimple(
			List<ServicioIntegracionBooleanoDTO> alsib_listaServicioIntegracionBooleanoDTO) {
		List<ServicioIntegracionDTO> llsi_servicioIntegracionDto = new ArrayList<>();
		for (ServicioIntegracionBooleanoDTO lrb_ServicioIntegracionBooleanoDTO : alsib_listaServicioIntegracionBooleanoDTO) {
			llsi_servicioIntegracionDto.add(booleanoADtoSimple(lrb_ServicioIntegracionBooleanoDTO));
		}
		return llsi_servicioIntegracionDto;
	}

	/**
	 * Metodo que convierte de una lista de ServicioIntegracionDTO a una lista de
	 * ServicioIntegracionBooleanoDTO.
	 *
	 * @param alsi_servicioIntegracionDto el parametro servicio integracion dto
	 * @return Resultado para lista dto A booleano simple retornado como una lista
	 *         de ServicioIntegracionBooleanoDTO
	 */
	public static List<ServicioIntegracionBooleanoDTO> listaDtoABooleanoSimple(
			List<ServicioIntegracionDTO> alsi_servicioIntegracionDto) {
		List<ServicioIntegracionBooleanoDTO> llsib_listaServicioIntegracionBooleanoDTO = new ArrayList<>();
		for (ServicioIntegracionDTO lsi_servicioIntegracionDto : alsi_servicioIntegracionDto) {
			llsib_listaServicioIntegracionBooleanoDTO.add(dtoABooleanoSimple(lsi_servicioIntegracionDto));
		}
		return llsib_listaServicioIntegracionBooleanoDTO;
	}
}
