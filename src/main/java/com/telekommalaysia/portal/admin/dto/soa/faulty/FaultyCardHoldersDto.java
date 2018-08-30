package com.telekommalaysia.portal.admin.dto.soa.faulty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.constant.Constants;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FaultyCardHoldersDto {

	private String smartcardNo;

	private String idType;

	private String companyName;

	private String firstName;

	private String lastName;

	private String identificationPassportNo;

	private List<String> turnstileAccess = new ArrayList<>();

	private String parkingBayType;

	private String building;

	private String level;

	private String bayNo;

	private String nationalIDNo;

	private String country;

	private String cardholderStatus;

	private String cardStatus;

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("nationalIDNo")
	public String getNationalIDNo() {
		return nationalIDNo;
	}

	@JsonProperty("NationalIDNo")
	public void setNationalIDNo(String nationalIDNo) {
		this.nationalIDNo = nationalIDNo;
	}

	@JsonProperty("idType")
	public String getIdType() {
		return idType;
	}

	@JsonProperty("IDType")
	public void setIdType(String idType) {
		this.idType = idType;
	}

	@JsonProperty("smartCardNo")
	public String getSmartcardNo() {
		return smartcardNo;
	}

	@JsonProperty("CardInventoryNo")
	public void setSmartcardNo(String smartcardNo) {
		this.smartcardNo = smartcardNo;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("CompanyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("idNo")
	public String getIdentificationPassportNo() {
		return identificationPassportNo;
	}

	@JsonProperty("IDNo")
	public void setIdentificationPassportNo(String identificationPassportNo) {
		this.identificationPassportNo = identificationPassportNo;
	}

	public List<String> getTurnstileAccess() {
		return turnstileAccess;
	}

	public void setTurnstileAccess(List<String> turnstileAccess) {
		this.turnstileAccess = turnstileAccess;
	}

	@JsonProperty("Tenancies")
	public void getBuiding(List<Map<String, String>> buildingList) {
		for (Map<String, String> building : buildingList) {
			if (building.get("BuildingStatus").equals("Active")
					| Constants.STATUS_INACTIVE.equalsIgnoreCase(building.get("BuildingStatus"))) {
				this.turnstileAccess.add(building.get("BuildingName"));
			}
		}
	}

	@JsonProperty("CPDetails")
	public void getCarpark(List<Map<String, String>> carparkList) {
		for (Map<String, String> carpark : carparkList) {
			if (carpark.get("CarParkStatus").equals("Active")
					| Constants.STATUS_INACTIVE.equalsIgnoreCase(carpark.get("CarParkStatus"))) {
				this.building = carpark.get("BuildingName");
				this.parkingBayType = carpark.get("BayType");
				this.level = carpark.get("BayLocation");
				this.bayNo = carpark.get("BayNo");
				break;
			}
		}
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

	public String getCardStatus() {
		return cardStatus;
	}

	@JsonProperty("CardStatus")
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardholderStatus() {
		return cardholderStatus;
	}

	@JsonProperty("CardholderStatus")
	public void setCardholderStatus(String cardholderStatus) {
		this.cardholderStatus = cardholderStatus;
	}


}
