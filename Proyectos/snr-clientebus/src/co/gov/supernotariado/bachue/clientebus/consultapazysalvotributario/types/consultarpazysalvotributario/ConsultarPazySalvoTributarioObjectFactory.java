
package co.gov.supernotariado.bachue.clientebus.consultapazysalvotributario.types.consultarpazysalvotributario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultapazysalvotributario.consultarpazysalvotributario.v1 package. 
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
public class ConsultarPazySalvoTributarioObjectFactory {

	private static final String CS_NOMBRE_ESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultapazysalvotributario/consultarpazysalvotributario/v1";
    private static final QName CQN_SALIDA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO = new QName(CS_NOMBRE_ESPACIO, "salidaConsultarPazySalvoTributario");
    private static final QName CQN_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO = new QName(CS_NOMBRE_ESPACIO, "entradaConsultarPazySalvoTributario");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CLAVE = new QName(CS_NOMBRE_ESPACIO, "clave");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_DEPARTAMENTO = new QName(CS_NOMBRE_ESPACIO, "codigoDepartamento");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CHIP = new QName(CS_NOMBRE_ESPACIO, "chip");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_REFERENCIA_CATASTRAL = new QName(CS_NOMBRE_ESPACIO, "referenciaCatastral");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_ID_PERSONA = new QName(CS_NOMBRE_ESPACIO, "idpersona");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_IP = new QName(CS_NOMBRE_ESPACIO, "ip");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_DIRECCION = new QName(CS_NOMBRE_ESPACIO, "direccion");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_NUMERO_MATRICULA = new QName(CS_NOMBRE_ESPACIO, "numeroMatricula");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_IMPUESTO = new QName(CS_NOMBRE_ESPACIO, "impuesto");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_PDF = new QName(CS_NOMBRE_ESPACIO, "pdf");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_NOTARIA = new QName(CS_NOMBRE_ESPACIO, "codigoNotaria");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_ENTIDAD = new QName(CS_NOMBRE_ESPACIO, "entidad");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_USUARIO = new QName(CS_NOMBRE_ESPACIO, "usuario");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_MUNICIPIO = new QName(CS_NOMBRE_ESPACIO, "codigoMunicipio");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_PDF_CERTIFICADO = new QName(CS_NOMBRE_ESPACIO, "pdfCertificado");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultapazysalvotributario.consultarpazysalvotributario.v1
     * 
     */
    public ConsultarPazySalvoTributarioObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarPazySalvoTributario }
     * 
     */
    public TipoEntradaConsultarPazySalvoTributario createTipoEntradaConsultarPazySalvoTributario() {
        return new TipoEntradaConsultarPazySalvoTributario();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarPazySalvoTributario }
     * 
     */
    public TipoSalidaConsultarPazySalvoTributario createTipoSalidaConsultarPazySalvoTributario() {
        return new TipoSalidaConsultarPazySalvoTributario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarPazySalvoTributario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "salidaConsultarPazySalvoTributario")
    public JAXBElement<TipoSalidaConsultarPazySalvoTributario> createSalidaConsultarPazySalvoTributario(TipoSalidaConsultarPazySalvoTributario value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO, TipoSalidaConsultarPazySalvoTributario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarPazySalvoTributario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "entradaConsultarPazySalvoTributario")
    public JAXBElement<TipoEntradaConsultarPazySalvoTributario> createEntradaConsultarPazySalvoTributario(TipoEntradaConsultarPazySalvoTributario value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO, TipoEntradaConsultarPazySalvoTributario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "clave", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioClave(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CLAVE, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "codigoDepartamento", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioCodigoDepartamento(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_DEPARTAMENTO, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "chip", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioChip(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CHIP, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "referenciaCatastral", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioReferenciaCatastral(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_REFERENCIA_CATASTRAL, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "idpersona", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioIdpersona(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_ID_PERSONA, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "ip", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioIp(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_IP, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "direccion", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioDireccion(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_DIRECCION, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "numeroMatricula", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioNumeroMatricula(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_NUMERO_MATRICULA, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "impuesto", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioImpuesto(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_IMPUESTO, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "pdf", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioPdf(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_PDF, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "codigoNotaria", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioCodigoNotaria(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_NOTARIA, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "entidad", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioEntidad(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_ENTIDAD, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "usuario", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioUsuario(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_USUARIO, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "codigoMunicipio", scope = TipoEntradaConsultarPazySalvoTributario.class)
    public JAXBElement<String> createTipoEntradaConsultarPazySalvoTributarioCodigoMunicipio(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_CODIGO_MUNICIPIO, String.class, TipoEntradaConsultarPazySalvoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "pdfCertificado", scope = TipoSalidaConsultarPazySalvoTributario.class)
    public JAXBElement<byte[]> createTipoSalidaConsultarPazySalvoTributarioPdfCertificado(byte[] value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO_PDF_CERTIFICADO, byte[].class, TipoSalidaConsultarPazySalvoTributario.class, ((byte[]) value));
    }

}
