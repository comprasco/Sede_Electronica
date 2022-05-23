
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardocumentoalerta.v1 package. 
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
public class ConsultarDocumentoAlertaObjectFactory {

    private static final QName CQN_SAlIDA_CONSULTAR_DOCUMENTO_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", "salidaConsultarDocumentoAlerta");
    private static final QName CQN_ENTRADA_CONSULTAR_DOCUMENTO_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", "entradaConsultarDocumentoAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardocumentoalerta.v1
     * 
     */
    public ConsultarDocumentoAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarDocumentoAlerta }
     * 
     */
    public TipoEntradaConsultarDocumentoAlerta createTipoEntradaConsultarDocumentoAlerta() {
        return new TipoEntradaConsultarDocumentoAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDocumentoAlerta }
     * 
     */
    public TipoSalidaConsultarDocumentoAlerta createTipoSalidaConsultarDocumentoAlerta() {
        return new TipoSalidaConsultarDocumentoAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarDocumentoAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", name = "salidaConsultarDocumentoAlerta")
    public JAXBElement<TipoSalidaConsultarDocumentoAlerta> createSalidaConsultarDocumentoAlerta(TipoSalidaConsultarDocumentoAlerta value) {
        return new JAXBElement<>(CQN_SAlIDA_CONSULTAR_DOCUMENTO_ALERTA, TipoSalidaConsultarDocumentoAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarDocumentoAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDocumentoAlerta/v1", name = "entradaConsultarDocumentoAlerta")
    public JAXBElement<TipoEntradaConsultarDocumentoAlerta> createEntradaConsultarDocumentoAlerta(TipoEntradaConsultarDocumentoAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_DOCUMENTO_ALERTA, TipoEntradaConsultarDocumentoAlerta.class, null, value);
    }

}
