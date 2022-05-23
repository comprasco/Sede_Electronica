/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarOficinasOrigenTipoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarOficinasOrigenTipoWSDTO
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
 * consultar oficinas origen tipo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarOficinasOrigenTipoWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina origen.
	 */
	private String is_tipoOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo oficina origen.
	 */
	private String is_codigoOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre parcial oficina origen.
	 */
	private String is_nomParcialOficinaOrigen;

	/**
	 * Obtiene el valor para la propiedad tipo oficina origen.
	 *
	 * @return El valor de la propiedad tipo oficina origen
	 */
	public String getIs_tipoOficinaOrigen() {
		return is_tipoOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina origen.
	 *
	 * @param as_tipoOficinaOrigen el nuevo valor para la propiedad tipo oficina
	 *                             origen
	 */
	public void setIs_tipoOficinaOrigen(String as_tipoOficinaOrigen) {
		this.is_tipoOficinaOrigen = as_tipoOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad codigo oficina origen.
	 *
	 * @return El valor de la propiedad codigo oficina origen
	 */
	public String getIs_codigoOficinaOrigen() {
		return is_codigoOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo oficina origen.
	 *
	 * @param as_codigoOficinaOrigen el nuevo valor para la propiedad codigo oficina
	 *                               origen
	 */
	public void setIs_codigoOficinaOrigen(String as_codigoOficinaOrigen) {
		this.is_codigoOficinaOrigen = as_codigoOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad nombre parcial oficina origen.
	 *
	 * @return El valor de la propiedad nombre parcial oficina origen
	 */
	public String getIs_nomParcialOficinaOrigen() {
		return is_nomParcialOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre parcial oficina origen.
	 *
	 * @param as_nomParcialOficinaOrigen el nuevo valor para la propiedad nombre
	 *                                   parcial oficina origen
	 */
	public void setIs_nomParcialOficinaOrigen(String as_nomParcialOficinaOrigen) {
		this.is_nomParcialOficinaOrigen = as_nomParcialOficinaOrigen;
	}

}
