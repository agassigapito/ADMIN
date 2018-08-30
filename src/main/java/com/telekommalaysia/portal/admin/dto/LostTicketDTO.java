package com.telekommalaysia.portal.admin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LostTicketDTO {

	private String referenceNo;
	
	private String status;
	
	private String building;
	
	private String remarks;
	
	private String name;
	
	private String idType;
	
	private String idNo;
	
	private String passportNo;
	
	private String passportIssuanceCountry;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String postalCode;
	
	private String state;
	
	private String country;
	
	private String mobileNo;
	
	private String phoneNo;
	
	private String city;
	
	private String carPlateNo;
	
	private String carBrand;
	
	private String carModel;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String raisedOn;
	
	private String raisedBy;
	
	private String receiptNo;
	
	private String receiptAmount;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String receiptTimeStamp;
	
	private String parkingType;
	
	private String parkingRate;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String dateTimeIn;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String refundedOn;
	
	private String refundedBy;
	
	private String levyFee;
	
	private String parkingFee;
	
	@JsonProperty("totalFee")
	private String total;

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getPassportIssuanceCountry() {
		return passportIssuanceCountry;
	}

	public void setPassportIssuanceCountry(String passportIssuanceCountry) {
		this.passportIssuanceCountry = passportIssuanceCountry;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCarPlateNo() {
		return carPlateNo;
	}

	public void setCarPlateNo(String carPlateNo) {
		this.carPlateNo = carPlateNo;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getRaisedOn() {
		return raisedOn;
	}

	public void setRaisedOn(String raisedOn) {
		this.raisedOn = raisedOn;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getReceiptTimeStamp() {
		return receiptTimeStamp;
	}

	public void setReceiptTimeStamp(String receiptTimeStamp) {
		this.receiptTimeStamp = receiptTimeStamp;
	}

	public String getParkingType() {
		return parkingType;
	}

	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	public String getParkingRate() {
		return parkingRate;
	}

	public void setParkingRate(String parkingRate) {
		this.parkingRate = parkingRate;
	}

	public String getDateTimeIn() {
		return dateTimeIn;
	}

	public void setDateTimeIn(String dateTimeIn) {
		this.dateTimeIn = dateTimeIn;
	}

	public String getRefundedOn() {
		return refundedOn;
	}

	public void setRefundedOn(String refundedOn) {
		this.refundedOn = refundedOn;
	}

	public String getRefundedBy() {
		return refundedBy;
	}

	public void setRefundedBy(String refundedBy) {
		this.refundedBy = refundedBy;
	}

	public String getLevyFee() {
		return levyFee;
	}

	public void setLevyFee(String levyFee) {
		this.levyFee = levyFee;
	}

	public String getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(String parkingFee) {
		this.parkingFee = parkingFee;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
}
