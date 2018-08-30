package com.telekommalaysia.portal.admin.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessPartnerSoaDto {

	private String nationality;

	private String nricNo;

	private String duba;

	private String mobile;

	private String city;

	private String street1;

	private String street2;

	private String street3;

	@JsonProperty("Postcode")
	private String postcode;

	private String phone;

	private String comregno;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("TenancyAgreement")
	private boolean tenancyagreement = true;

	private String smartno = "1234";

	private String dubadate;

	private boolean smartstatus = true;

	private boolean carparkstatus = true;

	private boolean buildingstatus = true;

	private String sapno;

	private String name;

	private String email;

	private String accountType;

	private String accountSubType;

	@JsonFormat(pattern = "yyyy/MM/dd h:mm a")
	private Date lastLogon;

	private String status;

	private boolean locked;

	private boolean suspended;

	@JsonFormat(pattern = "yyyy/MM/dd h:mm a")
	private Date lastModified;

	private String lastModifiedBy;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("CompRegNo")
	public String getComregno() {
		return comregno;
	}

	@JsonProperty("CompanyRegistrationNo")
	public void setComregno(String comregno) {
		this.comregno = comregno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isTenancyagreement() {
		return tenancyagreement;
	}

	public void setTenancyagreement(boolean tenancyagreement) {
		this.tenancyagreement = tenancyagreement;
	}

	public String getSapno() {
		return sapno;
	}

	public void setSapno(String sapno) {
		this.sapno = sapno;
	}

	public String getSmartno() {
		return smartno;
	}

	public void setSmartno(String smartno) {
		this.smartno = smartno;
	}

	public boolean isSmartstatus() {
		return smartstatus;
	}

	public void setSmartstatus(boolean smartstatus) {
		this.smartstatus = smartstatus;
	}

	public boolean isCarparkstatus() {
		return carparkstatus;
	}

	public void setCarparkstatus(boolean carparkstatus) {
		this.carparkstatus = carparkstatus;
	}

	public boolean isBuildingstatus() {
		return buildingstatus;
	}

	public void setBuildingstatus(boolean buildingstatus) {
		this.buildingstatus = buildingstatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountSubType() {
		return accountSubType;
	}

	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}

	public Date getLastLogon() {
		return lastLogon;
	}

	public void setLastLogon(Date lastLogon) {
		this.lastLogon = lastLogon;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	@JsonProperty("Orgname3")
	public String getNationality() {
		return nationality;
	}

	@JsonProperty("Nationality")
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@JsonProperty("NricNo")
	public String getNricNo() {
		return nricNo;
	}

	@JsonProperty("NationalIDNo")
	public void setNricNo(String nricNo) {
		this.nricNo = nricNo;
	}

	@JsonProperty("DubaNo")
	public String getDuba() {
		return duba;
	}

	@JsonProperty("BusinessAssociationNo")
	public void setDuba(String duba) {
		this.duba = duba;
	}

	@JsonProperty("Mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonProperty("MobileNo")
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("Street1")
	public String getStreet1() {
		return street1;
	}

	@JsonProperty("AddLine1")
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@JsonProperty("Street2")
	public String getStreet2() {
		return street2;
	}

	@JsonProperty("AddLine2")
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	@JsonProperty("Street3")
	public String getStreet3() {
		return street3;
	}

	@JsonProperty("AddLine3")
	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@JsonProperty("Phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("HomeNo")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getDubadate() {
		return dubadate;
	}

	@JsonProperty("ValidTo")
	public void setDubadate(String dubadate) {
		this.dubadate = dubadate;
	}

}
