/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoProcesoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITipoProcesoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Tipo proceso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoProcesoDAO {
	
	/**
	 * Metodo que permite crear tipoProceso en la base de datos.
	 *
	 * @param atp_tipoProceso el parametro tipo proceso
	 * @return true si se almacena exitosamente el tipo proceso.
	 */
	public Boolean crearTipoProceso(TipoProceso atp_tipoProceso);

	/**
	 * Metodo que permite consultar los tipos de proceso.
	 *
	 * @return lista de tipo de procesos encontrados
	 */
	public List<TipoProceso> consultarTiposProceso();

}