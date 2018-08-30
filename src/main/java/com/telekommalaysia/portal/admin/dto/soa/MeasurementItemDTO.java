package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.constant.MeasurementItemConstants;

public class MeasurementItemDTO {

	@JsonProperty(MeasurementItemConstants.MEASUREMENT_TYPE)
	private String measurementType;

	@JsonProperty(MeasurementItemConstants.VALUE)
	private Double total;

	public String getMeasurementType() {
		return measurementType;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void setMeasurementType(String measurementType) {
		this.measurementType = measurementType;
	}


}
