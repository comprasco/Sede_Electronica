/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConsultaDatosPredioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IConsultaDatosPredioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntradaDatosBasicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculasDatosBasicosDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Consulta datos predio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultaDatosPredioBusiness {

	/**
	 * Metodo que se encarga de consultar el servicio de datos basicos.
	 *
	 * @param aedb_entradaDatosBasicosDto el parametro entrada datos basicos dto
	 * @return Resultado para consultar datos basicos retornado como una lista de
	 *         MatriculasDatosBasicosDTO
	 */
	public List<MatriculasDatosBasicosDTO> consultarDatosBasicos(EntradaDatosBasicosDTO aedb_entradaDatosBasicosDto);
}
