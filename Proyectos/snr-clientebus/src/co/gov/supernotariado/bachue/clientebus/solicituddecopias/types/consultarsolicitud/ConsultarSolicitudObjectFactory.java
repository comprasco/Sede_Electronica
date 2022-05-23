
package co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.consultarsolicitud;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecopias.consultarsolicitud.v1 package. 
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
public class ConsultarSolicitudObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/consultarsolicitud/v1", "salidaConsultarSolicitud");
    private static final QName CQN_ENTRADA_CONSULTAR_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/consultarsolicitud/v1", "entradaConsultarSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecopias.consultarsolicitud.v1
     * 
     */
    public ConsultarSolicitudObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarSolicitud }
     * 
     */
    public TipoSalidaConsultarSolicitud createTipoSalidaConsultarSolicitud() {
        return new TipoSalidaConsultarSolicitud();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarSolicitud }
     * 
     */
    public TipoEntradaConsultarSolicitud createTipoEntradaConsultarSolicitud() {
        return new TipoEntradaConsultarSolicitud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/consultarsolicitud/v1", name = "salidaConsultarSolicitud")
    public JAXBElement<TipoSalidaConsultarSolicitud> createSalidaConsultarSolicitud(TipoSalidaConsultarSolicitud value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_SOLICITUD, TipoSalidaConsultarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/consultarsolicitud/v1", name = "entradaConsultarSolicitud")
    public JAXBElement<TipoEntradaConsultarSolicitud> createEntradaConsultarSolicitud(TipoEntradaConsultarSolicitud value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_SOLICITUD, TipoEntradaConsultarSolicitud.class, null, value);
    }

}
