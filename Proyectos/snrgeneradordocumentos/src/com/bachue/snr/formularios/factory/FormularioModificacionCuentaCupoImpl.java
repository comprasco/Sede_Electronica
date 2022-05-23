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
import com.bachue.snr.formularios.dto.entrada.FormularioModificacionCuentaCupoDTO;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioModificacionCuentaCupoImpl implements IGenericoDocumento {

	/**
	 * Metodo que permite generar modelo generico de parametros
	 * 
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	@Override
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico) {

		List<FormularioModificacionCuentaCupoDTO> llfccc_entidades = new LinkedList<>();
		GenericoParametrosJasperDTO lgpg_paraemtrosGenericos = new GenericoParametrosJasperDTO();

		if (!(afg_forumlarioGenerico instanceof FormularioModificacionCuentaCupoDTO)) {
			throw new IllegalArgumentException();
		}

		llfccc_entidades.add((FormularioModificacionCuentaCupoDTO) afg_forumlarioGenerico);
		lgpg_paraemtrosGenericos.setIfg_formulario(llfccc_entidades);
		lgpg_paraemtrosGenericos
				.setIhmso_parametros(generarParametros((FormularioModificacionCuentaCupoDTO) afg_forumlarioGenerico));

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
		FormularioModificacionCuentaCupoDTO lfg_formularioGenerico = (FormularioModificacionCuentaCupoDTO) afg_formularioGenerico;
		DecimalFormat ldf_montoSolMax = new DecimalFormat("$,###");
		if (lfg_formularioGenerico.getMaxsolicitado() == null) {
			lfg_formularioGenerico.setMaxsolicitado("0");
		} else {
			Double ld_montoSolMax = Double.parseDouble(lfg_formularioGenerico.getMaxsolicitado());
			lfg_formularioGenerico.setMaxsolicitado(ldf_montoSolMax.format(ld_montoSolMax));
		}
		
		DecimalFormat ldf_montoSolMin = new DecimalFormat("$,###");
		if (lfg_formularioGenerico.getMinsolicitado() == null) {
			lfg_formularioGenerico.setMinsolicitado("0");
		} else {
			Double ld_montoSolMin = Double.parseDouble(lfg_formularioGenerico.getMinsolicitado());
			lfg_formularioGenerico.setMinsolicitado(ldf_montoSolMin.format(ld_montoSolMin));
		}
		
		DecimalFormat ldf_montoPerMax = new DecimalFormat("$,###");
		if (lfg_formularioGenerico.getMinpermitido() == null) {
			lfg_formularioGenerico.setMinpermitido("0");
		} else {
			Double ld_montoPerMax = Double.parseDouble(lfg_formularioGenerico.getMinpermitido());
			lfg_formularioGenerico.setMinpermitido(ldf_montoPerMax.format(ld_montoPerMax));
		}
		DecimalFormat ldf_montoPerMin = new DecimalFormat("$,###");
		if (lfg_formularioGenerico.getMaxpermitido() == null) {
			lfg_formularioGenerico.setMaxpermitido("0");
		} else {
			Double ld_montoPerMin = Double.parseDouble(lfg_formularioGenerico.getMaxpermitido());
			lfg_formularioGenerico.setMaxpermitido(ldf_montoPerMin.format(ld_montoPerMin));
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
