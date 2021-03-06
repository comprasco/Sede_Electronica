
package co.gov.supernotariado.bachue.clientebus.servicios;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.operacion.SDIEEHistorialNotificaciones;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDI_EE_HistorialNotificaciones", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/historialNotificaciones/v1", wsdlLocation = "http://23.96.125.163:30585/?WSDL")
public class SDIEEHistorialNotificacionesService
    extends Service
{

    private final static URL SDIEEHISTORIALNOTIFICACIONES_WSDL_LOCATION;
    private final static WebServiceException SDIEEHISTORIALNOTIFICACIONES_EXCEPTION;
    private final static QName SDIEEHISTORIALNOTIFICACIONES_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/ee/historialNotificaciones/v1", "SDI_EE_HistorialNotificaciones");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://23.96.125.163:30585/?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDIEEHISTORIALNOTIFICACIONES_WSDL_LOCATION = url;
        SDIEEHISTORIALNOTIFICACIONES_EXCEPTION = e;
    }

    public SDIEEHistorialNotificacionesService() {
        super(__getWsdlLocation(), SDIEEHISTORIALNOTIFICACIONES_QNAME);
    }

    public SDIEEHistorialNotificacionesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDIEEHISTORIALNOTIFICACIONES_QNAME, features);
    }

    public SDIEEHistorialNotificacionesService(URL wsdlLocation) {
        super(wsdlLocation, SDIEEHISTORIALNOTIFICACIONES_QNAME);
    }

    public SDIEEHistorialNotificacionesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDIEEHISTORIALNOTIFICACIONES_QNAME, features);
    }

    public SDIEEHistorialNotificacionesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDIEEHistorialNotificacionesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDIEEHistorialNotificaciones
     */
    @WebEndpoint(name = "SDI_EE_HistorialNotificacionesPort")
    public SDIEEHistorialNotificaciones getSDIEEHistorialNotificacionesPort() {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/historialNotificaciones/v1", "SDI_EE_HistorialNotificacionesPort"), SDIEEHistorialNotificaciones.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDIEEHistorialNotificaciones
     */
    @WebEndpoint(name = "SDI_EE_HistorialNotificacionesPort")
    public SDIEEHistorialNotificaciones getSDIEEHistorialNotificacionesPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.supernotariado.gov.co/services/bachue/ee/historialNotificaciones/v1", "SDI_EE_HistorialNotificacionesPort"), SDIEEHistorialNotificaciones.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDIEEHISTORIALNOTIFICACIONES_EXCEPTION!= null) {
            throw SDIEEHISTORIALNOTIFICACIONES_EXCEPTION;
        }
        return SDIEEHISTORIALNOTIFICACIONES_WSDL_LOCATION;
    }

}
