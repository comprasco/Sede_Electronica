/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ReCaptcha.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ReCaptcha
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.io.IOException;

import javax.validation.constraints.NotNull;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.fasterxml.jackson.databind.*;
import com.oracle.weblogic.lifecycle.provisioning.api.annotations.Component;

/**
 * El elemento Class ReCaptcha.<br>
 * Representa un/una re captcha.<br>
 * Clase para con utilidades asociadas a validacion de captcha usando Google
 * Re-Captcha
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Component(value = "reCaptcha")
public class ReCaptcha {

	/**
	 * Construye una nueva instancia/objeto de la clase ReCaptcha.
	 */
	private ReCaptcha() {
		// Constructor vacio de la clase
	}

	/**
	 * Atributo de instancia tipo WebTarget para definir la propiedad web target.
	 */
	private static WebTarget iwt_webTarget;

	/**
	 * Re captcha cliente.
	 */
	public static void reCaptcha() {
		iwt_webTarget = ClientBuilder.newClient().target("https://www.google.com/recaptcha/api/siteverify")
				.queryParam("secret", "6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe");
	}

	/**
	 * Validar Google reCAPTCHA.
	 *
	 * @param as_token el parametro token
	 * @return true si validacion es successful, false de otra manera.
	 * @throws IOException Indica que una I/O exception ha occurrido.
	 */

	public static boolean isValid(@NotNull String as_token) throws IOException {
		Response response = iwt_webTarget.queryParam("response", as_token).request(MediaType.APPLICATION_JSON)
				.accept("application/ld+json").get();

		if (response.getStatus() != 200)
			return false;

		String ls_stringResponse = response.readEntity(String.class);
		JsonNode ljn_jsonNode = new ObjectMapper().readTree(ls_stringResponse);
		return ljn_jsonNode.get("success").asBoolean();
	}
}