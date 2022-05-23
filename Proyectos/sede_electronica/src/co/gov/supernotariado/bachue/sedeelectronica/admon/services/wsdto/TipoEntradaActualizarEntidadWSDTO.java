/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaActualizarEntidadWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaActualizarEntidadWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * actualizar entidad.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaActualizarEntidadWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo TipoEmpresaAEIWSDTO para definir la propiedad
	 * empresa aei vo.
	 */
    private TipoEmpresaAEIWSDTO ite_empresaAeiVo;
    
    /**
	 * Atributo de instancia tipo TipoRepresentanteLegalAEIWSDTO para definir la
	 * propiedad representante legal aerr vo.
	 */
    private TipoRepresentanteLegalAEIWSDTO itrl_representanteLegalAerrVo;
	
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
	 * Obtiene el valor para la propiedad empresa aei objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad empresa aei objeto con valores de servicio
	 */
	public TipoEmpresaAEIWSDTO getIte_empresaAeiVo() {
		return ite_empresaAeiVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad empresa aei objeto con valores de
	 * servicio.
	 *
	 * @param ate_empresaAeiVo el nuevo valor para la propiedad empresa aei objeto
	 *                         con valores de servicio
	 */
	public void setIte_empresaAeiVo(TipoEmpresaAEIWSDTO ate_empresaAeiVo) {
		this.ite_empresaAeiVo = ate_empresaAeiVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad representante legal aerr objeto con
	 * valores de servicio.
	 *
	 * @return El valor de la propiedad representante legal aerr objeto con valores
	 *         de servicio
	 */
	public TipoRepresentanteLegalAEIWSDTO getItrl_representanteLegalAerrVo() {
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
	public void setItrl_representanteLegalAerrVo(TipoRepresentanteLegalAEIWSDTO atrl_representanteLegalAerrVo) {
		this.itrl_representanteLegalAerrVo = atrl_representanteLegalAerrVo;
	}
}
