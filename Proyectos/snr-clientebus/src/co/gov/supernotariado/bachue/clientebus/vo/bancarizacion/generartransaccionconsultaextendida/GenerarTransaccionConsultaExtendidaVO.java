/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionConsultaExtendidaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida
 * Nombre del elemento: GenerarTransaccionConsultaExtendidaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Generar transaccion consulta extendida .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionConsultaExtendidaVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario WS.
	 */
	private String is_usuarioWS;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave WS.
	 */
	private String is_claveWS;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
	private String is_codigoConvenio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo servicio.
	 */
	private String is_codigoServicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo seguimiento.
	 */
	private String is_codigoSeguimiento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad usa
	 * nombres.
	 */
	private boolean ib_usaNombres;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_primerNombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
	private String is_primerApellido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
	private String is_segundoApellido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad usa
	 * matricula.
	 */
	private boolean ib_usaMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula catastral.
	 */
	private String is_matriculaCatastral;

	/**
	 * Obtiene el valor para la propiedad usuario WS.
	 *
	 * @return El valor de la propiedad usuario WS
	 */
	public String getIs_usuarioWS() {
		return is_usuarioWS;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario WS.
	 *
	 * @param as_usuarioWS el nuevo valor para la propiedad usuario WS
	 */
	public void setIs_usuarioWS(String as_usuarioWS) {
		this.is_usuarioWS = as_usuarioWS;
	}

	/**
	 * Obtiene el valor para la propiedad clave WS.
	 *
	 * @return El valor de la propiedad clave WS
	 */
	public String getIs_claveWS() {
		return is_claveWS;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave WS.
	 *
	 * @param as_claveWS el nuevo valor para la propiedad clave WS
	 */
	public void setIs_claveWS(String as_claveWS) {
		this.is_claveWS = as_claveWS;
	}

	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getIs_codigoServicio() {
		return is_codigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param as_codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setIs_codigoServicio(String as_codigoServicio) {
		this.is_codigoServicio = as_codigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo seguimiento.
	 *
	 * @return El valor de la propiedad codigo seguimiento
	 */
	public String getIs_codigoSeguimiento() {
		return is_codigoSeguimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo seguimiento.
	 *
	 * @param as_codigoSeguimiento el nuevo valor para la propiedad codigo
	 *                             seguimiento
	 */
	public void setIs_codigoSeguimiento(String as_codigoSeguimiento) {
		this.is_codigoSeguimiento = as_codigoSeguimiento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad usa nombres.
	 *
	 * @return true, si se cumple la propiedad usa nombres, false caso contrario
	 */
	public boolean isIb_usaNombres() {
		return ib_usaNombres;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usa nombres.
	 *
	 * @param ab_usaNombres el nuevo valor para la propiedad usa nombres
	 */
	public void setIb_usaNombres(boolean ab_usaNombres) {
		this.ib_usaNombres = ab_usaNombres;
	}

	/**
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getIs_primerNombre() {
		return is_primerNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param as_primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}

	/**
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getIs_primerApellido() {
		return is_primerApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param as_primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param as_segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}

	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}

	/**
	 * Obtiene el valor para la propiedad usa matricula.
	 *
	 * @return true, si se cumple la propiedad usa matricula, false caso contrario
	 */
	public boolean isIb_usaMatricula() {
		return ib_usaMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usa matricula.
	 *
	 * @param ab_usaMatricula el nuevo valor para la propiedad usa matricula
	 */
	public void setIb_usaMatricula(boolean ab_usaMatricula) {
		this.ib_usaMatricula = ab_usaMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad matricula catastral.
	 *
	 * @return El valor de la propiedad matricula catastral
	 */
	public String getIs_matriculaCatastral() {
		return is_matriculaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula catastral.
	 *
	 * @param as_matriculaCatastral el nuevo valor para la propiedad matricula
	 *                              catastral
	 */
	public void setIs_matriculaCatastral(String as_matriculaCatastral) {
		this.is_matriculaCatastral = as_matriculaCatastral;
	}
}