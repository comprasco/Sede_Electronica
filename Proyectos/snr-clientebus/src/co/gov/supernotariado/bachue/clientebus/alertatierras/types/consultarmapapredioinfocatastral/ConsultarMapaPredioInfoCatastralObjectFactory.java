
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmapapredioinfocatastral.v1 package. 
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
public class ConsultarMapaPredioInfoCatastralObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", "salidaConsultarMapaPredioInfoCatastral");
    private static final QName CQN_ENTRADA_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", "entradaConsultarMapaPredioInfoCatastral");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmapapredioinfocatastral.v1
     * 
     */
    public ConsultarMapaPredioInfoCatastralObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMapaPredioInfoCatastral }
     * 
     */
    public TipoSalidaConsultarMapaPredioInfoCatastral createTipoSalidaConsultarMapaPredioInfoCatastral() {
        return new TipoSalidaConsultarMapaPredioInfoCatastral();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMapaPredioInfoCatastral }
     * 
     */
    public TipoEntradaConsultarMapaPredioInfoCatastral createTipoEntradaConsultarMapaPredioInfoCatastral() {
        return new TipoEntradaConsultarMapaPredioInfoCatastral();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMapaPredioInfoCatastral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", name = "salidaConsultarMapaPredioInfoCatastral")
    public JAXBElement<TipoSalidaConsultarMapaPredioInfoCatastral> createSalidaConsultarMapaPredioInfoCatastral(TipoSalidaConsultarMapaPredioInfoCatastral value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL, TipoSalidaConsultarMapaPredioInfoCatastral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMapaPredioInfoCatastral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMapaPredioInfoCatastral/v1", name = "entradaConsultarMapaPredioInfoCatastral")
    public JAXBElement<TipoEntradaConsultarMapaPredioInfoCatastral> createEntradaConsultarMapaPredioInfoCatastral(TipoEntradaConsultarMapaPredioInfoCatastral value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL, TipoEntradaConsultarMapaPredioInfoCatastral.class, null, value);
    }

}
