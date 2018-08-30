package com.telekommalaysia.portal.admin.dto.soa;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardHoldersDTO {

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("Nationality")
	private String nationality;

	@JsonProperty("IDNo")
	private String idNo;

	@JsonProperty("NationalIDNo")
	private String nationalIDNo;

	@JsonProperty("FirstName")
	private String fName;

	@JsonProperty("LastName")
	private String lName;

	@JsonProperty("EmployeeID")
	private String EID;

	// @JsonProperty("CompanyBPNo")
	// private String companyBPNo;

	@JsonProperty("Email")
	private String email;

	@JsonProperty("CardholderStatus")
	private String cardHolderStatus;

	@JsonProperty("CardStatus")
	private String cardStatus;

	@JsonProperty("CardholderID")
	private Integer cardHolderId;

	@JsonProperty("CardInventoryNo")
	private Long accessCardNumber;

	@JsonProperty("AddLine1")
	private String address1;

	@JsonProperty("AddLine2")
	private String address2;

	@JsonProperty("Postcode")
	private String postalCode;

	@JsonProperty("State")
	private String state;

	@JsonProperty("BPNo")
	private String bpNo;

	@JsonProperty("City")
	private String city;

	@JsonProperty("Country")
	private String country;

	@JsonProperty("HomeNo")
	private String HomePhone;

	@JsonProperty("MobileNo")
	private String mobileNo;

	@JsonProperty("CPDetails")
	private Set<CarparkDTO> setOfCarparks = new HashSet<>();

	@JsonProperty("Tenancies")
	private Set<TenanciesDTO> setOfTenancies = new HashSet<>();

	public String getBpNo() {
		return bpNo;
	}

	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePhone() {
		return HomePhone;
	}

	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getNationalIDNo() {
		return nationalIDNo;
	}

	public void setNationalIDNo(String nationalIDNo) {
		this.nationalIDNo = nationalIDNo;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		EID = eID;
	}

	// public String getCompanyBPNo() {
	// return companyBPNo;
	// }
	//
	// public void setCompanyBPNo(String companyBPNo) {
	// this.companyBPNo = companyBPNo;
	// }

	// public String getEmail() {
	// return email;
	// }
	//
	// public void setEmail(String email) {
	// this.email = email;
	// }

	public String getCardHolderStatus() {
		return cardHolderStatus;
	}

	public void setCardHolderStatus(String cardHolderStatus) {
		this.cardHolderStatus = cardHolderStatus;
	}

	public Integer getCardHolderId() {
		return cardHolderId;
	}

	public void setCardHolderId(Integer cardHolderId) {
		this.cardHolderId = cardHolderId;
	}

	public Long getAccessCardNumber() {
		return accessCardNumber;
	}

	public void setAccessCardNumber(Long accessCardNumber) {
		this.accessCardNumber = accessCardNumber;
	}

	public Set<CarparkDTO> getSetOfCarparks() {
		return setOfCarparks;
	}

	public void setSetOfCarparks(Set<CarparkDTO> setOfCarparks) {
		this.setOfCarparks = setOfCarparks;
	}

	public Set<TenanciesDTO> getSetOfTenancies() {
		return setOfTenancies;
	}

	public void setSetOfTenancies(Set<TenanciesDTO> setOfTenancies) {
		this.setOfTenancies = setOfTenancies;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

}
