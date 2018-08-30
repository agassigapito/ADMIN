package com.telekommalaysia.portal.admin.dto.dms.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DownloadFileDTO {
	@JsonProperty("Document")
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}
