package co.gov.supernotariado.bachue.clientebus.util;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

/**
 * Metodo que maneja la seguridad de SOAP UI *
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 */
public final class ManejadorSeguridadSoap implements SOAPHandler<SOAPMessageContext> { 
	
	
	static final String CL_PROPERTY_OASIS_WSS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	static final String CL_PROPERTY_OASIS_UTILITY_WSS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	static final String CL_PROPERTY_OASIS_TOKEN_WSS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
	static final String CL_PROPERTY_WSS = "wsse";
	static final String CL_PROPERTY_TYPE = "Type";
	static final String CL_PROPERTY_SECURITY = "Security";
	static final String CL_PROPERTY_USER_NAME_TOKEN = "UsernameToken";
	static final String CL_PROPERTY_USER_NAME_WSS = "MyWSSUsername";
	static final String CL_PROPERTY_PASSSWORD_WSS = "MyWSSPassword";
	static final String CL_PROPERTY_USER_NAME = "Username";
	static final String CL_PROPERTY_USER_PASSWORD = "Password";
	static final String CL_PROPERTY_WSU = "xmlns:wsu";
	
	private String is_nombreUsuario;
	private String is_contrasenia;
	
	static final Logger CL_LOGGER = Logger.getLogger(UtilidadClienteSoap.class); 

	public ManejadorSeguridadSoap(String as_nombreUsuario, String as_contrasenia) {
		this.is_nombreUsuario = as_nombreUsuario;
		this.is_contrasenia = as_contrasenia;
	}
	
    @Override 
    public boolean handleMessage(final SOAPMessageContext asmc_contextoMensaje) { 

     // Indicador de la direccion del mensaje (salida o entrada)
     final Boolean lb_mensajeSalida = (Boolean) asmc_contextoMensaje.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY); 
     // Condicion que verfica si el mensaje es de salida, si es asi se agrega el encabezado
     if (lb_mensajeSalida.booleanValue()) { 
      try { 
       //Se obtiene el contexto SOAP
       final SOAPEnvelope lse_contextoSoap = asmc_contextoMensaje.getMessage().getSOAPPart().getEnvelope(); 

       // Se verifica si el encabezado existe, si no se agrega
       SOAPHeader lsh_encabezado = lse_contextoSoap.getHeader(); 
       if (lsh_encabezado == null) 
        lsh_encabezado = lse_contextoSoap.addHeader(); 

       SOAPElement lse_seguridad =
    		   lsh_encabezado.addChildElement(CL_PROPERTY_SECURITY, CL_PROPERTY_WSS, CL_PROPERTY_OASIS_WSS);
       	//Se define el usernameToken

       SOAPElement usernameToken =
    		   lse_seguridad.addChildElement(CL_PROPERTY_USER_NAME_TOKEN, CL_PROPERTY_WSS);
       usernameToken.addAttribute(new QName(CL_PROPERTY_WSU), CL_PROPERTY_OASIS_UTILITY_WSS);

       SOAPElement username =
               usernameToken.addChildElement(CL_PROPERTY_USER_NAME, CL_PROPERTY_WSS);
       username.addTextNode(is_nombreUsuario);

       SOAPElement password =
               usernameToken.addChildElement(CL_PROPERTY_USER_PASSWORD, CL_PROPERTY_WSS);
       password.setAttribute(CL_PROPERTY_TYPE, CL_PROPERTY_OASIS_TOKEN_WSS);
      password.addTextNode(is_contrasenia);
       

      } catch (final Exception ae_excepcion) { 
    	  CL_LOGGER.error(ae_excepcion); 
       return false; 
      } 
     } 
     return true; 
    }

	@Override
	public boolean handleFault(SOAPMessageContext as_contexto) {
		return false;
	}

	@Override
	public void close(MessageContext as_contexto) {
		//Metodo complemento al cierre
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	} 
}
