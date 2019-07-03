package com.newchinalife.common.header.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SysMsgHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SysMsgHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value=".+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value="\d{2}:\d{2}:\d{2}.\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="servCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value=".+"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sysCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value=".+"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bizId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value=".+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bizType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value=".+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bizResCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bizResText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ver">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value=".+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysMsgHeader", propOrder = { "msgId", "msgDate", "msgTime",
		"servCd", "sysCd", "bizId", "bizType", "orgCd", "resCd", "resText",
		"bizResCd", "bizResText", "ver" })
public class SysMsgHeader {

	@XmlElement(required = true)
	protected String msgId;
	@XmlElement(required = true)
	protected String msgDate;
	@XmlElement(required = true)
	protected String msgTime;
	@XmlElement(required = true)
	protected String servCd;
	@XmlElement(required = true)
	protected String sysCd;
	@XmlElement(required = true)
	protected String bizId;
	@XmlElement(required = true)
	protected String bizType;
	@XmlElement(required = true)
	protected String orgCd;
	@XmlElement(required = true)
	protected String resCd;
	@XmlElement(required = true)
	protected String resText;
	@XmlElement(required = true)
	protected String bizResCd;
	@XmlElement(required = true)
	protected String bizResText;
	@XmlElement(required = true)
	protected String ver;

	/**
	 * Gets the value of the msgId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsgId() {
		return msgId;
	}

	/**
	 * Sets the value of the msgId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsgId(String value) {
		this.msgId = value;
	}

	/**
	 * Gets the value of the msgDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsgDate() {
		return msgDate;
	}

	/**
	 * Sets the value of the msgDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsgDate(String value) {
		this.msgDate = value;
	}

	/**
	 * Gets the value of the msgTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsgTime() {
		return msgTime;
	}

	/**
	 * Sets the value of the msgTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsgTime(String value) {
		this.msgTime = value;
	}

	/**
	 * Gets the value of the servCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServCd() {
		return servCd;
	}

	/**
	 * Sets the value of the servCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServCd(String value) {
		this.servCd = value;
	}

	/**
	 * Gets the value of the sysCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSysCd() {
		return sysCd;
	}

	/**
	 * Sets the value of the sysCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSysCd(String value) {
		this.sysCd = value;
	}

	/**
	 * Gets the value of the bizId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBizId() {
		return bizId;
	}

	/**
	 * Sets the value of the bizId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBizId(String value) {
		this.bizId = value;
	}

	/**
	 * Gets the value of the bizType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBizType() {
		return bizType;
	}

	/**
	 * Sets the value of the bizType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBizType(String value) {
		this.bizType = value;
	}

	/**
	 * Gets the value of the orgCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrgCd() {
		return orgCd;
	}

	/**
	 * Sets the value of the orgCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrgCd(String value) {
		this.orgCd = value;
	}

	/**
	 * Gets the value of the resCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResCd() {
		return resCd;
	}

	/**
	 * Sets the value of the resCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResCd(String value) {
		this.resCd = value;
	}

	/**
	 * Gets the value of the resText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResText() {
		return resText;
	}

	/**
	 * Sets the value of the resText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResText(String value) {
		this.resText = value;
	}

	/**
	 * Gets the value of the bizResCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBizResCd() {
		return bizResCd;
	}

	/**
	 * Sets the value of the bizResCd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBizResCd(String value) {
		this.bizResCd = value;
	}

	/**
	 * Gets the value of the bizResText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBizResText() {
		return bizResText;
	}

	/**
	 * Sets the value of the bizResText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBizResText(String value) {
		this.bizResText = value;
	}

	/**
	 * Gets the value of the ver property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVer() {
		return ver;
	}

	/**
	 * Sets the value of the ver property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVer(String value) {
		this.ver = value;
	}

}
