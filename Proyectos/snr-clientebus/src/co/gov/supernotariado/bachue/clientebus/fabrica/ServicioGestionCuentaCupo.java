/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioGestionCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioGestionCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ActualizarEntidadConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CancelarUsuarioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarIdCuentaCupoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMovimientosConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarSaldoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarSaldosNotaCreditoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarUsuarioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarUsuariosConverter;
import co.gov.supernotariado.bachue.clientebus.converter.InscribirUsuarioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.PagarCuentaCupoConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.operacion.SBBCBGestionCuentaCupos;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad.TipoEntradaActualizarEntidad;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario.TipoEntradaCancelarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultaridcuentacupo.TipoEntradaConsultarIDCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoEntradaConsultarMovimientos;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo.TipoEntradaConsultarSaldo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito.TipoEntradaConsultarSaldosNotaCredito;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoEntradaConsultarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios.TipoEntradaConsultarUsuarios;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario.TipoEntradaInscribirUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.pagarcuentacupo.TipoEntradaPagarCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBCBGestionCuentaCuposService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
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

/**
 * Implementacion de interfaces para el servicio gestion cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioGestionCuentaCupo implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioGestionCuentaCupo.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.
	 * supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String,
	 * org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBCBGestionCuentaCuposService lsgccs_gestionCuentaCuposService = new SBBCBGestionCuentaCuposService(null,
					qname);
			SBBCBGestionCuentaCupos lgcc_gestionCuentaCupos = lsgccs_gestionCuentaCuposService
					.getSBBCBGestionCuentaCuposSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lgcc_gestionCuentaCupos);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_ACTUALIZAR_ENTIDAD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = actualizarEntidad(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_CANCELAR_USUARIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = cancelarUsuario(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_ID.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarId(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_MOVIMIENTOS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMovimientos(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_SALDO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarSaldo(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_USUARIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarUsuario(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_USUARIOS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarUsuarios(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.GESTION_CUENTA_CUPO_INSCRIBIR_USUARIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = inscribirUsuario(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.GESTION_CUENTA_CUPO_PAGAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = pagar(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.GESTION_CUENTA_CUPO_CONSULTAR_SALDOS_NOTA_CREDITO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarSaldosNotaCredito(aci_clienteIntegracionVO, lgcc_gestionCuentaCupos);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que llama a la operacion de pagar cuenta cupo.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaPagarCuentaCupoVO Datos de respuesta del servicio
	 */
	private TipoSalidaPagarCuentaCupoVO pagar(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaPagarCuentaCupoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaPagarCuentaCupoVO ltepcc_tipoEntradaPagarCuentaCupoVo = (TipoEntradaPagarCuentaCupoVO) aci_clienteIntegracionVO;
		TipoEntradaPagarCuentaCupo ltepcc_tipoEntradaPagarCuentaCupo = PagarCuentaCupoConverter
				.voATipo(ltepcc_tipoEntradaPagarCuentaCupoVo);

		UtilidadLog<TipoEntradaPagarCuentaCupoVO> lultepcc_utilidadLogEntrada = new UtilidadLog<>();
		lultepcc_utilidadLogEntrada.generarDebugObjeto(ltepcc_tipoEntradaPagarCuentaCupoVo,
				TipoEntradaPagarCuentaCupoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaPagarCuentaCupoVO ltspcc_tipoSalidaPagarCuentaCupoVo;
		ltspcc_tipoSalidaPagarCuentaCupoVo = PagarCuentaCupoConverter
				.tipoAVo(asgcc_gestionCuentaCupos.pagarCuentaCupo(ltepcc_tipoEntradaPagarCuentaCupo));

		UtilidadLog<TipoSalidaPagarCuentaCupoVO> lultspcc_utilidadLogSalida = new UtilidadLog<>();
		lultspcc_utilidadLogSalida.generarDebugObjeto(ltspcc_tipoSalidaPagarCuentaCupoVo,
				TipoSalidaPagarCuentaCupoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltspcc_tipoSalidaPagarCuentaCupoVo;
	}

	/**
	 * Metodo que llama a la operacion de inscribir usuario.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaInscribirUsuarioVO Datos de respuesta del servicio
	 */
	private TipoSalidaInscribirUsuarioVO inscribirUsuario(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaInscribirUsuarioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaInscribirUsuarioVO lteiu_tipoEntradaInscribirUsuarioVo = (TipoEntradaInscribirUsuarioVO) aci_clienteIntegracionVO;
		TipoEntradaInscribirUsuario lteiu_tipoEntradaInscribirUsuario = InscribirUsuarioConverter
				.voATipo(lteiu_tipoEntradaInscribirUsuarioVo);

		UtilidadLog<TipoEntradaInscribirUsuarioVO> lulteiu_utilidadLogEntrada = new UtilidadLog<>();
		lulteiu_utilidadLogEntrada.generarDebugObjeto(lteiu_tipoEntradaInscribirUsuarioVo,
				TipoEntradaInscribirUsuarioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaInscribirUsuarioVO ltsiu_tipoSalidaInscribirUsuarioVo;
		ltsiu_tipoSalidaInscribirUsuarioVo = InscribirUsuarioConverter
				.tipoAVo(asgcc_gestionCuentaCupos.inscribirUsuario(lteiu_tipoEntradaInscribirUsuario));

		UtilidadLog<TipoSalidaInscribirUsuarioVO> lultsiu_utilidadLogSalida = new UtilidadLog<>();
		lultsiu_utilidadLogSalida.generarDebugObjeto(ltsiu_tipoSalidaInscribirUsuarioVo,
				TipoSalidaInscribirUsuarioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsiu_tipoSalidaInscribirUsuarioVo;
	}

	/**
	 * Metodo que llama a la operacion de consultar usuarios.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarUsuariosVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarUsuariosVO consultarUsuarios(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarUsuariosVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarUsuariosVO ltecu_tipoEntradaConsultarUsuariosVo = (TipoEntradaConsultarUsuariosVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarUsuarios ltecu_tipoEntradaConsultarUsuarios = ConsultarUsuariosConverter
				.voATipo(ltecu_tipoEntradaConsultarUsuariosVo);

		UtilidadLog<TipoEntradaConsultarUsuariosVO> lultecu_utilidadLogEntrada = new UtilidadLog<>();
		lultecu_utilidadLogEntrada.generarDebugObjeto(ltecu_tipoEntradaConsultarUsuariosVo,
				TipoEntradaConsultarUsuariosVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarUsuariosVO ltscu_tipoSalidaConsultarUsuariosVo;
		ltscu_tipoSalidaConsultarUsuariosVo = ConsultarUsuariosConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarUsuarios(ltecu_tipoEntradaConsultarUsuarios));

		UtilidadLog<TipoSalidaConsultarUsuariosVO> lultscu_utilidadLogSalida = new UtilidadLog<>();
		lultscu_utilidadLogSalida.generarDebugObjeto(ltscu_tipoSalidaConsultarUsuariosVo,
				TipoSalidaConsultarUsuariosVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscu_tipoSalidaConsultarUsuariosVo;
	}

	/**
	 * Metodo que llama a la operacion de consultar usuario.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarUsuarioVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarUsuarioVO consultarUsuario(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarUsuarioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarUsuarioVO ltecu_tipoEntradaConsultarUsuarioVo = (TipoEntradaConsultarUsuarioVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarUsuario ltecu_tipoEntradaConsultarUsuario = ConsultarUsuarioConverter
				.voATipo(ltecu_tipoEntradaConsultarUsuarioVo);

		UtilidadLog<TipoEntradaConsultarUsuarioVO> lultecu_utilidadLogEntrada = new UtilidadLog<>();
		lultecu_utilidadLogEntrada.generarDebugObjeto(ltecu_tipoEntradaConsultarUsuarioVo,
				TipoEntradaConsultarUsuarioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarUsuarioVO ltscu_tipoSalidaConsultarUsuarioVo;
		ltscu_tipoSalidaConsultarUsuarioVo = ConsultarUsuarioConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarUsuario(ltecu_tipoEntradaConsultarUsuario));

		UtilidadLog<TipoSalidaConsultarUsuarioVO> lultscu_utilidadLogSalida = new UtilidadLog<>();
		lultscu_utilidadLogSalida.generarDebugObjeto(ltscu_tipoSalidaConsultarUsuarioVo,
				TipoSalidaConsultarUsuarioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscu_tipoSalidaConsultarUsuarioVo;
	}

	/**
	 * Metodo que llama a la operacion de consultar movimientos.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarMovimientosVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarMovimientosVO consultarMovimientos(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMovimientosVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMovimientosVO ltecm_tipoEntradaConsultarMovimientosVo = (TipoEntradaConsultarMovimientosVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMovimientos ltecm_tipoEntradaConsultarMovimientos = ConsultarMovimientosConverter
				.voATipo(ltecm_tipoEntradaConsultarMovimientosVo);

		UtilidadLog<TipoEntradaConsultarMovimientosVO> lultecm_utilidadLogEntrada = new UtilidadLog<>();
		lultecm_utilidadLogEntrada.generarDebugObjeto(ltecm_tipoEntradaConsultarMovimientosVo,
				TipoEntradaConsultarMovimientosVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMovimientosVO ltscm_tipoSalidaConsultarMovimientosVo;
		ltscm_tipoSalidaConsultarMovimientosVo = ConsultarMovimientosConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarMovimientos(ltecm_tipoEntradaConsultarMovimientos));

		UtilidadLog<TipoSalidaConsultarMovimientosVO> lultscm_utilidadLogSalida = new UtilidadLog<>();
		lultscm_utilidadLogSalida.generarDebugObjeto(ltscm_tipoSalidaConsultarMovimientosVo,
				TipoSalidaConsultarMovimientosVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscm_tipoSalidaConsultarMovimientosVo;
	}

	/**
	 * Metodo que llama a la operacion de consultar saldo.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarSaldoVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarSaldoVO consultarSaldo(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarSaldoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarSaldoVO ltecs_tipoEntradaConsultarSaldoVo = (TipoEntradaConsultarSaldoVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarSaldo ltecs_tipoEntradaConsultarSaldo = ConsultarSaldoConverter
				.voATipo(ltecs_tipoEntradaConsultarSaldoVo);

		UtilidadLog<TipoEntradaConsultarSaldoVO> lultecs_utilidadLogEntrada = new UtilidadLog<>();
		lultecs_utilidadLogEntrada.generarDebugObjeto(ltecs_tipoEntradaConsultarSaldoVo,
				TipoEntradaConsultarSaldoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarSaldoVO ltscs_tipoSalidaConsultarSaldoVo;
		ltscs_tipoSalidaConsultarSaldoVo = ConsultarSaldoConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarSaldo(ltecs_tipoEntradaConsultarSaldo));

		UtilidadLog<TipoSalidaConsultarSaldoVO> lultscs_utilidadLogSalida = new UtilidadLog<>();
		lultscs_utilidadLogSalida.generarDebugObjeto(ltscs_tipoSalidaConsultarSaldoVo, TipoSalidaConsultarSaldoVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscs_tipoSalidaConsultarSaldoVo;
	}

	/**
	 * Metodo que llama a la operacion de consultar id cuenta cupo.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarIDCuentaCupoVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarIDCuentaCupoVO consultarId(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarIDCuentaCupoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarIDCuentaCupoVO ltecicc_tipoEntradaConsultarIDCuentaCupoVo = (TipoEntradaConsultarIDCuentaCupoVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarIDCuentaCupo ltecicc_tipoEntradaConsultarIDCuentaCupo = ConsultarIdCuentaCupoConverter
				.voATipo(ltecicc_tipoEntradaConsultarIDCuentaCupoVo);

		UtilidadLog<TipoEntradaConsultarIDCuentaCupoVO> lultecicc_utilidadLogEntrada = new UtilidadLog<>();
		lultecicc_utilidadLogEntrada.generarDebugObjeto(ltecicc_tipoEntradaConsultarIDCuentaCupoVo,
				TipoEntradaConsultarIDCuentaCupoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarIDCuentaCupoVO ltscicc_tipoSalidaConsultarIDCuentaCupoVo;
		ltscicc_tipoSalidaConsultarIDCuentaCupoVo = ConsultarIdCuentaCupoConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarIDCuentaCupo(ltecicc_tipoEntradaConsultarIDCuentaCupo));

		UtilidadLog<TipoSalidaConsultarIDCuentaCupoVO> lultscicc_utilidadLogSalida = new UtilidadLog<>();
		lultscicc_utilidadLogSalida.generarDebugObjeto(ltscicc_tipoSalidaConsultarIDCuentaCupoVo,
				TipoSalidaConsultarIDCuentaCupoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscicc_tipoSalidaConsultarIDCuentaCupoVo;
	}

	/**
	 * Metodo que llama a la operacion de cancelar usuario.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaCancelarUsuarioVO Datos de respuesta del servicio
	 */
	private TipoSalidaCancelarUsuarioVO cancelarUsuario(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaCancelarUsuarioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaCancelarUsuarioVO ltecu_tipoEntradaCancelarUsuarioVo = (TipoEntradaCancelarUsuarioVO) aci_clienteIntegracionVO;
		TipoEntradaCancelarUsuario ltecu_tipoEntradaCancelarUsuario = CancelarUsuarioConverter
				.voATipo(ltecu_tipoEntradaCancelarUsuarioVo);

		UtilidadLog<TipoEntradaCancelarUsuarioVO> lultecu_utilidadLogEntrada = new UtilidadLog<>();
		lultecu_utilidadLogEntrada.generarDebugObjeto(ltecu_tipoEntradaCancelarUsuarioVo,
				TipoEntradaCancelarUsuarioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaCancelarUsuarioVO ltscu_tipoSalidaCancelarUsuarioVo;
		ltscu_tipoSalidaCancelarUsuarioVo = CancelarUsuarioConverter
				.tipoAVo(asgcc_gestionCuentaCupos.cancelarUsuario(ltecu_tipoEntradaCancelarUsuario));

		UtilidadLog<TipoSalidaCancelarUsuarioVO> lultscu_utilidadLogSalida = new UtilidadLog<>();
		lultscu_utilidadLogSalida.generarDebugObjeto(ltscu_tipoSalidaCancelarUsuarioVo,
				TipoSalidaCancelarUsuarioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscu_tipoSalidaCancelarUsuarioVo;
	}

	/**
	 * Metodo que llama a la operacion de actualizar entidad.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaActualizarEntidadVO Datos de respuesta del servicio
	 */
	private TipoSalidaActualizarEntidadVO actualizarEntidad(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaActualizarEntidadVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaActualizarEntidadVO lteae_tipoEntradaActualizarEntidadVo = (TipoEntradaActualizarEntidadVO) aci_clienteIntegracionVO;
		TipoEntradaActualizarEntidad lteae_tipoEntradaActualizarEntidad = ActualizarEntidadConverter
				.voATipo(lteae_tipoEntradaActualizarEntidadVo);

		UtilidadLog<TipoEntradaActualizarEntidadVO> lulteae_utilidadLogEntrada = new UtilidadLog<>();
		lulteae_utilidadLogEntrada.generarDebugObjeto(lteae_tipoEntradaActualizarEntidadVo,
				TipoEntradaActualizarEntidadVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaActualizarEntidadVO ltsae_tipoSalidaActualizarEntidadVo;
		ltsae_tipoSalidaActualizarEntidadVo = ActualizarEntidadConverter
				.tipoAVO(asgcc_gestionCuentaCupos.actualizarEntidad(lteae_tipoEntradaActualizarEntidad));

		UtilidadLog<TipoSalidaActualizarEntidadVO> lultsae_utilidadLogSalida = new UtilidadLog<>();
		lultsae_utilidadLogSalida.generarDebugObjeto(ltsae_tipoSalidaActualizarEntidadVo,
				TipoSalidaActualizarEntidadVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsae_tipoSalidaActualizarEntidadVo;
	}
	
	/**
	 * Metodo que llama a la operacion de actualizar entidad.
	 *
	 * @param aci_clienteIntegracionVO datos a consumir
	 * @param asgcc_gestionCuentaCupos servicio a consumir
	 * @return TipoSalidaConsultarSaldosNotaCreditoVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarSaldosNotaCreditoVO consultarSaldosNotaCredito(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBCBGestionCuentaCupos asgcc_gestionCuentaCupos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarSaldosNotaCreditoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarSaldosNotaCreditoVO ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo = (TipoEntradaConsultarSaldosNotaCreditoVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarSaldosNotaCredito ltecsnc_tipoEntradaConsultarSaldosNotaCredito = ConsultarSaldosNotaCreditoConverter
				.voATipo(ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo);

		UtilidadLog<TipoEntradaConsultarSaldosNotaCreditoVO> lultecsnc_utilidadLogEntrada = new UtilidadLog<>();
		lultecsnc_utilidadLogEntrada.generarDebugObjeto(ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo,
				TipoEntradaConsultarSaldosNotaCreditoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarSaldosNotaCreditoVO ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo;
		ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo = ConsultarSaldosNotaCreditoConverter
				.tipoAVo(asgcc_gestionCuentaCupos.consultarSaldosNotaCredito(ltecsnc_tipoEntradaConsultarSaldosNotaCredito));

		UtilidadLog<TipoSalidaConsultarSaldosNotaCreditoVO> lultscsnc_utilidadLogSalida = new UtilidadLog<>();
		lultscsnc_utilidadLogSalida.generarDebugObjeto(ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo,
				TipoSalidaConsultarSaldosNotaCreditoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscsnc_tipoSalidaConsultarSaldosNotaCreditoVo;
	}

}
