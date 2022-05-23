/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarTarifaAlertasTitularesWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarTarifaAlertasTitularesWSDTO
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
 * consultar tarifa alertas titulares.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarTarifaAlertasTitularesWSDTO extends GenericoDTO implements ISalidaServicioWSDTO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de TarifaWSDTO para definir la propiedad
	 * lista tarifa ws.
	 */
	private List<TarifaWSDTO> ilt_listaTarifaWsDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * alertas inscrtitas.
	 */
	private String is_alertasInscrtitas;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tarifa nuevas alertas.
	 */
    private String is_tarifaNuevasAlertas;
    
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
    
   
	/**
	 * Obtiene el valor para la propiedad alertas inscrtitas.
	 *
	 * @return El valor de la propiedad alertas inscrtitas
	 */
	public String getIs_alertasInscrtitas() {
		return is_alertasInscrtitas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad alertas inscrtitas.
	 *
	 * @param as_alertasInscrtitas el nuevo valor para la propiedad alertas
	 *                             inscrtitas
	 */
	public void setIs_alertasInscrtitas(String as_alertasInscrtitas) {
		this.is_alertasInscrtitas = as_alertasInscrtitas;
	}
	
	/**
	 * Obtiene el valor para la propiedad tarifa nuevas alertas.
	 *
	 * @return El valor de la propiedad tarifa nuevas alertas
	 */
	public String getIs_tarifaNuevasAlertas() {
		return is_tarifaNuevasAlertas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tarifa nuevas alertas.
	 *
	 * @param as_tarifaNuevasAlertas el nuevo valor para la propiedad tarifa nuevas
	 *                               alertas
	 */
	public void setIs_tarifaNuevasAlertas(String as_tarifaNuevasAlertas) {
		this.is_tarifaNuevasAlertas = as_tarifaNuevasAlertas;
	}
	
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
	 * Obtiene el valor para la propiedad lista tarifa ws dto.
	 *
	 * @return El valor de la propiedad lista tarifa ws dto
	 */
	public List<TarifaWSDTO> getIlt_listaTarifaWsDto() {
		return ilt_listaTarifaWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tarifa ws dto.
	 *
	 * @param alt_listaTarifaWsDto el nuevo valor para la propiedad lista tarifa ws
	 *                             dto
	 */
	public void setIlt_listaTarifaWsDto(List<TarifaWSDTO> alt_listaTarifaWsDto) {
		this.ilt_listaTarifaWsDto = alt_listaTarifaWsDto;
	}
}