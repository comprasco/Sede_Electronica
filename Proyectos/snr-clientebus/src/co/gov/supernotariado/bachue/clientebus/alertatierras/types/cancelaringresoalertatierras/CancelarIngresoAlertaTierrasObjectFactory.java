
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.cancelaringresoalertatierras.v1 package. 
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
public class CancelarIngresoAlertaTierrasObjectFactory {

    private static final QName CQN_ENTRADA_CANCELAR_INGRESAR_ALERTA_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", "entradaCancelarIngresoAlertaTierras");
    private static final QName CQN_SALIDA_CANCELAR_INGRESAR_ALERTA_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", "salidaCancelarIngresoAlertaTierras");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.cancelaringresoalertatierras.v1
     * 
     */
    public CancelarIngresoAlertaTierrasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaCancelarIngresoAlertaTierras }
     * 
     */
    public TipoEntradaCancelarIngresoAlertaTierras createTipoEntradaCancelarIngresoAlertaTierras() {
        return new TipoEntradaCancelarIngresoAlertaTierras();
    }

    /**
     * Create an instance of {@link TipoSalidaCancelarIngresoAlertaTierras }
     * 
     */
    public TipoSalidaCancelarIngresoAlertaTierras createTipoSalidaCancelarIngresoAlertaTierras() {
        return new TipoSalidaCancelarIngresoAlertaTierras();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaCancelarIngresoAlertaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", name = "entradaCancelarIngresoAlertaTierras")
    public JAXBElement<TipoEntradaCancelarIngresoAlertaTierras> createEntradaCancelarIngresoAlertaTierras(TipoEntradaCancelarIngresoAlertaTierras value) {
        return new JAXBElement<>(CQN_ENTRADA_CANCELAR_INGRESAR_ALERTA_TIERRAS, TipoEntradaCancelarIngresoAlertaTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaCancelarIngresoAlertaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/cancelarIngresoAlertaTierras/v1", name = "salidaCancelarIngresoAlertaTierras")
    public JAXBElement<TipoSalidaCancelarIngresoAlertaTierras> createSalidaCancelarIngresoAlertaTierras(TipoSalidaCancelarIngresoAlertaTierras value) {
        return new JAXBElement<>(CQN_SALIDA_CANCELAR_INGRESAR_ALERTA_TIERRAS, TipoSalidaCancelarIngresoAlertaTierras.class, null, value);
    }

}
