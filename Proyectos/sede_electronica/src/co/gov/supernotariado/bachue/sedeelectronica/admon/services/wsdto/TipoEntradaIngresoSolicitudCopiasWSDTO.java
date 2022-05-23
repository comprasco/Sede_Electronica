/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaIngresoSolicitudCopiasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaIngresoSolicitudCopiasWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * ingreso solicitud copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaIngresoSolicitudCopiasWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de DocumentoSGDWSDTO para definir la
	 * propiedad documento sgd ws.
	 */
	private List<DocumentoSGDWSDTO> ild_documentoSgdWsDto;
	
	/**
	 * Obtiene el valor para la propiedad documento sgd ws dto.
	 *
	 * @return El valor de la propiedad documento sgd ws dto
	 */
	public List<DocumentoSGDWSDTO> getIld_documentoSgdWsDto() {
		return ild_documentoSgdWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento sgd ws dto.
	 *
	 * @param ald_documentoSgdWsDto el nuevo valor para la propiedad documento sgd
	 *                              ws dto
	 */
	public void setIld_documentoSgdWsDto(List<DocumentoSGDWSDTO> ald_documentoSgdWsDto) {
		this.ild_documentoSgdWsDto = ald_documentoSgdWsDto;
	}
	
}
