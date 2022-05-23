/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarSaldosNotaCreditoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarSaldosNotaCreditoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito.TipoAdminCSI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito.TipoEntradaConsultarSaldosNotaCredito;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito.TipoSalidaConsultarSaldosNotaCredito;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito.TipoSalidaConsultarSaldosNotaCredito.NotasCreditos;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminCSIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldosNotaCreditoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoNotaCreditoCSNCVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldosNotaCreditoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * saldos nota credito. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarSaldosNotaCreditoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarSaldosNotaCreditoConverter.
	 */
	private ConsultarSaldosNotaCreditoConverter() {
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
	 * consultar saldos nota credito objeto con valores de servicio.
	 *
	 * @param atscsnc_tipoSalidaConsultarSaldosNotaCredito el parametro que
	 *                                                     representa el complex
	 *                                                     type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarMovimientosVO.
	 */
	public static TipoSalidaConsultarSaldosNotaCreditoVO tipoAVo(
			TipoSalidaConsultarSaldosNotaCredito atscsnc_tipoSalidaConsultarSaldosNotaCredito) {
		TipoSalidaConsultarSaldosNotaCreditoVO ltscnc_tipoSalidaConsultarSaldosNotaCreditoVo = new TipoSalidaConsultarSaldosNotaCreditoVO();
		ltscnc_tipoSalidaConsultarSaldosNotaCreditoVo
				.setIbi_codigoMensaje(atscsnc_tipoSalidaConsultarSaldosNotaCredito.getCodigoMensaje());
		ltscnc_tipoSalidaConsultarSaldosNotaCreditoVo.setIltnc_listaNotasCredito(
				listaNotaCreditoAListaNotaCreditoVo(atscsnc_tipoSalidaConsultarSaldosNotaCredito.getNotasCreditos()));
		ltscnc_tipoSalidaConsultarSaldosNotaCreditoVo
				.setIs_descripcionMensaje(atscsnc_tipoSalidaConsultarSaldosNotaCredito.getDescripcionMensaje());
		return ltscnc_tipoSalidaConsultarSaldosNotaCreditoVo;
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
	 * @param alnc_notasCreditos el parametro que representa la lista de complex
	 *                          types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoMovimientoCMOVO.
	 */
	private static List<TipoNotaCreditoCSNCVO> listaNotaCreditoAListaNotaCreditoVo(
			List<NotasCreditos> alnc_notasCreditos) {
		List<TipoNotaCreditoCSNCVO> lltnc_listaTipoNotaCreditoVo = new ArrayList<>();
		for (NotasCreditos lnc_tipoNotaCredito : alnc_notasCreditos) {
			lltnc_listaTipoNotaCreditoVo.add(notaCreditoANotaCreditoVo(lnc_tipoNotaCredito));
		}
		return lltnc_listaTipoNotaCreditoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoNotaCreditoCSNC <b>a</b>
	 * TipoNotaCreditoCSNCVO, <br>
	 * En otras palabras, <b>de</b> Tipo movimiento consultar movimientos output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * TipoNotaCredito CSNC.
	 *
	 * @param anc_notaCredito el parametro que representa el complex type a
	 *                        convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoNotaCreditoCSNCVO.
	 */
	private static TipoNotaCreditoCSNCVO notaCreditoANotaCreditoVo(NotasCreditos anc_notaCredito) {
		TipoNotaCreditoCSNCVO ltnc_tipoNotaCreditoVo = new TipoNotaCreditoCSNCVO();
		ltnc_tipoNotaCreditoVo.setId_fecha(anc_notaCredito.getNotaCredito().getFecha().toGregorianCalendar().getTime());
		ltnc_tipoNotaCreditoVo.setIs_codigo(anc_notaCredito.getNotaCredito().getCodigo());
		ltnc_tipoNotaCreditoVo.setIs_saldo(anc_notaCredito.getNotaCredito().getSaldo());
		ltnc_tipoNotaCreditoVo.setIs_valorRecarga(anc_notaCredito.getNotaCredito().getValorRecarga());
		return ltnc_tipoNotaCreditoVo;
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
	 * <b>a</b> TipoEntradaConsultarSaldosNotaCredito, <br>
	 * En otras palabras, <b>de</b> Tipo Entrada Consultar Saldos Nota Credito objeto con
	 * valores de servicio <b>a</b> Tipo Entrada Consultar Saldos Nota Credito (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecsnc_tipoEntradaConsultarSaldosNotaCreditoVo el parametro que representa el
	 *                                                objeto con valores de servicio
	 *                                                a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarSaldosNotaCredito.
	 */
	public static TipoEntradaConsultarSaldosNotaCredito voATipo(
			TipoEntradaConsultarSaldosNotaCreditoVO atecsnc_tipoEntradaConsultarSaldosNotaCreditoVo) {

		TipoEntradaConsultarSaldosNotaCredito ltecsnc_tipoEntradaConsultarSaldosNotaCredito = new TipoEntradaConsultarSaldosNotaCredito();
		ltecsnc_tipoEntradaConsultarSaldosNotaCredito
				.setAdmin(adminVoAAdmin(atecsnc_tipoEntradaConsultarSaldosNotaCreditoVo.getIta_adminVo()));
		ltecsnc_tipoEntradaConsultarSaldosNotaCredito
				.setIDCuentaCupo(atecsnc_tipoEntradaConsultarSaldosNotaCreditoVo.getIs_idCuentaCupo());
		ltecsnc_tipoEntradaConsultarSaldosNotaCredito.setModulo(atecsnc_tipoEntradaConsultarSaldosNotaCreditoVo.getIs_modulo());
		return ltecsnc_tipoEntradaConsultarSaldosNotaCredito;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminCSIVO <b>a</b> TipoAdminCSI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo Admin CSI (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ata_adminVo el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCSI.
	 */
	private static TipoAdminCSI adminVoAAdmin(TipoAdminCSIVO ata_adminVo) {
		TipoAdminCSI lta_tipoAdminCmi = new TipoAdminCSI();
		lta_tipoAdminCmi.setNumDocAdmin(ata_adminVo.getIs_numDocAdmin());
		lta_tipoAdminCmi.setTipoDocAdmin(ata_adminVo.getIs_tipoDocAdmin());
		return lta_tipoAdminCmi;
	}

}
