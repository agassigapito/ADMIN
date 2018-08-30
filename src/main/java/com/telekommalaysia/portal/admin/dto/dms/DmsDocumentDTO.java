package com.telekommalaysia.portal.admin.dto.dms;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telekommalaysia.portal.admin.dto.HeaderDTO;

public class DmsDocumentDTO {

	@JsonProperty("Header")
	private HeaderDTO header;

	@JsonProperty("Documents")
	private List<DocumentDTO> documentDTOs;

	public HeaderDTO getHeader() {
		return header;
	}

	public void setHeader(HeaderDTO header) {
		this.header = header;
	}

	public List<DocumentDTO> getDocuments() {
		return documentDTOs;
	}

	public void setDocuments(List<DocumentDTO> documentDTOs) {
		this.documentDTOs = documentDTOs;
	}

}
