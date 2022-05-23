/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarHistorialWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarHistorialWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar historial notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarHistorialWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo integer para definir la propiedad numero de
	 * registros.
	 */
	private BigInteger ibi_numeroRegistros;

	/**
	 * Atributo de instancia tipo lista de ListaMensajesHitorialNotificacionesWSDTO
	 * para definir la propiedad lista mensajes historial notificaciones.
	 */
	private List<ListaMensajesHitorialNotificacionesWSDTO> illmhn_listaMensajesHitorialNotificacionesWsDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codigoMensaje;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.
	 * ISalidaServicioWSDTO#getIbi_codigoMensaje()
	 */
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.
	 * ISalidaServicioWSDTO#getIs_descripcionMensaje()
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
	 * Obtiene el valor para la propiedad lista mensaje historial notificaciones.
	 *
	 * @return El valor de la propiedad lista mensaje historial notificaciones
	 */
	public List<ListaMensajesHitorialNotificacionesWSDTO> getIllmhn_listaMensajesHitorialNotificacionesWsDto() {
		return illmhn_listaMensajesHitorialNotificacionesWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista mensaje historial
	 * notificaciones.
	 *
	 * @param allmhn_listaMensajesHitorialNotificacionesWsDto el nuevo valor para la
	 *                                                        propiedad lista
	 *                                                        mensaje historial
	 *                                                        notificaciones
	 */
	public void setIllmhn_listaMensajesHitorialNotificacionesWsDto(
			List<ListaMensajesHitorialNotificacionesWSDTO> allmhn_listaMensajesHitorialNotificacionesWsDto) {
		this.illmhn_listaMensajesHitorialNotificacionesWsDto = allmhn_listaMensajesHitorialNotificacionesWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.
	 * ISalidaServicioWSDTO#getIbi_numeroRegistros()
	 */
	public BigInteger getIbi_numeroRegistros() {
		return ibi_numeroRegistros;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param ai_numeroRegistros el nuevo valor para la propiedad numero registro
	 */
	public void setIbi_numeroRegistros(BigInteger abi_numeroRegistros) {
		this.ibi_numeroRegistros = abi_numeroRegistros;
	}

}
