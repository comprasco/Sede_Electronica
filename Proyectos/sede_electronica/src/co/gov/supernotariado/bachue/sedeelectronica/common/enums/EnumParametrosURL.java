/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosURL.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumParametrosURL
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Parametros URL. <br>
 * Enum que contiene los parametros (Query params) tanto para el envio como para la abstraccion
 * de variables por path de la URL
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosURL {

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_PARAMETRO.
	 */
	// Parametros de envio por path
	ALERTA_PARAMETRO("?alerta="),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_MATRICULA_PARAMETRO.
	 */
	// Parametros de envio por path
	NUMERO_MATRICULA_PARAMETRO("numeroMatricula="),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_MATRICULA_PARAMETRO.
	 */
	// Parametros de envio por path
	NUMERO_PREDIO_PARAMETRO("&numeroPredio="),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO_PARAMETRO.
	 */
	BLOQUEO_PARAMETRO("?bloqueo="),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO_PARAMETRO_ADMIN.
	 */
	BLOQUEO_PARAMETRO_ADMIN("?bloqueoAdmin="),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONFIRMACION_SESION_PARAMETRO.
	 */
	CONFIRMACION_SESION_PARAMETRO("?confirmacionSesion="),

	/**
	 * Constante de la enumeracion para definir el item: ERROR_PARAMETRO.
	 */
	ERROR_PARAMETRO("?error="),

	/**
	 * Constante de la enumeracion para definir el item: ID_PARAMETRO.
	 */
	ID_PARAMETRO("?id="),
	
	/**
	 * Constante de la enumeracion para definir el item: ID_PARAMETRO.
	 */
	NIR("nir"),

	APODERADO("ib_apoderado"),
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO_PARAMETRO.
	 */
	NUMERO_DOCUMENTO_PARAMETRO("?numeroDocumento="),

	/**
	 * Constante de la enumeracion para definir el item: ORGANIZACION_PARAMETRO.
	 */
	ORGANIZACION_PARAMETRO("?orgIncorrecta="),
	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_PAGO.
	 */
	REFERENCIA_PAGO("&is_referencia="), 

	/**
	 * Constante de la enumeracion para definir el item: RESUMEN_PAGO.
	 */
	RESUMEN_PAGO("?is_nir="),
	
	/**
	 * Constante de la enumeracion para definir el item: PENDIENTES_PAGO.
	 */
	PENDIENTES_PAGO("&is_resumen=1"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_PARAMETRO.
	 */
	TIPO_DOCUMENTO_PARAMETRO("&tipoDocumento="),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_SUBSERVICIO.
	 */
	TIPO_SUBSERVICIO("?as_codigoSubServicio="),

	/**
	 * Constante de la enumeracion para definir el item: TOKEN_PARAMETRO.
	 */
	TOKEN_PARAMETRO("?apiToken="),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO_PARAMETRO.
	 */
	USUARIO_PARAMETRO("?usuario="),

	/**
	 * Constante de la enumeracion para definir el item: AFIRMACION.
	 */
	// Parametros de consulta por path
	AFIRMACION("SI"),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA.
	 */
	ALERTA("alerta"),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO.
	 */
	BLOQUEO("bloqueo"),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO_ADMIN.
	 */
	BLOQUEO_ADMIN("bloqueoAdmin"),

	/**
	 * Constante de la enumeracion para definir el item: CARRITO.
	 */
	CARRITO("?as_id="),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO.
	 */
	CODIGO("codigo"),

	/**
	 * Constante de la enumeracion para definir el item: CONFIRMACION_SESION.
	 */
	CONFIRMACION_SESION("confirmacionSesion"),

	/**
	 * Constante de la enumeracion para definir el item: CONVENIO.
	 */
	CONVENIO("listaConvenio"),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD.
	 */
	ENTIDAD("listaEntidaEspecial"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR.
	 */
	ERROR("error"),

	/**
	 * Constante de la enumeracion para definir el item: ID.
	 */
	ID("id"),

	/**
	 * Constante de la enumeracion para definir el item: ID_PARAMETRO_VIGENCIA.
	 */
	ID_PARAMETRO_VIGENCIA("as_id"),

	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_USUARIO.
	 */
	NOMBRE_USUARIO("nombreUsuario"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO.
	 */
	NUMERO_DOCUMENTO("numeroDocumento"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO_D.
	 */
	NUMERO_DOCUMENTO_D("numeroDocumentoD"),

	/**
	 * Constante de la enumeracion para definir el item: ORGANIZACION_INCORRECTA.
	 */
	ORGANIZACION_INCORRECTA("orgIncorrecta"),

	/**
	 * Constante de la enumeracion para definir el item: PERSONA_JURIDICA.
	 */
	PERSONA_JURIDICA("J"),

	/**
	 * Constante de la enumeracion para definir el item: ROL_USUARIO.
	 */
	ROL_USUARIO("rolUsuario"),

	/**
	 * Constante de la enumeracion para definir el item: SERVICIO.
	 */
	SERVICIO("servicio"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO.
	 */
	TIPO_DOCUMENTO("tipoDocumentoUsuarioSelect_input"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_EE.
	 */
	TIPO_DOCUMENTO_EE("tipoDocumento"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_INGRESO_EE.
	 */
	TIPO_INGRESO_EE("tipoEntidadSelect_input"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA.
	 */
	TIPO_PERSONA("tipoPersonaSelect_input"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA_SELECT.
	 */
	TIPO_PERSONA_SELECT("tipoPersonaSelect_input"),

	/**
	 * Constante de la enumeracion para definir el item: TOKEN.
	 */
	TOKEN("apiToken"),

	/**
	 * Constante de la enumeracion para definir el item: USER.
	 */
	USER("user"),
	/**
	 * Constante de la enumeracion para definir el item: tipo.
	 */
	TIPO("tipo"),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_ENTIDAD.
	 */
	CODIGO_ENTIDAD("codigoEntidad"), 
	CRITERIO_PARAMETRO("criterio="),
	NUMERO_PARAMETRO("numero="),
	NUMERO("numero"),
	CRITERIO("criterio"),
	TIPO_PARAMETRO("?tipo="),
	RESULTADO_PARAMETRO("?resultado="),
	RESULTADO("resultado"),
	IDENTIFICADOR_SOLICITUD("idSolicitud"),
	INDENTIFICADOR_PODER("idPoder"),
	VERSION_PODER("idVersion"),
	TIPO_PROCESO("is_tipoProceso"), 
	TURNO("is_turno"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre parametro.
	 */
	private final String is_nombreParametro;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumParametrosURL.
	 *
	 * @param is_nombreParametro el parametro nombre parametro
	 */
	private EnumParametrosURL(String is_nombreParametro) {
		this.is_nombreParametro = is_nombreParametro;
	}

	/**
	 * Obtiene el valor para la propiedad nombre parametro.
	 *
	 * @return El valor de la propiedad nombre parametro
	 */
	public String getIs_nombreParametro() {
		return is_nombreParametro;
	}

}
