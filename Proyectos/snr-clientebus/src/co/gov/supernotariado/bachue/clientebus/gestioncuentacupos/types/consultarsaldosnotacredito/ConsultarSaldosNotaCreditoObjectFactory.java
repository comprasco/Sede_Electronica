
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldosnotacredito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarsaldosnotacredito.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
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
public class ConsultarSaldosNotaCreditoObjectFactory {

    private final static QName _EntradaConsultarSaldosNotaCredito_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarSaldosNotaCredito/v1", "entradaConsultarSaldosNotaCredito");
    private final static QName _SalidaConsultarSaldosNotaCredito_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarSaldosNotaCredito/v1", "salidaConsultarSaldosNotaCredito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarsaldosnotacredito.v1
     * 
     */
    public ConsultarSaldosNotaCreditoObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarSaldosNotaCredito }
     * 
     */
    public TipoSalidaConsultarSaldosNotaCredito createTipoSalidaConsultarSaldosNotaCredito() {
        return new TipoSalidaConsultarSaldosNotaCredito();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarSaldosNotaCredito.NotasCreditos }
     * 
     */
    public TipoSalidaConsultarSaldosNotaCredito.NotasCreditos createTipoSalidaConsultarSaldosNotaCreditoNotasCreditos() {
        return new TipoSalidaConsultarSaldosNotaCredito.NotasCreditos();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarSaldosNotaCredito }
     * 
     */
    public TipoEntradaConsultarSaldosNotaCredito createTipoEntradaConsultarSaldosNotaCredito() {
        return new TipoEntradaConsultarSaldosNotaCredito();
    }

    /**
     * Create an instance of {@link TipoAdminCSI }
     * 
     */
    public TipoAdminCSI createTipoAdminCSI() {
        return new TipoAdminCSI();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarSaldosNotaCredito.NotasCreditos.NotaCredito }
     * 
     */
    public TipoSalidaConsultarSaldosNotaCredito.NotasCreditos.NotaCredito createTipoSalidaConsultarSaldosNotaCreditoNotasCreditosNotaCredito() {
        return new TipoSalidaConsultarSaldosNotaCredito.NotasCreditos.NotaCredito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarSaldosNotaCredito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarSaldosNotaCredito/v1", name = "entradaConsultarSaldosNotaCredito")
    public JAXBElement<TipoEntradaConsultarSaldosNotaCredito> createEntradaConsultarSaldosNotaCredito(TipoEntradaConsultarSaldosNotaCredito value) {
        return new JAXBElement<TipoEntradaConsultarSaldosNotaCredito>(_EntradaConsultarSaldosNotaCredito_QNAME, TipoEntradaConsultarSaldosNotaCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarSaldosNotaCredito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarSaldosNotaCredito/v1", name = "salidaConsultarSaldosNotaCredito")
    public JAXBElement<TipoSalidaConsultarSaldosNotaCredito> createSalidaConsultarSaldosNotaCredito(TipoSalidaConsultarSaldosNotaCredito value) {
        return new JAXBElement<TipoSalidaConsultarSaldosNotaCredito>(_SalidaConsultarSaldosNotaCredito_QNAME, TipoSalidaConsultarSaldosNotaCredito.class, null, value);
    }

}
