/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: MunicipioHelper
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
 * Contiene operaciones de transformacion para el DTO y la entidad Municipio.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MunicipioHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase MunicipioHelper.
	 */
	private MunicipioHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param am_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como MunicipioDTO
	 */
	public static MunicipioDTO entidadADtoSimple(Municipio am_entidad) {
		MunicipioDTO lmd_dto = new MunicipioDTO();
		lmd_dto.setIs_activo(am_entidad.getActivo());
		lmd_dto.setId_fechaCreacion(am_entidad.getFechaCreacion());
		lmd_dto.setId_fechaModificacion(am_entidad.getFechaModificacion());
		lmd_dto.setIs_idUsuarioCreacion(am_entidad.getIdUsuarioCreacion());
		lmd_dto.setIs_idUsuarioModificacion(am_entidad.getIdUsuarioModificacion());
		lmd_dto.setIs_ipCreacion(am_entidad.getIpCreacion());
		lmd_dto.setIs_ipModificacion(am_entidad.getIpModificacion());
		lmd_dto.setIs_nombre(am_entidad.getNombre());
		lmd_dto.setIs_estereotipoCreacion(am_entidad.getEstereotipoCreacion());
		lmd_dto.setIs_estereotipoModificacion(am_entidad.getEstereotipoModificacion());
		return lmd_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param am_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como MunicipioDTO
	 */
	public static MunicipioDTO entidadADtoCompleto(Municipio am_entidad) {
		MunicipioDTO lmd_dto = entidadADtoSimple(am_entidad);
		if (am_entidad.getId() != null)
			lmd_dto.setImp_idDto(MunicipioPKHelper.entidadADtoSimple(am_entidad.getId()));
		if (am_entidad.getDepartamento() != null)
			lmd_dto.setId_departamentoDto(DepartamentoHelper.entidadADtoCompleto(am_entidad.getDepartamento()));

		return lmd_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param alm_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         MunicipioDTO
	 */
	public static List<MunicipioDTO> listaEntidadADtoSimple(List<Municipio> alm_listaEntidades) {
		List<MunicipioDTO> llmd_listaDto = new ArrayList<>();
		for (Municipio lm_entidad : alm_listaEntidades) {
			llmd_listaDto.add(entidadADtoSimple(lm_entidad));
		}
		return llmd_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alm_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de MunicipioDTO
	 */
	public static List<MunicipioDTO> listaEntidadADtoCompleto(List<Municipio> alm_listaEntidades) {
		List<MunicipioDTO> llmd_listaDto = new ArrayList<>();
		if (alm_listaEntidades != null) {
			for (Municipio lm_entidad : alm_listaEntidades) {
				llmd_listaDto.add(entidadADtoCompleto(lm_entidad));
			}
		}
		return llmd_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad
	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param amd_dto    el parametro dto
	 * @param am_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Municipio
	 */
	public static Municipio dtoAEntidadSimple(MunicipioDTO amd_dto, Municipio am_entidad) {
		if (null == am_entidad) {
			am_entidad = new Municipio();
		}
		am_entidad.setActivo(amd_dto.getIs_activo());
		am_entidad.setFechaCreacion(amd_dto.getId_fechaCreacion());
		am_entidad.setFechaModificacion(amd_dto.getId_fechaModificacion());
		am_entidad.setIdUsuarioCreacion(amd_dto.getIs_idUsuarioCreacion());
		am_entidad.setIdUsuarioModificacion(amd_dto.getIs_idUsuarioModificacion());
		am_entidad.setIpCreacion(amd_dto.getIs_ipCreacion());
		am_entidad.setIpModificacion(amd_dto.getIs_ipModificacion());
		am_entidad.setNombre(amd_dto.getIs_nombre());
		am_entidad.setEstereotipoCreacion(amd_dto.getIs_estereotipoCreacion());
		am_entidad.setEstereotipoModificacion(amd_dto.getIs_estereotipoModificacion());
		return am_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param amd_dto    el parametro dto
	 * @param am_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Municipio
	 */
	public static Municipio dtoAEntidadCompleto(MunicipioDTO amd_dto, Municipio am_entidad) {
		am_entidad = dtoAEntidadSimple(amd_dto, am_entidad);

		if (amd_dto.getImp_idDto() != null) {
			MunicipioPK lmp_municipioPk = new MunicipioPK();
			lmp_municipioPk.setIdDepartamento(amd_dto.getImp_idDto().getIs_idDepartamento());
			lmp_municipioPk.setIdMunicipio(amd_dto.getImp_idDto().getIs_idMunicipio());
			lmp_municipioPk.setIdPais(amd_dto.getImp_idDto().getIs_idPais());
			am_entidad.setId(lmp_municipioPk);
		}
		if (amd_dto.getId_departamentoDto() != null) {
			Departamento ld_departamento = new Departamento();
			ld_departamento = DepartamentoHelper.dtoAEntidadCompleto(amd_dto.getId_departamentoDto(), ld_departamento);
			am_entidad.setDepartamento(ld_departamento);
		}
		return am_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param almd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Municipio
	 */
	public static List<Municipio> listaDtoAEntidadSimple(List<MunicipioDTO> almd_listaDto) {
		List<Municipio> llm_listaEntidades = new ArrayList<>();
		for (MunicipioDTO lmd_dto : almd_listaDto) {
			llm_listaEntidades.add(dtoAEntidadSimple(lmd_dto, null));
		}
		return llm_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param almd_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Municipio
	 */
	public static List<Municipio> listaDtoAEntidadCompleto(List<MunicipioDTO> almd_listaDto) {
		List<Municipio> llm_listaEntidades = new ArrayList<>();
		for (MunicipioDTO lmd_dto : almd_listaDto) {
			llm_listaEntidades.add(dtoAEntidadCompleto(lmd_dto, null));
		}
		return llm_listaEntidades;
	}
	// --- fin to Entidad
}
