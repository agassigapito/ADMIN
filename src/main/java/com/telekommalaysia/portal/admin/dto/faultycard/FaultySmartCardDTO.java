package com.telekommalaysia.portal.admin.dto.faultycard;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FaultySmartCardDTO {

	private Integer id;

	private String requestStatus;

	private String refNo;

	private String smartcardNo;

	private String companyName;

	private String firstName;

	private String lastName;

	private String identificationPassportNo;

	@JsonFormat(pattern = "dd/MM/yyyy h:mm a", timezone = "GMT+8")
	private Date dateCreated;

	private String replacementReason;

	private String identificationType;

	private String turnstileAccess;

	private String issuanceCountry;

	private String parkingBayType;

	private String building;

	private String level;

	private String bayNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getSmartcardNo() {
		return smartcardNo;
	}

	public void setSmartcardNo(String smartcardNo) {
		this.smartcardNo = smartcardNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getIdentificationPassportNo() {
		return identificationPassportNo;
	}

	public void setIdentificationPassportNo(String identificationPassportNo) {
		this.identificationPassportNo = identificationPassportNo;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getReplacementReason() {
		return replacementReason;
	}

	public void setReplacementReason(String replacementReason) {
		this.replacementReason = replacementReason;
	}

	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getTurnstileAccess() {
		return turnstileAccess;
	}

	public void setTurnstileAccess(String turnstileAccess) {
		this.turnstileAccess = turnstileAccess;
	}

	public String getIssuanceCountry() {
		return issuanceCountry;
	}

	public void setIssuanceCountry(String issuanceCountry) {
		this.issuanceCountry = issuanceCountry;
	}

	public String getParkingBayType() {
		return parkingBayType;
	}

	public void setParkingBayType(String parkingBayType) {
		this.parkingBayType = parkingBayType;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getBayNo() {
		return bayNo;
	}

	public void setBayNo(String bayNo) {
		this.bayNo = bayNo;
	}

}
