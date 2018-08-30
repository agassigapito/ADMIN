package com.telekommalaysia.portal.admin.dto.soa.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.model.soa.Address;

public class ProfileBPDetails {
	
	@JsonProperty("FirstName")
	private String firstName = "";
	
	@JsonProperty("LastName")
	private String lastName  = "";
	
	@JsonProperty("LastName2")
	private String lastName2  = "";
	
	@JsonProperty("MiddleName")
	private String middleName  = "";
	
	@JsonProperty("NationalIDNo")
	private String nationalIDNo  = "";
	
	@JsonProperty("IDNo")
	private String idNo  = "";
	
	@JsonProperty("Gender")
	private String gender  = "";
	
	@JsonProperty("MobileNo")
	private String mobileNo  = "";
	
	@JsonProperty("HomeNo")
	private String homeNo  = "";
	
	@JsonProperty("Email")
	private String email  = "";
	
	@JsonProperty("BPNo")
	private String bpNo  = "";
	
	@JsonProperty("Language")
	private String language  = "";
	
	@JsonProperty("CorrespondanceLanguage")
	private String correspondanceLanguage  = "";
	
	@JsonProperty("Title")
	private String title  = "";
	
	@JsonProperty("BPCategory")
	private String bpCategory  = "";
	
	@JsonProperty("BPRole")
	private String bpRole  = "";
	
	@JsonProperty("CompanyName")
	private String companyName  = "";
	
	@JsonProperty("Address")
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNationalIDNo() {
		return nationalIDNo;
	}

	public void setNationalIDNo(String nationalIDNo) {
		this.nationalIDNo = nationalIDNo;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBpNo() {
		return bpNo;
	}

	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCorrespondanceLanguage() {
		return correspondanceLanguage;
	}

	public void setCorrespondanceLanguage(String correspondanceLanguage) {
		this.correspondanceLanguage = correspondanceLanguage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBpCategory() {
		return bpCategory;
	}

	public void setBpCategory(String bpCategory) {
		this.bpCategory = bpCategory;
	}

	public String getBpRole() {
		return bpRole;
	}

	public void setBpRole(String bpRole) {
		this.bpRole = bpRole;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
