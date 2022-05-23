/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RangoTarifasAlertaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: RangoTarifasAlertaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RangoTarifasAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RangoTarifasAlerta;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Rango tarifas
 * alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RangoTarifasAlertaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase RangoTarifasAlertaHelper.
	 */
	private RangoTarifasAlertaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param arta_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         RangoTarifasAlertaDTO
	 */
	public static RangoTarifasAlertaDTO entidadADtoSimple(RangoTarifasAlerta arta_entidad) {
		RangoTarifasAlertaDTO lrtad_dto = new RangoTarifasAlertaDTO();
		lrtad_dto.setIs_id(arta_entidad.getId());
		lrtad_dto.setIs_activo(arta_entidad.getActivo());
		lrtad_dto.setId_fechaCreacion(arta_entidad.getFechaCreacion());
		lrtad_dto.setId_fechaModificacion(arta_entidad.getFechaModificacion());
		lrtad_dto.setIs_idUsuarioCreacion(arta_entidad.getIdUsuarioCreacion());
		lrtad_dto.setIs_idUsuarioModificacion(arta_entidad.getIdUsuarioModificacion());
		lrtad_dto.setIs_ipCreacion(arta_entidad.getIpCreacion());
		lrtad_dto.setIs_ipModificacion(arta_entidad.getIpModificacion());
		lrtad_dto.setIs_estereotipoCreacion(arta_entidad.getEstereotipoCreacion());
		lrtad_dto.setIs_estereotipoModificacion(arta_entidad.getEstereotipoModificacion());
		return lrtad_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alrta_listaEntidad el parametro lista entidad
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         RangoTarifasAlertaDTO
	 */
	public static List<RangoTarifasAlertaDTO> listaEntidadADtoSimple(List<RangoTarifasAlerta> alrta_listaEntidad) {
		List<RangoTarifasAlertaDTO> llrtad_listaDto = new ArrayList<>();
		for (RangoTarifasAlerta lrta_entidad : alrta_listaEntidad) {
			llrtad_listaDto.add(entidadADtoSimple(lrta_entidad));
		}
		return llrtad_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param artad_dto    el parametro dto
	 * @param arta_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como RangoTarifasAlerta
	 */
	public static RangoTarifasAlerta dtoAEntidadSimple(RangoTarifasAlertaDTO artad_dto,
			RangoTarifasAlerta arta_entidad) {
		if (null == arta_entidad) {
			arta_entidad = new RangoTarifasAlerta();
		}
		arta_entidad.setActivo(artad_dto.getIs_activo());
		arta_entidad.setId(artad_dto.getIs_id());
		arta_entidad.setFechaCreacion(artad_dto.getId_fechaCreacion());
		arta_entidad.setFechaModificacion(artad_dto.getId_fechaModificacion());
		arta_entidad.setIdUsuarioCreacion(artad_dto.getIs_idUsuarioCreacion());
		arta_entidad.setIdUsuarioModificacion(artad_dto.getIs_idUsuarioModificacion());
		arta_entidad.setIpCreacion(artad_dto.getIs_ipCreacion());
		arta_entidad.setIpModificacion(artad_dto.getIs_ipModificacion());
		arta_entidad.setEstereotipoCreacion(artad_dto.getIs_estereotipoCreacion());
		arta_entidad.setEstereotipoModificacion(artad_dto.getIs_estereotipoModificacion());
		return arta_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alrtad_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         RangoTarifasAlerta
	 */
	public static List<RangoTarifasAlerta> listaDtoAEntidadSimple(List<RangoTarifasAlertaDTO> alrtad_listaDto) {
		List<RangoTarifasAlerta> llrta_listaEntidad = new ArrayList<>();
		for (RangoTarifasAlertaDTO lrtad_dto : alrtad_listaDto) {
			llrta_listaEntidad.add(dtoAEntidadSimple(lrtad_dto, null));
		}
		return llrta_listaEntidad;
	}
	// --- fin to Entidad
}
