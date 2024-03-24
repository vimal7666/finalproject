package queryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the queryservice package.
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

	private final static QName _BubbleSrtResponse_QNAME = new QName(
			"http://logic.com/", "bubble_srtResponse");
	private final static QName _BubbleSrt_QNAME = new QName(
			"http://logic.com/", "bubble_srt");
	private final static QName _GenQuery_QNAME = new QName("http://logic.com/",
			"genQuery");
	private final static QName _GenQueryResponse_QNAME = new QName(
			"http://logic.com/", "genQueryResponse");
	private final static QName _GenQueryView_QNAME = new QName(
			"http://logic.com/", "genQueryView");
	private final static QName _GenQueryViewResponse_QNAME = new QName(
			"http://logic.com/", "genQueryViewResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: queryservice
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link BubbleSrtResponse }
	 * 
	 */
	public BubbleSrtResponse createBubbleSrtResponse() {
		return new BubbleSrtResponse();
	}

	/**
	 * Create an instance of {@link BubbleSrt }
	 * 
	 */
	public BubbleSrt createBubbleSrt() {
		return new BubbleSrt();
	}

	/**
	 * Create an instance of {@link GenQueryView }
	 * 
	 */
	public GenQueryView createGenQueryView() {
		return new GenQueryView();
	}

	/**
	 * Create an instance of {@link GenQuery }
	 * 
	 */
	public GenQuery createGenQuery() {
		return new GenQuery();
	}

	/**
	 * Create an instance of {@link GenQueryResponse }
	 * 
	 */
	public GenQueryResponse createGenQueryResponse() {
		return new GenQueryResponse();
	}

	/**
	 * Create an instance of {@link GenQueryViewResponse }
	 * 
	 */
	public GenQueryViewResponse createGenQueryViewResponse() {
		return new GenQueryViewResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BubbleSrtResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "bubble_srtResponse")
	public JAXBElement<BubbleSrtResponse> createBubbleSrtResponse(
			BubbleSrtResponse value) {
		return new JAXBElement<BubbleSrtResponse>(_BubbleSrtResponse_QNAME,
				BubbleSrtResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BubbleSrt }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "bubble_srt")
	public JAXBElement<BubbleSrt> createBubbleSrt(BubbleSrt value) {
		return new JAXBElement<BubbleSrt>(_BubbleSrt_QNAME, BubbleSrt.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GenQuery }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "genQuery")
	public JAXBElement<GenQuery> createGenQuery(GenQuery value) {
		return new JAXBElement<GenQuery>(_GenQuery_QNAME, GenQuery.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GenQueryResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "genQueryResponse")
	public JAXBElement<GenQueryResponse> createGenQueryResponse(
			GenQueryResponse value) {
		return new JAXBElement<GenQueryResponse>(_GenQueryResponse_QNAME,
				GenQueryResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GenQueryView }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "genQueryView")
	public JAXBElement<GenQueryView> createGenQueryView(GenQueryView value) {
		return new JAXBElement<GenQueryView>(_GenQueryView_QNAME,
				GenQueryView.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GenQueryViewResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://logic.com/", name = "genQueryViewResponse")
	public JAXBElement<GenQueryViewResponse> createGenQueryViewResponse(
			GenQueryViewResponse value) {
		return new JAXBElement<GenQueryViewResponse>(
				_GenQueryViewResponse_QNAME, GenQueryViewResponse.class, null,
				value);
	}

}
