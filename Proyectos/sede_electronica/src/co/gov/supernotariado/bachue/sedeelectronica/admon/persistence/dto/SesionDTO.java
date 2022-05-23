/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SesionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SesionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContext;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Sesion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SesionDTO {

	/**
	 * Atributo de instancia tipo HttpServletResponse para definir la propiedad id
	 * sesion.
	 */
	private HttpServletResponse ihsr_idSesion;
	
	/**
	 * Atributo de instancia tipo SecurityContext para definir la propiedad
	 * contexto.
	 */
	private SecurityContext isc_contexto;

	/**
	 * Obtiene el valor para la propiedad id sesion.
	 *
	 * @return El valor de la propiedad id sesion
	 */
	public HttpServletResponse getIdSesion() {
		return ihsr_idSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id sesion.
	 *
	 * @param ahsr_idSesion el nuevo valor para la propiedad id sesion
	 */
	public void setIdSesion(HttpServletResponse ahsr_idSesion) {
		this.ihsr_idSesion = ahsr_idSesion;
	}

	/**
	 * Obtiene el valor para la propiedad contexto.
	 *
	 * @return El valor de la propiedad contexto
	 */
	public SecurityContext getContexto() {
		return isc_contexto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad contexto.
	 *
	 * @param asc_contexto el nuevo valor para la propiedad contexto
	 */
	public void setContexto(SecurityContext asc_contexto) {
		this.isc_contexto = asc_contexto;
	}

}
