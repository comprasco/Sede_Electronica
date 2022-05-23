/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoConsultaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IHistoricoConsultaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoConsulta;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Historico consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoConsultaDAO {

	/**
	 * Metodo que registra una consulta realizada por un usuario.
	 *
	 * @param ahc_historicoConsulta historico a registrar
	 * @return true si fue exitoso o no el registro de la consulta
	 */
	public Boolean agregarHistorico(HistoricoConsulta ahc_historicoConsulta);

}