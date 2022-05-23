/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadBusCliente.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadBusCliente
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb;
import co.gov.supernotariado.bachue.clientebus.fabrica.SSLUtilities;
import co.gov.supernotariado.bachue.clientebus.fabrica.ServicioWebFactory;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;

/**
 * El elemento Class UtilidadBusCliente.<br>
 * Representa la utilidad bus cliente.<br>
 * Clase que contiene el metodo principal de consumo de servicios externos tipo
 * web services. <br>
 * <br>
 * Generaliza la entrada y salida de datos de los servicios en VOs (Objeto de
 * valores de servicio), usando un objeto generico principal llamado
 * ClienteIntegracionVO <br>
 * Y generaliza la conmutacion e invocacion de las operaciones de un servicio,
 * por medio de:
 * <ul>
 * <li>Una enumeracion para representar el servicio {@link EnumServiciosWs}</li>
 * <li>Una enumeracion para representar la operacion {@link EnumOperacionesWs}
 * </ul>
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadBusCliente {
	static {
		SSLUtilities.trustAllHostnames();
		SSLUtilities.trustAllHttpsCertificates();
	}

	static final Logger CL_LOGGER = Logger.getLogger(UtilidadBusCliente.class);
	static final String CS_NAME_SPACE = "sandbox.realpay.com.co";

	private UtilidadBusCliente() {
		//Metodo vacio
	}

	/**
	 * Metodo que permite consultar un servicio al bus
	 * @param aes_enumServiciosSoap
	 * @param aeop_enumOperacionesWs
	 * @param aci_clienteIntegracionVO
	 * @return Modelo de datos 
	 */
	public static ClienteIntegracionVO crearEntradaClienteIntegracionBase(EnumServiciosWs aes_enumServiciosSoap,
			EnumOperacionesWs aeop_enumOperacionesWs, ClienteIntegracionVO aci_clienteIntegracionVO) {
		ServicioWebFactory lswf_servicioWebFactory = new ServicioWebFactory();


		javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
				(hostname, sslSession) -> hostname.equals(CS_NAME_SPACE));


		IServicioIntegracionBusiness lisib_servicioIntegracion = BeansLocales.consultarServicioIntegracion();
		ServicioIntegracionDTO lsi_servicioIntegracionDto = lisib_servicioIntegracion
				.consultarServicioIntegracion(aes_enumServiciosSoap.getIs_nombreServicio());

		insertarDatosBaseEntradaCliente(lsi_servicioIntegracionDto, aci_clienteIntegracionVO);		

		IServicioWeb lisw_iServicioWeb = lswf_servicioWebFactory.getServicioWeb(aci_clienteIntegracionVO);
		ClienteIntegracionVO lci_clienteIntegracionVO;

		try {
			lci_clienteIntegracionVO = lisw_iServicioWeb.ejecutar(aci_clienteIntegracionVO,	aeop_enumOperacionesWs.getIs_nombreServicio(),CL_LOGGER);
		}catch(Exception ae_excepcion){
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_SERVICIO,ae_excepcion);
		}

		return lci_clienteIntegracionVO;

	}
	
	/**
	 * Metodo que permite insertar los datos base para la creacion del cliente
	 * @param asi_servicioIntegracionDto servicio de integracion del servicio
	 * @param aci_clienteIntegracionVO Cliente de integracion 
	 */
	private static void insertarDatosBaseEntradaCliente(ServicioIntegracionDTO asi_servicioIntegracionDto, ClienteIntegracionVO aci_clienteIntegracionVO) {
		if (asi_servicioIntegracionDto.getItp_tipoProceso() != null) {
			asi_servicioIntegracionDto.getItp_tipoProceso().getIlp_parametrosDto().forEach(ap_parametro -> {
				if(ap_parametro.getIs_codigoParametro().equals(EnumParametros.CLAVE_WSS.getIs_nombreParametro()))
					aci_clienteIntegracionVO.setIs_autContrasenia(ap_parametro.getIs_valor());
				if(ap_parametro.getIs_codigoParametro().equals(EnumParametros.USUARIO_WSS.getIs_nombreParametro()))
					aci_clienteIntegracionVO.setIs_autUsuario(ap_parametro.getIs_valor());;
			});
		}

		aci_clienteIntegracionVO.setIs_url(asi_servicioIntegracionDto.getIs_url());
		aci_clienteIntegracionVO.setIs_espacioNombre(asi_servicioIntegracionDto.getIs_espacioNombre());
		aci_clienteIntegracionVO.setIs_nombreServicioSoap(asi_servicioIntegracionDto.getIs_nombreServicio());
		aci_clienteIntegracionVO.setIs_nombre(asi_servicioIntegracionDto.getIs_nombre());
		aci_clienteIntegracionVO.setIs_nombreServicioSoap(asi_servicioIntegracionDto.getIs_nombreServicio());
		aci_clienteIntegracionVO.setIs_tiempoFuera(asi_servicioIntegracionDto.getIs_tiempoFuera());
	}
}