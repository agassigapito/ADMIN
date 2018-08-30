package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileContract implements Serializable {

	private static final long serialVersionUID = -1499049705602776818L;

	@JsonProperty("ContractNo")
	private String contractNo = "";
	
	@JsonProperty("ValidFrom")
	private String validFrom = "";
	
	@JsonProperty("ValidTo")
	private String validTo = "";
	
	@JsonProperty("CompanyCode")
	private String companyCode = "";
	
	public ProfileContract() {
	}

	public ProfileContract(String contractNo, String validFrom, String validTo, String companyCode) {
		this.contractNo = contractNo;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.companyCode = companyCode;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
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

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
}
