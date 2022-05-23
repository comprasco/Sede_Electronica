/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaCancelarUsuarioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaCancelarUsuarioVO
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
 * Tipo entrada cancelar usuario .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaCancelarUsuarioVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo TipoAdminVO para definir la propiedad
	 * administrador objeto con valores de servicio.
	 */
    private TipoAdminVO ita_administradorVo;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioCNUIVO para definir la propiedad
	 * usuario objeto con valores de servicio.
	 */
    private TipoUsuarioCNUIVO itucnui_usuarioVo;
    
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
	 * Obtiene el valor para la propiedad administrador objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad administrador objeto con valores de servicio
	 */
	public TipoAdminVO getIta_administradorVo() {
		return ita_administradorVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad administrador objeto con valores
	 * de servicio.
	 *
	 * @param ata_administradorVo el nuevo valor para la propiedad administrador
	 *                            objeto con valores de servicio
	 */
	public void setIta_administradorVo(TipoAdminVO ata_administradorVo) {
		this.ita_administradorVo = ata_administradorVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad usuario objeto con valores de servicio
	 */
	public TipoUsuarioCNUIVO getItucnui_usuarioVo() {
		return itucnui_usuarioVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario objeto con valores de
	 * servicio.
	 *
	 * @param atucnui_usuarioVo el nuevo valor para la propiedad usuario objeto con
	 *                          valores de servicio
	 */
	public void setItucnui_usuarioVo(TipoUsuarioCNUIVO atucnui_usuarioVo) {
		this.itucnui_usuarioVo = atucnui_usuarioVo;
	}
    
}
