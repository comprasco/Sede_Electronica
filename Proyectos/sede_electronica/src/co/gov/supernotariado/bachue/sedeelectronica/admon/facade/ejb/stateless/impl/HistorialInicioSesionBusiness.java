/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialInicioSesionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistorialInicioSesionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialInicioSesionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialInicioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistorialInicioSesionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistorialInicioSesionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historial
 * inicio sesion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistorialInicioSesionBusiness", mappedName = "HistorialInicioSesionBusiness")
@LocalBean
public class HistorialInicioSesionBusiness implements IHistorialInicioSesionBusiness{

	/**
	 * Atributo de instancia tipo IHistorialInicioSesionDAO para definir la
	 * propiedad inicio sesion.
	 */
	@EJB 
	IHistorialInicioSesionDAO iihis_inicioSesion;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialInicioSesionBusiness#crearInicioSesion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialInicioSesionDTO)
	 */
	@Override
	public Boolean crearInicioSesion(HistorialInicioSesionDTO ahs_historicoSesion) {
		HistorialInicioSesion lhs_historicoSesion = new HistorialInicioSesion();
		Boolean lb_estado ;
		lhs_historicoSesion = HistorialInicioSesionHelper.dtoAEntidadCompleto(ahs_historicoSesion, lhs_historicoSesion );
		lb_estado = iihis_inicioSesion.agregarInicioSesion(lhs_historicoSesion);
		
		if (!lb_estado) 
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.AUDITORIA_LOGIN_INCORRECTO);
		
		return lb_estado;
	}

}
