
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.operacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SUT_CB_GestionUsuariosSOAP12BindingQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1", wsdlLocation = "http://13.90.249.221:7004/services/ci/gestionusuarios/v1?wsdl")
public class SUTCBGestionUsuariosSOAP12BindingQSService
    extends Service
{

    private final static URL SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_EXCEPTION;
    private final static QName SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1", "SUT_CB_GestionUsuariosSOAP12BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://13.90.249.221:7004/services/ci/gestionusuarios/v1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION = url;
        SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_EXCEPTION = e;
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService() {
        super(__getWsdlLocation(), SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService(URL wsdlLocation) {
        super(wsdlLocation, SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SUTCBGestionUsuariosSOAP12BindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SUTCBGestionUsuarios
     */
    @WebEndpoint(name = "SUT_CB_GestionUsuariosSOAP12BindingQSPort")
    public SUTCBGestionUsuarios getSUTCBGestionUsuariosSOAP12BindingQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1", "SUT_CB_GestionUsuariosSOAP12BindingQSPort"), SUTCBGestionUsuarios.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SUTCBGestionUsuarios
     */
    @WebEndpoint(name = "SUT_CB_GestionUsuariosSOAP12BindingQSPort")
    public SUTCBGestionUsuarios getSUTCBGestionUsuariosSOAP12BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1", "SUT_CB_GestionUsuariosSOAP12BindingQSPort"), SUTCBGestionUsuarios.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_EXCEPTION!= null) {
            throw SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_EXCEPTION;
        }
        return SUTCBGESTIONUSUARIOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    }

}
