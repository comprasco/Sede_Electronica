/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaDatosBasicosMatriculaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos
 * Nombre del elemento: TipoEntradaDatosBasicosMatriculaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada datos basicos matricula .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaDatosBasicosMatriculaVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio.
	 */
	private String is_convenio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
    private String is_codDepartamento;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
    private String is_codMunicipio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio busqueda.
	 */
    private String is_criterioBusqueda;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor criterio busqueda.
	 */
    private String is_valorCriterioBusqueda;
    
	/**
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public String getIs_convenio() {
		return is_convenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param as_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIs_convenio(String as_convenio) {
		this.is_convenio = as_convenio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public String getIs_codDepartamento() {
		return is_codDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param as_codDepartamento el nuevo valor para la propiedad codigo
	 *                           departamento
	 */
	public void setIs_codDepartamento(String as_codDepartamento) {
		this.is_codDepartamento = as_codDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public String getIs_codMunicipio() {
		return is_codMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param as_codMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIs_codMunicipio(String as_codMunicipio) {
		this.is_codMunicipio = as_codMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad criterio busqueda.
	 *
	 * @return El valor de la propiedad criterio busqueda
	 */
	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad criterio busqueda.
	 *
	 * @param as_criterioBusqueda el nuevo valor para la propiedad criterio busqueda
	 */
	public void setIs_criterioBusqueda(String as_criterioBusqueda) {
		this.is_criterioBusqueda = as_criterioBusqueda;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor criterio busqueda.
	 *
	 * @return El valor de la propiedad valor criterio busqueda
	 */
	public String getIs_valorCriterioBusqueda() {
		return is_valorCriterioBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor criterio busqueda.
	 *
	 * @param as_valorCriterioBusqueda el nuevo valor para la propiedad valor
	 *                                 criterio busqueda
	 */
	public void setIs_valorCriterioBusqueda(String as_valorCriterioBusqueda) {
		this.is_valorCriterioBusqueda = as_valorCriterioBusqueda;
	}
}
