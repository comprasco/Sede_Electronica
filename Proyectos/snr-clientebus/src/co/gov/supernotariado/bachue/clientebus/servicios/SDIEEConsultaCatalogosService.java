
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.consultacatalogos.operacion.SDIEEConsultaCatalogos;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDI_EE_ConsultaCatalogosSOAP12BindingQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/consultacatalogos/v1", wsdlLocation = "http://localhost/wsdl/catalogos.wsdl")
public class SDIEEConsultaCatalogosService
    extends Service
{

    private final static URL SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_EXCEPTION;
    private final static QName SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultacatalogos/v1", "SDI_EE_ConsultaCatalogosSOAP12BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/catalogos.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION = url;
        SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_EXCEPTION = e;
    }

    public SDIEEConsultaCatalogosService() {
        super(__getWsdlLocation(), SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SDIEEConsultaCatalogosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SDIEEConsultaCatalogosService(URL wsdlLocation) {
        super(wsdlLocation, SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SDIEEConsultaCatalogosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SDIEEConsultaCatalogosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDIEEConsultaCatalogosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDIEEConsultaCatalogos
     */
    @WebEndpoint(name = "SDI_EE_ConsultaCatalogosSOAP12BindingQSPort")
    public SDIEEConsultaCatalogos getSDIEEConsultaCatalogosSOAP12BindingQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultacatalogos/v1", "SDI_EE_ConsultaCatalogosSOAP12BindingQSPort"), SDIEEConsultaCatalogos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDIEEConsultaCatalogos
     */
    @WebEndpoint(name = "SDI_EE_ConsultaCatalogosSOAP12BindingQSPort")
    public SDIEEConsultaCatalogos getSDIEEConsultaCatalogosSOAP12BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultacatalogos/v1", "SDI_EE_ConsultaCatalogosSOAP12BindingQSPort"), SDIEEConsultaCatalogos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_EXCEPTION!= null) {
            throw SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_EXCEPTION;
        }
        return SDIEECONSULTACATALOGOSSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    }

}