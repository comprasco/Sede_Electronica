/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TrazabilidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad
 * Nombre del elemento: TrazabilidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Trazabilidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrazabilidadVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha asignacion.
	 */
	private Date id_fechaAsignacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha final etapa.
	 */
	private Date id_fechaFinalEtapa;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inicio
	 * etapa.
	 */
	private Date id_fechaInicioEtapa;    
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha reparto.
	 */
	private Date id_fechaReparto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado actividad.
	 */
	private String is_estadoActividad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * etapa.
	 */
	private String is_etapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre etapa.
	 */
	private String is_nombreEtapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	
	/**
	 * Obtiene el valor para la propiedad fecha asignacion.
	 *
	 * @return El valor de la propiedad fecha asignacion
	 */
	public Date getId_fechaAsignacion() {
		return id_fechaAsignacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha final etapa.
	 *
	 * @return El valor de la propiedad fecha final etapa
	 */
	public Date getId_fechaFinalEtapa() {
		return id_fechaFinalEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha inicio etapa.
	 *
	 * @return El valor de la propiedad fecha inicio etapa
	 */
	public Date getId_fechaInicioEtapa() {
		return id_fechaInicioEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha reparto.
	 *
	 * @return El valor de la propiedad fecha reparto
	 */
	public Date getId_fechaReparto() {
		return id_fechaReparto;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado actividad.
	 *
	 * @return El valor de la propiedad estado actividad
	 */
	public String getIs_estadoActividad() {
		return is_estadoActividad;
	}
	
	/**
	 * Obtiene el valor para la propiedad etapa.
	 *
	 * @return El valor de la propiedad etapa
	 */
	public String getIs_etapa() {
		return is_etapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre etapa.
	 *
	 * @return El valor de la propiedad nombre etapa
	 */
	public String getIs_nombreEtapa() {
		return is_nombreEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha asignacion.
	 *
	 * @param ad_fechaAsignacion el nuevo valor para la propiedad fecha asignacion
	 */
	public void setId_fechaAsignacion(Date ad_fechaAsignacion) {
		this.id_fechaAsignacion = ad_fechaAsignacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha final etapa.
	 *
	 * @param ad_fechaFinalEtapa el nuevo valor para la propiedad fecha final etapa
	 */
	public void setId_fechaFinalEtapa(Date ad_fechaFinalEtapa) {
		this.id_fechaFinalEtapa = ad_fechaFinalEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio etapa.
	 *
	 * @param ad_fechaInicioEtapa el nuevo valor para la propiedad fecha inicio
	 *                            etapa
	 */
	public void setId_fechaInicioEtapa(Date ad_fechaInicioEtapa) {
		this.id_fechaInicioEtapa = ad_fechaInicioEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha reparto.
	 *
	 * @param ad_fechaReparto el nuevo valor para la propiedad fecha reparto
	 */
	public void setId_fechaReparto(Date ad_fechaReparto) {
		this.id_fechaReparto = ad_fechaReparto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado actividad.
	 *
	 * @param as_estadoActividad el nuevo valor para la propiedad estado actividad
	 */
	public void setIs_estadoActividad(String as_estadoActividad) {
		this.is_estadoActividad = as_estadoActividad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad etapa.
	 *
	 * @param as_etapa el nuevo valor para la propiedad etapa
	 */
	public void setIs_etapa(String as_etapa) {
		this.is_etapa = as_etapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre etapa.
	 *
	 * @param as_nombreEtapa el nuevo valor para la propiedad nombre etapa
	 */
	public void setIs_nombreEtapa(String as_nombreEtapa) {
		this.is_nombreEtapa = as_nombreEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}
}
