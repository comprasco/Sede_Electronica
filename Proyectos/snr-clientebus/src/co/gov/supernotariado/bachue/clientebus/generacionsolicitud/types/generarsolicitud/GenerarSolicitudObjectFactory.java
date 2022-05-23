
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.generarsolicitud.v1 package. 
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
public class GenerarSolicitudObjectFactory {

    private static final QName CQN_ENTRADA_GENERAR_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", "entradaGenerarSolicitud");
    private static final QName CQN_SALIDA_GENERAR_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", "salidaGenerarSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.generarsolicitud.v1
     * 
     */
    public GenerarSolicitudObjectFactory() {
    	//Constructor vacio
    
    }

    /**
     * Create an instance of {@link Servicio }
     * 
     */
    public Servicio createServicio() {
        return new Servicio();
    }

    /**
     * Create an instance of {@link TipoEntradaGenerarSolicitud }
     * 
     */
    public TipoEntradaGenerarSolicitud createTipoEntradaGenerarSolicitud() {
        return new TipoEntradaGenerarSolicitud();
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
     * Create an instance of {@link TipoSalidaGenerarSolicitud }
     * 
     */
    public TipoSalidaGenerarSolicitud createTipoSalidaGenerarSolicitud() {
        return new TipoSalidaGenerarSolicitud();
    }

    /**
     * Create an instance of {@link TipoEntradaGenerarSolicitud.Solicitante }
     * 
     */
    public TipoEntradaGenerarSolicitud.Solicitante createTipoEntradaGenerarSolicitudSolicitante() {
        return new TipoEntradaGenerarSolicitud.Solicitante();
    }

    /**
     * Create an instance of {@link TipoEntradaGenerarSolicitud.Servicios }
     * 
     */
    public TipoEntradaGenerarSolicitud.Servicios createTipoEntradaGenerarSolicitudServicios() {
        return new TipoEntradaGenerarSolicitud.Servicios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaGenerarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", name = "entradaGenerarSolicitud")
    public JAXBElement<TipoEntradaGenerarSolicitud> createEntradaGenerarSolicitud(TipoEntradaGenerarSolicitud value) {
        return new JAXBElement<>(CQN_ENTRADA_GENERAR_SOLICITUD, TipoEntradaGenerarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaGenerarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", name = "salidaGenerarSolicitud")
    public JAXBElement<TipoSalidaGenerarSolicitud> createSalidaGenerarSolicitud(TipoSalidaGenerarSolicitud value) {
        return new JAXBElement<>(CQN_SALIDA_GENERAR_SOLICITUD, TipoSalidaGenerarSolicitud.class, null, value);
    }

}
