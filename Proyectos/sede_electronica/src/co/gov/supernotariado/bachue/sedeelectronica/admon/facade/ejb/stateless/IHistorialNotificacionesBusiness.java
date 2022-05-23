/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICuentaCupoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICuentaCupoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;
import net.sf.jasperreports.engine.JRException;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historial
 * notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialNotificacionesBusiness {

	/**
	 * Metodo encargado de consultar el documento asunto historial notificaciones
	 * 
	 * @param aln_listaNotificacionesDto
	 * @param alad_archivos
	 * @return
	 * @throws JRException
	 */
	byte[] consultarDocumentoAsuntoHistorialNotificaciones(ListaNotificacionesDTO aln_listaNotificacionesDto,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException;

	/**
	 * Metodo encargado de consultar el historial de notificaciones
	 * 
	 * @param aus_usuarioSesionDto
	 * @param ahn_historialNotificacionesDto
	 * @return TipoSalidaConsultarHistorialWSDTO
	 */
	public TipoSalidaConsultarHistorialWSDTO consultarHistorial(UsuarioDTO au_usuarioDto,
			HistorialNotificacionesDTO ahn_historialNotificacionesDto);

}
