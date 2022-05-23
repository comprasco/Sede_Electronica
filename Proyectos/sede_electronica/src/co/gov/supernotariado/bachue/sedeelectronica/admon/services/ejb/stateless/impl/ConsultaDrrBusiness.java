/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertaTierrasWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: AlertaTierrasWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoEntradaConsultarRRRMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultaDrrConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaDrrBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.TipoSalidaConsultarRRRMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesConsultaDrr;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Consulta Drr. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultaDrrBusiness", mappedName = "ConsultaDrrBusiness")
@LocalBean
public class ConsultaDrrBusiness implements IConsultaDrrBusiness{

	@Override
	public TipoSalidaConsultarRRRMatriculasWSDTO consultaDrr(String as_numero, String as_criterioBusqueda) {
		TipoEntradaConsultarRRRMatriculasVO ltecm_entradaConsultaDrr = new TipoEntradaConsultarRRRMatriculasVO();
	
		ltecm_entradaConsultaDrr.setIs_numIdentificacionPredio(as_numero);
		ltecm_entradaConsultaDrr.setIs_tipoIdentificacionPredio(as_criterioBusqueda);
		
		TipoSalidaConsultarRRRMatriculasVO ltscm_tipoSalidaConsultarRRRMatriculasVo = (TipoSalidaConsultarRRRMatriculasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_DRR,EnumOperacionesWs.CONSULTA_DRR,ltecm_entradaConsultaDrr);
		TipoSalidaConsultarRRRMatriculasWSDTO ltscm_tipoSalidaConsultarMatricula = ConsultaDrrConverter.voAWSDTO(ltscm_tipoSalidaConsultarRRRMatriculasVo);
		
		if (!ltscm_tipoSalidaConsultarMatricula.getIs_codMensaje().equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			throw new ExcepcionesNegocio(EnumExcepcionesConsultaDrr.DATOS_NO_ENCONTRADOS);
		}
		
		return ltscm_tipoSalidaConsultarMatricula;
	}
	
}
