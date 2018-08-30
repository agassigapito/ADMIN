package com.telekommalaysia.portal.admin.dto.soa;

public class AllotmentDTO {

	private String bldgName;

	private Integer usedRB;

	private Integer usedNRB;

	private Integer usedARB;

	private Integer usedANRB;

	private Integer totalRB;

	private Integer totalNRB;

	private Integer totalARB;

	private Integer totalANRB;

	private String displayRB;

	private String displayNRB;

	private String displayARB;

	private String displayANRB;

	public String getBldgName() {
		return bldgName;
	}

	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}

	public Integer getUsedRB() {
		return usedRB;
	}

	public void setUsedRB(Integer usedRB) {
		this.usedRB = usedRB;
	}

	public Integer getUsedNRB() {
		return usedNRB;
	}

	public void setUsedNRB(Integer usedNRB) {
		this.usedNRB = usedNRB;
	}

	public Integer getUsedARB() {
		return usedARB;
	}

	public void setUsedARB(Integer usedARB) {
		this.usedARB = usedARB;
	}

	public Integer getUsedANRB() {
		return usedANRB;
	}

	public void setUsedANRB(Integer usedANRB) {
		this.usedANRB = usedANRB;
	}

	public Integer getTotalRB() {
		return totalRB;
	}

	public void setTotalRB(Integer totalRB) {
		this.totalRB = totalRB;
	}

	public Integer getTotalNRB() {
		return totalNRB;
	}

	public void setTotalNRB(Integer totalNRB) {
		this.totalNRB = totalNRB;
	}

	public Integer getTotalARB() {
		return totalARB;
	}

	public void setTotalARB(Integer totalARB) {
		this.totalARB = totalARB;
	}

	public Integer getTotalANRB() {
		return totalANRB;
	}

	public void setTotalANRB(Integer totalANRB) {
		this.totalANRB = totalANRB;
	}

	public String getDisplayRB() {
		return displayRB;
	}

	public void setDisplayRB() {
		this.displayRB = getUsedRB().toString() + "/" + getTotalRB().toString();
	}

	public String getDisplayNRB() {
		return displayNRB;
	}

	public void setDisplayNRB() {
		this.displayNRB = getUsedNRB().toString() + "/" + getTotalNRB().toString();
	}

	public String getDisplayARB() {
		return displayARB;
	}

	public void setDisplayARB() {
		this.displayARB = getUsedARB().toString() + "/" + getTotalARB().toString();
	}

	public String getDisplayANRB() {
		return displayANRB;
	}

	public void setDisplayANRB() {
		this.displayANRB  = getUsedANRB().toString() + "/" + getTotalANRB().toString();
	}

}
