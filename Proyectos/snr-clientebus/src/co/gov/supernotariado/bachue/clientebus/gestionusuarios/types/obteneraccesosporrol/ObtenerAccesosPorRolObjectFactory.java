
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obteneraccesosporrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obteneraccesosporrol.v1 package. 
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
public class ObtenerAccesosPorRolObjectFactory {

    private final static QName _EntradaObtenerAccesosPorRol_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", "entradaObtenerAccesosPorRol");
    private final static QName _SalidaObtenerAccesosPorRol_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", "salidaObtenerAccesosPorRol");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obteneraccesosporrol.v1
     * 
     */
    public ObtenerAccesosPorRolObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerAccesosPorRol }
     * 
     */
    public TipoEntradaObtenerAccesosPorRol createTipoEntradaObtenerAccesosPorRol() {
        return new TipoEntradaObtenerAccesosPorRol();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerAccesosPorRol }
     * 
     */
    public TipoSalidaObtenerAccesosPorRol createTipoSalidaObtenerAccesosPorRol() {
        return new TipoSalidaObtenerAccesosPorRol();
    }

    /**
     * Create an instance of {@link TipoAcceso }
     * 
     */
    public TipoAcceso createTipoAcceso() {
        return new TipoAcceso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerAccesosPorRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", name = "entradaObtenerAccesosPorRol")
    public JAXBElement<TipoEntradaObtenerAccesosPorRol> createEntradaObtenerAccesosPorRol(TipoEntradaObtenerAccesosPorRol value) {
        return new JAXBElement<TipoEntradaObtenerAccesosPorRol>(_EntradaObtenerAccesosPorRol_QNAME, TipoEntradaObtenerAccesosPorRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerAccesosPorRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", name = "salidaObtenerAccesosPorRol")
    public JAXBElement<TipoSalidaObtenerAccesosPorRol> createSalidaObtenerAccesosPorRol(TipoSalidaObtenerAccesosPorRol value) {
        return new JAXBElement<TipoSalidaObtenerAccesosPorRol>(_SalidaObtenerAccesosPorRol_QNAME, TipoSalidaObtenerAccesosPorRol.class, null, value);
    }

}
