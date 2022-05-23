
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarusuarios.v1 package. 
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
public class ConsultarUsuariosObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1";
    private static final QName CQN_ENTRADA_CONSULTAR_USUARIOS = new QName(CS_QNAME, "entradaConsultarUsuarios");
    private static final QName CQN_SALIDA_CONSULTAR_USUARIOS = new QName(CS_QNAME, "salidaConsultarUsuarios");
    private static final QName CQN_TIPO_USUARIO_CUSO_FECHA_CANCELACION = new QName(CS_QNAME, "fechaCancelacion");
    private static final QName CQN_TIPO_USUARIO_CUSO_SEGUNDO_NOMBRE_USUARIO = new QName(CS_QNAME, "segundoNombreUsuario");
    private static final QName CQN_TIPO_USUARIO_CUSO_FECHA_CREACION = new QName(CS_QNAME, "fechaCreacion");
    private static final QName CQN_TIPO_USUARIO_CUSO_SEGUNDO_APELLIDO_USUARIO = new QName(CS_QNAME, "segundoApellidoUsuario");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarusuarios.v1
     * 
     */
    public ConsultarUsuariosObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarUsuarios }
     * 
     */
    public TipoSalidaConsultarUsuarios createTipoSalidaConsultarUsuarios() {
        return new TipoSalidaConsultarUsuarios();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarUsuarios }
     * 
     */
    public TipoEntradaConsultarUsuarios createTipoEntradaConsultarUsuarios() {
        return new TipoEntradaConsultarUsuarios();
    }

    /**
     * Create an instance of {@link TipoAdminCUSI }
     * 
     */
    public TipoAdminCUSI createTipoAdminCUSI() {
        return new TipoAdminCUSI();
    }

    /**
     * Create an instance of {@link TipoUsuarioCUSO }
     * 
     */
    public TipoUsuarioCUSO createTipoUsuarioCUSO() {
        return new TipoUsuarioCUSO();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarUsuarios.Usuarios }
     * 
     */
    public TipoSalidaConsultarUsuarios.Usuarios createTipoSalidaConsultarUsuariosUsuarios() {
        return new TipoSalidaConsultarUsuarios.Usuarios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "entradaConsultarUsuarios")
    public JAXBElement<TipoEntradaConsultarUsuarios> createEntradaConsultarUsuarios(TipoEntradaConsultarUsuarios value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_USUARIOS, TipoEntradaConsultarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "salidaConsultarUsuarios")
    public JAXBElement<TipoSalidaConsultarUsuarios> createSalidaConsultarUsuarios(TipoSalidaConsultarUsuarios value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_USUARIOS, TipoSalidaConsultarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "fechaCancelacion", scope = TipoUsuarioCUSO.class)
    public JAXBElement<XMLGregorianCalendar> createTipoUsuarioCUSOFechaCancelacion(XMLGregorianCalendar value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUSO_FECHA_CANCELACION, XMLGregorianCalendar.class, TipoUsuarioCUSO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "segundoNombreUsuario", scope = TipoUsuarioCUSO.class)
    public JAXBElement<String> createTipoUsuarioCUSOSegundoNombreUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUSO_SEGUNDO_NOMBRE_USUARIO, String.class, TipoUsuarioCUSO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "fechaCreacion", scope = TipoUsuarioCUSO.class)
    public JAXBElement<XMLGregorianCalendar> createTipoUsuarioCUSOFechaCreacion(XMLGregorianCalendar value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUSO_FECHA_CREACION, XMLGregorianCalendar.class, TipoUsuarioCUSO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarusuarios/v1", name = "segundoApellidoUsuario", scope = TipoUsuarioCUSO.class)
    public JAXBElement<String> createTipoUsuarioCUSOSegundoApellidoUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_USUARIO_CUSO_SEGUNDO_APELLIDO_USUARIO, String.class, TipoUsuarioCUSO.class, value);
    }

}
