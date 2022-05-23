
package co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.buscarsolicitudes.v1 package. 
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
public class BuscarSolicitudesObjectFactory {

    private static final QName CQN_SALIDA_BUSCAR_SOLICITUDES = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", "salidaBuscarSolicitudes");
    private static final QName CQN_ENTRADA_BUSCAR_SOLICITUDES = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", "entradaBuscarSolicitudes");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.buscarsolicitudes.v1
     * 
     */
    public BuscarSolicitudesObjectFactory() {
    	//Consturctor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaBuscarSolicitudes }
     * 
     */
    public TipoSalidaBuscarSolicitudes createTipoSalidaBuscarSolicitudes() {
        return new TipoSalidaBuscarSolicitudes();
    }

    /**
     * Create an instance of {@link TipoEntradaBuscarSolicitudes }
     * 
     */
    public TipoEntradaBuscarSolicitudes createTipoEntradaBuscarSolicitudes() {
        return new TipoEntradaBuscarSolicitudes();
    }

    /**
     * Create an instance of {@link SolicitantesType }
     * 
     */
    public SolicitantesType createSolicitantesType() {
        return new SolicitantesType();
    }

    /**
     * Create an instance of {@link SolicitanteType }
     * 
     */
    public SolicitanteType createSolicitanteType() {
        return new SolicitanteType();
    }

    /**
     * Create an instance of {@link SolicitudesType }
     * 
     */
    public SolicitudesType createSolicitudesType() {
        return new SolicitudesType();
    }

    /**
     * Create an instance of {@link SolicitudType }
     * 
     */
    public SolicitudType createSolicitudType() {
        return new SolicitudType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaBuscarSolicitudes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", name = "salidaBuscarSolicitudes")
    public JAXBElement<TipoSalidaBuscarSolicitudes> createSalidaBuscarSolicitudes(TipoSalidaBuscarSolicitudes value) {
        return new JAXBElement<>(CQN_SALIDA_BUSCAR_SOLICITUDES, TipoSalidaBuscarSolicitudes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaBuscarSolicitudes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", name = "entradaBuscarSolicitudes")
    public JAXBElement<TipoEntradaBuscarSolicitudes> createEntradaBuscarSolicitudes(TipoEntradaBuscarSolicitudes value) {
        return new JAXBElement<>(CQN_ENTRADA_BUSCAR_SOLICITUDES, TipoEntradaBuscarSolicitudes.class, null, value);
    }

}
