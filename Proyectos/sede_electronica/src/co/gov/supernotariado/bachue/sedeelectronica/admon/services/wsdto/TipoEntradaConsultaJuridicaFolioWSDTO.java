/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultaJuridicaFolioWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultaJuridicaFolioWSDTO
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
 * consulta juridica folio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultaJuridicaFolioWSDTO extends GenericoDTO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo identificacion predio.
	 */
	private String is_tipoIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero identificacion predio.
	 */
	private String is_numIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio.
	 */
	private String is_convenio;
	
	/**
	 * Obtiene el valor para la propiedad tipo identificacion predio.
	 *
	 * @return El valor de la propiedad tipo identificacion predio
	 */
	public String getIs_tipoIdentificacionPredio() {
		return is_tipoIdentificacionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo identificacion predio.
	 *
	 * @param as_tipoIdentificacionPredio el nuevo valor para la propiedad tipo
	 *                                    identificacion predio
	 */
	public void setIs_tipoIdentificacionPredio(String as_tipoIdentificacionPredio) {
		this.is_tipoIdentificacionPredio = as_tipoIdentificacionPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero identificacion predio.
	 *
	 * @return El valor de la propiedad numero identificacion predio
	 */
	public String getIs_numIdentificacionPredio() {
		return is_numIdentificacionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero identificacion predio.
	 *
	 * @param as_numIdentificacionPredio el nuevo valor para la propiedad numero
	 *                                   identificacion predio
	 */
	public void setIs_numIdentificacionPredio(String as_numIdentificacionPredio) {
		this.is_numIdentificacionPredio = as_numIdentificacionPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public String getIs_convenio() {
		return is_convenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param as_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIs_convenio(String as_convenio) {
		this.is_convenio = as_convenio;
	}
}