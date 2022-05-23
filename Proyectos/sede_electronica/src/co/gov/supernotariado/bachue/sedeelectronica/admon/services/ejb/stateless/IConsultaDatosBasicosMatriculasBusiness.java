/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConsultaDatosBasicosMatriculasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IConsultaDatosBasicosMatriculasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaDatosBasicosMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaDatosBasicosMatriculaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Consulta datos basicos matriculas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultaDatosBasicosMatriculasBusiness {

	/**
	 * Metodo que consume el servicio de conltar datos basicos matriculas.
	 *
	 * @param atedbm_tipoEntradaDatosBAsicosMatriculasWsDto el parametro tipo
	 *                                                      entrada datos B asicos
	 *                                                      matriculas ws dto
	 * @return Resultado para consultar datos basicos retornado como
	 *         TipoSalidaDatosBasicosMatriculaWSDTO
	 */
	public TipoSalidaDatosBasicosMatriculaWSDTO consultarDatosBasicos(TipoEntradaDatosBasicosMatriculaWSDTO atedbm_tipoEntradaDatosBAsicosMatriculasWsDto);
}
