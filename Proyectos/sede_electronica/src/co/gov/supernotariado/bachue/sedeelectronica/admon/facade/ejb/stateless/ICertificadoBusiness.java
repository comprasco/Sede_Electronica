/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICertificadoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICertificadoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Certificado.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICertificadoBusiness {

	/**
	 * Metodo que se encarga de consultar la direccion y el valor del certificado de
	 * una matricula, para agregarlos a la transaccion en curso.
	 *
	 * @param alm_listaMatriculaDto lista de MatriculaDTO dto que contiene los datos
	 *                              de la matricula
	 * @param at_transaccionDto     TransaccionCertificadoDTO dto que contiene los
	 *                              datos de la transaccion en curso
	 * @return Lista de SalidaMatriculaDTO, lista de Dto con los datos de la la
	 *         salida de transaccion
	 */
	public List<SalidaMatriculaDTO> consultarMatricula(List<MatriculaDTO> alm_listaMatriculaDto,ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que se encarga de modificar los datos de la transaccion actual.
	 *
	 * @param ait_transaccionDto los datos de la transaccon actual
	 * @return true si guardo la transaccion exitosamente
	 */
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que se encarga de cancelar los datos de la transaccion actual.
	 *
	 * @param ait_transaccionDto los datos de la transaccon actual
	 * @return true si guardo la transaccion exitosamente
	 */
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto);
	
	/**
	 * Metodo que toma la matricula y consulta si ya fue migrada o no
	 * 
	 * @param am_matriculaDto matricula a validar
	 * @return Boolean true si fue migrada
	 */
	public Boolean consultarMigrado(MatriculaDTO am_matriculaDto);

	/**
	 * Metodo que permite consultar las matriculas de forma masiva
	 * @param alm_matriculas Lista de matriculas 
	 * @return List<SalidaMatriculaDTO> lista de matriculas
	 */
	public List<SalidaMatriculaDTO> consultarInformacionMatriculaMasivas(List<MatriculaDTO> alm_matriculas);

	/**
	 * Metodo que permite clasificar las matriculas de las que estan migradas a las que no
	 * @param alm_matriculas lista de matriculas a clasificar
	 * @return List<MatriculaDTO> Lista de matriculas clasificadas
	 */
	public List<MatriculaDTO> clasificarMatriculasMigradas(List<MatriculaDTO> alm_matriculas);
	
	/**
	 * Metodo que permite clasificar una matricula si esta migrada o no
	 * @param am_matriculaDto
	 * @return MatriculaDTO
	 */
	public MatriculaDTO clasificarMatriculaMigradaIndividual(MatriculaDTO am_matriculaDto);

	/**
	 * Metodo que permite generar la transaccion extendida de varias matriculas en bancarizacion 
	 * @param alsm_listaMatricula Lista de matriculas
	 * @return TipoSalidaGenerarLiquidacionWSDTO salida de la liquidacion de las matricuals
	 */
	public TipoSalidaGenerarLiquidacionWSDTO generarTransaccionExtendida(List<SalidaMatriculaDTO> alsm_listaMatricula);
	
	/**
	 * Metodo que permite consultar la informacion de matriculas individuales
	 * @param am_matriculas parametro que contiene la informacion de la matricula
	 * @return SalidaMatriculaDTO retorna la salida de la matricula
	 */
	public SalidaMatriculaDTO consultarInformacionMatriculaIndividual(MatriculaDTO am_matriculas);


	/**
	 * Metodo que permite consultar certificados 
	 * @param acct_ConsultarCertificadosTransaccionWSDTO entidad que contiene los parametros de la consulta de los certificados
	 * @return EntidadConsultarCertificadosTransaccionWSDTO certificados 
	 */
	public EntidadConsultarCertificadosTransaccionWSDTO consultarCertificadosTransaccion(String as_codigoTransaccion);

	/**
	 * Metodo que permite consultar certificados 
	 * @param acct_ConsultarCertificadosTransaccionWSDTO entidad que contiene los parametros de la consulta de los certificados
	 * @return EntidadConsultarCertificadosTransaccionWSDTO certificados 
	 */
	public SalidaMatriculaDTO consultarMatricula(MatriculaDTO am_matriculaDto,
			TransaccionGenericaDTO atg_transaccionGenericaDto);


}
