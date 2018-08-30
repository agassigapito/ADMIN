package com.telekommalaysia.portal.admin.dto.soa.rentalobject;

import java.util.List;

import org.apache.http.annotation.Contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RentalObjectSOA {

	@JsonProperty("CompanyCode")
	private String companyCode;

	@JsonProperty("BusinessEntityNo")
	private String businessEntNum;

	@JsonProperty("BuildingNo")
	private String bldgNum;

	@JsonProperty("RentalObjectNo")
	private String roNum;

	@JsonProperty("UsageType")
	private String usageType;

	@JsonProperty("Contract")
	private List<Contract> contracts;

	@JsonProperty("ConditionTypes")
	private List<ConditionType> conditionTypes;

	@JsonProperty("MeasurementTypes")
	private List<MeasurementType> measurementTypes;

	@JsonProperty("Floor")
	private String floor;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getBusinessEntNum() {
		return businessEntNum;
	}

	public void setBusinessEntNum(String businessEntNum) {
		this.businessEntNum = businessEntNum;
	}

	public String getBldgNum() {
		return bldgNum;
	}

	public void setBldgNum(String bldgNum) {
		this.bldgNum = bldgNum;
	}

	public String getRoNum() {
		return roNum;
	}

	public void setRoNum(String roNum) {
		this.roNum = roNum;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public List<ConditionType> getConditionTypes() {
		return conditionTypes;
	}

	public void setConditionTypes(List<ConditionType> condType) {
		this.conditionTypes = condType;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public List<MeasurementType> getMeasurementTypes() {
		return measurementTypes;
	}

	public void setMeasurementTypes(List<MeasurementType> measurementTypes) {
		this.measurementTypes = measurementTypes;
	}

}
