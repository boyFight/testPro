package com.newchinalife.service.bd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Result complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppBirthday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppSex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerGrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerGradeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarryState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NativePlaceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NativePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Managecom2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Managecom3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicenseTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicenseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OccupationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OccupationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OccupationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostalAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankAcc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PayLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GrpName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OccupationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppntSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppntIDEffStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppntIDEffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACSuccessCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = { "appName", "appBirthday", "appSex",
		"customerGrade", "customerGradeCode", "marryCode", "marryState",
		"appAge", "nativePlaceCode", "nativePlace", "idTypeCode", "idType",
		"idNo", "appNo", "managecom2", "managecom3", "licenseTypeCode",
		"licenseType", "occupationCode", "occupationName", "occupationType",
		"mobile", "companyPhone", "fax", "homePhone", "postalAddress",
		"zipCode", "eMail", "provinceCode", "province", "cityCode", "city",
		"countyCode", "county", "stree", "bankCode", "bank", "bankAcc",
		"bankAccName", "payLocationCode", "payLocation", "grpName",
		"occupationTypeCode", "age", "appntSex", "agentCom", "agentName",
		"appntIDEffStartDate", "appntIDEffEndDate", "acSuccessCount" })
public class Result {

	@XmlElement(name = "AppName", required = true)
	protected String appName;
	@XmlElement(name = "AppBirthday", required = true)
	protected String appBirthday;
	@XmlElement(name = "AppSex", required = true)
	protected String appSex;
	@XmlElement(name = "CustomerGrade", required = true)
	protected String customerGrade;
	@XmlElement(name = "CustomerGradeCode", required = true)
	protected String customerGradeCode;
	@XmlElement(name = "MarryCode", required = true)
	protected String marryCode;
	@XmlElement(name = "MarryState", required = true)
	protected String marryState;
	@XmlElement(name = "AppAge", required = true)
	protected String appAge;
	@XmlElement(name = "NativePlaceCode", required = true)
	protected String nativePlaceCode;
	@XmlElement(name = "NativePlace", required = true)
	protected String nativePlace;
	@XmlElement(name = "IdTypeCode", required = true)
	protected String idTypeCode;
	@XmlElement(name = "IdType", required = true)
	protected String idType;
	@XmlElement(name = "IdNo", required = true)
	protected String idNo;
	@XmlElement(name = "AppNo", required = true)
	protected String appNo;
	@XmlElement(name = "Managecom2", required = true)
	protected String managecom2;
	@XmlElement(name = "Managecom3", required = true)
	protected String managecom3;
	@XmlElement(name = "LicenseTypeCode", required = true)
	protected String licenseTypeCode;
	@XmlElement(name = "LicenseType", required = true)
	protected String licenseType;
	@XmlElement(name = "OccupationCode", required = true)
	protected String occupationCode;
	@XmlElement(name = "OccupationName", required = true)
	protected String occupationName;
	@XmlElement(name = "OccupationType", required = true)
	protected String occupationType;
	@XmlElement(name = "Mobile", required = true)
	protected String mobile;
	@XmlElement(name = "CompanyPhone", required = true)
	protected String companyPhone;
	@XmlElement(name = "Fax", required = true)
	protected String fax;
	@XmlElement(name = "HomePhone", required = true)
	protected String homePhone;
	@XmlElement(name = "PostalAddress", required = true)
	protected String postalAddress;
	@XmlElement(name = "ZipCode", required = true)
	protected String zipCode;
	@XmlElement(name = "EMail", required = true)
	protected String eMail;
	@XmlElement(name = "ProvinceCode", required = true)
	protected String provinceCode;
	@XmlElement(name = "Province", required = true)
	protected String province;
	@XmlElement(name = "CityCode", required = true)
	protected String cityCode;
	@XmlElement(name = "City", required = true)
	protected String city;
	@XmlElement(name = "CountyCode", required = true)
	protected String countyCode;
	@XmlElement(name = "County", required = true)
	protected String county;
	@XmlElement(name = "Stree", required = true)
	protected String stree;
	@XmlElement(name = "BankCode", required = true)
	protected String bankCode;
	@XmlElement(name = "Bank", required = true)
	protected String bank;
	@XmlElement(name = "BankAcc", required = true)
	protected String bankAcc;
	@XmlElement(name = "BankAccName", required = true)
	protected String bankAccName;
	@XmlElement(name = "PayLocationCode", required = true)
	protected String payLocationCode;
	@XmlElement(name = "PayLocation", required = true)
	protected String payLocation;
	@XmlElement(name = "GrpName", required = true)
	protected String grpName;
	@XmlElement(name = "OccupationTypeCode", required = true)
	protected String occupationTypeCode;
	@XmlElement(name = "Age", required = true)
	protected String age;
	@XmlElement(name = "AppntSex")
	protected String appntSex;
	@XmlElement(name = "AgentCom")
	protected String agentCom;
	@XmlElement(name = "AgentName")
	protected String agentName;
	@XmlElement(name = "AppntIDEffStartDate")
	protected String appntIDEffStartDate;
	@XmlElement(name = "AppntIDEffEndDate")
	protected String appntIDEffEndDate;
	@XmlElement(name = "ACSuccessCount")
	protected String acSuccessCount;

	/**
	 * Gets the value of the appName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * Sets the value of the appName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppName(String value) {
		this.appName = value;
	}

	/**
	 * Gets the value of the appBirthday property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppBirthday() {
		return appBirthday;
	}

	/**
	 * Sets the value of the appBirthday property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppBirthday(String value) {
		this.appBirthday = value;
	}

	/**
	 * Gets the value of the appSex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppSex() {
		return appSex;
	}

	/**
	 * Sets the value of the appSex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppSex(String value) {
		this.appSex = value;
	}

	/**
	 * Gets the value of the customerGrade property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerGrade() {
		return customerGrade;
	}

	/**
	 * Sets the value of the customerGrade property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerGrade(String value) {
		this.customerGrade = value;
	}

	/**
	 * Gets the value of the customerGradeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerGradeCode() {
		return customerGradeCode;
	}

	/**
	 * Sets the value of the customerGradeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerGradeCode(String value) {
		this.customerGradeCode = value;
	}

	/**
	 * Gets the value of the marryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarryCode() {
		return marryCode;
	}

	/**
	 * Sets the value of the marryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarryCode(String value) {
		this.marryCode = value;
	}

	/**
	 * Gets the value of the marryState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarryState() {
		return marryState;
	}

	/**
	 * Sets the value of the marryState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarryState(String value) {
		this.marryState = value;
	}

	/**
	 * Gets the value of the appAge property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppAge() {
		return appAge;
	}

	/**
	 * Sets the value of the appAge property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppAge(String value) {
		this.appAge = value;
	}

	/**
	 * Gets the value of the nativePlaceCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNativePlaceCode() {
		return nativePlaceCode;
	}

	/**
	 * Sets the value of the nativePlaceCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNativePlaceCode(String value) {
		this.nativePlaceCode = value;
	}

	/**
	 * Gets the value of the nativePlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNativePlace() {
		return nativePlace;
	}

	/**
	 * Sets the value of the nativePlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNativePlace(String value) {
		this.nativePlace = value;
	}

	/**
	 * Gets the value of the idTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdTypeCode() {
		return idTypeCode;
	}

	/**
	 * Sets the value of the idTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdTypeCode(String value) {
		this.idTypeCode = value;
	}

	/**
	 * Gets the value of the idType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * Sets the value of the idType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdType(String value) {
		this.idType = value;
	}

	/**
	 * Gets the value of the idNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * Sets the value of the idNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdNo(String value) {
		this.idNo = value;
	}

	/**
	 * Gets the value of the appNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppNo() {
		return appNo;
	}

	/**
	 * Sets the value of the appNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppNo(String value) {
		this.appNo = value;
	}

	/**
	 * Gets the value of the managecom2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManagecom2() {
		return managecom2;
	}

	/**
	 * Sets the value of the managecom2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManagecom2(String value) {
		this.managecom2 = value;
	}

	/**
	 * Gets the value of the managecom3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManagecom3() {
		return managecom3;
	}

	/**
	 * Sets the value of the managecom3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManagecom3(String value) {
		this.managecom3 = value;
	}

	/**
	 * Gets the value of the licenseTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLicenseTypeCode() {
		return licenseTypeCode;
	}

	/**
	 * Sets the value of the licenseTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLicenseTypeCode(String value) {
		this.licenseTypeCode = value;
	}

	/**
	 * Gets the value of the licenseType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLicenseType() {
		return licenseType;
	}

	/**
	 * Sets the value of the licenseType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLicenseType(String value) {
		this.licenseType = value;
	}

	/**
	 * Gets the value of the occupationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupationCode() {
		return occupationCode;
	}

	/**
	 * Sets the value of the occupationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccupationCode(String value) {
		this.occupationCode = value;
	}

	/**
	 * Gets the value of the occupationName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupationName() {
		return occupationName;
	}

	/**
	 * Sets the value of the occupationName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccupationName(String value) {
		this.occupationName = value;
	}

	/**
	 * Gets the value of the occupationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupationType() {
		return occupationType;
	}

	/**
	 * Sets the value of the occupationType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccupationType(String value) {
		this.occupationType = value;
	}

	/**
	 * Gets the value of the mobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the value of the mobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobile(String value) {
		this.mobile = value;
	}

	/**
	 * Gets the value of the companyPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyPhone() {
		return companyPhone;
	}

	/**
	 * Sets the value of the companyPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyPhone(String value) {
		this.companyPhone = value;
	}

	/**
	 * Gets the value of the fax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the value of the fax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFax(String value) {
		this.fax = value;
	}

	/**
	 * Gets the value of the homePhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * Sets the value of the homePhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHomePhone(String value) {
		this.homePhone = value;
	}

	/**
	 * Gets the value of the postalAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostalAddress() {
		return postalAddress;
	}

	/**
	 * Sets the value of the postalAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPostalAddress(String value) {
		this.postalAddress = value;
	}

	/**
	 * Gets the value of the zipCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the value of the zipCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZipCode(String value) {
		this.zipCode = value;
	}

	/**
	 * Gets the value of the eMail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEMail() {
		return eMail;
	}

	/**
	 * Sets the value of the eMail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEMail(String value) {
		this.eMail = value;
	}

	/**
	 * Gets the value of the provinceCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvinceCode() {
		return provinceCode;
	}

	/**
	 * Sets the value of the provinceCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProvinceCode(String value) {
		this.provinceCode = value;
	}

	/**
	 * Gets the value of the province property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the value of the province property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProvince(String value) {
		this.province = value;
	}

	/**
	 * Gets the value of the cityCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * Sets the value of the cityCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCityCode(String value) {
		this.cityCode = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the countyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountyCode() {
		return countyCode;
	}

	/**
	 * Sets the value of the countyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountyCode(String value) {
		this.countyCode = value;
	}

	/**
	 * Gets the value of the county property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * Sets the value of the county property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCounty(String value) {
		this.county = value;
	}

	/**
	 * Gets the value of the stree property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStree() {
		return stree;
	}

	/**
	 * Sets the value of the stree property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStree(String value) {
		this.stree = value;
	}

	/**
	 * Gets the value of the bankCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * Sets the value of the bankCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankCode(String value) {
		this.bankCode = value;
	}

	/**
	 * Gets the value of the bank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * Sets the value of the bank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBank(String value) {
		this.bank = value;
	}

	/**
	 * Gets the value of the bankAcc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankAcc() {
		return bankAcc;
	}

	/**
	 * Sets the value of the bankAcc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankAcc(String value) {
		this.bankAcc = value;
	}

	/**
	 * Gets the value of the bankAccName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankAccName() {
		return bankAccName;
	}

	/**
	 * Sets the value of the bankAccName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankAccName(String value) {
		this.bankAccName = value;
	}

	/**
	 * Gets the value of the payLocationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPayLocationCode() {
		return payLocationCode;
	}

	/**
	 * Sets the value of the payLocationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPayLocationCode(String value) {
		this.payLocationCode = value;
	}

	/**
	 * Gets the value of the payLocation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPayLocation() {
		return payLocation;
	}

	/**
	 * Sets the value of the payLocation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPayLocation(String value) {
		this.payLocation = value;
	}

	/**
	 * Gets the value of the grpName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGrpName() {
		return grpName;
	}

	/**
	 * Sets the value of the grpName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGrpName(String value) {
		this.grpName = value;
	}

	/**
	 * Gets the value of the occupationTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupationTypeCode() {
		return occupationTypeCode;
	}

	/**
	 * Sets the value of the occupationTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccupationTypeCode(String value) {
		this.occupationTypeCode = value;
	}

	/**
	 * Gets the value of the age property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Sets the value of the age property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAge(String value) {
		this.age = value;
	}

	/**
	 * Gets the value of the appntSex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppntSex() {
		return appntSex;
	}

	/**
	 * Sets the value of the appntSex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppntSex(String value) {
		this.appntSex = value;
	}

	/**
	 * Gets the value of the agentCom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgentCom() {
		return agentCom;
	}

	/**
	 * Sets the value of the agentCom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgentCom(String value) {
		this.agentCom = value;
	}

	/**
	 * Gets the value of the agentName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * Sets the value of the agentName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgentName(String value) {
		this.agentName = value;
	}

	/**
	 * Gets the value of the appntIDEffStartDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppntIDEffStartDate() {
		return appntIDEffStartDate;
	}

	/**
	 * Sets the value of the appntIDEffStartDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppntIDEffStartDate(String value) {
		this.appntIDEffStartDate = value;
	}

	/**
	 * Gets the value of the appntIDEffEndDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppntIDEffEndDate() {
		return appntIDEffEndDate;
	}

	/**
	 * Sets the value of the appntIDEffEndDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppntIDEffEndDate(String value) {
		this.appntIDEffEndDate = value;
	}

	/**
	 * Gets the value of the acSuccessCount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getACSuccessCount() {
		return acSuccessCount;
	}

	/**
	 * Sets the value of the acSuccessCount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setACSuccessCount(String value) {
		this.acSuccessCount = value;
	}

}
