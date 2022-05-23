
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.pagarcuentacupo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.pagarcuentacupo.v1 package. 
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
public class PagarCuentaCupoObjectFactory {

    private static final QName CQN_SALIDA_PAGAR_CUENTA_CUPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/pagarcuentacupo/v1", "salidaPagarCuentaCupo");
    private static final QName CQN_ENTRADA_PAGAR_CUENTA_CUPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/pagarcuentacupo/v1", "entradaPagarCuentaCupo");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.pagarcuentacupo.v1
     * 
     */
    public PagarCuentaCupoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaPagarCuentaCupo }
     * 
     */
    public TipoEntradaPagarCuentaCupo createTipoEntradaPagarCuentaCupo() {
        return new TipoEntradaPagarCuentaCupo();
    }

    /**
     * Create an instance of {@link TipoSalidaPagarCuentaCupo }
     * 
     */
    public TipoSalidaPagarCuentaCupo createTipoSalidaPagarCuentaCupo() {
        return new TipoSalidaPagarCuentaCupo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaPagarCuentaCupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/pagarcuentacupo/v1", name = "salidaPagarCuentaCupo")
    public JAXBElement<TipoSalidaPagarCuentaCupo> createSalidaPagarCuentaCupo(TipoSalidaPagarCuentaCupo value) {
        return new JAXBElement<>(CQN_SALIDA_PAGAR_CUENTA_CUPO, TipoSalidaPagarCuentaCupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaPagarCuentaCupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/pagarcuentacupo/v1", name = "entradaPagarCuentaCupo")
    public JAXBElement<TipoEntradaPagarCuentaCupo> createEntradaPagarCuentaCupo(TipoEntradaPagarCuentaCupo value) {
        return new JAXBElement<>(CQN_ENTRADA_PAGAR_CUENTA_CUPO, TipoEntradaPagarCuentaCupo.class, null, value);
    }

}
