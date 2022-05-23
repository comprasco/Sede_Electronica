package com.bachue.snr.formularios.factory;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioProrrogaDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioProrrogaImpl implements IGenericoDocumento {

	/**
	 * Metodo que permite generar modelo generico de parametros
	 * 
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<FormularioProrrogaDTO> llfp_entidades = new LinkedList<>();
		GenericoParametrosJasperDTO lgpg_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (!(afg_forumlarioGenerico instanceof FormularioProrrogaDTO)) {
			throw new IllegalArgumentException();
		}

		llfp_entidades.add((FormularioProrrogaDTO) afg_forumlarioGenerico);
		lgpg_paraemtrosGenericos.setIfg_formulario(llfp_entidades);
		lgpg_paraemtrosGenericos
				.setIhmso_parametros(generarParametros((FormularioProrrogaDTO) afg_forumlarioGenerico));

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
		FormularioProrrogaDTO lfg_formularioGenerico = (FormularioProrrogaDTO) afg_formularioGenerico;
		
		HashMap<String, Object> lhmso_parametros = new HashMap<>();

		for (ArchivoDinamicoDTO lad_prorroga : lfg_formularioGenerico.getArchivo()) {
			BufferedImage lbi_archivo = UtilidadFormulario.createImageFromBytes(
					UtilidadFormulario.decodificarArchivoBase64(lad_prorroga.getIb_archivoBase64()));
			lhmso_parametros.put(lad_prorroga.getIs_nombreArchivo(), lbi_archivo);
		}

		return lhmso_parametros;
	}
}
