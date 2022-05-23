/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoCatalogo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoCatalogo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo catalogo. <br>
 * Enum que contiene los tipo catalogo de relacionados en BD (Base de datos)<br>
 * Se relacionan con valores de Tipo catalogo en la base de datos, por el codigo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoCatalogo {

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_DATOS_BASICOS_MATRICULA.
	 */
	TIPO_DATOS_BASICOS_MATRICULA("TIPO_DATOS_BASICOS_MATRICULA"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_IDENTIFICACION_PREDIO.
	 */
	TIPO_IDENTIFICACION_PREDIO("TIPO_IDENTIFICACION_PREDIO"),

	/**
	 * Constante de la enumeracion para definir el item: CORRECCION.
	 */
	CORRECCION("TIPO_CORRECCION"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESISTIMIENTO.
	 */
	DESISTIMIENTO("TIPO_DESISTIMIENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRORROGA.
	 */
	PRORROGA("TIPO_PRORROGA"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVACION.
	 */
	INACTIVACION("TIPO_INACTIVACION"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA.
	 */
	CONSULTA("TIPO_CONSULTA"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD.
	 */
	SOLICITUD("TIPO_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_SOLICITUD.
	 */
	ESTADO_SOLICITUD("TIPO_ESTADO_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA.
	 */
	ALERTA("TIPO_ALERTA"),

	/**
	 * Constante de la enumeracion para definir el item: UNIDAD_PARAMETRO.
	 */
	UNIDAD_PARAMETRO("TIPO_UNIDAD_PARAMETRO"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO.
	 */
	CERTIFICADO("TIPO_CERTIFICADO"),

	/**
	 * Constante de la enumeracion para definir el item: PERSONA_INTERNA.
	 */
	PERSONA_INTERNA("TIPO_PERSONA_INTERNA"),

	/**
	 * Constante de la enumeracion para definir el item: PERSONA.
	 */
	PERSONA("TIPO_PERSONA"),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD_ESPECIAL.
	 */
	ENTIDAD_ESPECIAL("TIPO_ENTIDAD_ESPECIAL"),

	/**
	 * Constante de la enumeracion para definir el item: VARIABLE.
	 */
	VARIABLE("TIPO_VARIABLE"),

	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL.
	 */
	RAZON_SOCIAL("TIPO_RAZON_SOCIAL"),

	/**
	 * Constante de la enumeracion para definir el item: GENERO.
	 */
	GENERO("TIPO_GENERO"),

	/**
	 * Constante de la enumeracion para definir el item: ORGANIZACION.
	 */
	ORGANIZACION("TIPO_ORGANIZACION"),

	/**
	 * Constante de la enumeracion para definir el item: PARTIDA.
	 */
	PARTIDA("TIPO_PARTIDA"),

	/**
	 * Constante de la enumeracion para definir el item: PREDIO.
	 */
	PREDIO("TIPO_PREDIO"),

	/**
	 * Constante de la enumeracion para definir el item: LIBRO.
	 */
	LIBRO("TIPO_LIBRO"),

	/**
	 * Constante de la enumeracion para definir el item: AUTENTICACION.
	 */
	AUTENTICACION("TIPO_AUTENTICACION"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_CUENTA_CUPO.
	 */
	ESTADO_CUENTA_CUPO("TIPO_ESTADO_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_CUENTA_CUPO.
	 */
	DOCUMENTO_CUENTA_CUPO("TIPO_DOCUMENTO_CUENTA_CUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTOS_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	TIPO_DOCUMENTOS_DEVOLUCION_CONSIGNACION_ERRADA("TIPO_DOCUMENTOS_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTOS_DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	TIPO_DOCUMENTOS_DEVOLUCION_SERVICIO_REGISTRAL("TIPO_DOCUMENTOS_DEVOLUCION_SERVICIO_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: PARAMETRIZACION_ALCADIA.
	 */
	PARAMETRIZACION_ALCADIA("TIPO_PARAMETRIZACION_ALCALDIA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTOS_DEVOLUCION_CUENTA_CUPO.
	 */
	TIPO_DOCUMENTOS_DEVOLUCION_CUENTA_CUPO("TIPO_DOCUMENTOS_DEVOLUCION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: PERMISO.
	 */
	PERMISO("TIPO_PERMISO"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CUENTA_CUPO.
	 */
	SOLICITUD_CUENTA_CUPO("TIPO_SOLICITUD_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: RECARGA_CUENTA_CUPO.
	 */
	RECARGA_CUENTA_CUPO("TIPO_RECARGA_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_ENTIDAD_ESPECIAL_CE.
	 */
	TIPO_ENTIDAD_ESPECIAL_CE("TIPO_ENTIDAD_ESPECIAL_CE"),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD_ESPECIAL_CE.
	 */
	ENTIDAD_ESPECIAL_CE("EECE"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTAL.
	 */
	TIPO_DOCUMENTAL("TIPO_DOCUMENTAL"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_ALERTA_TIERRAS.
	 */
	ESTADO_ALERTA_TIERRAS("TIPO_ESTADO_ALERTA_TIERRAS"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_ACTIVIDAD.
	 */
	ESTADO_ACTIVIDAD("TIPO_ESTADO_ACTIVIDAD"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_PODER.
	 */
	TIPO_DOCUMENTO_PODER("TIPO_DOCUMENTO_PODER"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PODER.
	 */
	TIPO_PODER("TIPO_PODER"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PREDIO_MATRICULA.
	 */
	TIPO_PREDIO_MATRICULA("TIPO_PREDIO_MATRICULA"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PODER_DOCUMENTO.
	 */
	TIPO_PODER_DOCUMENTO("TIPO_PODER_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITUD_MODIFICACION_CUENTA_CUPO.
	 */
	SOLICITUD_MODIFICACION_CUENTA_CUPO("TIPO_SOLICITUD_MODIFICACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: SUSPENSION.
	 */
	SUSPENSION("TIPO_SOLICITUD_SUSPENSION_TEMPORAL"),

	
	/**
	 * Constante de la enumeracion para definir el item:
	 * DOCUMENTOS_MODIFICACION_CUENTA_CUPO.
	 */
	DOCUMENTOS_MODIFICACION_CUENTA_CUPO("TIPO_DOCUMENTOS_MODIFICACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_FORMULARIO_MODIFICACION_CUENTA_CUPO.
	 */
	TIPO_FORMULARIO_MODIFICACION_CUENTA_CUPO("TIPO_FORMULARIO_MODIFICACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_DOCUMENTO_CANCELACION_CUENTA_CUPO.
	 */
	TIPO_DOCUMENTO_CANCELACION_CUENTA_CUPO("TIPO_DOCUMENTO_CANCELACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_DOCUMENTO_ALERTA_TIERRAS.
	 */
	TIPO_DOCUMENTO_ALERTA_TIERRAS("TIPO_DOCUMENTO_ALERTA_TIERRAS"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_CONSULTA_DRR.
	 */
	TIPO_CONSULTA_DRR("TIPO_CONSULTA_DRR"),
	
	TIPO_INTERPOSICION_RECURSOS("TIPO_INTERPOSICION_RECURSOS"),
	
	TIPO_TRASLADO_MATRICULA("TIPO_TRASLADO_MATRICULA"),
	
	TIPO_DEVOLUCION_CONSIGNACION_ERRADA("TIPO_DEVOLUCION_CONSIGNACION_ERRADA"), 
	
	TIPO_PODER_CREACION("TIPO_PODER_CREACION")
	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoCatalogo.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumTipoCatalogo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
}
