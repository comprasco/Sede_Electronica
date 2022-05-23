/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta.TipoEntradaConsultarAlerta;
import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta.TipoSalidaConsultarAlerta;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarAlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarAlertaConverter.
	 */
	private ConsultarAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarAlertaVO <b>a</b>
	 * TipoEntradaConsultarAlerta, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alerta objeto con valores
	 * de servicio <b>a</b> Tipo entrada consultar alerta (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateca_tipoEntradaConsultarAlertaVO el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarAlerta.
	 */
	public static TipoEntradaConsultarAlerta voATipo(TipoEntradaConsultarAlertaVO ateca_tipoEntradaConsultarAlertaVO) {
		TipoEntradaConsultarAlerta lteca_tipoEntradaConsultarAlerta = new TipoEntradaConsultarAlerta();
		lteca_tipoEntradaConsultarAlerta.setModulo(ateca_tipoEntradaConsultarAlertaVO.getIs_modulo());
		lteca_tipoEntradaConsultarAlerta.setDepartamento(ateca_tipoEntradaConsultarAlertaVO.getIs_departamento());
		lteca_tipoEntradaConsultarAlerta.setMunicipio(ateca_tipoEntradaConsultarAlertaVO.getIs_municipio());
		lteca_tipoEntradaConsultarAlerta.setOrip(ateca_tipoEntradaConsultarAlertaVO.getIs_orip());
		lteca_tipoEntradaConsultarAlerta.setEstado(ateca_tipoEntradaConsultarAlertaVO.getIs_estado());
		lteca_tipoEntradaConsultarAlerta.setNumeroMatricula(ateca_tipoEntradaConsultarAlertaVO.getIs_numeroMatricula());
		lteca_tipoEntradaConsultarAlerta.setTipoDocumento(ateca_tipoEntradaConsultarAlertaVO.getIs_tipoDocumento());
		lteca_tipoEntradaConsultarAlerta.setNumeroDocumento(ateca_tipoEntradaConsultarAlertaVO.getIs_numeroDocumento());
		lteca_tipoEntradaConsultarAlerta.setPrimerNombre(ateca_tipoEntradaConsultarAlertaVO.getIs_primerNombre());
		lteca_tipoEntradaConsultarAlerta.setSegundoNombre(ateca_tipoEntradaConsultarAlertaVO.getIs_segundoNombre());
		lteca_tipoEntradaConsultarAlerta.setPrimerApellido(ateca_tipoEntradaConsultarAlertaVO.getIs_primerApellido());
		lteca_tipoEntradaConsultarAlerta.setSegundoApellido(ateca_tipoEntradaConsultarAlertaVO.getIs_segundoApellido());
		lteca_tipoEntradaConsultarAlerta.setRazonSocial(ateca_tipoEntradaConsultarAlertaVO.getIs_razonSocial());
		lteca_tipoEntradaConsultarAlerta
				.setCantidadRegistrosPagina(ateca_tipoEntradaConsultarAlertaVO.getIs_cantidadRegistrosPagina());
		lteca_tipoEntradaConsultarAlerta.setUltimoIdAlerta(ateca_tipoEntradaConsultarAlertaVO.getIs_ultimoIdAlerta());
		return lteca_tipoEntradaConsultarAlerta;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarAlerta <b>a</b>
	 * TipoSalidaConsultarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alerta (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar alerta objeto con valores de servicio.
	 *
	 * @param atsca_tipoSalidaConsultarAlerta el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarAlertaVO.
	 */
	public static TipoSalidaConsultarAlertaVO tipoAVo(TipoSalidaConsultarAlerta atsca_tipoSalidaConsultarAlerta) {
		TipoSalidaConsultarAlertaVO ltsca_tipoSalidaConsultarAlertaVO = new TipoSalidaConsultarAlertaVO();
		if (atsca_tipoSalidaConsultarAlerta.getAlertas() != null)
			ltsca_tipoSalidaConsultarAlertaVO.setIla_listaAlerta(AlertasConsultarAlertaConverter
					.listaTiposAListaVo(atsca_tipoSalidaConsultarAlerta.getAlertas().getAlerta()));
		ltsca_tipoSalidaConsultarAlertaVO.setIs_codigoMensaje(atsca_tipoSalidaConsultarAlerta.getCodigoMensaje());
		ltsca_tipoSalidaConsultarAlertaVO
				.setIs_descripcionMensaje(atsca_tipoSalidaConsultarAlerta.getDescripcionMensaje());
		return ltsca_tipoSalidaConsultarAlertaVO;
	}
}
