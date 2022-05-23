/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarContrasenaFormato.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ValidarContrasenaFormato
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * El elemento Class ValidarContrasenaFormato.<br>
 * Representa un/una validar contrasena formato.<br>
 * Antigua clase para validacion de contrasenas, remplazada por
 * {@link UtilidadValidarContrasena}
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 * @deprecated
 */
@Deprecated
@FacesValidator(value = "ValidarContrasenaFormato")
public class ValidarContrasenaFormato implements Validator {

	/**
	 * Atributo de instancia tipo FacesMessage para definir la propiedad mensaje
	 * error.
	 */
	private FacesMessage ifm_mensajeError = new FacesMessage();

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

		if (!esFormatoValido("" + ao_object)) {
			ifm_mensajeError.setDetail("La contrasena no tiene un formato valido!");
			ifm_mensajeError.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(ifm_mensajeError);
		}
	}

	/**
	 * Es formato valido.
	 *
	 * @param as_address el parametro address
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public static boolean esFormatoValido(String as_address) {
		return as_address.matches("(\\w){8,32}");
	}
}
