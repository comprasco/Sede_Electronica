
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionorip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionorip.v1 package. 
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
public class ConsultarMigracionOripObjectFactory {

    private final static QName _EntradaConsultaMigracionORIP_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionORIP/v1", "entradaConsultaMigracionORIP");
    private final static QName _SalidaConsultaMigracionORIP_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionORIP/v1", "salidaConsultaMigracionORIP");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionorip.v1
     * 
     */
    public ConsultarMigracionOripObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaMigracionORIP }
     * 
     */
    public TipoEntradaConsultaMigracionORIP createTipoEntradaConsultaMigracionORIP() {
        return new TipoEntradaConsultaMigracionORIP();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaMigracionORIP }
     * 
     */
    public TipoSalidaConsultaMigracionORIP createTipoSalidaConsultaMigracionORIP() {
        return new TipoSalidaConsultaMigracionORIP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaMigracionORIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionORIP/v1", name = "entradaConsultaMigracionORIP")
    public JAXBElement<TipoEntradaConsultaMigracionORIP> createEntradaConsultaMigracionORIP(TipoEntradaConsultaMigracionORIP value) {
        return new JAXBElement<TipoEntradaConsultaMigracionORIP>(_EntradaConsultaMigracionORIP_QNAME, TipoEntradaConsultaMigracionORIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaMigracionORIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionORIP/v1", name = "salidaConsultaMigracionORIP")
    public JAXBElement<TipoSalidaConsultaMigracionORIP> createSalidaConsultaMigracionORIP(TipoSalidaConsultaMigracionORIP value) {
        return new JAXBElement<TipoSalidaConsultaMigracionORIP>(_SalidaConsultaMigracionORIP_QNAME, TipoSalidaConsultaMigracionORIP.class, null, value);
    }

}
