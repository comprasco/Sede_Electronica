/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AlertasConsultarAlertaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: AlertasConsultarAlertaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta.AlertaType;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.AlertaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Alertas
 * consultar alerta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertasConsultarAlertaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AlertasConsultarAlertaConverter.
	 */
	private AlertasConsultarAlertaConverter() {
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
	 * Especificamente convierte <b>de</b> AlertaType <b>a</b> AlertaVO, <br>
	 * En otras palabras, <b>de</b> Alerta type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Alerta objeto con valores de
	 * servicio.
	 *
	 * @param aat_alerta el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como AlertaVO.
	 */
	public static AlertaVO tipoAVo(AlertaType aat_alerta) {
		AlertaVO la_alertaVO = new AlertaVO();
		la_alertaVO.setIs_identificadorAlerta(aat_alerta.getIdentificadorAlerta());
		la_alertaVO.setIs_numeroMatricula(aat_alerta.getNumeroMatricula());
		la_alertaVO.setIs_direccion(aat_alerta.getDireccion());
		la_alertaVO.setIs_fechaVigencia(aat_alerta.getFechaVigencia());
		la_alertaVO.setIs_departamento(aat_alerta.getDepartamento());
		la_alertaVO.setIs_municipio(aat_alerta.getMunicipio());
		la_alertaVO.setIs_orip(aat_alerta.getOrip());
		la_alertaVO.setIs_nombreOrip(aat_alerta.getNombreOrip());
		la_alertaVO.setIs_estado(aat_alerta.getEstado());
		return la_alertaVO;
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
	 * Especificamente convierte <b>de</b> AlertaType <b>a</b> AlertaVO, <br>
	 * En otras palabras, <b>de</b> Alerta type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Alerta objeto con valores de
	 * servicio.
	 *
	 * @param alat_alerta el parametro que representa la lista de complex types a
	 *                    convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de AlertaVO.
	 */
	public static List<AlertaVO> listaTiposAListaVo(List<AlertaType> alat_alerta) {
		List<AlertaVO> lla_alertaVO = new ArrayList<>();
		for (AlertaType lat_alerta : alat_alerta) {
			lla_alertaVO.add(tipoAVo(lat_alerta));
		}
		return lla_alertaVO;
	}
}
