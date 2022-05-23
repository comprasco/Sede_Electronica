
package co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionmatriculas.v1 package. 
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
public class ConsultarMigracionMatriculasObjectFactory {

    private final static QName _SalidaConsultaMigracionMatriculas_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1", "salidaConsultaMigracionMatriculas");
    private final static QName _EntradaConsultaMigracionMatriculas_QNAME = new QName("https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1", "entradaConsultaMigracionMatriculas");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.services.bachue.cb.consultamigracion.consultarmigracionmatriculas.v1
     * 
     */
    public ConsultarMigracionMatriculasObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaMigracionMatriculas }
     * 
     */
    public TipoSalidaConsultaMigracionMatriculas createTipoSalidaConsultaMigracionMatriculas() {
        return new TipoSalidaConsultaMigracionMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaMigracionMatriculas }
     * 
     */
    public TipoEntradaConsultaMigracionMatriculas createTipoEntradaConsultaMigracionMatriculas() {
        return new TipoEntradaConsultaMigracionMatriculas();
    }

    /**
     * Create an instance of {@link TipoMatriculaConsultada }
     * 
     */
    public TipoMatriculaConsultada createTipoMatriculaConsultada() {
        return new TipoMatriculaConsultada();
    }

    /**
     * Create an instance of {@link TipoDatosMatriculasMigracion }
     * 
     */
    public TipoDatosMatriculasMigracion createTipoDatosMatriculasMigracion() {
        return new TipoDatosMatriculasMigracion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaMigracionMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1", name = "salidaConsultaMigracionMatriculas")
    public JAXBElement<TipoSalidaConsultaMigracionMatriculas> createSalidaConsultaMigracionMatriculas(TipoSalidaConsultaMigracionMatriculas value) {
        return new JAXBElement<TipoSalidaConsultaMigracionMatriculas>(_SalidaConsultaMigracionMatriculas_QNAME, TipoSalidaConsultaMigracionMatriculas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaMigracionMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/services/bachue/cb/consultamigracion/consultarMigracionMatriculas/v1", name = "entradaConsultaMigracionMatriculas")
    public JAXBElement<TipoEntradaConsultaMigracionMatriculas> createEntradaConsultaMigracionMatriculas(TipoEntradaConsultaMigracionMatriculas value) {
        return new JAXBElement<TipoEntradaConsultaMigracionMatriculas>(_EntradaConsultaMigracionMatriculas_QNAME, TipoEntradaConsultaMigracionMatriculas.class, null, value);
    }

}
