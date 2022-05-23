
package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.inactivaralerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.inactivaralerta.v1 package. 
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
public class InactivarAlertaObjectFactory {

    private static final QName CQN_ENTRADA_INACTIVAR_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/inactivaralerta/v1", "entradaInactivarAlerta");
    private static final QName CQN_SALIDA_INACTIVAR_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/inactivaralerta/v1", "salidaInactivarAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.inactivaralerta.v1
     * 
     */
    public InactivarAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaInactivarAlerta }
     * 
     */
    public TipoEntradaInactivarAlerta createTipoEntradaInactivarAlerta() {
        return new TipoEntradaInactivarAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaInactivarAlerta }
     * 
     */
    public TipoSalidaInactivarAlerta createTipoSalidaInactivarAlerta() {
        return new TipoSalidaInactivarAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaInactivarAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/inactivaralerta/v1", name = "entradaInactivarAlerta")
    public JAXBElement<TipoEntradaInactivarAlerta> createEntradaInactivarAlerta(TipoEntradaInactivarAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_INACTIVAR_ALERTA, TipoEntradaInactivarAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaInactivarAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/inactivaralerta/v1", name = "salidaInactivarAlerta")
    public JAXBElement<TipoSalidaInactivarAlerta> createSalidaInactivarAlerta(TipoSalidaInactivarAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_INACTIVAR_ALERTA, TipoSalidaInactivarAlerta.class, null, value);
    }

}
