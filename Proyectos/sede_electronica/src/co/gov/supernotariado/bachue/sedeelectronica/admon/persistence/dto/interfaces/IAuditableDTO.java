/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAuditableDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces
 * Nombre del elemento: IAuditableDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces;

import java.util.Date;

/**
 * Interface para definir operaciones que caracterizan objetos de transferencia
 * de datos (DTO). <br>
 * Permite definir operaciones para un tipo/forma especial de ver un DTO. <br>
 * Define operaciones para representar un DTO como un elemento Auditable.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IAuditableDTO {	
	
	/**
	 * Metodo que carga la ip del usuario que crea.
	 *
	 * @param as_ipCreacion <b> Resultado: </b> Carga con los datos de la ip del
	 *                      usuario
	 */
	public void setIs_ipCreacion(String as_ipCreacion);
	
	/**
	 * Metodo que carga la fecha del momento en el que se crea.
	 *
	 * @param ad_fechaCreacion <b> Resultado: </b> Carga la fecha del momento en el
	 *                         que se crea
	 */
	public void setId_fechaCreacion(Date ad_fechaCreacion);
	
	/**
	 * Metodo que carga la id del usuario que crea.
	 *
	 * @param as_idCreacion <b> Resultado: </b> Carga con los datos de la id del
	 *                      usuario
	 */
	public void setIs_idUsuarioCreacion(String as_idCreacion);
	
	/**
	 * Metodo que carga la ip del usuario que modifica.
	 *
	 * @param as_ipModificacion <b> Resultado: </b> Carga con los datos de la ip del
	 *                          usuario
	 */
	public void setIs_ipModificacion(String as_ipModificacion);
	
	/**
	 * Metodo que carga la fecha del momento en el que se modifica.
	 *
	 * @param ad_fechaModificacion <b> Resultado: </b> Carga la fecha del momento en
	 *                             el que se modifica
	 */
	public void setId_fechaModificacion(Date ad_fechaModificacion);
	
	/**
	 * Metodo que carga la id del usuario que modifica.
	 *
	 * @param as_idModificacion <b> Resultado: </b> Carga con los datos de la id del
	 *                          usuario
	 */
	public void setIs_idUsuarioModificacion(String as_idModificacion);

	/**
	 * Metodo que carga el estereotipo por el que ingreso para relizar la insercion.
	 *
	 * @param as_estereotipoCreacion el nuevo valor para la propiedad estereotipo
	 *                               creacion
	 */
	public void setIs_estereotipoCreacion(String as_estereotipoCreacion);

	/**
	 * Metodo que carga el estereotipo por el que ingreso para relizar la
	 * modificacion.
	 *
	 * @param as_estereotipoModificacion el nuevo valor para la propiedad
	 *                                   estereotipo modificacion
	 */
	public void setIs_estereotipoModificacion(String as_estereotipoModificacion);
	
	
	/**
	 * Metodo que actualiza estado activo.
	 *
	 * @param as_activo el nuevo valor para la propiedad activo
	 */
	public void setIs_activo(String as_activo);
}
