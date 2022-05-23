
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionpredio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionpredio.v1 package. 
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
public class ConsultarMigracionPredioObjectFactory {

    private final static QName _SalidaConsultaMigracionPredio_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionPredio/v1", "salidaConsultaMigracionPredio");
    private final static QName _EntradaConsultaMigracionPredio_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionPredio/v1", "entradaConsultaMigracionPredio");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionpredio.v1
     * 
     */
    public ConsultarMigracionPredioObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaMigracionPredio }
     * 
     */
    public TipoSalidaConsultaMigracionPredio createTipoSalidaConsultaMigracionPredio() {
        return new TipoSalidaConsultaMigracionPredio();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaMigracionPredio }
     * 
     */
    public TipoEntradaConsultaMigracionPredio createTipoEntradaConsultaMigracionPredio() {
        return new TipoEntradaConsultaMigracionPredio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaMigracionPredio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionPredio/v1", name = "salidaConsultaMigracionPredio")
    public JAXBElement<TipoSalidaConsultaMigracionPredio> createSalidaConsultaMigracionPredio(TipoSalidaConsultaMigracionPredio value) {
        return new JAXBElement<TipoSalidaConsultaMigracionPredio>(_SalidaConsultaMigracionPredio_QNAME, TipoSalidaConsultaMigracionPredio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaMigracionPredio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionPredio/v1", name = "entradaConsultaMigracionPredio")
    public JAXBElement<TipoEntradaConsultaMigracionPredio> createEntradaConsultaMigracionPredio(TipoEntradaConsultaMigracionPredio value) {
        return new JAXBElement<TipoEntradaConsultaMigracionPredio>(_EntradaConsultaMigracionPredio_QNAME, TipoEntradaConsultaMigracionPredio.class, null, value);
    }

}
