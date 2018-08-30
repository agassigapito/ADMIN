package com.telekommalaysia.portal.admin.dto.soa;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardHolderDtoWrapper<T> {

	@JsonProperty("CardHolderDetails")
	private List<T> cardHolderList;

	public List<T> getCardHolderList() {
		return cardHolderList;
	}

	public void setCardHolderList(List<T> cardHolderList) {
		this.cardHolderList = cardHolderList;
	}
}
