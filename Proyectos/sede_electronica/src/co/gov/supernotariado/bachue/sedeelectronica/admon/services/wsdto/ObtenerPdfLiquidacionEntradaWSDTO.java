/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerPdfLiquidacionEntradaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ObtenerPdfLiquidacionEntradaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;


import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Obtener pdf
 * liquidacion entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerPdfLiquidacionEntradaWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
	private String is_numeroReferencia;

	/**
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}	
	
}
