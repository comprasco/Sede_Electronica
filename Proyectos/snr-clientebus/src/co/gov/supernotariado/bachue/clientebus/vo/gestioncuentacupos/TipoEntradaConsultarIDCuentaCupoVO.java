/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarIDCuentaCupoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaConsultarIDCuentaCupoVO
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
 * Tipo entrada consultar ID cuenta cupo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarIDCuentaCupoVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo TipoAdminCICCIVO para definir la propiedad admin
	 * consulta id cuenta cupo input objeto con valores de servicio.
	 */
    private TipoAdminCICCIVO itac_adminCicciVo;
	
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
	 * Obtiene el valor para la propiedad admin consulta id cuenta cupo input objeto
	 * con valores de servicio.
	 *
	 * @return El valor de la propiedad admin consulta id cuenta cupo input objeto
	 *         con valores de servicio
	 */
	public TipoAdminCICCIVO getItac_adminCicciVo() {
		return itac_adminCicciVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin consulta id cuenta cupo
	 * input objeto con valores de servicio.
	 *
	 * @param atac_adminCicciVo el nuevo valor para la propiedad admin consulta id
	 *                          cuenta cupo input objeto con valores de servicio
	 */
	public void setItac_adminCicciVo(TipoAdminCICCIVO atac_adminCicciVo) {
		this.itac_adminCicciVo = atac_adminCicciVo;
	}
    
}
