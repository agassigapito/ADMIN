package com.telekommalaysia.portal.admin.dto.faultycard;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class IFaultyCardTableDTO {


	private String status;

	private String refNo;

	private String smartCardNo;

	private String companyName;

	private String firstName;

	private String lastName;
	
	private String idNo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy",timezone="GMT+8")
	private Date dateRaised;


	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSmartCardNo() {
		return smartCardNo;
	}

	public void setSmartCardNo(String smartCardNo) {
		this.smartCardNo = smartCardNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public Date getDateRaised() {
		return dateRaised;
	}

	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}

	
	
}
