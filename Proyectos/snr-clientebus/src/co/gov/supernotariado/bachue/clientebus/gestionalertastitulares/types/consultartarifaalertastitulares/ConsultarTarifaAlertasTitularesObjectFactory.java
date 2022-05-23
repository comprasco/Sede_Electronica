
package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.consultartarifaalertastitulares.v1 package. 
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
public class ConsultarTarifaAlertasTitularesObjectFactory {

	private static final QName CQN_ENTRADA_CONSULTAR_TARIFA_ALERTAS_TITULARES = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1", "entradaConsultarTarifaAlertasTitulares");
	private static final QName CQN_SALIDA_CONSULTAR_TARIFA_ALERTAS_TITULARES = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1", "salidaConsultarTarifaAlertasTitulares");

	/**
	 * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.consultartarifaalertastitulares.v1
	 * 
	 */
	public ConsultarTarifaAlertasTitularesObjectFactory() {
		//    	Constructor vacio
	}

	/**
	 * Create an instance of {@link TipoSalidaConsultarTarifaAlertasTitulares }
	 * 
	 */
	public TipoSalidaConsultarTarifaAlertasTitulares createTipoSalidaConsultarTarifaAlertasTitulares() {
		return new TipoSalidaConsultarTarifaAlertasTitulares();
	}

	/**
	 * Create an instance of {@link TipoEntradaConsultarTarifaAlertasTitulares }
	 * 
	 */
	public TipoEntradaConsultarTarifaAlertasTitulares createTipoEntradaConsultarTarifaAlertasTitulares() {
		return new TipoEntradaConsultarTarifaAlertasTitulares();
	}

	/**
	 * Create an instance of {@link TarifasType }
	 * 
	 */
	public TarifasType createTarifasType() {
		return new TarifasType();
	}

	/**
	 * Create an instance of {@link TarifaType }
	 * 
	 */
	public TarifaType createTarifaType() {
		return new TarifaType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarTarifaAlertasTitulares }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1", name = "entradaConsultarTarifaAlertasTitulares")
	public JAXBElement<TipoEntradaConsultarTarifaAlertasTitulares> createEntradaConsultarTarifaAlertasTitulares(TipoEntradaConsultarTarifaAlertasTitulares value) {
		return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_TARIFA_ALERTAS_TITULARES, TipoEntradaConsultarTarifaAlertasTitulares.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarTarifaAlertasTitulares }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/consultartarifaalertastitulares/v1", name = "salidaConsultarTarifaAlertasTitulares")
	public JAXBElement<TipoSalidaConsultarTarifaAlertasTitulares> createSalidaConsultarTarifaAlertasTitulares(TipoSalidaConsultarTarifaAlertasTitulares value) {
		return new JAXBElement<>(CQN_SALIDA_CONSULTAR_TARIFA_ALERTAS_TITULARES, TipoSalidaConsultarTarifaAlertasTitulares.class, null, value);
	}

}
