package co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecopias.ingresosolicitud.v1 package. 
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
public class IngresoSolicitudObjectFactory {

    private static final QName CQN_SALIDA_INGRESO_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/ingresosolicitud/v1", "salidaIngresoSolicitud");
    private static final QName CQN_ENTRADA_INGRESO_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/ingresosolicitud/v1", "entradaIngresoSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecopias.ingresosolicitud.v1
     * 
     */
    public IngresoSolicitudObjectFactory() {
    	//constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaIngresoSolicitud }
     * 
     */
    public TipoEntradaIngresoSolicitud createTipoEntradaIngresoSolicitud() {
        return new TipoEntradaIngresoSolicitud();
    }

    /**
     * Create an instance of {@link TipoEntradaIngresoSolicitud.ListaDocumentos }
     * 
     */
    public TipoEntradaIngresoSolicitud.ListaDocumentos createTipoEntradaIngresoSolicitudListaDocumentos() {
        return new TipoEntradaIngresoSolicitud.ListaDocumentos();
    }

    /**
     * Create an instance of {@link TipoSalidaIngresoSolicitud }
     * 
     */
    public TipoSalidaIngresoSolicitud createTipoSalidaIngresoSolicitud() {
        return new TipoSalidaIngresoSolicitud();
    }

    /**
     * Create an instance of {@link TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD }
     * 
     */
    public TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD createTipoEntradaIngresoSolicitudListaDocumentosDocumentoSGD() {
        return new TipoEntradaIngresoSolicitud.ListaDocumentos.DocumentoSGD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaIngresoSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/ingresosolicitud/v1", name = "salidaIngresoSolicitud")
    public JAXBElement<TipoSalidaIngresoSolicitud> createSalidaIngresoSolicitud(TipoSalidaIngresoSolicitud value) {
        return new JAXBElement<>(CQN_SALIDA_INGRESO_SOLICITUD, TipoSalidaIngresoSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaIngresoSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecopias/ingresosolicitud/v1", name = "entradaIngresoSolicitud")
    public JAXBElement<TipoEntradaIngresoSolicitud> createEntradaIngresoSolicitud(TipoEntradaIngresoSolicitud value) {
        return new JAXBElement<>(CQN_ENTRADA_INGRESO_SOLICITUD, TipoEntradaIngresoSolicitud.class, null, value);
    }

}
