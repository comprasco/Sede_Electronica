/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistorialInicioSesionDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IHistorialInicioSesionDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialInicioSesion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Historial inicio sesion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialInicioSesionDAO {
	
	/**
	 * Metodo que permite insertar un registro de historico de inicio de sesion.
	 *
	 * @param ahis_historialInicioSesion el parametro historial inicio sesion
	 * @return confirmacion booleana si fue o no insertado el dato
	 */
	public Boolean agregarInicioSesion(HistorialInicioSesion ahis_historialInicioSesion);

}
