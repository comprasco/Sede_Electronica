/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlcaldiaParametrizacionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: AlcaldiaParametrizacionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrosDinamicosAlcaldiaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Alcaldia
 * parametrizacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class AlcaldiaParametrizacionHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AlcaldiaParametrizacionHelper.
	 */
	private AlcaldiaParametrizacionHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO

	/**
	 * Método que convierte de entidad a DTO .
	 *
	 * @param aap_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         AlcaldiaParametrizacionDTO
	 */
	public static AlcaldiaParametrizacionDTO entidadADtoSimple(AlcaldiaParametrizacion aap_entidad) {
		AlcaldiaParametrizacionDTO lap_dto = new AlcaldiaParametrizacionDTO();
		lap_dto.setIs_estereotipoCreacion(aap_entidad.getEstereotipoCreacion());
		lap_dto.setIs_estereotipoModificacion(aap_entidad.getEstereotipoModificacion());
		lap_dto.setId_fechaCreacion(aap_entidad.getFechaCreacion());
		lap_dto.setId_fechaModificacion(aap_entidad.getFechaModificacion());
		lap_dto.setIs_id(aap_entidad.getId());
		lap_dto.setIs_idDepartamento(aap_entidad.getMunicipio().getDepartamento().getId().getIdDepartamento());
		lap_dto.setIs_idMunicipio(aap_entidad.getMunicipio().getId().getIdMunicipio());
		lap_dto.setIs_idPais(aap_entidad.getMunicipio().getDepartamento().getPais().getIdPais());
		lap_dto.setIs_idUsuarioCreacion(aap_entidad.getIdUsuarioCreacion());
		lap_dto.setIm_municipio(MunicipioHelper.entidadADtoCompleto(aap_entidad.getMunicipio()));
		lap_dto.setIs_ipCreacion(aap_entidad.getIpCreacion());
		lap_dto.setIs_ipModificacion(aap_entidad.getIpModificacion());
		lap_dto.setIs_tipoParametrizacion(aap_entidad.getTipoParametrizacion());
		lap_dto.setIs_url(aap_entidad.getUrl());
		lap_dto.setIs_departamento(aap_entidad.getMunicipio().getDepartamento().getNombre());
		lap_dto.setIs_nombreEntidad(aap_entidad.getNombreEntidad());

		if (!Objects.isNull(aap_entidad.getParametrosDinamicosAlcaldias())) {
			List<ParametrosDinamicosAlcaldiaDTO> llpda_parametrosDinamicosAlcaldia = ParametrosDinamicosAlcaldiaHelper
					.listaentidadADtoSimple(aap_entidad.getParametrosDinamicosAlcaldias());
			lap_dto.setIlpda_parametrosDinamicos(llpda_parametrosDinamicosAlcaldia);
		}

		return lap_dto;
	}

	/**
	 * Método que convierte de entidad a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param aap_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         AlcaldiaParametrizacionDTO
	 */
	public static AlcaldiaParametrizacionDTO entidadADtoCompleto(AlcaldiaParametrizacion aap_entidad) {
		AlcaldiaParametrizacionDTO lap_dto;
		lap_dto = entidadADtoSimple(aap_entidad);
		return lap_dto;
	}

	/**
	 * Método que convierte de una lista de entidades a una lista de DTO.
	 *
	 * @param alap_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         AlcaldiaParametrizacionDTO
	 */
	public static List<AlcaldiaParametrizacionDTO> listaentidadADtoSimple(
			List<AlcaldiaParametrizacion> alap_listEntidad) {
		List<AlcaldiaParametrizacionDTO> llap_listDto = new ArrayList<>();
		for (AlcaldiaParametrizacion lap_entidad : alap_listEntidad) {
			llap_listDto.add(entidadADtoSimple(lap_entidad));
		}
		return llap_listDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de DTO usando
	 * todos los datos.
	 *
	 * @param alap_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de AlcaldiaParametrizacionDTO
	 */
	public static List<AlcaldiaParametrizacionDTO> listaentidadADtoCompleto(
			List<AlcaldiaParametrizacion> alap_listEntidad) {
		List<AlcaldiaParametrizacionDTO> llap_listDto = new ArrayList<>();
		for (AlcaldiaParametrizacion lap_entidad : alap_listEntidad) {
			llap_listDto.add(entidadADtoCompleto(lap_entidad));
		}
		return llap_listDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Método que convierte un DTO a una entidad.
	 *
	 * @param aa_dto      el parametro dto
	 * @param aap_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         AlcaldiaParametrizacion
	 */
	public static AlcaldiaParametrizacion dtoAEntidadSimple(AlcaldiaParametrizacionDTO aa_dto,
			AlcaldiaParametrizacion aap_entidad) {
		if (null == aap_entidad) {
			aap_entidad = new AlcaldiaParametrizacion();
		}
		aap_entidad.setEstereotipoCreacion(aa_dto.getIs_estereotipoCreacion());
		aap_entidad.setEstereotipoModificacion(aa_dto.getIs_estereotipoModificacion());
		aap_entidad.setFechaCreacion(aa_dto.getId_fechaCreacion());
		aap_entidad.setFechaModificacion(aa_dto.getId_fechaModificacion());
		aap_entidad.setId(aa_dto.getIs_id());
		aap_entidad.setMunicipio(MunicipioHelper.dtoAEntidadCompleto(aa_dto.getIm_municipio(), new Municipio()));
		aap_entidad.setIdUsuarioCreacion(aa_dto.getIs_idUsuarioCreacion());
		aap_entidad.setIdUsuarioModificacion(aa_dto.getIs_idUsuarioModificacion());
		aap_entidad.setIpCreacion(aa_dto.getIs_ipCreacion());
		aap_entidad.setIpModificacion(aa_dto.getIs_ipModificacion());
		aap_entidad.setTipoParametrizacion(aa_dto.getIs_tipoParametrizacion());
		aap_entidad.setUrl(aa_dto.getIs_url());
		aap_entidad.setNombreEntidad(aa_dto.getIs_nombreEntidad());
		aap_entidad.setParametrosDinamicosAlcaldias(
				ParametrosDinamicosAlcaldiaHelper.listadtoAEntidadCompleto(aa_dto.getIlpda_parametrosDinamicos()));

		return aap_entidad;
	}

	/**
	 * Metodo que convierte un DTO a una entidad incluyendo relaciones.
	 *
	 * @param aap_dto     el parametro dto
	 * @param aap_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         AlcaldiaParametrizacion
	 */
	public static AlcaldiaParametrizacion dtoAEntidadCompleto(AlcaldiaParametrizacionDTO aap_dto,
			AlcaldiaParametrizacion aap_entidad) {
		aap_entidad = dtoAEntidadSimple(aap_dto, aap_entidad);

		return aap_entidad;
	}

	/**
	 * Metodo que convierte una lista DTO a una lista de entidades .
	 *
	 * @param alap_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         AlcaldiaParametrizacion
	 */
	public static List<AlcaldiaParametrizacion> listadtoAEntidadSimple(List<AlcaldiaParametrizacionDTO> alap_listDto) {
		List<AlcaldiaParametrizacion> llap_listEntidad = new ArrayList<>();
		for (AlcaldiaParametrizacionDTO lap_dto : alap_listDto) {
			llap_listEntidad.add(dtoAEntidadSimple(lap_dto, null));
		}
		return llap_listEntidad;
	}

	/**
	 * Método que convierte de una lista de DTO a entidad usando todos los datos.
	 *
	 * @param alap_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de AlcaldiaParametrizacion
	 */
	public static List<AlcaldiaParametrizacion> listadtoAEntidadCompleto(
			List<AlcaldiaParametrizacionDTO> alap_listDto) {
		List<AlcaldiaParametrizacion> llap_listEntidad = new ArrayList<>();
		for (AlcaldiaParametrizacionDTO lap_dto : alap_listDto) {
			llap_listEntidad.add(dtoAEntidadCompleto(lap_dto, null));
		}
		return llap_listEntidad;
	}
	// --- fin to Entidad
}
