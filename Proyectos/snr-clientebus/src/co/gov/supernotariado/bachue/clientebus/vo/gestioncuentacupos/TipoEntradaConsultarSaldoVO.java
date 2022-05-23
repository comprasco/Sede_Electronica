/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarSaldoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaConsultarSaldoVO
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
 * Tipo entrada consultar saldo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarSaldoVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
    private String is_idCuentaCupo;
    
    /**
	 * Atributo de instancia tipo TipoAdminVO para definir la propiedad admin objeto
	 * con valores de servicio.
	 */
    private TipoAdminVO ita_adminVo;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioCSIVO para definir la propiedad usuario
	 * consultar saldo input.
	 */
    private TipoUsuarioCSIVO itu_usuarioCsi;
    
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
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario consultar saldo input.
	 *
	 * @return El valor de la propiedad usuario consultar saldo input
	 */
	public TipoUsuarioCSIVO getItu_usuarioCsi() {
		return itu_usuarioCsi;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario consultar saldo input.
	 *
	 * @param atu_usuarioCsi el nuevo valor para la propiedad usuario consultar
	 *                       saldo input
	 */
	public void setItu_usuarioCsi(TipoUsuarioCSIVO atu_usuarioCsi) {
		this.itu_usuarioCsi = atu_usuarioCsi;
	}
	
	/**
	 * Obtiene el valor para la propiedad admin objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad admin objeto con valores de servicio
	 */
	public TipoAdminVO getIta_adminVo() {
		return ita_adminVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin objeto con valores de
	 * servicio.
	 *
	 * @param ata_adminVo el nuevo valor para la propiedad admin objeto con valores
	 *                    de servicio
	 */
	public void setIta_adminVo(TipoAdminVO ata_adminVo) {
		this.ita_adminVo = ata_adminVo;
	}
    
}
