/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ColaEnvioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ColaEnvioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ColaEnvioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IArchivoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ColaEnvioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumEstadoEnvio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Cola envio.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ColaEnvioBusiness", mappedName = "ColaEnvioBusiness")
@LocalBean
public class ColaEnvioBusiness implements IColaEnvioBusiness {

	/**
	 * Atributo de instancia tipo IArchivoDAO para definir la propiedad archivo DAO.
	 */
	@EJB
	private IArchivoDAO iia_archivoDAO;

	/**
	 * Atributo de instancia tipo IColaEnvioDAO para definir la propiedad cola envio
	 * dao.
	 */
	@EJB
	private IColaEnvioDAO iice_colaEnvioDao;

	/**
	 * Define la constante CI_CANTIDAD_MAXIMA_INTENTOS_CORREO.
	 */
	private static final Integer CI_CANTIDAD_MAXIMA_INTENTOS_CORREO = 5;
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(EnvioCorreoBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#encolarCorreo(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO)
	 */
	@Override
	public Boolean encolarCorreo(PlantillaCorreoInstanciaDTO apci_plantillaDto) {

		ColaEnvioDTO lce_colaEnvioDto = new ColaEnvioDTO();

		//Se insertan datos de creacion
		lce_colaEnvioDto = (ColaEnvioDTO) UtilidadAuditoria.adicionarDatosCreacion(lce_colaEnvioDto);

		//Se insertan datos de parametrizacion y datos de correo
		lce_colaEnvioDto.setIpp_parametrizacionPlantilla(apci_plantillaDto.getIpcp_parametrizacionCorreo());
		lce_colaEnvioDto.setIi_cantidadIntentos(0);
		lce_colaEnvioDto.setIs_detalleEnvio(apci_plantillaDto.getIpcp_parametrizacionCorreo().getIs_nombre());
		lce_colaEnvioDto.setIs_estadoEnvio(EnumEstadoEnvio.PENDIENTE.getIs_codigoPlanilla());
		lce_colaEnvioDto.setIs_plantillaLlena(apci_plantillaDto.toString());
		lce_colaEnvioDto.setIs_prioridad(apci_plantillaDto.getIpcp_parametrizacionCorreo().getIs_confPrioridad());				

		//Se encola en la base datos
		ColaEnvio lce_colaEnvio = ColaEnvioHelper.dtoAEntidadCompleto(lce_colaEnvioDto, null);
		Boolean lb_estadoEncolamiento = iice_colaEnvioDao.encolarCorreo(lce_colaEnvio);

		CL_LOGGER.info(ColaEnvioBusiness.class.getName()+lce_colaEnvioDto.toString());

		return lb_estadoEncolamiento;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#consultarCorreosPendientes()
	 */
	@Override
	public List<ColaEnvioDTO> consultarCorreosPendientes() {
		List<ColaEnvio> llce_colaCorreos = iice_colaEnvioDao.consultarCorreosPendientes(CI_CANTIDAD_MAXIMA_INTENTOS_CORREO);
		List<ColaEnvioDTO> llce_colaCorreosDto;
		llce_colaCorreosDto = ColaEnvioHelper.listaEntidadADtoCompleto(llce_colaCorreos);
		return llce_colaCorreosDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#eliminarCorreoCola(java.lang.String)
	 */
	@Override
	public Integer eliminarCorreoCola(String as_idCola) {
		Integer li_cantidadCorreosEliminados;
		li_cantidadCorreosEliminados = iice_colaEnvioDao.eliminarCorreoCola(as_idCola);
		return li_cantidadCorreosEliminados;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#consultarCorreosVencidos()
	 */
	@Override
	public List<ColaEnvioDTO> consultarCorreosVencidos() {
		List<ColaEnvio> llce_colaCorreos = iice_colaEnvioDao.consultarCorreosVencidos(CI_CANTIDAD_MAXIMA_INTENTOS_CORREO);
		List<ColaEnvioDTO> llce_colaCorreosDto;
		llce_colaCorreosDto = ColaEnvioHelper.listaEntidadADtoCompleto(llce_colaCorreos);
		return llce_colaCorreosDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#actualizarCorreo(co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO)
	 */
	@Override
	public void actualizarCorreo(PlantillaCorreoInstanciaDTO apci_correoPlantilla) {
	  //Metodo vacio
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IColaEnvioBusiness#actualizarCorreoColaEnvio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ColaEnvioDTO)
	 */
	@Override
	public void actualizarCorreoColaEnvio(ColaEnvioDTO ace_colaEnvioDTO) {
		ColaEnvio lce_colaEnvio = ColaEnvioHelper.dtoAEntidadCompleto(ace_colaEnvioDTO, null);
		iice_colaEnvioDao.actualizarCorreoColaEnvio(lce_colaEnvio);		
	}

}
