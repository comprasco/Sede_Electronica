/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarMatriculaAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarMatriculaAlertaWSDTO
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
 * consultar matricula alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarMatriculaAlertaWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

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
	 * Atributo de instancia tipo lista de ListaConsultarMatriculaAlertasWSDTO para
	 * definir la propiedad lista consultar matricula alertas ws.
	 */
	private List<ListaConsultarMatriculaAlertasWSDTO> illcma_listaConsultarMatriculaAlertasWsDto;

	/**
	 * Obtiene el valor para la propiedad lista consultar matricula alertas ws dto.
	 *
	 * @return El valor de la propiedad lista consultar matricula alertas ws dto
	 */
	public List<ListaConsultarMatriculaAlertasWSDTO> getIllcma_listaConsultarMatriculaAlertasWsDto() {
		return illcma_listaConsultarMatriculaAlertasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista consultar matricula alertas
	 * ws dto.
	 *
	 * @param allcma_listaConsultarMatriculaAlertasWsDto el nuevo valor para la
	 *                                                   propiedad lista consultar
	 *                                                   matricula alertas ws dto
	 */
	public void setIllcma_listaConsultarMatriculaAlertasWsDto(
			List<ListaConsultarMatriculaAlertasWSDTO> allcma_listaConsultarMatriculaAlertasWsDto) {
		this.illcma_listaConsultarMatriculaAlertasWsDto = allcma_listaConsultarMatriculaAlertasWsDto;
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

}
