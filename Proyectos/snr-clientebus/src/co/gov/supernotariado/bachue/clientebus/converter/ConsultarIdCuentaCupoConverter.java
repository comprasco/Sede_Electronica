/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarIdCuentaCupoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarIdCuentaCupoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultaridcuentacupo.TipoAdminCICCI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultaridcuentacupo.TipoEntradaConsultarIDCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultaridcuentacupo.TipoSalidaConsultarIDCuentaCupo;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminCICCIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarIDCuentaCupoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar id
 * cuenta cupo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarIdCuentaCupoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarIdCuentaCupoConverter.
	 */
	private ConsultarIdCuentaCupoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarIDCuentaCupo <b>a</b>
	 * TipoSalidaConsultarIDCuentaCupoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar ID cuenta cupo
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar ID cuenta cupo objeto con valores de servicio.
	 *
	 * @param atscicc_tipoSalidaConsultarIdCuentaCupo el parametro que representa el
	 *                                                complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarIDCuentaCupoVO.
	 */
	public static TipoSalidaConsultarIDCuentaCupoVO tipoAVo(
			TipoSalidaConsultarIDCuentaCupo atscicc_tipoSalidaConsultarIdCuentaCupo) {
		TipoSalidaConsultarIDCuentaCupoVO ltscicc_tipoSalidaConsultarIdCuentaCupoVo = new TipoSalidaConsultarIDCuentaCupoVO();
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIbi_codigoMensaje(atscicc_tipoSalidaConsultarIdCuentaCupo.getCodigoMensaje());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_descripcionMensaje(atscicc_tipoSalidaConsultarIdCuentaCupo.getDescripcionMensaje());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo.setIs_estado(atscicc_tipoSalidaConsultarIdCuentaCupo.getEstado());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_fechaCreacion(atscicc_tipoSalidaConsultarIdCuentaCupo.getFechaCreacion());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo.setIs_id(atscicc_tipoSalidaConsultarIdCuentaCupo.getID());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo.setIs_saldo(atscicc_tipoSalidaConsultarIdCuentaCupo.getSaldo());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_valorMaximo(atscicc_tipoSalidaConsultarIdCuentaCupo.getValorMaximo());
		ltscicc_tipoSalidaConsultarIdCuentaCupoVo
				.setIs_valorMinimo(atscicc_tipoSalidaConsultarIdCuentaCupo.getValorMinimo());
		return ltscicc_tipoSalidaConsultarIdCuentaCupoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarIDCuentaCupoVO
	 * <b>a</b> TipoEntradaConsultarIDCuentaCupo, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar ID cuenta cupo objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar ID cuenta cupo
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecicc_tipoEntradaConsultarIdCuentaCupoVo el parametro que representa
	 *                                                   el objeto con valores de
	 *                                                   servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarIDCuentaCupo.
	 */
	public static TipoEntradaConsultarIDCuentaCupo voATipo(
			TipoEntradaConsultarIDCuentaCupoVO atecicc_tipoEntradaConsultarIdCuentaCupoVo) {
		TipoEntradaConsultarIDCuentaCupo ltecicc_tipoEntradaConsultarIdCuentaCupo = new TipoEntradaConsultarIDCuentaCupo();
		ltecicc_tipoEntradaConsultarIdCuentaCupo
				.setAdmin(adminVoAAdmin(atecicc_tipoEntradaConsultarIdCuentaCupoVo.getItac_adminCicciVo()));
		ltecicc_tipoEntradaConsultarIdCuentaCupo.setModulo(atecicc_tipoEntradaConsultarIdCuentaCupoVo.getIs_modulo());
		return ltecicc_tipoEntradaConsultarIdCuentaCupo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminCICCIVO <b>a</b> TipoAdminCICCI,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo admin CICCIVO <b>a</b> Tipo admin consulta
	 * id cuenta cupo input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atac_adminCicciVo el parametro que representa el objeto con valores de
	 *                          servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCICCI.
	 */
	private static TipoAdminCICCI adminVoAAdmin(TipoAdminCICCIVO atac_adminCicciVo) {
		TipoAdminCICCI lta_tipoAdminCicci = new TipoAdminCICCI();
		lta_tipoAdminCicci
				.setCorreoElectronicoCorporativoUsuario(atac_adminCicciVo.getIs_correoElectronicoCorporativoUsuario());
		lta_tipoAdminCicci.setNumDocAdmin(atac_adminCicciVo.getIs_numDocAdmin());
		lta_tipoAdminCicci.setTipoDocAdmin(atac_adminCicciVo.getIs_tipoDocAdmin());
		return lta_tipoAdminCicci;
	}
}
