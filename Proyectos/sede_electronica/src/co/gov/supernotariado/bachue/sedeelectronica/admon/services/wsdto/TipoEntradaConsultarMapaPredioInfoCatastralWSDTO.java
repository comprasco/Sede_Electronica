/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarMapaPredioInfoCatastralWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarMapaPredioInfoCatastralWSDTO
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
 * consultar mapa predio info catastral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarMapaPredioInfoCatastralWSDTO extends GenericoDTO{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero catastral.
	 */
	private String is_numeroCatastral;

	/**
	 * Obtiene el valor para la propiedad numero catastral.
	 *
	 * @return El valor de la propiedad numero catastral
	 */
	public String getIs_numeroCatastral() {
		return is_numeroCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero catastral.
	 *
	 * @param as_numeroCatastral el nuevo valor para la propiedad numero catastral
	 */
	public void setIs_numeroCatastral(String as_numeroCatastral) {
		this.is_numeroCatastral = as_numeroCatastral;
	}
	
	
}
