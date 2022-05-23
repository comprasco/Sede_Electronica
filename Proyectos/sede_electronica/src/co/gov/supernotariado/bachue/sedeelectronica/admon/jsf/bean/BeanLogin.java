/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanLogin.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanLogin
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Login.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@ManagedBean(name = "beanLogin")
@ViewScoped
public class BeanLogin implements Serializable  {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * error.
	 */
	private String is_error;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * alerta.
	 */
	private String is_alerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre ingreso.
	 */
	private String is_nombreIngreso;

	/**
	 * Metodo que permite inicializar el inicio de sesion y generar alertas o
	 * excepciones según problema dado.
	 */
	public void init() {

		is_mensaje = "";
		UtilidadAutoridadUsuario.validarSesion();
		HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_error = lhsr_solicitud.getParameter(EnumParametrosURL.ERROR.getIs_nombreParametro());
		is_alerta = lhsr_solicitud.getParameter(EnumParametrosURL.ALERTA.getIs_nombreParametro());


		if (is_error != null ) {
			GeneradorGrowlGenerico.manejadorExcepcionPresentacion(new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.consultarEnum(is_error)));			
			is_error = null;
		}else if(is_alerta != null && is_alerta.equalsIgnoreCase(EnumBoolean.CHAR_S.getIs_valorString())) {
			is_mensaje = LenguajeUtilidad.consultarMensaje(EnumExcepcionesInicioSesion.SESION_EXPIRADA, EnumTipoExcepciones.VALIDACION_NEGOCIO);
			is_alerta = null;
		}
	}

	/**
	 * Obtiene el valor para la propiedad error.
	 *
	 * @return El valor de la propiedad error
	 */
	public String getIs_error() {
		return is_error;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad error.
	 *
	 * @param as_error el nuevo valor para la propiedad error
	 */
	public void setIs_error(String as_error) {
		this.is_error = as_error;
	}

	/**
	 * Obtiene el valor para la propiedad alerta.
	 *
	 * @return El valor de la propiedad alerta
	 */
	public String getIs_alerta() {
		return is_alerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta.
	 *
	 * @param as_alerta el nuevo valor para la propiedad alerta
	 */
	public void setIs_alerta(String as_alerta) {
		this.is_alerta = as_alerta;
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
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad nombre ingreso.
	 *
	 * @return El valor de la propiedad nombre ingreso
	 */
	public String getIs_nombreIngreso() {
		return is_nombreIngreso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre ingreso.
	 *
	 * @param is_nombreIngreso el nuevo valor para la propiedad nombre ingreso
	 */
	public void setIs_nombreIngreso(String is_nombreIngreso) {
		this.is_nombreIngreso = is_nombreIngreso;
	}

}
