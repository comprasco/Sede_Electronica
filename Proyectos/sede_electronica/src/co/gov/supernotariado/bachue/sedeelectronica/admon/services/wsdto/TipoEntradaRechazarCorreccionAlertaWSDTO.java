/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaRechazarCorreccionAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaRechazarCorreccionAlertaWSDTO
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
 * rechazar correccion alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaRechazarCorreccionAlertaWSDTO extends GenericoDTO 
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario.
	 */
	private String is_idUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto.
	 */
	private String is_texto;
	
	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
	}
	
	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad texto.
	 *
	 * @return El valor de la propiedad texto
	 */
	public String getIs_texto() {
		return is_texto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad texto.
	 *
	 * @param as_texto el nuevo valor para la propiedad texto
	 */
	public void setIs_texto(String as_texto) {
		this.is_texto = as_texto;
	}
}