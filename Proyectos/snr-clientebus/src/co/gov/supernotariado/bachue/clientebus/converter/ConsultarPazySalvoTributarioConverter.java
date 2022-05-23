/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarPazySalvoTributarioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarPazySalvoTributarioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.consultapazysalvotributario.types.consultarpazysalvotributario.TipoEntradaConsultarPazySalvoTributario;
import co.gov.supernotariado.bachue.clientebus.consultapazysalvotributario.types.consultarpazysalvotributario.TipoSalidaConsultarPazySalvoTributario;
import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoEntradaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoSalidaConsultarPazySalvoTributarioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * pazy salvo tributario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarPazySalvoTributarioConverter {

	/**
	 * Define la constante CS_NOMBRE_ESPACIO.
	 */
	private static final String CS_NOMBRE_ESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultapazysalvotributario/consultarpazysalvotributario/v1";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarPazySalvoTributarioConverter.
	 */
	private ConsultarPazySalvoTributarioConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarPazySalvoTributarioVO
	 * <b>a</b> TipoEntradaConsultarPazySalvoTributario, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar pazy salvo tributario
	 * objeto con valores de servicio <b>a</b> Tipo entrada consultar pazy salvo
	 * tributario (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecpst_tipoEntradaConsultarPazySalvoTributarioVo el parametro que
	 *                                                          representa el objeto
	 *                                                          con valores de
	 *                                                          servicio a
	 *                                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarPazySalvoTributario.
	 */
	public static TipoEntradaConsultarPazySalvoTributario voATipo(
			TipoEntradaConsultarPazySalvoTributarioVO atecpst_tipoEntradaConsultarPazySalvoTributarioVo) {
		TipoEntradaConsultarPazySalvoTributario ltecpst_tipoEntradaConsultarPazySalvoTributario = new TipoEntradaConsultarPazySalvoTributario();
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setEntidadCertificadora(
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_entidadCertificadora());
		QName lqn_qNameEntidad = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_ENTIDAD.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setEntidad(new JAXBElement<>(lqn_qNameEntidad, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_entidad()));
		QName lqn_qNameUsuario = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_USUARIO.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setUsuario(new JAXBElement<>(lqn_qNameUsuario, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_usuario()));
		QName lqn_qNameClave = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_CLAVE.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setClave(new JAXBElement<>(lqn_qNameClave, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_clave()));
		QName lqn_qNameCodigoDepartamento = new QName(CS_NOMBRE_ESPACIO,
				EnumTypesSoap.QNAME_CODIGO_DEPARTAMENTO.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setCodigoDepartamento(new JAXBElement<>(lqn_qNameCodigoDepartamento, String.class,
						atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_codigoDepartamento()));
		QName lqn_qNameCodigoMunicipio = new QName(CS_NOMBRE_ESPACIO, "codigoMunicipio");
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setCodigoMunicipio(new JAXBElement<String>(
				lqn_qNameCodigoMunicipio, String.class, TipoEntradaConsultarPazySalvoTributario.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_codigoMunicipio()));
		QName lqn_qNameCodigoNotaria = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_CODIGO_NOTARIA.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setCodigoNotaria(new JAXBElement<>(lqn_qNameCodigoNotaria,
				String.class, atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_codigoNotaria()));
		QName lqn_qNameReferenciaCatastral = new QName(CS_NOMBRE_ESPACIO,
				EnumTypesSoap.QNAME_REFERENCIA_CATASTRAL.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setReferenciaCatastral(new JAXBElement<>(lqn_qNameReferenciaCatastral, String.class,
						atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_referenciaCatastral()));
		QName lqn_qNameNumeroMatricula = new QName(CS_NOMBRE_ESPACIO,
				EnumTypesSoap.QNAME_NUMERO_MATRICULA.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setNumeroMatricula(new JAXBElement<>(lqn_qNameNumeroMatricula,
				String.class, atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_numeroMatricula()));
		QName lqn_qNameChip = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_CHIP.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setChip(new JAXBElement<>(lqn_qNameChip, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_chip()));
		QName lqn_qNameDireccion = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_DIRECCION.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setDireccion(new JAXBElement<>(lqn_qNameDireccion, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_direccion()));
		QName lqn_qNameImpuesto = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_IMPUESTO.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setImpuesto(new JAXBElement<>(lqn_qNameImpuesto, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_impuesto()));
		QName lqn_qNamePdf = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_PDF.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setPdf(new JAXBElement<>(lqn_qNamePdf, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_pdf()));
		QName lqn_qNameIdPersona = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_ID_PERSONA.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setIdpersona(new JAXBElement<>(lqn_qNameIdPersona, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_idpersona()));
		QName lqn_qNameIp = new QName(CS_NOMBRE_ESPACIO, EnumTypesSoap.QNAME_IP.getIs_valor());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setIp(new JAXBElement<>(lqn_qNameIp, String.class,
				atecpst_tipoEntradaConsultarPazySalvoTributarioVo.getIs_ip()));

		return ltecpst_tipoEntradaConsultarPazySalvoTributario;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarPazySalvoTributario
	 * <b>a</b> TipoSalidaConsultarPazySalvoTributarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar pazy salvo tributario
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar pazy salvo tributario objeto con valores de servicio.
	 *
	 * @param atscpst_tipoSalidaConsultarPazySalvoTributario el parametro que
	 *                                                       representa el complex
	 *                                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarPazySalvoTributarioVO.
	 */
	public static TipoSalidaConsultarPazySalvoTributarioVO tipoAVo(
			TipoSalidaConsultarPazySalvoTributario atscpst_tipoSalidaConsultarPazySalvoTributario) {
		TipoSalidaConsultarPazySalvoTributarioVO ltscpst_tipoSalidaConsultarPazySalvoTributarioVo = new TipoSalidaConsultarPazySalvoTributarioVO();
		if (atscpst_tipoSalidaConsultarPazySalvoTributario.getPdfCertificado() != null)
			ltscpst_tipoSalidaConsultarPazySalvoTributarioVo.setIb_pdfCertificado(
					atscpst_tipoSalidaConsultarPazySalvoTributario.getPdfCertificado().getValue());
		ltscpst_tipoSalidaConsultarPazySalvoTributarioVo
				.setIs_codigoMensaje(atscpst_tipoSalidaConsultarPazySalvoTributario.getCodigoMensaje());
		ltscpst_tipoSalidaConsultarPazySalvoTributarioVo
				.setIs_descripcionMensaje(atscpst_tipoSalidaConsultarPazySalvoTributario.getDescripcionMensaje());

		return ltscpst_tipoSalidaConsultarPazySalvoTributarioVo;
	}
}
