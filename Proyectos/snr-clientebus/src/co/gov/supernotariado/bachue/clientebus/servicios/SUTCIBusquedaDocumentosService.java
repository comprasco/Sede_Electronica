
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.operacion.SUTCIBusquedaDocumentos;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SUT_CI_BusquedaDocumentosSOAP12BindingQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/co/busquedadocumentos/v1", wsdlLocation = "http://localhost/wsdl/busquedaDocumentos.wsdl")
public class SUTCIBusquedaDocumentosService
    extends Service
{

    private final static URL SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_EXCEPTION;
    private final static QName SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/co/busquedadocumentos/v1", "SUT_CI_BusquedaDocumentosSOAP12BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/busquedaDocumentos.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION = url;
        SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_EXCEPTION = e;
    }

    public SUTCIBusquedaDocumentosService() {
        super(__getWsdlLocation(), SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SUTCIBusquedaDocumentosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SUTCIBusquedaDocumentosService(URL wsdlLocation) {
        super(wsdlLocation, SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SUTCIBusquedaDocumentosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SUTCIBusquedaDocumentosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SUTCIBusquedaDocumentosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SUTCIBusquedaDocumentos
     */
    @WebEndpoint(name = "SUT_CI_BusquedaDocumentosSOAP12BindingQSPort")
    public SUTCIBusquedaDocumentos getSUTCIBusquedaDocumentosSOAP12BindingQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/co/busquedadocumentos/v1", "SUT_CI_BusquedaDocumentosSOAP12BindingQSPort"), SUTCIBusquedaDocumentos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SUTCIBusquedaDocumentos
     */
    @WebEndpoint(name = "SUT_CI_BusquedaDocumentosSOAP12BindingQSPort")
    public SUTCIBusquedaDocumentos getSUTCIBusquedaDocumentosSOAP12BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/co/busquedadocumentos/v1", "SUT_CI_BusquedaDocumentosSOAP12BindingQSPort"), SUTCIBusquedaDocumentos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_EXCEPTION!= null) {
            throw SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_EXCEPTION;
        }
        return SUTCIBUSQUEDADOCUMENTOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    }

}
