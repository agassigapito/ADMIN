package com.telekommalaysia.portal.admin.dto;

import java.util.List;

public class WheelClampingLogCreationDTO {

	private List<String> listClampTagNo;

	private List<String> listClampedBy;

	private List<String> listWitness;

	private List<String> listBuildings;

	private List<String> listBrands;

	private List<String> listStatus;

	private List<String> listClampedReleasedBy;

	public List<String> getListClampTagNo() {
		return listClampTagNo;
	}

	public void setListClampTagNo(List<String> listClampTagNo) {
		this.listClampTagNo = listClampTagNo;
	}

	public List<String> getListClampedBy() {
		return listClampedBy;
	}

	public void setListClampedBy(List<String> listClampedBy) {
		this.listClampedBy = listClampedBy;
	}

	public List<String> getListWitness() {
		return listWitness;
	}

	public void setListWitness(List<String> listWitness) {
		this.listWitness = listWitness;
	}

	public List<String> getListBuildings() {
		return listBuildings;
	}

	public void setListBuildings(List<String> listBuildings) {
		this.listBuildings = listBuildings;
	}

	public List<String> getListBrands() {
		return listBrands;
	}

	public void setListBrands(List<String> listBrands) {
		this.listBrands = listBrands;
	}

	public List<String> getListStatus() {
		return listStatus;
	}

	public void setListStatus(List<String> listStatus) {
		this.listStatus = listStatus;
	}

	public List<String> getListClampedReleasedBy() {
		return listClampedReleasedBy;
	}

	public void setListClampedReleasedBy(List<String> listClampedReleasedBy) {
		this.listClampedReleasedBy = listClampedReleasedBy;
	}

}
