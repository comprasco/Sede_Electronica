
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.operacion.SDIEEConsultaTrazabilidad;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/consultatrazabilidad/v1", wsdlLocation = "http://localhost/wsdl/consultartrazabilidad.wsdl")
public class SDIEEConsultaTrazabilidadService
    extends Service
{

    private final static URL SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_EXCEPTION;
    private final static QName SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultatrazabilidad/v1", "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/consultartrazabilidad.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_WSDL_LOCATION = url;
        SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_EXCEPTION = e;
    }

    public SDIEEConsultaTrazabilidadService() {
        super(__getWsdlLocation(), SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SDIEEConsultaTrazabilidadService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SDIEEConsultaTrazabilidadService(URL wsdlLocation) {
        super(wsdlLocation, SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_QNAME);
    }

    public SDIEEConsultaTrazabilidadService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_QNAME, features);
    }

    public SDIEEConsultaTrazabilidadService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDIEEConsultaTrazabilidadService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDIEEConsultaTrazabilidad
     */
    @WebEndpoint(name = "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSPort")
    public SDIEEConsultaTrazabilidad getSDIEEConsultaTrazabilidadSOAP12BindingQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultatrazabilidad/v1", "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSPort"), SDIEEConsultaTrazabilidad.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDIEEConsultaTrazabilidad
     */
    @WebEndpoint(name = "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSPort")
    public SDIEEConsultaTrazabilidad getSDIEEConsultaTrazabilidadSOAP12BindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/consultatrazabilidad/v1", "SDI_EE_ConsultaTrazabilidadSOAP12BindingQSPort"), SDIEEConsultaTrazabilidad.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_EXCEPTION!= null) {
            throw SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_EXCEPTION;
        }
        return SDIEECONSULTATRAZABILIDADSOAP12BINDINGQSSERVICE_WSDL_LOCATION;
    }

}