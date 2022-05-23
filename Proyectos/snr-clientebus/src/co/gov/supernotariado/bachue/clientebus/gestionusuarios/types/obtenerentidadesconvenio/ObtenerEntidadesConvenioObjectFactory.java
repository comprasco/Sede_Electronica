
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerentidadesconvenio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerentidadesconvenio.v1 package. 
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
public class ObtenerEntidadesConvenioObjectFactory {

    private final static QName _SalidaObtenerEntidadesConvenio_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerentidadesconvenio/v1", "salidaObtenerEntidadesConvenio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerentidadesconvenio.v1
     * 
     */
    public ObtenerEntidadesConvenioObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerEntidadesConvenio }
     * 
     */
    public TipoSalidaObtenerEntidadesConvenio createTipoSalidaObtenerEntidadesConvenio() {
        return new TipoSalidaObtenerEntidadesConvenio();
    }

    /**
     * Create an instance of {@link EntradaObtenerEntidadesConvenio }
     * 
     */
    public EntradaObtenerEntidadesConvenio createEntradaObtenerEntidadesConvenio() {
        return new EntradaObtenerEntidadesConvenio();
    }

    /**
     * Create an instance of {@link TipoEntidad }
     * 
     */
    public TipoEntidad createTipoEntidad() {
        return new TipoEntidad();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerEntidadesConvenio.Entidades }
     * 
     */
    public TipoSalidaObtenerEntidadesConvenio.Entidades createTipoSalidaObtenerEntidadesConvenioEntidades() {
        return new TipoSalidaObtenerEntidadesConvenio.Entidades();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerEntidadesConvenio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerentidadesconvenio/v1", name = "salidaObtenerEntidadesConvenio")
    public JAXBElement<TipoSalidaObtenerEntidadesConvenio> createSalidaObtenerEntidadesConvenio(TipoSalidaObtenerEntidadesConvenio value) {
        return new JAXBElement<TipoSalidaObtenerEntidadesConvenio>(_SalidaObtenerEntidadesConvenio_QNAME, TipoSalidaObtenerEntidadesConvenio.class, null, value);
    }

}
