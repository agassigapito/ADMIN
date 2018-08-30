package com.telekommalaysia.portal.admin.dto.soa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.service.util.DateConverter;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContractDTO {

	@JsonProperty("BPDetails")
	private Set<BPItemDTO> bpItem = new HashSet<>();

	@JsonProperty("MeasurementTypes")
	private Set<MeasurementItemDTO> measurement = new HashSet<>();

	@JsonProperty("ContractNo")
	private String taNum;

	@JsonProperty("RentalObjects")
	private Set<RentalObjectItemDTO> setOfRentalObjects;

	private List<BuildingSoaDTO> lBldg;

	private String cpBldgName = "Starling";

	@JsonProperty("ValidFrom")
	private String startDate;

	@JsonProperty("DueDate")
	private String daysDue;

	@JsonProperty("ValidTo")
	private String endDate;

	@JsonProperty("ContractType")
	private String contractType;

	@JsonProperty("ContractStatus")
	private String contractStatus;

	@JsonProperty("ContractNoMain")
	private String contractNoMain;

	/**
	 * Getters and setters
	 */

	public Set<MeasurementItemDTO> getMeasurement() {
		return measurement;
	}

	public String getDaysDue() {
		return daysDue;
	}

	public void setDaysDue(String daysDue) {
		this.daysDue = daysDue;
	}

	public void setMeasurement(Set<MeasurementItemDTO> measurement) {
		this.measurement = measurement;
	}

	public Set<BPItemDTO> getBpItem() {
		return bpItem;
	}

	public void setBpItem(Set<BPItemDTO> bpItem) {
		this.bpItem = bpItem;
	}

	public String getTaNum() {
		return taNum;
	}

	public void setTaNum(String taNum) {
		this.taNum = taNum;
	}

	public Set<RentalObjectItemDTO> getSetOfRentalObjects() {
		return setOfRentalObjects;
	}

	public void setSetOfRentalObjects(Set<RentalObjectItemDTO> setOfRentalObjects) {
		this.setOfRentalObjects = setOfRentalObjects;
	}

	public List<BuildingSoaDTO> getlBldg() {
		return lBldg;
	}

	public void setlBldg(List<BuildingSoaDTO> lBldg) {
		this.lBldg = lBldg;
	}

	public String getCpBldgName() {
		return cpBldgName;
	}

	public void setCpBldgName(String cpBldgName) {
		this.cpBldgName = cpBldgName;
	}

	public String getStartDate() {
		DateConverter dateConverter = new DateConverter();
		return dateConverter.formatStringDate(startDate);
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getCustomEndDate() {
		DateConverter dateConverter = new DateConverter();
		return dateConverter.formatStringDate(endDate);
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractNoMain() {
		return contractNoMain;
	}

	public void setContractNoMain(String contractNoMain) {
		this.contractNoMain = contractNoMain;
	}

}
