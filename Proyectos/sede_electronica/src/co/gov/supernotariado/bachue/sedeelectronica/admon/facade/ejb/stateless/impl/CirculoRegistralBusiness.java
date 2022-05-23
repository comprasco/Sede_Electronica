/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CirculoRegistralBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CirculoRegistralBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICirculoRegistralDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CirculoRegistralHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Circulo
 * registral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CirculoRegistralBusiness", mappedName = "CirculoRegistralBusiness")
@LocalBean
public class CirculoRegistralBusiness implements ICirculoRegistralBusiness {

	/**
	 * Atributo de instancia tipo ICirculoRegistralDAO para definir la propiedad
	 * circulo registral DAO.
	 */
	@EJB
	private ICirculoRegistralDAO iicr_circuloRegistralDAO;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness#obtenerListaCirculoRegistral()
	 */
	@Override
	public List<CirculoRegistralDTO> obtenerListaCirculoRegistral() {
		List<CirculoRegistral> llcr_listaCirculoRegistral = iicr_circuloRegistralDAO.obtenerOrips();
		List<CirculoRegistralDTO> llcr_listaCirculoRegistralDto;
		llcr_listaCirculoRegistralDto = CirculoRegistralHelper.listaentidadADtoCompleto(llcr_listaCirculoRegistral);
		return llcr_listaCirculoRegistralDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness#obtenerCirculoRegistral(java.lang.String)
	 */
	@Override
	public CirculoRegistralDTO obtenerCirculoRegistral(String as_codigoCirculo) {
		CirculoRegistral lcr_circuloRegistral = iicr_circuloRegistralDAO.obtenerOripXCodigo(as_codigoCirculo);
		return CirculoRegistralHelper.entidadADtoCompleto(lcr_circuloRegistral);
	}

}
