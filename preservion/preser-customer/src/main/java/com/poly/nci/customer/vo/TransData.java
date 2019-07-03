package com.poly.nci.customer.vo;

import com.newchinalife.service.bd.InputData;
import com.newchinalife.service.bd.OutputData;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

@XStreamAlias("TransData")
public class TransData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8958891199046997569L;
	@XStreamAlias("BaseInfo")
	private com.poly.nci.customer.vo.BaseInfo BaseInfo;
	@XStreamAlias("InputData")
	private com.newchinalife.service.bd.InputData InputData;
	@XStreamAlias("OutputData")
	private com.newchinalife.service.bd.OutputData OutputData;

	public BaseInfo getBaseInfo() {
		return BaseInfo;
	}

	public void setBaseInfo(BaseInfo baseInfo) {
		BaseInfo = baseInfo;
	}

	public InputData getInputData() {
		return InputData;
	}

	public void setInputData(InputData inputData) {
		InputData = inputData;
	}

	public OutputData getOutputData() {
		return OutputData;
	}

	public void setOutputData(OutputData outputData) {
		OutputData = outputData;
	}

	@Override
	public String toString() {
		return "TransData [BaseInfo=" + BaseInfo.toString() + ", InputData="
				+ InputData.toString() + ", OutputData=" + OutputData != null ? OutputData
				.toString() : "" + "]";
	}
}
