package com.telekommalaysia.portal.admin.dto.soa;
import java.util.Set;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.service.util.DateConverter;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaDTO {

	@Email
	@JsonProperty("Email")
	private String email;

	@JsonProperty("BusinessAssociationNo")
	private String dubaNum;

	@JsonProperty("ValidTo")
	private String dubaExpDate;

	@JsonProperty("Contract")
	private Set<ContractDTO> contractDTO;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDubaNum() {
		return dubaNum;
	}

	public void setDubaNum(String dubaNum) {
		this.dubaNum = dubaNum;
	}

	public String getDubaExpDate() {
		DateConverter d = new DateConverter();
		return d.formatStringDate(dubaExpDate);
	}

	public void setDubaExpDate(String dubaExpDate) {
		this.dubaExpDate = dubaExpDate;
	}

	public Set<ContractDTO> getContractDTO() {
		return contractDTO;
	}

	public void setContractDTO(Set<ContractDTO> contractDTO) {
		this.contractDTO = contractDTO;
	}

}
