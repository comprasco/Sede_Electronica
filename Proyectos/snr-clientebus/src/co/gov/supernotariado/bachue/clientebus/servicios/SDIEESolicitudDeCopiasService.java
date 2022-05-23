
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.solicituddecopias.operacion.SDIEESolicitudDeCopias;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDI_EE_SolicitudDeCopiasQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/solicituddecopias/v1", wsdlLocation = "http://localhost/wsdl/solicitudDeCopias.wsdl")
public class SDIEESolicitudDeCopiasService
    extends Service
{

    private final static URL SDIEESOLICITUDDECOPIASQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SDIEESOLICITUDDECOPIASQSSERVICE_EXCEPTION;
    private final static QName SDIEESOLICITUDDECOPIASQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ee/solicituddecopias/v1", "SDI_EE_SolicitudDeCopiasQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/solicitudDeCopias.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDIEESOLICITUDDECOPIASQSSERVICE_WSDL_LOCATION = url;
        SDIEESOLICITUDDECOPIASQSSERVICE_EXCEPTION = e;
    }

    public SDIEESolicitudDeCopiasService() {
        super(__getWsdlLocation(), SDIEESOLICITUDDECOPIASQSSERVICE_QNAME);
    }

    public SDIEESolicitudDeCopiasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDIEESOLICITUDDECOPIASQSSERVICE_QNAME, features);
    }

    public SDIEESolicitudDeCopiasService(URL wsdlLocation) {
        super(wsdlLocation, SDIEESOLICITUDDECOPIASQSSERVICE_QNAME);
    }

    public SDIEESolicitudDeCopiasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDIEESOLICITUDDECOPIASQSSERVICE_QNAME, features);
    }

    public SDIEESolicitudDeCopiasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDIEESolicitudDeCopiasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDIEESolicitudDeCopias
     */
    @WebEndpoint(name = "SDI_EE_SolicitudDeCopiasQSPort")
    public SDIEESolicitudDeCopias getSDIEESolicitudDeCopiasQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/solicituddecopias/v1", "SDI_EE_SolicitudDeCopiasQSPort"), SDIEESolicitudDeCopias.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDIEESolicitudDeCopias
     */
    @WebEndpoint(name = "SDI_EE_SolicitudDeCopiasQSPort")
    public SDIEESolicitudDeCopias getSDIEESolicitudDeCopiasQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/solicituddecopias/v1", "SDI_EE_SolicitudDeCopiasQSPort"), SDIEESolicitudDeCopias.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDIEESOLICITUDDECOPIASQSSERVICE_EXCEPTION!= null) {
            throw SDIEESOLICITUDDECOPIASQSSERVICE_EXCEPTION;
        }
        return SDIEESOLICITUDDECOPIASQSSERVICE_WSDL_LOCATION;
    }

}