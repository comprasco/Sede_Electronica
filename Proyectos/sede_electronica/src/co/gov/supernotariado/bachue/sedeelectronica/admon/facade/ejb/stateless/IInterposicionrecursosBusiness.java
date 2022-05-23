package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionInterposicionRecursosDto;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Interposicion Recursos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IInterposicionrecursosBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atir_transaccionInterposicionRecursosDto datos de la transaccion a generar la
	 *                                     solicitud de interposicion recursos
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitud(TransaccionInterposicionRecursosDto atir_transaccionInterposicionRecursosDto);
}
