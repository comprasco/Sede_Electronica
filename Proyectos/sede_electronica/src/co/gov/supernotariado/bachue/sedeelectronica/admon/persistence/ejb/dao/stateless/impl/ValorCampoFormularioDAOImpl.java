/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ValorCampoFormularioDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormularioPK;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Valor campo formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ValorCampoFormularioDAOImpl implements IValorCampoFormularioDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#consultarListaValorCampoFormulario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario)
	 */
	@Override
	public List<ValorCampoFormulario> consultarListaValorCampoFormulario(ConfiguracionFormulario acf_configuracionFormulario,
			FormularioUsuario afu_formularioUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<ValorCampoFormulario> ltqvcf_queryValorCampoFormulario = lem_entityManager
				.createNamedQuery("ValorCampoFormulario.consultarValorCampoFormulario", ValorCampoFormulario.class);
		ltqvcf_queryValorCampoFormulario.setParameter("idConfiguracionFormulario", acf_configuracionFormulario.getId());
		ltqvcf_queryValorCampoFormulario.setParameter("idFormularioUsuario", afu_formularioUsuario);
		ltqvcf_queryValorCampoFormulario.setParameter("activo", EnumBoolean.CHAR_S.getIs_codigo());
		List<ValorCampoFormulario> llvcf_listaValorCampoFormulario;
		llvcf_listaValorCampoFormulario = ltqvcf_queryValorCampoFormulario.getResultList();
		return llvcf_listaValorCampoFormulario;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#consultarValorCampoFormulario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo, java.lang.String)
	 */
	@Override
	public ValorCampoFormulario consultarValorCampoFormulario(ConfiguracionCampo acc_configuracionCampo,
			String as_formularioUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<ValorCampoFormulario> ltqvcf_queryValorCampoFormulario = lem_entityManager
				.createNamedQuery("ValorCampoFormulario.consultarValorCampo", ValorCampoFormulario.class);
		ltqvcf_queryValorCampoFormulario.setParameter("idConfiguracionCampo", acc_configuracionCampo);
		ltqvcf_queryValorCampoFormulario.setParameter("idFormularioUsuario", as_formularioUsuario);
		List<ValorCampoFormulario> llvcf_listaValorCampoFormulario;
		llvcf_listaValorCampoFormulario = ltqvcf_queryValorCampoFormulario.getResultList();
		if(llvcf_listaValorCampoFormulario == null || llvcf_listaValorCampoFormulario.isEmpty())
			return null;
		return llvcf_listaValorCampoFormulario.get(0);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#actualizaValorCampoFormulario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario)
	 */
	@Override
	public Boolean actualizaValorCampoFormulario(ValorCampoFormulario avcf_valorCampoFormulario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			ValorCampoFormulario lvcf_valorCampoFormulario;
			lvcf_valorCampoFormulario = lem_entityManager.find(ValorCampoFormulario.class, avcf_valorCampoFormulario.getId());
			lvcf_valorCampoFormulario.setValor(avcf_valorCampoFormulario.getValor());
			lem_entityManager.merge(lvcf_valorCampoFormulario);
			return true;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#consultarPorId(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormularioPK)
	 */
	@Override
	public ValorCampoFormulario consultarPorId(ValorCampoFormularioPK avcf_valorCampoFormularioPk)
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		ValorCampoFormulario lvcf_valorCampoFormulario;
		lvcf_valorCampoFormulario = lem_entityManager.find(ValorCampoFormulario.class, avcf_valorCampoFormularioPk);
		return lvcf_valorCampoFormulario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#crearValorCampoFormulario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario)
	 */
	@Override
	public void crearValorCampoFormulario(ValorCampoFormulario avcf_valorCampoFormularioDto) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		avcf_valorCampoFormularioDto.setConfiguracionCampo(lem_entityManager.find(ConfiguracionCampo.class,avcf_valorCampoFormularioDto.getConfiguracionCampo().getId()));
		lem_entityManager.persist(avcf_valorCampoFormularioDto);
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO#eliminarFormularioCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario)
	 */
	@Override
	public Boolean eliminarFormulario(ValorCampoFormulario avcf_valorCampoFormulario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			avcf_valorCampoFormulario = lem_entityManager.find(ValorCampoFormulario.class, avcf_valorCampoFormulario.getId());
			lem_entityManager.remove(avcf_valorCampoFormulario);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
		return true;
	}
	
}
