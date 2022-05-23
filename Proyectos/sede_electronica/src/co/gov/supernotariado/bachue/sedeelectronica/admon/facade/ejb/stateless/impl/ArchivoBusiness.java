/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ArchivoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IArchivoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoBDDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IArchivoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ArchivoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Archivo;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Archivo.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ArchivoBusiness", mappedName = "ArchivoBusiness")
@LocalBean
public class ArchivoBusiness implements IArchivoBusiness {
	
	/**
	 * Atributo de instancia tipo IArchivoDAO para definir la propiedad archivo DAO.
	 */
	@EJB
	private IArchivoDAO iia_archivoDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IArchivoBusiness#consultarArchivoPorCodigo(java.lang.String)
	 */
	@Override
	public ArchivoBDDTO consultarArchivoPorCodigo(String as_codigo) {
		Archivo ia_archivo = iia_archivoDAO.consultarArchivoPorCodigo(as_codigo);
		return ArchivoHelper.entidadADtoConArchivo(ia_archivo);
	}
}
