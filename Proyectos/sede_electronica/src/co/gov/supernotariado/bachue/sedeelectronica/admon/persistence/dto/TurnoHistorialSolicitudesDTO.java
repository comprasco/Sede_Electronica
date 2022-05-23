/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TurnoHistorialSolicitudesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TurnoHistorialSolicitudesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Turno historial
 * solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoHistorialSolicitudesDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha turno.
	 */
	private Date id_fechaTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo convertido.
	 */
	private String is_archivoConvertido;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad archivo
	 * disponible.
	 */
	private boolean ib_archivoDisponible;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo.
	 */
	private String is_nombreArchivo;
	
	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha turno.
	 *
	 * @return El valor de la propiedad fecha turno
	 */
	public Date getId_fechaTurno() {
		return id_fechaTurno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha turno.
	 *
	 * @param ad_fechaTurno el nuevo valor para la propiedad fecha turno
	 */
	public void setId_fechaTurno(Date ad_fechaTurno) {
		this.id_fechaTurno = ad_fechaTurno;
	}
	
	/**
	 * Obtiene el valor para la propiedad archivo convertido.
	 *
	 * @return El valor de la propiedad archivo convertido
	 */
	public String getIs_archivoConvertido() {
		return is_archivoConvertido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad archivo convertido.
	 *
	 * @param as_archivoConvertido el nuevo valor para la propiedad archivo
	 *                             convertido
	 */
	public void setIs_archivoConvertido(String as_archivoConvertido) {
		this.is_archivoConvertido = as_archivoConvertido;
	}
	
	/**
	 * Obtiene el valor para la propiedad archivo disponible.
	 *
	 * @return true, si se cumple la propiedad archivo disponible, false caso
	 *         contrario
	 */
	public boolean isIb_archivoDisponible() {
		return ib_archivoDisponible;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad archivo disponible.
	 *
	 * @param ab_archivoDisponible el nuevo valor para la propiedad archivo
	 *                             disponible
	 */
	public void setIb_archivoDisponible(boolean ab_archivoDisponible) {
		this.ib_archivoDisponible = ab_archivoDisponible;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre archivo.
	 *
	 * @return El valor de la propiedad nombre archivo
	 */
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo.
	 *
	 * @param as_nombreArchivo el nuevo valor para la propiedad nombre archivo
	 */
	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
	}
	
}
