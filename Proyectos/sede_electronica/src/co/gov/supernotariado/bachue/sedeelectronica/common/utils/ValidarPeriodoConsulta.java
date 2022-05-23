/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarPeriodoConsulta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ValidarPeriodoConsulta
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
 * El elemento Class ValidarPeriodoConsulta.<br>
 * Representa un/una validar periodo consulta.<br>
 * Clase con utilidades para manejo de fechas, en este caso validacion de
 * rangos.<br>
 * Valida el rango que existe entre dos fechas de consulta. <br>
 * Una fecha inicial y una final con diferencia de 90 dias o mas. Un ejemplo de
 * uso es el rango entre las fechas de para un periodo de consulta de 3 meses.
 * <br>
 * Util en validaciones de componentes de UI<br>
 * Complementa las utilidades en {@link UtilidadFecha}
 * 
 * @see ValidarFechasRango
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@FacesValidator(value = "ValidarPeriodoConsulta")
public class ValidarPeriodoConsulta implements Validator {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ValidarPeriodoConsulta.class);

	/**
	 * Define la constante CL_CANTIDADDIAS.
	 */
	private static final Long CL_CANTIDADDIAS = (90L);

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
		UIInput luii_inputComponent = (UIInput) auic_uiComponent.getAttributes().get("fechaInicial");
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
	 * @param ad_fechaFinal   el parametro fecha final
	 * @param ad_fechaInicial el parametro fecha inicial
	 * @return true si la diferencia de las fechas en dias es
	 *         {@link #CL_CANTIDADDIAS} o mayor, y false de lo contrario.
	 */
	public static boolean fechasValidas(Date ad_fechaFinal, Date ad_fechaInicial) {
		try {
			Calendar lc_fechaExpedicion = new GregorianCalendar();
			Calendar lc_fechaNacimiento = new GregorianCalendar();
			Long ll_diasRango = null;

			lc_fechaExpedicion.setTime(ad_fechaFinal);
			lc_fechaNacimiento.setTime(ad_fechaInicial);

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
