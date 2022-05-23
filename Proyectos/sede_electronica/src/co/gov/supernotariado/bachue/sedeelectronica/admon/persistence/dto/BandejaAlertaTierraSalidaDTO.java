/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BandejaAlertaTierraSalidaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BandejaAlertaTierraSalidaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Bandeja alerta
 * tierra salida.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BandejaAlertaTierraSalidaDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
	/**
	 * Atributo de instancia tipo lista de TipoSalidaConsultarAlertasWSDTO para
	 * definir la propiedad tipo salida consultar alertas ws.
	 */
	private List<TipoSalidaConsultarAlertasWSDTO> iltsca_tipoSalidaConsultarAlertasWsDto;
	
	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo salida consultar alertas ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar alertas ws dto
	 */
	public List<TipoSalidaConsultarAlertasWSDTO> getIltsca_tipoSalidaConsultarAlertasWsDto() {
		return iltsca_tipoSalidaConsultarAlertasWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar alertas ws
	 * dto.
	 *
	 * @param altsca_tipoSalidaConsultarAlertasWsDto el nuevo valor para la
	 *                                               propiedad tipo salida consultar
	 *                                               alertas ws dto
	 */
	public void setIltsca_tipoSalidaConsultarAlertasWsDto(List<TipoSalidaConsultarAlertasWSDTO> altsca_tipoSalidaConsultarAlertasWsDto) {
		this.iltsca_tipoSalidaConsultarAlertasWsDto = altsca_tipoSalidaConsultarAlertasWsDto;
	}
	
}
