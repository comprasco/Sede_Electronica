/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AgregarMatriculaAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: AgregarMatriculaAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.TipoEntradaAgregarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.TipoSalidaAgregarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarMatriculaAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Agregar
 * matricula alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarMatriculaAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AgregarMatriculaAlertaConverter.
	 */
	private AgregarMatriculaAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaAgregarMatriculaAlertaVO
	 * <b>a</b> TipoEntradaAgregarMatriculaAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada agregar matricula alerta objeto con
	 * valores de servicio <b>a</b> Tipo entrada agregar matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateama_tipoEntradaAgregarMatriculaAlertaVo el parametro que representa
	 *                                                   el objeto con valores de
	 *                                                   servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaAgregarMatriculaAlerta.
	 */
	public static TipoEntradaAgregarMatriculaAlerta voATipo(
			TipoEntradaAgregarMatriculaAlertaVO ateama_tipoEntradaAgregarMatriculaAlertaVo) {

		TipoEntradaAgregarMatriculaAlerta lteama_tipoEntradaAgregarMatriculaAlerta = new TipoEntradaAgregarMatriculaAlerta();

		lteama_tipoEntradaAgregarMatriculaAlerta
				.setIdAlerta(ateama_tipoEntradaAgregarMatriculaAlertaVo.getIi_idAlerta());
		lteama_tipoEntradaAgregarMatriculaAlerta
				.setCodCirculoRegistral(ateama_tipoEntradaAgregarMatriculaAlertaVo.getIs_codCirculoRegistral());
		lteama_tipoEntradaAgregarMatriculaAlerta.setNumMatriculaInmobiliaria(
				ateama_tipoEntradaAgregarMatriculaAlertaVo.getIi_numMatriculaInmobiliaria());

		return lteama_tipoEntradaAgregarMatriculaAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaAgregarMatriculaAlerta <b>a</b>
	 * TipoSalidaAgregarMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida agregar matricula alerta
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida agregar matricula alerta objeto con valores de servicio.
	 *
	 * @param atsama_tipoSalidaAgregarMatriculaAlerta el parametro que representa el
	 *                                                complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaAgregarMatriculaAlertaVO.
	 */
	public static TipoSalidaAgregarMatriculaAlertaVO tipoAVo(
			TipoSalidaAgregarMatriculaAlerta atsama_tipoSalidaAgregarMatriculaAlerta) {
		TipoSalidaAgregarMatriculaAlertaVO ltsama_tipoSalidaAgregarMatriculaAlertaVo = new TipoSalidaAgregarMatriculaAlertaVO();

		ltsama_tipoSalidaAgregarMatriculaAlertaVo.setIs_codigo(atsama_tipoSalidaAgregarMatriculaAlerta.getCodigo());
		ltsama_tipoSalidaAgregarMatriculaAlertaVo.setIs_mensaje(atsama_tipoSalidaAgregarMatriculaAlerta.getMensaje());

		return ltsama_tipoSalidaAgregarMatriculaAlertaVo;
	}
}
