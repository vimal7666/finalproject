package fileview;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the fileview package.
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

	private final static QName _Fileview_QNAME = new QName("http://logic.com/",
			"fileview");
	private final static QName _FileviewResponse_QNAME = new QName(
			"http://logic.com/", "fileviewResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: fileview
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link FileviewResponse }
	 * 
	 */
	public FileviewResponse createFileviewResponse() {
		return new FileviewResponse();
	}

	/**
	 * Create an instance of {@link Fileview }
	 * 
	 */
	public Fileview createFileview() {
		return new Fileview();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Fileview }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "fileview")
	public JAXBElement<Fileview> createFileview(Fileview value) {
		return new JAXBElement<Fileview>(_Fileview_QNAME, Fileview.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link FileviewResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "fileviewResponse")
	public JAXBElement<FileviewResponse> createFileviewResponse(
			FileviewResponse value) {
		return new JAXBElement<FileviewResponse>(_FileviewResponse_QNAME,
				FileviewResponse.class, null, value);
	}

}
