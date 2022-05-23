
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.inscribirusuario.v1 package. 
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
public class InscribirUsuarioObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/inscribirusuario/v1";
    private static final QName CQN_ENTRADA_INSCRIBIR_USUARIO = new QName(CS_QNAME, "entradaInscribirUsuario");
    private static final QName CQN_SALIDA_INSCRIBIR_USUARIO = new QName(CS_QNAME, "salidaInscribirUsuario");
    private static final QName CQN_TIPO_USUARIO_IUI_SEGUNDO_APELLIDO_USUARIO = new QName(CS_QNAME, "segundoApellidoUsuario");
    private static final QName CQN_TIPO_USUARIO_IUI_SEGUNDO_NOMBRE_USUARIO = new QName(CS_QNAME, "segundoNombreUsuario");
    

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.inscribirusuario.v1
     * 
     */
    public InscribirUsuarioObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaInscribirUsuario }
     * 
     */
    public TipoSalidaInscribirUsuario createTipoSalidaInscribirUsuario() {
        return new TipoSalidaInscribirUsuario();
    }

    /**
     * Create an instance of {@link TipoEntradaInscribirUsuario }
     * 
     */
    public TipoEntradaInscribirUsuario createTipoEntradaInscribirUsuario() {
        return new TipoEntradaInscribirUsuario();
    }

    /**
     * Create an instance of {@link TipoAdminIUI }
     * 
     */
    public TipoAdminIUI createTipoAdminIUI() {
        return new TipoAdminIUI();
    }

    /**
     * Create an instance of {@link TipoUsuarioIUI }
     * 
     */
    public TipoUsuarioIUI createTipoUsuarioIUI() {
        return new TipoUsuarioIUI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaInscribirUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/inscribirusuario/v1", name = "entradaInscribirUsuario")
    public JAXBElement<TipoEntradaInscribirUsuario> createEntradaInscribirUsuario(TipoEntradaInscribirUsuario value) {
        return new JAXBElement<>(CQN_ENTRADA_INSCRIBIR_USUARIO, TipoEntradaInscribirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaInscribirUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/inscribirusuario/v1", name = "salidaInscribirUsuario")
    public JAXBElement<TipoSalidaInscribirUsuario> createSalidaInscribirUsuario(TipoSalidaInscribirUsuario value) {
        return new JAXBElement<>(CQN_SALIDA_INSCRIBIR_USUARIO, TipoSalidaInscribirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/inscribirusuario/v1", name = "segundoApellidoUsuario", scope = TipoUsuarioIUI.class)
    public JAXBElement<String> createTipoUsuarioIUISegundoApellidoUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_IUI_SEGUNDO_APELLIDO_USUARIO, String.class, TipoUsuarioIUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/inscribirusuario/v1", name = "segundoNombreUsuario", scope = TipoUsuarioIUI.class)
    public JAXBElement<String> createTipoUsuarioIUISegundoNombreUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_IUI_SEGUNDO_NOMBRE_USUARIO, String.class, TipoUsuarioIUI.class, value);
    }

}
