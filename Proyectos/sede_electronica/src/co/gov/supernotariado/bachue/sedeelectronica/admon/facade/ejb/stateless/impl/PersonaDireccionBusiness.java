/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaDireccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PersonaDireccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaDireccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDireccionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaDireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Persona
 * direccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PersonaDireccionBusiness", mappedName = "PersonaDireccionBusiness")
@LocalBean
public class PersonaDireccionBusiness implements IPersonaDireccionBusiness {
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PersonaDireccionBusiness.class);
	
	/**
	 * Atributo de instancia tipo IPersonaDireccionDAO para definir la propiedad
	 * persona direccion DAO.
	 */
	@EJB
	private IPersonaDireccionDAO iipd_personaDireccionDAO;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaDireccionBusiness#crearPersonaDireccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public Boolean crearPersonaDireccion(DireccionDTO apd_personaDireccionDto, PersonaDTO apd_personaDto) {
		try {
			
			PersonaDireccionDTO lpd_personaDireccionDto = new PersonaDireccionDTO();
			apd_personaDireccionDto = (DireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(apd_personaDireccionDto);
			lpd_personaDireccionDto = (PersonaDireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(lpd_personaDireccionDto);

			PersonaDireccion lpd_personaDireccion = PersonaDireccionHelper.dtoAEntidadCompleto(lpd_personaDireccionDto, new PersonaDireccion());
			lpd_personaDireccion.setDireccion(DireccionHelper.dtoAEntidadCompleto(apd_personaDireccionDto, new Direccion()));
			lpd_personaDireccion.setPersona(PersonaHelper.dtoAEntidadCompleto(apd_personaDto, new Persona()));
			lpd_personaDireccion.setActivo(EnumBoolean.CHAR_S.getIs_codigo());
			
			return iipd_personaDireccionDAO.crearPersonaDireccion(lpd_personaDireccion);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return false;
		}
	}
	
}
    