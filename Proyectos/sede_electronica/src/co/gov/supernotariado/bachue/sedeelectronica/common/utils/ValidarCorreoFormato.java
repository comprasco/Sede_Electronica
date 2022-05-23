/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarCorreoFormato.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ValidarCorreoFormato
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * El elemento Class ValidarCorreoFormato.<br>
 * Representa un/una validar correo formato.<br>
 * Clase con utilidades para la validacion del formato de un correo electronico
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@FacesValidator(value = "ValidarCorreoFormato")
public class ValidarCorreoFormato implements Validator {

	/**
	 * Atributo de instancia tipo FacesMessage para definir la propiedad mensaje
	 * error.
	 */
	private FacesMessage ifm_mensajeError = new FacesMessage();

	/**
	 * Define la constante CS_REGEXCORREO.
	 */
	private static final String CS_REGEXCORREO = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,63}){1,2})$";

	/**
	 * Atributo de instancia tipo FacesContext para definir la propiedad context.
	 */
	private FacesContext ifc_context = FacesContext.getCurrentInstance();

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt persona.
	 */
	private ResourceBundle irb_bundleTxtPersona = this.ifc_context.getApplication()
			.evaluateExpressionGet(this.ifc_context, "#{txt_persona}", ResourceBundle.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.validator.Validator#validate(javax.faces.context.FacesContext,
	 * javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public void validate(FacesContext afc_facesContext, UIComponent auic_uiComponent, Object ao_object) {

		if (ao_object == null) {
			return;
		}

		if (!esCorreoValido("" + ao_object)) {
			ifm_mensajeError.setDetail(irb_bundleTxtPersona.getString("Mensaje.Validar.CorreosFormato"));
			ifm_mensajeError.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(ifm_mensajeError);
		}
	}

	/**
	 * Es correo valido.
	 *
	 * @param as_address el parametro address
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public static boolean esCorreoValido(String as_address) {
		return as_address.matches(CS_REGEXCORREO);
	}
}
