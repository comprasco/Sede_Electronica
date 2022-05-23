package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.generarliquidacion.v2 package. 
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
public class GenerarLiquidacionObjectFactory {

	private static final String CS_NOMBREESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2";
    private static final QName CQN_SALIDA_GENERAR_LIQUIDACION = new QName(CS_NOMBREESPACIO, "salidaGenerarLiquidacion");
    private static final QName CQN_ENTRADA_GENERAR_LIQUIDACION = new QName(CS_NOMBREESPACIO, "entradaGenerarLiquidacion");
    private static final QName CQN_TIPO_SALIDA_GENERAR_LIQUIDACION_DESCRIPCION_MENSAJE = new QName(CS_NOMBREESPACIO, "descripcionMensaje");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_SEGUNDO_APELLIDO_SOLICITANTE = new QName(CS_NOMBREESPACIO, "segundoApellidoSolicitante");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_PRIMER_NOMBRE_SOLICITANTE = new QName(CS_NOMBREESPACIO, "primerNombreSolicitante");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_RAZON_SOCIAL = new QName(CS_NOMBREESPACIO, "razonSocial");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_PRIMER_APELLIDO_SOLICITANTE = new QName(CS_NOMBREESPACIO, "primerApellidoSolicitante");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_ORIP_SOLICITUD = new QName(CS_NOMBREESPACIO, "oripSolicitud");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_SEGUNDO_NOMBRE_SOLICITANTE = new QName(CS_NOMBREESPACIO, "segundoNombreSolicitante");
    private static final QName CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_CODIGO_CONVENIO = new QName(CS_NOMBREESPACIO, "codigoConvenio");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.generarliquidacion.v2
     * 
     */
    public GenerarLiquidacionObjectFactory() {
    	//Contructor vacio
    }

    /**
     * Create an instance of {@link TipoServicioGLI }
     * 
     */
    public TipoServicioGLI createTipoServicioGLI() {
        return new TipoServicioGLI();
    }

    /**
     * Create an instance of {@link TipoEntradaGenerarLiquidacion }
     * 
     */
    public TipoEntradaGenerarLiquidacion createTipoEntradaGenerarLiquidacion() {
        return new TipoEntradaGenerarLiquidacion();
    }

    /**
     * Create an instance of {@link TipoSalidaGenerarLiquidacion }
     * 
     */
    public TipoSalidaGenerarLiquidacion createTipoSalidaGenerarLiquidacion() {
        return new TipoSalidaGenerarLiquidacion();
    }

    /**
     * Create an instance of {@link TipoServicioGLO }
     * 
     */
    public TipoServicioGLO createTipoServicioGLO() {
        return new TipoServicioGLO();
    }

    /**
     * Create an instance of {@link TipoCriterioGLI }
     * 
     */
    public TipoCriterioGLI createTipoCriterioGLI() {
        return new TipoCriterioGLI();
    }

    /**
     * Create an instance of {@link TipoServicioGLI.Criterios }
     * 
     */
    public TipoServicioGLI.Criterios createTipoServicioGLICriterios() {
        return new TipoServicioGLI.Criterios();
    }

    /**
     * Create an instance of {@link TipoEntradaGenerarLiquidacion.Servicios }
     * 
     */
    public TipoEntradaGenerarLiquidacion.Servicios createTipoEntradaGenerarLiquidacionServicios() {
        return new TipoEntradaGenerarLiquidacion.Servicios();
    }

    /**
     * Create an instance of {@link TipoSalidaGenerarLiquidacion.ServiciosLiquidados }
     * 
     */
    public TipoSalidaGenerarLiquidacion.ServiciosLiquidados createTipoSalidaGenerarLiquidacionServiciosLiquidados() {
        return new TipoSalidaGenerarLiquidacion.ServiciosLiquidados();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaGenerarLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "salidaGenerarLiquidacion")
    public JAXBElement<TipoSalidaGenerarLiquidacion> createSalidaGenerarLiquidacion(TipoSalidaGenerarLiquidacion value) {
        return new JAXBElement<>(CQN_SALIDA_GENERAR_LIQUIDACION, TipoSalidaGenerarLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaGenerarLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "entradaGenerarLiquidacion")
    public JAXBElement<TipoEntradaGenerarLiquidacion> createEntradaGenerarLiquidacion(TipoEntradaGenerarLiquidacion value) {
        return new JAXBElement<>(CQN_ENTRADA_GENERAR_LIQUIDACION, TipoEntradaGenerarLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "descripcionMensaje", scope = TipoSalidaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoSalidaGenerarLiquidacionDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_GENERAR_LIQUIDACION_DESCRIPCION_MENSAJE, String.class, TipoSalidaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "segundoApellidoSolicitante", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionSegundoApellidoSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_SEGUNDO_APELLIDO_SOLICITANTE, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "primerNombreSolicitante", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionPrimerNombreSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_PRIMER_NOMBRE_SOLICITANTE, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "razonSocial", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionRazonSocial(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_RAZON_SOCIAL, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "primerApellidoSolicitante", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionPrimerApellidoSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_PRIMER_APELLIDO_SOLICITANTE, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "oripSolicitud", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionOripSolicitud(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_ORIP_SOLICITUD, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "segundoNombreSolicitante", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionSegundoNombreSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_SEGUNDO_NOMBRE_SOLICITANTE, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/generarliquidacion/v2", name = "codigoConvenio", scope = TipoEntradaGenerarLiquidacion.class)
    public JAXBElement<String> createTipoEntradaGenerarLiquidacionCodigoConvenio(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_GENERAR_LIQUIDACION_CODIGO_CONVENIO, String.class, TipoEntradaGenerarLiquidacion.class, value);
    }

}
