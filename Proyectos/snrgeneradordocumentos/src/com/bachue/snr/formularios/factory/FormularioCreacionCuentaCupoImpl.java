package com.bachue.snr.formularios.factory;

import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioCreacionCuentaCupoDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioCreacionCuentaCupoImpl implements IGenericoDocumento {

	/**
	 * Metodo que permite generar modelo generico de parametros
	 * 
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<FormularioCreacionCuentaCupoDTO> llfccc_entidades = new LinkedList<>();
		GenericoParametrosJasperDTO lgpg_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (!(afg_forumlarioGenerico instanceof FormularioCreacionCuentaCupoDTO)) {
			throw new IllegalArgumentException();
		}

		llfccc_entidades.add((FormularioCreacionCuentaCupoDTO) afg_forumlarioGenerico);
		lgpg_paraemtrosGenericos.setIfg_formulario(llfccc_entidades);
		lgpg_paraemtrosGenericos
				.setIhmso_parametros(generarParametros((FormularioCreacionCuentaCupoDTO) afg_forumlarioGenerico));

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
		FormularioCreacionCuentaCupoDTO lfg_formularioGenerico = (FormularioCreacionCuentaCupoDTO) afg_formularioGenerico;
		DecimalFormat ldf_monto = new DecimalFormat("$,###");
		if (lfg_formularioGenerico.getMontoSolicitud() == null) {
			lfg_formularioGenerico.setMontoSolicitud("0");
		} else {
			Double ld_monto = Double.parseDouble(lfg_formularioGenerico.getMontoSolicitud());
			lfg_formularioGenerico.setMontoSolicitud(ldf_monto.format(ld_monto));
		}

		HashMap<String, Object> lhmso_parametros = new HashMap<>();

		for (ArchivoDinamicoDTO lafcc_cuentaCupo : lfg_formularioGenerico.getArchivo()) {
			BufferedImage lbi_archivo = UtilidadFormulario.createImageFromBytes(
					UtilidadFormulario.decodificarArchivoBase64(lafcc_cuentaCupo.getIb_archivoBase64()));
			lhmso_parametros.put(lafcc_cuentaCupo.getIs_nombreArchivo(), lbi_archivo);
		}

		return lhmso_parametros;
	}
}
