/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaAgregarListaMatriculasAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaAgregarListaMatriculasAlertaWSDTO
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
 * agregar lista matriculas alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaAgregarListaMatriculasAlertaWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaAlertaTierrasWSDTO para definir
	 * la propiedad matricula alerta tierras ws.
	 */
	private List<MatriculaAlertaTierrasWSDTO> imat_matriculaAlertaTierrasWsDto;

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad matricula alerta tierras ws dto.
	 *
	 * @return El valor de la propiedad matricula alerta tierras ws dto
	 */
	public List<MatriculaAlertaTierrasWSDTO> getImat_matriculaAlertaTierrasWsDto() {
		return imat_matriculaAlertaTierrasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula alerta tierras ws dto.
	 *
	 * @param amat_matriculaAlertaTierrasWsDto el nuevo valor para la propiedad
	 *                                         matricula alerta tierras ws dto
	 */
	public void setImat_matriculaAlertaTierrasWsDto(
			List<MatriculaAlertaTierrasWSDTO> amat_matriculaAlertaTierrasWsDto) {
		this.imat_matriculaAlertaTierrasWsDto = amat_matriculaAlertaTierrasWsDto;
	}

}
