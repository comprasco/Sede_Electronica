
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.consultamigracion.operacion.SUTCBConsultaMigracion;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SUT_CB_ConsultaMigracion", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/v1", wsdlLocation = "http://localhost/wsdl/SUT_CB_ConsultaMigracionPort.wsdl")
public class SUTCBConsultaMigracionService  extends Service {

    private final static URL SUTCBCONSULTAMIGRACION_WSDL_LOCATION;
    private final static WebServiceException SUTCBCONSULTAMIGRACION_EXCEPTION;
    private final static QName SUTCBCONSULTAMIGRACION_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/v1", "SUT_CB_ConsultaMigracion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/SUT_CB_ConsultaMigracionPort.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUTCBCONSULTAMIGRACION_WSDL_LOCATION = url;
        SUTCBCONSULTAMIGRACION_EXCEPTION = e;
    }

    public SUTCBConsultaMigracionService() {
        super(__getWsdlLocation(), SUTCBCONSULTAMIGRACION_QNAME);
    }

    public SUTCBConsultaMigracionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUTCBCONSULTAMIGRACION_QNAME, features);
    }

    public SUTCBConsultaMigracionService(URL wsdlLocation) {
        super(wsdlLocation, SUTCBCONSULTAMIGRACION_QNAME);
    }

    public SUTCBConsultaMigracionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUTCBCONSULTAMIGRACION_QNAME, features);
    }

    public SUTCBConsultaMigracionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SUTCBConsultaMigracionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SUTCBConsultaMigracion
     */
    @WebEndpoint(name = "SUT_CB_ConsultaMigracionPort")
    public SUTCBConsultaMigracion getSUTCBConsultaMigracionPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/v1", "SUT_CB_ConsultaMigracionPort"), SUTCBConsultaMigracion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SUTCBConsultaMigracion
     */
    @WebEndpoint(name = "SUT_CB_ConsultaMigracionPort")
    public SUTCBConsultaMigracion getSUTCBConsultaMigracionPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/v1", "SUT_CB_ConsultaMigracionPort"), SUTCBConsultaMigracion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUTCBCONSULTAMIGRACION_EXCEPTION!= null) {
            throw SUTCBCONSULTAMIGRACION_EXCEPTION;
        }
        return SUTCBCONSULTAMIGRACION_WSDL_LOCATION;
    }


}
