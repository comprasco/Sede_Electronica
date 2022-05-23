package com.bachue.snr.formularios.enums;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: Enum que contiene formularios.
 * 
 */
public enum EnumExtensiones {
	
	PDF("PDF",".pdf"),
	XLSX("XLSX",".xlsx");
	
	private String is_nombreExtension;
	private String is_representacion;
	
	private EnumExtensiones(String as_nombreExtension,String as_representacion) {
		this.is_nombreExtension = as_nombreExtension;
		this.is_representacion = as_representacion;
	}

	public String getIs_nombreExtension() {
		return is_nombreExtension;
	}

	public void setIs_nombreExtension(String as_nombreExtension) {
		this.is_nombreExtension = as_nombreExtension;
	}

	public String getIs_representacion() {
		return is_representacion;
	}

	public void setIs_representacion(String as_representacion) {
		this.is_representacion = as_representacion;
	}


		
}
