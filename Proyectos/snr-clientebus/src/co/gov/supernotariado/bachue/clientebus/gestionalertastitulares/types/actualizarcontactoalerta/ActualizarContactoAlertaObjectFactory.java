
package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.actualizarcontactoalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.actualizarcontactoalerta.v1 package. 
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
public class ActualizarContactoAlertaObjectFactory {

    private static final QName CQN_ENTRADA_ACTUALIZAR_CONTACTO_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/actualizarcontactoalerta/v1", "entradaActualizarContactoAlerta");
    private static final QName CQN_SALIDA_ACTUALIZAR_CONTACTO_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/actualizarcontactoalerta/v1", "salidaActualizarContactoAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.actualizarcontactoalerta.v1
     * 
     */
    public ActualizarContactoAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaActualizarContactoAlerta }
     * 
     */
    public TipoEntradaActualizarContactoAlerta createTipoEntradaActualizarContactoAlerta() {
        return new TipoEntradaActualizarContactoAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaActualizarContactoAlerta }
     * 
     */
    public TipoSalidaActualizarContactoAlerta createTipoSalidaActualizarContactoAlerta() {
        return new TipoSalidaActualizarContactoAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaActualizarContactoAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/actualizarcontactoalerta/v1", name = "entradaActualizarContactoAlerta")
    public JAXBElement<TipoEntradaActualizarContactoAlerta> createEntradaActualizarContactoAlerta(TipoEntradaActualizarContactoAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_ACTUALIZAR_CONTACTO_ALERTA, TipoEntradaActualizarContactoAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaActualizarContactoAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/actualizarcontactoalerta/v1", name = "salidaActualizarContactoAlerta")
    public JAXBElement<TipoSalidaActualizarContactoAlerta> createSalidaActualizarContactoAlerta(TipoSalidaActualizarContactoAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_ACTUALIZAR_CONTACTO_ALERTA, TipoSalidaActualizarContactoAlerta.class, null, value);
    }

}
