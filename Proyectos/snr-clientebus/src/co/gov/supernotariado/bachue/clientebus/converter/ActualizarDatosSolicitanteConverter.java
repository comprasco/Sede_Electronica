/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ActualizarDatosSolicitanteConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ActualizarDatosSolicitanteConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.actualizardatossolicitantes.TipoEntradaActualizarDatosSolicitante;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.actualizardatossolicitantes.TipoSalidaActualizarDatosSolicitante;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaActualizarDatosSolicitanteVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaActualizarDatosSolicitanteVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Actualizar
 * datos solicitante. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActualizarDatosSolicitanteConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActualizarDatosSolicitanteConverter.
	 */
	private ActualizarDatosSolicitanteConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaActualizarDatosSolicitante
	 * <b>a</b> TipoSalidaActualizarDatosSolicitanteVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida actualizar datos solicitante
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida actualizar datos solicitante objeto con valores de servicio.
	 *
	 * @param atsads_tipoSalidaActualizarDatosSolicitante el parametro que
	 *                                                    representa el complex type
	 *                                                    a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaActualizarDatosSolicitanteVO.
	 */
	public static TipoSalidaActualizarDatosSolicitanteVO tipoAVo(
			TipoSalidaActualizarDatosSolicitante atsads_tipoSalidaActualizarDatosSolicitante) {
		TipoSalidaActualizarDatosSolicitanteVO ltsads_tipoSalidaActualizarDatosSolicitante = new TipoSalidaActualizarDatosSolicitanteVO();

		ltsads_tipoSalidaActualizarDatosSolicitante
				.setIs_codigoMensaje(atsads_tipoSalidaActualizarDatosSolicitante.getCodigoMensaje());
		if (atsads_tipoSalidaActualizarDatosSolicitante.getDescripcionMensaje() != null)
			ltsads_tipoSalidaActualizarDatosSolicitante.setIs_descripcionMensaje(
					atsads_tipoSalidaActualizarDatosSolicitante.getDescripcionMensaje().getValue());

		return ltsads_tipoSalidaActualizarDatosSolicitante;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActualizarDatosSolicitanteVO
	 * <b>a</b> TipoEntradaActualizarDatosSolicitante, <br>
	 * En otras palabras, <b>de</b> Tipo entrada actualizar datos solicitante objeto
	 * con valores de servicio <b>a</b> Tipo entrada actualizar datos solicitante
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateads_tipoEntradaActualizarDatosSolicitanteVo el parametro que
	 *                                                       representa el objeto
	 *                                                       con valores de servicio
	 *                                                       a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaActualizarDatosSolicitante.
	 */
	public static TipoEntradaActualizarDatosSolicitante voATipo(
			TipoEntradaActualizarDatosSolicitanteVO ateads_tipoEntradaActualizarDatosSolicitanteVo) {
		TipoEntradaActualizarDatosSolicitante lteads_tipoEntradaActualizarDatosSolicitante = new TipoEntradaActualizarDatosSolicitante();

		lteads_tipoEntradaActualizarDatosSolicitante
				.setNumeroDocSolicitante(ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_numeroDocSolicitante());
		lteads_tipoEntradaActualizarDatosSolicitante
				.setNumeroReferencia(ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_numeroReferencia());
		QName lqn_qNamePrimerApellido = new QName(EnumTypesSoap.QNAME_PRIMER_APELLIDO_SOLICITANTE.getIs_valor());
		lteads_tipoEntradaActualizarDatosSolicitante
				.setPrimerApellidoSolicitante(new JAXBElement<>(lqn_qNamePrimerApellido, String.class,
						ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_primerApellidoSolicitante()));
		QName lqn_qNamePrimerNombre = new QName(EnumTypesSoap.QNAME_PRIMER_NOMBRE_SOLICITANTE.getIs_valor());
		lteads_tipoEntradaActualizarDatosSolicitante.setPrimerNombreSolicitante(new JAXBElement<>(lqn_qNamePrimerNombre,
				String.class, ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_primerNombreSolicitante()));
		QName lqn_qNameSegundoApellido = new QName(EnumTypesSoap.QNAME_SEGUNDO_APELLIDO_SOLICITANTE.getIs_valor());
		lteads_tipoEntradaActualizarDatosSolicitante
				.setSegundoApellidoSolicitante(new JAXBElement<>(lqn_qNameSegundoApellido, String.class,
						ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_segundoApellidoSolicitante()));
		QName lqn_qNameSegundoNombre = new QName(EnumTypesSoap.QNAME_SEGUNDO_NOMBRE_SOLICITANTE.getIs_valor());
		lteads_tipoEntradaActualizarDatosSolicitante
				.setSegundoNombreSolicitante(new JAXBElement<>(lqn_qNameSegundoNombre, String.class,
						ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_segundoNombreSolicitante()));
		lteads_tipoEntradaActualizarDatosSolicitante
				.setTipoDocSolicitante(ateads_tipoEntradaActualizarDatosSolicitanteVo.getIs_tipoDocSolicitante());

		return lteads_tipoEntradaActualizarDatosSolicitante;
	}

}
