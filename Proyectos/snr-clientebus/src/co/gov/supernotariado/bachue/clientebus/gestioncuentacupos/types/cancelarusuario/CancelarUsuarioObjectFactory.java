
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.cancelarusuario.v1 package. 
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
public class CancelarUsuarioObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1";
    private static final QName CQN_ENTRADA_CANCELAR_USUARIO = new QName(CS_QNAME, "entradaCancelarUsuario");
    private static final QName CQN_SALIDA_CANCELAR_USUARIO = new QName(CS_QNAME, "salidaCancelarUsuario");
    private static final QName CQN_TIPO_USUARIO_CNUI_SEGUNDO_NOMBRE_USUARIO = new QName(CS_QNAME, "segundoNombreUsuario");
    private static final QName CQN_TIPO_USUARIO_CNUI_SEGUNDO_APELLIDO_USUARIO = new QName(CS_QNAME, "segundoApellidoUsuario");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.cancelarusuario.v1
     * 
     */
    public CancelarUsuarioObjectFactory() {
    	// Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaCancelarUsuario }
     * 
     */
    public TipoSalidaCancelarUsuario createTipoSalidaCancelarUsuario() {
        return new TipoSalidaCancelarUsuario();
    }

    /**
     * Create an instance of {@link TipoEntradaCancelarUsuario }
     * 
     */
    public TipoEntradaCancelarUsuario createTipoEntradaCancelarUsuario() {
        return new TipoEntradaCancelarUsuario();
    }

    /**
     * Create an instance of {@link TipoAdminCNUI }
     * 
     */
    public TipoAdminCNUI createTipoAdminCNUI() {
        return new TipoAdminCNUI();
    }

    /**
     * Create an instance of {@link TipoUsuarioCNUI }
     * 
     */
    public TipoUsuarioCNUI createTipoUsuarioCNUI() {
        return new TipoUsuarioCNUI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaCancelarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", name = "entradaCancelarUsuario")
    public JAXBElement<TipoEntradaCancelarUsuario> createEntradaCancelarUsuario(TipoEntradaCancelarUsuario value) {
        return new JAXBElement<>(CQN_ENTRADA_CANCELAR_USUARIO, TipoEntradaCancelarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaCancelarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", name = "salidaCancelarUsuario")
    public JAXBElement<TipoSalidaCancelarUsuario> createSalidaCancelarUsuario(TipoSalidaCancelarUsuario value) {
        return new JAXBElement<>(CQN_SALIDA_CANCELAR_USUARIO, TipoSalidaCancelarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", name = "segundoNombreUsuario", scope = TipoUsuarioCNUI.class)
    public JAXBElement<String> createTipoUsuarioCNUISegundoNombreUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CNUI_SEGUNDO_NOMBRE_USUARIO, String.class, TipoUsuarioCNUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/cancelarusuario/v1", name = "segundoApellidoUsuario", scope = TipoUsuarioCNUI.class)
    public JAXBElement<String> createTipoUsuarioCNUISegundoApellidoUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CNUI_SEGUNDO_APELLIDO_USUARIO, String.class, TipoUsuarioCNUI.class, value);
    }

}
