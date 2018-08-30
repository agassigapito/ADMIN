package com.telekommalaysia.portal.admin.dto.faultycard;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FaultyCardTableDTO {
	
	private Integer id;
	
	private String requestStatus;

	private String refNo;
	
	private String smartCardNo;

	private String companyName;
	
	private String name;

	private String identificationPassportNo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy hh:mm a",timezone="GMT+8")
	private Date dateRaised;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getSmartCardNo() {
		return smartCardNo;
	}

	public void setSmartCardNo(String smartCardNo) {
		this.smartCardNo = smartCardNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationPassportNo() {
		return identificationPassportNo;
	}

	public void setIdentificationPassportNo(String identificationPassportNo) {
		this.identificationPassportNo = identificationPassportNo;
	}

	public Date getDateRaised() {
		return dateRaised;
	}

	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}



	
}
