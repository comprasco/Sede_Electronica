/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarSaldoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarSaldoWSDTO
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
 * consultar saldo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarSaldoWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo TipoAdminWSDTO para definir la propiedad admin WS.
	 */
    private TipoAdminWSDTO ita_adminWSDto;
    
    /**
	 * Atributo de instancia tipo TipoUsuarioCSIWSDTO para definir la propiedad
	 * usuario csi.
	 */
    private TipoUsuarioCSIWSDTO itu_usuarioCsi;
    
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
	 * Obtiene el valor para la propiedad usuario csi.
	 *
	 * @return El valor de la propiedad usuario csi
	 */
	public TipoUsuarioCSIWSDTO getItu_usuarioCsi() {
		return itu_usuarioCsi;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario csi.
	 *
	 * @param atu_usuarioCsi el nuevo valor para la propiedad usuario csi
	 */
	public void setItu_usuarioCsi(TipoUsuarioCSIWSDTO atu_usuarioCsi) {
		this.itu_usuarioCsi = atu_usuarioCsi;
	}
	
	/**
	 * Obtiene el valor para la propiedad admin WS dto.
	 *
	 * @return El valor de la propiedad admin WS dto
	 */
	public TipoAdminWSDTO getIta_adminWSDto() {
		return ita_adminWSDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin WS dto.
	 *
	 * @param ata_adminWSDto el nuevo valor para la propiedad admin WS dto
	 */
	public void setIta_adminWSDto(TipoAdminWSDTO ata_adminWSDto) {
		this.ita_adminWSDto = ata_adminWSDto;
	}
	
    
}
