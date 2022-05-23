/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntregaProductoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: EntregaProductoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaVerificarProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaVerificarProductoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerProductoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerReciboCajaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerTurnosRefPagoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.VerificarProductoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerTurnosRefPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerTurnosRefPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Entrega producto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "EntregaProductoBusiness", mappedName = "EntregaProductoBusiness")
@LocalBean
public class EntregaProductoBusiness implements IEntregaProductoBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness#obtenerTurnosRefPago(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerTurnosRefPagoWSDTO)
	 */
	@Override
	public TipoSalidaObtenerTurnosRefPagoWSDTO obtenerTurnosRefPago(
			TipoEntradaObtenerTurnosRefPagoWSDTO ateotrp_tipoEntradaObtenerTurnosRefPagoWsDto) {
		TipoEntradaObtenerTurnosRefPagoVO lteotrp_tipoEntradaObtenerTurnosRefPagoVo = ObtenerTurnosRefPagoWsDtoConverter.voAEntidad(ateotrp_tipoEntradaObtenerTurnosRefPagoWsDto);
		TipoSalidaObtenerTurnosRefPagoVO ltsotrp_tipoSalidaObtenerTurnosRefPagoVo = (TipoSalidaObtenerTurnosRefPagoVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENTREGAR_PRODUCTO, EnumOperacionesWs.ENTREGAR_PRODUCTO_OBTENER_TURNOS_REF_PAGO, lteotrp_tipoEntradaObtenerTurnosRefPagoVo);
		TipoSalidaObtenerTurnosRefPagoWSDTO ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto;
		ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto = ObtenerTurnosRefPagoWsDtoConverter.entidadAVo(ltsotrp_tipoSalidaObtenerTurnosRefPagoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ENTREGAR_PRODUCTO_OBTENER_TURNOS_REF_PAGO.getIs_nombreServicio(), 
				ateotrp_tipoEntradaObtenerTurnosRefPagoWsDto.toString(), 
				ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto);

		return ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness#verificarProducto(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaVerificarProductoWSDTO)
	 */
	@Override
	public TipoSalidaVerificarProductoWSDTO verificarProducto(
			TipoEntradaVerificarProductoWSDTO atevp_tipoEntradaVerificarProdcutoWsDto) {
		TipoEntradaVerificarProductoVO ltevp_tipoEntradaVerificarProductoVo = VerificarProductoWsDtoConverter.voAEntidad(atevp_tipoEntradaVerificarProdcutoWsDto);
		TipoSalidaVerificarProductoVO ltsvp_tipoSalidaVerificarProductoVo = (TipoSalidaVerificarProductoVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENTREGAR_PRODUCTO, EnumOperacionesWs.ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO, ltevp_tipoEntradaVerificarProductoVo);
		TipoSalidaVerificarProductoWSDTO ltsvp_tipoSalidaVerificarProductoWsDto;
		ltsvp_tipoSalidaVerificarProductoWsDto = VerificarProductoWsDtoConverter.entidadAVo(ltsvp_tipoSalidaVerificarProductoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO.getIs_nombreServicio(), 
				atevp_tipoEntradaVerificarProdcutoWsDto.toString(), 
				ltsvp_tipoSalidaVerificarProductoWsDto);

		return ltsvp_tipoSalidaVerificarProductoWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness#obtenerProducto(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerProductoWSDTO)
	 */
	@Override
	public TipoSalidaObtenerProductoWSDTO obtenerProducto(
			TipoEntradaObtenerProductoWSDTO ateop_tipoEntradaObtenerProductoWsDto) {
		TipoEntradaObtenerProductoVO lteop_tipoEntradaObtenerProductoVo = ObtenerProductoWsDtoConverter.voAEntidad(ateop_tipoEntradaObtenerProductoWsDto);
		TipoSalidaObtenerProductoVO ltsop_tipoSalidaObtenerProductoVo = (TipoSalidaObtenerProductoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENTREGAR_PRODUCTO, EnumOperacionesWs.ENTREGAR_PRODUCTO_OBTENER_PRODUCTO, lteop_tipoEntradaObtenerProductoVo);
		TipoSalidaObtenerProductoWSDTO ltsop_tipoSalidaObtenerProductoWsDto;
		ltsop_tipoSalidaObtenerProductoWsDto = ObtenerProductoWsDtoConverter.entidadAVo(ltsop_tipoSalidaObtenerProductoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO.getIs_nombreServicio(), 
				ateop_tipoEntradaObtenerProductoWsDto.toString(), 
				ltsop_tipoSalidaObtenerProductoWsDto);

		return ltsop_tipoSalidaObtenerProductoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness#obtenerReciboCaja(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO)
	 */
	@Override
	public TipoSalidaObtenerReciboCajaWSDTO obtenerReciboCaja(
			TipoEntradaObtenerReciboCajaWSDTO ateorc_tipoEntradaObtenerReciboCajaWsDto) {
		TipoEntradaObtenerReciboCajaVO lteorc_tipoEntradaObtenerReciboCajaVo = ObtenerReciboCajaWsDtoConverter.voAEntidad(ateorc_tipoEntradaObtenerReciboCajaWsDto);
		TipoSalidaObtenerReciboCajaVO ltsorc_tipoSalidaObtenerReciboCajaVo = (TipoSalidaObtenerReciboCajaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENTREGAR_PRODUCTO, EnumOperacionesWs.ENTREGAR_PRODUCTO_OBTENER_RECIBO_CAJA, lteorc_tipoEntradaObtenerReciboCajaVo);
		TipoSalidaObtenerReciboCajaWSDTO ltsorc_tipoSalidaObtenerReciboCajaWsDto;
		ltsorc_tipoSalidaObtenerReciboCajaWsDto = ObtenerReciboCajaWsDtoConverter.entidadAVo(ltsorc_tipoSalidaObtenerReciboCajaVo);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsorc_tipoSalidaObtenerReciboCajaWsDto);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ENTREGAR_PRODUCTO_OBTENER_RECIBO_CAJA.getIs_nombreServicio(), 
				ateorc_tipoEntradaObtenerReciboCajaWsDto.toString(), 
				ltsorc_tipoSalidaObtenerReciboCajaWsDto);

		return ltsorc_tipoSalidaObtenerReciboCajaWsDto;
	}


}
