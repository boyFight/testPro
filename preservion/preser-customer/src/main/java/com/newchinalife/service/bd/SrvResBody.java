package com.newchinalife.service.bd;

import com.newchinalife.service.hd.SRVResHead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SrvResBody complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SrvResBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bizHeader" type="{http://www.newchinalife.com/service/hd}SRVResHead"/>
 *         &lt;element name="bizBody" type="{http://www.newchinalife.com/service/bd}SrvResBizBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvResBody", propOrder = { "bizHeader", "bizBody" })
public class SrvResBody {

	@XmlElement(required = true)
	protected SRVResHead bizHeader;
	@XmlElement(required = true)
	protected SrvResBizBody bizBody;

	/**
	 * Gets the value of the bizHeader property.
	 * 
	 * @return possible object is {@link SRVResHead }
	 * 
	 */
	public SRVResHead getBizHeader() {
		return bizHeader;
	}

	/**
	 * Sets the value of the bizHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link SRVResHead }
	 * 
	 */
	public void setBizHeader(SRVResHead value) {
		this.bizHeader = value;
	}

	/**
	 * Gets the value of the bizBody property.
	 * 
	 * @return possible object is {@link SrvResBizBody }
	 * 
	 */
	public SrvResBizBody getBizBody() {
		return bizBody;
	}

	/**
	 * Sets the value of the bizBody property.
	 * 
	 * @param value
	 *            allowed object is {@link SrvResBizBody }
	 * 
	 */
	public void setBizBody(SrvResBizBody value) {
		this.bizBody = value;
	}

}
