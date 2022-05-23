/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConsultaEstadoJuridicoPredioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IConsultaEstadoJuridicoPredioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EstadoJuridicoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Consulta estado
 * juridico predio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultaEstadoJuridicoPredioBusiness {

	/**
	 * Metodo que se encarga de consultar al servicio y cargar la respuesta.
	 *
	 * @param ac_catalogoTipoIdentificacionPredio catalogo con el codigo de consulta
	 * @param as_identificacionPredio             valor de consulta
	 * @return Resultado para consultar estado juridico predios retornado como
	 *         EstadoJuridicoDTO
	 */
	public EstadoJuridicoDTO consultarEstadoJuridicoPredios(CatalogoDTO ac_catalogoTipoIdentificacionPredio,
			String as_identificacionPredio);
}
