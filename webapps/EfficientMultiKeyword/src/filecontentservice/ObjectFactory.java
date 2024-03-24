package filecontentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the filecontentservice package.
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

	private final static QName _Filequery_QNAME = new QName(
			"http://logic.com/", "filequery");
	private final static QName _FilequeryResponse_QNAME = new QName(
			"http://logic.com/", "filequeryResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: filecontentservice
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link FilequeryResponse }
	 * 
	 */
	public FilequeryResponse createFilequeryResponse() {
		return new FilequeryResponse();
	}

	/**
	 * Create an instance of {@link Filequery }
	 * 
	 */
	public Filequery createFilequery() {
		return new Filequery();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Filequery }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "filequery")
	public JAXBElement<Filequery> createFilequery(Filequery value) {
		return new JAXBElement<Filequery>(_Filequery_QNAME, Filequery.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FilequeryResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "filequeryResponse")
	public JAXBElement<FilequeryResponse> createFilequeryResponse(
			FilequeryResponse value) {
		return new JAXBElement<FilequeryResponse>(_FilequeryResponse_QNAME,
				FilequeryResponse.class, null, value);
	}

}
