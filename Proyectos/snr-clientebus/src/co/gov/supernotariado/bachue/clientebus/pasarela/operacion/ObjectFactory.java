package co.gov.supernotariado.bachue.clientebus.pasarela.operacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.LogDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDate;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByToken;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatus;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatusResponse;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateSystemStatusDTO;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.nvalue.realpay.services.dto.soap package. 
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
public class ObjectFactory {

	private static final String CS_NOMBREESPACIO = "http://soap.dto.services.realpay.nvalue.com.co/";
    private static final QName CQN_ACCEPT_TRANSACTION = new QName(CS_NOMBREESPACIO, "acceptTransaction");
    private static final QName CQN_QUERY_TRANSACTION_BY_DATE_RESPONSE = new QName(CS_NOMBREESPACIO, "queryTransactionByDateResponse");
    private static final QName CQN_QUERY_TRANSACTION_BY_TOKEN = new QName(CS_NOMBREESPACIO, "queryTransactionByToken");
    private static final QName CQN_VALIDATE_BUSINESS_STATUS = new QName(CS_NOMBREESPACIO, "validateBusinessStatus");
    private static final QName CQN_CREATE_TRANSACTION = new QName(CS_NOMBREESPACIO, "createTransaction");
    private static final QName CQN_ACCEPT_TRANSACTION_RESPONSE = new QName(CS_NOMBREESPACIO, "acceptTransactionResponse");
    private static final QName CQN_CANCEL_TRANSACTION_RESPONSE = new QName(CS_NOMBREESPACIO, "cancelTransactionResponse");
    private static final QName CQN_CREATE_TRANSACTION_RESPONSE = new QName(CS_NOMBREESPACIO, "createTransactionResponse");
    private static final QName CQN_QUERY_TRANSACTION_BY_TOKEN_RESPONSE = new QName(CS_NOMBREESPACIO, "queryTransactionByTokenResponse");
    private static final QName CQN_QUERY_TRANSACTION_BY_DATE = new QName(CS_NOMBREESPACIO, "queryTransactionByDate");
    private static final QName CQN_VALIDATE_BUSINESS_STATUS_RESPONSE = new QName(CS_NOMBREESPACIO, "validateBusinessStatusResponse");
    private static final QName CQN_CANCEL_TTRANSACTION = new QName(CS_NOMBREESPACIO, "cancelTransaction");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: co.com.nvalue.realpay.services.dto.soap
     * 
     */
    public ObjectFactory() {
    	// contructor vacio
    }

    /**
     * Create an instance of {@link AcceptTransactionResponse }
     * 
     */
    public AcceptTransactionResponse createAcceptTransactionResponse() {
        return new AcceptTransactionResponse();
    }

    /**
     * Create an instance of {@link CancelTransactionResponse }
     * 
     */
    public CancelTransactionResponse createCancelTransactionResponse() {
        return new CancelTransactionResponse();
    }

    /**
     * Create an instance of {@link CreateTransactionResponse }
     * 
     */
    public CreateTransactionResponse createCreateTransactionResponse() {
        return new CreateTransactionResponse();
    }

    /**
     * Create an instance of {@link QueryTransactionByTokenResponse }
     * 
     */
    public QueryTransactionByTokenResponse createQueryTransactionByTokenResponse() {
        return new QueryTransactionByTokenResponse();
    }

    /**
     * Create an instance of {@link CancelTransaction }
     * 
     */
    public CancelTransaction createCancelTransaction() {
        return new CancelTransaction();
    }

    /**
     * Create an instance of {@link QueryTransactionByDate }
     * 
     */
    public QueryTransactionByDate createQueryTransactionByDate() {
        return new QueryTransactionByDate();
    }

    /**
     * Create an instance of {@link ValidateBusinessStatusResponse }
     * 
     */
    public ValidateBusinessStatusResponse createValidateBusinessStatusResponse() {
        return new ValidateBusinessStatusResponse();
    }

    /**
     * Create an instance of {@link AcceptTransaction }
     * 
     */
    public AcceptTransaction createAcceptTransaction() {
        return new AcceptTransaction();
    }

    /**
     * Create an instance of {@link QueryTransactionByDateResponse }
     * 
     */
    public QueryTransactionByDateResponse createQueryTransactionByDateResponse() {
        return new QueryTransactionByDateResponse();
    }

    /**
     * Create an instance of {@link QueryTransactionByToken }
     * 
     */
    public QueryTransactionByToken createQueryTransactionByToken() {
        return new QueryTransactionByToken();
    }

    /**
     * Create an instance of {@link ValidateBusinessStatus }
     * 
     */
    public ValidateBusinessStatus createValidateBusinessStatus() {
        return new ValidateBusinessStatus();
    }

    /**
     * Create an instance of {@link CreateTransaction }
     * 
     */
    public CreateTransaction createCreateTransaction() {
        return new CreateTransaction();
    }

    /**
     * Create an instance of {@link QueryTransactionByDateDTO }
     * 
     */
    public QueryTransactionByDateDTO createQueryTransactionByDateDTO() {
        return new QueryTransactionByDateDTO();
    }

    /**
     * Create an instance of {@link ValidateSystemStatusDTO }
     * 
     */
    public ValidateSystemStatusDTO createValidateSystemStatusDTO() {
        return new ValidateSystemStatusDTO();
    }

    /**
     * Create an instance of {@link QueryTransactionByTokenDTO }
     * 
     */
    public QueryTransactionByTokenDTO createQueryTransactionByTokenDTO() {
        return new QueryTransactionByTokenDTO();
    }

    /**
     * Create an instance of {@link LogDTO }
     * 
     */
    public LogDTO createLogDTO() {
        return new LogDTO();
    }

    /**
     * Create an instance of {@link AcceptTransactionDTO }
     * 
     */
    public AcceptTransactionDTO createAcceptTransactionDTO() {
        return new AcceptTransactionDTO();
    }

    /**
     * Create an instance of {@link CreateTransactionDTO }
     * 
     */
    public CreateTransactionDTO createCreateTransactionDTO() {
        return new CreateTransactionDTO();
    }

    /**
     * Create an instance of {@link CancelTransactionDTO }
     * 
     */
    public CancelTransactionDTO createCancelTransactionDTO() {
        return new CancelTransactionDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "acceptTransaction")
    public JAXBElement<AcceptTransaction> createAcceptTransaction(AcceptTransaction value) {
        return new JAXBElement<>(CQN_ACCEPT_TRANSACTION, AcceptTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "queryTransactionByDateResponse")
    public JAXBElement<QueryTransactionByDateResponse> createQueryTransactionByDateResponse(QueryTransactionByDateResponse value) {
        return new JAXBElement<>(CQN_QUERY_TRANSACTION_BY_DATE_RESPONSE, QueryTransactionByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionByToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "queryTransactionByToken")
    public JAXBElement<QueryTransactionByToken> createQueryTransactionByToken(QueryTransactionByToken value) {
        return new JAXBElement<>(CQN_QUERY_TRANSACTION_BY_TOKEN, QueryTransactionByToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateBusinessStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "validateBusinessStatus")
    public JAXBElement<ValidateBusinessStatus> createValidateBusinessStatus(ValidateBusinessStatus value) {
        return new JAXBElement<>(CQN_VALIDATE_BUSINESS_STATUS, ValidateBusinessStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "createTransaction")
    public JAXBElement<CreateTransaction> createCreateTransaction(CreateTransaction value) {
        return new JAXBElement<>(CQN_CREATE_TRANSACTION, CreateTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "acceptTransactionResponse")
    public JAXBElement<AcceptTransactionResponse> createAcceptTransactionResponse(AcceptTransactionResponse value) {
        return new JAXBElement<>(CQN_ACCEPT_TRANSACTION_RESPONSE, AcceptTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "cancelTransactionResponse")
    public JAXBElement<CancelTransactionResponse> createCancelTransactionResponse(CancelTransactionResponse value) {
        return new JAXBElement<>(CQN_CANCEL_TRANSACTION_RESPONSE, CancelTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "createTransactionResponse")
    public JAXBElement<CreateTransactionResponse> createCreateTransactionResponse(CreateTransactionResponse value) {
        return new JAXBElement<>(CQN_CREATE_TRANSACTION_RESPONSE, CreateTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionByTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "queryTransactionByTokenResponse")
    public JAXBElement<QueryTransactionByTokenResponse> createQueryTransactionByTokenResponse(QueryTransactionByTokenResponse value) {
        return new JAXBElement<>(CQN_QUERY_TRANSACTION_BY_TOKEN_RESPONSE, QueryTransactionByTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTransactionByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "queryTransactionByDate")
    public JAXBElement<QueryTransactionByDate> createQueryTransactionByDate(QueryTransactionByDate value) {
        return new JAXBElement<>(CQN_QUERY_TRANSACTION_BY_DATE, QueryTransactionByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateBusinessStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "validateBusinessStatusResponse")
    public JAXBElement<ValidateBusinessStatusResponse> createValidateBusinessStatusResponse(ValidateBusinessStatusResponse value) {
        return new JAXBElement<>(CQN_VALIDATE_BUSINESS_STATUS_RESPONSE, ValidateBusinessStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dto.services.realpay.nvalue.com.co/", name = "cancelTransaction")
    public JAXBElement<CancelTransaction> createCancelTransaction(CancelTransaction value) {
        return new JAXBElement<>(CQN_CANCEL_TTRANSACTION, CancelTransaction.class, null, value);
    }

}
