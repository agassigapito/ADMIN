package com.telekommalaysia.portal.admin.model.soa.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.constant.TenanciesConstants;


public class Tenancies {

	@JsonProperty(TenanciesConstants.TENANCIES_BP_NO)
	private String bpNo;

	@JsonProperty(TenanciesConstants.TENANCIES_COMPANY_CODE)
	private String companyCode;

	@JsonProperty(TenanciesConstants.TENANCIES_CONTRACT_NO)
	private String contractNo;

	@JsonProperty(TenanciesConstants.TENANCIES_VALID_TO)
	private String validTo;

	@JsonProperty(TenanciesConstants.TENANCIES_BUILDING_ACCESS_CODE)
	private String buildingAccessCode;

	@JsonProperty(TenanciesConstants.TENANCIES_BUILDING_NAME)
	private String buildingName;

	@JsonProperty(TenanciesConstants.TENANCIES_VALID_FROM)
	private String validFrom;

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

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
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

}
