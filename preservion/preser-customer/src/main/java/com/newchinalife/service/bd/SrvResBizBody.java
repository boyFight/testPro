package com.newchinalife.service.bd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SrvResBizBody complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SrvResBizBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputData" type="{http://www.newchinalife.com/service/bd}OutputData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvResBizBody", propOrder = { "outputData" })
public class SrvResBizBody {

	@XmlElement(name = "OutputData", required = true)
	protected OutputData outputData;

	/**
	 * Gets the value of the outputData property.
	 * 
	 * @return possible object is {@link OutputData }
	 * 
	 */
	public OutputData getOutputData() {
		return outputData;
	}

	/**
	 * Sets the value of the outputData property.
	 * 
	 * @param value
	 *            allowed object is {@link OutputData }
	 * 
	 */
	public void setOutputData(OutputData value) {
		this.outputData = value;
	}

}
