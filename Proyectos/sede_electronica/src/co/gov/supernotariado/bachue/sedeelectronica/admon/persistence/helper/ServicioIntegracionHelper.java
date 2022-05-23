/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioIntegracionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: ServicioIntegracionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ServicioIntegracion;

import java.util.ArrayList;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Servicio
 * integracion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioIntegracionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase ServicioIntegracionHelper.
	 */
	private ServicioIntegracionHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que permite convertir de entidad a DTO.
	 *
	 * @param asi_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         ServicioIntegracionDTO
	 */
	public static ServicioIntegracionDTO entidadADtoSimple(ServicioIntegracion asi_entidad) {

		ServicioIntegracionDTO lsi_dto = new ServicioIntegracionDTO();

		lsi_dto.setIs_id(asi_entidad.getId());
		lsi_dto.setIs_activo(asi_entidad.getActivo());
		lsi_dto.setIs_descripcion(asi_entidad.getDescripcion());
		lsi_dto.setIs_espacioNombre(asi_entidad.getEspacioNombre());
		lsi_dto.setId_fechaCreacion(asi_entidad.getFechaCreacion());
		lsi_dto.setId_fechaModificacion(asi_entidad.getFechaModificacion());
		lsi_dto.setIs_idUsuarioCreacion(asi_entidad.getIdUsuarioCreacion());
		lsi_dto.setIs_idUsuarioModificacion(asi_entidad.getIdUsuarioModificacion());
		lsi_dto.setIs_ipCreacion(asi_entidad.getIpCreacion());
		lsi_dto.setIs_ipModificacion(asi_entidad.getIpModificacion());
		lsi_dto.setIs_nombre(asi_entidad.getNombre());
		lsi_dto.setIs_url(asi_entidad.getUrl());
		lsi_dto.setIs_tiempoFuera(asi_entidad.getTiempoFuera());
		lsi_dto.setIs_nombreServicio(asi_entidad.getNombreServicio());
		lsi_dto.setIs_estereotipoCreacion(asi_entidad.getEstereotipoCreacion());
		lsi_dto.setIs_estereotipoModificacion(asi_entidad.getEstereotipoModificacion());
		
		if (asi_entidad.getTipoProceso() != null) {
			lsi_dto.setItp_tipoProceso(TipoProcesoHelper.entidadADtoCompleto(asi_entidad.getTipoProceso()));
		}
		return lsi_dto;
	}

	/**
	 * Método que convierte entidad a DTO usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param asi_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         ServicioIntegracionDTO
	 */
	public static ServicioIntegracionDTO entidadADtoCompleto(ServicioIntegracion asi_entidad) {
		ServicioIntegracionDTO lsi_dto;
		lsi_dto = entidadADtoSimple(asi_entidad);
		return lsi_dto;
	}

	/**
	 * Método que convierte una lista de entidades a una de DTOs usando todos los
	 * datos incluyendo relaciones.
	 *
	 * @param alsi_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         ServicioIntegracionDTO
	 */
	public static List<ServicioIntegracionDTO> listaentidadADtoSimple(List<ServicioIntegracion> alsi_listEntidad) {
		List<ServicioIntegracionDTO> llsi_listDto = new ArrayList<>();
		for (ServicioIntegracion lsi_entidad : alsi_listEntidad) {
			llsi_listDto.add(entidadADtoSimple(lsi_entidad));
		}
		return llsi_listDto;
	}

	/**
	 * Metodo que permite convertir una lista de entidades a una de DTOs usando
	 * todos los datos.
	 *
	 * @param alsi_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de ServicioIntegracionDTO
	 */
	public static List<ServicioIntegracionDTO> listaentidadADtoCompleto(List<ServicioIntegracion> alsi_listEntidad) {
		List<ServicioIntegracionDTO> llsi_listDto = new ArrayList<>();
		for (ServicioIntegracion lsi_entidad : alsi_listEntidad) {
			llsi_listDto.add(entidadADtoCompleto(lsi_entidad));
		}
		return llsi_listDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que permite convertir de modelos DTO a entidades de persistencia.
	 *
	 * @param asi_dto     modelo dto
	 * @param asi_entidad modelo de persistencia a generar
	 * @return Resultado para dto A entidad simple retornado como
	 *         ServicioIntegracion
	 */
	public static ServicioIntegracion dtoAEntidadSimple(ServicioIntegracionDTO asi_dto,
			ServicioIntegracion asi_entidad) {
		if (null == asi_entidad) {
			asi_entidad = new ServicioIntegracion();
		}
		asi_entidad.setId(asi_dto.getIs_id());
		asi_entidad.setActivo(asi_dto.getIs_activo());
		asi_entidad.setDescripcion(asi_dto.getIs_descripcion());
		asi_entidad.setEspacioNombre(asi_dto.getIs_espacioNombre());
		asi_entidad.setFechaCreacion(asi_dto.getId_fechaCreacion());
		asi_entidad.setFechaModificacion(asi_dto.getId_fechaModificacion());
		asi_entidad.setIdUsuarioCreacion(asi_dto.getIs_idUsuarioCreacion());
		asi_entidad.setIdUsuarioModificacion(asi_dto.getIs_idUsuarioModificacion());
		asi_entidad.setIpCreacion(asi_dto.getIs_ipCreacion());
		asi_entidad.setIpModificacion(asi_dto.getIs_ipModificacion());
		asi_entidad.setNombre(asi_dto.getIs_nombre());
		asi_entidad.setUrl(asi_dto.getIs_url());
		asi_entidad.setTiempoFuera(asi_dto.getIs_tiempoFuera());
		asi_entidad.setNombreServicio(asi_dto.getIs_nombreServicio());
		asi_entidad.setEstereotipoCreacion(asi_dto.getIs_estereotipoCreacion());
		asi_entidad.setEstereotipoModificacion(asi_dto.getIs_estereotipoModificacion());
		asi_entidad.setIdTipoProceso(asi_dto.getIs_tipoProceso());
		
		return asi_entidad;
	}

	/**
	 * Metodo que permite convertir de modelos DTO a entidades de persistencia.
	 *
	 * @param asi_dto     modelo dto
	 * @param asi_entidad modelo de persistencia a generar
	 * @return Resultado para dto A entidad completo retornado como
	 *         ServicioIntegracion
	 */
	public static ServicioIntegracion dtoAEntidadCompleto(ServicioIntegracionDTO asi_dto,
			ServicioIntegracion asi_entidad) {
		asi_entidad = dtoAEntidadSimple(asi_dto, asi_entidad);

		return asi_entidad;
	}

	/**
	 * Metodo que permite convertir una lista de modelos DTO modelos de
	 * persistencia.
	 *
	 * @param alsi_listDto lista de DTO a convertir
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         ServicioIntegracion
	 */
	public static List<ServicioIntegracion> listadtoAEntidadSimple(List<ServicioIntegracionDTO> alsi_listDto) {
		List<ServicioIntegracion> llsi_listEntidad = new ArrayList<>();
		for (ServicioIntegracionDTO lsi_dto : alsi_listDto) {
			llsi_listEntidad.add(dtoAEntidadSimple(lsi_dto, null));
		}
		return llsi_listEntidad;
	}

	/**
	 * Metodo que convierte lista de DTOs a lista de entidades de persistencia.
	 *
	 * @param alsi_listDto lsita de dtos
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de ServicioIntegracion
	 */
	public static List<ServicioIntegracion> listadtoAEntidadCompleto(List<ServicioIntegracionDTO> alsi_listDto) {
		List<ServicioIntegracion> llsi_listEntidad = new ArrayList<>();
		for (ServicioIntegracionDTO lsi_dto : alsi_listDto) {
			llsi_listEntidad.add(dtoAEntidadCompleto(lsi_dto, null));
		}
		return llsi_listEntidad;
	}
	// --- fin to Entidad
}
