/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoClaveBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistoricoClaveBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historico clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoClaveBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ahc_historicoClaveDto el parametro historico clave dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearHistoricoClave(HistoricoClaveDTO ahc_historicoClaveDto);

	/**
	 * Metodo que se encarga de devolver un listado de historial de claves de un
	 * usuario.
	 *
	 * @param au_usuarioDto        usuario para sacar historial de clave
	 * @param ai_cantidadRegistros cantidad de registros de clave necesarios
	 * @return Resultado para consultar cantidad historial clave usuario retornado
	 *         como una lista de HistoricoClaveDTO
	 */
	public List<HistoricoClaveDTO> consultarCantidadHistorialClaveUsuario(UsuarioDTO au_usuarioDto,
			Integer ai_cantidadRegistros);
}
