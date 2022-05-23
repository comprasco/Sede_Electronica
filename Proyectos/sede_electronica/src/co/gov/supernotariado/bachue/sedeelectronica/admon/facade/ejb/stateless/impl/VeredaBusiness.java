/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: VeredaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.VeredaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IVeredaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.VeredaHelper;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Vereda. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Stateless(name = "VeredaBusiness", mappedName = "VeredaBusiness")
@LocalBean
public class VeredaBusiness implements IVeredaBusiness{

	/**
	 * Atributo de instancia tipo IVeredaDAO para definir la propiedad vereda dao.
	 */
	@EJB
	private IVeredaDAO iiv_veredaDao;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness#consultarVeredas()
	 */
	@Override
	public List<VeredaDTO> consultarVeredas() {
		List<VeredaDTO> llv_veredaDTO;
		llv_veredaDTO = VeredaHelper.listaentidadADtoCompleto(iiv_veredaDao.consultarVeredas());
		return llv_veredaDTO;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness#consultarVeredas(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<VeredaDTO> consultarVeredas(Integer ai_valorIncialPag, Integer ai_valorFinalPag) {
		List<VeredaDTO> llv_veredaDTO;
		llv_veredaDTO = VeredaHelper.listaentidadADtoCompleto(iiv_veredaDao.consultarVeredas(ai_valorIncialPag, ai_valorFinalPag));
		return llv_veredaDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness#consultarVeredasMunicipios(java.lang.String)
	 */
	@Override
	public List<VeredaDTO> consultarVeredasMunicipios(String as_municipio) {
		List<VeredaDTO> llv_veredaDTO;
		llv_veredaDTO = VeredaHelper.listaentidadADtoCompleto(iiv_veredaDao.consultarVeredaMunicipio(as_municipio));
		return llv_veredaDTO;
	}

}
