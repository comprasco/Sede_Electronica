/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaActoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ModeloMinutaActoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ModeloMinutaActoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ModeloMinutaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoActoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Modelo
 * minuta acto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ModeloMinutaActoBusiness", mappedName = "ModeloMinutaActoBusiness")
@LocalBean
public class ModeloMinutaActoBusiness implements IModeloMinutaActoBusiness{
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ModeloMinutaActoBusiness.class);
	
	/**
	 * Atributo de instancia tipo IModeloMinutaActoDAO para definir la propiedad
	 * modelo minuta acto DAO.
	 */
	@EJB
	private IModeloMinutaActoDAO iimma_modeloMinutaActoDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness#consultarMinutaTipoActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO)
	 */
	@Override
	public List<ModeloMinutaActoDTO> consultarMinutaTipoActo(TipoActoDTO ata_idTipoActa) {
		
		TipoActo lta_tipoActo = TipoActoHelper.dtoAEntidadSimple(ata_idTipoActa, new TipoActo());
		List<ModeloMinutaActo> lstActos =  iimma_modeloMinutaActoDAO.consultarMinutaPorTipoActo(lta_tipoActo);
		return ModeloMinutaActoHelper.listaentidadADtoCompleto(lstActos);	
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness#crearAsociarActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO)
	 */
	@Override
	public Boolean crearAsociarActo(ModeloMinutaActoDTO amma_modeloMinutaActoDto) {
		try {
			amma_modeloMinutaActoDto = (ModeloMinutaActoDTO) UtilidadAuditoria.adicionarDatosCreacion(amma_modeloMinutaActoDto);
			return iimma_modeloMinutaActoDAO.crearAsociarActo(ModeloMinutaActoHelper.dtoAEntidadCompleto(amma_modeloMinutaActoDto, new ModeloMinutaActo()));
		} catch (Exception ae_exception) {
			CL_LOGGER.error(ae_exception.getMessage());
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness#consultarTipoActoMinuta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO)
	 */
	@Override
	public List<ModeloMinutaActoDTO> consultarTipoActoMinuta(ModeloMinutaDTO amm_idModeloMinuta) {
		
		ModeloMinuta lmm_modeloMinuta =  ModeloMinutaHelper.dtoAEntidadSimple(amm_idModeloMinuta, new ModeloMinuta());
		List<ModeloMinutaActo> llmma_lstMinuta =  iimma_modeloMinutaActoDAO.consultarTipoActoPorMinuta(lmm_modeloMinuta);		
		return ModeloMinutaActoHelper.listaentidadADtoCompleto(llmma_lstMinuta);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IModeloMinutaActoBusiness#quitarAsociarActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO)
	 */
	@Override
	public Boolean quitarAsociarActo(ModeloMinutaActoDTO amma_modeloMinutaActoDto) {
		ModeloMinutaActo lmma_modeloMinutaActo =  ModeloMinutaActoHelper.dtoAEntidadSimple(amma_modeloMinutaActoDto, new ModeloMinutaActo());		
		return iimma_modeloMinutaActoDAO.quitarAsociarActo(lmma_modeloMinutaActo);
	}
	
	
}
