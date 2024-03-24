package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _OwnerloginResponse_QNAME = new QName(
			"http://logic.com/", "ownerloginResponse");
	private final static QName _LoginResponse_QNAME = new QName(
			"http://logic.com/", "loginResponse");
	private final static QName _Ownerlogin_QNAME = new QName(
			"http://logic.com/", "ownerlogin");
	private final static QName _Register_QNAME = new QName("http://logic.com/",
			"register");
	private final static QName _RegisterResponse_QNAME = new QName(
			"http://logic.com/", "registerResponse");
	private final static QName _UserregisterResponse_QNAME = new QName(
			"http://logic.com/", "UserregisterResponse");
	private final static QName _Login_QNAME = new QName("http://logic.com/",
			"login");
	private final static QName _Userregister_QNAME = new QName(
			"http://logic.com/", "Userregister");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link RegisterResponse }
	 * 
	 */
	public RegisterResponse createRegisterResponse() {
		return new RegisterResponse();
	}

	/**
	 * Create an instance of {@link Register }
	 * 
	 */
	public Register createRegister() {
		return new Register();
	}

	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse() {
		return new LoginResponse();
	}

	/**
	 * Create an instance of {@link Login }
	 * 
	 */
	public Login createLogin() {
		return new Login();
	}

	/**
	 * Create an instance of {@link OwnerloginResponse }
	 * 
	 */
	public OwnerloginResponse createOwnerloginResponse() {
		return new OwnerloginResponse();
	}

	/**
	 * Create an instance of {@link UserregisterResponse }
	 * 
	 */
	public UserregisterResponse createUserregisterResponse() {
		return new UserregisterResponse();
	}

	/**
	 * Create an instance of {@link Ownerlogin }
	 * 
	 */
	public Ownerlogin createOwnerlogin() {
		return new Ownerlogin();
	}

	/**
	 * Create an instance of {@link Userregister }
	 * 
	 */
	public Userregister createUserregister() {
		return new Userregister();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link OwnerloginResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "ownerloginResponse")
	public JAXBElement<OwnerloginResponse> createOwnerloginResponse(
			OwnerloginResponse value) {
		return new JAXBElement<OwnerloginResponse>(_OwnerloginResponse_QNAME,
				OwnerloginResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "loginResponse")
	public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
		return new JAXBElement<LoginResponse>(_LoginResponse_QNAME,
				LoginResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Ownerlogin }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "ownerlogin")
	public JAXBElement<Ownerlogin> createOwnerlogin(Ownerlogin value) {
		return new JAXBElement<Ownerlogin>(_Ownerlogin_QNAME, Ownerlogin.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "register")
	public JAXBElement<Register> createRegister(Register value) {
		return new JAXBElement<Register>(_Register_QNAME, Register.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link RegisterResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "registerResponse")
	public JAXBElement<RegisterResponse> createRegisterResponse(
			RegisterResponse value) {
		return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME,
				RegisterResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UserregisterResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "UserregisterResponse")
	public JAXBElement<UserregisterResponse> createUserregisterResponse(
			UserregisterResponse value) {
		return new JAXBElement<UserregisterResponse>(
				_UserregisterResponse_QNAME, UserregisterResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "login")
	public JAXBElement<Login> createLogin(Login value) {
		return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Userregister }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "Userregister")
	public JAXBElement<Userregister> createUserregister(Userregister value) {
		return new JAXBElement<Userregister>(_Userregister_QNAME,
				Userregister.class, null, value);
	}

}
