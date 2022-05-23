/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarEntidadesJAVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoSalidaConsultarEntidadesJAVO
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
 * Tipo salida consultar entidades JA .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarEntidadesJAVO extends ClienteIntegracionVO {

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
	 * Atributo de instancia tipo lista de ListaAutoridadesJAVO para definir la
	 * propiedad lista autoridades JA vo.
	 */
	private List<ListaAutoridadesJAVO> illaja_listaAutoridadesJAVo;

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
	 * Obtiene el valor para la propiedad lista autoridades JA objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista autoridades JA objeto con valores de
	 *         servicio
	 */
	public List<ListaAutoridadesJAVO> getIllaja_listaAutoridadesJAVo() {
		return illaja_listaAutoridadesJAVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista autoridades JA objeto con
	 * valores de servicio.
	 *
	 * @param allaja_listaAutoridadesJAVo el nuevo valor para la propiedad lista
	 *                                    autoridades JA objeto con valores de
	 *                                    servicio
	 */
	public void setIllaja_listaAutoridadesJAVo(List<ListaAutoridadesJAVO> allaja_listaAutoridadesJAVo) {
		this.illaja_listaAutoridadesJAVo = allaja_listaAutoridadesJAVo;
	}

}
