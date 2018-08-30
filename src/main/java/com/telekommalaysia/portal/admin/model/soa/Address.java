package com.telekommalaysia.portal.admin.model.soa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	@JsonProperty("AddLine1")
	private String addLine1 = "";

	@JsonProperty("AddLine2")
	private String addLine2 = "";

	@JsonProperty("AddLine3")
	private String addLine3 = "";

	@JsonProperty("Postcode")
	private String postCode = "";

	@JsonProperty("City")
	private String city = "";

	@JsonProperty("Region")
	private String region = "";

	@JsonProperty("Country")
	private String country = "";

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getAddLine3() {
		return addLine3;
	}

	public void setAddLine3(String addLine3) {
		this.addLine3 = addLine3;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
