/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarSaldoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarSaldoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo.TipoAdminCSI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo.TipoEntradaConsultarSaldo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo.TipoSalidaConsultarSaldo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo.TipoUsuarioCSI;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCSIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * saldo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarSaldoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarSaldoConverter.
	 */
	private ConsultarSaldoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarSaldo <b>a</b>
	 * TipoSalidaConsultarSaldoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar saldo (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar saldo objeto con valores de servicio.
	 *
	 * @param atscs_tipoSalidaConsultarSaldo el parametro que representa el complex
	 *                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarSaldoVO.
	 */
	public static TipoSalidaConsultarSaldoVO tipoAVo(TipoSalidaConsultarSaldo atscs_tipoSalidaConsultarSaldo) {
		TipoSalidaConsultarSaldoVO ltscs_tipoSalidaConsultarSaldoVo = new TipoSalidaConsultarSaldoVO();
		ltscs_tipoSalidaConsultarSaldoVo.setIbd_saldoActual(atscs_tipoSalidaConsultarSaldo.getSaldoActual());
		ltscs_tipoSalidaConsultarSaldoVo
				.setIbd_ultimaRecargaValor(atscs_tipoSalidaConsultarSaldo.getUltimaRecargaValor());
		ltscs_tipoSalidaConsultarSaldoVo.setIbi_codigoMensaje(atscs_tipoSalidaConsultarSaldo.getCodigoMensaje());
		ltscs_tipoSalidaConsultarSaldoVo.setId_ultimaRecargaFecha(
				UtilidadFecha.cambioGregorianADate(atscs_tipoSalidaConsultarSaldo.getUltimaRecargaFecha()));
		ltscs_tipoSalidaConsultarSaldoVo
				.setIs_descripcionMensaje(atscs_tipoSalidaConsultarSaldo.getDescripcionMensaje());
		return ltscs_tipoSalidaConsultarSaldoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarSaldoVO <b>a</b>
	 * TipoEntradaConsultarSaldo, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar saldo objeto con valores
	 * de servicio <b>a</b> Tipo entrada consultar saldo (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atecs_tipoEntradaConsultarSaldoVo el parametro que representa el
	 *                                          objeto con valores de servicio a
	 *                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarSaldo.
	 */
	public static TipoEntradaConsultarSaldo voATipo(TipoEntradaConsultarSaldoVO atecs_tipoEntradaConsultarSaldoVo) {
		TipoEntradaConsultarSaldo ltecs_tipoEntradaConsultarSaldo = new TipoEntradaConsultarSaldo();
		ltecs_tipoEntradaConsultarSaldo.setAdmin(adminVoAAdmin(atecs_tipoEntradaConsultarSaldoVo.getIta_adminVo()));
		ltecs_tipoEntradaConsultarSaldo.setIDCuentaCupo(atecs_tipoEntradaConsultarSaldoVo.getIs_idCuentaCupo());
		ltecs_tipoEntradaConsultarSaldo.setModulo(atecs_tipoEntradaConsultarSaldoVo.getIs_modulo());
		ltecs_tipoEntradaConsultarSaldo
				.setUsuario(usuarioVoAUsuario(atecs_tipoEntradaConsultarSaldoVo.getItu_usuarioCsi()));
		return ltecs_tipoEntradaConsultarSaldo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCSIVO <b>a</b> TipoUsuarioCSI,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo usuario CSIVO <b>a</b> Tipo usuario
	 * consultar saldo input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atu_usuarioCsi el parametro que representa el objeto con valores de
	 *                       servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoUsuarioCSI.
	 */
	private static TipoUsuarioCSI usuarioVoAUsuario(TipoUsuarioCSIVO atu_usuarioCsi) {
		TipoUsuarioCSI ltu_tipoUsuarioCsi = new TipoUsuarioCSI();
		ltu_tipoUsuarioCsi.setNumDocUsuario(atu_usuarioCsi.getIs_numDocUsuario());
		ltu_tipoUsuarioCsi.setTipoDocUsuario(atu_usuarioCsi.getIs_tipoDocUsuario());
		return ltu_tipoUsuarioCsi;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminCSI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin consultar saldo input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param ata_adminVo el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCSI.
	 */
	private static TipoAdminCSI adminVoAAdmin(TipoAdminVO ata_adminVo) {
		TipoAdminCSI lta_tipoAdminCsi = new TipoAdminCSI();
		lta_tipoAdminCsi.setNumDocAdmin(ata_adminVo.getIs_numDocAdmin());
		lta_tipoAdminCsi.setTipoDocAdmin(ata_adminVo.getIs_tipoDocAdmin());
		return lta_tipoAdminCsi;
	}

}
