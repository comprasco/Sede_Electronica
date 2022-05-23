
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.operacion.SBBEERRRMatriculas;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SBB_EE_RRRMatriculasQSService", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/RRRMatriculas/v1", wsdlLocation = "http://localhost/wsdl/RRRMatriculas.wsdl")
public class SBBEERRRMatriculasService
    extends Service
{

    private final static URL SBBEERRRMATRICULASQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SBBEERRRMATRICULASQSSERVICE_EXCEPTION;
    private final static QName SBBEERRRMATRICULASQSSERVICE_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ee/RRRMatriculas/v1", "SBB_EE_RRRMatriculasQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/RRRMatriculas.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SBBEERRRMATRICULASQSSERVICE_WSDL_LOCATION = url;
        SBBEERRRMATRICULASQSSERVICE_EXCEPTION = e;
    }

    public SBBEERRRMatriculasService() {
        super(__getWsdlLocation(), SBBEERRRMATRICULASQSSERVICE_QNAME);
    }

    public SBBEERRRMatriculasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SBBEERRRMATRICULASQSSERVICE_QNAME, features);
    }

    public SBBEERRRMatriculasService(URL wsdlLocation) {
        super(wsdlLocation, SBBEERRRMATRICULASQSSERVICE_QNAME);
    }

    public SBBEERRRMatriculasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SBBEERRRMATRICULASQSSERVICE_QNAME, features);
    }

    public SBBEERRRMatriculasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SBBEERRRMatriculasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SBBEERRRMatriculas
     */
    @WebEndpoint(name = "SBB_EE_RRRMatriculasQSPort")
    public SBBEERRRMatriculas getSBBEERRRMatriculasQSPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/RRRMatriculas/v1", "SBB_EE_RRRMatriculasQSPort"), SBBEERRRMatriculas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SBBEERRRMatriculas
     */
    @WebEndpoint(name = "SBB_EE_RRRMatriculasQSPort")
    public SBBEERRRMatriculas getSBBEERRRMatriculasQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/RRRMatriculas/v1", "SBB_EE_RRRMatriculasQSPort"), SBBEERRRMatriculas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SBBEERRRMATRICULASQSSERVICE_EXCEPTION!= null) {
            throw SBBEERRRMATRICULASQSSERVICE_EXCEPTION;
        }
        return SBBEERRRMATRICULASQSSERVICE_WSDL_LOCATION;
    }

}
