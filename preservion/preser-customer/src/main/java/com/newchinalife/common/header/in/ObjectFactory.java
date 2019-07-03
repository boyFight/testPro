package com.newchinalife.common.header.in;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.newchinalife.common.header.in package.
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

	private final static QName _SysHeader_QNAME = new QName(
			"http://www.newchinalife.com/common/header/in", "sysHeader");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.newchinalife.common.header.in
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link SysMsgHeader }
	 * 
	 */
	public SysMsgHeader createSysMsgHeader() {
		return new SysMsgHeader();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SysMsgHeader }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.newchinalife.com/common/header/in", name = "sysHeader")
	public JAXBElement<SysMsgHeader> createSysHeader(SysMsgHeader value) {
		return new JAXBElement<SysMsgHeader>(_SysHeader_QNAME,
				SysMsgHeader.class, null, value);
	}

}
