/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaInscribirUsuarioWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaInscribirUsuarioWSDTO
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
 * inscribir usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaInscribirUsuarioWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo TipoAdminWSDTO para definir la propiedad admin.
	 */
    private TipoAdminWSDTO ita_admin;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioIUIWSDTO para definir la propiedad
	 * usuario.
	 */
    private TipoUsuarioIUIWSDTO itu_usuario;
	
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
	public TipoAdminWSDTO getIta_admin() {
		return ita_admin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin.
	 *
	 * @param ata_admin el nuevo valor para la propiedad admin
	 */
	public void setIta_admin(TipoAdminWSDTO ata_admin) {
		this.ita_admin = ata_admin;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public TipoUsuarioIUIWSDTO getItu_usuario() {
		return itu_usuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param atu_usuario el nuevo valor para la propiedad usuario
	 */
	public void setItu_usuario(TipoUsuarioIUIWSDTO atu_usuario) {
		this.itu_usuario = atu_usuario;
	}
    
}
