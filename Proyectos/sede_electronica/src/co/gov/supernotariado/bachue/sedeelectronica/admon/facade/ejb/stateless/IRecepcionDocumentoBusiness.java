package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionRecepcionDocumentoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Recepcion de documentos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRecepcionDocumentoBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atrd_transaccionRecepcionDocumentoDto datos de la transaccion a generar la
	 *                                     solicitud de recepcion de documentos
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitud(TransaccionRecepcionDocumentoDTO atrd_transaccionRecepcionDocumentoDto);

}
