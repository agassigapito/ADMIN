package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildingSoaDTO {

	@JsonProperty("BuildingStatus")
	private String buildingStatus;

	@JsonProperty("CompanyBPNo")
	private String companyBpNo;

	@JsonProperty("BuildingLoc")
	private String buildingLoc;
	
	@JsonProperty("TenancyID")
	private String tenancyId;

	@JsonProperty("ActivationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String activationDate;

	private AllotmentDTO allotmentDTO;

	
	
	public String getTenancyId() {
		return tenancyId;
	}

	public void setTenancyId(String tenancyId) {
		this.tenancyId = tenancyId;
	}

	public String getBuildingLoc() {
		return buildingLoc;
	}

	public void setBuildingLoc(String buildingLoc) {
		this.buildingLoc = buildingLoc;
	}

	public String getCompanyBpNo() {
		return companyBpNo;
	}

	public void setCompanyBpNo(String companyBpNo) {
		this.companyBpNo = companyBpNo;
	}

	public String getBuildingStatus() {
		return buildingStatus;
	}

	public void setBuildingStatus(String buildingStatus) {
		this.buildingStatus = buildingStatus;
	}

	public AllotmentDTO getAllotmentDTO() {
		return allotmentDTO;
	}

	public void setAllotmentDTO(AllotmentDTO allotmentDTO) {
		this.allotmentDTO = allotmentDTO;
	}

	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

}
