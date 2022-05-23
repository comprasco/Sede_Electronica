/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioIntegracionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ServicioIntegracionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IServicioIntegracionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ServicioIntegracionBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ServicioIntegracionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ServicioIntegracion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Servicio
 * integracion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ServicioIntegracionBusiness", mappedName = "ServicioIntegracionBusiness")
@LocalBean
public class ServicioIntegracionBusiness implements IServicioIntegracionBusiness{

	/**
	 * Atributo de instancia tipo IServicioIntegracionDAO para definir la propiedad
	 * servicio integracion dao.
	 */
	@EJB
	private IServicioIntegracionDAO iisi_servicioIntegracionDao;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness#consultarServiciosIntegraciones()
	 */
	@Override
	public List<ServicioIntegracionBooleanoDTO> consultarServiciosIntegraciones(){
		List<ServicioIntegracion> llsi_servicioIntegracion = iisi_servicioIntegracionDao.consultarServiciosIntegraciones();
		List<ServicioIntegracionDTO> llsi_servicioIntegracionDto;
		llsi_servicioIntegracionDto = ServicioIntegracionHelper.listaentidadADtoCompleto(llsi_servicioIntegracion);
		List<ServicioIntegracionBooleanoDTO> llsib_servicioIntegracionBooleanoDto;
		llsib_servicioIntegracionBooleanoDto = ServicioIntegracionBooleanoHelper.listaDtoABooleanoSimple(llsi_servicioIntegracionDto);
		return llsib_servicioIntegracionBooleanoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness#consultarServicioIntegracion(java.lang.String)
	 */
	@Override
	public ServicioIntegracionDTO consultarServicioIntegracion(String as_nombreServicioIntegracion) {

		ServicioIntegracion lsi_servicioIntegracion = iisi_servicioIntegracionDao.consultarServicioIntegracion(as_nombreServicioIntegracion);
		if (lsi_servicioIntegracion == null) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_SOAP_INCORRECTOS);
		}

		ServicioIntegracionDTO lsi_servicioIntegracionDto;
		lsi_servicioIntegracionDto = ServicioIntegracionHelper.entidadADtoCompleto(lsi_servicioIntegracion);		
		return lsi_servicioIntegracionDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness#editarServicio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionBooleanoDTO)
	 */
	@Override
	public boolean editarServicio(ServicioIntegracionBooleanoDTO asib_servicioIntegracionBooleanoDto) {
		ServicioIntegracionDTO lsi_servicioIntegracionDto = ServicioIntegracionBooleanoHelper.booleanoADtoSimple(asib_servicioIntegracionBooleanoDto);
		lsi_servicioIntegracionDto = (ServicioIntegracionDTO) UtilidadAuditoria.adicionarDatosModificacion(lsi_servicioIntegracionDto);
		return iisi_servicioIntegracionDao.actualizarServicioIntegracion(ServicioIntegracionHelper.dtoAEntidadSimple(lsi_servicioIntegracionDto, new ServicioIntegracion()));
	}


}
