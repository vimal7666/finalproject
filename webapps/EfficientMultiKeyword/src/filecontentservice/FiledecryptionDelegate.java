package filecontentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "filedecryptionDelegate", targetNamespace = "http://logic.com/")
public interface FiledecryptionDelegate {

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "filequery", targetNamespace = "http://logic.com/", className = "filecontentservice.Filequery")
	@ResponseWrapper(localName = "filequeryResponse", targetNamespace = "http://logic.com/", className = "filecontentservice.FilequeryResponse")
	public String filequery(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

}
