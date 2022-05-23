package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.GenerarTransaccionExtendidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaConsultarTarifaConvenioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.RespuestaGenerarTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.BancarizacionEntradaBaseWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.ConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;

/**
* 
* @version 1.0
* @author Smartsoft Solutions S.A.S 
* Nota: Interfaz que define contrato en los servicios de negocio de bancarizacion
*         
*/
@Local
public interface IBancarizacionBusiness {

	/**
	 * Metodo que permite consultar infomacion de las matriculas masivas
	 * @param alem_matriculas matriculas a validar
	 * @param abeb_bancarizacionEntregaBase WSDTO base que contiene credenciasles de acceso al servicio
	 * @return EntidadMatriculaSalidaWSDTO lista de matriculas con la respectiva informacion
	 */
	public EntidadMatriculaSalidaWSDTO consultarInformacionMatriculaMasivas(List<EntidadMatriculaWSDTO> alem_matriculas, BancarizacionEntradaBaseWSDTO abeb_bancarizacionEntregaBase);

	/**
	 * Metodo que consulta la el valor de la tarifa convenio
	 * @param abeb_bancarizacionEntradaBase parametro de entrada que especifica el convenio al cual se desea consultar el costo
	 * @return RespuestaConsultarTarifaConvenioWSDTO respuesta con el costo del convenio
	 */
	public RespuestaConsultarTarifaConvenioWSDTO consultarTarifaConvenio(BancarizacionEntradaBaseWSDTO abeb_bancarizacionEntradaBase);

	/**
	 * Metodo que permite generar la transaccion extendida para liquidar costos
	 * @param agte_generarTransaccionExtendida  parametro con la informacion de las matriculas
	 * @return RespuestaGenerarTransaccionWSDTO respuesta del exito o no de la generacion de la transaccion
	 */
	public RespuestaGenerarTransaccionWSDTO generarTransaccionExtendida(GenerarTransaccionExtendidaWSDTO agte_generarTransaccionExtendida);

	/**
	 * Metodo que permite consultar el estado de la produccion de las matriculas
	 * @param acct_ConsultarCertificadosTransaccionWSDTO
	 * @return EntidadConsultarCertificadosTransaccionWSDTO 
	 */
	public EntidadConsultarCertificadosTransaccionWSDTO consultarCertificadosTransaccion(ConsultarCertificadosTransaccionWSDTO acct_ConsultarCertificadosTransaccionWSDTO); 
	
}
