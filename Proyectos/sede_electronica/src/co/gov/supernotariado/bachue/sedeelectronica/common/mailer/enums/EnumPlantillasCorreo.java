/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumPlantillasCorreo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums
 * Nombre del elemento: EnumPlantillasCorreo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums;

/**
 * Enumeracion para definir el grupo de constantes para Plantillas correo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumPlantillasCorreo implements IEnumPlantillasCorreo{

	/**
	 * Constante de la enumeracion para definir el item: RECUPERACION_CONTRASENA.
	 */
	RECUPERACION_CONTRASENA("RECUPERACION_CONTRASENA","Recuperacion Contrasena"), 
	
	/**
	 * Constante de la enumeracion para definir el item: RECUPERACION_CONTRASENA.
	 */
	ACTUALIZACION_PODER("ACTUALIZACION_PODER","Actualizacion Poder"), 
	
	/**
	 * Constante de la enumeracion para definir el item: ACTIVACION_PERSONA_NATURAL.
	 */
	ACTIVACION_PERSONA_NATURAL("ACTIVACION_PERSONA_NATURAL","Activacion persona natural"), 
	
	/**
	 * Constante de la enumeracion para definir el item: ACTIVACION_PERSONA_JURIDICA.
	 */
	CREACION_PERSONA_JURIDICA("CREACION_PERSONA_JURIDICA","Creacion persona juridica"), 
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * CREACION_USUARIO_ADMINISTRADOR.
	 */
	CREACION_USUARIO_ADMINISTRADOR("CREACION_USUARIO_ADMINISTRADOR", "Creacion de usuario administrador"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBACION_PERSONA_JURIDICA.
	 */
	APROBACION_PERSONA_JURIDICA("APROBACION_PERSONA_JURIDICA","Aprobacion persona juridica"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * APROBACION_ENTIDAD_ESPECIAL.
	 */
	APROBACION_ENTIDAD_ESPECIAL("APROBACION_ENTIDAD_ESPECIAL","Aprobacion entidad especial"),
	
	/**
	 * Constante de la enumeracion para definir el item: ASOCIACION_PN_EE_ADMON.
	 */
	ASOCIACION_PN_EE_ADMON("ASOCIACION_PN_EE_ADMON","Asociacion persona natural a entidad especial administrador"),
	
	/**
	 * Constante de la enumeracion para definir el item: ASOCIACION_PN_EE_USU.
	 */
	ASOCIACION_PN_EE_USU("ASOCIACION_PN_EE_USU","Asociacion persona natural a entidad especial usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: ASOCIACION_PN_PJ_ADMON.
	 */
	ASOCIACION_PN_PJ_ADMON("ASOCIACION_PN_PJ_ADMON","Asociacion persona natural a persona juridica especial administrador"),
	
	/**
	 * Constante de la enumeracion para definir el item: ASOCIACION_PN_PJ_USU.
	 */
	ASOCIACION_PN_PJ_USU("ASOCIACION_PN_PJ_USU","Asociacion persona natural a persona juridica usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESASOCIACION_PN_EE_ADMON.
	 */
	DESASOCIACION_PN_EE_ADMON("DESASOCIACION_PN_EE_ADMON","desasociar pn a entidad especial admon"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESASOCIACION_PN_EE_USU.
	 */
	DESASOCIACION_PN_EE_USU("DESASOCIACION_PN_EE_USU","Desasociar pn a entidad especial usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESASOCIACION_PN_PJ_ADMON.
	 */
	DESASOCIACION_PN_PJ_ADMON("DESASOCIACION_PN_PJ_ADMON","Desasociar pn a persona juridica admon"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESASOCIACION_PN_PJ_USU.
	 */
	DESASOCIACION_PN_PJ_USU("DESASOCIACION_PN_PJ_USU","Desasociar pn a persona juridica usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: RECHAZO_PJ.
	 */
	RECHAZO_PJ("RECHAZO_PJ","Rechazo de persona juridica"),
	
	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO_PJ.
	 */
	BLOQUEO_PJ("BLOQUEO_PJ","Bloqueo de persona juridica"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESBLOQUEO_PJ.
	 */
	DESBLOQUEO_PJ("DESBLOQUEO_PJ","Desbloqueo de persona juridica"),
	
	/**
	 * Constante de la enumeracion para definir el item: BLOQUEO_EE.
	 */
	BLOQUEO_EE("BLOQUEO_EE","Bloqueo de entidad especial"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESBLOQUEO_EE.
	 */
	DESBLOQUEO_EE("DESBLOQUEO_EE","Desbloqueo de entidad especial"),
	
	/**
	 * Constante de la enumeracion para definir el item: RESPUESTA_SOLICITUD_INTERNA_PODERES.
	 */
	RESPUESTA_SOLICITUD_INTERNA_PODERES("RESPUESTA_SOLICITUD_INTERNA_PODERES","Respuesta solicitud interna de poderes"),
	
	CREACION_SOLICITUD_INTERNA("CREACION_SOLICITUD_INTERNA","Alerta de solicitud interna creada");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo planilla.
	 */
	String is_codigoPlanilla;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre plantilla.
	 */
	String is_nombrePlantilla; 
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumPlantillasCorreo.
	 *
	 * @param as_codigoPlanilla  el parametro codigo planilla
	 * @param as_nombrePlantilla el parametro nombre plantilla
	 */
	private EnumPlantillasCorreo(String as_codigoPlanilla, String as_nombrePlantilla) {
		this.is_nombrePlantilla = as_nombrePlantilla;
		this.is_codigoPlanilla = as_codigoPlanilla;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo#consultarNombrePlantilla()
	 */
	@Override
	public String consultarNombrePlantilla() {
		return is_nombrePlantilla;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo#consultarCodigoPlantilla()
	 */
	@Override
	public String consultarCodigoPlantilla() {
		return is_codigoPlanilla;
	}

}
