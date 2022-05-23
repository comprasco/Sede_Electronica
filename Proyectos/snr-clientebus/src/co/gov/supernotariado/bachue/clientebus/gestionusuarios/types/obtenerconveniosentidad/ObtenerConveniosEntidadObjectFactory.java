
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerconveniosentidad.v1 package. 
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
public class ObtenerConveniosEntidadObjectFactory {

    private final static QName _SalidaObtenerConveniosEntidad_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", "salidaObtenerConveniosEntidad");
    private final static QName _EntradaObtenerConveniosEntidad_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", "entradaObtenerConveniosEntidad");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerconveniosentidad.v1
     * 
     */
    public ObtenerConveniosEntidadObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerConveniosEntidad }
     * 
     */
    public TipoSalidaObtenerConveniosEntidad createTipoSalidaObtenerConveniosEntidad() {
        return new TipoSalidaObtenerConveniosEntidad();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerConveniosEntidad }
     * 
     */
    public TipoEntradaObtenerConveniosEntidad createTipoEntradaObtenerConveniosEntidad() {
        return new TipoEntradaObtenerConveniosEntidad();
    }

    /**
     * Create an instance of {@link TipoConvenio }
     * 
     */
    public TipoConvenio createTipoConvenio() {
        return new TipoConvenio();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerConveniosEntidad.Convenios }
     * 
     */
    public TipoSalidaObtenerConveniosEntidad.Convenios createTipoSalidaObtenerConveniosEntidadConvenios() {
        return new TipoSalidaObtenerConveniosEntidad.Convenios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerConveniosEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", name = "salidaObtenerConveniosEntidad")
    public JAXBElement<TipoSalidaObtenerConveniosEntidad> createSalidaObtenerConveniosEntidad(TipoSalidaObtenerConveniosEntidad value) {
        return new JAXBElement<TipoSalidaObtenerConveniosEntidad>(_SalidaObtenerConveniosEntidad_QNAME, TipoSalidaObtenerConveniosEntidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerConveniosEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", name = "entradaObtenerConveniosEntidad")
    public JAXBElement<TipoEntradaObtenerConveniosEntidad> createEntradaObtenerConveniosEntidad(TipoEntradaObtenerConveniosEntidad value) {
        return new JAXBElement<TipoEntradaObtenerConveniosEntidad>(_EntradaObtenerConveniosEntidad_QNAME, TipoEntradaObtenerConveniosEntidad.class, null, value);
    }

}
