package com.telekommalaysia.portal.admin.dto.soa.rentalobject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConditionType {
	
	@JsonProperty("ConditionType")
	private String conditionType;

	@JsonProperty("Currency")
	private String currency;

	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTo;

	@JsonProperty("UnitPrice")
	private Double unitPrice;

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String condType) {
		this.conditionType = condType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}	
