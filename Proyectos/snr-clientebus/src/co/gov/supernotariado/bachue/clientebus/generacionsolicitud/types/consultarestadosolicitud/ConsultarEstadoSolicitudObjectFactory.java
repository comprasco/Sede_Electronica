
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.consultarestadosolicitud.v1 package. 
 * <p>An ConsultaActosTurnoObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ConsultarEstadoSolicitudObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_ESTADO_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", "entradaConsultarEstadoSolicitud");
    private static final QName CQN_SALIDA_CONSULTAR_ESTADO_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", "salidaConsultarEstadoSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.consultarestadosolicitud.v1
     * 
     */
    public ConsultarEstadoSolicitudObjectFactory() {
//    	Constructor vacio
    }

    /**
     * Create an instance of {@link Servicio }
     * 
     */
    public Servicio createServicio() {
        return new Servicio();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarEstadoSolicitud }
     * 
     */
    public TipoEntradaConsultarEstadoSolicitud createTipoEntradaConsultarEstadoSolicitud() {
        return new TipoEntradaConsultarEstadoSolicitud();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarEstadoSolicitud }
     * 
     */
    public TipoSalidaConsultarEstadoSolicitud createTipoSalidaConsultarEstadoSolicitud() {
        return new TipoSalidaConsultarEstadoSolicitud();
    }

    /**
     * Create an instance of {@link Servicio.Criterios }
     * 
     */
    public Servicio.Criterios createServicioCriterios() {
        return new Servicio.Criterios();
    }

    /**
     * Create an instance of {@link Criterio }
     * 
     */
    public Criterio createCriterio() {
        return new Criterio();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarEstadoSolicitud.Solicitante }
     * 
     */
    public TipoEntradaConsultarEstadoSolicitud.Solicitante createTipoEntradaConsultarEstadoSolicitudSolicitante() {
        return new TipoEntradaConsultarEstadoSolicitud.Solicitante();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarEstadoSolicitud.Servicios }
     * 
     */
    public TipoEntradaConsultarEstadoSolicitud.Servicios createTipoEntradaConsultarEstadoSolicitudServicios() {
        return new TipoEntradaConsultarEstadoSolicitud.Servicios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarEstadoSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", name = "entradaConsultarEstadoSolicitud")
    public JAXBElement<TipoEntradaConsultarEstadoSolicitud> createEntradaConsultarEstadoSolicitud(TipoEntradaConsultarEstadoSolicitud value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_ESTADO_SOLICITUD, TipoEntradaConsultarEstadoSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarEstadoSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", name = "salidaConsultarEstadoSolicitud")
    public JAXBElement<TipoSalidaConsultarEstadoSolicitud> createSalidaConsultarEstadoSolicitud(TipoSalidaConsultarEstadoSolicitud value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ESTADO_SOLICITUD, TipoSalidaConsultarEstadoSolicitud.class, null, value);
    }

}
