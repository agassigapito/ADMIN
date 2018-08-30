package com.telekommalaysia.portal.admin.dto.soa.rentalobject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RentalObjectContract {

	@JsonProperty("CompanyCode")
	private String companyCode;

	@JsonProperty("ContractNo")
	private String contractNo;

	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTo;

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
