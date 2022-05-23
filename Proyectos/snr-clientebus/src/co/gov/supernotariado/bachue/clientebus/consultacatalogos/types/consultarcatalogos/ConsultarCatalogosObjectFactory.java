
package co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultacatalogos.consultarcatalogos.v1 package. 
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
public class ConsultarCatalogosObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultacatalogos/consultarcatalogos/v1";
    private final static QName CQN_ENTRADA_CONSULTAR_CATALOGOS = new QName(CS_QNAME, "entradaConsultarCatalogos");
    private final static QName CQN_SALIDA_CONSULTAR_CATALOGOS = new QName(CS_QNAME, "salidaConsultarCatalogos");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultacatalogos.consultarcatalogos.v1
     * 
     */
    public ConsultarCatalogosObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarCatalogos }
     * 
     */
    public TipoSalidaConsultarCatalogos createTipoSalidaConsultarCatalogos() {
        return new TipoSalidaConsultarCatalogos();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarCatalogos }
     * 
     */
    public TipoEntradaConsultarCatalogos createTipoEntradaConsultarCatalogos() {
        return new TipoEntradaConsultarCatalogos();
    }

    /**
     * Create an instance of {@link CatalogoType }
     * 
     */
    public CatalogoType createCatalogoType() {
        return new CatalogoType();
    }

    /**
     * Create an instance of {@link Catalogo }
     * 
     */
    public Catalogo createCatalogo() {
        return new Catalogo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarCatalogos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_QNAME, name = "entradaConsultarCatalogos")
    public JAXBElement<TipoEntradaConsultarCatalogos> createEntradaConsultarCatalogos(TipoEntradaConsultarCatalogos value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_CATALOGOS, TipoEntradaConsultarCatalogos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarCatalogos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_QNAME, name = "salidaConsultarCatalogos")
    public JAXBElement<TipoSalidaConsultarCatalogos> createSalidaConsultarCatalogos(TipoSalidaConsultarCatalogos value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_CATALOGOS, TipoSalidaConsultarCatalogos.class, null, value);
    }

}
