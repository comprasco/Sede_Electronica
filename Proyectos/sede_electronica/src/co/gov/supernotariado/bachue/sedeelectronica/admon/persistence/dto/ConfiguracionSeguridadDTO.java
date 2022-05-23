/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionSeguridadDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ConfiguracionSeguridadDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Configuracion
 * seguridad.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionSeguridadDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad vigencia
	 * clave.
	 */
	private ParametroDTO ip_vigenciaClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad cantidad
	 * intentos fallidos bloqueo cuenta.
	 */
	private ParametroDTO ip_cantidadIntentosFallidosBloqueoCuenta;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad numero
	 * claves reutilizacion.
	 */
	private ParametroDTO ip_numeroClavesReutilizacion;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad longitud
	 * minima clave.
	 */
	private ParametroDTO ip_longitudMinimaClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad longitud
	 * maxima clave.
	 */
	private ParametroDTO ip_longitudMaximaClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad tiempo
	 * vigencia clave recuperacion.
	 */
	private ParametroDTO ip_tiempoVigenciaClaveRecuperacion;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad cantidad
	 * minima mayusculas clave.
	 */
	private ParametroDTO ip_cantidadMinimaMayusculasClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad cantidad
	 * minima minusculas clave.
	 */
	private ParametroDTO ip_cantidadMinimaMinusculasClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad cantidad
	 * minima caracteres especiales clave.
	 */
	private ParametroDTO ip_cantidadMinimaCaracteresEspecialesClave;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad tiempo
	 * cierre sesion.
	 */
	private ParametroDTO ip_tiempoCierreSesion;
	
	/**
	 * Atributo de instancia tipo ParametroDTO para definir la propiedad dias
	 * vigencia activacion.
	 */
	private ParametroDTO ip_diasVigenciaActivacion;
	
	/**
	 * Obtiene el valor para la propiedad tiempo cierre sesion.
	 *
	 * @return El valor de la propiedad tiempo cierre sesion
	 */
	public ParametroDTO getIp_tiempoCierreSesion() {
		return ip_tiempoCierreSesion;
	}
	
	/**
	 * Obtiene el valor para la propiedad vigencia clave.
	 *
	 * @return El valor de la propiedad vigencia clave
	 */
	public ParametroDTO getIp_vigenciaClave() {
		return ip_vigenciaClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad intentos fallidos bloqueo cuenta.
	 *
	 * @return El valor de la propiedad cantidad intentos fallidos bloqueo cuenta
	 */
	public ParametroDTO getIp_cantidadIntentosFallidosBloqueoCuenta() {
		return ip_cantidadIntentosFallidosBloqueoCuenta;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad minima mayusculas clave.
	 *
	 * @return El valor de la propiedad cantidad minima mayusculas clave
	 */
	public ParametroDTO getIp_cantidadMinimaMayusculasClave() {
		return ip_cantidadMinimaMayusculasClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad minima minusculas clave.
	 *
	 * @return El valor de la propiedad cantidad minima minusculas clave
	 */
	public ParametroDTO getIp_cantidadMinimaMinusculasClave() {
		return ip_cantidadMinimaMinusculasClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad minima caracteres especiales
	 * clave.
	 *
	 * @return El valor de la propiedad cantidad minima caracteres especiales clave
	 */
	public ParametroDTO getIp_cantidadMinimaCaracteresEspecialesClave() {
		return ip_cantidadMinimaCaracteresEspecialesClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero claves reutilizacion.
	 *
	 * @return El valor de la propiedad numero claves reutilizacion
	 */
	public ParametroDTO getIp_numeroClavesReutilizacion() {
		return ip_numeroClavesReutilizacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad tiempo vigencia clave recuperacion.
	 *
	 * @return El valor de la propiedad tiempo vigencia clave recuperacion
	 */
	public ParametroDTO getIp_tiempoVigenciaClaveRecuperacion() {
		return ip_tiempoVigenciaClaveRecuperacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad longitud minima clave.
	 *
	 * @return El valor de la propiedad longitud minima clave
	 */
	public ParametroDTO getIp_longitudMinimaClave() {
		return ip_longitudMinimaClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad longitud maxima clave.
	 *
	 * @return El valor de la propiedad longitud maxima clave
	 */
	public ParametroDTO getIp_longitudMaximaClave() {
		return ip_longitudMaximaClave;
	}
	
	/**
	 * Obtiene el valor para la propiedad dias vigencia activacion.
	 *
	 * @return El valor de la propiedad dias vigencia activacion
	 */
	public ParametroDTO getIp_diasVigenciaActivacion() {
		return ip_diasVigenciaActivacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tiempo cierre sesion.
	 *
	 * @param ap_tiempoCierreSesion el nuevo valor para la propiedad tiempo cierre
	 *                              sesion
	 */
	public void setIp_tiempoCierreSesion(ParametroDTO ap_tiempoCierreSesion) {
		this.ip_tiempoCierreSesion = ap_tiempoCierreSesion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad vigencia clave.
	 *
	 * @param ap_vigenciaClave el nuevo valor para la propiedad vigencia clave
	 */
	public void setIp_vigenciaClave(ParametroDTO ap_vigenciaClave) {
		this.ip_vigenciaClave = ap_vigenciaClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad intentos fallidos
	 * bloqueo cuenta.
	 *
	 * @param ap_cantidadIntentosFallidosBloqueoCuenta el nuevo valor para la
	 *                                                 propiedad cantidad intentos
	 *                                                 fallidos bloqueo cuenta
	 */
	public void setIp_cantidadIntentosFallidosBloqueoCuenta(ParametroDTO ap_cantidadIntentosFallidosBloqueoCuenta) {
		this.ip_cantidadIntentosFallidosBloqueoCuenta = ap_cantidadIntentosFallidosBloqueoCuenta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad minima mayusculas clave.
	 *
	 * @param ap_cantidadMinimaMayusculasClave el nuevo valor para la propiedad
	 *                                         cantidad minima mayusculas clave
	 */
	public void setIp_cantidadMinimaMayusculasClave(ParametroDTO ap_cantidadMinimaMayusculasClave) {
		this.ip_cantidadMinimaMayusculasClave = ap_cantidadMinimaMayusculasClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad minima minusculas clave.
	 *
	 * @param ap_cantidadMinimaMinusculasClave el nuevo valor para la propiedad
	 *                                         cantidad minima minusculas clave
	 */
	public void setIp_cantidadMinimaMinusculasClave(ParametroDTO ap_cantidadMinimaMinusculasClave) {
		this.ip_cantidadMinimaMinusculasClave = ap_cantidadMinimaMinusculasClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad minima caracteres
	 * especiales clave.
	 *
	 * @param ap_cantidadMinimaCaracteresEspecialesClave el nuevo valor para la
	 *                                                   propiedad cantidad minima
	 *                                                   caracteres especiales clave
	 */
	public void setIp_cantidadMinimaCaracteresEspecialesClave(ParametroDTO ap_cantidadMinimaCaracteresEspecialesClave) {
		this.ip_cantidadMinimaCaracteresEspecialesClave = ap_cantidadMinimaCaracteresEspecialesClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero claves reutilizacion.
	 *
	 * @param ap_numeroClavesReutilizacion el nuevo valor para la propiedad numero
	 *                                     claves reutilizacion
	 */
	public void setIp_numeroClavesReutilizacion(ParametroDTO ap_numeroClavesReutilizacion) {
		this.ip_numeroClavesReutilizacion = ap_numeroClavesReutilizacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tiempo vigencia clave
	 * recuperacion.
	 *
	 * @param ap_tiempoVigenciaClaveRecuperacion el nuevo valor para la propiedad
	 *                                           tiempo vigencia clave recuperacion
	 */
	public void setIp_tiempoVigenciaClaveRecuperacion(ParametroDTO ap_tiempoVigenciaClaveRecuperacion) {
		this.ip_tiempoVigenciaClaveRecuperacion = ap_tiempoVigenciaClaveRecuperacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad longitud minima clave.
	 *
	 * @param ap_longitudMinimaClave el nuevo valor para la propiedad longitud
	 *                               minima clave
	 */
	public void setIp_longitudMinimaClave(ParametroDTO ap_longitudMinimaClave) {
		this.ip_longitudMinimaClave = ap_longitudMinimaClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad longitud maxima clave.
	 *
	 * @param ap_longitudMaximaClave el nuevo valor para la propiedad longitud
	 *                               maxima clave
	 */
	public void setIp_longitudMaximaClave(ParametroDTO ap_longitudMaximaClave) {
		this.ip_longitudMaximaClave = ap_longitudMaximaClave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad dias vigencia activacion.
	 *
	 * @param ap_diasVigenciaActivacion el nuevo valor para la propiedad dias
	 *                                  vigencia activacion
	 */
	public void setIp_diasVigenciaActivacion(ParametroDTO ap_diasVigenciaActivacion) {
		this.ip_diasVigenciaActivacion = ap_diasVigenciaActivacion;
	}
	
}