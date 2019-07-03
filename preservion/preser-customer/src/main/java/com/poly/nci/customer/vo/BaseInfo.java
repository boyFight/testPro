package com.poly.nci.customer.vo;



/**
 * 移动保全接口输入参数实体
 * @author leijie
 *
 */
public class BaseInfo{

	private String TransType;
	
	private String TransCode;
	
	private String SubTransCode;
	
	private String TransDate;
	
	private String TransTime;
	
	private String TransSeq;
	
	private String Operator;
	
	private String RowNumStart;
	
	private String PageRowNum;
	
	private String PageFlag;
	
	private String OrderFlag;
	
	private String OrderField;
	
	private String TotalRowNum;
	
	private String ResultCode;//响应结果代码 0正常  1出错
	
	private String ResultMsg;//响应结果信息
	
	

	public String getTransType() {
		return TransType;
	}

	public void setTransType(String transType) {
		TransType = transType;
	}

	public String getTransCode() {
		return TransCode;
	}

	public void setTransCode(String transCode) {
		TransCode = transCode;
	}

	public String getSubTransCode() {
		return SubTransCode;
	}

	public void setSubTransCode(String subTransCode) {
		SubTransCode = subTransCode;
	}

	public String getTransDate() {
		return TransDate;
	}

	public void setTransDate(String transDate) {
		TransDate = transDate;
	}

	public String getTransTime() {
		return TransTime;
	}

	public void setTransTime(String transTime) {
		TransTime = transTime;
	}

	public String getTransSeq() {
		return TransSeq;
	}

	public void setTransSeq(String transSeq) {
		TransSeq = transSeq;
	}

	public String getOperator() {
		return Operator;
	}

	public void setOperator(String operator) {
		Operator = operator;
	}

	public String getRowNumStart() {
		return RowNumStart;
	}

	public void setRowNumStart(String rowNumStart) {
		RowNumStart = rowNumStart;
	}

	public String getPageRowNum() {
		return PageRowNum;
	}

	public void setPageRowNum(String pageRowNum) {
		PageRowNum = pageRowNum;
	}

	public String getPageFlag() {
		return PageFlag;
	}

	public void setPageFlag(String pageFlag) {
		PageFlag = pageFlag;
	}

	public String getTotalRowNum() {
		return TotalRowNum;
	}

	public void setTotalRowNum(String totalRowNum) {
		TotalRowNum = totalRowNum;
	}

	public String getResultCode() {
		return ResultCode;
	}

	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}

	public String getResultMsg() {
		return ResultMsg;
	}

	public void setResultMsg(String resultMsg) {
		ResultMsg = resultMsg;
	}

	public String getOrderFlag() {
		return OrderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		OrderFlag = orderFlag;
	}

	public String getOrderField() {
		return OrderField;
	}

	public void setOrderField(String orderField) {
		OrderField = orderField;
	}
	
	public BaseInfo(String ResultCode,String ResultMsg){
		this.ResultCode = ResultCode;
		this.ResultMsg = ResultMsg;
	}
	
	public BaseInfo(){}
	
}
