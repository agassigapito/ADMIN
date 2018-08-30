package com.telekommalaysia.portal.admin.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ParkingFeeDTO {

	private BigDecimal parkingFee;

	public BigDecimal getParkingFee() {
		return parkingFee.setScale(2, RoundingMode.HALF_UP);
	}

	public void setParkingFee(BigDecimal parkingFee) {
		this.parkingFee = parkingFee;
	}
}
