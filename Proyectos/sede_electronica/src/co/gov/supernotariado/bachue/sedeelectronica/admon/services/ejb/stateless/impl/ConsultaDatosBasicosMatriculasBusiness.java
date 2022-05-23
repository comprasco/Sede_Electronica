/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultaDatosBasicosMatriculasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: ConsultaDatosBasicosMatriculasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import java.math.BigInteger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoEntradaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoSalidaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultaDatosBasicosWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaDatosBasicosMatriculasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Consulta datos basicos matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultaDatosBasicosMatriculasBusiness", mappedName = "ConsultaDatosBasicosMatriculasBusiness")
@LocalBean
public class ConsultaDatosBasicosMatriculasBusiness implements IConsultaDatosBasicosMatriculasBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaDatosBasicosMatriculasBusiness#consultarDatosBasicos(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaDatosBasicosMatriculaWSDTO)
	 */
	@Override
	public TipoSalidaDatosBasicosMatriculaWSDTO consultarDatosBasicos(
			TipoEntradaDatosBasicosMatriculaWSDTO atedbm_tipoEntradaDatosBAsicosMatriculasWsDto) {
		TipoEntradaDatosBasicosMatriculaVO ltedbm_tipoEntradaDatosBasicosMatriculasVo = ConsultaDatosBasicosWsDtoConverter.voAWsDto(atedbm_tipoEntradaDatosBAsicosMatriculasWsDto);
		TipoSalidaDatosBasicosMatriculaVO ltsdbm_tipoSalidaDatosBasicosMatriculaVo = (TipoSalidaDatosBasicosMatriculaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_DATOS_BASICOS_MATRICULA, EnumOperacionesWs.CONSULTA_DATOS_BASICOS_MATRICULA, ltedbm_tipoEntradaDatosBasicosMatriculasVo);
		TipoSalidaDatosBasicosMatriculaWSDTO ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto;
		ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto = ConsultaDatosBasicosWsDtoConverter.wsDtoAVo(ltsdbm_tipoSalidaDatosBasicosMatriculaVo);

		//Sedeja esta linea por que el servicio no devulve codigos de error o exitoso
		if(ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto.getIbi_codMensaje() == null) {
			BigInteger lbi_codigoOperacion = new BigInteger((ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto.getIltm_listaMatriculasWsDto() != null)?EnumCodigosRespuestas.CODIGO_200.getIs_codigo():EnumCodigosRespuestas.CODIGO_409.getIs_codigo());
			ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto.setIbi_codMensaje(lbi_codigoOperacion);
		}
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTA_DATOS_BASICOS_MATRICULA.getIs_nombreServicio(), 
				atedbm_tipoEntradaDatosBAsicosMatriculasWsDto.toString(), 
				ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto);
		return ltsdbm_tipoSalidaDatosBasicosMatriculasWsDto;
	}
}
