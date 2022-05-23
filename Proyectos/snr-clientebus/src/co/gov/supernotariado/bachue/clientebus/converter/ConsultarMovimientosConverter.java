/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarMovimientosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarMovimientosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoAdminCMI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoEntradaConsultarMovimientos;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoMovimientoCMO;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoNotaCreditoCMO;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoReciboCajaCMO;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos.TipoSalidaConsultarMovimientos;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarMovimientosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoMovimientoCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoNotaCreditoCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoReciboCajaCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarMovimientosVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * movimientos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMovimientosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMovimientosConverter.
	 */
	private ConsultarMovimientosConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMovimientos <b>a</b>
	 * TipoSalidaConsultarMovimientosVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar movimientos (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar movimientos objeto con valores de servicio.
	 *
	 * @param atscm_tipoSalidaConsultarMovimientos el parametro que representa el
	 *                                             complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarMovimientosVO.
	 */
	public static TipoSalidaConsultarMovimientosVO tipoAVo(
			TipoSalidaConsultarMovimientos atscm_tipoSalidaConsultarMovimientos) {
		TipoSalidaConsultarMovimientosVO ltscm_tipoSalidaConsultarMovimientosVo = new TipoSalidaConsultarMovimientosVO();
		ltscm_tipoSalidaConsultarMovimientosVo
				.setIbi_codigoMensaje(atscm_tipoSalidaConsultarMovimientos.getCodigoMensaje());
		ltscm_tipoSalidaConsultarMovimientosVo.setIltm_movimientos(listaMovimientosAListaMovimientosVo(
				atscm_tipoSalidaConsultarMovimientos.getMovimientos().getMovimiento()));
		ltscm_tipoSalidaConsultarMovimientosVo
				.setIs_descripcionMensaje(atscm_tipoSalidaConsultarMovimientos.getDescripcionMensaje());
		return ltscm_tipoSalidaConsultarMovimientosVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMovimientoCMO <b>a</b>
	 * TipoMovimientoCMOVO, <br>
	 * En otras palabras, <b>de</b> Tipo movimiento consultar movimientos output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * movimiento CMOVO.
	 *
	 * @param altm_tipoMovimientoCmo el parametro que representa la lista de complex
	 *                               types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoMovimientoCMOVO.
	 */
	private static List<TipoMovimientoCMOVO> listaMovimientosAListaMovimientosVo(
			List<TipoMovimientoCMO> altm_tipoMovimientoCmo) {
		List<TipoMovimientoCMOVO> lltm_listaTipoMovimientoCmoVo = new ArrayList<>();
		for (TipoMovimientoCMO ltm_tipoMovimientoCmo : altm_tipoMovimientoCmo) {
			lltm_listaTipoMovimientoCmoVo.add(movimientosAMovimientosVo(ltm_tipoMovimientoCmo));
		}
		return lltm_listaTipoMovimientoCmoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMovimientoCMO <b>a</b>
	 * TipoMovimientoCMOVO, <br>
	 * En otras palabras, <b>de</b> Tipo movimiento consultar movimientos output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * movimiento CMOVO.
	 *
	 * @param atm_tipoMovimientoCmo el parametro que representa el complex type a
	 *                              convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoMovimientoCMOVO.
	 */
	private static TipoMovimientoCMOVO movimientosAMovimientosVo(TipoMovimientoCMO atm_tipoMovimientoCmo) {
		TipoMovimientoCMOVO ltm_tipoMovimientoCmoVo = new TipoMovimientoCMOVO();
		ltm_tipoMovimientoCmoVo
				.setId_fechaMovimiento(atm_tipoMovimientoCmo.getFechaMovimiento().toGregorianCalendar().getTime());
		ltm_tipoMovimientoCmoVo.setIs_id(atm_tipoMovimientoCmo.getId());
		ltm_tipoMovimientoCmoVo.setIs_tipo(atm_tipoMovimientoCmo.getTipo());
		ltm_tipoMovimientoCmoVo.setItnc_notaCredito(notaANotaVo(atm_tipoMovimientoCmo.getNotaCredito()));
		ltm_tipoMovimientoCmoVo.setItrc_reciboCaja(reciboAReciboVo(atm_tipoMovimientoCmo.getReciboCaja()));
		return ltm_tipoMovimientoCmoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoReciboCajaCMO <b>a</b>
	 * TipoReciboCajaCMOVO, <br>
	 * En otras palabras, <b>de</b> Tipo recibo caja consultar movimientos output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * recibo caja CMOVO.
	 *
	 * @param atrc_tipoReciboCajaCmo el parametro que representa el complex type a
	 *                               convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoReciboCajaCMOVO.
	 */
	private static TipoReciboCajaCMOVO reciboAReciboVo(TipoReciboCajaCMO atrc_tipoReciboCajaCmo) {
		TipoReciboCajaCMOVO ltrc_tipoReciboCajaCmoVo = new TipoReciboCajaCMOVO();
		if (atrc_tipoReciboCajaCmo.getValor() != null)
			ltrc_tipoReciboCajaCmoVo.setIbd_valor(atrc_tipoReciboCajaCmo.getValor().getValue());
		ltrc_tipoReciboCajaCmoVo.setIs_numero(atrc_tipoReciboCajaCmo.getNumero());
		return ltrc_tipoReciboCajaCmoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoNotaCreditoCMO <b>a</b>
	 * TipoNotaCreditoCMOVO, <br>
	 * En otras palabras, <b>de</b> Tipo nota credito consultar movimientos output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * nota credito CMOVO.
	 *
	 * @param atnc_tipoNotaCreditoCmo el parametro que representa el complex type a
	 *                                convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoNotaCreditoCMOVO.
	 */
	private static TipoNotaCreditoCMOVO notaANotaVo(TipoNotaCreditoCMO atnc_tipoNotaCreditoCmo) {
		TipoNotaCreditoCMOVO ltnc_tipoNotaCreditoCmoVo = new TipoNotaCreditoCMOVO();
		if (atnc_tipoNotaCreditoCmo.getValor() != null)
			ltnc_tipoNotaCreditoCmoVo.setIbd_valor(atnc_tipoNotaCreditoCmo.getValor().getValue());
		ltnc_tipoNotaCreditoCmoVo.setIs_numero(atnc_tipoNotaCreditoCmo.getNumero());
		return ltnc_tipoNotaCreditoCmoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMovimientosVO
	 * <b>a</b> TipoEntradaConsultarMovimientos, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar movimientos objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar movimientos (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecm_tipoEntradaConsultarMovimientosVo el parametro que representa el
	 *                                                objeto con valores de servicio
	 *                                                a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarMovimientos.
	 */
	public static TipoEntradaConsultarMovimientos voATipo(
			TipoEntradaConsultarMovimientosVO atecm_tipoEntradaConsultarMovimientosVo) {
		XMLGregorianCalendar lxmlgc_fechaFinal = UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(atecm_tipoEntradaConsultarMovimientosVo.getId_fechaFinal());
		lxmlgc_fechaFinal.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		XMLGregorianCalendar lxmlgc_fechaInicial = UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(atecm_tipoEntradaConsultarMovimientosVo.getId_fechaInicial());
		lxmlgc_fechaInicial.setTimezone(DatatypeConstants.FIELD_UNDEFINED);

		TipoEntradaConsultarMovimientos ltecm_tipoEntradaConsultarMovimientos = new TipoEntradaConsultarMovimientos();
		ltecm_tipoEntradaConsultarMovimientos
				.setAdmin(adminVoAAdmin(atecm_tipoEntradaConsultarMovimientosVo.getIta_adminVo()));
		ltecm_tipoEntradaConsultarMovimientos.setFechaFinal(lxmlgc_fechaFinal);
		ltecm_tipoEntradaConsultarMovimientos.setFechaInicial(lxmlgc_fechaInicial);
		ltecm_tipoEntradaConsultarMovimientos
				.setIDCuentaCupo(atecm_tipoEntradaConsultarMovimientosVo.getIs_idCuentaCupo());
		ltecm_tipoEntradaConsultarMovimientos.setModulo(atecm_tipoEntradaConsultarMovimientosVo.getIs_modulo());
		return ltecm_tipoEntradaConsultarMovimientos;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminCMI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin CMI (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ata_adminVo el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCMI.
	 */
	private static TipoAdminCMI adminVoAAdmin(TipoAdminVO ata_adminVo) {
		TipoAdminCMI lta_tipoAdminCmi = new TipoAdminCMI();
		lta_tipoAdminCmi.setNumDocAdmin(ata_adminVo.getIs_numDocAdmin());
		lta_tipoAdminCmi.setTipoDocAdmin(ata_adminVo.getIs_tipoDocAdmin());
		return lta_tipoAdminCmi;
	}

}
