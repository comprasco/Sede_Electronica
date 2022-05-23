/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentosCargadosOwccHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: DocumentosCargadosOwccHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DocumentosCargadosOwcc;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Documentos
 * cargados owcc. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentosCargadosOwccHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * DocumentosCargadosOwccHelper.
	 */
	private DocumentosCargadosOwccHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param adco_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         DocumentosCargadosOwccDTO
	 */
	public static DocumentosCargadosOwccDTO entidadADtoSimple(DocumentosCargadosOwcc adco_entidad) {

		DocumentosCargadosOwccDTO ldco_dto = new DocumentosCargadosOwccDTO();
		ldco_dto.setIs_id(adco_entidad.getId());
		ldco_dto.setIs_idUsuarioCreacion(adco_entidad.getIdUsuarioCreacion());
		ldco_dto.setIs_idUsuarioModificacion(adco_entidad.getIdUsuarioModificacion());
		ldco_dto.setIs_ipCreacion(adco_entidad.getIpCreacion());
		ldco_dto.setIs_ipModificacion(adco_entidad.getIpModificacion());
		ldco_dto.setId_fechaCreacion(adco_entidad.getFechaCreacion());
		ldco_dto.setId_fechaModificacion(adco_entidad.getFechaModificacion());
		ldco_dto.setIs_estereotipoCreacion(adco_entidad.getEstereotipoCreacion());
		ldco_dto.setIs_estereotipoModificacion(adco_entidad.getEstereotipoModificacion());
		ldco_dto.setIs_idOwcc(adco_entidad.getIdOwcc());
		ldco_dto.setIs_nir(adco_entidad.getNir());
		ldco_dto.setIs_tipoDocumental(adco_entidad.getTipoDocumental());
		ldco_dto.setIs_nombreDocumento(adco_entidad.getNombreDocumento());
		ldco_dto.setIs_observaciones(adco_entidad.getObservaciones());
		ldco_dto.setIs_nombreTipoDocumental(adco_entidad.getNombreTipoDocumental());
		return ldco_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param aldco_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         DocumentosCargadosOwccDTO
	 */
	public static List<DocumentosCargadosOwccDTO> listaEntidadADtoSimple(
			List<DocumentosCargadosOwcc> aldco_listaEntidades) {
		List<DocumentosCargadosOwccDTO> lldco_listaDto = new ArrayList<>();
		for (DocumentosCargadosOwcc ldco_documentosCargadosOwcc : aldco_listaEntidades) {
			lldco_listaDto.add(entidadADtoSimple(ldco_documentosCargadosOwcc));
		}
		return lldco_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param adco_dto     el parametro dto
	 * @param adco_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         DocumentosCargadosOwcc
	 */
	public static DocumentosCargadosOwcc dtoAEntidadSimple(DocumentosCargadosOwccDTO adco_dto,
			DocumentosCargadosOwcc adco_entidad) {
		if (null == adco_entidad) {
			adco_entidad = new DocumentosCargadosOwcc();
		}

		adco_entidad.setId(adco_dto.getIs_id());
		adco_entidad.setFechaCreacion(adco_dto.getId_fechaCreacion());
		adco_entidad.setFechaModificacion(adco_dto.getId_fechaModificacion());
		adco_entidad.setIdUsuarioCreacion(adco_dto.getIs_idUsuarioCreacion());
		adco_entidad.setIdUsuarioModificacion(adco_dto.getIs_idUsuarioModificacion());
		adco_entidad.setIpCreacion(adco_dto.getIs_ipCreacion());
		adco_entidad.setIpModificacion(adco_dto.getIs_ipModificacion());
		adco_entidad.setEstereotipoCreacion(adco_dto.getIs_estereotipoCreacion());
		adco_entidad.setEstereotipoModificacion(adco_dto.getIs_estereotipoModificacion());
		adco_entidad.setIdOwcc(adco_dto.getIs_idOwcc());
		adco_entidad.setNir(adco_dto.getIs_nir());
		adco_entidad.setTipoDocumental(adco_dto.getIs_tipoDocumental());
		adco_entidad.setNombreDocumento(adco_dto.getIs_nombreDocumento());
		adco_entidad.setObservaciones(adco_dto.getIs_observaciones());
		adco_entidad.setNombreTipoDocumental(adco_dto.getIs_nombreTipoDocumental());
		return adco_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param adco_dto     el parametro dto
	 * @param adco_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         DocumentosCargadosOwcc
	 */
	public static DocumentosCargadosOwcc dtoAEntidadCompleto(DocumentosCargadosOwccDTO adco_dto,
			DocumentosCargadosOwcc adco_entidad) {
		adco_entidad = dtoAEntidadSimple(adco_dto, adco_entidad);
		return adco_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param aldco_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         DocumentosCargadosOwcc
	 */
	public static List<DocumentosCargadosOwcc> listaDtoAEntidadSimple(List<DocumentosCargadosOwccDTO> aldco_listaDto) {
		List<DocumentosCargadosOwcc> lldco_listaEntidades = new ArrayList<>();
		for (DocumentosCargadosOwccDTO ldco_dto : aldco_listaDto) {
			lldco_listaEntidades.add(dtoAEntidadSimple(ldco_dto, null));
		}
		return lldco_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param aldco_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de DocumentosCargadosOwcc
	 */
	public static List<DocumentosCargadosOwcc> listaDtoAEntidadCompleto(
			List<DocumentosCargadosOwccDTO> aldco_listaDto) {
		List<DocumentosCargadosOwcc> lldco_listaEntidades = new ArrayList<>();
		for (DocumentosCargadosOwccDTO ldco_dto : aldco_listaDto) {
			lldco_listaEntidades.add(dtoAEntidadCompleto(ldco_dto, null));
		}
		return lldco_listaEntidades;
	}
	// --- fin to Entidad

}
