
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarentidadesj_a.v1 package. 
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
public class ConsultarEntidadesJAObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_ENTIDADES_JA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarEntidadesJ_A/v1", "salidaConsultarEntidadesJ_A");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarentidadesj_a.v1
     * 
     */
    public ConsultarEntidadesJAObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarEntidadesJA }
     * 
     */
    public TipoSalidaConsultarEntidadesJA createTipoSalidaConsultarEntidadesJA() {
        return new TipoSalidaConsultarEntidadesJA();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA }
     * 
     */
    public TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA createTipoSalidaConsultarEntidadesJAListaAutoridadesJA() {
        return new TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA();
    }

    /**
     * Create an instance of {@link EntradaConsultarEntidadesJA }
     * 
     */
    public EntradaConsultarEntidadesJA createEntradaConsultarEntidadesJA() {
        return new EntradaConsultarEntidadesJA();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA }
     * 
     */
    public TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA createTipoSalidaConsultarEntidadesJAListaAutoridadesJAAutoridadA() {
        return new TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarEntidadesJA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarEntidadesJ_A/v1", name = "salidaConsultarEntidadesJ_A")
    public JAXBElement<TipoSalidaConsultarEntidadesJA> createSalidaConsultarEntidadesJA(TipoSalidaConsultarEntidadesJA value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ENTIDADES_JA, TipoSalidaConsultarEntidadesJA.class, null, value);
    }

}
