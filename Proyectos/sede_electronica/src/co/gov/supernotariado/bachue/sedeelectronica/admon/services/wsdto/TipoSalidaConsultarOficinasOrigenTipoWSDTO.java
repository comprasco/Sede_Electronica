/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarOficinasOrigenTipoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarOficinasOrigenTipoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar oficinas origen tipo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarOficinasOrigenTipoWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de ListaOficinasOrigenWSDTO para definir la
	 * propiedad lista oficina origen ws.
	 */
	private List<ListaOficinasOrigenWSDTO> illoo_listaOficinaOrigenWsDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
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

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
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
	 * Obtiene el valor para la propiedad lista oficina origen ws dto.
	 *
	 * @return El valor de la propiedad lista oficina origen ws dto
	 */
	public List<ListaOficinasOrigenWSDTO> getIlloo_listaOficinaOrigenWsDto() {
		return illoo_listaOficinaOrigenWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista oficina origen ws dto.
	 *
	 * @param alloo_listaOficinaOrigenWsDto el nuevo valor para la propiedad lista
	 *                                      oficina origen ws dto
	 */
	public void setIlloo_listaOficinaOrigenWsDto(List<ListaOficinasOrigenWSDTO> alloo_listaOficinaOrigenWsDto) {
		this.illoo_listaOficinaOrigenWsDto = alloo_listaOficinaOrigenWsDto;
	}

}
