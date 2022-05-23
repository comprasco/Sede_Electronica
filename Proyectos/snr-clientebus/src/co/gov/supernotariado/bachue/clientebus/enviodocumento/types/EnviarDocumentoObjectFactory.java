
package co.gov.supernotariado.bachue.clientebus.enviodocumento.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.co.enviodocumentos.enviardocumento.v1 package. 
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
public class EnviarDocumentoObjectFactory {

    private static final QName CQN_ENTRADA_ENVIAR_DOCUMENTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/co/enviodocumentos/enviardocumento/v1", "entradaEnviarDocumento");
    private static final QName CQN_SALIDA_ENVIAR_DOCUMENTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/co/enviodocumentos/enviardocumento/v1", "salidaEnviarDocumento");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.co.enviodocumentos.enviardocumento.v1
     * 
     */
    public EnviarDocumentoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaEnviarDocumento }
     * 
     */
    public TipoEntradaEnviarDocumento createTipoEntradaEnviarDocumento() {
        return new TipoEntradaEnviarDocumento();
    }

    /**
     * Create an instance of {@link TipoSalidaEnviarDocumento }
     * 
     */
    public TipoSalidaEnviarDocumento createTipoSalidaEnviarDocumento() {
        return new TipoSalidaEnviarDocumento();
    }

    /**
     * Create an instance of {@link TipoParametro }
     * 
     */
    public TipoParametro createTipoParametro() {
        return new TipoParametro();
    }

    /**
     * Create an instance of {@link TipoEntradaEnviarDocumento.Parametros }
     * 
     */
    public TipoEntradaEnviarDocumento.Parametros createTipoEntradaEnviarDocumentoParametros() {
        return new TipoEntradaEnviarDocumento.Parametros();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaEnviarDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/enviodocumentos/enviardocumento/v1", name = "entradaEnviarDocumento")
    public JAXBElement<TipoEntradaEnviarDocumento> createEntradaEnviarDocumento(TipoEntradaEnviarDocumento value) {
        return new JAXBElement<>(CQN_ENTRADA_ENVIAR_DOCUMENTO, TipoEntradaEnviarDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaEnviarDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/enviodocumentos/enviardocumento/v1", name = "salidaEnviarDocumento")
    public JAXBElement<TipoSalidaEnviarDocumento> createSalidaEnviarDocumento(TipoSalidaEnviarDocumento value) {
        return new JAXBElement<>(CQN_SALIDA_ENVIAR_DOCUMENTO, TipoSalidaEnviarDocumento.class, null, value);
    }

}
