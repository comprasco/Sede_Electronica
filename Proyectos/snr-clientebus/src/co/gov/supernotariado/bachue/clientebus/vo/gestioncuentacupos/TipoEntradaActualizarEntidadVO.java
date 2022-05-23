/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaActualizarEntidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaActualizarEntidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada actualizar entidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaActualizarEntidadVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
    
    /**
	 * Atributo de instancia tipo TipoEmpresaAEIVO para definir la propiedad empresa
	 * actualizar entidad input objeto con valores de servicio.
	 */
    private TipoEmpresaAEIVO ite_empresaAeiVo;
    
    /**
	 * Atributo de instancia tipo TipoRepresentanteLegalAEIVO para definir la
	 * propiedad representante legal aerr objeto con valores de servicio.
	 */
    private TipoRepresentanteLegalAEIVO itrl_representanteLegalAerrVo;
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad empresa actualizar entidad input objeto
	 * con valores de servicio.
	 *
	 * @return El valor de la propiedad empresa actualizar entidad input objeto con
	 *         valores de servicio
	 */
	public TipoEmpresaAEIVO getIte_empresaAeiVo() {
		return ite_empresaAeiVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad empresa actualizar entidad input
	 * objeto con valores de servicio.
	 *
	 * @param ate_empresaAeiVo el nuevo valor para la propiedad empresa actualizar
	 *                         entidad input objeto con valores de servicio
	 */
	public void setIte_empresaAeiVo(TipoEmpresaAEIVO ate_empresaAeiVo) {
		this.ite_empresaAeiVo = ate_empresaAeiVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad representante legal aerr objeto con
	 * valores de servicio.
	 *
	 * @return El valor de la propiedad representante legal aerr objeto con valores
	 *         de servicio
	 */
	public TipoRepresentanteLegalAEIVO getItrl_representanteLegalAerrVo() {
		return itrl_representanteLegalAerrVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad representante legal aerr objeto
	 * con valores de servicio.
	 *
	 * @param atrl_representanteLegalAerrVo el nuevo valor para la propiedad
	 *                                      representante legal aerr objeto con
	 *                                      valores de servicio
	 */
	public void setItrl_representanteLegalAerrVo(TipoRepresentanteLegalAEIVO atrl_representanteLegalAerrVo) {
		this.itrl_representanteLegalAerrVo = atrl_representanteLegalAerrVo;
	}
}
