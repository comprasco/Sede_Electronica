/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DireccionHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: DireccionHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Pais;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Direccion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DireccionHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase DireccionHelper.
	 */
	private DireccionHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como DireccionDTO
	 */
	public static DireccionDTO entidadADtoSimple(Direccion ad_entidad) {
		DireccionDTO ld_dto = new DireccionDTO();
		ld_dto.setIs_id(ad_entidad.getId());
		ld_dto.setIs_activo(ad_entidad.getActivo());
		ld_dto.setIs_complementoDireccion(ad_entidad.getComplementoDireccion());
		ld_dto.setIs_datoEjePrincipal(ad_entidad.getDatoEjePrincipal());
		ld_dto.setIs_datoEjeSecundario(ad_entidad.getDatoEjeSecundario());
		ld_dto.setIs_datoEjeSecundario1(ad_entidad.getDatoEjeSecundario1());
		ld_dto.setIs_letraEjePrincipal(ad_entidad.getLetraEjePrincipal());
		ld_dto.setIs_letraEjeSecundario(ad_entidad.getLetraEjeSecundario());
		ld_dto.setIs_letraEjeSecundario1(ad_entidad.getLetraEjeSecundario1());
		ld_dto.setIs_complementoEjePrincipal(ad_entidad.getComplementoEjePrincipal());
		ld_dto.setIs_complementoEjeSecundario(ad_entidad.getComplementoEjeSecundario());
		ld_dto.setIs_complementoEjeSecundario1(ad_entidad.getComplementoEjeSecundario1());
		ld_dto.setIs_coordenadaEjePrincipal(ad_entidad.getCoordenadaEjePrincipal());
		ld_dto.setIs_coordenadaEjeSecundario(ad_entidad.getCoordenadaEjeSecundario());
		ld_dto.setIs_coordenadaEjeSecundario1(ad_entidad.getCoordenadaEjeSecundario1());
		ld_dto.setId_fechaCreacion(ad_entidad.getFechaCreacion());
		ld_dto.setId_fechaDesde(ad_entidad.getFechaDesde());
		ld_dto.setId_fechaHasta(ad_entidad.getFechaHasta());
		ld_dto.setId_fechaModificacion(ad_entidad.getFechaModificacion());
		ld_dto.setIs_idUsuarioCreacion(ad_entidad.getIdUsuarioCreacion());
		ld_dto.setIs_idUsuarioModificacion(ad_entidad.getIdUsuarioModificacion());
		ld_dto.setIs_ipCreacion(ad_entidad.getIpCreacion());
		ld_dto.setIs_ipModificacion(ad_entidad.getIpModificacion());
		ld_dto.setIs_nombrePredio(ad_entidad.getNombrePredio());
		ld_dto.setIs_idComplementoDireccion(ad_entidad.getIdComplementoDireccion());
		ld_dto.setIs_estereotipoCreacion(ad_entidad.getEstereotipoCreacion());
		ld_dto.setIs_estereotipoModificacion(ad_entidad.getEstereotipoModificacion());

		return ld_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como DireccionDTO
	 */
	public static DireccionDTO entidadADtoCompleto(Direccion ad_entidad) {
		DireccionDTO ld_dto = entidadADtoSimple(ad_entidad);
		if (ad_entidad.getTipoEje() != null) {
			ld_dto.setIte_tipoEjeDto(TipoEjeHelper.entidadADtoSimple(ad_entidad.getTipoEje()));
		}
		if (ad_entidad.getIdTipoEjeUno() != null) {
			ld_dto.setIte_tipoEjeUnoDto(TipoEjeHelper.entidadADtoSimple(ad_entidad.getIdTipoEjeUno()));
		}
		if (ad_entidad.getMunicipio() != null) {
			ld_dto.setIm_municipioDto(MunicipioHelper.entidadADtoCompleto(ad_entidad.getMunicipio()));
			ld_dto.setId_departamentoDto(ld_dto.getIm_municipioDto().getId_departamentoDto());
		}
		if (ad_entidad.getPais() != null) {
			ld_dto.setIp_paisDto(PaisHelper.entidadADtoCompleto(ad_entidad.getPais()));
		}
		if (ad_entidad.getTipoDireccion() != null) {
			ld_dto.setIetd_enumTipoDireccion(EnumTipoDireccion.buscarPorCodigo(ad_entidad.getTipoDireccion()));
		}
		if (ad_entidad.getTipoPredio() != null) {
			ld_dto.setIetp_enumTipoPredio(EnumTipoPredio.buscarPorCodigo(ad_entidad.getTipoPredio()));
		}

		return ld_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param ald_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         DireccionDTO
	 */
	public static List<DireccionDTO> listaentidadADtoSimple(List<Direccion> ald_listaEntidad) {
		List<DireccionDTO> lld_listaDto = new ArrayList<>();
		for (Direccion ld_entidad : ald_listaEntidad) {
			lld_listaDto.add(entidadADtoSimple(ld_entidad));
		}
		return lld_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param ald_listaEntidad el parametro lista entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de DireccionDTO
	 */
	public static List<DireccionDTO> listaentidadADtoCompleto(List<Direccion> ald_listaEntidad) {
		List<DireccionDTO> ald_listaDto = new ArrayList<>();
		for (Direccion ld_entidad : ald_listaEntidad) {
			ald_listaDto.add(entidadADtoCompleto(ld_entidad));
		}
		return ald_listaDto;
	}
	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param ad_dto     el parametro dto
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como Direccion
	 */
	public static Direccion dtoAEntidadSimple(DireccionDTO ad_dto, Direccion ad_entidad) {
		if (null == ad_entidad) {
			ad_entidad = new Direccion();
		}
		ad_entidad.setId(ad_dto.getIs_id());
		ad_entidad.setActivo(ad_dto.getIs_activo());
		ad_entidad.setComplementoDireccion(ad_dto.getIs_complementoDireccion());
		ad_entidad.setIdComplementoDireccion(ad_dto.getIs_idComplementoDireccion());
		ad_entidad.setDatoEjePrincipal(ad_dto.getIs_datoEjePrincipal());
		ad_entidad.setDatoEjeSecundario(ad_dto.getIs_datoEjeSecundario());
		ad_entidad.setDatoEjeSecundario1(ad_dto.getIs_datoEjeSecundario1());
		ad_entidad.setLetraEjePrincipal(ad_dto.getIs_letraEjePrincipal());
		ad_entidad.setLetraEjeSecundario(ad_dto.getIs_letraEjeSecundario());
		ad_entidad.setLetraEjeSecundario1(ad_dto.getIs_letraEjeSecundario1());
		ad_entidad.setComplementoEjePrincipal(ad_dto.getIs_complementoEjePrincipal());
		ad_entidad.setComplementoEjeSecundario(ad_dto.getIs_complementoEjeSecundario());
		ad_entidad.setComplementoEjeSecundario1(ad_dto.getIs_complementoEjeSecundario1());
		ad_entidad.setCoordenadaEjePrincipal(ad_dto.getIs_coordenadaEjePrincipal());
		ad_entidad.setCoordenadaEjeSecundario(ad_dto.getIs_coordenadaEjeSecundario());
		ad_entidad.setCoordenadaEjeSecundario1(ad_dto.getIs_coordenadaEjeSecundario1());
		ad_entidad.setFechaCreacion(ad_dto.getId_fechaCreacion());
		ad_entidad.setFechaDesde(ad_dto.getId_fechaDesde());
		ad_entidad.setFechaHasta(ad_dto.getId_fechaHasta());
		ad_entidad.setFechaModificacion(ad_dto.getId_fechaModificacion());
		ad_entidad.setIdUsuarioCreacion(ad_dto.getIs_idUsuarioCreacion());
		ad_entidad.setIdUsuarioModificacion(ad_dto.getIs_idUsuarioModificacion());
		ad_entidad.setIpCreacion(ad_dto.getIs_ipCreacion());
		ad_entidad.setIpModificacion(ad_dto.getIs_ipModificacion());
		ad_entidad.setNombrePredio(ad_dto.getIs_nombrePredio());
		ad_entidad.setEstereotipoCreacion(ad_dto.getIs_estereotipoCreacion());
		ad_entidad.setEstereotipoModificacion(ad_dto.getIs_estereotipoModificacion());
		return ad_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param ad_dto     el parametro dto
	 * @param ad_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como Direccion
	 */
	public static Direccion dtoAEntidadCompleto(DireccionDTO ad_dto, Direccion ad_entidad) {
		ad_entidad = dtoAEntidadSimple(ad_dto, ad_entidad);
		if (ad_dto.getIte_tipoEjeDto() != null) {
			ad_entidad.setTipoEje(new TipoEje());
			ad_entidad.getTipoEje().setId(ad_dto.getIte_tipoEjeDto().getIs_id());
		}
		if (ad_dto.getIte_tipoEjeUnoDto() != null) {
			ad_entidad.setIdTipoEjeUno(new TipoEje());
			ad_entidad.getIdTipoEjeUno().setId(ad_dto.getIte_tipoEjeUnoDto().getIs_id());
		}
		if (ad_dto.getIm_municipioDto() != null) {
			ad_entidad.setMunicipio(MunicipioHelper.dtoAEntidadCompleto(ad_dto.getIm_municipioDto(), new Municipio()));
		}
		if (ad_dto.getIp_paisDto() != null) {
			ad_entidad.setPais(PaisHelper.dtoAEntidadCompleto(ad_dto.getIp_paisDto(), new Pais()));
		}
		if (ad_dto.getIetd_enumTipoDireccion() != null) {
			ad_entidad.setTipoDireccion(ad_dto.getIetd_enumTipoDireccion().getIs_codigo());
		}
		if (ad_dto.getIetp_enumTipoPredio() != null) {
			ad_entidad.setTipoPredio(ad_dto.getIetp_enumTipoPredio().getIs_codigo());
		}
		return ad_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades .
	 *
	 * @param ald_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         Direccion
	 */
	public static List<Direccion> listadtoAEntidadSimple(List<DireccionDTO> ald_listaDto) {
		List<Direccion> lld_listaEntidad = new ArrayList<>();
		for (DireccionDTO ld_dto : ald_listaDto) {
			lld_listaEntidad.add(dtoAEntidadSimple(ld_dto, null));
		}
		return lld_listaEntidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param ald_listaDto el parametro lista dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de Direccion
	 */
	public static List<Direccion> listadtoAEntidadCompleto(List<DireccionDTO> ald_listaDto) {
		List<Direccion> lld_listaEntidad = new ArrayList<>();
		for (DireccionDTO ld_dto : ald_listaDto) {
			lld_listaEntidad.add(dtoAEntidadCompleto(ld_dto, null));
		}
		return lld_listaEntidad;
	}
	// --- fin to Entidad
}
