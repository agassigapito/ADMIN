package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.service.util.DateConverter;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RentalObjectItemDTO {

	@JsonProperty("CompanyCode")
	private String compCode;

	@JsonProperty("BusinessEntityNo")
	private String bEntityNum;

	@JsonProperty("BuildingNo")
	private String bldgCode;

	@JsonProperty("RentalObjectNo")
	private String roNum;

	@JsonProperty("FunctionalLocation")
	private String funcLocation;

	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTo;

	/**
	 * Getters and setters
	 */

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getbEntityNum() {
		return bEntityNum;
	}

	public void setbEntityNum(String bEntityNum) {
		this.bEntityNum = bEntityNum;
	}

	public String getBldgCode() {
		return bldgCode;
	}

	public void setBldgCode(String bldgCode) {
		this.bldgCode = bldgCode;
	}

	public String getRoNum() {
		return roNum;
	}

	public void setRoNum(String roNum) {
		this.roNum = roNum;
	}

	public String getFuncLocation() {
		return funcLocation;
	}

	public void setFuncLocation(String funcLocation) {
		this.funcLocation = funcLocation;
	}

	public String getValidFrom() {

		DateConverter d = new DateConverter();
		return d.formatStringDate(validFrom);
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		DateConverter d = new DateConverter();
		return d.formatStringDate(validTo);
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

}
