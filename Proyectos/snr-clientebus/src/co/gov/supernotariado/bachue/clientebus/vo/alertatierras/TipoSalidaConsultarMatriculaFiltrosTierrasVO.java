/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarMatriculaFiltrosTierrasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoSalidaConsultarMatriculaFiltrosTierrasVO
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
 * Tipo salida consultar matricula filtros tierras .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarMatriculaFiltrosTierrasVO extends ClienteIntegracionVO {

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
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasVO para definir la propiedad
	 * lista matriculas consultar matricula filtros tierras vo.
	 */
	private List<ListaMatriculasConsultarMatriculaFiltrosTierrasVO> illmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo;

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

	/**
	 * Obtiene el valor para la propiedad lista matriculas consultar matricula
	 * filtros tierras objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad lista matriculas consultar matricula filtros
	 *         tierras objeto con valores de servicio
	 */
	public List<ListaMatriculasConsultarMatriculaFiltrosTierrasVO> getIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo() {
		return illmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas consultar
	 * matricula filtros tierras objeto con valores de servicio.
	 *
	 * @param allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo el nuevo
	 *                                                                   valor para
	 *                                                                   la
	 *                                                                   propiedad
	 *                                                                   lista
	 *                                                                   matriculas
	 *                                                                   consultar
	 *                                                                   matricula
	 *                                                                   filtros
	 *                                                                   tierras
	 *                                                                   objeto con
	 *                                                                   valores de
	 *                                                                   servicio
	 */
	public void setIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo(
			List<ListaMatriculasConsultarMatriculaFiltrosTierrasVO> allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo) {
		this.illmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo = allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo;
	}

}
