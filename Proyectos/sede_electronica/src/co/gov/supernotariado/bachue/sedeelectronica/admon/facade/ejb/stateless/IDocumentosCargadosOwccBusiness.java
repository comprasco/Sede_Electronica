/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDocumentosCargadosOwccBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IDocumentosCargadosOwccBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Documentos cargados
 * owcc.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDocumentosCargadosOwccBusiness {

	/**
	 * Metodo encargado de cargar los documentos en base de datos.
	 *
	 * @param adco_documentosCargadosOwccDto el parametro documentos cargados oracle
	 *                                       web center content dto
	 */
	public void cargarDocumentosBD(DocumentosCargadosOwccDTO adco_documentosCargadosOwccDto);

	/**
	 * Metodo encargado de eliminar los documentos cargados a base de datos.
	 *
	 * @param atf_transaccionFormularioDto el parametro transaccion formulario dto
	 */
	public void eliminarDocumentosCargados(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo que consulta el formulario cuenta cupo segun el usuario.
	 *
	 * @param as_nombreFormulario el parametro nombre formulario
	 * @param au_usuarioDto       el parametro usuario dto
	 * @param as_nir              el parametro nir
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarFormularioCuentaCupo(String as_nombreFormulario, UsuarioDTO au_usuarioDto, String as_nir);

	/**
	 * Meotodo encargado de consumir el servicio cargar archivos formulario.
	 *
	 * @param acdf_cargarDocumentosFormulario el parametro cargar documentos formulario
	 * @param atf_transaccionFormularioDto     el parametro transaccion formulario
	 *                                         dto
	 * @return Resultado para servicio cargar archivos retornado como
	 *         TipoSalidaEnviarDocumentoWSDTO
	 */
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarArchivos(
			CargaDocumentosFormularioDTO acdf_cargarDocumentosFormulario,
			TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de consultar lista de documentos cargados.
	 *
	 * @param as_nir el parametro nir
	 * @return Resultado para consulta nir documentos cargados retornado como una
	 *         lista de DocumentosCargadosOwccDTO
	 */
	public List<DocumentosCargadosOwccDTO> consultaNirDocumentosCargados(String as_nir);

	/**
	 * Metodo que se encarga de consultar los documentos que estan conectados a un
	 * NIR.
	 *
	 * @param as_nir nir asociado
	 * @return Resultado para consultar documentos por nir retornado como una lista
	 *         de DocumentosCargadosOwccDTO
	 */
	public List<DocumentosCargadosOwccDTO> consultarDocumentosPorNir(String as_nir);

	/**
	 * Metodo encargado de eliminar los documentos de alerta de tierras cargado.
	 *
	 * @param atsm_transaccionSolicitudModeloDto el parametro transaccion solicitud
	 *                                           modelo dto
	 */
	public void eliminarDocumentosCargadosAlertaTierras(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * Meotodo encargado de consumir el servicio cargar archivos Certificados
	 * Especiales.
	 *
	 * @param ast_cargarDocumentosCE el parametro cargar documentos CE
	 * @param as_nir                   el parametro nir
	 * @return Resultado para servicio cargar archivos retornado como
	 *         TipoSalidaEnviarDocumentoWSDTO
	 */
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarArchivos(
			SoporteTransaccionDTO ast_cargarDocumentosCE, String as_nir);

	/**
	 * Metodo encargado de cargar el documento al owcc.
	 *
	 * @param acdf_cargarDocumentoAlertaTierrasDto el parametro cargar documento
	 *                                              alerta tierras dto
	 * @param atsm_transaccionSolicitudModeloDto    el parametro transaccion
	 *                                              solicitud modelo dto
	 * @return Resultado para servicio cargar alerta retornado como
	 *         TipoSalidaEnviarDocumentoWSDTO
	 */
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarAlerta(
			CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto,
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto);

	/**
	 * metodo que se encarga de crear y subir el archivo al servicio de owcc y
	 * registrarlo en bd.
	 *
	 * @param ast_soporteTransaccionDto el parametro soporte correccion dto
	 * @param as_nir                   el parametro nir
	 * @return Resultado para cargar archivo retornado como
	 *         TipoSalidaEnviarDocumentoWSDTO
	 */
	public TipoSalidaEnviarDocumentoWSDTO cargarArchivo(SoporteTransaccionDTO ast_soporteTransaccionDto, String as_nir);

}
