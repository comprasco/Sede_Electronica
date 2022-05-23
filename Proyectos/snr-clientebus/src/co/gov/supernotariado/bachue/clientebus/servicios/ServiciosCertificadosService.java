
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.operacion.ServiciosCertificados;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiciosCertificados", targetNamespace = "http://services.ctls.supernotariado.gov.co/", wsdlLocation = "https://test.snrbotondepago.gov.co/CTLServices/ServiciosCertificados?wsdl")
public class ServiciosCertificadosService
    extends Service
{

    private final static URL SERVICIOSCERTIFICADOS_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSCERTIFICADOS_EXCEPTION;
    private final static QName SERVICIOSCERTIFICADOS_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "ServiciosCertificados");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://test.snrbotondepago.gov.co/CTLServices/ServiciosCertificados?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSCERTIFICADOS_WSDL_LOCATION = url;
        SERVICIOSCERTIFICADOS_EXCEPTION = e;
    }

    public ServiciosCertificadosService() {
        super(__getWsdlLocation(), SERVICIOSCERTIFICADOS_QNAME);
    }

    public ServiciosCertificadosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSCERTIFICADOS_QNAME, features);
    }

    public ServiciosCertificadosService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSCERTIFICADOS_QNAME);
    }

    public ServiciosCertificadosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSCERTIFICADOS_QNAME, features);
    }

    public ServiciosCertificadosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiciosCertificadosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiciosCertificados
     */
    @WebEndpoint(name = "ServiciosCertificadosPort")
    public ServiciosCertificados getServiciosCertificadosPort() {
        return super.getPort(new QName("http://services.ctls.supernotariado.gov.co/", "ServiciosCertificadosPort"), ServiciosCertificados.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiciosCertificados
     */
    @WebEndpoint(name = "ServiciosCertificadosPort")
    public ServiciosCertificados getServiciosCertificadosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.ctls.supernotariado.gov.co/", "ServiciosCertificadosPort"), ServiciosCertificados.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSCERTIFICADOS_EXCEPTION!= null) {
            throw SERVICIOSCERTIFICADOS_EXCEPTION;
        }
        return SERVICIOSCERTIFICADOS_WSDL_LOCATION;
    }

}
