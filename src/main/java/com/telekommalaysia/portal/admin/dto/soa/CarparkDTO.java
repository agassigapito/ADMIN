package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarparkDTO {

	@JsonProperty("ContractNo")
	private String contractID;
	private String contractNo;

	@JsonProperty("BuildingName")
	private String buildingName;

	@JsonProperty("BPNo")
	private String bpNo;

	@JsonProperty("BayNo")
	private String bayNum;
	
	@JsonProperty("BayLocation")
	private String bayLoc;

	@JsonProperty("BayType")
	private String bayType;

	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTo;

	@JsonProperty("CarParkStatus")
	private String cpStatus;
	
	@JsonProperty("ParkingType")
	private String parkingPrivilage;
	
	@JsonProperty("CarPlateNo")
	private String platenumber1;
	
	@JsonProperty("CarPlateNo2")
	private String platenumber2;
	
	@JsonProperty("CarModel")
	private String carBrandModel1;
	
	@JsonProperty("CarModel2")
	private String carBrandModel2;

	public String getBayLoc() {
		return bayLoc;
	}

	public void setBayLoc(String bayLoc) {
		this.bayLoc = bayLoc;
	}

	public String getParkingPrivilage() {
		return parkingPrivilage;
	}

	public String getBpNo() {
		return bpNo;
	}

	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}

	public void setParkingPrivilage(String parkingPrivilage) {
		this.parkingPrivilage = parkingPrivilage;
	}

	public String getPlatenumber1() {
		return platenumber1;
	}

	public void setPlatenumber1(String platenumber1) {
		this.platenumber1 = platenumber1;
	}

	public String getPlatenumber2() {
		return platenumber2;
	}

	public void setPlatenumber2(String platenumber2) {
		this.platenumber2 = platenumber2;
	}

	public String getCarBrandModel1() {
		return carBrandModel1;
	}

	public void setCarBrandModel1(String carBrandModel1) {
		this.carBrandModel1 = carBrandModel1;
	}

	public String getCarBrandModel2() {
		return carBrandModel2;
	}

	public void setCarBrandModel2(String carBrandModel2) {
		this.carBrandModel2 = carBrandModel2;
	}

	public String getCpStatus() {
		return cpStatus;
	}

	public void setCpStatus(String cpStatus) {
		this.cpStatus = cpStatus;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBayNum() {
		return bayNum;
	}

	public void setBayNum(String bayNum) {
		this.bayNum = bayNum;
	}

	public String getBayType() {
		return bayType;
	}

	public void setBayType(String bayType) {
		this.bayType = bayType;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

}
