package co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.co.busquedadocumentos.consultar.v1 package. 
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
public class ConsultarObjectFactory {

	private static final String CS_ESPACIO_NOMBRE = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/consultar/v1";
    private final static QName CQN_SALIDA_CONSULTAR = new QName(CS_ESPACIO_NOMBRE, "salidaConsultar");
    private final static QName CQN_ENTRADA_CONSULTAR = new QName(CS_ESPACIO_NOMBRE, "entradaConsultar");
    private final static QName CQN_TIPO_DOCUMENTO_FECHA_VIGENCIA = new QName(CS_ESPACIO_NOMBRE, "fechaVigencia");
    private final static QName CQN_TIPO_DOCUMENTO_MUNICIPIO = new QName(CS_ESPACIO_NOMBRE, "municipio");
    private final static QName CQN_TIPO_DOCUMENTO_PROCESO = new QName(CS_ESPACIO_NOMBRE, "proceso");
    private final static QName CQN_TIPO_DOCUMENTO_TURNO_VINCULADO = new QName(CS_ESPACIO_NOMBRE, "turnoVinculado");
    private final static QName CQN_TIPO_DOCUMENTO_DOCUMENTO_REGISTRADO = new QName(CS_ESPACIO_NOMBRE, "documentoRegistrado");
    private final static QName CQN_TIPO_DOCUMENTO_ANOTACION = new QName(CS_ESPACIO_NOMBRE, "anotacion");
    private final static QName CQN_TIPO_DOCUMENTO_PAIS = new QName(CS_ESPACIO_NOMBRE, "pais");
    private final static QName CQN_TIPO_DOCUMENTO_MATRICULA = new QName(CS_ESPACIO_NOMBRE, "matricula");
    private final static QName CQN_TIPO_DOCUMENTO_ENTIDAD_ORIGEN = new QName(CS_ESPACIO_NOMBRE, "entidadOrigen");
    private final static QName CQN_TIPO_DOCUMENTO_DEPARTAMENTO = new QName(CS_ESPACIO_NOMBRE, "departamento");
    private final static QName CQN_TIPO_DOCUMENTO_COD_ORIP = new QName(CS_ESPACIO_NOMBRE, "codOrip");
    private final static QName CQN_TIPO_DOCUMENTO_FECHA_PUBLICACION = new QName(CS_ESPACIO_NOMBRE, "fechaPublicacion");
    private final static QName CQN_TIPO_DOCUMENTO_URL_VISOR = new QName(CS_ESPACIO_NOMBRE, "urlVisor");
    private final static QName CQN_TIPO_DOCUMENTO_ORIP = new QName(CS_ESPACIO_NOMBRE, "orip");
    private final static QName CQN_TIPO_DOCUMENTO_NUMERO_PAGINA = new QName(CS_ESPACIO_NOMBRE, "numeroPagina");
    private final static QName CQN_TIPO_DOCUMENTO_TIPO_DOCUMENTAL = new QName(CS_ESPACIO_NOMBRE, "tipoDocumental");
    private final static QName CQN_TIPO_DOCUMENTO_TURNO = new QName(CS_ESPACIO_NOMBRE, "turno");
    private final static QName CQN_TIPO_DOCUMENTO_IDENTIFICACION_INTERVINIENTE = new QName(CS_ESPACIO_NOMBRE, "identificacionInterviniente");
    private final static QName CQN_TIPO_DOCUMENTO_ACTO_NATURALEZA_JURIDICA = new QName(CS_ESPACIO_NOMBRE, "actoNaturalezaJuridica");
    private final static QName CQN_TIPO_DOCUMENTO_TIPO_OFICINA = new QName(CS_ESPACIO_NOMBRE, "tipoOficina");
    private final static QName CQN_TIPO_DOCUMENTO_NIR = new QName(CS_ESPACIO_NOMBRE, "nir");
    private final static QName CQN_TIPO_DOCUMENTO_FECHA_DOCUMENTO = new QName(CS_ESPACIO_NOMBRE, "fechaDocumento");
    private final static QName CQN_TIPO_DOCUMENTO_NOMBRE_INTERVINIENTE = new QName(CS_ESPACIO_NOMBRE, "nombreInterviniente");
    private final static QName CQN_TIPO_DOCUMENTO_NIR_VINCULADO = new QName(CS_ESPACIO_NOMBRE, "nirVinculado");
    private final static QName CQN_TIPO_DOCUMENTO_NUMERO_DOCUMENTO = new QName(CS_ESPACIO_NOMBRE, "numeroDocumento");
    private final static QName CQN_TIPO_DOCUMENTO_NUMERO_FOLIOS = new QName(CS_ESPACIO_NOMBRE, "numeroFolios");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.co.busquedadocumentos.consultar.v1
     * 
     */
    public ConsultarObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultar }
     * 
     */
    public TipoEntradaConsultar createTipoEntradaConsultar() {
        return new TipoEntradaConsultar();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultar }
     * 
     */
    public TipoSalidaConsultar createTipoSalidaConsultar() {
        return new TipoSalidaConsultar();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link TipoParametro }
     * 
     */
    public TipoParametro createTipoParametro() {
        return new TipoParametro();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultar.Parametros }
     * 
     */
    public TipoEntradaConsultar.Parametros createTipoEntradaConsultarParametros() {
        return new TipoEntradaConsultar.Parametros();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultar.Documentos }
     * 
     */
    public TipoSalidaConsultar.Documentos createTipoSalidaConsultarDocumentos() {
        return new TipoSalidaConsultar.Documentos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "salidaConsultar")
    public JAXBElement<TipoSalidaConsultar> createSalidaConsultar(TipoSalidaConsultar value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR, TipoSalidaConsultar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "entradaConsultar")
    public JAXBElement<TipoEntradaConsultar> createEntradaConsultar(TipoEntradaConsultar value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR, TipoEntradaConsultar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "fechaVigencia", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoFechaVigencia(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_FECHA_VIGENCIA, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "municipio", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoMunicipio(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_MUNICIPIO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "proceso", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoProceso(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_PROCESO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "turnoVinculado", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoTurnoVinculado(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_TURNO_VINCULADO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "documentoRegistrado", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoDocumentoRegistrado(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_DOCUMENTO_REGISTRADO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "anotacion", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoAnotacion(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_ANOTACION, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "pais", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoPais(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_PAIS, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "matricula", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoMatricula(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_MATRICULA, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "entidadOrigen", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoEntidadOrigen(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_ENTIDAD_ORIGEN, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "departamento", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoDepartamento(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_DEPARTAMENTO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "codOrip", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoCodOrip(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_COD_ORIP, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "fechaPublicacion", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoFechaPublicacion(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_FECHA_PUBLICACION, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "urlVisor", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoUrlVisor(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_URL_VISOR, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "orip", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoOrip(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_ORIP, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "numeroPagina", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNumeroPagina(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NUMERO_PAGINA, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "tipoDocumental", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoTipoDocumental(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_TIPO_DOCUMENTAL, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "turno", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoTurno(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_TURNO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "identificacionInterviniente", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoIdentificacionInterviniente(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_IDENTIFICACION_INTERVINIENTE, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "actoNaturalezaJuridica", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoActoNaturalezaJuridica(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_ACTO_NATURALEZA_JURIDICA, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "tipoOficina", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoTipoOficina(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_TIPO_OFICINA, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "nir", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNir(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NIR, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "fechaDocumento", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoFechaDocumento(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_FECHA_DOCUMENTO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "nombreInterviniente", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNombreInterviniente(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NOMBRE_INTERVINIENTE, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "nirVinculado", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNirVinculado(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NIR_VINCULADO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "numeroDocumento", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNumeroDocumento(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NUMERO_DOCUMENTO, String.class, TipoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = CS_ESPACIO_NOMBRE, name = "numeroFolios", scope = TipoDocumento.class)
    public JAXBElement<String> createTipoDocumentoNumeroFolios(String value) {
        return new JAXBElement<>(CQN_TIPO_DOCUMENTO_NUMERO_FOLIOS, String.class, TipoDocumento.class, value);
    }

}
