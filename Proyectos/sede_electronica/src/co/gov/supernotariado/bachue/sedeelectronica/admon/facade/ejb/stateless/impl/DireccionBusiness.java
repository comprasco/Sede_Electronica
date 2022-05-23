/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DireccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: DireccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDireccionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDireccionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;


/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Direccion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DireccionBusiness", mappedName = "DireccionBusiness")
@LocalBean
public class DireccionBusiness implements IDireccionBusiness{


	/**
	 * Atributo de instancia tipo IDireccionDAO para definir la propiedad direccion
	 * dao.
	 */
	@EJB
	private IDireccionDAO iid_direccionDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDireccionBusiness#crearDireccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO)
	 */
	@Override
	public Boolean crearDireccion(DireccionDTO ad_direccion) {
		Boolean lb_estadoTransaccion;
		ad_direccion = (DireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(ad_direccion);

		Direccion ld_direccion = DireccionHelper.dtoAEntidadCompleto(ad_direccion, new Direccion());
		lb_estadoTransaccion = iid_direccionDao.crearDireccion(ld_direccion);

		return lb_estadoTransaccion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDireccionBusiness#modificarDireccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO)
	 */
	@Override
	public Boolean modificarDireccion(DireccionDTO ad_direccionDto) {
		
		if(ad_direccionDto.getIp_paisDto().getIs_nombre().equals(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo()) && 
				(ad_direccionDto.getId_departamentoDto() == null || ad_direccionDto.getIm_municipioDto() == null))
		{
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);
		}
		
		Boolean lb_estadoTransaccion;
		ad_direccionDto = (DireccionDTO) UtilidadAuditoria.adicionarDatosModificacion(ad_direccionDto);

		Direccion ld_direccion = DireccionHelper.dtoAEntidadCompleto(ad_direccionDto, new Direccion());
		lb_estadoTransaccion = iid_direccionDao.modificarDireccion(ld_direccion);

		return lb_estadoTransaccion;
	}

}
