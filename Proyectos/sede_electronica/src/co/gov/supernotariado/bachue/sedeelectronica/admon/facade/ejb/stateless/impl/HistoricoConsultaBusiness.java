/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoConsultaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistoricoConsultaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoConsultaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoConsultaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistoricoConsultaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historico
 * consulta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistoricoConsultaBusiness", mappedName = "HistoricoConsultaBusiness")
@LocalBean
public class HistoricoConsultaBusiness implements IHistoricoConsultaBusiness {

	/**
	 * Atributo de instancia tipo IHistoricoConsultaDAO para definir la propiedad
	 * historico consulta dao.
	 */
	@EJB
	IHistoricoConsultaDAO iihc_historicoConsultaDao;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoConsultaBusiness#agregarConsulta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoConsultaDTO)
	 */
	@Override
	public Boolean agregarConsulta(HistoricoConsultaDTO ahc_historicoConsulta) {
	
		HistoricoConsulta lhc_historicoConsulta = null;
		Boolean lb_estadoConsulta = false;
		
		lhc_historicoConsulta = HistoricoConsultaHelper.dtoAEntidadCompleto(ahc_historicoConsulta, lhc_historicoConsulta);
		
		lb_estadoConsulta = iihc_historicoConsultaDao.agregarHistorico(lhc_historicoConsulta);
	
		return lb_estadoConsulta;
	}

}
