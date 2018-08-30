package com.telekommalaysia.portal.admin.dto.soa;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.dto.soa.rentalobject.RentalObjectSOA;
import com.telekommalaysia.portal.admin.model.soa.ResponseStatus;

public class ListOfRentalObjectSOA {

	@JsonProperty("ResponseStatus")
	private ResponseStatus responseStatus;

	@JsonProperty("RentalObjects")
	private List<RentalObjectSOA> listOfRentalObjectSOA;

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public List<RentalObjectSOA> getListOfRentalObjectSOA() {
		return listOfRentalObjectSOA;
	}

	public void setListOfRentalObjectSOA(List<RentalObjectSOA> listOfRentalObjectSOA) {
		this.listOfRentalObjectSOA = listOfRentalObjectSOA;
	}

}
