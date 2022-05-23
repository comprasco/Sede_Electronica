/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrosDinamicosAlcaldiaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ParametrosDinamicosAlcaldiaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrosDinamicosAlcaldiaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrosDinamicosAlcaldia;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Parametros
 * dinamicos alcaldia. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametrosDinamicosAlcaldiaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametrosDinamicosAlcaldiaHelper.
	 */
	private ParametrosDinamicosAlcaldiaHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param apda_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ParametrosDinamicosAlcaldiaDTO
	 */
	public static ParametrosDinamicosAlcaldiaDTO entidadADtoSimple(ParametrosDinamicosAlcaldia apda_entidad) {

		ParametrosDinamicosAlcaldiaDTO lpda_dto = new ParametrosDinamicosAlcaldiaDTO();

		lpda_dto.setIs_id(apda_entidad.getId());
		lpda_dto.setIs_constante(apda_entidad.getConstante());
		lpda_dto.setIs_estereotipoCreacion(apda_entidad.getEstereotipoCreacion());
		lpda_dto.setIs_estereotipoModificacion(apda_entidad.getEstereotipoModificacion());
		lpda_dto.setId_fechaCreacion(apda_entidad.getFechaCreacion());
		lpda_dto.setId_fechaModificacion(apda_entidad.getFechaModificacion());
		lpda_dto.setIs_idAlcaldiaParametrizacion(apda_entidad.getAlcaldiaParametrizacion().getId());
		lpda_dto.setIs_idUsuarioCreacion(apda_entidad.getIdUsuarioCreacion());
		lpda_dto.setIs_idUsuarioModificacion(apda_entidad.getIdUsuarioModificacion());
		lpda_dto.setIs_ipCreacion(apda_entidad.getIpCreacion());
		lpda_dto.setIs_ipModificacion(apda_entidad.getIpModificacion());
		lpda_dto.setIs_nombre(apda_entidad.getNombre());
		lpda_dto.setIs_parametroAplicacion(apda_entidad.getParametroAplicacion());
		lpda_dto.setIs_parametroUi(apda_entidad.getParametroUi());
		lpda_dto.setIs_valor(apda_entidad.getValor());
		lpda_dto.setIs_nombreUi(apda_entidad.getNombreUi());
		lpda_dto.setIs_descripcionUi(apda_entidad.getDescripcionUi());
		lpda_dto.setIs_administrable(apda_entidad.getAdministrable());

		return lpda_dto;
	}

	/**
	 * Método que convierte una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apda_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ParametrosDinamicosAlcaldiaDTO
	 */
	public static ParametrosDinamicosAlcaldiaDTO entidadADtoCompleto(ParametrosDinamicosAlcaldia apda_entidad) {
		ParametrosDinamicosAlcaldiaDTO lpda_dto;
		lpda_dto = entidadADtoSimple(apda_entidad);
		return lpda_dto;
	}

	/**
	 * Metodo que convierte una lista entidades a dto simple.
	 *
	 * @param alpda_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         ParametrosDinamicosAlcaldiaDTO
	 */
	public static List<ParametrosDinamicosAlcaldiaDTO> listaentidadADtoSimple(
			List<ParametrosDinamicosAlcaldia> alpda_listEntidad) {
		List<ParametrosDinamicosAlcaldiaDTO> llpada_listDto = new ArrayList<>();
		for (ParametrosDinamicosAlcaldia lpda_entidad : alpda_listEntidad) {
			llpada_listDto.add(entidadADtoSimple(lpda_entidad));
		}
		return llpada_listDto;
	}

	/**
	 * Método que convierte una lista entidad a dto usando todos los datos
	 * incluyendo relaciones.
	 *
	 * @param alpda_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de ParametrosDinamicosAlcaldiaDTO
	 */
	public static List<ParametrosDinamicosAlcaldiaDTO> listaentidadADtoCompleto(
			List<ParametrosDinamicosAlcaldia> alpda_listEntidad) {
		List<ParametrosDinamicosAlcaldiaDTO> llpda_listDto = new ArrayList<>();
		for (ParametrosDinamicosAlcaldia lpada_entidad : alpda_listEntidad) {
			llpda_listDto.add(entidadADtoCompleto(lpada_entidad));
		}
		return llpda_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a entidad.
	 *
	 * @param apda_dto     el parametro dto
	 * @param apda_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         ParametrosDinamicosAlcaldia
	 */
	public static ParametrosDinamicosAlcaldia dtoAEntidadSimple(ParametrosDinamicosAlcaldiaDTO apda_dto,
			ParametrosDinamicosAlcaldia apda_entidad) {
		if (null == apda_entidad) {
			apda_entidad = new ParametrosDinamicosAlcaldia();
			apda_entidad.setAlcaldiaParametrizacion(new AlcaldiaParametrizacion());
			apda_entidad.getAlcaldiaParametrizacion().setId(apda_dto.getIs_idAlcaldiaParametrizacion());
		}
		apda_entidad.setId(apda_dto.getIs_id());
		apda_entidad.setConstante(apda_dto.getIs_constante());
		apda_entidad.setEstereotipoCreacion(apda_dto.getIs_estereotipoCreacion());
		apda_entidad.setEstereotipoModificacion(apda_dto.getIs_estereotipoModificacion());
		apda_entidad.setFechaCreacion(apda_dto.getId_fechaCreacion());
		apda_entidad.setFechaModificacion(apda_dto.getId_fechaModificacion());
		apda_entidad.setIdUsuarioCreacion(apda_dto.getIs_idUsuarioCreacion());
		apda_entidad.setIdUsuarioModificacion(apda_dto.getIs_idUsuarioModificacion());
		apda_entidad.setIpCreacion(apda_dto.getIs_ipCreacion());
		apda_entidad.setIpModificacion(apda_dto.getIs_ipModificacion());
		apda_entidad.setNombre(apda_dto.getIs_nombre());
		apda_entidad.setParametroAplicacion(apda_dto.getIs_parametroAplicacion());
		apda_entidad.setParametroUi(apda_dto.getIs_parametroUi());
		apda_entidad.setValor(apda_dto.getIs_valor());
		apda_entidad.setNombreUi(apda_dto.getIs_nombreUi());
		apda_entidad.setDescripcionUi(apda_dto.getIs_descripcionUi());
		apda_entidad.setAdministrable(apda_dto.getIs_administrable());
		apda_entidad.setEstereotipoCreacion(apda_dto.getIs_estereotipoCreacion());
		apda_entidad.setEstereotipoModificacion(apda_dto.getIs_estereotipoModificacion());
		return apda_entidad;
	}

	/**
	 * Método que convierte un dto a lista entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param apda_dto     el parametro dto
	 * @param apda_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         ParametrosDinamicosAlcaldia
	 */
	public static ParametrosDinamicosAlcaldia dtoAEntidadCompleto(ParametrosDinamicosAlcaldiaDTO apda_dto,
			ParametrosDinamicosAlcaldia apda_entidad) {
		apda_entidad = dtoAEntidadSimple(apda_dto, apda_entidad);

		return apda_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param alpda_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ParametrosDinamicosAlcaldia
	 */
	public static List<ParametrosDinamicosAlcaldia> listadtoAEntidadSimple(
			List<ParametrosDinamicosAlcaldiaDTO> alpda_listDto) {
		List<ParametrosDinamicosAlcaldia> llpda_listEntidad = new ArrayList<>();
		for (ParametrosDinamicosAlcaldiaDTO lpda_dto : alpda_listDto) {
			llpda_listEntidad.add(dtoAEntidadSimple(lpda_dto, null));
		}
		return llpda_listEntidad;
	}

	/**
	 * Método que convierte un DTO usando todos los datos a una entidad incluyendo
	 * relaciones.
	 *
	 * @param alpada_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ParametrosDinamicosAlcaldia
	 */
	public static List<ParametrosDinamicosAlcaldia> listadtoAEntidadCompleto(
			List<ParametrosDinamicosAlcaldiaDTO> alpada_listDto) {
		List<ParametrosDinamicosAlcaldia> llpda_listEntidad = new ArrayList<>();
		for (ParametrosDinamicosAlcaldiaDTO llpada_listDto : alpada_listDto) {
			llpda_listEntidad.add(dtoAEntidadCompleto(llpada_listDto, null));
		}
		return llpda_listEntidad;
	}
	// --- fin to Entidad
}
