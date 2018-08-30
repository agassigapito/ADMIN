package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TenanciesDTO {

	@JsonProperty("BPNo")
	private String bpNo;

	@JsonProperty("CompanyCode")
	private String companyCode;

	@JsonProperty("ContractNo")
	private String contractNo;

	@JsonProperty("BuildingAccessCode")
	private String buildingAccessCode;

	@JsonProperty("BuildingName")
	private String buildingName;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTO;

	@JsonProperty("BuildingStatus")
	private String buildingStatus;

	public String getBpNo() {
		return bpNo;
	}

	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getBuildingAccessCode() {
		return buildingAccessCode;
	}

	public void setBuildingAccessCode(String buildingAccessCode) {
		this.buildingAccessCode = buildingAccessCode;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTO() {
		return validTO;
	}

	public void setValidTO(String validTO) {
		this.validTO = validTO;
	}

	public String getBuildingStatus() {
		return buildingStatus;
	}

	public void setBuildingStatus(String buildingStatus) {
		this.buildingStatus = buildingStatus;
	}

}
