package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;
/**
 * Enumeracion para definir el grupo de constantes para tipo de tramite.
 * <br>
 * Enum que contiene nombre de la lista de tipo de tramite
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoTramite {

	NUEVO_DOCUMENTACION("NUEVA_DOCUMENTACION", "Nueva documentacion bancaria"),
	SOLICITUD_PRORROGA("SOLICITUD_PRORROGA", "Solicitud de prorroga");
	
	private String is_codigo;
	private String is_nombre;
	
	private EnumTipoTramite(String as_codigo, String as_nombre) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
	}

	public static List<EnumTipoTramite> consultarTipoTramite() {
		List<EnumTipoTramite> llett_listaEnumTipoTramite = new ArrayList<>();
		for (EnumTipoTramite lett_listaEnumTipoTramite : EnumTipoTramite.values()) {
			llett_listaEnumTipoTramite.add(lett_listaEnumTipoTramite);
		}
		return llett_listaEnumTipoTramite;
	}
	
	public String getIs_codigo() {
		return is_codigo;
	}

	public String getIs_nombre() {
		return is_nombre;
	}
	
	
	
}
