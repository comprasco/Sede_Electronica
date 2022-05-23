/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrizacionPlantillaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ParametrizacionPlantillaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametrizacionPlantillaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ParametrizacionPlantillaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Parametrizacion plantilla. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ParametrizacionPlantillaBusiness", mappedName = "ParametrizacionPlantillaBusiness")
@LocalBean
public class ParametrizacionPlantillaBusiness implements IParametrizacionPlantillaBusiness {

	/**
	 * Atributo de instancia tipo IParametrizacionPlantillaDAO para definir la
	 * propiedad parametrizacion plantilla.
	 */
	@EJB
	IParametrizacionPlantillaDAO iipp_parametrizacionPlantilla;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametrizacionPlantillaBusiness#consultarPlantillas()
	 */
	@Override
	public List<ParametrizacionPlantillaDTO> consultarPlantillas() {

		List<ParametrizacionPlantilla> llpp_parametrizacionesPlantilla;
		llpp_parametrizacionesPlantilla = iipp_parametrizacionPlantilla.consultarPlantillas();
		List<ParametrizacionPlantillaDTO> llpp_parametrizacionesPlantillaDto;
		llpp_parametrizacionesPlantillaDto = ParametrizacionPlantillaHelper.listaEntidadADtoCompleto(llpp_parametrizacionesPlantilla);

		return llpp_parametrizacionesPlantillaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametrizacionPlantillaBusiness#actualizarPlantilla(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO)
	 */
	@Override
	public Boolean actualizarPlantilla(ParametrizacionPlantillaDTO app_plantilla) {

		ParametrizacionPlantilla lpp_parametrizacionPlantilla = ParametrizacionPlantillaHelper.dtoAEntidadCompleto(app_plantilla, null);
		Boolean lb_parametrizacion;
		lb_parametrizacion = iipp_parametrizacionPlantilla.actualizarPlantilla(lpp_parametrizacionPlantilla);

		return lb_parametrizacion;
	}

}
