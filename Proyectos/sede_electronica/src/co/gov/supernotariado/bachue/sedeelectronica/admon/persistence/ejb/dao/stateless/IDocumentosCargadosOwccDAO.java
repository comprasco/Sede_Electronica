/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDocumentosCargadosOwccDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IDocumentosCargadosOwccDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DocumentosCargadosOwcc;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Documentos cargados
 * owcc.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDocumentosCargadosOwccDAO {

	/**
	 * Cargar documentos BD.
	 *
	 * @param adc_documentoCargado el parametro documento cargado
	 * @return Resultado para cargar documentos BD retornado como
	 *         DocumentosCargadosOwcc
	 */
	public DocumentosCargadosOwcc cargarDocumentosBD(DocumentosCargadosOwcc adc_documentoCargado);

	/**
	 * Consulta nir documentos cargados.
	 *
	 * @param as_nir el parametro nir
	 * @return Resultado para consulta nir documentos cargados retornado como List
	 */
	public List<DocumentosCargadosOwcc> consultaNirDocumentosCargados(String as_nir);

	/**
	 * Metodo encargado de eliminar los documentos en base de datos.
	 *
	 * @param as_consultaNir el parametro consulta nir
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean borrarDocumentosCargadosOwcc(String as_consultaNir);

	/**
	 * Metodo que consulta el formulario cuenta cupo por usuario.
	 *
	 * @param as_nombreFormulario el parametro nombre formulario
	 * @param au_usuarioDto       el parametro usuario dto
	 * @param as_nir              el parametro nir
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarFormularioCuentaCupo(String as_nombreFormulario, UsuarioDTO au_usuarioDto, String as_nir);

}
