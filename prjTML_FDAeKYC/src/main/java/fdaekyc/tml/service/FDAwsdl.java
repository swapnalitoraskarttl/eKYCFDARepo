package fdaekyc.tml.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5.fuse.jdk11-800012
 * 2020-01-03T17:18:48.611+05:30
 * Generated source version: 3.3.5.fuse.jdk11-800012
 *
 */
@WebService(targetNamespace = "http://service.TML.FDAeKYC/", name = "FDAwsdl")
@XmlSeeAlso({ObjectFactory.class})
public interface FDAwsdl {

    @WebMethod(operationName = "FDARequest")
    @RequestWrapper(localName = "FDARequest", targetNamespace = "http://service.TML.FDAeKYC/", className = "fdaekyc.tml.service.FDARequestObject")
    @ResponseWrapper(localName = "FDAResponse", targetNamespace = "http://service.TML.FDAeKYC/", className = "fdaekyc.tml.service.FDAResponseObject")
    public void fdaRequest(

        @WebParam(name = "consent", targetNamespace = "")
        java.lang.String consent,
        @WebParam(name = "licence_no", targetNamespace = "")
        java.lang.String licenceNo,
        @WebParam(name = "state", targetNamespace = "")
        java.lang.String state,
        @WebParam(name = "name1", targetNamespace = "")
        java.lang.String name1,
        @WebParam(mode = WebParam.Mode.OUT, name = "KYC", targetNamespace = "")
        javax.xml.ws.Holder<KYCObject> kyc,
        @WebParam(mode = WebParam.Mode.OUT, name = "NameMatch", targetNamespace = "")
        javax.xml.ws.Holder<NameMatchObject> nameMatch
    );
}
