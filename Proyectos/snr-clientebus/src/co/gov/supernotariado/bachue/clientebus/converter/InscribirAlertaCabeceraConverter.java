/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InscribirAlertaCabeceraConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: InscribirAlertaCabeceraConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.TipoEntradaInscribirAlertaCabecera;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.TipoSalidaInscribirAlertaCabecera;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInscribirAlertaCabeceraVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Inscribir
 * alerta cabecera. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InscribirAlertaCabeceraConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InscribirAlertaCabeceraConverter.
	 */
	private InscribirAlertaCabeceraConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaInscribirAlertaCabeceraVO
	 * <b>a</b> TipoEntradaInscribirAlertaCabecera, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inscribir alerta cabecera objeto
	 * con valores de servicio <b>a</b> Tipo entrada inscribir alerta cabecera
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateiac_tipoEntradaInscribirAlertaCabecera el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaInscribirAlertaCabecera.
	 */
	public static TipoEntradaInscribirAlertaCabecera voATipo(
			TipoEntradaInscribirAlertaCabeceraVO ateiac_tipoEntradaInscribirAlertaCabecera) {
		TipoEntradaInscribirAlertaCabecera lteiac_tipoEntradaInscribirAlertaCabecera = new TipoEntradaInscribirAlertaCabecera();

		lteiac_tipoEntradaInscribirAlertaCabecera
				.setTipoAlerta(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_tipoAlerta());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setIdEntidad(ateiac_tipoEntradaInscribirAlertaCabecera.getIi_idEntidad());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setProcesoNroRadicado(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_procesoNroRadicado());
		lteiac_tipoEntradaInscribirAlertaCabecera.setProcesoFechaRadicado(UtilidadFecha.cambiarDateAXmlGregoriaCalender(
				ateiac_tipoEntradaInscribirAlertaCabecera.getId_procesoFechaRadicado()));
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setOficinaOrigen(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_oficinaOrigen());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setCodTipoDocumentoPublico(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_codTipoDocumentoPublico());
		lteiac_tipoEntradaInscribirAlertaCabecera.setFechaDocumento(UtilidadFecha
				.cambiarDateAXmlGregoriaCalender(ateiac_tipoEntradaInscribirAlertaCabecera.getId_fechaDocumento()));
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setDocNumero(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_docNumero());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setDocIdSGD(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_docIdSGD());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setDocNameSGD(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_docNameSGD());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setNitComunidadEtnica(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_nitComunidadEtnica());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setCreadoSNR(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_creadoSNR());
		lteiac_tipoEntradaInscribirAlertaCabecera
				.setIdUsuario(ateiac_tipoEntradaInscribirAlertaCabecera.getIs_idUsuario());

		return lteiac_tipoEntradaInscribirAlertaCabecera;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInscribirAlertaCabecera
	 * <b>a</b> TipoSalidaInscribirAlertaCabeceraVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inscribir alerta cabecera
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida inscribir alerta cabecera objeto con valores de servicio.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabecera el parametro que representa
	 *                                                 el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaInscribirAlertaCabeceraVO.
	 */
	public static TipoSalidaInscribirAlertaCabeceraVO tipoAVo(
			TipoSalidaInscribirAlertaCabecera atsiac_tipoSalidaInscribirAlertaCabecera) {
		TipoSalidaInscribirAlertaCabeceraVO ltsiac_tipoSalidaInscribirAlertaCabeceraVo = new TipoSalidaInscribirAlertaCabeceraVO();

		ltsiac_tipoSalidaInscribirAlertaCabeceraVo.setIs_codigo(atsiac_tipoSalidaInscribirAlertaCabecera.getCodigo());
		ltsiac_tipoSalidaInscribirAlertaCabeceraVo.setIs_mensaje(atsiac_tipoSalidaInscribirAlertaCabecera.getMensaje());
		ltsiac_tipoSalidaInscribirAlertaCabeceraVo
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabecera.getIdAlerta());

		return ltsiac_tipoSalidaInscribirAlertaCabeceraVo;
	}
}
