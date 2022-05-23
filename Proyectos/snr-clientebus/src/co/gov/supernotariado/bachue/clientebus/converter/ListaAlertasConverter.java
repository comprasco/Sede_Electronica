/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaAlertasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaAlertasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoSalidaConsultarAlertas.ListaAlertas.Alerta;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAlertasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * alertas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAlertasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ListaAlertasConverter.
	 */
	private ListaAlertasConverter() {
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
	 * Especificamente convierte <b>de</b> Alerta <b>a</b> ListaAlertasVO, <br>
	 * En otras palabras, <b>de</b> Alerta (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista alertas objeto con valores de
	 * servicio.
	 *
	 * @param aa_alerta el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ListaAlertasVO.
	 */
	public static ListaAlertasVO tipoAVo(Alerta aa_alerta) {

		ListaAlertasVO lla_listaAlertasVo = new ListaAlertasVO();
		lla_listaAlertasVo.setIi_idAlerta(aa_alerta.getIdAlerta());
		lla_listaAlertasVo.setIs_estadoAlerta(aa_alerta.getEstadoAlerta());
		lla_listaAlertasVo.setIs_nombreEntidad(aa_alerta.getNombreEntidad());
		if (aa_alerta.getFechaInscripcion() != null)
			lla_listaAlertasVo.setId_fechaInscripcion(aa_alerta.getFechaInscripcion().toGregorianCalendar().getTime());
		lla_listaAlertasVo.setIs_codTipoDocumentoPublico(aa_alerta.getCodTipoDocumentoPublico());
		lla_listaAlertasVo.setIs_nombreComunidadEtnica(aa_alerta.getNombreComunidadEtnica());

		return lla_listaAlertasVo;
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
	 * Especificamente convierte <b>de</b> Alerta <b>a</b> ListaAlertasVO, <br>
	 * En otras palabras, <b>de</b> Alerta (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista alertas objeto con valores de
	 * servicio.
	 *
	 * @param ala_alerta el parametro que representa la lista de complex types a
	 *                   convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaAlertasVO.
	 */
	public static List<ListaAlertasVO> listaTipoAListaVo(List<Alerta> ala_alerta) {

		List<ListaAlertasVO> llla_listaAlertaVo = new ArrayList<>();
		for (Alerta la_alerta : ala_alerta) {
			llla_listaAlertaVo.add(tipoAVo(la_alerta));
		}
		return llla_listaAlertaVo;
	}
}
