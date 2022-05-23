/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarFechasRango.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ValidarFechasRango
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.jboss.logging.Logger;

/**
 * El elemento Class ValidarFechasRango.<br>
 * Representa un/una validar fechas rango.<br>
 * Clase con utilidades para manejo de fechas, en este caso validacion de
 * rangos.<br>
 * Valida el rango que existe entre dos fechas. Un ejemplo de uso es el rango
 * entre las fechas de expedicion y fecha de nacimiento al crear una persona.
 * <br>
 * Util en validaciones de componentes de UI<br>
 * Complementa las utilidades en {@link UtilidadFecha}
 * 
 * @see UtilidadFecha, ValidarPeriodoConsulta
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@FacesValidator(value = "ValidarFechasRango")
public class ValidarFechasRango implements Validator {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ValidarFechasRango.class);

	/**
	 * Define la constante CL_CANTIDADDIAS. Definida en 18 anios
	 */
	private static final Long CL_CANTIDADDIAS = (18L * 365L);

	/**
	 * Atributo de instancia tipo FacesMessage para definir la propiedad message
	 * error.
	 */
	private FacesMessage ifm_messageError = new FacesMessage();

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

		UIInput luii_inputComponent = (UIInput) auic_uiComponent.getAttributes().get("fechaNacimientoNatural");

		if (!luii_inputComponent.isValid()) {
			return;
		}
		if (!fechasValidas((Date) ao_object, (Date) luii_inputComponent.getValue())) {
			ifm_messageError.setDetail(irb_bundleTxtPersona.getString("Mensaje.Validar.RangoFechas"));
			ifm_messageError.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(ifm_messageError);
		}
	}

	/**
	 * Se encarga de hacer una resta para saber los dias existentes entre las dos
	 * fechas que llegan como parametro.
	 * 
	 * @param ad_fechaExpedicion Date fecha expedicion del documento de la persona.
	 * @param ad_fechaNacimiento Date fecha nacimiento de la persona.
	 * @return true si la diferencia de las fechas en dias es 6600 o mayor, y false
	 *         de lo contrario. Mas exactamente {@link #CL_CANTIDADDIAS}
	 */
	public static boolean fechasValidas(Date ad_fechaExpedicion, Date ad_fechaNacimiento) {
		try {
			Calendar lc_fechaExpedicion = new GregorianCalendar();
			Calendar lc_fechaNacimiento = new GregorianCalendar();
			Long ll_diasRango = null;

			lc_fechaExpedicion.setTime(ad_fechaExpedicion);
			lc_fechaNacimiento.setTime(ad_fechaNacimiento);

			ll_diasRango = (Long) Duration.between(lc_fechaNacimiento.toInstant(), lc_fechaExpedicion.toInstant())
					.toDays();

			if (ll_diasRango.intValue() < CL_CANTIDADDIAS) {
				return false;
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			return false;
		}

		return true;
	}
}
