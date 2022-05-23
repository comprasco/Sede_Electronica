
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultaridcuentacupo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultaridcuentacupo.v1 package. 
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
public class ConsultarIdCuentaCupoObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_ID_CUENTA_CUPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultaridcuentacupo/v1", "salidaConsultarIDCuentaCupo");
    private static final QName CQN_ENTRADA_CONSULTAR_ID_CUENTA_CUPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultaridcuentacupo/v1", "entradaConsultarIDCuentaCupo");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultaridcuentacupo.v1
     * 
     */
    public ConsultarIdCuentaCupoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarIDCuentaCupo }
     * 
     */
    public TipoEntradaConsultarIDCuentaCupo createTipoEntradaConsultarIDCuentaCupo() {
        return new TipoEntradaConsultarIDCuentaCupo();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarIDCuentaCupo }
     * 
     */
    public TipoSalidaConsultarIDCuentaCupo createTipoSalidaConsultarIDCuentaCupo() {
        return new TipoSalidaConsultarIDCuentaCupo();
    }

    /**
     * Create an instance of {@link TipoAdminCICCI }
     * 
     */
    public TipoAdminCICCI createTipoAdminCICCI() {
        return new TipoAdminCICCI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarIDCuentaCupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultaridcuentacupo/v1", name = "salidaConsultarIDCuentaCupo")
    public JAXBElement<TipoSalidaConsultarIDCuentaCupo> createSalidaConsultarIDCuentaCupo(TipoSalidaConsultarIDCuentaCupo value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ID_CUENTA_CUPO, TipoSalidaConsultarIDCuentaCupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarIDCuentaCupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultaridcuentacupo/v1", name = "entradaConsultarIDCuentaCupo")
    public JAXBElement<TipoEntradaConsultarIDCuentaCupo> createEntradaConsultarIDCuentaCupo(TipoEntradaConsultarIDCuentaCupo value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_ID_CUENTA_CUPO, TipoEntradaConsultarIDCuentaCupo.class, null, value);
    }

}
