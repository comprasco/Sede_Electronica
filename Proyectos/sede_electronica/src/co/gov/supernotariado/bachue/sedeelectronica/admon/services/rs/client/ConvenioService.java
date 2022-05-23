/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConvenioService.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConvenioService
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.rs.client;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosRs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadClienteRest;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Convenios.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
public class ConvenioService {

	/**
	 * Atributo de instancia tipo IServicioIntegracionBusiness para definir la
	 * propiedad servico integracion business.
	 */
	@EJB
	private IServicioIntegracionBusiness iisib_serviciosIntegracion;

	/**
	 * Metodo encargado de consultar el servicio rest para traer los convenios
	 * 
	 * @param as_codigoEntidad Cadena de caraceres con el codigo de la entidad
	 * @return lsocer_salidaObtenerConveniosEntidadRsDto
	 */
	public SalidaObtenerConveniosEntidadRSDTO consultarConvenios(String as_codigoEntidad) {

		try {
			ServicioIntegracionDTO lsi_servicio = iisib_serviciosIntegracion
					.consultarServicioIntegracion(EnumServiciosRs.OBTENER_CONVENIOS_ENTIDAD.getIs_nombreServicio());

			Map<String, String> lmss_variablesConsultaConvenios = new HashMap<>();
			lmss_variablesConsultaConvenios.put(EnumParametrosURL.CODIGO_ENTIDAD.getIs_nombreParametro(),
					as_codigoEntidad);
			String ls_url = lsi_servicio.getIs_url();

			SalidaObtenerConveniosEntidadRSDTO lsocer_salidaObtenerConveniosEntidadRsDto;
			lsocer_salidaObtenerConveniosEntidadRsDto = UtilidadClienteRest.consultarServicioRest(ls_url,
					SalidaObtenerConveniosEntidadRSDTO.class, lmss_variablesConsultaConvenios);
			return lsocer_salidaObtenerConveniosEntidadRsDto;
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(ae_excepcion.getMessage());
		}

	}

}
