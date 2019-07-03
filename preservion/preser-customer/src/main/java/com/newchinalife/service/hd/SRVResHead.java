package com.newchinalife.service.hd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;

/**
 * <p>
 * Java class for SRVResHead complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SRVResHead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RowNumStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PageFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalRowNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ManageCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRouteFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SRVResHead", propOrder = { "operator", "rowNumStart",
		"pageRowNum", "pageFlag", "totalRowNum", "orderFlag", "orderField",
		"manageCom", "riskCode", "contNo", "sysRouteFlag" })
public class SRVResHead {

	@XmlElement(name = "Operator", required = true)
	protected String operator;
	@XmlElement(name = "RowNumStart", required = true)
	protected String rowNumStart;
	@XmlElement(name = "PageRowNum", required = true)
	protected BigInteger pageRowNum;
	@XmlElement(name = "PageFlag", required = true)
	protected String pageFlag;
	@XmlElement(name = "TotalRowNum", required = true)
	protected String totalRowNum;
	@XmlElement(name = "OrderFlag", required = true)
	protected String orderFlag;
	@XmlElement(name = "OrderField", required = true)
	protected String orderField;
	@XmlElement(name = "ManageCom")
	protected String manageCom;
	@XmlElement(name = "RiskCode")
	protected String riskCode;
	@XmlElement(name = "ContNo")
	protected String contNo;
	@XmlElement(name = "SysRouteFlag")
	protected String sysRouteFlag;

	/**
	 * Gets the value of the operator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * Sets the value of the operator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperator(String value) {
		this.operator = value;
	}

	/**
	 * Gets the value of the rowNumStart property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRowNumStart() {
		return rowNumStart;
	}

	/**
	 * Sets the value of the rowNumStart property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRowNumStart(String value) {
		this.rowNumStart = value;
	}

	/**
	 * Gets the value of the pageRowNum property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getPageRowNum() {
		return pageRowNum;
	}

	/**
	 * Sets the value of the pageRowNum property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setPageRowNum(BigInteger value) {
		this.pageRowNum = value;
	}

	/**
	 * Gets the value of the pageFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPageFlag() {
		return pageFlag;
	}

	/**
	 * Sets the value of the pageFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPageFlag(String value) {
		this.pageFlag = value;
	}

	/**
	 * Gets the value of the totalRowNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalRowNum() {
		return totalRowNum;
	}

	/**
	 * Sets the value of the totalRowNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTotalRowNum(String value) {
		this.totalRowNum = value;
	}

	/**
	 * Gets the value of the orderFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderFlag() {
		return orderFlag;
	}

	/**
	 * Sets the value of the orderFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderFlag(String value) {
		this.orderFlag = value;
	}

	/**
	 * Gets the value of the orderField property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderField() {
		return orderField;
	}

	/**
	 * Sets the value of the orderField property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderField(String value) {
		this.orderField = value;
	}

	/**
	 * Gets the value of the manageCom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManageCom() {
		return manageCom;
	}

	/**
	 * Sets the value of the manageCom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManageCom(String value) {
		this.manageCom = value;
	}

	/**
	 * Gets the value of the riskCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRiskCode() {
		return riskCode;
	}

	/**
	 * Sets the value of the riskCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRiskCode(String value) {
		this.riskCode = value;
	}

	/**
	 * Gets the value of the contNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContNo() {
		return contNo;
	}

	/**
	 * Sets the value of the contNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContNo(String value) {
		this.contNo = value;
	}

	/**
	 * Gets the value of the sysRouteFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSysRouteFlag() {
		return sysRouteFlag;
	}

	/**
	 * Sets the value of the sysRouteFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSysRouteFlag(String value) {
		this.sysRouteFlag = value;
	}

}
