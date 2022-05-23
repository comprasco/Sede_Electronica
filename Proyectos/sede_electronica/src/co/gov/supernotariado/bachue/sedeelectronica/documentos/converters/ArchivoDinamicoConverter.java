/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoDinamicoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.documentos.converters
 * Nombre del elemento: ArchivoDinamicoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.documentos.converters;

import java.util.ArrayList;
import java.util.List;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Archivo
 * dinamico. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ArchivoDinamicoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ArchivoDinamicoConverter.
	 */
	private ArchivoDinamicoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Dto A formulario dto.
	 *
	 * @param aad_archivosDinamicosDto el parametro archivos dinamicos dto
	 * @return Resultado para dto A formulario dto retornado como ArchivoDinamicoDTO
	 */
	public static ArchivoDinamicoDTO dtoAFormularioDto(ArchivosDinamicosDTO aad_archivosDinamicosDto) {

		ArchivoDinamicoDTO lad_archivoDinamicoDto = new ArchivoDinamicoDTO();
		lad_archivoDinamicoDto.setIb_imagenBase64(aad_archivosDinamicosDto.getIb_archivoBase64());
		lad_archivoDinamicoDto.setIs_extension(aad_archivosDinamicosDto.getIs_extension());
		lad_archivoDinamicoDto.setIs_nombreArchivo(aad_archivosDinamicosDto.getIs_nombreArchivo());

		return lad_archivoDinamicoDto;
	}

	/**
	 * Lista dto A formulario dto.
	 *
	 * @param lad_listaArchivosDinamicosDto el parametro lad lista archivos
	 *                                      dinamicos dto
	 * @return Resultado para lista dto A formulario dto retornado como una lista de
	 *         ArchivoDinamicoDTO
	 */
	public static List<ArchivoDinamicoDTO> listaDtoAFormularioDto(
			List<ArchivosDinamicosDTO> lad_listaArchivosDinamicosDto) {
		List<ArchivoDinamicoDTO> llad_archivos = new ArrayList<>();
		for (ArchivosDinamicosDTO archivosDinamicosDTO : lad_listaArchivosDinamicosDto) {
			llad_archivos.add(dtoAFormularioDto(archivosDinamicosDTO));
		}
		return llad_archivos;
	}

}
