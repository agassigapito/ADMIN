package com.telekommalaysia.portal.admin.dto.faultycard;

import java.util.HashSet;
import java.util.Set;

public class IFaultyCardSaveDTO {

	Set<IFaultyCardSaveSetDTO> faultyList = new HashSet<>();

	public Set<IFaultyCardSaveSetDTO> getFaultyList() {
		return faultyList;
	}

	public void setFaultyList(Set<IFaultyCardSaveSetDTO> faultyList) {
		this.faultyList = faultyList;
	}

	
	
}
