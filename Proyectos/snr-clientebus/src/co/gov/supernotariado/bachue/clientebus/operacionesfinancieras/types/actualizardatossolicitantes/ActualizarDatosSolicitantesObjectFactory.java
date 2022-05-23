package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.actualizardatossolicitantes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.actualizardatossolicitante.v2 package. 
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
public class ActualizarDatosSolicitantesObjectFactory {

	
	private static final String CS_NOMBREESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2";
    private static final QName CQN_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE = new QName(CS_NOMBREESPACIO, "entradaActualizarDatosSolicitante");
    private static final QName CQN_SALIDA_ACTUALIZAR_DATOS_SOLICITANTE = new QName(CS_NOMBREESPACIO, "salidaActualizarDatosSolicitante");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_PRIMER_APELLIDO_SOLICITANTE = new QName(CS_NOMBREESPACIO, "primerApellidoSolicitante");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_SEGUNDO_NOMBRE_SOLICITANTE = new QName(CS_NOMBREESPACIO, "segundoNombreSolicitante");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_SEGUNDO_APELLIDO__SOLICITANTE = new QName(CS_NOMBREESPACIO, "segundoApellidoSolicitante");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_PRIMER_NOMBRE_SOLICITANTE = new QName(CS_NOMBREESPACIO, "primerNombreSolicitante");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_RAZON_SOCIAL = new QName(CS_NOMBREESPACIO, "razonSocial");
    private static final QName CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_DESCRIPCION_MENSAJE = new QName(CS_NOMBREESPACIO, "descripcionMensaje");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.actualizardatossolicitante.v2
     * 
     */
    public ActualizarDatosSolicitantesObjectFactory() {
    	//Contructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaActualizarDatosSolicitante }
     * 
     */
    public TipoSalidaActualizarDatosSolicitante createTipoSalidaActualizarDatosSolicitante() {
        return new TipoSalidaActualizarDatosSolicitante();
    }

    /**
     * Create an instance of {@link TipoEntradaActualizarDatosSolicitante }
     * 
     */
    public TipoEntradaActualizarDatosSolicitante createTipoEntradaActualizarDatosSolicitante() {
        return new TipoEntradaActualizarDatosSolicitante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaActualizarDatosSolicitante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "entradaActualizarDatosSolicitante")
    public JAXBElement<TipoEntradaActualizarDatosSolicitante> createEntradaActualizarDatosSolicitante(TipoEntradaActualizarDatosSolicitante value) {
        return new JAXBElement<>(CQN_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE, TipoEntradaActualizarDatosSolicitante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaActualizarDatosSolicitante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "salidaActualizarDatosSolicitante")
    public JAXBElement<TipoSalidaActualizarDatosSolicitante> createSalidaActualizarDatosSolicitante(TipoSalidaActualizarDatosSolicitante value) {
        return new JAXBElement<>(CQN_SALIDA_ACTUALIZAR_DATOS_SOLICITANTE, TipoSalidaActualizarDatosSolicitante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "primerApellidoSolicitante", scope = TipoEntradaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoEntradaActualizarDatosSolicitantePrimerApellidoSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_PRIMER_APELLIDO_SOLICITANTE, String.class, TipoEntradaActualizarDatosSolicitante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "segundoNombreSolicitante", scope = TipoEntradaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoEntradaActualizarDatosSolicitanteSegundoNombreSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_SEGUNDO_NOMBRE_SOLICITANTE, String.class, TipoEntradaActualizarDatosSolicitante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "segundoApellidoSolicitante", scope = TipoEntradaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoEntradaActualizarDatosSolicitanteSegundoApellidoSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_SEGUNDO_APELLIDO__SOLICITANTE, String.class, TipoEntradaActualizarDatosSolicitante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "primerNombreSolicitante", scope = TipoEntradaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoEntradaActualizarDatosSolicitantePrimerNombreSolicitante(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_PRIMER_NOMBRE_SOLICITANTE, String.class, TipoEntradaActualizarDatosSolicitante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "razonSocial", scope = TipoEntradaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoEntradaActualizarDatosSolicitanteRazonSocial(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_RAZON_SOCIAL, String.class, TipoEntradaActualizarDatosSolicitante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/actualizardatossolicitante/v2", name = "descripcionMensaje", scope = TipoSalidaActualizarDatosSolicitante.class)
    public JAXBElement<String> createTipoSalidaActualizarDatosSolicitanteDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_ACTUALIZAR_DATOS_SOLICITANTE_DESCRIPCION_MENSAJE, String.class, TipoSalidaActualizarDatosSolicitante.class, value);
    }

}
