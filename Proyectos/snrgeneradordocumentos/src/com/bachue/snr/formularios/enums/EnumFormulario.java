package com.bachue.snr.formularios.enums;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: Enum que contiene formularios.
 * 
 */
public enum EnumFormulario {
	
	// FORMULARIOS CUENTA CUPO
	FORMULARIO_CREACION_CUENTA_CUPO("FORMULARIO_CREACION_CUENTA_CUPO", "form-creacionCuentaCupo.jrxml"),
	FORMULARIO_MODIFICACION_CUENTA_CUPO("FORMULARIO_MODIFICACION_CUENTA_CUPO", "form-modificacionCuentaCupos.jrxml"),
	FORMULARIO_CANCELACION_CUENTA_CUPO("FORMULARIO_CANCELACION_CUENTA_CUPO", "form-cancelacionCuentaCupos.jrxml"),
	// HISTORIAL NOTIFICACIONES
	ASUNTO_HISTORIAL_NOTIFICACIONES("ASUNTO_HISTORIAL_NOTIFICACIONES", "form-asuntoHistorialNotificaciones.jrxml"),
	// FORMULARIOS DEVOLUCIONES
	FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_NIT("FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_NIT", "form-devolucionCuentaCupos_NotaCreditoNit.jrxml"),
	FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_CC("FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_CC", "form-devolucionCuentaCupos_NotaCreditoCC.jrxml"),
	FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_NIT("FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_NIT", "form-devolucionCuentaCupos_CancelacionCuentaCupoNit.jrxml"),
	FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_CC("FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_CC", "form-devolucionCuentaCupos_CancelacionCuentaCupoCC.jrxml"),
	FORMULARIO_PRORROGA_NATURAL("FORMULARIO_PRORROGA_NATURAL", "form-solicitudProrrogaNatural.jrxml"),
	FORMULARIO_PRORROGA_JURIDICO("FORMULARIO_PRORROGA_JURIDICO", "form-solicitudProrrogaJuridico.jrxml"),
	;
	
	private String is_nombreFormulario;
	private String is_nombreArchivo;
	
	private EnumFormulario(String as_nombreFormulario, String as_nombreArchivo) {
		this.is_nombreFormulario = as_nombreFormulario;
		this.is_nombreArchivo = as_nombreArchivo;
	}

	public String getIs_nombreFormulario() {
		return is_nombreFormulario;
	}

	public void setIs_nombreFormulario(String as_nombreFormulario) {
		this.is_nombreFormulario = as_nombreFormulario;
	}

	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}

	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
	}
		
}
