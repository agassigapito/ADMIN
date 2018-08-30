package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileEmployeeDetails implements Serializable {

	private static final long serialVersionUID = 2314205295761153468L;
	
	@JsonProperty("EmployeeDepartment")
	private String employeeDepartment;
	
	@JsonProperty("EmployeeDesignation")
	private String employeeDesignation;
	
	@JsonProperty("EmployeeID")
	private String employeeId;

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
