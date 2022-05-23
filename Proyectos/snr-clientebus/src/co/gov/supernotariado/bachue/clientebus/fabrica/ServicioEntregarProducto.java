/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioEntregarProducto.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioEntregarProducto
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ObtenerProductoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerReciboCajaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerTurnosRefPagoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.VerificarProductoConverter;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.operacion.SBBEEEntregaProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.TipoEntradaObtenerProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.TipoEntradaObtenerReciboCaja;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.TipoEntradaObtenerTurnosRefPago;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.TipoEntradaVerificarProducto;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEEntregaProductoService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaVerificarProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaVerificarProductoVO;

/**
 * Implementacion de interfaces para el servicio entrega producto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioEntregarProducto implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioEntregarProducto.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String, org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEEEntregaProductoService lseps_entregaProductoService = new SBBEEEntregaProductoService(null, qname);
			SBBEEEntregaProducto lep_entregaProducto = lseps_entregaProductoService
					.getSBBEEEntregaProductoSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lep_entregaProducto);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.ENTREGAR_PRODUCTO_VERIFICAR_PRODUCTO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = verificarProducto(aci_clienteIntegracionVO, lep_entregaProducto);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ENTREGAR_PRODUCTO_OBTENER_PRODUCTO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerProducto(aci_clienteIntegracionVO, lep_entregaProducto);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.ENTREGAR_PRODUCTO_OBTENER_RECIBO_CAJA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerReciboCaja(aci_clienteIntegracionVO, lep_entregaProducto);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.ENTREGAR_PRODUCTO_OBTENER_TURNOS_REF_PAGO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerTurnosRefPago(aci_clienteIntegracionVO, lep_entregaProducto);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que realiza la operacion de obtener turnos ref pago.
	 *
	 * @param aci_clienteIntegracionVO datos para consumir el servicio
	 * @param aep_entregaProducto      servicio a consumir
	 * @return TipoSalidaObtenerTurnosRefPagoVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerTurnosRefPagoVO obtenerTurnosRefPago(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEEntregaProducto aep_entregaProducto) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaObtenerTurnosRefPagoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerTurnosRefPagoVO lteotrp_tipoEntradaObtenerTurnosRefPagoVo = (TipoEntradaObtenerTurnosRefPagoVO) aci_clienteIntegracionVO;
		TipoEntradaObtenerTurnosRefPago lteotrp_tipoEntradaObtenerTurnosRefPago = ObtenerTurnosRefPagoConverter
				.voATipo(lteotrp_tipoEntradaObtenerTurnosRefPagoVo);

		UtilidadLog<TipoEntradaObtenerTurnosRefPagoVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteotrp_tipoEntradaObtenerTurnosRefPagoVo,
				TipoEntradaObtenerTurnosRefPagoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaObtenerTurnosRefPagoVO ltsotrp_tipoSalidaObtenerTurnosRefPagoVo;
		ltsotrp_tipoSalidaObtenerTurnosRefPagoVo = ObtenerTurnosRefPagoConverter
				.tipoAVo(aep_entregaProducto.obtenerTurnosRefPago(lteotrp_tipoEntradaObtenerTurnosRefPago));

		UtilidadLog<TipoSalidaObtenerTurnosRefPagoVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsotrp_tipoSalidaObtenerTurnosRefPagoVo,
				TipoSalidaObtenerTurnosRefPagoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsotrp_tipoSalidaObtenerTurnosRefPagoVo;
	}

	/**
	 * Metodo que realiza la operacion de verificar producto.
	 *
	 * @param aci_clienteIntegracionVO datos para consumir el servicio
	 * @param aep_entregaProducto      servicio a consumir
	 * @return TipoSalidaVerificarProductoVO Datos de respuesta del servicio
	 */
	private TipoSalidaVerificarProductoVO verificarProducto(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEEntregaProducto aep_entregaProducto) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaVerificarProductoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaVerificarProductoVO ltevp_tipoEntradaVerificarProductoVo = (TipoEntradaVerificarProductoVO) aci_clienteIntegracionVO;
		TipoEntradaVerificarProducto ltevp_tipoEntradaVerificarProducto = VerificarProductoConverter
				.voATipo(ltevp_tipoEntradaVerificarProductoVo);

		UtilidadLog<TipoEntradaVerificarProductoVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltevp_tipoEntradaVerificarProductoVo,
				TipoEntradaVerificarProductoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaVerificarProductoVO ltsvp_tipoSalidaVerificarProductoVo;
		ltsvp_tipoSalidaVerificarProductoVo = VerificarProductoConverter
				.tipoAVo(aep_entregaProducto.verificarProducto(ltevp_tipoEntradaVerificarProducto));

		UtilidadLog<TipoSalidaVerificarProductoVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsvp_tipoSalidaVerificarProductoVo,
				TipoSalidaVerificarProductoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsvp_tipoSalidaVerificarProductoVo;
	}

	/**
	 * Metodo que hace el llamado de la operacion obtener producto.
	 *
	 * @param aci_clienteIntegracionVO datos para consumir el servicio
	 * @param aep_entregarProducto     servicio a consumir
	 * @return TipoSalidaObtenerProductoVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerProductoVO obtenerProducto(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEEntregaProducto aep_entregarProducto) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaObtenerProductoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerProductoVO lteop_tipoEntradaObtenerProductoVo = (TipoEntradaObtenerProductoVO) aci_clienteIntegracionVO;
		TipoEntradaObtenerProducto lteop_tipoEntradaObtenerProducto = ObtenerProductoConverter
				.voATipo(lteop_tipoEntradaObtenerProductoVo);
		TipoSalidaObtenerProductoVO ltsop_tipoSalidaObtenerProductoVo;
		ltsop_tipoSalidaObtenerProductoVo = ObtenerProductoConverter
				.tipoAVo(aep_entregarProducto.obtenerProducto(lteop_tipoEntradaObtenerProducto));
		return ltsop_tipoSalidaObtenerProductoVo;
	}

	/**
	 * Metodo que hace el llamado de la operacion obtener recibo caja.
	 *
	 * @param aci_clienteIntegracioVO datos para consumir el servicio
	 * @param aep_entregarProducto    servicio a consumir
	 * @return TipoSalidaObtenerReciboCajaVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerReciboCajaVO obtenerReciboCaja(ClienteIntegracionVO aci_clienteIntegracioVO,
			SBBEEEntregaProducto aep_entregarProducto) {
		if (!(aci_clienteIntegracioVO instanceof TipoEntradaObtenerReciboCajaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerReciboCajaVO lteorc_tipoEntradaObtenerReciboCajaVo = (TipoEntradaObtenerReciboCajaVO) aci_clienteIntegracioVO;
		TipoEntradaObtenerReciboCaja lteorc_tipoEntradaObtenerReciboCaja = ObtenerReciboCajaConverter
				.voATipo(lteorc_tipoEntradaObtenerReciboCajaVo);
		TipoSalidaObtenerReciboCajaVO ltsorc_tipoSalidaObtenerReciboCajaVo;
		ltsorc_tipoSalidaObtenerReciboCajaVo = ObtenerReciboCajaConverter
				.tipoAVo(aep_entregarProducto.obtenerReciboCaja(lteorc_tipoEntradaObtenerReciboCaja));
		return ltsorc_tipoSalidaObtenerReciboCajaVo;
	}

}
