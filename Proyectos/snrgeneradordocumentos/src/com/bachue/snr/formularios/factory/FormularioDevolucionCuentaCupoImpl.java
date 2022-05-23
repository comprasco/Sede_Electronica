package com.bachue.snr.formularios.factory;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioDevolucionCuentaCupoDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioDevolucionCuentaCupoImpl implements IGenericoDocumento{


	/**
	 * Metodo que permite generar modelo generico de parametros
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<FormularioDevolucionCuentaCupoDTO> llfdcc_entidades = new LinkedList<>();
		GenericoParametrosJasperDTO lgpj_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (! (afg_forumlarioGenerico instanceof FormularioDevolucionCuentaCupoDTO)) {
			throw new IllegalArgumentException();
		}

		llfdcc_entidades.add((FormularioDevolucionCuentaCupoDTO) afg_forumlarioGenerico);
		lgpj_paraemtrosGenericos.setIfg_formulario(llfdcc_entidades);
		lgpj_paraemtrosGenericos.setIhmso_parametros(generarParametros((FormularioDevolucionCuentaCupoDTO)afg_forumlarioGenerico));

		return lgpj_paraemtrosGenericos;
	}


	/**
	 * Metodo que permite generar parametros
	 * @param afg_formularioGenerico
	 * @return Map<String, Object>
	 */
	@Override
	public Map<String, Object> generarParametros(FormularioGenericoDTO afg_formularioGenerico){
		FormularioDevolucionCuentaCupoDTO lfdcc_formularioGenerico = (FormularioDevolucionCuentaCupoDTO) afg_formularioGenerico;
		HashMap<String, Object> lhmso_parametros = new HashMap<>();

		for (ArchivoDinamicoDTO lad_cuentaCupo : lfdcc_formularioGenerico.getImagenes()) {
			BufferedImage lbi_archivo = UtilidadFormulario.createImageFromBytes(UtilidadFormulario.decodificarArchivoBase64(lad_cuentaCupo.getIb_archivoBase64()));
			lhmso_parametros.put(lad_cuentaCupo.getIs_nombreArchivo(), lbi_archivo);
		}

		return lhmso_parametros;	
	}
}
