package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaObtenerPoderWSDTO;
/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Poderes WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPoderesWSBusiness {

	/**
	 * Metodo que permite consultar un poder (metadata)
	 * @param atecp_tipoEntradaConsultaPoder
	 * @return TipoSalidaConsultaPoderWSDTO
	 */
	public TipoSalidaConsultaPoderWSDTO consultarPoder(TipoEntradaConsultaPoderWSDTO atecp_tipoEntradaConsultaPoder);

	/**
	 * Metodo que permite enviar o actualizar un poder en bachue
	 * @param ateep_tipoSalidaEnviarPoder
	 * @return TipoSalidaEnviarPoderWSDTO
	 */
	public TipoSalidaEnviarPoderWSDTO enviarPoder(TipoEntradaEnviarPoderWSDTO ateep_tipoEntradaEnviarPoderWSDTO);

	/**
	 * Metodo que permite actualizar la metada del poder 
	 * @param ateamp_tipoEntradaActualizarMetadatosPoder
	 * @return TipoSalidaActualizarMetadatosPoderWSDTO
	 */
	public TipoSalidaActualizarMetadatosPoderWSDTO actualizarMetadataPoder(
			TipoEntradaActualizarMetadatosPoderWSDTO ateamp_tipoEntradaActualizarMetadatosPoder);

	/**
	 * Metodo que permite obtener un poder (el archivo en bytes)
	 * @param ateop_tipoEntradaObtenerPoderWSDTO
	 * @return TipoSalidaObtenerPoderWSDTO
	 */
	public TipoSalidaObtenerPoderWSDTO obtenerPoder(TipoEntradaObtenerPoderWSDTO ateop_tipoEntradaObtenerPoderWSDTO);

	/**
	 * Metodo que permite obtener un poder
	 * @param as_didPoder
	 * @param as_idDocNamePoder
	 * @return TipoSalidaConsultaPoderWSDTO
	 */
	public TipoSalidaConsultaPoderWSDTO consultarPoder(String as_didPoder, String as_idDocNamePoder);

	/**
	 * Metodo que permite actualizar metada de poder
	 * @param ateep_tipoEntrada
	 * @return TipoSalidaActualizarMetadatosPoderWSDTO
	 */
	public TipoSalidaActualizarMetadatosPoderWSDTO actualizarMetadataPoder(TipoEntradaEnviarPoderWSDTO ateep_tipoEntradaEnviarPoderWSDTO);


}
