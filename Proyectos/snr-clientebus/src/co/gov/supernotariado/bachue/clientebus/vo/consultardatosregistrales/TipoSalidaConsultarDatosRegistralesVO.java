/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarDatosRegistralesVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales
 * Nombre del elemento: TipoSalidaConsultarDatosRegistralesVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar datos registrales .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarDatosRegistralesVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDatosRegistralesVO para definir
	 * la propiedad matriculas.
	 */
	private List<MatriculaDatosRegistralesVO> ilmdr_matriculas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad registros.
	 */
	private String is_cantidadRegistros;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/**
	 * Obtiene el valor para la propiedad matriculas.
	 *
	 * @return El valor de la propiedad matriculas
	 */
	public List<MatriculaDatosRegistralesVO> getIlmdr_matriculas() {
		return ilmdr_matriculas;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas.
	 *
	 * @param almdr_matriculas el nuevo valor para la propiedad matriculas
	 */
	public void setIlmdr_matriculas(List<MatriculaDatosRegistralesVO> almdr_matriculas) {
		this.ilmdr_matriculas = almdr_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad registros.
	 *
	 * @return El valor de la propiedad cantidad registros
	 */
	public String getIs_cantidadRegistros() {
		return is_cantidadRegistros;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad registros.
	 *
	 * @param as_cantidadRegistros el nuevo valor para la propiedad cantidad
	 *                             registros
	 */
	public void setIs_cantidadRegistros(String as_cantidadRegistros) {
		this.is_cantidadRegistros = as_cantidadRegistros;
	}

}
