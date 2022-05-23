/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarSaldosNotaCreditoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarSaldosNotaCreditoWSDTO
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
 * consultar saldos nota creditos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarSaldosNotaCreditoWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo TipoAdminWSDTO para definir la propiedad admin vo.
	 */
	private TipoAdminWSDTO ita_adminVo;
	
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
	 * Obtiene el valor para la propiedad admin objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad admin objeto con valores de servicio
	 */
	public TipoAdminWSDTO getIta_adminVo() {
		return ita_adminVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad admin objeto con valores de
	 * servicio.
	 *
	 * @param ata_adminVo el nuevo valor para la propiedad admin objeto con valores
	 *                    de servicio
	 */
	public void setIta_adminVo(TipoAdminWSDTO ata_adminVo) {
		this.ita_adminVo = ata_adminVo;
	}
	
}
