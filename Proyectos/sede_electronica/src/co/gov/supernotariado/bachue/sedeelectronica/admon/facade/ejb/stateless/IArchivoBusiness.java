/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IArchivoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IArchivoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoBDDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Archivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IArchivoBusiness {


	/**
	 * Metodo que se encarga de consultar por codigo.
	 *
	 * @param as_codigo codigo por el que consultar
	 * @return Resultado para consultar archivo por codigo retornado como
	 *         ArchivoBDDTO
	 */
	public ArchivoBDDTO consultarArchivoPorCodigo(String as_codigo);
}
