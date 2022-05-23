/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CoordenadaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CoordenadaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICoordenadaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CoordenadaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICoordenadaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CoordenadaHelper;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Coordenada.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CoordenadaBusiness", mappedName = "CoordenadaBusiness")
@LocalBean
public class CoordenadaBusiness implements ICoordenadaBusiness {
	
	/**
	 * Atributo de instancia tipo ICoordenadaDAO para definir la propiedad
	 * coordenada DAO.
	 */
	@EJB
	private ICoordenadaDAO iic_coordenadaDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICoordenadaBusiness#consultar()
	 */
	@Override
	public List<CoordenadaDTO> consultar() {
		List<CoordenadaDTO> llc_listaCoordenadasDto;
		llc_listaCoordenadasDto = CoordenadaHelper.listaEntidadADtoSimple(iic_coordenadaDAO.consultarCoordenadas());
		return llc_listaCoordenadasDto;
	}
}
