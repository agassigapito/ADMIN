package com.telekommalaysia.portal.admin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LostTicketListDTO {

	private String status;
	
	private String referenceNo;
	
	private String name;
	
	private String idNo;
	
	private String receiptNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String raisedOn;

	public String getStatus() {
		return status;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public String getName() {
		return name;
	}

	public String getIdNo() {
		return idNo;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public String getRaisedOn() {
		return raisedOn;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public void setRaisedOn(String raisedOn) {
		this.raisedOn = raisedOn;
	}
}
