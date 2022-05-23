/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRangoTarifasAlertasDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IRangoTarifasAlertasDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RangoTarifasAlerta;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Rango tarifas alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRangoTarifasAlertasDAO {

	/**
	 * Metodo que consulta todos los rangos de alertas de la base de datos.
	 *
	 * @return Lista de RangoTarifasAlerta
	 */
	public List<RangoTarifasAlerta> consultarTarifasAlertas();
}
