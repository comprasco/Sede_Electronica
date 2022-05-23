/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICopiasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICopiasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICopiasBusiness {

	/**
	 * Metodo que arma la consulta y consulta los documentos segun los parametros de
	 * copias.
	 *
	 * @param ac_copiasDto datos enviados por el usuario
	 * @return Resultado para consultar documento retornado como una lista de
	 *         CopiasDTO
	 */
	public List<CopiasDTO> consultarDocumento(CopiasDTO ac_copiasDto);

	/**
	 * Metodo que llama a business de carrito para guardar la transaccion.
	 *
	 * @param ait_transaccionDto transaccion a guardar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que llama a business de carrito para eliminar la transaccion.
	 *
	 * @param ait_transaccionDto transaccion a descartar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que se encarga de validar y llamar a los servicios de generar
	 * solicitud de copias e interfaces financieras.
	 *
	 * @param atc_transaccionCopiasDto transaccion de copias
	 * @return String id solicitud
	 */
	public String generarSolicitud(TransaccionCopiasDTO atc_transaccionCopiasDto);

	/**
	 * Metodo que se encarga s hay numero de folios de ocnsultar la tarifa para
	 * liqudacion.
	 *
	 * @param ac_copiasDto             datos para consultar tarifa
	 * @param atc_transaccionCopiasDto transaccion actual
	 * @return BigDecimal costo de la copia
	 */
	public BigDecimal consultarTarifa(CopiasDTO ac_copiasDto, TransaccionCopiasDTO atc_transaccionCopiasDto);
}
