package com.bachue.snr.formularios.factory;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioCancelacionCuentaCupoDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioCancelacionCuentaCupoImpl implements IGenericoDocumento{


	/**
	 * Metodo que permite generar modelo generico de parametros
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<FormularioCancelacionCuentaCupoDTO> llfccc_entidades = new LinkedList<>();
		GenericoParametrosJasperDTO lgpg_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (! (afg_forumlarioGenerico instanceof FormularioCancelacionCuentaCupoDTO)) {
			throw new IllegalArgumentException();
		}

		llfccc_entidades.add((FormularioCancelacionCuentaCupoDTO) afg_forumlarioGenerico);
		lgpg_paraemtrosGenericos.setIfg_formulario(llfccc_entidades);
		lgpg_paraemtrosGenericos.setIhmso_parametros(generarParametros((FormularioCancelacionCuentaCupoDTO)afg_forumlarioGenerico));

		return lgpg_paraemtrosGenericos;
	}


	/**
	 * Metodo que permite generar parametros
	 * @param afg_formularioGenerico
	 * @return Map<String, Object>
	 */
	@Override
	public Map<String, Object> generarParametros(FormularioGenericoDTO afg_formularioGenerico){
		FormularioCancelacionCuentaCupoDTO lfg_formularioGenerico = (FormularioCancelacionCuentaCupoDTO) afg_formularioGenerico;
		HashMap<String, Object> lhmso_parametros = new HashMap<>();

		for (ArchivoDinamicoDTO lafcc_cuentaCupo : lfg_formularioGenerico.getArchivo()) {
			BufferedImage lbi_archivo = UtilidadFormulario.createImageFromBytes(UtilidadFormulario.decodificarArchivoBase64(lafcc_cuentaCupo.getIb_archivoBase64()));
			lhmso_parametros.put(lafcc_cuentaCupo.getIs_nombreArchivo(), lbi_archivo);
		}

		return lhmso_parametros;	
	}
}
