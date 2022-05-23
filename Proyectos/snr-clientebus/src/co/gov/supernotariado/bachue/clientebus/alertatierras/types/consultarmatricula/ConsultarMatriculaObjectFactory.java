
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatricula.v1 package. 
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
public class ConsultarMatriculaObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_MATRICULA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", "entradaConsultarMatricula");
    private static final QName CQN_SALIDA_CONSULTAR_MATRICULA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", "salidaConsultarMatricula");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatricula.v1
     * 
     */
    public ConsultarMatriculaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatricula }
     * 
     */
    public TipoSalidaConsultarMatricula createTipoSalidaConsultarMatricula() {
        return new TipoSalidaConsultarMatricula();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatricula.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarMatricula.ListaMatriculas createTipoSalidaConsultarMatriculaListaMatriculas() {
        return new TipoSalidaConsultarMatricula.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMatricula }
     * 
     */
    public TipoEntradaConsultarMatricula createTipoEntradaConsultarMatricula() {
        return new TipoEntradaConsultarMatricula();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatricula.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarMatricula.ListaMatriculas.Matricula createTipoSalidaConsultarMatriculaListaMatriculasMatricula() {
        return new TipoSalidaConsultarMatricula.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", name = "entradaConsultarMatricula")
    public JAXBElement<TipoEntradaConsultarMatricula> createEntradaConsultarMatricula(TipoEntradaConsultarMatricula value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MATRICULA, TipoEntradaConsultarMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatricula/v1", name = "salidaConsultarMatricula")
    public JAXBElement<TipoSalidaConsultarMatricula> createSalidaConsultarMatricula(TipoSalidaConsultarMatricula value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MATRICULA, TipoSalidaConsultarMatricula.class, null, value);
    }

}
