
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculaalerta.v1 package. 
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
public class ConsultarMatriculaAlertaObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", "entradaConsultarMatriculaAlerta");
    private static final QName CQN_SALIDA_CONSULTAR_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", "salidaConsultarMatriculaAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculaalerta.v1
     * 
     */
    public ConsultarMatriculaAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaAlerta }
     * 
     */
    public TipoSalidaConsultarMatriculaAlerta createTipoSalidaConsultarMatriculaAlerta() {
        return new TipoSalidaConsultarMatriculaAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaAlerta.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarMatriculaAlerta.ListaMatriculas createTipoSalidaConsultarMatriculaAlertaListaMatriculas() {
        return new TipoSalidaConsultarMatriculaAlerta.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMatriculaAlerta }
     * 
     */
    public TipoEntradaConsultarMatriculaAlerta createTipoEntradaConsultarMatriculaAlerta() {
        return new TipoEntradaConsultarMatriculaAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaAlerta.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarMatriculaAlerta.ListaMatriculas.Matricula createTipoSalidaConsultarMatriculaAlertaListaMatriculasMatricula() {
        return new TipoSalidaConsultarMatriculaAlerta.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", name = "entradaConsultarMatriculaAlerta")
    public JAXBElement<TipoEntradaConsultarMatriculaAlerta> createEntradaConsultarMatriculaAlerta(TipoEntradaConsultarMatriculaAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MATRICULA_ALERTA, TipoEntradaConsultarMatriculaAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaAlerta/v1", name = "salidaConsultarMatriculaAlerta")
    public JAXBElement<TipoSalidaConsultarMatriculaAlerta> createSalidaConsultarMatriculaAlerta(TipoSalidaConsultarMatriculaAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MATRICULA_ALERTA, TipoSalidaConsultarMatriculaAlerta.class, null, value);
    }

}
