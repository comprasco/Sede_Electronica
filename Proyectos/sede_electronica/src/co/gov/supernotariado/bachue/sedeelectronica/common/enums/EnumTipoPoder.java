package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipos de poder.<br>
 * Enum que contiene los datos enviados a js para tipos de poder
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoPoder {
	PODER_ESPECIAL("PODER_ESPECIAL","Poder Especial"),
	PODER_GENERAL("GENERALES","Poder General"),
	;
 
	private String is_codigo;
	private String is_nombreVisible;
	
	private EnumTipoPoder(String as_codigo,String as_nombreVisible) {
		this.is_codigo = as_codigo;
		this.is_nombreVisible = as_nombreVisible;
	}

	public String getIs_codigo() {
		return is_codigo;
	}

	public String getIs_nombreVisible() {
		return is_nombreVisible;
	}
	
}