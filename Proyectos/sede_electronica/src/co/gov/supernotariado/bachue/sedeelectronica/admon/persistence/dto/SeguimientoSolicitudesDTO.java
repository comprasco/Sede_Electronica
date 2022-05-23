/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SeguimientoSolicitudesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Seguimiento
 * solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SeguimientoSolicitudesDTO extends GenericoDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo lista de SeguimientoSolicitudesRespuestaDTO para
	 * definir la propiedad lista seguimiento solicitudes respuesta.
	 */
	private List<SeguimientoSolicitudesRespuestaDTO> ilssr_listaSeguimientoSolicitudesRespuestaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual NIR.
	 */
	private String is_faseActualNIR;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * vinculado.
	 */
	private String is_nirVinculado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tramite vinculado.
	 */
	private String is_tramiteVinculado;

	/**
	 * Obtiene el valor para la propiedad fase actual NIR.
	 *
	 * @return El valor de la propiedad fase actual NIR
	 */
	public String getIs_faseActualNIR() {
		return is_faseActualNIR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fase actual NIR.
	 *
	 * @param as_faseActualNIR el nuevo valor para la propiedad fase actual NIR
	 */
	public void setIs_faseActualNIR(String as_faseActualNIR) {
		this.is_faseActualNIR = as_faseActualNIR;
	}

	/**
	 * Obtiene el valor para la propiedad nir vinculado.
	 *
	 * @return El valor de la propiedad nir vinculado
	 */
	public String getIs_nirVinculado() {
		return is_nirVinculado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir vinculado.
	 *
	 * @param as_nirVinculado el nuevo valor para la propiedad nir vinculado
	 */
	public void setIs_nirVinculado(String as_nirVinculado) {
		this.is_nirVinculado = as_nirVinculado;
	}

	/**
	 * Obtiene el valor para la propiedad tramite vinculado.
	 *
	 * @return El valor de la propiedad tramite vinculado
	 */
	public String getIs_tramiteVinculado() {
		return is_tramiteVinculado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tramite vinculado.
	 *
	 * @param as_tramiteVinculado el nuevo valor para la propiedad tramite vinculado
	 */
	public void setIs_tramiteVinculado(String as_tramiteVinculado) {
		this.is_tramiteVinculado = as_tramiteVinculado;
	}

	/**
	 * Obtiene el valor para la propiedad lista seguimiento solicitudes respuesta
	 * dto.
	 *
	 * @return El valor de la propiedad lista seguimiento solicitudes respuesta dto
	 */
	public List<SeguimientoSolicitudesRespuestaDTO> getIlssr_listaSeguimientoSolicitudesRespuestaDto() {
		return ilssr_listaSeguimientoSolicitudesRespuestaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista seguimiento solicitudes
	 * respuesta dto.
	 *
	 * @param alssr_listaSeguimientoSolicitudesRespuestaDto el nuevo valor para la
	 *                                                      propiedad lista
	 *                                                      seguimiento solicitudes
	 *                                                      respuesta dto
	 */
	public void setIlssr_listaSeguimientoSolicitudesRespuestaDto(
			List<SeguimientoSolicitudesRespuestaDTO> alssr_listaSeguimientoSolicitudesRespuestaDto) {
		this.ilssr_listaSeguimientoSolicitudesRespuestaDto = alssr_listaSeguimientoSolicitudesRespuestaDto;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

}