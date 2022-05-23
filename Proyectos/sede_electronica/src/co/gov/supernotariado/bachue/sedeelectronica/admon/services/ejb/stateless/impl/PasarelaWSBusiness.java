/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PasarelaWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: PasarelaWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PasarelaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;


/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Pasarela WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PasarelaWSBusiness", mappedName = "PasarelaWSBusiness")
@LocalBean
public class PasarelaWSBusiness implements IPasarelaWSBusiness {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PasarelaWSBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness#verificarNegocio(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO)
	 */
	@Override
	public SalidaVerificacionEstadoNegocioWSDTO verificarNegocio(EntradaVerificacionEstadoNegocioWSDTO aeven_entradaVerificacionDto) {
		EntradaVerificacionEstadoNegocioVO leven_entradaVerificacionVo;
		leven_entradaVerificacionVo = PasarelaWsDtoConverter.entidadAVo(aeven_entradaVerificacionDto);
		SalidaVerificacionEstadoNegocioVO lsven_verificacionEstadoNegocioVo = (SalidaVerificacionEstadoNegocioVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.PASARELA,EnumOperacionesWs.PASARELA_VERIFICAR_NEGOCIO,leven_entradaVerificacionVo);		

		SalidaVerificacionEstadoNegocioWSDTO lsven_verificacionEstadoNegocioWsDto;
		lsven_verificacionEstadoNegocioWsDto = PasarelaWsDtoConverter.voAEntidad(lsven_verificacionEstadoNegocioVo);	
		return lsven_verificacionEstadoNegocioWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness#crearTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO)
	 */
	@Override
	public SalidaCreacionTransaccionWSDTO crearTransaccion(EntradaCreacionTransaccionWSDTO aect_creacionTransaccionDto) {
		EntradaCreacionTransaccionVO lect_entradaCreacionTransaccionVo;
		lect_entradaCreacionTransaccionVo = PasarelaWsDtoConverter.entidadAVo(aect_creacionTransaccionDto);

		SalidaCreacionTransaccionVO lsct_creacionTransaccionVo = (SalidaCreacionTransaccionVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.PASARELA,EnumOperacionesWs.PASARELA_CREAR_TRANSACCION,lect_entradaCreacionTransaccionVo);		

		SalidaCreacionTransaccionWSDTO lsct_verificacionEstadoNegocioWsDto;
		lsct_verificacionEstadoNegocioWsDto = PasarelaWsDtoConverter.voAEntidad(lsct_creacionTransaccionVo);	
		return lsct_verificacionEstadoNegocioWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness#aceptarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaAceptacionTransaccionWSDTO)
	 */
	@Override
	public SalidaAceptacionTransaccionWSDTO aceptarTransaccion(EntradaAceptacionTransaccionWSDTO aeat_entradaAceptacion) {
		EntradaAceptacionTransaccionVO leat_entradaAceptacionTransaccionVo;
		leat_entradaAceptacionTransaccionVo = PasarelaWsDtoConverter.entidadAVo(aeat_entradaAceptacion);

		SalidaAceptacionTransaccionVO lsat_aceptacionTransaccionVo = (SalidaAceptacionTransaccionVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.PASARELA,EnumOperacionesWs.PASARELA_ACEPTAR_TRANSACCION,leat_entradaAceptacionTransaccionVo);		

		SalidaAceptacionTransaccionWSDTO lsat_salidaAceptacionTransaccionWsDto;
		lsat_salidaAceptacionTransaccionWsDto = PasarelaWsDtoConverter.voAEntidad(lsat_aceptacionTransaccionVo);	
		return lsat_salidaAceptacionTransaccionWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPasarelaWSBusiness#validarTransaccionToken(co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO)
	 */
	@Override
	public SalidaConsultaTransaccionTokenWSDTO validarTransaccionToken(EntradaConsultaTransaccionTokenWSDTO aecttw_transaccion) {
		try {
			EntradaConsultaTransaccionTokenVO lectt_entradaConsultaTransaccionToken;

			lectt_entradaConsultaTransaccionToken = PasarelaWsDtoConverter.entidadAVo(aecttw_transaccion);

			SalidaConsultaTransaccionTokenVO lsctt_aceptacionTransaccionVo = (SalidaConsultaTransaccionTokenVO) 
					UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.PASARELA,EnumOperacionesWs.PASARELA_CONSULTAR_TRANSACCION_TOKEN, lectt_entradaConsultaTransaccionToken);		

			SalidaConsultaTransaccionTokenWSDTO lsctt_salidaConsultaTransaccionToken;		
			lsctt_salidaConsultaTransaccionToken = PasarelaWsDtoConverter.voAEntidad(lsctt_aceptacionTransaccionVo);		
			return lsctt_salidaConsultaTransaccionToken;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			return null;
		}		
	}

}
