/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PlantillaCorreoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb.impl
 * Nombre del elemento: PlantillaCorreoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.EnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ParametrizacionPlantillaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb.IPlantillaCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Plantilla
 * correo. <br>
 * Implementa la interfaz IPlantillaCorreoBusiness
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PlantillaCorreoBusiness", mappedName = "PlantillaCorreoBusiness")
@LocalBean
public class PlantillaCorreoBusiness implements IPlantillaCorreoBusiness {
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PlantillaCorreoBusiness.class);

	/**
	 * Atributo de instancia tipo IParametrizacionPlantillaDAO para definir la
	 * propiedad parametrizacion plantilla dao.
	 */
	@EJB
	private IParametrizacionPlantillaDAO iipp_parametrizacionPlantillaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb.
	 * IPlantillaCorreoBusiness#generarPlantillaCorreoInstancia(co.gov.
	 * supernotariado.bachue.sedeelectronica.common.mailer.enums.
	 * IEnumPlantillasCorreo)
	 */
	@Override
	public PlantillaCorreoInstanciaDTO generarPlantillaCorreoInstancia(IEnumPlantillasCorreo aiepc_plantillaCorreo) {
		
		CL_LOGGER.error("PlantillaCorreoBusinness: generarPlantillaCOrreoInstancia: 2. Empieza a genera la plantilla de correo instancia");

		ParametrizacionPlantilla lpp_plantilla = iipp_parametrizacionPlantillaDao
				.consultarPlantilla(aiepc_plantillaCorreo.consultarCodigoPlantilla());
		ParametrizacionPlantillaDTO lpp_plantillaDto = ParametrizacionPlantillaHelper
				.entidadADtoCompleto(lpp_plantilla);

		PlantillaCorreoInstanciaDTO lpci_plantillCorreoInstancia;
		lpci_plantillCorreoInstancia = new PlantillaCorreoInstanciaDTO(lpp_plantillaDto);
		
		CL_LOGGER.error("PlantillaCorreoBusinness: generarPlantillaCOrreoInstancia: 2. Termina a genera la plantilla de correo instancia");

		return lpci_plantillCorreoInstancia;
	}

}
