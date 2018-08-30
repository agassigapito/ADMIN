package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.model.soa.Address;
import com.telekommalaysia.portal.admin.model.soa.employee.Tenancies;
import com.telekommalaysia.portal.admin.model.soa.sap.RefundDetails;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateProfileDTO extends Address implements Serializable {

	private static final long serialVersionUID = -310148711371426638L;

	@JsonProperty("Type")
	private String type;
	
	@JsonProperty("RequestID")
	private String requestID;
	
	@JsonProperty("Email")
	private String portalLoginId;
	
	@JsonProperty("OrganizationName")
	private String companyName;
	
	@JsonProperty("CompanyRegistrationNo")
	private String companyRegistrationNumber;
	
	@JsonProperty("NationalIDNo")
	private String dubaMembershipNumber;

	@JsonProperty("ValidTo")
	private String dubaExpiryDate;
	
	@Column(name = "OFFICE_PHONE")
	private String officePhone;
	
	@JsonProperty("FaxNo")
	private String fax;
	
	@JsonProperty("BPDetails")
	private List<ProfileBPDetails> bpDetails;
	
	@JsonProperty("RefundDetails")
	private List<RefundDetails> refundDetails;
	
	@JsonProperty("CardHolder")
	private List<ProfileCardHolder> cardHolder;
	
	@JsonProperty("EmployeeDetails")
	private List<ProfileEmployeeDetails> employeeDetails;
	
	@JsonProperty("Contract")
	private List<ProfileContract> contract;
	
	@JsonProperty("CarParkInfo")
	private ProfileCarParkInfo carParkInfo;
	
	@JsonProperty("Tenancies")
	private List<Tenancies> tenancies;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public List<ProfileBPDetails> getBpDetails() {
		return bpDetails;
	}

	public void setBpDetails(List<ProfileBPDetails> bpDetails) {
		this.bpDetails = bpDetails;
	}

	public List<RefundDetails> getRefundDetails() {
		return refundDetails;
	}

	public void setRefundDetails(List<RefundDetails> refundDetails) {
		this.refundDetails = refundDetails;
	}

	public List<ProfileCardHolder> getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(List<ProfileCardHolder> cardHolder) {
		this.cardHolder = cardHolder;
	}

	public List<ProfileContract> getContract() {
		return contract;
	}

	public void setContract(List<ProfileContract> contract) {
		this.contract = contract;
	}

	public ProfileCarParkInfo getCarParkInfo() {
		return carParkInfo;
	}

	public void setCarParkInfo(ProfileCarParkInfo carParkInfo) {
		this.carParkInfo = carParkInfo;
	}

	public List<Tenancies> getTenancies() {
		return tenancies;
	}

	public void setTenancies(List<Tenancies> tenancies) {
		this.tenancies = tenancies;
	}

	public List<ProfileEmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(List<ProfileEmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}


	public String getPortalLoginId() {
		return portalLoginId;
	}

	public void setPortalLoginId(String portalLoginId) {
		this.portalLoginId = portalLoginId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	public String getDubaMembershipNumber() {
		return dubaMembershipNumber;
	}

	public void setDubaMembershipNumber(String dubaMembershipNumber) {
		this.dubaMembershipNumber = dubaMembershipNumber;
	}

	public String getDubaExpiryDate() {
		return dubaExpiryDate;
	}

	public void setDubaExpiryDate(String dubaExpiryDate) {
		this.dubaExpiryDate = dubaExpiryDate;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
}
