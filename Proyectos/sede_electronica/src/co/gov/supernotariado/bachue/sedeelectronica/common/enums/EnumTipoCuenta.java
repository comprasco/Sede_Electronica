package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;
/**
 * Enumeracion para definir el grupo de constantes para tipo de cuenta bancaria.
 * <br>
 * Enum que contiene nombre de la lista de tipo de cuenta bancaria
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoCuenta {

	AHORRO("AHORRO","Ahorro"),
	CORRIENTE("CORRIENTE", "Corriente");
	
	private String is_codigo;
	private String is_nombre;
	
	
	private EnumTipoCuenta(String as_codigo, String as_nombre) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
	}

	public static List<EnumTipoCuenta> consultarTipoCuenta() {
		List<EnumTipoCuenta> lletc_listaEnumTipoCuenta = new ArrayList<>();
		for (EnumTipoCuenta letc_listaEnumTipoCuenta : EnumTipoCuenta.values()) {
			lletc_listaEnumTipoCuenta.add(letc_listaEnumTipoCuenta);
		}
		return lletc_listaEnumTipoCuenta;
	}
	
	public String getIs_codigo() {
		return is_codigo;
	}


	public String getIs_nombre() {
		return is_nombre;
	}
	
	
}
