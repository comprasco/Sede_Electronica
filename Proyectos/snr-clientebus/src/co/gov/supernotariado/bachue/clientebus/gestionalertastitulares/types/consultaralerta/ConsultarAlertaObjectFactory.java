
package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultaralerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.consultaralerta.v1 package. 
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
public class ConsultarAlertaObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1", "entradaConsultarAlerta");
    private static final QName CQN_SALIDA_CONSULTAR_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1", "salidaConsultarAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.consultaralerta.v1
     * 
     */
    public ConsultarAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarAlerta }
     * 
     */
    public TipoSalidaConsultarAlerta createTipoSalidaConsultarAlerta() {
        return new TipoSalidaConsultarAlerta();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarAlerta }
     * 
     */
    public TipoEntradaConsultarAlerta createTipoEntradaConsultarAlerta() {
        return new TipoEntradaConsultarAlerta();
    }

    /**
     * Create an instance of {@link AlertasType }
     * 
     */
    public AlertasType createAlertasType() {
        return new AlertasType();
    }

    /**
     * Create an instance of {@link AlertaType }
     * 
     */
    public AlertaType createAlertaType() {
        return new AlertaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1", name = "entradaConsultarAlerta")
    public JAXBElement<TipoEntradaConsultarAlerta> createEntradaConsultarAlerta(TipoEntradaConsultarAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_ALERTA, TipoEntradaConsultarAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultaralerta/v1", name = "salidaConsultarAlerta")
    public JAXBElement<TipoSalidaConsultarAlerta> createSalidaConsultarAlerta(TipoSalidaConsultarAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ALERTA, TipoSalidaConsultarAlerta.class, null, value);
    }

}
