package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.text.ParseException;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActualizacionPoderCorreoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPoderesBusiness {

	/**
	 * Metodo que permite actualizar el poder PoderDTO
	 * @param ap_poder poder a actualizar
	 * @return TipoSalidaEnviarPoderWSDTO
	 * @throws ParseException
	 */
	public TipoSalidaEnviarPoderWSDTO actualizarPoder(PoderDTO ap_poder) throws ParseException;

	/**
	 * Metodo que permite consultar un poder
	 * @param apcp_parametroConsultarPoder 
	 * @return PoderDTO
	 * @throws ParseException
	 */
	public PoderDTO consultarPoder(ParametroConsultaPoderWSDTO apcp_parametroConsultarPoder) throws ParseException;

	/**
	 * Metodo que permite consultar un poder por su identificador y version
	 * @param as_did
	 * @param as_idDocName
	 * @return TipoEntradaActualizarMetadatosPoderWSDTO
	 */
	public TipoEntradaActualizarMetadatosPoderWSDTO consultarPoder(String as_did, String as_idDocName);

	/**
	 * Metodo que envia una notificaicon a la entidad origen cuando se actualiza un poder
	 * @param aapc_actualizacionPoderCorreo
	 */
	public void notificarActualizacionNotariaOrigen(ActualizacionPoderCorreoDTO aapc_actualizacionPoderCorreo);
	/**
	 * Metodo que se encarga de consultar el archivo del poder
	 * 
	 * @param as_idPoder did del poder a consultar
	 * @param as_nombre nombre o docName del poder
	 * @return array de bites con el archivo
	 */
	public byte[] consultaArchivoPoder(String as_idPoder, String as_nombre);

	/**
	 * Metodo que consulta un poder por su identificador y el nombre de documento
	 * 
	 * @param as_idPoder id del poder
	 * @param as_nombre nombre documento del poder 
	 * @return poder en formato DTO
	 */
	public PoderDTO consultaPoder(String as_idPoder, String as_nombre);

	/**
	 * Metodo que se encarga de llamar el servicio para consultar los poderes y devolverlos como lista de poderes
	 * 
	 * @param apcp_parametroConsultarPoderWsDto parametros de envio para el servicio
	 * @return List<PoderDTO> lista de poderes que devuelve el servicio mapeado en un DTO para su uso en el aplicativo
	 */
	public List<PoderDTO> consultarPoderes(ParametroConsultaPoderWSDTO apcp_parametroConsultarPoderWsDto);


}
