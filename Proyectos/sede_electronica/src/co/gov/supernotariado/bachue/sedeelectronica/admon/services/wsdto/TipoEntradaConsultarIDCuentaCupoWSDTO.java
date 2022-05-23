/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarIDCuentaCupoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarIDCuentaCupoWSDTO
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
 * consultar ID cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarIDCuentaCupoWSDTO extends GenericoDTO {

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
	 * Atributo de instancia tipo TipoAdminCICCIWSDTO para definir la propiedad
	 * admin cicci vo.
	 */
	private TipoAdminCICCIWSDTO itac_adminCicciVo;

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
	 * Obtiene el valor para la propiedad admin cicci objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad admin cicci objeto con valores de servicio
	 */
	public TipoAdminCICCIWSDTO getItac_adminCicciVo() {
		return itac_adminCicciVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad admin cicci objeto con valores de
	 * servicio.
	 *
	 * @param atac_adminCicciVo el nuevo valor para la propiedad admin cicci objeto
	 *                          con valores de servicio
	 */
	public void setItac_adminCicciVo(TipoAdminCICCIWSDTO atac_adminCicciVo) {
		this.itac_adminCicciVo = atac_adminCicciVo;
	}

}
