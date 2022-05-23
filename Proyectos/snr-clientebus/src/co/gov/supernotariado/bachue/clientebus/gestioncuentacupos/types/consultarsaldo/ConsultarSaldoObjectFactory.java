
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarsaldo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarsaldo.v1 package. 
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
public class ConsultarSaldoObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_SALDO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarsaldo/v1", "entradaConsultarSaldo");
    private static final QName CQN_SALIDA_CONSULTAR_SALDO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarsaldo/v1", "salidaConsultarSaldo");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarsaldo.v1
     * 
     */
    public ConsultarSaldoObjectFactory() {
    	// Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarSaldo }
     * 
     */
    public TipoEntradaConsultarSaldo createTipoEntradaConsultarSaldo() {
        return new TipoEntradaConsultarSaldo();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarSaldo }
     * 
     */
    public TipoSalidaConsultarSaldo createTipoSalidaConsultarSaldo() {
        return new TipoSalidaConsultarSaldo();
    }

    /**
     * Create an instance of {@link TipoUsuarioCSI }
     * 
     */
    public TipoUsuarioCSI createTipoUsuarioCSI() {
        return new TipoUsuarioCSI();
    }

    /**
     * Create an instance of {@link TipoAdminCSI }
     * 
     */
    public TipoAdminCSI createTipoAdminCSI() {
        return new TipoAdminCSI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarsaldo/v1", name = "entradaConsultarSaldo")
    public JAXBElement<TipoEntradaConsultarSaldo> createEntradaConsultarSaldo(TipoEntradaConsultarSaldo value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_SALDO, TipoEntradaConsultarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarsaldo/v1", name = "salidaConsultarSaldo")
    public JAXBElement<TipoSalidaConsultarSaldo> createSalidaConsultarSaldo(TipoSalidaConsultarSaldo value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_SALDO, TipoSalidaConsultarSaldo.class, null, value);
    }

}
