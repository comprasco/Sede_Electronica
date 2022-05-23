/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: DepartamentoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.List;
import java.util.ArrayList;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.*;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.*;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Departamento.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DepartamentoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase DepartamentoHelper.
	 */
	private DepartamentoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como DepartamentoDTO
	 */
	public static DepartamentoDTO entidadADtoSimple(Departamento ad_entidad) {
		DepartamentoDTO ldd_dto = new DepartamentoDTO();
		ldd_dto.setIs_activo(ad_entidad.getActivo());
		ldd_dto.setId_fechaCreacion(ad_entidad.getFechaCreacion());
		ldd_dto.setId_fechaModificacion(ad_entidad.getFechaModificacion());
		ldd_dto.setIs_idUsuarioCreacion(ad_entidad.getIdUsuarioCreacion());
		ldd_dto.setIs_idUsuarioModificacion(ad_entidad.getIdUsuarioModificacion());
		ldd_dto.setIs_indicativoTelefonico(ad_entidad.getIndicativoTelefonico());
		ldd_dto.setIs_ipCreacion(ad_entidad.getIpCreacion());
		ldd_dto.setIs_ipModificacion(ad_entidad.getIpModificacion());
		ldd_dto.setIs_nombre(ad_entidad.getNombre());
		ldd_dto.setIs_estereotipoCreacion(ad_entidad.getEstereotipoCreacion());
		ldd_dto.setIs_estereotipoModificacion(ad_entidad.getEstereotipoModificacion());

		return ldd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como DepartamentoDTO
	 */
	public static DepartamentoDTO entidadADtoCompleto(Departamento ad_entidad) {
		DepartamentoDTO ldd_dto = entidadADtoSimple(ad_entidad);
		if (ad_entidad.getId() != null)
			ldd_dto.setIdp_idDto(DepartamentoPKHelper.entidadADtoSimple(ad_entidad.getId()));
		if (ad_entidad.getPais() != null)
			ldd_dto.setIp_paisDto(PaisHelper.entidadADtoSimple(ad_entidad.getPais()));

		return ldd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param ald_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         DepartamentoDTO
	 */
	public static List<DepartamentoDTO> listaEntidadADtoSimple(List<Departamento> ald_listaEntidades) {
		List<DepartamentoDTO> lldd_listaDto = new ArrayList<>();
		for (Departamento ld_entidad : ald_listaEntidades) {
			lldd_listaDto.add(entidadADtoSimple(ld_entidad));
		}
		return lldd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param ald_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de DepartamentoDTO
	 */
	public static List<DepartamentoDTO> listaEntidadADtoCompleto(List<Departamento> ald_listaEntidades) {
		List<DepartamentoDTO> lldd_listaDto = new ArrayList<>();
		for (Departamento ld_entidad : ald_listaEntidades) {
			lldd_listaDto.add(entidadADtoCompleto(ld_entidad));
		}
		return lldd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param add_dto    el parametro dto
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Departamento
	 */
	public static Departamento dtoAEntidadSimple(DepartamentoDTO add_dto, Departamento ad_entidad) {
		if (null == ad_entidad) {
			ad_entidad = new Departamento();
		}
		ad_entidad.setActivo(add_dto.getIs_activo());
		ad_entidad.setFechaCreacion(add_dto.getId_fechaCreacion());
		ad_entidad.setFechaModificacion(add_dto.getId_fechaModificacion());
		ad_entidad.setIdUsuarioCreacion(add_dto.getIs_idUsuarioCreacion());
		ad_entidad.setIdUsuarioModificacion(add_dto.getIs_idUsuarioModificacion());
		ad_entidad.setIndicativoTelefonico(add_dto.getIs_indicativoTelefonico());
		ad_entidad.setIpCreacion(add_dto.getIs_ipCreacion());
		ad_entidad.setIpModificacion(add_dto.getIs_ipModificacion());
		ad_entidad.setNombre(add_dto.getIs_nombre());
		ad_entidad.setEstereotipoCreacion(add_dto.getIs_estereotipoCreacion());
		ad_entidad.setEstereotipoModificacion(add_dto.getIs_estereotipoModificacion());
		return ad_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param add_dto    el parametro dto
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Departamento
	 */
	public static Departamento dtoAEntidadCompleto(DepartamentoDTO add_dto, Departamento ad_entidad) {
		ad_entidad = dtoAEntidadSimple(add_dto, ad_entidad);
		if (add_dto.getIdp_idDto() != null) {
			DepartamentoPK ldp_departamentoPk = new DepartamentoPK();
			ldp_departamentoPk.setIdDepartamento(add_dto.getIdp_idDto().getIs_idDepartamento());
			ldp_departamentoPk.setIdPais(add_dto.getIdp_idDto().getIs_idPais());
			ad_entidad.setId(ldp_departamentoPk);
		}
		if (add_dto.getIp_paisDto() != null) {
			ad_entidad.setPais(new Pais());
			ad_entidad.getPais().setIdPais(add_dto.getIp_paisDto().getIs_idPais());
		}

		return ad_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param aldd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Departamento
	 */
	public static List<Departamento> listaDtoAEntidadSimple(List<DepartamentoDTO> aldd_listaDto) {
		List<Departamento> lld_listaEntidades = new ArrayList<>();
		for (DepartamentoDTO ldd_dto : aldd_listaDto) {
			lld_listaEntidades.add(dtoAEntidadSimple(ldd_dto, null));
		}
		return lld_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param aldd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Departamento
	 */
	public static List<Departamento> listaDtoAEntidadCompleto(List<DepartamentoDTO> aldd_listaDto) {
		List<Departamento> lld_listaEntidades = new ArrayList<>();
		for (DepartamentoDTO ldd_dto : aldd_listaDto) {
			lld_listaEntidades.add(dtoAEntidadCompleto(ldd_dto, null));
		}
		return lld_listaEntidades;
	}
	// --- fin to Entidad
}
