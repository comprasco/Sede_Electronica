/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnvioDocumentosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: EnvioDocumentosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoEntradaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoSalidaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.EnviarDocumentoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEnvioDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Envio documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "EnvioDocumentosBusiness", mappedName = "EnvioDocumentosBusiness")
@LocalBean
public class EnvioDocumentosBusiness implements IEnvioDocumentosBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEnvioDocumentosBusiness#enviarDocumentos(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEnviarDocumentoWSDTO)
	 */
	@Override
	public TipoSalidaEnviarDocumentoWSDTO enviarDocumentos(
			TipoEntradaEnviarDocumentoWSDTO ateed_tipoEntradaEnviarDocumentosWsDto) {
		TipoEntradaEnviarDocumentoVO lteed_tipoEntradaEnviarDocumento = EnviarDocumentoWsDtoConverter.wsDtoAVo(ateed_tipoEntradaEnviarDocumentosWsDto);
		TipoSalidaEnviarDocumentoVO ltsed_tipoSalidaEnviarDocumento = (TipoSalidaEnviarDocumentoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENVIO_DOCUMENTO, EnumOperacionesWs.ENVIO_DOCUMENTO, lteed_tipoEntradaEnviarDocumento);
		return EnviarDocumentoWsDtoConverter.voAWsDto(ltsed_tipoSalidaEnviarDocumento);
	}

}
