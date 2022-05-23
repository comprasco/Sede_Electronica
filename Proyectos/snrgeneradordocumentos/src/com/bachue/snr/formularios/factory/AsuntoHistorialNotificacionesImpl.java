package com.bachue.snr.formularios.factory;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.entrada.AsuntoHistorialNotificacionesDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class AsuntoHistorialNotificacionesImpl implements IGenericoDocumento {

	/**
	 * Metodo que permite generar modelo generico de parametros
	 * 
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<AsuntoHistorialNotificacionesDTO> llahn_asuntoHistorialNotificacionesDto = new LinkedList<>();
		GenericoParametrosJasperDTO lgpg_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (!(afg_forumlarioGenerico instanceof AsuntoHistorialNotificacionesDTO)) {
			throw new IllegalArgumentException();
		}

		llahn_asuntoHistorialNotificacionesDto.add((AsuntoHistorialNotificacionesDTO) afg_forumlarioGenerico);
		lgpg_paraemtrosGenericos.setIfg_formulario(llahn_asuntoHistorialNotificacionesDto);
		lgpg_paraemtrosGenericos
				.setIhmso_parametros(generarParametros((AsuntoHistorialNotificacionesDTO) afg_forumlarioGenerico));

		return lgpg_paraemtrosGenericos;
	}

	/**
	 * Metodo que permite generar parametros
	 * 
	 * @param afg_formularioGenerico
	 * @return Map<String, Object>
	 */
	@Override
	public Map<String, Object> generarParametros(FormularioGenericoDTO afg_formularioGenerico) {
		AsuntoHistorialNotificacionesDTO lahn_asuntoHistorialNotificacionesDto = (AsuntoHistorialNotificacionesDTO) afg_formularioGenerico;

		HashMap<String, Object> lhmso_parametros = new HashMap<>();

		for (ArchivoDinamicoDTO lad_archivoDinamicoDto : lahn_asuntoHistorialNotificacionesDto.getArchivo()) {
			BufferedImage lbi_archivo = UtilidadFormulario.createImageFromBytes(
					UtilidadFormulario.decodificarArchivoBase64(lad_archivoDinamicoDto.getIb_archivoBase64()));
			lhmso_parametros.put(lad_archivoDinamicoDto.getIs_nombreArchivo(), lbi_archivo);
		}

		return lhmso_parametros;
	}
}
