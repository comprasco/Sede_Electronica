package co.gov.supernotariado.bachue.clientebus.util;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import weblogic.security.SSL.TrustManager;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;
import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

/**
 * 
 * Clase que permite generar un objeto de tipo T para cliente SOAP
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 *
 */
public class UtilidadClienteSoap {

	static final Logger CL_LOGGER = Logger.getLogger(UtilidadClienteSoap.class); 	
	static final String CL_PROPERTY_TIMEOUT = "com.sun.xml.internal.ws.request.timeout";

	/**
	 * Metodo que administra las propiedades de conexion a servicios
	 */
	public static void insertarPropiedadesConexion(ClienteIntegracionVO asi_servicioIntegracion, BindingProvider abp_bindingProvider) {			
		//abp_bindingProvider.getRequestContext().put(CL_PROPERTY_TIMEOUT, new Integer(asi_servicioIntegracion.getIs_tiempoFuera()));
		abp_bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, asi_servicioIntegracion.getIs_url());
		//Verifico si hay datos de autenticacion para usarlos
		if (asi_servicioIntegracion.getIs_autUsuario() != null && asi_servicioIntegracion.getIs_autContrasenia() != null
				&& !asi_servicioIntegracion.getIs_autUsuario().isEmpty() && !asi_servicioIntegracion.getIs_autContrasenia().isEmpty()) {

			Binding lb_binding = abp_bindingProvider.getBinding(); 
			@SuppressWarnings("rawtypes")
			List<Handler> llh_handlerList = lb_binding.getHandlerChain();

			if (llh_handlerList == null) 
				llh_handlerList = new ArrayList<>(); 

			llh_handlerList.add(new ManejadorSeguridadSoap(asi_servicioIntegracion.getIs_autUsuario(), asi_servicioIntegracion.getIs_autContrasenia())); 
			lb_binding.setHandlerChain(llh_handlerList);
			
		    List<CredentialProvider> llcp_credencialesProvider = new ArrayList<CredentialProvider>(); 
		    CredentialProvider  lcp_credencialProvider = new ClientUNTCredentialProvider(asi_servicioIntegracion.getIs_autUsuario().getBytes(), asi_servicioIntegracion.getIs_autContrasenia().getBytes()); 
		    llcp_credencialesProvider.add(lcp_credencialProvider); 
			
		    Map<String, Object> lmso_requestContext = ((BindingProvider) abp_bindingProvider).getRequestContext();
		    lmso_requestContext.put(WSSecurityContext.CREDENTIAL_PROVIDER_LIST, llcp_credencialesProvider);
		    lmso_requestContext.put(WSSecurityContext.TRUST_MANAGER, new TrustManager() {
		    	@Override
		    	public boolean certificateCallback(X509Certificate[] axc_chain, int ai_validateErr) {return true;}
		    });			
			
		}
	}


}