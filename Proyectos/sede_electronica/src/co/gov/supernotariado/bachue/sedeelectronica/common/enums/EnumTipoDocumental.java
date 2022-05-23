/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoDocumental.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoDocumental
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo documental. <br>
 * Enum que contiene los tipos documentales
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoDocumental implements ICatalogable {
	
	/**
	 * Constante de la enumeracion para definir el item: PODER.
	 */
	PODER("36","PODER"),
	
	/**
	 * Constante de la enumeracion para definir el item: CAMARA_COMERCIO.
	 */
	CAMARA_COMERCIO("70","CERTIFICADODECAMARADECOMERCIO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_CREACION.
	 */
	FORMULARIO_SOLICITUD_CREACION("69","FORMULARIOSOLICITUDCUENTACUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_CANCELACION.
	 */
	FORMULARIO_SOLICITUD_CANCELACION("","FORMULARIO_SOLICITUD_CANCELACION"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_MODIFICACION.
	 */
	// Tipo documental para documento formulario cuenta cupo
	FORMULARIO_SOLICITUD_MODIFICACION("","FORMULARIO_MODIFICACION_CUENTA_CUPO"),
	
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * FORMULARIO_SOLICITUD_PRORROGA.
	 */
	// Tipo documental para documento solicitud prorroga
	FORMULARIO_SOLICITUD_PRORROGA("","FORMULARIO_SOLICITUD_PRORROGA"), 
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * DEVOLUCION_CUENTA_CUPO.
	 */
	DEVOLUCION_CUENTA_CUPO("","DEVOLUCION_CUENTA_CUPO"), 
	OFICIO("32","OFICIO"),
	;
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private final String is_tipoDocumental;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoDocumental.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumTipoDocumental(String as_codigo,String as_tipoDocumental) {
		this.is_codigo = as_codigo;
		this.is_tipoDocumental = as_tipoDocumental;
	}

	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.enums.ICatalogable#
	 * getIs_codigo()
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

}