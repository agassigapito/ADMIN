package com.telekommalaysia.portal.admin.dto.dms.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
	
	@JsonProperty("Binary")
	private String binary;

	public String getBinary() {
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

}
