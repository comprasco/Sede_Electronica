package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionBancarizacionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S Nota: Clase que implementa la interfaz DAO.
*/
@Stateless
@LocalBean
public class TransaccionBancarizacionDAO implements ITransaccionBancarizacionDAO{

	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	@Override
	public List<TransaccionBancarizacion> consultarTransaccionBancarizacion(String as_IdUsuario, Date ad_fechaInicial,Date ad_fechaFinal) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<TransaccionBancarizacion> ltqtb_sentenciahistorialClave = lem_entityManager.createNamedQuery("TransaccionBancarizacion.findByUsuarioDate", TransaccionBancarizacion.class);
		
		ltqtb_sentenciahistorialClave.setParameter("idUsuario", as_IdUsuario);
		ltqtb_sentenciahistorialClave.setParameter("fechaInicio", ad_fechaInicial);
		ltqtb_sentenciahistorialClave.setParameter("fechaFinal", ad_fechaFinal);
		
		return ltqtb_sentenciahistorialClave.getResultList();
	}

	@Override
	public Boolean insertarTransaccionBancarizacion(TransaccionBancarizacion atb_transaccionBancarizacion) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(atb_transaccionBancarizacion);
		} catch (Exception ae_exception) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean insertarTurnosBancarizacion(TransaccionBancarizacion atb_transaccionBancarizacion, List<TurnosBancarizacion> altb_turnos) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			altb_turnos.forEach(lt_turno-> {
				lem_entityManager.merge(lt_turno);
			});		
			lem_entityManager.merge(atb_transaccionBancarizacion);
		} catch (Exception ae_exception) {
			return false;
		}
		return true;
	}
	
	@Override
	public TransaccionBancarizacion consultarTransaccionBancarizacion(String as_codigoTransaccion) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<TransaccionBancarizacion> ltqtb_sentenciahistorialClave = lem_entityManager.createNamedQuery("TransaccionBancarizacion.findByCodigoTransaccion", TransaccionBancarizacion.class);
		
		ltqtb_sentenciahistorialClave.setParameter("codigoTransaccion", as_codigoTransaccion);
		
		return ltqtb_sentenciahistorialClave.getResultList().iterator().next();
	}

}
