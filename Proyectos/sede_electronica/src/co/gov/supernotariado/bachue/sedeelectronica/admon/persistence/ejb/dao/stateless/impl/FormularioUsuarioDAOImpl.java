/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioUsuarioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: FormularioUsuarioDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IFormularioUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Formulario usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class FormularioUsuarioDAOImpl implements IFormularioUsuarioDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IFormularioUsuarioDAO#consultarFormularioUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario, java.lang.String)
	 */
	@Override
	public FormularioUsuario consultarFormularioUsuario(ConfiguracionFormulario acf_configuracionFormulario,
			String as_idUsuario) {
		EntityManager lem_entidadManejadora = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<FormularioUsuario> ltqfu_sentenciaFormularioUsuario = lem_entidadManejadora.createNamedQuery("FormularioUsuario.consultarPorUsuarioYFormulario", FormularioUsuario.class);
		ltqfu_sentenciaFormularioUsuario.setParameter("idConfiguracionFormulario", acf_configuracionFormulario);
		ltqfu_sentenciaFormularioUsuario.setParameter("idUsuario", as_idUsuario);
		ltqfu_sentenciaFormularioUsuario.setParameter("activo", EnumBoolean.CHAR_S.getIs_codigo());
		

		List<FormularioUsuario> llfu_listaFormularioUsuario = ltqfu_sentenciaFormularioUsuario.getResultList();
		if(llfu_listaFormularioUsuario == null || llfu_listaFormularioUsuario.isEmpty())

			return null;
		else 
			return llfu_listaFormularioUsuario.iterator().next(); 
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IFormularioUsuarioDAO#crearFormularioUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario)
	 */
	@Override
	public FormularioUsuario crearFormularioUsuario(FormularioUsuario afu_formularioUsuario) {
		EntityManager lem_entidadManejadora = iiemf_entityFactory.consultarEntityManager();

		afu_formularioUsuario
				.setIdUsuario(lem_entidadManejadora.find(Usuario.class, afu_formularioUsuario.getIdUsuario()).getId());

		lem_entidadManejadora.persist(afu_formularioUsuario);
		lem_entidadManejadora.close();
		return afu_formularioUsuario;
	}

}
