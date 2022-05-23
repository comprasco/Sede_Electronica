/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoDocumentoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ITipoDocumentoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Tipo documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoDocumentoDAO {
	
	/**
	 * Metodo que permite crear tipoDocumento en la base de datos.
	 *
	 * @param atd_tipoDocumento el parametro tipo documento
	 * @return true si se almacena exitosamente el tipoDocumento.
	 */
	public Boolean crearTipoDocumento(TipoDocumento atd_tipoDocumento);

	/**
	 * Metodo que permite consultar los documentos en la bd.
	 *
	 * @return lista de documentos encontrados
	 */
	public List<TipoDocumento> consultarTiposDocumento();

}