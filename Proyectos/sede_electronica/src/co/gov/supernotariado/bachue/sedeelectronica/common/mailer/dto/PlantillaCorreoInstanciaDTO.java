/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PlantillaCorreoInstanciaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto
 * Nombre del elemento: PlantillaCorreoInstanciaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto;

import java.util.Map;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GsonSingleton;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFormatoTexto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Plantilla correo
 * instancia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PlantillaCorreoInstanciaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * asunto.
	 */
	private String is_asunto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * origen.
	 */
	private String is_origen;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * destino.
	 */
	private String is_destino;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * plantilla existente.
	 */
	private Boolean ib_plantillaExistente;

	/**
	 * Atributo de instancia tipo Map con claves String y valores String para
	 * definir la propiedad variables mensaje.
	 */
	private Map<String, String> imss_variablesMensaje;

	/**
	 * Atributo de instancia tipo Map con claves String y valores String para
	 * definir la propiedad variables asunto.
	 */
	private Map<String, String> imss_variablesAsunto;

	/**
	 * Atributo de instancia tipo ParametrizacionPlantillaDTO para definir la
	 * propiedad parametrizacion correo.
	 */
	private ParametrizacionPlantillaDTO ipp_parametrizacionCorreo;

	/**
	 * Construye una nueva instancia/objeto de la clase PlantillaCorreoInstanciaDTO.
	 *
	 * @param app_parametrizacionCorreoPlantilla el parametro parametrizacion correo
	 *                                           plantilla
	 */
	public PlantillaCorreoInstanciaDTO(ParametrizacionPlantillaDTO app_parametrizacionCorreoPlantilla) {

		imss_variablesMensaje = GsonSingleton.jsonToMap(app_parametrizacionCorreoPlantilla.getIs_confCamposContenido());
		imss_variablesAsunto = GsonSingleton.jsonToMap(app_parametrizacionCorreoPlantilla.getIs_confCamposAsunto());
		ipp_parametrizacionCorreo = app_parametrizacionCorreoPlantilla;

	}

	/**
	 * Metodo que agrega mensajes en las variables de la plantilla.
	 *
	 * @param as_llave llave a inyectar
	 * @param as_valor valor a inyectar
	 * @return Resultado para agregar mensaje retornado como
	 *         PlantillaCorreoInstanciaDTO
	 */
	public PlantillaCorreoInstanciaDTO addMensaje(String as_llave, String as_valor) {
		String ls_variable = imss_variablesMensaje.replace(as_llave, as_valor);
		if (ls_variable == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);

		return this;
	}

	/**
	 * Metodo que agrega asunto a la plantilla.
	 *
	 * @param as_llave llave a inyectar
	 * @param as_valor valor a inyectar
	 * @return Resultado para agregar el asunto retornado como
	 *         PlantillaCorreoInstanciaDTO
	 */
	public PlantillaCorreoInstanciaDTO addAsunto(String as_llave, String as_valor) {
		String ls_variable = imss_variablesAsunto.replace(as_llave, as_valor);
		if (ls_variable == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);

		return this;
	}

	/**
	 * Generar Correo. Metodo que inyecta las variables al correo.
	 */
	public void generarCorreo() {

		this.setIs_mensaje(UtilidadFormatoTexto.inyectarVariablesString(
				this.getIpcp_parametrizacionCorreo().getIs_confHtmlContenido(), this.getImss_variablesMensaje()));

		this.setIs_asunto(UtilidadFormatoTexto.inyectarVariablesString(
				this.getIpcp_parametrizacionCorreo().getIs_confTextoAsunto(), this.getImss_variablesAsunto()));

		this.setIs_origen(this.getIpcp_parametrizacionCorreo().getIs_confFrom());

	}

	/**
	 * Obtiene el valor para la propiedad asunto.
	 *
	 * @return El valor de la propiedad asunto
	 */
	public String getIs_asunto() {
		return is_asunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asunto.
	 *
	 * @param as_asunto el nuevo valor para la propiedad asunto
	 */
	public void setIs_asunto(String as_asunto) {
		this.is_asunto = as_asunto;
	}

	/**
	 * Obtiene el valor para la propiedad origen.
	 *
	 * @return El valor de la propiedad origen
	 */
	public String getIs_origen() {
		return is_origen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad origen.
	 *
	 * @param as_origen el nuevo valor para la propiedad origen
	 */
	public void setIs_origen(String as_origen) {
		this.is_origen = as_origen;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}

	/**
	 * Obtiene el valor para la propiedad destino.
	 *
	 * @return El valor de la propiedad destino
	 */
	public String getIs_destino() {
		return is_destino;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad destino.
	 *
	 * @param as_destino el nuevo valor para la propiedad destino
	 */
	public void setIs_destino(String as_destino) {
		this.is_destino = as_destino;
	}

	/**
	 * Obtiene el valor para la propiedad variables mensaje.
	 *
	 * @return El valor de la propiedad variables mensaje
	 */
	public Map<String, String> getImss_variablesMensaje() {
		return imss_variablesMensaje;
	}

	/**
	 * Cambia el valor de la propiedad imss variables mensaje.
	 *
	 * @param amss_variablesMensaje el parametro variables mensaje
	 */
	public void setImss_variablesMensaje(Map<String, String> amss_variablesMensaje) {
		this.imss_variablesMensaje = amss_variablesMensaje;
	}

	/**
	 * Obtiene el valor para la propiedad variables asunto.
	 *
	 * @return El valor de la propiedad variables asunto
	 */
	public Map<String, String> getImss_variablesAsunto() {
		return imss_variablesAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad plantilla existente.
	 *
	 * @return El valor de la propiedad plantilla existente
	 */
	public Boolean getIb_plantillaExistente() {
		return ib_plantillaExistente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad plantilla existente.
	 *
	 * @param ab_plantillaExistente el nuevo valor para la propiedad plantilla
	 *                              existente
	 */
	public void setIb_plantillaExistente(Boolean ab_plantillaExistente) {
		this.ib_plantillaExistente = ab_plantillaExistente;
	}

	/**
	 * Cambia el valor de la propiedad imss variables asunto.
	 *
	 * @param amss_variablesAsunto el parametro variables asunto
	 */
	public void setImss_variablesAsunto(Map<String, String> amss_variablesAsunto) {
		this.imss_variablesAsunto = amss_variablesAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion correo.
	 *
	 * @return El valor de la propiedad parametrizacion correo
	 */
	public ParametrizacionPlantillaDTO getIpcp_parametrizacionCorreo() {
		return ipp_parametrizacionCorreo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion correo.
	 *
	 * @param app_parametrizacionCorreo el nuevo valor para la propiedad
	 *                                  parametrizacion correo
	 */
	public void setIpcp_parametrizacionCorreo(ParametrizacionPlantillaDTO app_parametrizacionCorreo) {
		this.ipp_parametrizacionCorreo = app_parametrizacionCorreo;
	}

}
