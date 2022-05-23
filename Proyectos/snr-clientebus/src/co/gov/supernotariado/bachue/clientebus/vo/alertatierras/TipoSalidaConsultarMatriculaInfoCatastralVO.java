/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarMatriculaInfoCatastralVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoSalidaConsultarMatriculaInfoCatastralVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar matricula info catastral .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarMatriculaInfoCatastralVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo lista de
	 * ListaMatriculasConsultarMatriculaInfoCatastralVO para definir la propiedad
	 * lista matriculas consultar matricula info catastral vo.
	 */
	private List<ListaMatriculasConsultarMatriculaInfoCatastralVO> illmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo;

	/**
	 * Obtiene el valor para la propiedad lista matriculas consultar matricula info
	 * catastral objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad lista matriculas consultar matricula info
	 *         catastral objeto con valores de servicio
	 */
	public List<ListaMatriculasConsultarMatriculaInfoCatastralVO> getIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo() {
		return illmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas consultar
	 * matricula info catastral objeto con valores de servicio.
	 *
	 * @param allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo el nuevo
	 *                                                                  valor para
	 *                                                                  la propiedad
	 *                                                                  lista
	 *                                                                  matriculas
	 *                                                                  consultar
	 *                                                                  matricula
	 *                                                                  info
	 *                                                                  catastral
	 *                                                                  objeto con
	 *                                                                  valores de
	 *                                                                  servicio
	 */
	public void setIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo(
			List<ListaMatriculasConsultarMatriculaInfoCatastralVO> allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo) {
		this.illmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo = allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
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
}
