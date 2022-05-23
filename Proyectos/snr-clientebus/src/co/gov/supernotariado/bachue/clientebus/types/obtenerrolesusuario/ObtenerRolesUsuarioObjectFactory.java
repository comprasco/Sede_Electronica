
package co.gov.supernotariado.bachue.clientebus.types.obtenerrolesusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolesusuario.v1 package. 
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
public class ObtenerRolesUsuarioObjectFactory {

    private final static QName _EntradaObtenerRolesUsuario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", "entradaObtenerRolesUsuario");
    private final static QName _SalidaObtenerRolesUsuario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", "salidaObtenerRolesUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolesusuario.v1
     * 
     */
    public ObtenerRolesUsuarioObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRolesUsuario }
     * 
     */
    public TipoSalidaObtenerRolesUsuario createTipoSalidaObtenerRolesUsuario() {
        return new TipoSalidaObtenerRolesUsuario();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerRolesUsuario }
     * 
     */
    public TipoEntradaObtenerRolesUsuario createTipoEntradaObtenerRolesUsuario() {
        return new TipoEntradaObtenerRolesUsuario();
    }

    /**
     * Create an instance of {@link RolTypeORU }
     * 
     */
    public RolTypeORU createRolTypeORU() {
        return new RolTypeORU();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRolesUsuario.Roles }
     * 
     */
    public TipoSalidaObtenerRolesUsuario.Roles createTipoSalidaObtenerRolesUsuarioRoles() {
        return new TipoSalidaObtenerRolesUsuario.Roles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerRolesUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", name = "entradaObtenerRolesUsuario")
    public JAXBElement<TipoEntradaObtenerRolesUsuario> createEntradaObtenerRolesUsuario(TipoEntradaObtenerRolesUsuario value) {
        return new JAXBElement<TipoEntradaObtenerRolesUsuario>(_EntradaObtenerRolesUsuario_QNAME, TipoEntradaObtenerRolesUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerRolesUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", name = "salidaObtenerRolesUsuario")
    public JAXBElement<TipoSalidaObtenerRolesUsuario> createSalidaObtenerRolesUsuario(TipoSalidaObtenerRolesUsuario value) {
        return new JAXBElement<TipoSalidaObtenerRolesUsuario>(_SalidaObtenerRolesUsuario_QNAME, TipoSalidaObtenerRolesUsuario.class, null, value);
    }

}
