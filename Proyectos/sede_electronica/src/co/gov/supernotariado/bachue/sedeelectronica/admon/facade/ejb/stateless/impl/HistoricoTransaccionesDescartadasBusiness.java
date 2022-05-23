/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoTransaccionesDescartadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistoricoTransaccionesDescartadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoTransaccionesDescartadasDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistoricoTransaccionesDescartadasHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoTransaccionesDescartadas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historico
 * transacciones descartadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistoricoTransaccionesDescartadasBusiness", mappedName = "HistoricoTransaccionesDescartadasBusiness")
@LocalBean

public class HistoricoTransaccionesDescartadasBusiness implements IHistoricoTransaccionesDescartadasBusiness {
	

	/**
	 * Atributo de instancia tipo IHistoricoTransaccionesDescartadasDAO para definir
	 * la propiedad historico transacciones descartadas dao.
	 */
	@EJB
	private IHistoricoTransaccionesDescartadasDAO iihtd_historicoTransaccionesDescartadasDao;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoTransaccionesDescartadasBusiness#actualizarHistoricoDescartes(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO)
	 */
	@Override
	public void actualizarHistoricoDescartes(HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto) {
		ahtd_historicoTransaccionesDescatadasDto = (HistoricoTransaccionesDescartadasDTO) UtilidadAuditoria
				.adicionarDatosCreacion(ahtd_historicoTransaccionesDescatadasDto);
		iihtd_historicoTransaccionesDescartadasDao.actualizarHistoricoDescartes(HistoricoTransaccionesDescartadasHelper
				.dtoAEntidadSimple(ahtd_historicoTransaccionesDescatadasDto, new HistoricoTransaccionesDescartadas()));
	}

}
