/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaInscribirUsuarioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaInscribirUsuarioVO
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
 * Tipo entrada inscribir usuario .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaInscribirUsuarioVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo TipoAdminVO para definir la propiedad admin.
	 */
    private TipoAdminVO ita_admin;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioIUIVO para definir la propiedad
	 * usuario.
	 */
    private TipoUsuarioIUIVO itu_usuario;
	
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
	 * Obtiene el valor para la propiedad admin.
	 *
	 * @return El valor de la propiedad admin
	 */
	public TipoAdminVO getIta_admin() {
		return ita_admin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin.
	 *
	 * @param ata_admin el nuevo valor para la propiedad admin
	 */
	public void setIta_admin(TipoAdminVO ata_admin) {
		this.ita_admin = ata_admin;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public TipoUsuarioIUIVO getItu_usuario() {
		return itu_usuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param atu_usuario el nuevo valor para la propiedad usuario
	 */
	public void setItu_usuario(TipoUsuarioIUIVO atu_usuario) {
		this.itu_usuario = atu_usuario;
	}
    
}
