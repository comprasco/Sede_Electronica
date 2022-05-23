/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SalidaObtenerConveniosEntidadRSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto
 * Nombre del elemento: SalidaObtenerConveniosEntidadRSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para Rest services (RSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios
 * REST(Representational State Transfer). <br>
 * Contiene propiedades para representar los datos del objeto Salida obtener
 * convenios entidad.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaObtenerConveniosEntidadRSDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	@SerializedName("codigoMensaje")
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	@SerializedName("descripcionMensaje")
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo ConveniosRSDTO para definir la propiedad
	 * convenios.
	 */
	@SerializedName("convenios")
	private ConveniosRSDTO ic_convenios;

	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}

	/**
	 * Obtiene el valor para la propiedad convenios.
	 *
	 * @return El valor de la propiedad convenios
	 */
	public ConveniosRSDTO getIc_convenios() {
		return ic_convenios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios.
	 *
	 * @param ac_convenios el nuevo valor para la propiedad convenios
	 */
	public void setIc_convenios(ConveniosRSDTO ac_convenios) {
		this.ic_convenios = ac_convenios;
	}

}
