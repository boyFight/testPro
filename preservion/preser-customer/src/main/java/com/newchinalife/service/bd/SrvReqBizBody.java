package com.newchinalife.service.bd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SrvReqBizBody complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SrvReqBizBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputData" type="{http://www.newchinalife.com/service/bd}InputData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvReqBizBody", propOrder = { "inputData" })
public class SrvReqBizBody {

	@XmlElement(name = "InputData", required = true)
	protected InputData inputData;

	/**
	 * Gets the value of the inputData property.
	 * 
	 * @return possible object is {@link InputData }
	 * 
	 */
	public InputData getInputData() {
		return inputData;
	}

	/**
	 * Sets the value of the inputData property.
	 * 
	 * @param value
	 *            allowed object is {@link InputData }
	 * 
	 */
	public void setInputData(InputData value) {
		this.inputData = value;
	}

}
