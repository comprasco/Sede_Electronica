/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionIndividualHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TransaccionIndividualHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Transaccion
 * individual. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionIndividualHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionIndividualHelper.
	 */
	private TransaccionIndividualHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de una transaccionGenerica a una transaccion Individual.
	 *
	 * @param atg_transaccionGenericaDto TransaccionGenericaDTO a convertir
	 * @return Resultado para generico A individual retornado como
	 *         TransaccionIndividualDTO
	 */
	public static TransaccionIndividualDTO genericoAIndividual(TransaccionGenericaDTO atg_transaccionGenericaDto) {
		TransaccionIndividualDTO lti_transaccionIndividualDto = new TransaccionIndividualDTO();
		lti_transaccionIndividualDto
				.setIlsm_listaSalidaMatriculaDto(atg_transaccionGenericaDto.getIlsm_listaSalidaMatriculaDto());
		lti_transaccionIndividualDto
				.setIemts_enumModoTipoServicio(atg_transaccionGenericaDto.getIemts_enumModoTipoServicio());
		lti_transaccionIndividualDto.setIdc_detalleCatalogoDto(atg_transaccionGenericaDto.getIdc_detalleCatalogoDto());
		lti_transaccionIndividualDto.setIbd_valorTotal(atg_transaccionGenericaDto.getIbd_valorTotal());
		lti_transaccionIndividualDto.setIs_carritoVigente(atg_transaccionGenericaDto.getIs_carritoVigente());
		lti_transaccionIndividualDto.setIp_personaDto(atg_transaccionGenericaDto.getIp_personaDto());
		return lti_transaccionIndividualDto;
	}

}
