package co.gov.supernotariado.bachue.clientebus.pasarela.operacion;
import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateSystemStatusDTO;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RealPayPort", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RealPayPort {


    /**
     * 
     * @param lastName
     * @param business
     * @param reference3
     * @param reference4
     * @param documentType
     * @param document
     * @param vat
     * @param description
     * @param taxes
     * @param reference1
     * @param reference2
     * @param password
     * @param phone
     * @param name
     * @param company
     * @param businessType
     * @param value
     * @param email
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.CreateTransactionDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "createTransaction", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransaction")
    @ResponseWrapper(localName = "createTransactionResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionResponse")
    public CreateTransactionDTO createTransaction(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType,
        @WebParam(name = "reference1", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String reference1,
        @WebParam(name = "reference2", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String reference2,
        @WebParam(name = "reference3", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String reference3,
        @WebParam(name = "reference4", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String reference4,
        @WebParam(name = "description", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String description,
        @WebParam(name = "value", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        BigDecimal value,
        @WebParam(name = "vat", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        BigDecimal vat,
        @WebParam(name = "taxes", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        BigDecimal taxes,
        @WebParam(name = "documentType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String documentType,
        @WebParam(name = "document", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String document,
        @WebParam(name = "name", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String name,
        @WebParam(name = "lastName", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String lastName,
        @WebParam(name = "email", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String email,
        @WebParam(name = "phone", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String phone);
    


    /**
     * 
     * @param password
     * @param business
     * @param company
     * @param businessType
     * @param token
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.AcceptTransactionDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "acceptTransaction", targetNamespace = "co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransaction")
    @ResponseWrapper(localName = "acceptTransactionResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionResponse")
    public AcceptTransactionDTO acceptTransaction(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType,
        @WebParam(name = "token", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String token);
    

    /**
     * 
     * @param password
     * @param business
     * @param company
     * @param businessType
     * @param token
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.CancelTransactionDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "cancelTransaction", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/",  className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransaction")
    @ResponseWrapper(localName = "cancelTransactionResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionResponse")
    public CancelTransactionDTO cancelTransaction(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType,
        @WebParam(name = "token", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String token);
    

    /**
     * 
     * @param password
     * @param business
     * @param company
     * @param businessType
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.ValidateSystemStatusDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "validateBusinessStatus", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatus")
    @ResponseWrapper(localName = "validateBusinessStatusResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatusResponse")
    public ValidateSystemStatusDTO validateBusinessStatus(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType);
    
   
    /**
     * 
     * @param password
     * @param business
     * @param company
     * @param businessType
     * @param token
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.QueryTransactionByTokenDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "queryTransactionByToken", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByToken")
    @ResponseWrapper(localName = "queryTransactionByTokenResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenResponse")
    public QueryTransactionByTokenDTO queryTransactionByToken(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType,
        @WebParam(name = "token", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String token);


 
    /**
     * 
     * @param date
     * @param password
     * @param business
     * @param company
     * @param businessType
     * @return
     *     returns co.gov.supernotariado.bachue.clientebus.pasarela.types.QueryTransactionByDateDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
    @RequestWrapper(localName = "queryTransactionByDate", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDate")
    @ResponseWrapper(localName = "queryTransactionByDateResponse", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/", className = "co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateResponse")
    public QueryTransactionByDateDTO queryTransactionByDate(
        @WebParam(name = "company", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String company,
        @WebParam(name = "password", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String password,
        @WebParam(name = "business", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String business,
        @WebParam(name = "businessType", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String businessType,
        @WebParam(name = "date", targetNamespace = "http://soap.dto.services.realpay.nvalue.com.co/")
        String date);
    

}