package com.newchinalife.service.bd;

import com.newchinalife.service.hd.SRVReqHead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SrvReqBody complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SrvReqBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bizHeader" type="{http://www.newchinalife.com/service/hd}SRVReqHead"/>
 *         &lt;element name="bizBody" type="{http://www.newchinalife.com/service/bd}SrvReqBizBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvReqBody", propOrder = { "bizHeader", "bizBody" })
public class SrvReqBody {

	@XmlElement(required = true)
	protected SRVReqHead bizHeader;
	@XmlElement(required = true)
	protected SrvReqBizBody bizBody;

	/**
	 * Gets the value of the bizHeader property.
	 * 
	 * @return possible object is {@link SRVReqHead }
	 * 
	 */
	public SRVReqHead getBizHeader() {
		return bizHeader;
	}

	/**
	 * Sets the value of the bizHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link SRVReqHead }
	 * 
	 */
	public void setBizHeader(SRVReqHead value) {
		this.bizHeader = value;
	}

	/**
	 * Gets the value of the bizBody property.
	 * 
	 * @return possible object is {@link SrvReqBizBody }
	 * 
	 */
	public SrvReqBizBody getBizBody() {
		return bizBody;
	}

	/**
	 * Sets the value of the bizBody property.
	 * 
	 * @param value
	 *            allowed object is {@link SrvReqBizBody }
	 * 
	 */
	public void setBizBody(SrvReqBizBody value) {
		this.bizBody = value;
	}

}
