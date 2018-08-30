package com.telekommalaysia.portal.admin.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TotalFeeDTO {

	private BigDecimal totalFee;

	public BigDecimal getTotalFee() {
		return totalFee.setScale(2, RoundingMode.HALF_UP);
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}
}
