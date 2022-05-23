/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoSolicitudSinPago.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoSolicitudSinPago
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado solicitud sin
 * pago.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoSolicitudSinPago {

	/**
	 * Constante de la enumeracion para definir el item: Validar.
	 */
	// TODO: Quitar cuando se tenga el servicio consultar estodo solicitud
	Validar("Validar", "Validar"),
	
	/**
	 * Constante de la enumeracion para definir el item: EN_CURSO.
	 */
	EN_CURSO("EC", "En Curso"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_VERIFICACION_NO_VALIDADO.
	 */
	CODIGO_VERIFICACION_NO_VALIDADO("CODIGO VERIFICACION NO VALIDADO", "Codigo verificacion no validado"),

	/**
	 * Constante de la enumeracion para definir el item: TRAMITE.
	 */
	TRAMITE("T", "Tramite"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBACION_SOLICITUD_CUENTA_CUPO.
	 */
	APROBACION_SOLICITUD_CUENTA_CUPO("APROBACION SOLICITUD CUENTA CUPO", "APROBACION SOLICITUD CUENTA CUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBADA.
	 */
	APROBADA("SOLICITUD CUENTA CUPO APROBADA", "SOLICITUD CUENTA CUPO APROBADA"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBACION_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	APROBACION_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA("SOLICITUD DEVOLUCION CONSIGNACION ERRADA", "SOLICITUD DEVOLUCION CONSIGNACION ERRADA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBACION_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	APROBACION_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL("SOLICITUD DEVOLUCION SERVICIO REGISTRAL", "SOLICITUD DEVOLUCION SERVICIO REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: ACTIVO.
	 */
	ACTIVO("A", "ACTIVO"),
	
	/**
	 * Constante de la enumeracion para definir el item: MODIFICACION_APROBADA.
	 */
	MODIFICACION_APROBADA("MODIFICACION APROBADA", "MODIFICACION APROBADA"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVO.
	 */
	INACTIVO("I", "Inactivo"),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEADO.
	 */
	BLOQUEADO("B", "Bloqueado");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoSolicitudSinPago.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param as_descripcion el parametro descripcion
	 */
	private EnumEstadoSolicitudSinPago(String as_codigo, String as_descripcion) {
		this.is_codigo = as_codigo;
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Consultar enum por codigo.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para consultar enum por codigo retornado como
	 *         EnumEstadoSolicitudSinPago
	 */
	public static EnumEstadoSolicitudSinPago consultarEnumPorCodigo(String as_codigo) {
		for (EnumEstadoSolicitudSinPago leessp_estadoSolicitudSinPago : EnumEstadoSolicitudSinPago.values()) {
			if (leessp_estadoSolicitudSinPago.getIs_codigo().equals(as_codigo)) {
				return leessp_estadoSolicitudSinPago;
			}
		}
		return null;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}
}
