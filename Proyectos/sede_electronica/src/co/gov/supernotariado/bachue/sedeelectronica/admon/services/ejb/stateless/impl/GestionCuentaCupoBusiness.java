/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GestionCuentaCupoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: GestionCuentaCupoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaActualizarEntidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarMovimientosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldosNotaCreditoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaPagarCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaActualizarEntidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarMovimientosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldosNotaCreditoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaPagarCuentaCupoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ActualizarEntidadWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.CancelarUsuarioWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarIdCuentaCupoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMovimientosWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarSaldoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarSaldosNotaCreditoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarUsuarioWSDTOConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarUsuariosWSDTOConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.InscribirUsuarioWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PagarCuentaCupoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarEntidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarEntidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Gestion cuenta cupo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "GestionCuentaCupoBusiness", mappedName = "GestionCuentaCupoBusiness")
@LocalBean
public class GestionCuentaCupoBusiness implements IGestionCuentaCupoBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#actualizarEntidad(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarEntidadWSDTO)
	 */
	@Override
	public TipoSalidaActualizarEntidadWSDTO actualizarEntidad(
			TipoEntradaActualizarEntidadWSDTO ateae_tipoEntradaActualizarEntidadWsDto) {

		TipoEntradaActualizarEntidadVO lteae_tipoEntradaActualizaEntidadVo = ActualizarEntidadWsDtoConverter.voAEntidad(ateae_tipoEntradaActualizarEntidadWsDto);
		TipoSalidaActualizarEntidadVO ltsae_tipoEntradaActualizarEntidadVo = (TipoSalidaActualizarEntidadVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_ACTUALIZAR_ENTIDAD, lteae_tipoEntradaActualizaEntidadVo);
		TipoSalidaActualizarEntidadWSDTO ltsae_tipoSalidaActualizarEntidadWsDto;
		ltsae_tipoSalidaActualizarEntidadWsDto = ActualizarEntidadWsDtoConverter.entidadAWSDTO(ltsae_tipoEntradaActualizarEntidadVo);
		return ltsae_tipoSalidaActualizarEntidadWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#cancelarUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO)
	 */
	@Override
	public TipoSalidaCancelarUsuarioWSDTO cancelarUsuario(
			TipoEntradaCancelarUsuarioWSDTO atecu_tipoEntradaCancelarUsuarioWsDto) {
		TipoEntradaCancelarUsuarioVO ltecu_tipoEntradaCancelarUsuarioVo = CancelarUsuarioWsDtoConverter.voAEntidad(atecu_tipoEntradaCancelarUsuarioWsDto);
		TipoSalidaCancelarUsuarioVO ltscu_tipoSalidaCancelarUsuarioVo = (TipoSalidaCancelarUsuarioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CANCELAR_USUARIO, ltecu_tipoEntradaCancelarUsuarioVo);
		TipoSalidaCancelarUsuarioWSDTO ltscu_tipoSalidaCancelarUsuarioWsDto;
		ltscu_tipoSalidaCancelarUsuarioWsDto = CancelarUsuarioWsDtoConverter.entidadAVo(ltscu_tipoSalidaCancelarUsuarioVo);
		return ltscu_tipoSalidaCancelarUsuarioWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarMovimientos(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMovimientosWSDTO consultarMovimientos(
			TipoEntradaConsultarMovimientosWSDTO atecm_tipoEntradaConsultarMovimientosWsDto) {
		TipoEntradaConsultarMovimientosVO ltecm_tipoEntradaConsultarMovimientosVo = ConsultarMovimientosWsDtoConverter.voAEntidad(atecm_tipoEntradaConsultarMovimientosWsDto);
		TipoSalidaConsultarMovimientosVO ltscm_tipoEntradaConsultarMovimientosVo = (TipoSalidaConsultarMovimientosVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_MOVIMIENTOS, ltecm_tipoEntradaConsultarMovimientosVo);
		TipoSalidaConsultarMovimientosWSDTO ltscm_tipoSalidaConsultarMovimientosWsDto;
		ltscm_tipoSalidaConsultarMovimientosWsDto = ConsultarMovimientosWsDtoConverter.entidadAVo(ltscm_tipoEntradaConsultarMovimientosVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_MOVIMIENTOS.getIs_nombreServicio(), 
				atecm_tipoEntradaConsultarMovimientosWsDto.toString(), 
				ltscm_tipoSalidaConsultarMovimientosWsDto);		

		return ltscm_tipoSalidaConsultarMovimientosWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarSaldosNotaCredito(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldosNotaCreditoWSDTO)
	 */
	@Override
	public TipoSalidaConsultarSaldosNotaCreditoWSDTO consultarSaldosNotaCredito(
			TipoEntradaConsultarSaldosNotaCreditoWSDTO atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto) {
		TipoEntradaConsultarSaldosNotaCreditoVO ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo = ConsultarSaldosNotaCreditoWsDtoConverter.voAEntidad(atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto);
		TipoSalidaConsultarSaldosNotaCreditoVO ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo = (TipoSalidaConsultarSaldosNotaCreditoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_SALDOS_NOTA_CREDITO, ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo);
		TipoSalidaConsultarSaldosNotaCreditoWSDTO ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVWsDto;
		ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVWsDto = ConsultarSaldosNotaCreditoWsDtoConverter.entidadAVo(ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_SALDOS_NOTA_CREDITO.getIs_nombreServicio(), 
				atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.toString(), 
				ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVWsDto);		

		return ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVWsDto;
	}

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarSaldo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO)
	 */
	@Override
	public TipoSalidaConsultarSaldoWSDTO consultarSaldo(
			TipoEntradaConsultarSaldoWSDTO atecs_tipoEntradaConsultarSaldoWsDto) {
		TipoEntradaConsultarSaldoVO ltecs_tipoEntradaConsultarSaldoVo = ConsultarSaldoWsDtoConverter.voAEntidad(atecs_tipoEntradaConsultarSaldoWsDto);
		TipoSalidaConsultarSaldoVO ltscs_tipoSalidaConsultarSaldoVo = (TipoSalidaConsultarSaldoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_SALDO, ltecs_tipoEntradaConsultarSaldoVo);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = ConsultarSaldoWsDtoConverter.entidadAVo(ltscs_tipoSalidaConsultarSaldoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_SALDO.getIs_nombreServicio(), 
				atecs_tipoEntradaConsultarSaldoWsDto.toString(), 
				ltscs_tipoSalidaConsultarSaldoWsDto);		

		return ltscs_tipoSalidaConsultarSaldoWsDto;		
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuarioWSDTO)
	 */
	@Override
	public TipoSalidaConsultarUsuarioWSDTO consultarUsuario(
			TipoEntradaConsultarUsuarioWSDTO atecu_tipoEntradaConsultarUsuarioWsDto) {
		TipoEntradaConsultarUsuarioVO ltecu_tipoEntradaConsultarUsuarioVo = ConsultarUsuarioWSDTOConverter.voAEntidad(atecu_tipoEntradaConsultarUsuarioWsDto);
		TipoSalidaConsultarUsuarioVO ltscu_tipoSalidaConsultarUsuarioVo = (TipoSalidaConsultarUsuarioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_USUARIO, ltecu_tipoEntradaConsultarUsuarioVo);
		TipoSalidaConsultarUsuarioWSDTO ltscu_tipoSalidaConsultarUsuarioWsDto;
		ltscu_tipoSalidaConsultarUsuarioWsDto = ConsultarUsuarioWSDTOConverter.entidadAVo(ltscu_tipoSalidaConsultarUsuarioVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_USUARIO.getIs_nombreServicio(), 
				atecu_tipoEntradaConsultarUsuarioWsDto.toString(), 
				ltscu_tipoSalidaConsultarUsuarioWsDto);	
		
		return ltscu_tipoSalidaConsultarUsuarioWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarUsuarios(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuariosWSDTO)
	 */
	@Override
	public TipoSalidaConsultarUsuariosWSDTO consultarUsuarios(
			TipoEntradaConsultarUsuariosWSDTO atecu_tipoEntradaConsultarUsuariosWsDto) {
		TipoEntradaConsultarUsuariosVO ltecu_tipoEntradaConsultarUsuariosVo = ConsultarUsuariosWSDTOConverter.voAEntidad(atecu_tipoEntradaConsultarUsuariosWsDto);
		TipoSalidaConsultarUsuariosVO ltscu_tipoSalidaConsultarUsuariosVo = (TipoSalidaConsultarUsuariosVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_USUARIOS, ltecu_tipoEntradaConsultarUsuariosVo);
		TipoSalidaConsultarUsuariosWSDTO ltscu_tipoSalidaConsultarUsuariosWsDto;
		ltscu_tipoSalidaConsultarUsuariosWsDto = ConsultarUsuariosWSDTOConverter.entidadAVo(ltscu_tipoSalidaConsultarUsuariosVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_USUARIOS.getIs_nombreServicio(), 
				atecu_tipoEntradaConsultarUsuariosWsDto.toString(), 
				ltscu_tipoSalidaConsultarUsuariosWsDto);	
		
		return ltscu_tipoSalidaConsultarUsuariosWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#inscribirUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO)
	 */
	@Override
	public TipoSalidaInscribirUsuarioWSDTO inscribirUsuario(
			TipoEntradaInscribirUsuarioWSDTO ateiu_tipoEntradaInscribirUsuarioWsDto) {
		TipoEntradaInscribirUsuarioVO lteiu_tipoEntradaInscribirUsuarioVo = InscribirUsuarioWsDtoConverter.voAEntidad(ateiu_tipoEntradaInscribirUsuarioWsDto);
		TipoSalidaInscribirUsuarioVO ltsiu_tipoSalidaInscribirUsuarioVo = (TipoSalidaInscribirUsuarioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_INSCRIBIR_USUARIO, lteiu_tipoEntradaInscribirUsuarioVo);
		TipoSalidaInscribirUsuarioWSDTO ltsiu_tipoSalidaInscribirUsuarioWsDto;
		ltsiu_tipoSalidaInscribirUsuarioWsDto = InscribirUsuarioWsDtoConverter.entidadAVo(ltsiu_tipoSalidaInscribirUsuarioVo);		
		return ltsiu_tipoSalidaInscribirUsuarioWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#pagarCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaPagarCuentaCupoWSDTO)
	 */
	@Override
	public TipoSalidaPagarCuentaCupoWSDTO pagarCuentaCupo(
			TipoEntradaPagarCuentaCupoWSDTO atepcc_tipoEntradaPagarCuentaCupoWsDto) {
		TipoEntradaPagarCuentaCupoVO ltepcc_tipoEntradaPagarCuentaCupo = PagarCuentaCupoWsDtoConverter.voAEntidad(atepcc_tipoEntradaPagarCuentaCupoWsDto);
		TipoSalidaPagarCuentaCupoVO ltspcc_tipoSalidaPagarCuentaCupo = (TipoSalidaPagarCuentaCupoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_PAGAR, ltepcc_tipoEntradaPagarCuentaCupo);
		TipoSalidaPagarCuentaCupoWSDTO ltspcc_tipoSalidaPagarCuentaCupoWsDto;
		ltspcc_tipoSalidaPagarCuentaCupoWsDto = PagarCuentaCupoWsDtoConverter.entidadAVo(ltspcc_tipoSalidaPagarCuentaCupo);
		return ltspcc_tipoSalidaPagarCuentaCupoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness#consultarIdCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO)
	 */
	@Override
	public TipoSalidaConsultarIDCuentaCupoWSDTO consultarIdCuentaCupo(
			TipoEntradaConsultarIDCuentaCupoWSDTO atecicc_tipoEntradaConsultarIdCuentaCupoWsDto) {
		TipoEntradaConsultarIDCuentaCupoVO ltecicc_tipoEntradaConsultarIdCuentaCupoVo = ConsultarIdCuentaCupoWsDtoConverter.voAEntidad(atecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
		TipoSalidaConsultarIDCuentaCupoVO ltscicc_tipoSalidaConsultarIdCuentaCupoVo = (TipoSalidaConsultarIDCuentaCupoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO, EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_ID, ltecicc_tipoEntradaConsultarIdCuentaCupoVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto;
		ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = ConsultarIdCuentaCupoWsDtoConverter.entidadAVo(ltscicc_tipoSalidaConsultarIdCuentaCupoVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_ID.getIs_nombreServicio(), 
				atecicc_tipoEntradaConsultarIdCuentaCupoWsDto.toString(), 
				ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto);	
		
		return ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto;
	}

}
