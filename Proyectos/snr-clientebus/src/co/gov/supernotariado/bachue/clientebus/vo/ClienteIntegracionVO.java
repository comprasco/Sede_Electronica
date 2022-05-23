/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ClienteIntegracionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo
 * Nombre del elemento: ClienteIntegracionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo;

/**
 * <b>Clase generica</b> que representa los datos de control compartidos que
 * debe tener cualquier <b>objeto de valores de servicio (VO)</b>. <br>
 * Permite manejar los datos de control para pasar datos de entrada o devolver
 * los resultados al invocar una operacion de un servicio, consumida usando el
 * cliente bus. <br>
 * Contiene las propiedades que se deben heredar/completar para representar los
 * datos de control. Datos para <b> pasar entradas y entregar salidas usando
 * objetos VO desde y a quien invoque</b> una operacon usando el cliente bus.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ClienteIntegracionVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Namespace del servicio.
	 */
	private String is_espacioNombre;

	/**
	 * Define el nombre del servicio web a utilizar.
	 */
	private String is_nombreServicioSoap;

	/**
	 * Nombre de usuario.
	 */
	private String is_autUsuario;

	/**
	 * Nombre de usuario.
	 */
	private String is_autContrasenia;

	/**
	 * Define el nombre del servicio web identificador.
	 */
	private String is_nombre;

	/**
	 * Valor del timeout para la ejecucion del servicio.
	 */
	private String is_tiempoFuera;

	/**
	 * Direccion url del servicio web a utilizar.
	 */
	private String is_url;

	/**
	 * Obtiene el valor para la propiedad espacio nombre.
	 *
	 * @return El valor de la propiedad espacio nombre
	 */
	public String getIs_espacioNombre() {
		return is_espacioNombre;
	}

	/**
	 * Obtiene el valor para la propiedad nombre servicio soap.
	 *
	 * @return El valor de la propiedad nombre servicio soap
	 */
	public String getIs_nombreServicioSoap() {
		return is_nombreServicioSoap;
	}

	/**
	 * Obtiene el valor para la propiedad tiempo fuera.
	 *
	 * @return El valor de la propiedad tiempo fuera
	 */
	public String getIs_tiempoFuera() {
		return is_tiempoFuera;
	}

	/**
	 * Obtiene el valor para la propiedad url.
	 *
	 * @return El valor de la propiedad url
	 */
	public String getIs_url() {
		return is_url;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad espacio nombre.
	 *
	 * @param as_espacioNombre el nuevo valor para la propiedad espacio nombre
	 */
	public void setIs_espacioNombre(String as_espacioNombre) {
		this.is_espacioNombre = as_espacioNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre servicio soap.
	 *
	 * @param as_nombreServicioSoap el nuevo valor para la propiedad nombre servicio
	 *                              soap
	 */
	public void setIs_nombreServicioSoap(String as_nombreServicioSoap) {
		this.is_nombreServicioSoap = as_nombreServicioSoap;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tiempo fuera.
	 *
	 * @param as_tiemporFuera el nuevo valor para la propiedad tiempo fuera
	 */
	public void setIs_tiempoFuera(String as_tiemporFuera) {
		this.is_tiempoFuera = as_tiemporFuera;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url.
	 *
	 * @param as_url el nuevo valor para la propiedad url
	 */
	public void setIs_url(String as_url) {
		this.is_url = as_url;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad aut usuario.
	 *
	 * @return El valor de la propiedad aut usuario
	 */
	public String getIs_autUsuario() {
		return is_autUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad aut usuario.
	 *
	 * @param as_autUsuario el nuevo valor para la propiedad aut usuario
	 */
	public void setIs_autUsuario(String as_autUsuario) {
		this.is_autUsuario = as_autUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad aut contrasenia.
	 *
	 * @return El valor de la propiedad aut contrasenia
	 */
	public String getIs_autContrasenia() {
		return is_autContrasenia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad aut contrasenia.
	 *
	 * @param as_autContrasenia el nuevo valor para la propiedad aut contrasenia
	 */
	public void setIs_autContrasenia(String as_autContrasenia) {
		this.is_autContrasenia = as_autContrasenia;
	}

}
