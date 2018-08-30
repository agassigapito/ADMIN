package com.telekommalaysia.portal.admin.dto.soa;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.telekommalaysia.portal.admin.dto.soa.rentalobject.RentalObjectSOA;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class BayPriceDTO {

	@JsonProperty("RentalObjects")
	private List<RentalObjectSOA> ro;

	private String rentalObjectNumber;

	public String getRentalObjectNumber() {
		return rentalObjectNumber;
	}

	public void setRentalObjectNumber(String rentalObjectNumber) {
		this.rentalObjectNumber = rentalObjectNumber;
	}

	public List<RentalObjectSOA> getRo() {
		return ro;
	}

	public void setRo(List<RentalObjectSOA> ro) {
		this.ro = ro;
	}

}
