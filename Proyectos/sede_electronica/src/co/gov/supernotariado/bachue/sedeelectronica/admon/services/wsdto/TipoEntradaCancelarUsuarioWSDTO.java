/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaCancelarUsuarioWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaCancelarUsuarioWSDTO
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
 * cancelar usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaCancelarUsuarioWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo TipoAdminWSDTO para definir la propiedad
	 * administrador vo.
	 */
    private TipoAdminWSDTO ita_administradorVo;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioCNUIWSDTO para definir la propiedad
	 * usuario vo.
	 */
    private TipoUsuarioCNUIWSDTO itucnui_usuarioVo;
    
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
	public TipoAdminWSDTO getIta_administradorVo() {
		return ita_administradorVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad administrador objeto con valores
	 * de servicio.
	 *
	 * @param ata_administradorVo el nuevo valor para la propiedad administrador
	 *                            objeto con valores de servicio
	 */
	public void setIta_administradorVo(TipoAdminWSDTO ata_administradorVo) {
		this.ita_administradorVo = ata_administradorVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad usuario objeto con valores de servicio
	 */
	public TipoUsuarioCNUIWSDTO getItucnui_usuarioVo() {
		return itucnui_usuarioVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario objeto con valores de
	 * servicio.
	 *
	 * @param atucnui_usuarioVo el nuevo valor para la propiedad usuario objeto con
	 *                          valores de servicio
	 */
	public void setItucnui_usuarioVo(TipoUsuarioCNUIWSDTO atucnui_usuarioVo) {
		this.itucnui_usuarioVo = atucnui_usuarioVo;
	}
    
}
