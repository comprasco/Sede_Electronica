/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidacionDocumentosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: ValidacionDocumentosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IValidacionDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Validacion documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultarVerificarProducto", mappedName = "ConsultarVerificarProducto")
@LocalBean
public class ValidacionDocumentosBusiness implements IValidacionDocumentos {

	/**
	 * Atributo de instancia tipo IEntregaProductoBusiness para definir la propiedad
	 * entrega producto business.
	 */
	@EJB
	private IEntregaProductoBusiness iiep_entregaProductoBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IValidacionDocumentos#verificarProducto(java.lang.String)
	 */
	@Override
	public TipoSalidaVerificarProductoWSDTO verificarProducto(String as_codVerificacion) {
		TipoEntradaVerificarProductoWSDTO ltevp_tipoEntradaVerificarProductoWsDto = new TipoEntradaVerificarProductoWSDTO();
		ltevp_tipoEntradaVerificarProductoWsDto.setIs_codigoVerificacion(as_codVerificacion);
		TipoSalidaVerificarProductoWSDTO ltsvp_tipoSalidaVerificarProductoWsDto = iiep_entregaProductoBusiness
				.verificarProducto(ltevp_tipoEntradaVerificarProductoWsDto);
		return ltsvp_tipoSalidaVerificarProductoWsDto;
	}

}
