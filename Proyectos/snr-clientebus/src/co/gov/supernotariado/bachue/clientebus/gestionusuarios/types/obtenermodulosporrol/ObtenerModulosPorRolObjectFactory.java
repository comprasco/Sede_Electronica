
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenermodulosporrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenermodulosporrol.v1 package. 
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
public class ObtenerModulosPorRolObjectFactory {

    private final static QName _EntradaObtenerModulosPorRol_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", "entradaObtenerModulosPorRol");
    private final static QName _SalidaObtenerModulosPorRol_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", "salidaObtenerModulosPorRol");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenermodulosporrol.v1
     * 
     */
    public ObtenerModulosPorRolObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerModulosPorRol }
     * 
     */
    public TipoEntradaObtenerModulosPorRol createTipoEntradaObtenerModulosPorRol() {
        return new TipoEntradaObtenerModulosPorRol();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerModulosPorRol }
     * 
     */
    public TipoSalidaObtenerModulosPorRol createTipoSalidaObtenerModulosPorRol() {
        return new TipoSalidaObtenerModulosPorRol();
    }

    /**
     * Create an instance of {@link TipoModulo }
     * 
     */
    public TipoModulo createTipoModulo() {
        return new TipoModulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerModulosPorRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", name = "entradaObtenerModulosPorRol")
    public JAXBElement<TipoEntradaObtenerModulosPorRol> createEntradaObtenerModulosPorRol(TipoEntradaObtenerModulosPorRol value) {
        return new JAXBElement<TipoEntradaObtenerModulosPorRol>(_EntradaObtenerModulosPorRol_QNAME, TipoEntradaObtenerModulosPorRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerModulosPorRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", name = "salidaObtenerModulosPorRol")
    public JAXBElement<TipoSalidaObtenerModulosPorRol> createSalidaObtenerModulosPorRol(TipoSalidaObtenerModulosPorRol value) {
        return new JAXBElement<TipoSalidaObtenerModulosPorRol>(_SalidaObtenerModulosPorRol_QNAME, TipoSalidaObtenerModulosPorRol.class, null, value);
    }

}
