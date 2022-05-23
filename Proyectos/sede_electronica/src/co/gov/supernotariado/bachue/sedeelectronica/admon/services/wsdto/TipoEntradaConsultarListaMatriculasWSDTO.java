/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarListaMatriculasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarListaMatriculasWSDTO
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
 * consultar lista matriculas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarListaMatriculasWSDTO extends GenericoDTO{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de ListaMatriculasWSDTO para definir la
	 * propiedad lista matriculas ws.
	 */
	private List<ListaMatriculasWSDTO> illm_listaMatriculasWsDto;

	/**
	 * Obtiene el valor para la propiedad lista matriculas ws dto.
	 *
	 * @return El valor de la propiedad lista matriculas ws dto
	 */
	public List<ListaMatriculasWSDTO> getIllm_listaMatriculasWsDto() {
		return illm_listaMatriculasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas ws dto.
	 *
	 * @param allm_listaMatriculasWsDto el nuevo valor para la propiedad lista
	 *                                  matriculas ws dto
	 */
	public void setIllm_listaMatriculasWsDto(List<ListaMatriculasWSDTO> allm_listaMatriculasWsDto) {
		this.illm_listaMatriculasWsDto = allm_listaMatriculasWsDto;
	}

	

}
