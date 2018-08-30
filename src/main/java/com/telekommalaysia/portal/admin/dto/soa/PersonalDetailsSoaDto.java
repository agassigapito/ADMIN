package com.telekommalaysia.portal.admin.dto.soa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalDetailsSoaDto {

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("Nationality")
	private String nationality;

	@JsonProperty("FirstName")
	private String firstName;

	/**
	 * Check impact from SOA SIT alignment
	 */
	private String idType;// tobe in be if nric is present if not passport

	private String icCountry;// tobe in be if nric is present if not check 3 letters of passport

	private boolean isDubaActive;

	/**
	 * Getters and setters
	 */

	@JsonProperty("ValidTo")
	private String dubaValidTo;

	@JsonProperty("ValidFrom")
	private String dubaValidFrom;

	@JsonProperty("CarPlateNo")
	private String carPlate;

	private String carplate1;

	private String carplate2;

	@JsonProperty("Lastname")
	private String lastName;

	@JsonProperty("NationalIDNo") // id no
	private String nricNo;

	@JsonProperty("IDNo") // id no
	private String passportNo;

	@JsonProperty("BusinessAssociationNo")
	private String dubamemNo;

	@JsonProperty("AddLine1")
	private String address1;

	@JsonProperty("AddLine2")
	private String address2;

	@JsonProperty("AddLine3")
	private String address3;

	@JsonProperty("Postcode")
	private String postalCode;

	@JsonProperty("City")
	private String city;

	@JsonProperty("State")
	private String state;

	@JsonProperty("Country")
	private String country;

	@JsonProperty("HomeNo")
	private String homePhone;

	@JsonProperty("MobileNo")
	private String mobilePhone;

	@JsonProperty("Contract")
	private Set<ContractDTO> contracts = new HashSet<>();

	public boolean isDubaActive() {
		return isDubaActive;
	}

	public void setDubaActive(boolean isDubaActive) {
		this.isDubaActive = isDubaActive;
	}

	public String getDubaValidTo() {
		return dubaValidTo;
	}

	public void setDubaValidTo(String dubaValidTo) {
		this.dubaValidTo = dubaValidTo;
	}

	public String getDubaValidFrom() {
		return dubaValidFrom;
	}

	public void setDubaValidFrom(String dubaValidFrom) {
		this.dubaValidFrom = dubaValidFrom;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getCarplate1() {
		return carplate1;
	}

	public void setCarplate1(String carplate1) {
		this.carplate1 = carplate1;
	}

	public String getCarplate2() {
		return carplate2;
	}

	public void setCarplate2(String carplate2) {
		this.carplate2 = carplate2;
	}

	public Set<ContractDTO> getContracts() {
		return contracts;
	}

	public void setContracts(Set<ContractDTO> contracts) {
		this.contracts = contracts;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIcCountry() {
		return icCountry;
	}

	public void setIcCountry(String icCountry) {
		this.icCountry = icCountry;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNricNo() {
		return nricNo;
	}

	public void setNricNo(String nricNo) {
		this.nricNo = nricNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getDubamemNo() {
		return dubamemNo;
	}

	public void setDubamemNo(String dubamemNo) {
		this.dubamemNo = dubamemNo;
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

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

}
