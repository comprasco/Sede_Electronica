/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarRequeridoCheckBox.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ValidarRequeridoCheckBox
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.text.MessageFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * El elemento Class ValidarRequeridoCheckBox.<br>
 * Representa un/una validar requerido check box.<br>
 * Metodo con utilidad para validar un checkbox requerido en un componente de UI
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@FacesValidator(value = "ValidarRequeridoCheckBox")
public class ValidarRequeridoCheckBox implements Validator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.validator.Validator#validate(javax.faces.context.FacesContext,
	 * javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public void validate(FacesContext afc_facesContext, UIComponent auic_uiComponent, Object ao_object) {
		if (ao_object.equals(Boolean.FALSE)) {
			String ls_requiredMessage = ((UIInput) auic_uiComponent).getRequiredMessage();

			if (ls_requiredMessage == null) {
				Object lo_label = auic_uiComponent.getAttributes().get("label");
				if (lo_label == null || (lo_label instanceof String && ((String) lo_label).length() == 0)) {
					lo_label = auic_uiComponent.getValueExpression("label");
				}
				if (lo_label == null) {
					lo_label = auic_uiComponent.getClientId(afc_facesContext);
				}
				ls_requiredMessage = MessageFormat.format(UIInput.REQUIRED_MESSAGE_ID, lo_label);
			}

			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, ls_requiredMessage, ls_requiredMessage));
		}
	}
}
