package com.newchinalife.service.bd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.newchinalife.service.bd package.
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

	private final static QName _Request_QNAME = new QName(
			"http://www.newchinalife.com/service/bd", "request");
	private final static QName _Response_QNAME = new QName(
			"http://www.newchinalife.com/service/bd", "response");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.newchinalife.service.bd
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SrvReqBizBody }
	 * 
	 */
	public SrvReqBizBody createSrvReqBizBody() {
		return new SrvReqBizBody();
	}

	/**
	 * Create an instance of {@link SrvReqBody }
	 * 
	 */
	public SrvReqBody createSrvReqBody() {
		return new SrvReqBody();
	}

	/**
	 * Create an instance of {@link Result }
	 * 
	 */
	public Result createResult() {
		return new Result();
	}

	/**
	 * Create an instance of {@link SrvResBody }
	 * 
	 */
	public SrvResBody createSrvResBody() {
		return new SrvResBody();
	}

	/**
	 * Create an instance of {@link InputData }
	 * 
	 */
	public InputData createInputData() {
		return new InputData();
	}

	/**
	 * Create an instance of {@link OutputData }
	 * 
	 */
	public OutputData createOutputData() {
		return new OutputData();
	}

	/**
	 * Create an instance of {@link SrvResBizBody }
	 * 
	 */
	public SrvResBizBody createSrvResBizBody() {
		return new SrvResBizBody();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SrvReqBody }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.newchinalife.com/service/bd", name = "request")
	public JAXBElement<SrvReqBody> createRequest(SrvReqBody value) {
		return new JAXBElement<SrvReqBody>(_Request_QNAME, SrvReqBody.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SrvResBody }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.newchinalife.com/service/bd", name = "response")
	public JAXBElement<SrvResBody> createResponse(SrvResBody value) {
		return new JAXBElement<SrvResBody>(_Response_QNAME, SrvResBody.class,
				null, value);
	}

}
