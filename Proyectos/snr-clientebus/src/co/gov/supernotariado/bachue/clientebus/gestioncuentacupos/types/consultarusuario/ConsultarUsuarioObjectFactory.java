
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarusuario.v1 package. 
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
public class ConsultarUsuarioObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1";
    private static final QName CQN_SALIDA_CONSULTAR_USUARIO = new QName(CS_QNAME, "salidaConsultarUsuario");
    private static final QName CQN_ENTRADA_CONSULTAR_USUARIO = new QName(CS_QNAME, "entradaConsultarUsuario");
    private static final QName CQN_TIPO_USUARIO_CUO_FECHA_CANCELACION = new QName(CS_QNAME, "fechaCancelacion");
    private static final QName CQN_TIPO_USUARIO_CUO_SEGUNDO_NOMBRE_USUARIO = new QName(CS_QNAME, "segundoNombreUsuario");
    private static final QName CQN_TIPO_USUARIO_CUO_FECHA_CREACION = new QName(CS_QNAME, "fechaCreacion");
    private static final QName CQN_TIPO_USUARIO_CUO_SEGUNDO_APELLIDO_USUARIO = new QName(CS_QNAME, "segundoApellidoUsuario");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarusuario.v1
     * 
     */
    public ConsultarUsuarioObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarUsuario }
     * 
     */
    public TipoEntradaConsultarUsuario createTipoEntradaConsultarUsuario() {
        return new TipoEntradaConsultarUsuario();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarUsuario }
     * 
     */
    public TipoSalidaConsultarUsuario createTipoSalidaConsultarUsuario() {
        return new TipoSalidaConsultarUsuario();
    }

    /**
     * Create an instance of {@link TipoUsuarioCUI }
     * 
     */
    public TipoUsuarioCUI createTipoUsuarioCUI() {
        return new TipoUsuarioCUI();
    }

    /**
     * Create an instance of {@link TipoUsuarioCUO }
     * 
     */
    public TipoUsuarioCUO createTipoUsuarioCUO() {
        return new TipoUsuarioCUO();
    }

    /**
     * Create an instance of {@link TipoAdminCUI }
     * 
     */
    public TipoAdminCUI createTipoAdminCUI() {
        return new TipoAdminCUI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "salidaConsultarUsuario")
    public JAXBElement<TipoSalidaConsultarUsuario> createSalidaConsultarUsuario(TipoSalidaConsultarUsuario value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_USUARIO, TipoSalidaConsultarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "entradaConsultarUsuario")
    public JAXBElement<TipoEntradaConsultarUsuario> createEntradaConsultarUsuario(TipoEntradaConsultarUsuario value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_USUARIO, TipoEntradaConsultarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "fechaCancelacion", scope = TipoUsuarioCUO.class)
    public JAXBElement<XMLGregorianCalendar> createTipoUsuarioCUOFechaCancelacion(XMLGregorianCalendar value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUO_FECHA_CANCELACION, XMLGregorianCalendar.class, TipoUsuarioCUO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "segundoNombreUsuario", scope = TipoUsuarioCUO.class)
    public JAXBElement<String> createTipoUsuarioCUOSegundoNombreUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUO_SEGUNDO_NOMBRE_USUARIO, String.class, TipoUsuarioCUO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "fechaCreacion", scope = TipoUsuarioCUO.class)
    public JAXBElement<XMLGregorianCalendar> createTipoUsuarioCUOFechaCreacion(XMLGregorianCalendar value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUO_FECHA_CREACION, XMLGregorianCalendar.class, TipoUsuarioCUO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuario/v1", name = "segundoApellidoUsuario", scope = TipoUsuarioCUO.class)
    public JAXBElement<String> createTipoUsuarioCUOSegundoApellidoUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUO_SEGUNDO_APELLIDO_USUARIO, String.class, TipoUsuarioCUO.class, value);
    }

}
