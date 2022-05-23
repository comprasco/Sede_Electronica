/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos
 * Nombre del elemento: TipoEntradaConsultarVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos;

import java.util.List;


import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * sistema origen.
	 */
	private String is_sistemaOrigen;
    
    /**
	 * Atributo de instancia tipo lista de ParametroVO para definir la propiedad
	 * lista parametros objeto con valores de servicio.
	 */
    private List<ParametroVO> ilp_listaParametrosVo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * repositorio.
	 */
    private String is_repositorio;
    
	/**
	 * Obtiene el valor para la propiedad sistema origen.
	 *
	 * @return El valor de la propiedad sistema origen
	 */
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad sistema origen.
	 *
	 * @param as_sistemaOrigen el nuevo valor para la propiedad sistema origen
	 */
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista parametros objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista parametros objeto con valores de
	 *         servicio
	 */
	public List<ParametroVO> getIlp_listaParametrosVo() {
		return ilp_listaParametrosVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista parametros objeto con
	 * valores de servicio.
	 *
	 * @param alp_listaParametrosVo el nuevo valor para la propiedad lista
	 *                              parametros objeto con valores de servicio
	 */
	public void setIlp_listaParametrosVo(List<ParametroVO> alp_listaParametrosVo) {
		this.ilp_listaParametrosVo = alp_listaParametrosVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad repositorio.
	 *
	 * @return El valor de la propiedad repositorio
	 */
	public String getIs_repositorio() {
		return is_repositorio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad repositorio.
	 *
	 * @param as_repositorio el nuevo valor para la propiedad repositorio
	 */
	public void setIs_repositorio(String as_repositorio) {
		this.is_repositorio = as_repositorio;
	}
    
}
