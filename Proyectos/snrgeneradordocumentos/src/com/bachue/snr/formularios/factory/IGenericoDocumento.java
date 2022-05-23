package com.bachue.snr.formularios.factory;

import java.util.Map;

import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public interface IGenericoDocumento {

	/**
	 * Metodo para generarparametros
	 * @param afg_forumlarioGenerico
	 * @return GenericoParametrosJasperDTO
	 */
	public GenericoParametrosJasperDTO generarGenericoParametros(FormularioGenericoDTO afg_forumlarioGenerico);
	
	/**
	 * Metodo que permite generar parametros
	 * @param afg_formularioGenerico
	 * @return
	 */
	public Map<String, Object> generarParametros(FormularioGenericoDTO afg_formularioGenerico);

}
