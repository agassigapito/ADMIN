package com.telekommalaysia.portal.admin.dto.soa.profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileCardHolder implements Serializable {

	private static final long serialVersionUID = 2643400691737871923L;

	@JsonProperty("CardInventoryNo")
	private Long cardInventoryNo;

	@JsonProperty("CardholderID")
	private Long cardHolderId;

	@JsonProperty("CardAccessNo")
	private String cardAccessNo;

	public String getCardAccessNo() {
		return cardAccessNo;
	}

	public void setCardAccessNo(String cardAccessNo) {
		this.cardAccessNo = cardAccessNo;
	}

	public Long getCardInventoryNo() {
		return cardInventoryNo;
	}

	public void setCardInventoryNo(Long cardInventoryNo) {
		this.cardInventoryNo = cardInventoryNo;
	}

	public Long getCardHolderId() {
		return cardHolderId;
	}

	public void setCardHolderId(Long cardHolderId) {
		this.cardHolderId = cardHolderId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
