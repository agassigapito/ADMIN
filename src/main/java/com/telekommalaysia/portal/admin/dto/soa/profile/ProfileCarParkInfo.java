package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileCarParkInfo implements Serializable	 {

	private static final long serialVersionUID = 6584634863601064861L;
	
	@JsonProperty("BayLocation")
	private String bayLocation = "";
	
	@JsonProperty("BayNo")
	private String bayNo = "";
	
	@JsonProperty("BayType")
	private String bayType ="" ;
	
	@JsonProperty("BuildingName")
	private String buildingName = "" ;
	
	@JsonProperty("CarModel")
	private String carModel = "";
	
	@JsonProperty("CarModel2")
	private String carModel2 = "";
	
	@JsonProperty("CarPlateNo")
	private String carPlateNo = "";
	
	@JsonProperty("CarPlateNo2")
	private String carPlateNo2 = "";
	
	@JsonProperty("CarPlateNo3")
	private String carPlateNo3 = "";
	
	@JsonProperty("ParkingType")
	private String parkingType = "";
	
	@JsonProperty("ParkingTypeProfile")
	private String parkingTypeProfile = "";
	
	@JsonProperty("Status")
	private String status = "";

	public String getBayLocation() {
		return bayLocation;
	}

	public void setBayLocation(String bayLocation) {
		this.bayLocation = bayLocation;
	}

	public String getBayNo() {
		return bayNo;
	}

	public void setBayNo(String bayNo) {
		this.bayNo = bayNo;
	}

	public String getBayType() {
		return bayType;
	}

	public void setBayType(String bayType) {
		this.bayType = bayType;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarModel2() {
		return carModel2;
	}

	public void setCarModel2(String carModel2) {
		this.carModel2 = carModel2;
	}

	public String getCarPlateNo() {
		return carPlateNo;
	}

	public void setCarPlateNo(String carPlateNo) {
		this.carPlateNo = carPlateNo;
	}

	public String getCarPlateNo2() {
		return carPlateNo2;
	}

	public void setCarPlateNo2(String carPlateNo2) {
		this.carPlateNo2 = carPlateNo2;
	}

	public String getCarPlateNo3() {
		return carPlateNo3;
	}

	public void setCarPlateNo3(String carPlateNo3) {
		this.carPlateNo3 = carPlateNo3;
	}

	public String getParkingType() {
		return parkingType;
	}

	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	public String getParkingTypeProfile() {
		return parkingTypeProfile;
	}

	public void setParkingTypeProfile(String parkingTypeProfile) {
		this.parkingTypeProfile = parkingTypeProfile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
