package service;

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
@WebService(name = "RegisterDelegate", targetNamespace = "http://logic.com/")
public interface RegisterDelegate {

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "register", targetNamespace = "http://logic.com/", className = "service.Register")
	@ResponseWrapper(localName = "registerResponse", targetNamespace = "http://logic.com/", className = "service.RegisterResponse")
	public String register(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "login", targetNamespace = "http://logic.com/", className = "service.Login")
	@ResponseWrapper(localName = "loginResponse", targetNamespace = "http://logic.com/", className = "service.LoginResponse")
	public String login(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "Userregister")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "Userregister", targetNamespace = "http://logic.com/", className = "service.Userregister")
	@ResponseWrapper(localName = "UserregisterResponse", targetNamespace = "http://logic.com/", className = "service.UserregisterResponse")
	public String userregister(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "ownerlogin", targetNamespace = "http://logic.com/", className = "service.Ownerlogin")
	@ResponseWrapper(localName = "ownerloginResponse", targetNamespace = "http://logic.com/", className = "service.OwnerloginResponse")
	public String ownerlogin(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

}