
package fdaekyc.tml.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fdaekyc.tml.service package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _FDARequest_QNAME = new QName("http://service.TML.FDAeKYC/", "FDARequest");
    private final static QName _FDAResponse_QNAME = new QName("http://service.TML.FDAeKYC/", "FDAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fdaekyc.tml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FDARequestObject }
     * 
     */
    public FDARequestObject createFDARequestObject() {
        return new FDARequestObject();
    }

    /**
     * Create an instance of {@link FDAResponseObject }
     * 
     */
    public FDAResponseObject createFDAResponseObject() {
        return new FDAResponseObject();
    }

    /**
     * Create an instance of {@link KYCObject }
     * 
     */
    public KYCObject createKYCObject() {
        return new KYCObject();
    }

    /**
     * Create an instance of {@link KYCResultObject }
     * 
     */
    public KYCResultObject createKYCResultObject() {
        return new KYCResultObject();
    }

    /**
     * Create an instance of {@link NameMatchObject }
     * 
     */
    public NameMatchObject createNameMatchObject() {
        return new NameMatchObject();
    }

    /**
     * Create an instance of {@link FDAResultObject }
     * 
     */
    public FDAResultObject createFDAResultObject() {
        return new FDAResultObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FDARequestObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FDARequestObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.FDAeKYC/", name = "FDARequest")
    public JAXBElement<FDARequestObject> createFDARequest(FDARequestObject value) {
        return new JAXBElement<FDARequestObject>(_FDARequest_QNAME, FDARequestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FDAResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FDAResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.FDAeKYC/", name = "FDAResponse")
    public JAXBElement<FDAResponseObject> createFDAResponse(FDAResponseObject value) {
        return new JAXBElement<FDAResponseObject>(_FDAResponse_QNAME, FDAResponseObject.class, null, value);
    }

}
