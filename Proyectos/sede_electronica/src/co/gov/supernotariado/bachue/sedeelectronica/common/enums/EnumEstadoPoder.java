package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Estado poder. <br>
 * Enum que contiene estados posibles de la columna activo de poder
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoPoder {
	
	ACTIVO("ACTIVO","Activo"),
	INACTIVO("INACTIVO","Inactivo"),
	CADUCADO("CADUCADO","Caducado"),
	ANULADO("ANULADO","Anulado")
	;
	
	private String is_codigo;
	private String is_nombreVisible;
	
	private EnumEstadoPoder(String as_codigo, String as_nombreVisible) {
		this.is_codigo = as_codigo;
		this.is_nombreVisible = as_nombreVisible;
	}

	public String getIs_codigo() {
		return is_codigo;
	}

	public String getIs_nombreVisible() {
		return is_nombreVisible;
	}
	
	public static List<EnumEstadoPoder> consultarEstadosPoder(){
		List<EnumEstadoPoder> lleep_listaEnumEstadoPoder = new ArrayList<>();
		for(EnumEstadoPoder leep_enumEstadoPoder :EnumEstadoPoder.values()) {
			lleep_listaEnumEstadoPoder.add(leep_enumEstadoPoder);
		}
		return lleep_listaEnumEstadoPoder;
	}
}
