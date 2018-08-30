package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.model.soa.Address;
import com.telekommalaysia.portal.admin.model.soa.employee.Tenancies;
import com.telekommalaysia.portal.admin.model.soa.sap.RefundDetails;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerProfileDTO extends Address implements Serializable {

	private static final long serialVersionUID = 3305031522541684914L;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("RequestID")
	private String requestID;

	@JsonProperty("Email")
	private String portalLoginId;

	@JsonProperty("NationalIDNo")
	private String dubaMembershipNumber;

	@JsonProperty("ValidTo")
	private String dubaExpiryDate;

	@JsonProperty("IDNo")
	private String identificationNumber;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("Country")
	private String issuanceCountry;

	@JsonProperty("Nationality")
	private String nationality;

	@JsonProperty("HomeNo")
	private String homePhone;

	@JsonProperty("MobileNo")
	private String mobilePhone;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("LastName")
	private String lastName;

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

	public List<Tenancies> getTenancies() {
		return tenancies;
	}

	public void setTenancies(List<Tenancies> tenancies) {
		this.tenancies = tenancies;
	}

	public ProfileCarParkInfo getCarParkInfo() {
		return carParkInfo;
	}

	public void setCarParkInfo(ProfileCarParkInfo carParkInfo) {
		this.carParkInfo = carParkInfo;
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

	public List<ProfileEmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(List<ProfileEmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public List<ProfileContract> getContract() {
		return contract;
	}

	public void setContract(List<ProfileContract> contract) {
		this.contract = contract;
	}

	public List<ProfileBPDetails> getBpDetails() {
		return bpDetails;
	}

	public void setBpDetails(List<ProfileBPDetails> bpDetails) {
		this.bpDetails = bpDetails;
	}

	public String getPortalLoginId() {
		return portalLoginId;
	}

	public void setPortalLoginId(String portalLoginId) {
		this.portalLoginId = portalLoginId;
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

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIssuanceCountry() {
		return issuanceCountry;
	}

	public void setIssuanceCountry(String issuanceCountry) {
		this.issuanceCountry = issuanceCountry;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
