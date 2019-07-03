package com.newchinalife.service.hd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.newchinalife.service.hd package.
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

	private final static QName _SRVReqHead_QNAME = new QName(
			"http://www.newchinalife.com/service/hd", "SRVReqHead");
	private final static QName _SRVResHead_QNAME = new QName(
			"http://www.newchinalife.com/service/hd", "SRVResHead");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.newchinalife.service.hd
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SRVResHead }
	 * 
	 */
	public SRVResHead createSRVResHead() {
		return new SRVResHead();
	}

	/**
	 * Create an instance of {@link SRVReqHead }
	 * 
	 */
	public SRVReqHead createSRVReqHead() {
		return new SRVReqHead();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SRVReqHead }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.newchinalife.com/service/hd", name = "SRVReqHead")
	public JAXBElement<SRVReqHead> createSRVReqHead(SRVReqHead value) {
		return new JAXBElement<SRVReqHead>(_SRVReqHead_QNAME, SRVReqHead.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SRVResHead }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.newchinalife.com/service/hd", name = "SRVResHead")
	public JAXBElement<SRVResHead> createSRVResHead(SRVResHead value) {
		return new JAXBElement<SRVResHead>(_SRVResHead_QNAME, SRVResHead.class,
				null, value);
	}

}
