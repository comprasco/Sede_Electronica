
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.registrarusuario.v1 package. 
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
public class RegistrarUsuarioObjectFactory {

    private final static QName _EntradaRegistrarUsuario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", "entradaRegistrarUsuario");
    private final static QName _SalidaRegistrarUsuario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", "salidaRegistrarUsuario");
    private final static QName _TipoEntradaRegistrarUsuarioCodigoConvenio_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", "codigoConvenio");
    private final static QName _TipoEntradaRegistrarUsuarioCorreoElectronicoCorporativo_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", "correoElectronicoCorporativo");
    private final static QName _TipoEntradaRegistrarUsuarioIdEntidadExterna_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", "idEntidadExterna");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.registrarusuario.v1
     * 
     */
    public RegistrarUsuarioObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoEntradaRegistrarUsuario }
     * 
     */
    public TipoEntradaRegistrarUsuario createTipoEntradaRegistrarUsuario() {
        return new TipoEntradaRegistrarUsuario();
    }

    /**
     * Create an instance of {@link TipoSalidaRegistrarUsuario }
     * 
     */
    public TipoSalidaRegistrarUsuario createTipoSalidaRegistrarUsuario() {
        return new TipoSalidaRegistrarUsuario();
    }

    /**
     * Create an instance of {@link TipoEntradaRegistrarUsuario.CodigosRoles }
     * 
     */
    public TipoEntradaRegistrarUsuario.CodigosRoles createTipoEntradaRegistrarUsuarioCodigosRoles() {
        return new TipoEntradaRegistrarUsuario.CodigosRoles();
    }

    /**
     * Create an instance of {@link TipoEntradaRegistrarUsuario.CodigosORIPs }
     * 
     */
    public TipoEntradaRegistrarUsuario.CodigosORIPs createTipoEntradaRegistrarUsuarioCodigosORIPs() {
        return new TipoEntradaRegistrarUsuario.CodigosORIPs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaRegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", name = "entradaRegistrarUsuario")
    public JAXBElement<TipoEntradaRegistrarUsuario> createEntradaRegistrarUsuario(TipoEntradaRegistrarUsuario value) {
        return new JAXBElement<TipoEntradaRegistrarUsuario>(_EntradaRegistrarUsuario_QNAME, TipoEntradaRegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaRegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", name = "salidaRegistrarUsuario")
    public JAXBElement<TipoSalidaRegistrarUsuario> createSalidaRegistrarUsuario(TipoSalidaRegistrarUsuario value) {
        return new JAXBElement<TipoSalidaRegistrarUsuario>(_SalidaRegistrarUsuario_QNAME, TipoSalidaRegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", name = "codigoConvenio", scope = TipoEntradaRegistrarUsuario.class)
    public JAXBElement<String> createTipoEntradaRegistrarUsuarioCodigoConvenio(String value) {
        return new JAXBElement<String>(_TipoEntradaRegistrarUsuarioCodigoConvenio_QNAME, String.class, TipoEntradaRegistrarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", name = "correoElectronicoCorporativo", scope = TipoEntradaRegistrarUsuario.class)
    public JAXBElement<String> createTipoEntradaRegistrarUsuarioCorreoElectronicoCorporativo(String value) {
        return new JAXBElement<String>(_TipoEntradaRegistrarUsuarioCorreoElectronicoCorporativo_QNAME, String.class, TipoEntradaRegistrarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", name = "idEntidadExterna", scope = TipoEntradaRegistrarUsuario.class)
    public JAXBElement<String> createTipoEntradaRegistrarUsuarioIdEntidadExterna(String value) {
        return new JAXBElement<String>(_TipoEntradaRegistrarUsuarioIdEntidadExterna_QNAME, String.class, TipoEntradaRegistrarUsuario.class, value);
    }

}
