package fdaekyc.tml.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5.fuse.jdk11-800013
 * 2020-01-13T12:05:35.865+05:30
 * Generated source version: 3.3.5.fuse.jdk11-800013
 *
 */
@WebServiceClient(name = "FDAwsdl",
                  wsdlLocation = "file:/D:/GithubProject/eKYCFDARepo/prjTML_FDAeKYC/src/main/resources/FDAwsdl.wsdl",
                  targetNamespace = "http://service.TML.FDAeKYC/")
public class FDAwsdl_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.TML.FDAeKYC/", "FDAwsdl");
    public final static QName FDAwsdlPort = new QName("http://service.TML.FDAeKYC/", "FDAwsdlPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/GithubProject/eKYCFDARepo/prjTML_FDAeKYC/src/main/resources/FDAwsdl.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FDAwsdl_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/GithubProject/eKYCFDARepo/prjTML_FDAeKYC/src/main/resources/FDAwsdl.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FDAwsdl_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FDAwsdl_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FDAwsdl_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FDAwsdl_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FDAwsdl_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FDAwsdl_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FDAwsdl
     */
    @WebEndpoint(name = "FDAwsdlPort")
    public FDAwsdl getFDAwsdlPort() {
        return super.getPort(FDAwsdlPort, FDAwsdl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FDAwsdl
     */
    @WebEndpoint(name = "FDAwsdlPort")
    public FDAwsdl getFDAwsdlPort(WebServiceFeature... features) {
        return super.getPort(FDAwsdlPort, FDAwsdl.class, features);
    }

}
