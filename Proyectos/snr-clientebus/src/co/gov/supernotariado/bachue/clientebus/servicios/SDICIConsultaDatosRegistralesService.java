
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.operacion.SDICIConsultaDatosRegistrales;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDI_CI_ConsultaDatosRegistrales", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ci/consultadatosregistrales/v1", wsdlLocation = "http://localhost/wsdl/consultaDatosRegistrales.wsdl")
public class SDICIConsultaDatosRegistralesService
    extends Service
{

    private final static URL SDICICONSULTADATOSREGISTRALES_WSDL_LOCATION;
    private final static WebServiceException SDICICONSULTADATOSREGISTRALES_EXCEPTION;
    private final static QName SDICICONSULTADATOSREGISTRALES_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ci/consultadatosregistrales/v1", "SDI_CI_ConsultaDatosRegistrales");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/consultaDatosRegistrales.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDICICONSULTADATOSREGISTRALES_WSDL_LOCATION = url;
        SDICICONSULTADATOSREGISTRALES_EXCEPTION = e;
    }

    public SDICIConsultaDatosRegistralesService() {
        super(__getWsdlLocation(), SDICICONSULTADATOSREGISTRALES_QNAME);
    }

    public SDICIConsultaDatosRegistralesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDICICONSULTADATOSREGISTRALES_QNAME, features);
    }

    public SDICIConsultaDatosRegistralesService(URL wsdlLocation) {
        super(wsdlLocation, SDICICONSULTADATOSREGISTRALES_QNAME);
    }

    public SDICIConsultaDatosRegistralesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDICICONSULTADATOSREGISTRALES_QNAME, features);
    }

    public SDICIConsultaDatosRegistralesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDICIConsultaDatosRegistralesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDICIConsultaDatosRegistrales
     */
    @WebEndpoint(name = "SDI_CI_ConsultaDatosRegistralesPort")
    public SDICIConsultaDatosRegistrales getSDICIConsultaDatosRegistralesPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ci/consultadatosregistrales/v1", "SDI_CI_ConsultaDatosRegistralesPort"), SDICIConsultaDatosRegistrales.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDICIConsultaDatosRegistrales
     */
    @WebEndpoint(name = "SDI_CI_ConsultaDatosRegistralesPort")
    public SDICIConsultaDatosRegistrales getSDICIConsultaDatosRegistralesPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ci/consultadatosregistrales/v1", "SDI_CI_ConsultaDatosRegistralesPort"), SDICIConsultaDatosRegistrales.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDICICONSULTADATOSREGISTRALES_EXCEPTION!= null) {
            throw SDICICONSULTADATOSREGISTRALES_EXCEPTION;
        }
        return SDICICONSULTADATOSREGISTRALES_WSDL_LOCATION;
    }

}
