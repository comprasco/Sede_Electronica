
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerusuariosrolorip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerusuariosrolorip.v1 package. 
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
public class ObtenerUsuariosRolOripObjectFactory {

    private final static QName _EntradaObtenerUsuariosRolOrip_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", "entradaObtenerUsuariosRolOrip");
    private final static QName _SalidaObtenerUsuariosRolOrip_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", "salidaObtenerUsuariosRolOrip");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerusuariosrolorip.v1
     * 
     */
    public ObtenerUsuariosRolOripObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerUsuariosRolOrip }
     * 
     */
    public TipoSalidaObtenerUsuariosRolOrip createTipoSalidaObtenerUsuariosRolOrip() {
        return new TipoSalidaObtenerUsuariosRolOrip();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerUsuariosRolOrip }
     * 
     */
    public TipoEntradaObtenerUsuariosRolOrip createTipoEntradaObtenerUsuariosRolOrip() {
        return new TipoEntradaObtenerUsuariosRolOrip();
    }

    /**
     * Create an instance of {@link TipoUsuario }
     * 
     */
    public TipoUsuario createTipoUsuario() {
        return new TipoUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerUsuariosRolOrip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", name = "entradaObtenerUsuariosRolOrip")
    public JAXBElement<TipoEntradaObtenerUsuariosRolOrip> createEntradaObtenerUsuariosRolOrip(TipoEntradaObtenerUsuariosRolOrip value) {
        return new JAXBElement<TipoEntradaObtenerUsuariosRolOrip>(_EntradaObtenerUsuariosRolOrip_QNAME, TipoEntradaObtenerUsuariosRolOrip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerUsuariosRolOrip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", name = "salidaObtenerUsuariosRolOrip")
    public JAXBElement<TipoSalidaObtenerUsuariosRolOrip> createSalidaObtenerUsuariosRolOrip(TipoSalidaObtenerUsuariosRolOrip value) {
        return new JAXBElement<TipoSalidaObtenerUsuariosRolOrip>(_SalidaObtenerUsuariosRolOrip_QNAME, TipoSalidaObtenerUsuariosRolOrip.class, null, value);
    }

}
