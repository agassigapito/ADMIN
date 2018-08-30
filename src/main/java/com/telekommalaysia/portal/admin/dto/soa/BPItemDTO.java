package com.telekommalaysia.portal.admin.dto.soa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BPItemDTO {

	private String bpNo;
	
	@JsonProperty("bpNo")
	public String getBpNo() {
		return bpNo;
	}
	
	@JsonProperty("BpNo")
	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}
	
	
}
