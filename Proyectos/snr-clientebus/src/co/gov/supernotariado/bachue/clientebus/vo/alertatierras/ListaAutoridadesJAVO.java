/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaAutoridadesJAVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: ListaAutoridadesJAVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Lista autoridades JA .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAutoridadesJAVO extends GenericoVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo autoridad.
	 */
	private String is_codigoAutoridad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre autoridad.
	 */
	private String is_nombreAutoridad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * agencia nacional tierras.
	 */
	private String is_esAgenciaNacionalTierras;

	/**
	 * Obtiene el valor para la propiedad codigo autoridad.
	 *
	 * @return El valor de la propiedad codigo autoridad
	 */
	public String getIs_codigoAutoridad() {
		return is_codigoAutoridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo autoridad.
	 *
	 * @param as_codigoAutoridad el nuevo valor para la propiedad codigo autoridad
	 */
	public void setIs_codigoAutoridad(String as_codigoAutoridad) {
		this.is_codigoAutoridad = as_codigoAutoridad;
	}

	/**
	 * Obtiene el valor para la propiedad nombre autoridad.
	 *
	 * @return El valor de la propiedad nombre autoridad
	 */
	public String getIs_nombreAutoridad() {
		return is_nombreAutoridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre autoridad.
	 *
	 * @param as_nombreAutoridad el nuevo valor para la propiedad nombre autoridad
	 */
	public void setIs_nombreAutoridad(String as_nombreAutoridad) {
		this.is_nombreAutoridad = as_nombreAutoridad;
	}

	/**
	 * Obtiene el valor para la propiedad es agencia nacional tierras.
	 *
	 * @return El valor de la propiedad es agencia nacional tierras
	 */
	public String getIs_esAgenciaNacionalTierras() {
		return is_esAgenciaNacionalTierras;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad es agencia nacional tierras.
	 *
	 * @param as_esAgenciaNacionalTierras el nuevo valor para la propiedad es
	 *                                    agencia nacional tierras
	 */
	public void setIs_esAgenciaNacionalTierras(String as_esAgenciaNacionalTierras) {
		this.is_esAgenciaNacionalTierras = as_esAgenciaNacionalTierras;
	}

}
