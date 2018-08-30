package com.telekommalaysia.portal.admin.dto.soa.rentalobject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasurementType {

	@JsonProperty("MeasurementType")
	private String measurementType;

	@JsonProperty("MeasurementDescription")
	private String measurementDescription;

	@JsonProperty("ValidFrom")
	private String validFrom;

	@JsonProperty("ValidTo")
	private String validTo;

	@JsonProperty("ValueAvailable")
	private Double valueAvailable;

	@JsonProperty("MeasurementUnit")
	private String measurementUnit;

	public String getMeasurementType() {
		return measurementType;
	}

	public void setMeasurementType(String measurementType) {
		this.measurementType = measurementType;
	}

	public String getMeasurementDescription() {
		return measurementDescription;
	}

	public void setMeasurementDescription(String measurementDescription) {
		this.measurementDescription = measurementDescription;
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

	public Double getValueAvailable() {
		return valueAvailable;
	}

	public void setValueAvailable(Double valueAvailable) {
		this.valueAvailable = valueAvailable;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

}
