/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudCorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: SolicitudCorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudSuspensionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudWSDTO;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Solicitud correcciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudSuspensionesBusiness", mappedName = "SolicitudSuspensionesBusiness")
@LocalBean
public class SolicitudSuspensionesBusiness implements ISolicitudSuspensionTemporalBusiness{

	@Override
	public TipoSalidaIngresoSolicitudWSDTO ingresoSolicitud(
			TipoEntradaIngresoSolicitudWSDTO ateis_tipoEntradaIngresoSolicitudWsdto) {
		// TODO Auto-generated method stub
		return null;
	}

} 