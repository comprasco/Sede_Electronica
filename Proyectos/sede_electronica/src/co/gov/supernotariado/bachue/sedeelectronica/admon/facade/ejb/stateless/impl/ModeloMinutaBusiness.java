/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ModeloMinutaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ModeloMinutaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Modelo
 * minuta. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ModeloMinutaBusiness", mappedName = "ModeloMinutaBusiness")
@LocalBean
public class ModeloMinutaBusiness implements IModeloMinutaBusiness{

	/**
	 * Atributo de instancia tipo IModeloMinutaDAO para definir la propiedad modelo
	 * minuta dao.
	 */
	@EJB
	private IModeloMinutaDAO iimm_modeloMinutaDao;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness#guardarModeloMinuta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO, boolean)
	 */
	@Override
	public boolean guardarModeloMinuta(ModeloMinutaDTO amm_modeloMinutaDto, boolean ab_modificar) {
		boolean lb_ok = false;		
			if (ab_modificar) {
				amm_modeloMinutaDto = (ModeloMinutaDTO) UtilidadAuditoria.adicionarDatosModificacion(amm_modeloMinutaDto);
				lb_ok = iimm_modeloMinutaDao.actualizarModeloMinuta(ModeloMinutaHelper.dtoAEntidadCompleto(amm_modeloMinutaDto, null));		
				
			} else {
				amm_modeloMinutaDto = (ModeloMinutaDTO) UtilidadAuditoria.adicionarDatosCreacion(amm_modeloMinutaDto);
				lb_ok = iimm_modeloMinutaDao.guardarModeloMinuta(ModeloMinutaHelper.dtoAEntidadCompleto(amm_modeloMinutaDto, null));	
			}
			return lb_ok;		
		
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness#consultarModeloMinutaPorNombre(java.lang.String)
	 */
	@Override
	public ModeloMinutaDTO consultarModeloMinutaPorNombre(String as_nombre) {
		return ModeloMinutaHelper.entidadADtoCompleto(iimm_modeloMinutaDao.consultarModeloMinutaPorNombre(as_nombre));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaBusiness#consultarModelosMinuta()
	 */
	@Override
	public List<ModeloMinutaDTO> consultarModelosMinuta() {
		return ModeloMinutaHelper.listaentidadADtoCompleto(iimm_modeloMinutaDao.consultarModelosMinuta());
	}



}
