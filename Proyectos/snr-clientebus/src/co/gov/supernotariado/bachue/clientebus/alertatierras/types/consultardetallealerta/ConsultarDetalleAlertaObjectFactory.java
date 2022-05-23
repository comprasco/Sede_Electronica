
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardetallealerta.v1 package. 
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
public class ConsultarDetalleAlertaObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_DETALLE_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", "salidaConsultarDetalleAlerta");
    private static final QName CQN_ENTRADA_CONSULTAR_DETALLE_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", "entradaConsultarDetalleAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultardetallealerta.v1
     * 
     */
    public ConsultarDetalleAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta createTipoSalidaConsultarDetalleAlerta() {
        return new TipoSalidaConsultarDetalleAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaProcesosAS }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaProcesosAS createTipoSalidaConsultarDetalleAlertaListaProcesosAS() {
        return new TipoSalidaConsultarDetalleAlerta.ListaProcesosAS();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas createTipoSalidaConsultarDetalleAlertaListaAlertasGeneradas() {
        return new TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaMatriculas createTipoSalidaConsultarDetalleAlertaListaMatriculas() {
        return new TipoSalidaConsultarDetalleAlerta.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarDetalleAlerta }
     * 
     */
    public TipoEntradaConsultarDetalleAlerta createTipoEntradaConsultarDetalleAlerta() {
        return new TipoEntradaConsultarDetalleAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.Inactivacion }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.Inactivacion createTipoSalidaConsultarDetalleAlertaInactivacion() {
        return new TipoSalidaConsultarDetalleAlerta.Inactivacion();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS createTipoSalidaConsultarDetalleAlertaListaProcesosASProcesoAS() {
        return new TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada createTipoSalidaConsultarDetalleAlertaListaAlertasGeneradasAlertaGenerada() {
        return new TipoSalidaConsultarDetalleAlerta.ListaAlertasGeneradas.AlertaGenerada();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula createTipoSalidaConsultarDetalleAlertaListaMatriculasMatricula() {
        return new TipoSalidaConsultarDetalleAlerta.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarDetalleAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", name = "salidaConsultarDetalleAlerta")
    public JAXBElement<TipoSalidaConsultarDetalleAlerta> createSalidaConsultarDetalleAlerta(TipoSalidaConsultarDetalleAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_DETALLE_ALERTA, TipoSalidaConsultarDetalleAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarDetalleAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarDetalleAlerta/v1", name = "entradaConsultarDetalleAlerta")
    public JAXBElement<TipoEntradaConsultarDetalleAlerta> createEntradaConsultarDetalleAlerta(TipoEntradaConsultarDetalleAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_DETALLE_ALERTA, TipoEntradaConsultarDetalleAlerta.class, null, value);
    }

}
