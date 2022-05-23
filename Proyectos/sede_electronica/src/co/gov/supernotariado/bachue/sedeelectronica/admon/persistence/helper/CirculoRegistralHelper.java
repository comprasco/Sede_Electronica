/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CirculoRegistralHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: CirculoRegistralHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Circulo
 * registral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CirculoRegistralHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase CirculoRegistralHelper.
	 */
	private CirculoRegistralHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Entidad A dto simple.
	 *
	 * @param acr_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         CirculoRegistralDTO
	 */
	// --- to DTO
	public static CirculoRegistralDTO entidadADtoSimple(CirculoRegistral acr_entidad) {
		CirculoRegistralDTO lcr_circuloRegistraldto = new CirculoRegistralDTO();
		lcr_circuloRegistraldto.setIs_id(acr_entidad.getId());
		lcr_circuloRegistraldto.setIs_activo(acr_entidad.getActivo());
		lcr_circuloRegistraldto.setId_fechaCreacion(acr_entidad.getFechaCreacion());
		lcr_circuloRegistraldto.setId_fechaModificacion(acr_entidad.getFechaModificacion());
		lcr_circuloRegistraldto.setIs_idUsuarioCreacion(acr_entidad.getIdUsuarioCreacion());
		lcr_circuloRegistraldto.setIs_idUsuarioModificacion(acr_entidad.getIdUsuarioModificacion());
		lcr_circuloRegistraldto.setIs_ipCreacion(acr_entidad.getIpCreacion());
		lcr_circuloRegistraldto.setIs_ipModificacion(acr_entidad.getIpModificacion());
		lcr_circuloRegistraldto.setIs_nombre(acr_entidad.getNombre());
		lcr_circuloRegistraldto.setIs_estereotipoCreacion(acr_entidad.getEstereotipoCreacion());
		lcr_circuloRegistraldto.setIs_estereotipoModificacion(acr_entidad.getEstereotipoModificacion());

		return lcr_circuloRegistraldto;
	}

	/**
	 * Entidad A dto completo.
	 *
	 * @param acr_listEntidad el parametro list entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         CirculoRegistralDTO
	 */
	public static CirculoRegistralDTO entidadADtoCompleto(CirculoRegistral acr_listEntidad) {
		CirculoRegistralDTO lcr_circuloRegistraldto;
		lcr_circuloRegistraldto = entidadADtoSimple(acr_listEntidad);

		return lcr_circuloRegistraldto;
	}

	/**
	 * Listaentidad A dto simple.
	 *
	 * @param alcr_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         CirculoRegistralDTO
	 */
	public static List<CirculoRegistralDTO> listaentidadADtoSimple(List<CirculoRegistral> alcr_listEntidad) {
		List<CirculoRegistralDTO> llcr_listDto = new ArrayList<>();
		for (CirculoRegistral entidad : alcr_listEntidad) {
			llcr_listDto.add(entidadADtoSimple(entidad));
		}
		return llcr_listDto;
	}

	/**
	 * Listaentidad A dto completo.
	 *
	 * @param alcr_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de CirculoRegistralDTO
	 */
	public static List<CirculoRegistralDTO> listaentidadADtoCompleto(List<CirculoRegistral> alcr_listEntidad) {
		List<CirculoRegistralDTO> llcr_listDto = new ArrayList<>();
		for (CirculoRegistral lcr_entidad : alcr_listEntidad) {
			llcr_listDto.add(entidadADtoCompleto(lcr_entidad));
		}
		return llcr_listDto;
	}

	// --- fin to DTO
	/**
	 * Dto A entidad simple.
	 *
	 * @param acr_circuloRegistraldto el parametro circulo registraldto
	 * @param acr_entidad             el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como CirculoRegistral
	 */
	// --- to Entidad
	public static CirculoRegistral dtoAEntidadSimple(CirculoRegistralDTO acr_circuloRegistraldto,
			CirculoRegistral acr_entidad) {

		if (null == acr_entidad) {
			acr_entidad = new CirculoRegistral();
		}
		acr_entidad.setId(acr_circuloRegistraldto.getIs_id());
		acr_entidad.setActivo(acr_circuloRegistraldto.getIs_activo());
		acr_entidad.setFechaCreacion(acr_circuloRegistraldto.getId_fechaCreacion());
		acr_entidad.setFechaModificacion(acr_circuloRegistraldto.getId_fechaModificacion());
		acr_entidad.setIdUsuarioCreacion(acr_circuloRegistraldto.getIs_idUsuarioCreacion());
		acr_entidad.setIdUsuarioModificacion(acr_circuloRegistraldto.getIs_idUsuarioModificacion());
		acr_entidad.setIpCreacion(acr_circuloRegistraldto.getIs_ipCreacion());
		acr_entidad.setIpModificacion(acr_circuloRegistraldto.getIs_ipModificacion());
		acr_entidad.setNombre(acr_circuloRegistraldto.getIs_nombre());
		acr_entidad.setEstereotipoCreacion(acr_circuloRegistraldto.getIs_estereotipoCreacion());
		acr_entidad.setEstereotipoModificacion(acr_circuloRegistraldto.getIs_estereotipoModificacion());
		return acr_entidad;
	}

	/**
	 * Dto A entidad completo.
	 *
	 * @param acr_circuloRegistraldto el parametro circulo registraldto
	 * @param acr_entidad             el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como CirculoRegistral
	 */
	public static CirculoRegistral dtoAEntidadCompleto(CirculoRegistralDTO acr_circuloRegistraldto,
			CirculoRegistral acr_entidad) {
		acr_entidad = dtoAEntidadSimple(acr_circuloRegistraldto, acr_entidad);

		return acr_entidad;
	}

	/**
	 * Listadto A entidad simple.
	 *
	 * @param alcr_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         CirculoRegistral
	 */
	public static List<CirculoRegistral> listadtoAEntidadSimple(List<CirculoRegistralDTO> alcr_listaDto) {
		List<CirculoRegistral> llcr_listEntidad = new ArrayList<>();
		for (CirculoRegistralDTO lcr_circuloRegistraldto : alcr_listaDto) {
			llcr_listEntidad.add(dtoAEntidadSimple(lcr_circuloRegistraldto, null));
		}
		return llcr_listEntidad;
	}

	/**
	 * Listadto A entidad completo.
	 *
	 * @param alcr_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de CirculoRegistral
	 */
	public static List<CirculoRegistral> listadtoAEntidadCompleto(List<CirculoRegistralDTO> alcr_listaDto) {
		List<CirculoRegistral> llcr_listaEntidad = new ArrayList<>();
		for (CirculoRegistralDTO lcr_circuloRegistraldto : alcr_listaDto) {
			llcr_listaEntidad.add(dtoAEntidadCompleto(lcr_circuloRegistraldto, null));
		}
		return llcr_listaEntidad;
	}
	// --- fin to Entidad
}
