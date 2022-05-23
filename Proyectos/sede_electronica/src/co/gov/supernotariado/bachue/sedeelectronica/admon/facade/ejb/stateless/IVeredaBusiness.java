/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IVeredaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IVeredaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Vereda.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Local
public interface IVeredaBusiness {

	/**
	 * Metodo que permite consultar las veredas.
	 *
	 * @return Lista de VeredaDTO, Lista de veredas DTOs existentes
	 */
	public List<VeredaDTO> consultarVeredas();
	
	/**
	 * Metodo que permite consultar veredas por id de municipio.
	 *
	 * @param as_municipio id del municipio a consultar
	 * @return Resultado para consultar veredas municipios retornado como una lista
	 *         de VeredaDTO
	 */
	public List<VeredaDTO> consultarVeredasMunicipios(String as_municipio);


	/**
	 * Metodo que permite consultar veredas de forma paginada.
	 *
	 * @param ai_valorIncialPag el parametro valor incial pag
	 * @param ai_valorFinalPag  el parametro valor final pag
	 * @return Resultado para consultar veredas retornado como una lista de
	 *         VeredaDTO
	 */
	public List<VeredaDTO> consultarVeredas(Integer ai_valorIncialPag, Integer ai_valorFinalPag);
}
