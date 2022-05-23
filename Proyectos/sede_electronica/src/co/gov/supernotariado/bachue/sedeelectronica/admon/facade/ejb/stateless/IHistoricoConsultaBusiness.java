/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoConsultaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistoricoConsultaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoConsultaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historico consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoConsultaBusiness {
	
	/**
	 * Metodo que permite agregar una consulta al historico.
	 *
	 * @param ahc_historicoConsulta el parametro historico consulta
	 * @return Estado de si fue o no exitoso la insercion de la consulta
	 */
	public Boolean agregarConsulta(HistoricoConsultaDTO ahc_historicoConsulta);

}
