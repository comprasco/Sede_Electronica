/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: PagarCuentaCupoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: PagarCuentaCupoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.pagarcuentacupo.TipoEntradaPagarCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.pagarcuentacupo.TipoSalidaPagarCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaPagarCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaPagarCuentaCupoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Pagar cuenta
 * cupo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PagarCuentaCupoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase PagarCuentaCupoConverter.
	 */
	private PagarCuentaCupoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaPagarCuentaCupo <b>a</b>
	 * TipoSalidaPagarCuentaCupoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida pagar cuenta cupo (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida pagar
	 * cuenta cupo objeto con valores de servicio.
	 *
	 * @param atspcc_tipoSalidaPagarCuentaCupo el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaPagarCuentaCupoVO.
	 */
	public static TipoSalidaPagarCuentaCupoVO tipoAVo(TipoSalidaPagarCuentaCupo atspcc_tipoSalidaPagarCuentaCupo) {
		TipoSalidaPagarCuentaCupoVO ltspcc_tipoSalidaPagarCuentaCupo = new TipoSalidaPagarCuentaCupoVO();
		ltspcc_tipoSalidaPagarCuentaCupo.setIbi_codigoMensaje(atspcc_tipoSalidaPagarCuentaCupo.getCodigoMensaje());
		ltspcc_tipoSalidaPagarCuentaCupo
				.setIs_descripcionMensaje(atspcc_tipoSalidaPagarCuentaCupo.getDescripcionMensaje());
		return ltspcc_tipoSalidaPagarCuentaCupo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaPagarCuentaCupoVO <b>a</b>
	 * TipoEntradaPagarCuentaCupo, <br>
	 * En otras palabras, <b>de</b> Tipo entrada pagar cuenta cupo objeto con
	 * valores de servicio <b>a</b> Tipo entrada pagar cuenta cupo (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atepcc_tipoEntradaPagarCuentaCupoVo el parametro que representa el
	 *                                            objeto con valores de servicio a
	 *                                            convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaPagarCuentaCupo.
	 */
	public static TipoEntradaPagarCuentaCupo voATipo(TipoEntradaPagarCuentaCupoVO atepcc_tipoEntradaPagarCuentaCupoVo) {
		TipoEntradaPagarCuentaCupo ltepcc_tipoEntradaPagarCuentaCupo = new TipoEntradaPagarCuentaCupo();
		ltepcc_tipoEntradaPagarCuentaCupo.setCorreoElectronicoCorporativoUsuario(
				atepcc_tipoEntradaPagarCuentaCupoVo.getIs_correoElectronicoCorporativoUsuario());
		ltepcc_tipoEntradaPagarCuentaCupo.setFechaPago(
				UtilidadFecha.cambiarDateAXmlGregoriaCalender(atepcc_tipoEntradaPagarCuentaCupoVo.getId_fechaPago()));
		ltepcc_tipoEntradaPagarCuentaCupo.setIDCuentaCupo(atepcc_tipoEntradaPagarCuentaCupoVo.getIs_idCuentaCupo());
		ltepcc_tipoEntradaPagarCuentaCupo.setModulo(atepcc_tipoEntradaPagarCuentaCupoVo.getIs_modulo());
		ltepcc_tipoEntradaPagarCuentaCupo.setMontoPago(atepcc_tipoEntradaPagarCuentaCupoVo.getIbd_montoPago());
		ltepcc_tipoEntradaPagarCuentaCupo.setReferenciaPago(atepcc_tipoEntradaPagarCuentaCupoVo.getIs_referenciaPago());
		return ltepcc_tipoEntradaPagarCuentaCupo;
	}
}
