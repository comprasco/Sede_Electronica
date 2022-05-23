package co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ci.consultadatosregistrales.consultardatosregistrales.v1 package. 
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
public class ConsultaDatosRegistralesObjectFactory {

	private static final String CS_NOMBRE_ESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ci/consultadatosregistrales/consultardatosregistrales/v1";
	private static final QName CQN_ENTRADA_CONSULTAR_DATOS_REGISTRALES = new QName(CS_NOMBRE_ESPACIO, "entradaConsultarDatosRegistrales");
	private static final QName CQN_SALIDA_CONSULTAR_DATOS_REGISTRALES = new QName(CS_NOMBRE_ESPACIO, "salidaConsultarDatosRegistrales");
	private static final QName CQN_INTERVINIENTE_SEGUNDO_NOMBRE_INTERVINIENTE = new QName(CS_NOMBRE_ESPACIO, "segundoNombreInterviniente");
	private static final QName CQN_INTERVINIENTE_SEGUNDO_APELLIDO_INTERVINIENTE = new QName(CS_NOMBRE_ESPACIO, "segundoApellidoInterviniente");
	private static final QName CQN_MATRICULA_ESTADO_NUPRE = new QName(CS_NOMBRE_ESPACIO, "estadoNupre");
	private static final QName CQN_MATRICULA_CHIP = new QName(CS_NOMBRE_ESPACIO, "chip");
	private static final QName CQN_MATRICULA_NUPRE = new QName(CS_NOMBRE_ESPACIO, "nupre");
	private static final QName CQN_TITULAR_SEGUNDO_APELLIDO_TITULAR = new QName(CS_NOMBRE_ESPACIO, "segundoApellidoTitular");
	private static final QName CQN_TITULAR_SEGUNDO_NOMBRE_TITULAR = new QName(CS_NOMBRE_ESPACIO, "segundoNombreTitular");

	/**
	 * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ci.consultadatosregistrales.consultardatosregistrales.v1
	 * 
	 */
	public ConsultaDatosRegistralesObjectFactory() {
		//    	constructor vacio
	}

	/**
	 * Create an instance of {@link Matricula }
	 * 
	 */
	public Matricula createMatricula() {
		return new Matricula();
	}

	/**
	 * Create an instance of {@link Anotacion }
	 * 
	 */
	public Anotacion createAnotacion() {
		return new Anotacion();
	}

	/**
	 * Create an instance of {@link TipoSalidaConsultarDatosRegistrales }
	 * 
	 */
	public TipoSalidaConsultarDatosRegistrales createTipoSalidaConsultarDatosRegistrales() {
		return new TipoSalidaConsultarDatosRegistrales();
	}

	/**
	 * Create an instance of {@link Matricula.Titulares }
	 * 
	 */
	public Matricula.Titulares createMatriculaTitulares() {
		return new Matricula.Titulares();
	}

	/**
	 * Create an instance of {@link Matricula.Anotaciones }
	 * 
	 */
	public Matricula.Anotaciones createMatriculaAnotaciones() {
		return new Matricula.Anotaciones();
	}

	/**
	 * Create an instance of {@link Interviniente }
	 * 
	 */
	public Interviniente createInterviniente() {
		return new Interviniente();
	}

	/**
	 * Create an instance of {@link TipoEntradaConsultarDatosRegistrales }
	 * 
	 */
	public TipoEntradaConsultarDatosRegistrales createTipoEntradaConsultarDatosRegistrales() {
		return new TipoEntradaConsultarDatosRegistrales();
	}

	/**
	 * Create an instance of {@link Titular }
	 * 
	 */
	public Titular createTitular() {
		return new Titular();
	}

	/**
	 * Create an instance of {@link Anotacion.Intervinientes }
	 * 
	 */
	public Anotacion.Intervinientes createAnotacionIntervinientes() {
		return new Anotacion.Intervinientes();
	}

	/**
	 * Create an instance of {@link TipoSalidaConsultarDatosRegistrales.Matriculas }
	 * 
	 */
	public TipoSalidaConsultarDatosRegistrales.Matriculas createTipoSalidaConsultarDatosRegistralesMatriculas() {
		return new TipoSalidaConsultarDatosRegistrales.Matriculas();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarDatosRegistrales }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "entradaConsultarDatosRegistrales")
	public JAXBElement<TipoEntradaConsultarDatosRegistrales> createEntradaConsultarDatosRegistrales(TipoEntradaConsultarDatosRegistrales value) {
		return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_DATOS_REGISTRALES, TipoEntradaConsultarDatosRegistrales.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarDatosRegistrales }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "salidaConsultarDatosRegistrales")
	public JAXBElement<TipoSalidaConsultarDatosRegistrales> createSalidaConsultarDatosRegistrales(TipoSalidaConsultarDatosRegistrales value) {
		return new JAXBElement<>(CQN_SALIDA_CONSULTAR_DATOS_REGISTRALES, TipoSalidaConsultarDatosRegistrales.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "segundoNombreInterviniente", scope = Interviniente.class)
	public JAXBElement<String> createIntervinienteSegundoNombreInterviniente(String value) {
		return new JAXBElement<>(CQN_INTERVINIENTE_SEGUNDO_NOMBRE_INTERVINIENTE, String.class, Interviniente.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "segundoApellidoInterviniente", scope = Interviniente.class)
	public JAXBElement<String> createIntervinienteSegundoApellidoInterviniente(String value) {
		return new JAXBElement<>(CQN_INTERVINIENTE_SEGUNDO_APELLIDO_INTERVINIENTE, String.class, Interviniente.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "estadoNupre", scope = Matricula.class)
	public JAXBElement<String> createMatriculaEstadoNupre(String value) {
		return new JAXBElement<>(CQN_MATRICULA_ESTADO_NUPRE, String.class, Matricula.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "chip", scope = Matricula.class)
	public JAXBElement<String> createMatriculaChip(String value) {
		return new JAXBElement<>(CQN_MATRICULA_CHIP, String.class, Matricula.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "nupre", scope = Matricula.class)
	public JAXBElement<String> createMatriculaNupre(String value) {
		return new JAXBElement<>(CQN_MATRICULA_NUPRE, String.class, Matricula.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "segundoApellidoTitular", scope = Titular.class)
	public JAXBElement<String> createTitularSegundoApellidoTitular(String value) {
		return new JAXBElement<>(CQN_TITULAR_SEGUNDO_APELLIDO_TITULAR, String.class, Titular.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = CS_NOMBRE_ESPACIO, name = "segundoNombreTitular", scope = Titular.class)
	public JAXBElement<String> createTitularSegundoNombreTitular(String value) {
		return new JAXBElement<>(CQN_TITULAR_SEGUNDO_NOMBRE_TITULAR, String.class, Titular.class, value);
	}

}
